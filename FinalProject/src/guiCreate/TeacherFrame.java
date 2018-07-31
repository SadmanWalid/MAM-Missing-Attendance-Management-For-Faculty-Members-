package guiCreate;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class TeacherFrame extends JFrame implements ActionListener {
	
	JLabel labelId;
	JTextField textFieldId;
	JLabel labelPass;
	JPasswordField passField;
	JButton buttonLogin;
	Connection conn;
	JOptionPane optionPaneWarning;
	TeacherFrame tObj;
	static String s; //teacher id 
	
	public TeacherFrame() //creates teacher login frame 
	{
		super("Teacher Login");
		this.setLayout(null);
		this.setBackground(Color.LIGHT_GRAY);
        this.labelId=new JLabel("ID");
        this.setBounds(350, 90, 400, 200);
        this.labelId.setBounds(50,10,50,30);
        this.add(this.labelId);
        tObj=this;
        
        
        
        this.textFieldId =new JTextField();
        this.textFieldId.setBounds(100,10,200,30);
        this.add(this.textFieldId);
        
        
        this.labelPass=new JLabel("Password");
        this.labelPass.setBounds(30,50,75,30);
        this.add(this.labelPass);
        
        this.passField=new JPasswordField();
        this.passField.setBounds(100, 50, 200, 30);
        this.add(this.passField);
        
        this.buttonLogin=new JButton("Login");
        this.buttonLogin.setBounds(200,100,100,30);
        this.buttonLogin.addActionListener(this);
        this.add(this.buttonLogin);
        
        
        
        this.setVisible(true);
        
		
	}
	public static String getTextFirldId()
	{
		return s;
	}
    public void actionPerformed(ActionEvent event) {
		
		//System.out.println("Button Clicked.."+event.getActionCommand());
    	//String command=event.getActionCommand();
    	
    	try{
            Class.forName("com.mysql.jdbc.Driver");
    		conn = DriverManager.getConnection("jdbc:mysql://localhost/loginuser", "root", "");
    		Statement stmt=conn.createStatement();
    	    String query="SELECT * from teacher";
    	    ResultSet rs=stmt.executeQuery(query);
    	    String tId=this.textFieldId.getText(); 
    	    s=tId;
    	    //System.out.print("value of tf"+s);
    	    char [] tPassTemp=this.passField.getPassword();
    	    String tPass=new String(tPassTemp);
      	    //System.out.println(" "+tId); 
    	    int check=0;
    		while(rs.next())
    		{
    			 String i=rs.getString("t_id");
    			 String p=rs.getString("password");
    			 if((tId.equals(i))&&(tPass.equals(p)))   
    			 {
    				 check=1;
    				
    			 }
    			 
    	
    		
    			 
    			 
    			
    		}
    		 //System.out.println("value of check "+check+" tpass "+tPass); 
    		if(check==0)
    		{
    			JOptionPane.showMessageDialog(this,"SORRY!!!WRONG PASSWORD OR ID.TRY AGAIN PLEASE!!!");
    		}
    		
    		else
    		{
    			this.dispose();
    			new TeacherWindow();
    		}
            
    	
    		
    		
    		
    		
    		
    		
    		}
    		catch(Exception ex)
    	   {
            ex.printStackTrace();
           }
 	   
		
	}
	

}
