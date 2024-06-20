package project_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
public class payment {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payment window = new payment();
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
	public payment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 368, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Payment Method");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 20, 304, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UPI ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(20, 85, 95, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Credit Cards");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(20, 119, 95, 37);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("COD");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(20, 153, 95, 37);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				int UPI;
//					if(chckbxNewCheckBox.isSelected()) {
//						JOptionPane.showMessageDialog(frame,"upi payment mode is selected");
//				}
			}
		});
		chckbxNewCheckBox.setBounds(120, 89, 21, 21);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		 
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				int credit;
//				if(chckbxNewCheckBox_1.isSelected()) {
//					JOptionPane.showMessageDialog(frame,"credit payment method is selected");
//				}
			}
		});
		chckbxNewCheckBox_1.setBounds(121, 125, 21, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("");
		chckbxNewCheckBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				int COD;
//					if(chckbxNewCheckBox_2.isSelected()) {
//						JOptionPane.showMessageDialog(frame,"cash on deilvery is selected");
//				}
			}
		});
		chckbxNewCheckBox_2.setBounds(121, 160, 21, 21);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(chckbxNewCheckBox);
        buttonGroup.add(chckbxNewCheckBox_1);
        buttonGroup.add(chckbxNewCheckBox_2);
		
		JButton btnNewButton = new JButton("PlaceOrder");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int UPI;
				if(chckbxNewCheckBox.isSelected()) {
					JOptionPane.showMessageDialog(frame,"upi payment mode is selected");
					upipayment up =new upipayment();
					frame.setVisible(false);
			}
				int credit;
				if(chckbxNewCheckBox_1.isSelected()) {
					JOptionPane.showMessageDialog(frame,"credit payment method is selected");
					creditmode cm=new creditmode();
					frame.setVisible(false);
				}
				
				int COD;
				if(chckbxNewCheckBox_2.isSelected()) {
					JOptionPane.showMessageDialog(frame,"cash on deilvery is selected");
			
				
				JOptionPane.showMessageDialog(frame,"orderconfirmed successfully");
				greetings gt=new greetings();
				frame.dispose();
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(30, 208, 144, 45);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				chckbxNewCheckBox.setSelected(false);
				chckbxNewCheckBox_1.setSelected(false);
				chckbxNewCheckBox_2.setSelected(false);
			}
			
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_1.setBounds(184, 208, 140, 45);
		frame.getContentPane().add(btnNewButton_1);
		frame.setVisible(true);
	}
}
