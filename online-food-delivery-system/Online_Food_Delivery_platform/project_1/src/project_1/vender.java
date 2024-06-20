package project_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class vender {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vender window = new vender();
					//window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param waterbottle 
	 * @param noodles 
	 * @param manchurian 
	 * @param pizza 
	 * @param icecreams 
	 * @param chickenbriyani 
	 * @param butterchicken 
	 * @param paneerbuttermasala 
	 * @param butternaan 
	 * @param briyani 
	 */
	 double total=0, finaltotal=0,subtotal=0,tax;
	
	// int total=0,Briyani1,butternaan1,paneerbuttermasala1,butterchicken1,chickenbriyani1,icecreams1,pizza1,manchurian1,noodles1,waterbottle1;
	private JButton btnNewButton_1;
	/**
	 * @wbp.parser.entryPoint
	 */
	public vender(double total) {
		initialize();
		this.total=total;
		textField.setText(""+total+"");
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public vender() {
		//this.setLocationRelativeTo(null);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 430, 323);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  Total");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(24, 22, 110, 46);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("  Tax");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(24, 78, 110, 46);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("  Finaltotal");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(24, 134, 110, 46);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("  ConfirmOrder");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conformorder co=new conformorder();
				frame.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(36, 206, 175, 46);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(136, 22, 149, 46);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{					
					//int cash=Integer.parseInt(textField_1.getText());
					double taxrate=2.5;
					
						 tax = (total * taxrate)/100;
		                 subtotal = total + tax;
					 finaltotal=subtotal;
					textField_1.setText(""+tax+"");
				
					
				}
				else {
					JOptionPane.showMessageDialog(null,"Insufficient funds");
				}
			}
		});
		textField_1.setColumns(10);
		textField_1.setBounds(136, 78, 149, 46);
		frame.getContentPane().add(textField_1);
		
		

		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					
					//int cash=Integer.parseInt(textField_1.getText());
					double taxrate=2.5;
					
						 tax = (total * taxrate)/100;
		                subtotal = total + tax;
					 finaltotal=subtotal;
					textField_2.setText(""+finaltotal+"");
				
					
				}
				else {
					JOptionPane.showMessageDialog(null,"Insufficient funds");
				}
				
			}
		});
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(136, 134, 149, 46);
		frame.getContentPane().add(textField_2);
		
		btnNewButton_1 = new JButton("  Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu mg=new menu();
				frame.setVisible(false);
			}

		
			
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_1.setBounds(241, 213, 128, 36);
		frame.getContentPane().add(btnNewButton_1);
		frame.setVisible(true);
	}

}
