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
	
	private void initUI(){
		
		Container pane = getContentPane();
		GroupLayout g1 = new GroupLayout(pane);
		pane.setLayout(g1);
		
		JButton quitButton = new JButton("Cookie");
		final JLabel cookiesDisplay = new JLabel("Cookies: " + Integer.toString(cookies));
		
		quitButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				cookies += 1;
				cookiesDisplay.setText("Cookies: " + Integer.toString(cookies));
			}
		});
		
		

		g1.setAutoCreateContainerGaps(true);
		
		g1.setHorizontalGroup(g1.createSequentialGroup().addComponent(quitButton).addComponent(cookiesDisplay));
		g1.setVerticalGroup(g1.createSequentialGroup().addComponent(quitButton).addComponent(cookiesDisplay));

		
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
