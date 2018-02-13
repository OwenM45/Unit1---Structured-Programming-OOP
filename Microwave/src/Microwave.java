/* microwave 
 * by owen maertens
 * february 12th
 */

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Microwave extends JFrame implements ActionListener{

	JPanel panel;
	
	JButton btnPizza;
	JButton btnSub;
	JButton btnSoup;
	
	JButton btnOne;
	JButton btnTwo;
	JButton btnThree;
	
	JLabel lblFood;
	JLabel lblTime;
	JLabel lblResult;
	
	float foodVal = 0;
	float timeVal = 0;
	
	public Microwave() 
	{
        initUI();
    }
	
	private void initUI() 
	{        
        setTitle("Microwave");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(null);
        
        lblFood = new JLabel("Select food");
        lblFood.setBounds(150, 10,90,20);
        panel.add(lblFood);
        
        btnPizza = new JButton("Pizza");
        btnPizza.setBounds(50, 30,80,20);
        btnPizza.addActionListener(this);  
        panel.add(btnPizza);
        
        btnSub = new JButton("Sub");
        btnSub.setBounds(150, 30,80,20);
        btnSub.addActionListener(this);  
        panel.add(btnSub);
        
        btnSoup = new JButton("Soup");
        btnSoup.setBounds(250, 30,80,20);
        btnSoup.addActionListener(this);  
        panel.add(btnSoup);
        
        lblTime = new JLabel("Items");
        lblTime.setBounds(170, 60,90,20);
        panel.add(lblTime);
        
        btnOne = new JButton("1 item");
        btnOne.setBounds(50, 90,80,20);
        btnOne.addActionListener(this);  
        panel.add(btnOne);
        
        btnTwo = new JButton("2 item");
        btnTwo.setBounds(150, 90,80,20);
        btnTwo.addActionListener(this);  
        panel.add(btnTwo);
        
        btnThree = new JButton("3 item");
        btnThree.setBounds(250, 90,80,20);
        btnThree.addActionListener(this);  
        panel.add(btnThree);
        
        lblResult = new JLabel("");
        lblResult.setBounds(150, 130,90,20);
        panel.add(lblResult);
        
        this.getContentPane().add(panel);
    }

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(() -> {
            Microwave MAIN = new Microwave();
            MAIN.setVisible(true);
        });
	}

	public void actionPerformed(ActionEvent e) 
	{
		
		
		if (e.getSource()==btnPizza) 
		{
			foodVal = 45;
			System.out.println(foodVal);
		}
		else if (e.getSource()==btnSub)
		{
			foodVal = 60;
			System.out.println(foodVal);
		}
		else if (e.getSource()==btnSoup)
		{
			foodVal = 90;	
			System.out.println(foodVal);
		}
		
		if (e.getSource()==btnOne) 
		{
			timeVal = 1; 
			lblResult.setText( Double.toString(timeVal*foodVal) + "sec");
			System.out.println(timeVal);
		}
		else if (e.getSource()==btnTwo)
		{
			timeVal = 1.5f;
			lblResult.setText( Double.toString(timeVal*foodVal) + "sec");
			System.out.println(timeVal);
		}
		else if (e.getSource()==btnThree)
		{
			timeVal = 2;
			lblResult.setText( Double.toString(timeVal*foodVal) + "sec");
			System.out.println(timeVal);
		}
		
		
		
	}
	 

}
