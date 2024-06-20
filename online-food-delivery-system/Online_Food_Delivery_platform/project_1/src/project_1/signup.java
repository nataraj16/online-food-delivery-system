package project_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class signup {

	private JFrame frame;
	private JTextField tfsno;
	private JTextField tfuser;
	private JPasswordField pfpwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup window = new signup();
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
	public signup() {
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
		
		JLabel lblNewLabel = new JLabel("S_No");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(57, 45, 93, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblUsername.setBounds(57, 81, 93, 26);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblPassword.setBounds(57, 117, 93, 26);
		frame.getContentPane().add(lblPassword);
		
		tfsno = new JTextField();
		tfsno.setBounds(179, 49, 96, 19);
		frame.getContentPane().add(tfsno);
		tfsno.setColumns(10);
		
		tfuser = new JTextField();
		tfuser.setColumns(10);
		tfuser.setBounds(179, 85, 96, 19);
		frame.getContentPane().add(tfuser);
		
		
		JButton button = new JButton("SIGN UP");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerlogin", "root", "");
					Statement stmt=con.createStatement();
					String SNo=tfsno.getText();
					String userid=tfuser.getText();
					String password=pfpwd.getText();
					String sql = "insert into `login_details` values('"+SNo+"', '"+userid+"', '"+password+"')";
					stmt.executeUpdate(sql);
					JOptionPane.showMessageDialog(frame, "Registration Completed Successfully");
					logic lp = new logic();
					frame.dispose();
				}
				catch(Exception exc) {exc.printStackTrace();}
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD, 14));
		button.setBounds(90, 167, 110, 34);
		frame.getContentPane().add(button);
		
		pfpwd = new JPasswordField();
		pfpwd.setBounds(179, 120, 96, 19);
		frame.getContentPane().add(pfpwd);
		
		JLabel lblNewLabel_1 = new JLabel("Registration_page");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(46, 10, 273, 25);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
