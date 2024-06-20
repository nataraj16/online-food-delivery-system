package project_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class conformorder {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	String customername,contact,address,street,pincode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					conformorder window = new conformorder();
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
	public conformorder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 505, 462);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(25, 91, 124, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ADDRESS DETAILS....");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(25, 16, 451, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblContact.setBounds(33, 126, 124, 41);
		frame.getContentPane().add(lblContact);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAddress.setBounds(33, 163, 124, 41);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblStreet = new JLabel("Street");
		lblStreet.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblStreet.setBounds(33, 203, 124, 41);
		frame.getContentPane().add(lblStreet);
		
		JLabel lblPincode = new JLabel("Pincode");
		lblPincode.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPincode.setBounds(33, 236, 124, 41);
		frame.getContentPane().add(lblPincode);
		
		textField = new JTextField();
		textField.setBounds(172, 91, 138, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(172, 126, 138, 29);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(172, 164, 138, 29);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(172, 203, 138, 29);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(172, 248, 138, 29);
		frame.getContentPane().add(textField_4);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/addressdetails", "root", "");
				Statement stmt=con.createStatement();
				String customername=textField.getText();
				String contact=textField_1.getText();
				String address=textField_2.getText();
				String street=textField_3.getText();
				String pincode=textField_4.getText();
				
				String sql = "insert into `deliverydetails` values('"+customername+"', '"+contact+"','"+address+"','"+street+"','"+pincode+"')";
				stmt.executeUpdate(sql);
				JOptionPane.showMessageDialog(frame, "Deliverydetails Successfully Registered");
				//logic lp = new logic();
				payment py=new payment();
				//frame.setVisible(false);
				frame.dispose();
			}
			catch(Exception exc) {exc.printStackTrace();}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBounds(51, 313, 151, 48);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vender b=new vender();
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_1.setBounds(242, 313, 111, 41);
		frame.getContentPane().add(btnNewButton_1);
		frame.setVisible(true);
	}

}
