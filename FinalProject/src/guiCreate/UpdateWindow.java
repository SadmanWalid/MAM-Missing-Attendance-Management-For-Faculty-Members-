package guiCreate;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

import com.mysql.jdbc.Connection;

import dataBaseConnect.ConnectionDatabase;
import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateWindow extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textFieldInOut;
	private JLabel labelInOut;
	private JTable tableUpdate;
	private JButton buttonLogOut;
	private JButton buttonUpdateValue;
	Connection conn;
	private JScrollPane scrollPane;
	private String date;
	private String in_time;
	private String out_time;
	private Statement stmtUp;
	private String queryUp;



	/**
	 * Create the frame.
	 */
	public UpdateWindow() {
		this.setVisible(true);
		this.conn=ConnectionDatabase.getConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 393);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		labelInOut = new JLabel("IN/OUT TIME:");
		labelInOut.setBackground(new Color(0, 0, 0));
		labelInOut.setBounds(10, 49, 73, 14);
		contentPane.add(labelInOut);
		
		this.textFieldInOut = new JTextField();
		this.textFieldInOut.setBounds(78, 46, 89, 20);
		this.contentPane.add(textFieldInOut);
		this.textFieldInOut.setColumns(10);
		
		this.buttonUpdateValue = new JButton("Update");
		buttonUpdateValue.addActionListener(this);
		this.buttonUpdateValue.setBounds(27, 136, 89, 23);
		this.contentPane.add(buttonUpdateValue);
		
		this.buttonLogOut = new JButton("Log-out");
		this.buttonLogOut.setBounds(27, 203, 89, 23);
		this.buttonLogOut.addActionListener(this);
		this.contentPane.add(buttonLogOut);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(184, 30, 410, 196);
		contentPane.add(scrollPane);
		
		this.tableUpdate = new JTable();
		tableUpdate.setBackground(Color.WHITE);
		scrollPane.setViewportView(tableUpdate);
		this.tableUpdate.setRowSelectionAllowed(false);
		this.tableUpdate.setCellSelectionEnabled(true);
		this.tableFrame();
	}



	public void tableFrame() {   //create table
		
		try{
			
		     Statement stmt=conn.createStatement();
		     String query="select t_id,int_time,out_time,date from attendance where  "+"("+"int_time=''or out_time=''"+")";
    	     //String query="SELECT * from attendance";
    	     ResultSet rs=stmt.executeQuery(query);
    	    
    	    tableUpdate.setModel(DbUtils.resultSetToTableModel(rs));
    	    
          
		 } 
		 
		
		 
		
    		catch(Exception ex)
    	   {
            ex.printStackTrace();
           }
	}



	public void actionPerformed(ActionEvent event) {
	   try{
		   String command=event.getActionCommand();
		   //System.out.print("check  "+command);
			if(command.equals(this.buttonLogOut.getText()))
			{
				//System.out.print("check  ");
				this.dispose();
				new Login();
			}
			
			else
		    {
			 String textFieldValue=this.textFieldInOut.getText();
			 
		     Statement stmt=conn.createStatement();
		     String query="select date,int_time,out_time from attendance where  "+"("+"int_time=''or out_time=''"+")";
   	         //String query="SELECT * from attendance";
   	         ResultSet rs=stmt.executeQuery(query);
   	         
   	         while(rs.next())
   	         {
   	        	this.date=rs.getString("date");
   	        	this.in_time=rs.getString("int_time");
   	        	this.out_time=rs.getString("out_time");
   	        	
   	        	 break;
   	         }
   	         
   	         this.stmtUp=conn.createStatement();
   	        
   	        //queryUp;
   	       
			//String date=date;
   	         if(this.in_time.equals(""))
			{
   	        	 this.queryUp="update attendance SET int_time='"+textFieldValue+"' where date='"+date+"'AND int_time=''";
			}
   	         else
   	         {
   	        	this.queryUp="update attendance SET out_time='"+textFieldValue+"' where date='"+date+"'AND out_time=''";
   	         }
		
		     //String queryUp="select t_id,int_time,out_time,date from attendance where  "+"("+"int_time=''or out_time=''"+")";
 	        //String query="SELECT * from attendance";
			 
			 stmtUp.executeUpdate(queryUp);
 	        
 	         String queryUpdated="select t_id,int_time,out_time,date from attendance where  "+"("+"int_time=''or out_time=''"+")";
   	         ResultSet rsUp=stmtUp.executeQuery(queryUpdated);
 	         
 	    
 	        tableUpdate.setModel(DbUtils.resultSetToTableModel(rsUp));
   	    
   	        
   	    
		    }
		    
		 
	   }
		 
		
   		catch(Exception ex)
   	   {
           ex.printStackTrace();
          }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
