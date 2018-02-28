
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Main extends JFrame implements ActionListener{
		JPanel panel;
		
		JList<Object> lstPlanets;
		    		
		JLabel lblResult;
	
		enum Planets {
			Mercury,
			Venus,
			Earth,
			Mars,
			Jupiter,
			Saturn, 
			Uranus,
			Neptune
		}
		
		final static DefaultListModel<Object> planetNames = new DefaultListModel<Object>();
	
		
		public Main() 
		{
	        initUI();
	        
	    }
		
		private void initUI() 
		{        
			//initialize the window
	        setTitle("Planet Enum");
	        setSize(400, 200);
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        
	        panel = new JPanel();
	        panel.setLayout(null);
	        
	        lblResult = new JLabel("");
	        lblResult.setBounds(220, 50,200,20);
	        panel.add(lblResult);
	        
	        lstPlanets = new JList<Object>(planetNames);
	        lstPlanets.setBounds(10, 10,200,200);
	        lstPlanets.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			lstPlanets.setSelectedIndex(0);
		    lstPlanets.setVisibleRowCount(8);  
		    lstPlanets.addListSelectionListener(new ListSelectionListener() {
		        public void valueChanged(ListSelectionEvent evt) {
		          jListValueChanged(evt);
		        }
		      });
		    panel.add(lstPlanets);
	        
	        this.getContentPane().add(panel);
	    }

		public static void main(String[] args) 
		{
			EventQueue.invokeLater(() -> {
	            Main MAIN = new Main();
	            MAIN.setVisible(true);
	        });
			
			planetNames.addElement(Planets.Mercury);
	        planetNames.addElement(Planets.Venus);
	        planetNames.addElement(Planets.Earth);
	        planetNames.addElement(Planets.Mars);
	        planetNames.addElement(Planets.Jupiter);
	        planetNames.addElement(Planets.Saturn);
	        planetNames.addElement(Planets.Uranus);
	        planetNames.addElement(Planets.Neptune);
		}
		
		private void jListValueChanged(ListSelectionEvent evt) 
		{
		    lblResult.setText("You want to go to " + lstPlanets.getSelectedValue().toString());
		    
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}

}

