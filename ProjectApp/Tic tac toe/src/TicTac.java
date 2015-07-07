import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class TicTac {

	private JFrame frame;
	private String m_previousMove = null;
	private JButton[][] m_allButtons = new JButton[3][3];
	private static String s_x = "X";
	private static String s_o = "O";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTac window = new TicTac();
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
	public TicTac() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 461, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JButton button_1 = new JButton("");
		button_1.setBackground(Color.CYAN);
		button_1.setBounds(10, 11, 131, 101);
		frame.getContentPane().add(button_1);
		m_allButtons[0][0] = button_1;
				
		JButton button_2 = new JButton("");
		button_2.setBackground(Color.CYAN);
		button_2.setBounds(151, 11, 143, 101);
		frame.getContentPane().add(button_2);
		m_allButtons[0][1] = button_2;
		
		JButton button_3 = new JButton("");
		button_3.setBackground(Color.CYAN);
		button_3.setBounds(304, 11, 131, 101);
		frame.getContentPane().add(button_3);
		m_allButtons[0][2] = button_3;
		
		JButton button_4 = new JButton("");
		button_4.setBackground(Color.CYAN);
		button_4.setBounds(10, 123, 131, 101);
		frame.getContentPane().add(button_4);
		m_allButtons[1][0] = button_4;
		
		JButton button_5 = new JButton("");
		button_5.setBackground(Color.CYAN);
		button_5.setBounds(151, 123, 143, 101);
		frame.getContentPane().add(button_5);
		m_allButtons[1][1] = button_5;
		
		JButton button_6 = new JButton("");
		button_6.setBackground(Color.CYAN);
		button_6.setBounds(304, 123, 131, 101);
		frame.getContentPane().add(button_6);
		m_allButtons[1][2] = button_6;
		
		JButton button_7 = new JButton("");
		button_7.setBackground(Color.CYAN);
		button_7.setBounds(10, 240, 131, 101);
		frame.getContentPane().add(button_7);
		m_allButtons[2][0] = button_7;
		
		JButton button_8 = new JButton("");
		button_8.setBackground(Color.CYAN);
		button_8.setBounds(151, 240, 143, 101);
		frame.getContentPane().add(button_8);
		m_allButtons[2][1] = button_8;
		
		JButton button_9 = new JButton("");
		button_9.setBackground(Color.CYAN);
		button_9.setBounds(304, 240, 131, 101);
		frame.getContentPane().add(button_9);
		m_allButtons[2][2] = button_9;
		AddAllEventHandlers();
	}
	
	private void changeButtonText(JButton button)
	{
		//sets the method for the button text
		if (m_previousMove != null)
		{
			if (m_previousMove.equals(s_o))
			{
				button.setText(s_x);
				//prevents use of that button twice
				button.setEnabled(false);
				m_previousMove = s_x;
			}
			else if (m_previousMove.equals(s_x))
			{
				button.setText(s_o);
				button.setEnabled(false);
				m_previousMove = s_o;
			}
		}
		else
		{
			button.setText(s_x);
			button.setEnabled(false);
			m_previousMove = s_x;
		}
		
	}
	
	private void DisableAllButtons()
	{
		if (m_allButtons != null)
		{
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					//disables this
					m_allButtons[i][j].setEnabled(false);
				}
			}
		}
	}
	
	private void AddAllEventHandlers()
	//performs this action for all buttons instead of having to retype
	{
		if (m_allButtons != null)
		{
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					JButton currentButton = m_allButtons[i][j];
					m_allButtons[i][j].addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent arg0)
						{
							changeButtonText(currentButton);
							currentButton.setEnabled(false);
							CheckGameWinner();
						}
					});
				}
			}
		}
	}
	
	private void CheckGameWinner()
	{
		if (m_allButtons != null)
		{
			for (int i = 0; i < 3; i++)
			{
				//checks for tic tac toe matches of the buttons going horizontal and displays the text of the button; x or O
				int i2 = i;
				String one = m_allButtons[i][0].getText();
				String two = m_allButtons[i][1].getText();
				String three = m_allButtons[i][2].getText();
				
				//boolean checking it button is empty
				boolean empty = one.isEmpty() || two.isEmpty() || three.isEmpty();
				
				if (! empty)
				{
					//if the buttons are not empty, would they be the same?
					boolean same = (one == two) && (two==three);
					
					if (same)
						//if they are the same...
					{
						//...change the background color to white...
						m_allButtons[i][0].setBackground(Color.WHITE);
						m_allButtons[i][1].setBackground(Color.WHITE);
						m_allButtons[i][2].setBackground(Color.WHITE);
						//...then disable all the buttons
						DisableAllButtons();
						
					}
				}
				
			}
			
			for (int i = 0; i < 3; i++)
			{
				//checks for matches for the vertical buttons
				String one = m_allButtons[0][i].getText();
				String two = m_allButtons[1][i].getText();
				String three = m_allButtons[2][i].getText();
				
				//boolean checking if button is empty
				boolean empty = one.isEmpty() || two.isEmpty() || three.isEmpty();
				
				if (! empty)
				{
					//if not empty, they would be the same?
					boolean same = (one == two) && (two == three);
					
					if (same)
					{
						//if they are the same, set back ground to white
						m_allButtons[0][i].setBackground(Color.WHITE);
						m_allButtons[1][i].setBackground(Color.WHITE);
						m_allButtons[2][i].setBackground(Color.WHITE);
						//the disable the buttons
						DisableAllButtons();
					}
				}
			}
			//for matches in the diagonal starting from the top left
			String one = m_allButtons[0][0].getText();
			String two = m_allButtons[1][1].getText();
			String three = m_allButtons[2][2].getText();
			
			//boolean for if the diagonal buttons are empty
			boolean diagonalOneEmpty = one.isEmpty() || two.isEmpty() || three.isEmpty();
			
			if (!diagonalOneEmpty)
			{
				//if empty, are they the same?
				boolean diagonalOneSame = (one == two) && (two == three);
				
				if (diagonalOneSame)
				{
					//if they are the same, change BG to white
					m_allButtons[0][0].setBackground(Color.WHITE);
					m_allButtons[1][1].setBackground(Color.WHITE);
					m_allButtons[2][2].setBackground(Color.WHITE);
					//disables buttons
					DisableAllButtons();
				}
			}
			//for matches in the diagonal starting from the top right
			String four = m_allButtons[0][2].getText();
			String five = m_allButtons[1][1].getText();
			String six = m_allButtons[2][0].getText();
			
			//boolean for if the diagonal buttons are empty
			boolean diagonalTwoEmpty = one.isEmpty() || two.isEmpty() || three.isEmpty();
			
			if (!diagonalTwoEmpty)
			{
				//if empty, are they the same?
				boolean diagonalTwoSame = (four == five) && (five == six);
				
				if (diagonalTwoSame)
				{
					//if they are the same, change BG to white
					m_allButtons[0][2].setBackground(Color.WHITE);
					m_allButtons[1][1].setBackground(Color.WHITE);
					m_allButtons[2][0].setBackground(Color.WHITE);
					//disables buttons
					DisableAllButtons();
				}
			}
		}
	}
}
