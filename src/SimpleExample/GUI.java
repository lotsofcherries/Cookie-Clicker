package SimpleExample;

import java.awt.Container;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

public class GUI extends JFrame{
	
	int cookies = 0;
	
	public GUI(){
		
		initUI();
		
	}
	
	
	// UI code is organized into a function to make stuff neat
	private void initUI(){
		
		// Create the container to put buttons and stuff in
		Container pane = getContentPane();
		GroupLayout g1 = new GroupLayout(pane);
		pane.setLayout(g1);
		
		// Window components
		JButton quitButton = new JButton("Cookie");
		final JLabel cookiesDisplay = new JLabel("Cookies: " + Integer.toString(cookies));
		
		// Add action for the cookie (button = cookie) so you get cookies
		quitButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				cookies += 1;
				// Update JLabel that displays number of cookies
				cookiesDisplay.setText("Cookies: " + Integer.toString(cookies));
			}
		});

		// Create gaps in the container
		g1.setAutoCreateContainerGaps(true);
		
		// Add the components to the horizontal and vertical groups
		g1.setHorizontalGroup(g1.createSequentialGroup()
				.addComponent(quitButton)
				.addComponent(cookiesDisplay));
		
		g1.setVerticalGroup(g1.createSequentialGroup()
				.addComponent(quitButton)
				.addComponent(cookiesDisplay));

		// Window setup 
		setTitle("Simple Example");
		setSize(200, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				GUI ex = new GUI(); 
				ex.setVisible(true);
			}
		});			
		
	}
	
}
