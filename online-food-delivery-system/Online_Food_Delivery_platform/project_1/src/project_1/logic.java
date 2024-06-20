package project_1;
import java.sql.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class logic {

	private JFrame frame;
	private JTextField uname;
	private JPasswordField pwd;
	String usname,pass;
	private JButton login;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					logic window = new logic();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public logic() {
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
		
		
		JLabel lblNewLabel = new JLabel("Logic Page");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 10, 400, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 72, 92, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 114, 92, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		uname = new JTextField();
		uname.setBounds(112, 79, 145, 19);
		frame.getContentPane().add(uname);
		uname.setColumns(10);
		
		pwd = new JPasswordField();
		pwd.setBounds(112, 116, 145, 19);
		frame.getContentPane().add(pwd);
		
		JButton ibnlogin = new JButton("Login");
		ibnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerlogin", "root", "");
				Statement stmt= con.createStatement();
				usname=uname.getText();
				pass=String.valueOf(pwd.getPassword());
				String qry="select * from login_details where userid='"+usname+"'";
				ResultSet rs=stmt.executeQuery(qry);
				String dbUname=null, dbName=null;
				if(rs.next()) {
					dbUname =rs.getString("userid");
					dbName =rs.getString("password");
				}
				if(usname.equalsIgnoreCase(dbUname)&&pass .equals(dbName)) {
					//homepage k=new homepage(usname);
					JOptionPane.showMessageDialog(ibnlogin,"Loginsuccessful..");
					menu m=new menu();
					frame.setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(ibnlogin,"loginfailed..");
				}
				
			}
				catch(Exception ex) {ex.printStackTrace();}
				}
			}
			
		);
		ibnlogin.setFont(new Font("Times New Roman", Font.BOLD, 12));
		ibnlogin.setBounds(25, 169, 99, 32);
		frame.getContentPane().add(ibnlogin);
		
		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uname.setText(null);
				pwd.setText(null);
				
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnCancel.setBounds(158, 169, 99, 32);
		frame.getContentPane().add(btnCancel);
		
		JLabel lblNewLabel_3 = new JLabel("new user?");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setBounds(49, 223, 64, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("signup");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			signup sp=new signup();
			frame.dispose();			}
			
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.setBounds(112, 224, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
	}
}
