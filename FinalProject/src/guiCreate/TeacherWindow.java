package guiCreate;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTable;

import com.mysql.jdbc.Connection;

import dataBaseConnect.ConnectionDatabase;
import net.proteanit.sql.DbUtils;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JScrollPane;

public class TeacherWindow extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTable tableAttendance;
	Connection conn;
	private JScrollPane scrollPane;
	private JButton buttonReq;
	JButton buttonCheck;

	/**
	 * Launch the application.
	 */
	

	
	public TeacherWindow() {
		super("Attendance List");
		conn=ConnectionDatabase.getConnection();
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 90, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setBackground(Color.LIGHT_GRAY);
		
		this.buttonCheck = new JButton("Check Attendance");
		buttonCheck.addActionListener(this); 
			
		
		buttonCheck.setBounds(156, 24, 144, 23);
		contentPane.add(buttonCheck);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 61, 362, 160);
		contentPane.add(scrollPane);
		
		tableAttendance = new JTable();
		scrollPane.setViewportView(tableAttendance);
		tableAttendance.setRowSelectionAllowed(false);
		
		buttonReq = new JButton("Request For Manual Check");
		buttonReq.addActionListener(this); 
		buttonReq.setBounds(145, 227, 190, 23);
		contentPane.add(buttonReq);
	}
   
	public void actionPerformed(ActionEvent event) //check button's action
	{
     String actionCommand=event.getActionCommand();
     if(actionCommand.equals(this.buttonCheck.getText())) //check list
     {
    	 try{
     
      String s=TeacherFrame.getTextFirldId();
      //System.out.print("value of"+s);
      String query;
      Statement stmt=conn.createStatement();
      if(s.contentEquals("1"))
      {
    	query="SELECT * from attendance where t_id='1'";
      }
      else if(s.contentEquals("2"))
      {
    	query="SELECT * from attendance where t_id='2'";
      }
      else
    	query="SELECT * from attendance where t_id='3'";
    
      ResultSet rs=stmt.executeQuery(query);
    
      tableAttendance.setModel(DbUtils.resultSetToTableModel(rs));
    
	
	  }
	   catch(Exception ex)
      {
       ex.printStackTrace();
    
      }
     }
     
     else //req button's action
     {
    	
    	 try{
    	     
    	     
    	    
    		
    		  }
    		   catch(Exception ex)
    	      {
    	       ex.printStackTrace();
    	    
    	      }
    	this.dispose();
		 new RequestFrame();
    	 
    	 
    	 
    	 
    	 
    	 
     }
  }
	
  
	
	
	
}
