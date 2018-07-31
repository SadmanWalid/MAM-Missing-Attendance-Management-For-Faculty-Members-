package guiCreate;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class RequestFrame extends JFrame implements ActionListener {

	
	JLabel labelReqMessage;
	JButton buttonLogout;
	
	public RequestFrame()
	{
		super("Request Frame");
		this.setLayout(null);
		this.setBounds(350, 90, 400, 200);
		
		
		this.labelReqMessage=new JLabel("Request has been sent Succesfully!!!");
		this.labelReqMessage.setBounds(90,10,350,100);
		this.add(this.labelReqMessage);
		
		this.buttonLogout=new JButton("Log-out");
		this.buttonLogout.setBounds(170,120, 150, 20);
		this.add(this.buttonLogout);
		this.buttonLogout.addActionListener(this);
		this.setVisible(true);
		
		
		
		
	}

	public void actionPerformed(ActionEvent event) {
		
		this.dispose();
		new Login();
		
	}
}
