package ergasia5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class LoginScreen extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    private Connection connection;

    public LoginScreen() {
        try {
            // Σύνδεση με τη βάση δεδομένων
            String url = "\"C:\\Users\\giorgos sani\\Desktop\\sql.sql\"";
            String username = "your_username";
            String password = "your_password";
            connection = DriverManager.getConnection(url, username, password);

            // Δημιουργία του γραφικού περιβάλλοντος χρήστη
            setTitle("Library System - Login");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new BorderLayout());

            JPanel loginPanel = createLoginPanel();
            mainPanel.add(loginPanel, BorderLayout.CENTER);

            setContentPane(mainPanel);
            pack();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private JPanel createLoginPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username (Email):");
        usernameField = new JTextField(20);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);

        loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (validateUser(username, password)) {
                    // Πραγματοποιήστε τις ενέργειες που επιθυμείτε όταν η σύνδεση είναι επιτυχής
                } else {
                    JOptionPane.showMessageDialog(LoginScreen.this, "Invalid username or password. Please try again.", "Login Failed", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel());
        panel.add(loginButton);

        return panel;
    }

    private boolean validateUser(String username, String password) {
        try {
            String query = "SELECT COUNT(*) FROM users WHERE username = ? AND password = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            int count = resultSet.getInt(1);
            return count == 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }
}
