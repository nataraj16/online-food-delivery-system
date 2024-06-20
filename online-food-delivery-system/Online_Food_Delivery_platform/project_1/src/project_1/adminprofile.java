package project_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class adminprofile {

	private JFrame frame;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	String restaurantname,onwername,email,address;
	int  contact,pincode;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminprofile window = new adminprofile();
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
	public adminprofile() {
		initialize();
	}
	//public adminprofile(String na) {
		//this.na=na;
		//initialize();
		
	//}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 483, 376);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RESTURANT DETAILS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(53, 10, 284, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Resturant Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1.setBounds(25, 60, 167, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Owner Name");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(25, 90, 167, 32);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Contact info");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1_2.setBounds(25, 120, 167, 32);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Email Id");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1_3.setBounds(25, 146, 167, 32);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Address");
		lblNewLabel_1_3_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1_3_1.setBounds(25, 177, 167, 32);
		frame.getContentPane().add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Pincode");
		lblNewLabel_1_3_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1_3_2.setBounds(25, 213, 167, 32);
		frame.getContentPane().add(lblNewLabel_1_3_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.ITALIC, 17));
		textField.setBounds(212, 63, 178, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.ITALIC, 17));
		textField_1.setColumns(10);
		textField_1.setBounds(212, 94, 178, 28);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.ITALIC, 17));
		textField_2.setColumns(10);
		textField_2.setBounds(212, 123, 178, 28);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.ITALIC, 17));
		textField_3.setColumns(10);
		textField_3.setBounds(212, 149, 178, 28);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Times New Roman", Font.ITALIC, 17));
		textField_4.setColumns(10);
		textField_4.setBounds(212, 180, 178, 28);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Times New Roman", Font.ITALIC, 17));
		textField_5.setColumns(10);
		textField_5.setBounds(212, 208, 178, 37);
		frame.getContentPane().add(textField_5);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantdetails", "root", "");
					Statement stmt=con.createStatement();
					String restaurantname=textField.getText();
					String onwername=textField_1.getText();
					String contact=textField_2.getText();
					String email=textField_3.getText();
					String address=textField_4.getText();
					String pincode=textField_5.getText();
					String sql = "insert into `details` values('"+restaurantname+"', '"+onwername+"', '"+contact+"','"+email+"','"+address+"','"+pincode+"')";
					stmt.executeUpdate(sql);
					JOptionPane.showMessageDialog(frame, "Admindetails Successfully Registered");
					//logic lp = new logic();
					homepage h=new homepage();
					frame.dispose();
				}
				catch(Exception exc) {exc.printStackTrace();}
			
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton.setBounds(135, 270, 125, 40);
		frame.getContentPane().add(btnNewButton);
		

		frame.setVisible(true);
	}

}
