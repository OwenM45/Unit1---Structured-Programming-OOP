import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator extends JFrame implements ActionListener{
	
	//set up gui elements
	JPanel panel;
	
	JTextField txtInOne;
	JTextField txtInTwo;
	
	JButton btnPlus;
	JButton btnMinus;
	JButton btnDivide;
	JButton btnMultiply;
	JButton btnExponent;
	
	JLabel lblOutput;
	
	//constructor
	public Calculator() 
	{
		//setup the gui
        initUI();
    }
	
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
            Calculator MAIN = new Calculator();
            MAIN.setVisible(true);
        });
	}
	
	private void initUI() 
	{ 
		//set up gui window
		setTitle("Simple calulator");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(null);
        
        
        //setup gui elements
		txtInOne = new JTextField("x");
		txtInOne.setBounds(90, 100, 60, 20);
        panel.add(txtInOne);
        
        txtInTwo = new JTextField("y");
        txtInTwo.setBounds(210, 100, 60, 20);
        panel.add(txtInTwo);
        
        btnPlus = new JButton("+");
        btnPlus.setBounds(10, 200,50,20);
        btnPlus.addActionListener(this);  
        panel.add(btnPlus);
        
        btnMinus = new JButton("-");
        btnMinus.setBounds(90, 200,50,20);
        btnMinus.addActionListener(this);  
        panel.add(btnMinus);
        
        btnDivide = new JButton("/");
        btnDivide.setBounds(170, 200,50,20);
        btnDivide.addActionListener(this);  
        panel.add(btnDivide);
        
        btnMultiply = new JButton("*");
        btnMultiply.setBounds(250, 200,50,20);
        btnMultiply.addActionListener(this);  
        panel.add(btnMultiply);
        
        btnExponent = new JButton("x^y");
        btnExponent.setBounds(325, 200,60,20);
        btnExponent.addActionListener(this);  
        panel.add(btnExponent);
        
        lblOutput = new JLabel("");
        lblOutput.setBounds(150, 150,90,20);
        panel.add(lblOutput);
        
        this.getContentPane().add(panel);
	}

	public void actionPerformed(ActionEvent e) 
	{
	
		double result = 0;
		//perform calculations
		if (e.getSource()==btnPlus) 
		{
            result = Float.valueOf(txtInOne.getText()) + Float.valueOf(txtInTwo.getText());
        }
		else if (e.getSource()==btnMinus) 
		{
            result = Float.valueOf(txtInOne.getText()) - Float.valueOf(txtInTwo.getText());
        }
		else if (e.getSource()==btnMultiply) 
		{
            result = Float.valueOf(txtInOne.getText()) * Float.valueOf(txtInTwo.getText());
        }
		else if (e.getSource()==btnDivide) 
		{
            result = Float.valueOf(txtInOne.getText()) / Float.valueOf(txtInTwo.getText());
        }
		else if (e.getSource()==btnExponent) 
		{
            result = Math.pow(Float.valueOf(txtInOne.getText()) , Float.valueOf(txtInTwo.getText()));
        }
		
		lblOutput.setText("= " + Double.toString(result));
	}

}
