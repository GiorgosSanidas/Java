package erg5;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Dates extends JApplet 
{
private static final long serialVersionUID = -827175473341332608L;



String[] options = {"Please Select Departure/Return Date: "};
private JTextField departureDate = new JTextField(30);
private JTextField returnDate = new JTextField(30);
private JButton button = new JButton("Dispatch The Airplane");
private JComboBox cbox = new JComboBox();
private JButton ok = new JButton("Ok");
private JRadioButton r_add = new JRadioButton("Add");







private int count = 0;

public void init() 
{

    for (int i = 0; i < 3; i++)
    {
        cbox.addItem(options[count++]);
    }


    cbox.addActionListener(new ActionListener() {
        public void actionPerformed1(ActionEvent e) {

            ((JComboBox) e.getSource()).getSelectedItem();


        }

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
    });


    JPanel RadioButtons = new JPanel();
    RadioButtons.setLayout(new GridLayout(5,1));

    Container container_1 = getContentPane();
    Container container_2 = getContentPane();
    container_1.setLayout(new FlowLayout());
    container_2.setLayout(new FlowLayout());
    container_1.add(cbox);

    JPanel jpTextField = new JPanel();
    jpTextField.setLayout(new GridLayout(3,1));
    jpTextField.add(new JLabel("Date: "),BorderLayout.WEST);
        jpTextField.add(departureDate,BorderLayout.WEST);
        departureDate.setHorizontalAlignment(JTextField.LEFT);
        add(jpTextField,BorderLayout.NORTH);

        RadioButtons.add(r_add);

        add(RadioButtons,BorderLayout.WEST);
        container_1.add(ok,BorderLayout.WEST);
        container_1.add(button);
        
       
    }




public static void main(String[] args) 
{
    run(new Dates(), 400, 400);
}

public static void run(JApplet applet, int width, int height) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(applet);
    frame.setSize(width, height);
    applet.init();
    applet.start();
    frame.setVisible(true);
}

}