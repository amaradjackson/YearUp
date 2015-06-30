import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Label;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;


public class SimpleJava {

	private JFrame frame;
	private JTextField nameTextField;
	private JLabel lblIAm;
	private JTextField ageTextField;
	private JLabel studentLabel;
	private JButton whoButton;
	//sets so i dont have to retyoe this each time i want to change these
	//private static void s_whoAreYou = "Who Are You!";
	//private static void s_clearMe = "Clear Me";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() 
			{
				try 
				{
					SimpleJava window = new SimpleJava();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SimpleJava() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel nameLabel = new JLabel("My Name Is");
		nameLabel.setForeground(Color.BLUE);
		nameLabel.setFont(new Font("Gabriola", Font.PLAIN, 16));
		nameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		nameLabel.setBounds(104, 45, 82, 24);
		frame.getContentPane().add(nameLabel);
		
		nameTextField = new JTextField();
		nameTextField.setForeground(new Color(0, 255, 255));
		nameTextField.setBackground(Color.BLUE);
		nameTextField.setHorizontalAlignment(SwingConstants.CENTER);
		nameTextField.setBounds(200, 45, 103, 24);
		frame.getContentPane().add(nameTextField);
		nameTextField.setColumns(10);
		
		lblIAm = new JLabel("I  am:");
		lblIAm.setForeground(Color.BLUE);
		lblIAm.setFont(new Font("Gabriola", Font.PLAIN, 16));
		lblIAm.setHorizontalAlignment(SwingConstants.LEFT);
		lblIAm.setBounds(104, 80, 36, 24);
		frame.getContentPane().add(lblIAm);
		
		ageTextField = new JTextField();
		ageTextField.setForeground(Color.CYAN);
		ageTextField.setBackground(Color.BLUE);
		ageTextField.setHorizontalAlignment(SwingConstants.CENTER);
		ageTextField.setColumns(10);
		ageTextField.setBounds(200, 80, 28, 24);
		frame.getContentPane().add(ageTextField);
		
		studentLabel = new JLabel("I am a student of Year Up!");
		studentLabel.setForeground(Color.BLUE);
		studentLabel.setFont(new Font("Gabriola", Font.PLAIN, 16));
		studentLabel.setHorizontalAlignment(SwingConstants.CENTER);
		studentLabel.setBounds(104, 122, 199, 24);
		frame.getContentPane().add(studentLabel);
		
		whoButton = new JButton("Who Are You?");
		whoButton.setFont(new Font("Gabriola", Font.PLAIN, 16));
		whoButton.setForeground(Color.BLUE);
		//whoButton = new JButton(s_whoAreYou);
		whoButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if (whoButton.getText().equals("Who Are You?"))
				//if (whoButton.getText().equals(s_whoAreYou))
				{
					nameTextField.setText("Amara Jackson");
					ageTextField.setText("19");
					whoButton.setText("Clear Me!");
				}
				else if (whoButton.getText().equals("Clear Me!"))
				//else if (whoButton.getText().equals(s_clearMe))
				{
					nameTextField.setText("");
					ageTextField.setText("");
					whoButton.setText("Who Are You?");
				}
			}
		});
		whoButton.setBounds(147, 157, 156, 51);
		frame.getContentPane().add(whoButton);
	}
}
