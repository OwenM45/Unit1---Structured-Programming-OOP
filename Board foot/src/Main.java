import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main extends JFrame implements ActionListener{

		JPanel panel;
		
		JTextField txtLength;
		JTextField txtWidth;
		
		JButton btnCalculate;
		
		JLabel lblResult;
			
		public Main() 
		{
	        initUI();
	    }
		
		private void initUI() 
		{        
			//initialize the window
	        setTitle("Board Foot");
	        setSize(300, 150);
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        
	        panel = new JPanel();
	        panel.setLayout(null);
	        
	        //initialize the GUI buttons for player options
	        txtLength = new JTextField("Enter the board height");
	        txtLength.setBounds(10, 20,150,20);
	        panel.add(txtLength);
	        
	        txtWidth = new JTextField("Enter the board width");
	        txtWidth.setBounds(10, 50,150,20);
	        txtWidth.addActionListener(this);  
	        panel.add(txtWidth);
	        
	        btnCalculate = new JButton("Calculate");
	        btnCalculate.setBounds(10, 80,90,20);
	        btnCalculate.addActionListener(this);  
	        panel.add(btnCalculate);
	        
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
			double result = Double.valueOf(txtLength.getText())*Double.valueOf(txtWidth.getText());
			lblResult.setText(Double.toString(result)+" cubed");
		}

}

