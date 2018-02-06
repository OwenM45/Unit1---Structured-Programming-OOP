
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main extends JFrame implements ActionListener{

	JPanel panel;
	JButton btnCalculate;
	JTextField input;
	JLabel output;
	
	public Main() {

        initUI();
    }
	
	private void initUI() 
	{        
        setTitle("Einstein's Equation");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(null);
        
        JLabel output = new JLabel("f");
        output.setBounds(150, 150,90,20);
        panel.add(output);
        
        btnCalculate = new JButton("Calculate!");
        btnCalculate.setBounds(150, 200,90,20);
        btnCalculate.addActionListener(this);  
        panel.add(btnCalculate);
        
        input = new JTextField("Enter the mass of the object");
        input.setBounds(110, 100, 170, 20);
        panel.add(input);
        
        this.getContentPane().add(panel);
    }

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(() -> {
            Main MAIN = new Main();
            MAIN.setVisible(true);
        });
	}

	public void actionPerformed(ActionEvent e) {
		output.setText("78");
	}
	
	
	
}
