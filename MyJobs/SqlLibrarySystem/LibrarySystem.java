package ergasia5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.ArrayList;

public class LibrarySystem {
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private Connection connection;

    public LibrarySystem() {
        initialize();
    }

    private void initialize() {
        // Σύνδεση με τη βάση δεδομένων
        try {
            connection = DriverManager.getConnection"C:\Users\giorgos\Desktop\sql.sql"");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Κατασκευή του κεντρικού παραθύρου
        frame = new JFrame();
        frame.setBounds(100, 100, 400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Προσθήκη πεδίου για το username
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 50, 100, 20);
        frame.getContentPane().add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(160, 50, 150, 20);
        frame.getContentPane().add(usernameField);

        // Προσθήκη πεδίου για το password
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 100, 100, 20);
        frame.getContentPane().add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(160, 100, 150, 20);
        frame.getContentPane().add(passwordField);

        // Προσθήκη κουμπιών
        JButton loginButton = new JButton("Είσοδος");
        loginButton.setBounds(160, 150, 100, 30);
        frame.getContentPane().add(loginButton);

        JButton searchButton = new JButton("Αναζήτηση");
        searchButton.setBounds(60, 200, 100, 30);
        frame.getContentPane().add(searchButton);

        JButton myBooksButton = new JButton("Τα βιβλία μου");
        myBooksButton.setBounds(200, 200, 120, 30);
        frame.getContentPane().add(myBooksButton);

        // Προσθήκη listeners στα κουμπιά
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = String.valueOf(passwordField.getPassword());

                if (authenticateUser(username, password)) {
                    showMainScreen();
                } else {
                    JOptionPane.showMessageDialog(frame, "Λανθασμένο όνομα χρήστη ή κωδικός πρόσβασης.");
                }
            }
        });

        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showSearchScreen();
            }
        });

        myBooksButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showMyBooksScreen();
            }
        });

        // Εμφάνιση του κεντρικού παραθύρου
        frame.setVisible(true);
    }

    private boolean authenticateUser(String username, String password) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users WHERE username='" + username + "' AND password='" + password + "'");
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private void showMainScreen() {
        frame.getContentPane().removeAll();

        // Προσθήκη κώδικα για την αρχική οθόνη

        frame.revalidate();
        frame.repaint();
    }

    private void showSearchScreen() {
        frame.getContentPane().removeAll();

        // Προσθήκη κώδικα για την οθόνη αναζήτησης

        frame.revalidate();
        frame.repaint();
    }

    private void showMyBooksScreen() {
        frame.getContentPane().removeAll();

        // Προσθήκη κώδικα για την οθόνη των βιβλίων του χρήστη

        frame.revalidate();
        frame.repaint();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LibrarySystem librarySystem = new LibrarySystem();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
