import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator extends JFrame implements ActionListener{
	
	JPanel panel;
	
	JTextField txtInOne;
	JTextField txtInTwo;
	
	JButton btnPlus;
	JButton btnMinus;
	JButton btnDivide;
	JButton btnMultiply;
	JButton btnExponent;
	
	public Calculator() 
	{
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
		setTitle("Einstein's Equation");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(null);
        
		txtInOne = new JTextField("num1");
		txtInOne.setBounds(90, 100, 60, 20);
        panel.add(txtInOne);
        
        txtInTwo = new JTextField("num2");
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
        
        this.getContentPane().add(panel);
	}

	public void actionPerformed(ActionEvent e) 
	{
		
	}

}
