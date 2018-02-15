import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class Main extends JFrame implements ActionListener{

		JPanel panel;
		
		JRadioButton radRock;
		JRadioButton radPaper;
		JRadioButton radScissors;
		
		JLabel lblResult;
			
		public Main() 
		{
	        initUI();
	    }
		
		private void initUI() 
		{        
			//initialize the window
	        setTitle("Rock paper scissors");
	        setSize(350, 150);
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        
	        panel = new JPanel();
	        panel.setLayout(null);
	        
	        //initialize the radio buttons for player options
	        radRock = new JRadioButton("Rock");
	        radRock.setBounds(10, 20,90,20);
	        radRock.addActionListener(this);  
	        panel.add(radRock);
	        
	        radPaper = new JRadioButton("Paper");
	        radPaper.setBounds(10, 50,90,20);
	        radPaper.addActionListener(this);  
	        panel.add(radPaper);
	        
	        radScissors = new JRadioButton("Scissors");
	        radScissors.setBounds(10, 80,90,20);
	        radScissors.addActionListener(this);  
	        panel.add(radScissors);
	        
	        lblResult = new JLabel("");
	        lblResult.setBounds(130, 50,200,20);
	        panel.add(lblResult);
	        
	        
	        this.getContentPane().add(panel);
	    }

		public static void main(String[] args) 
		{
			EventQueue.invokeLater(() -> {
	            Main MAIN = new Main();
	            MAIN.setVisible(true);
	        });
		}

		public void actionPerformed(ActionEvent e) 
		{
			int playerChoice = 0;
			// 0 = rock, 1 = paper, 2 = scissors
			
			// restrict more than one radio button from being active at the same time
			// sets the value of the player choice
			
			if (e.getSource() == radRock)
			{
				radPaper.setSelected(false);
				radScissors.setSelected(false);
				playerChoice = 0;
			}
			else if (e.getSource() == radPaper)
			{
				radRock.setSelected(false);
				radScissors.setSelected(false);
				playerChoice = 1;
			}
			else if (e.getSource() == radScissors)
			{
				radPaper.setSelected(false);
				radRock.setSelected(false);
				playerChoice = 2;
			}
			
			Random rand = new Random(); 
			int value = rand.nextInt(3); 
			System.out.println(value);
			
			if (playerChoice == 0)
			{
				if (value == 0)
				{
					lblResult.setText("Tie! Com chose rock");
				}
				if (value == 1)
				{
					lblResult.setText("Lose! Com chose paper");
				}
				if (value == 2)
				{
					lblResult.setText("Win! Com chose scissors");
				}
			}
			
			if (playerChoice == 1)
			{
				if (value == 0)
				{
					lblResult.setText("Win! Com chose rock");
				}
				if (value == 1)
				{
					lblResult.setText("Tie! Com chose paper");
				}
				if (value == 2)
				{
					lblResult.setText("Lose! Com chose scissors");
				}
			}
			
			if (playerChoice == 2)
			{
				if (value == 0)
				{
					lblResult.setText("Lose! Com chose rock");
				}
				if (value == 1)
				{
					lblResult.setText("Win! Com chose paper");
				}
				if (value == 2)
				{
					lblResult.setText("Tie! Com chose scissors");
				}
			}
		}

}
