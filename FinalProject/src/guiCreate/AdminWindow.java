package guiCreate;

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
import java.awt.Color;

public class AdminWindow extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTable tableReq;
	JButton buttonCheckReq;
	Connection conn;
	private JScrollPane scrollPane;
	private JButton buttonUpdate;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public AdminWindow() {
		this.setVisible(true);
		this.conn=ConnectionDatabase.getConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 303);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.buttonCheckReq = new JButton("Check Request Table");
		this.buttonCheckReq.addActionListener(this);
		this.buttonCheckReq.setBounds(125, 11, 171, 23);
		this.contentPane.add(buttonCheckReq);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 45, 386, 140);
		contentPane.add(scrollPane);
		
		tableReq = new JTable();
		scrollPane.setViewportView(tableReq);
		tableReq.setColumnSelectionAllowed(true);
		tableReq.setCellSelectionEnabled(true);
		
		this.buttonUpdate = new JButton("Update Database");
		this.buttonUpdate.addActionListener(this); 
		this.buttonUpdate.setBounds(154, 218, 152, 23);
		this.contentPane.add(buttonUpdate);
	}

	public void actionPerformed(ActionEvent event) {
		
		try{
			String actionCommand=event.getActionCommand();
		 if(actionCommand.equals(this.buttonCheckReq.getText())) //req table button's action
		 {   Statement stmt=conn.createStatement();
		     String query="select t_id,int_time,out_time,date from attendance where  "+"("+"int_time=''or out_time=''"+")";
    	     //String query="SELECT * from attendance";
    	     ResultSet rs=stmt.executeQuery(query);
    	    
    	    tableReq.setModel(DbUtils.resultSetToTableModel(rs));
    	    
          
		 } 
		 
		 else
		 {
			 this.dispose();
			 new UpdateWindow();
			 
		 }
		 
		 
    		}
    		catch(Exception ex)
    	   {
            ex.printStackTrace();
           }
		
		
	    }

}
