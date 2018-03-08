package studentADT;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Main extends JFrame implements ActionListener
{

	//Declare all the GUI elements
	JPanel panel;
	
	JLabel lblInstructions;
	JLabel lblAnswer;
	
	JTextField txtFirstName;
	JTextField txtLastName;
	JTextField txtMiddleInitial;
	JTextField txtGrade;
	
	JRadioButton radAsthma;
	JRadioButton radAllergy;
	
	JButton btnAdd;
	
	//boolean that tells the program if its reading from a text file
	boolean reading = false;
	
	//Constructor
	public Main() 
	{
		// initiate the GUI
        initUI();
    }
	
	private void initUI() 
	{ 
		//Set up the GUI window
		setTitle("Student ADT");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //Set up the area where the GUI is displayed
        panel = new JPanel();
        panel.setLayout(null);
        
        
        //sets up the label that instructs the user what to do
        lblInstructions = new JLabel("Enter student info:");
        lblInstructions.setBounds(50, 10, 280, 20);  
        panel.add(lblInstructions);
        
        //sets up the area where the user enters the first name
        txtFirstName = new JTextField("first name");
        txtFirstName.setBounds(50, 30, 190, 20);  
        panel.add(txtFirstName);
        
        //sets up the area where the user enters the last name
        txtLastName = new JTextField("last name");
        txtLastName.setBounds(50, 50, 190, 20);  
        panel.add(txtLastName);
        
        //sets up the area where the user enters the last name
        txtMiddleInitial = new JTextField("middle initial");
        txtMiddleInitial.setBounds(50, 70, 190, 20);  
        panel.add(txtMiddleInitial);
        
        //sets up the area where the user enters the last name
        txtGrade = new JTextField("grade");
        txtGrade.setBounds(50, 90, 190, 20);  
        panel.add(txtGrade);
        
        //sets up the button to parse from the text box
        btnAdd = new JButton("Add student");
        btnAdd.setBounds(50, 150, 120,20);
        btnAdd.addActionListener(this);
        panel.add(btnAdd);        
        
        radAsthma = new JRadioButton("Asthma");
        radAsthma.setBounds(50, 110, 80, 20);
        radAsthma.addActionListener(this);  
        panel.add(radAsthma);
        
        radAllergy = new JRadioButton("Allergies");
        radAllergy.setBounds(50, 130, 80, 20);
        radAllergy.addActionListener(this);  
        panel.add(radAllergy);
       
        
        //makes the gui visible when its rendered
        this.getContentPane().add(panel);
	
	}
	
	public static void main(String[] args) 
	{
		//displays the gui window
		EventQueue.invokeLater(() -> {
            Main MAIN = new Main();
            MAIN.setVisible(true);
        });
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == btnAdd)
		{
			Student newStu = new Student(txtFirstName.getText(), txtMiddleInitial.getText(), 
					txtLastName.getText(),txtGrade.getText(),
					radAsthma.isSelected(),radAllergy.isSelected());
			JOptionPane.showMessageDialog(panel,
					newStu.fName+ " " +newStu.mName+ ". " +newStu.lName + ", Grade: " + newStu.grade + ", Asthmatic: " + newStu.asthma + ", Allergies: " + newStu.allergy);
		}
	}

}
