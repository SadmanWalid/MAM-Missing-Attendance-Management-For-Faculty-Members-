package guiCreate;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

import com.mysql.jdbc.Connection;

import dataBaseConnect.ConnectionDatabase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;

public class AdminFrame extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel labelId;
	JTextField textFieldId;
	JLabel labelPass;
	JPasswordField passField;
	JButton buttonLogin;
	Connection conn;
	
	public AdminFrame() //creates teacher login frame 
	{
		super("Admin Login");
		this.conn=ConnectionDatabase.getConnection();
		this.setLayout(null);
        this.labelId=new JLabel("ID");
        this.setBounds(350, 90, 400, 200);
        this.labelId.setBounds(50,10,50,30);
        this.add(this.labelId);
        this.setBackground(Color.LIGHT_GRAY);
        
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

	public void actionPerformed(ActionEvent arg0) {
		
        
    	
    	try{
            
    		
    		Statement stmt=conn.createStatement();
    	    String query="SELECT * from admin";
    	    ResultSet rs=stmt.executeQuery(query);
    	    String tId=this.textFieldId.getText(); 
    	    //s=tId;
    	    //System.out.print("value of tf"+s);
    	    char [] tPassTemp=this.passField.getPassword();
    	    String tPass=new String(tPassTemp);
      	    //System.out.println(" "+tId); 
    	    int check=0;
    		while(rs.next())
    		{
    			 String i=rs.getString("id");
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
    			new AdminWindow();
    		}
            
    	
    		
    		
    		
    		
    		
    		
    		}
    		catch(Exception ex)
    	   {
            ex.printStackTrace();
           }
		
	}
	

}
