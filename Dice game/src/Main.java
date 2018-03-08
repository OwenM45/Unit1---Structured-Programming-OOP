import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class Main extends JFrame implements ActionListener{
		JPanel panel;
		
		//define the GUI elements
		JTextField txtGuess;
		JTextField txtWidth;
		
		JButton btnCheck;
		
		JLabel lblResult;
			
		public Main() 
		{
	        initUI();
	    }
		
		private void initUI() 
		{        
			//initialize the window
	        setTitle("Dice Game");
	        setSize(300, 150);
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        
	        panel = new JPanel();
	        panel.setLayout(null);
	        
	        //initialize the GUI buttons for player options
	        txtGuess = new JTextField("Guess a num between 1-6");
	        txtGuess.setBounds(10, 20,150,20);
	        panel.add(txtGuess);
	        
	        btnCheck = new JButton("check");
	        btnCheck.setBounds(10, 80,90,20);
	        btnCheck.addActionListener(this);  
	        panel.add(btnCheck);
	        
	        lblResult = new JLabel("");
	        lblResult.setBounds(180, 50,200,20);
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
			// calculates then outputs the result
			Random rand = new Random(); 
			int value = rand.nextInt(6);
			if (Integer.parseInt(txtGuess.getText()) == value)
			{
				lblResult.setText("Correct");
			}
			else
			{
				lblResult.setText("Wrong");
			}
		}

}
