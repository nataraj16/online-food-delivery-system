package project_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class homepage {

	private JFrame frame;
	String name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage window = new homepage();
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
	public homepage() {
		initialize();
	}
	public homepage(String name){
		this.name=name;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(24, 102, 402, 34);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setText("WELCOME TO SRND RESTAURANT....");
		
		JButton btnNewButton = new JButton("customer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//menu m=new menu();
				logic l=new logic();
				frame.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.setBounds(207, 40, 107, 34);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("admin");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin aa=new admin();
				frame.setVisible(false);
				
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button.setBounds(319, 40, 107, 34);
		frame.getContentPane().add(button);
		frame.setVisible(true);
	}

}
