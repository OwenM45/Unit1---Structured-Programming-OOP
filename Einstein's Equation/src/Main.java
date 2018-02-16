/* By: Owen Maertens
 * Einstein's equation
 * 2018-02-06
 */
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main extends JFrame implements ActionListener{

	//declare the gui elements used in this program
	JPanel panel;
	JButton btnCalculate;
	JTextField input;
	JLabel output;
	
	//constructor
	public Main() 
	{
		//initiates gui elements upon creation
        initUI();
    }
	
	private void initUI() 
	{        
		//sets up the window
        setTitle("Einstein's Equation");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(null);
        
        //sets up the output label
        output = new JLabel("f");
        output.setBounds(150, 150,90,20);
        panel.add(output);
        
        //sets up the button that starts the process
        btnCalculate = new JButton("Calculate!");
        btnCalculate.setBounds(150, 200,90,20);
        btnCalculate.addActionListener(this);  
        panel.add(btnCalculate);
        
        //sets up the text feild where the user enters the mass
        input = new JTextField("Enter the mass of the object");
        input.setBounds(110, 100, 170, 20);
        panel.add(input);
        
        this.getContentPane().add(panel);
    }

	public static void main(String[] args) 
	{
		//activates the gui window
		EventQueue.invokeLater(() -> {
            Main MAIN = new Main();
            MAIN.setVisible(true);
        });
	}

	public void actionPerformed(ActionEvent e) 
	{
		//calculates the energy
		double energy = Float.valueOf(input.getText())*Math.pow(299800000,2);
		//outputs the energy
		output.setText(Double.toString(energy));
	}
	 
	
	
}
