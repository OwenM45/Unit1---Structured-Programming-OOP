/* microwave 
 * by owen maertens
 * february 12th
 */

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Microwave extends JFrame implements ActionListener{

	//declares the gui elements
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
	
	//variables for user input
	float foodVal = 0;
	float timeVal = 0;
	
	//construct
	public Microwave() 
	{
		//initiates gui elements upon creation
        initUI();
    }
	
	private void initUI() 
	{       
		//sets up the gui window
        setTitle("Microwave");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(null);
       
        //sets up the first instruction label
        lblFood = new JLabel("Select food");
        lblFood.setBounds(150, 10,90,20);
        panel.add(lblFood);
        
        //sets up the buttons with food options
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
        
        //sets up the second instruction label
        lblTime = new JLabel("Items");
        lblTime.setBounds(170, 60,90,20);
        panel.add(lblTime);
        
        //sets up the buttons with time buttons
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
		//activates the gui window
		EventQueue.invokeLater(() -> {
            Microwave MAIN = new Microwave();
            MAIN.setVisible(true);
        });
	}

	public void actionPerformed(ActionEvent e) 
	{
		
		//sets the value in second of the food
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
		
		//sets the multiplier for the food time then calculates the time and outputs it to the output label
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
