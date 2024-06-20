package project_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class greetings {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					greetings window = new greetings();
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
	public greetings() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thankyou....");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(22, 53, 393, 54);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblVisiteagain = new JLabel("    Visit Again...");
		lblVisiteagain.setHorizontalAlignment(SwingConstants.LEFT);
		lblVisiteagain.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		lblVisiteagain.setBounds(22, 132, 393, 54);
		frame.getContentPane().add(lblVisiteagain);
		frame.setVisible(true);
	}

}
