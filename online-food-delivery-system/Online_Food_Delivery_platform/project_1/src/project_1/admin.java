package project_1;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class admin {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	String usname,pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin window = new admin();
					//window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public admin() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("username");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(56, 55, 88, 23);
		frame.getContentPane().add(lblNewLabel);
		
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPassword.setBounds(56, 85, 88, 23);
		frame.getContentPane().add(lblPassword);
		
		JButton btnNewButton = new JButton("login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin", "root", "");
				Statement stmt= con.createStatement();
				usname=textField.getText();
				pass=String.valueOf(passwordField.getPassword());
				String qry="select * from login where user='"+usname+"'";
				ResultSet rs=stmt.executeQuery(qry);
				String dbUname=null, dbName=null;
				if(rs.next()) {
					dbUname =rs.getString("user");
					dbName =rs.getString("pass");
				}
				if(usname.equalsIgnoreCase(dbUname)&&pass .equals(dbName)) {
					JOptionPane.showMessageDialog(frame,"loginsuccessful");
					adminprofile ap =new adminprofile();
					frame.dispose();
				}
				else {
					Component ibnlogin = null;
					JOptionPane.showMessageDialog(ibnlogin,"loginfailed");
					
					
				}
				
			}
				catch(Exception ex) {ex.printStackTrace();}
				}
			}
			
		);

		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(83, 118, 100, 35);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(171, 57, 100, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(171, 87, 100, 19);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("Admin_login");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(81, 22, 218, 23);
		frame.getContentPane().add(lblNewLabel_2);
		frame.setVisible(true);
	}

}
