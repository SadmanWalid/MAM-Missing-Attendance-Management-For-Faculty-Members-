package guiCreate;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8431699162748051706L;
	/**
	 * 
	 */
	
	JButton admin; //admin
	JButton teacher; //teacher
	JLabel label1;
	JLabel labelPass; //password label
	JTextField textFieldId;
	JPasswordField passField;
	JButton buttonLogin;
	JFrame frameTeacher;
	JLabel labelID;
	
	public Login()
	{
		super("Missing Attendance Management");
		//this.setLayout(new FlowLayout());
		this.setLayout(null);
		this.setBackground(Color.LIGHT_GRAY);
		this.setBounds(350, 90, 500, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //this.setSize(300,100);
	    
		
        this.label1=new JLabel("LOGIN AS:");
        this.label1.setBounds(200,10,100,40);
        this.add(label1);
		admin = new JButton("Admin");
		this.admin.setBounds(170,45, 140, 40);
		this.admin.addActionListener(this);
		this.add(admin); //admin button
		
		teacher = new JButton("teacher");
		this.teacher.setBounds(170,90, 140, 40);
		
		this.add(teacher); //teacher button
		this.teacher.addActionListener(this);
		this.setVisible(true);
	}
	
   public void actionPerformed(ActionEvent event) {
		
		//System.out.println("Button Clicked.."+event.getActionCommand());
		String command=event.getActionCommand();
	   if(command.contentEquals(this.teacher.getActionCommand()))
	   {
		   this.dispose(); 
		   
		   new TeacherFrame();
		  
	   }
	   
	   else
	   {
           this.dispose(); 
		   
		   new AdminFrame();   
	   }
	}
   
  
}
