package project_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class menu {

	private JFrame frame;
	private JTextField txtrs;
	private JTextField txtrs_1;
	private JTextField txtrs_2;
	private JTextField txtrs_3;
	private JTextField txtrs_4;
	private JTextField txtrs_7;
	private JTextField txtrs_6;
	private JTextField txtrs_5;
	private JTextField txtrs_8;
	private JTextField txtrs_9;
	
	int priceBriyani;int pricebutternaan,pricepaneerbuttermasala,pricebutterchicken,pricechickenbriyani,priceicecreams,pricepizza,pricemanchrian,pricenoodles,pricewaterbottle;
	int quantitybutternaan,quantitypaneerbuttermasala,quantitybutterchicken,quantitychickenbriyani,quantityicecreams,quantitypizza,quantitymanchurian,quantitynoodles,quantitywaterbottle;
	int quantityBriyani;
	int Briyani=0; int butternaan = 0; int paneerbuttermasala=0; int butterchicken=0; int chickenbriyani=0; int icecreams=0; int pizza=0; int manchurian=0; int noodles=0; int waterbottle=0;
	int total;
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu window = new menu();
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
	public menu() {
		initialize();
		//this.setLocationRelativeTo(null);
	}
	
	

	private void setLocationRelativeTo(Object object) {
		// TODO Auto-generated method stub
		
	}
	private void updateTotal() {
		// TODO Auto-generated method stub
		total = Briyani + butternaan + paneerbuttermasala + butterchicken + chickenbriyani + icecreams + pizza + manchurian + noodles + waterbottle;
	}
	 

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1145, 635);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SRND RESTAURANT....");
		lblNewLabel.setBounds(10, 17, 1111, 34);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 524, 1121, 64);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
	
		
		
		JLabel lblNewLabel_1 = new JLabel("     MENU ITEMS....");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(10, 61, 1111, 45);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		panel1.setBounds(33, 116, 158, 183);
		frame.getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("BIRYANI");
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 41, 138, 37);
		panel1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("price");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3.setBounds(10, 88, 60, 28);
		panel1.add(lblNewLabel_3);
		
		txtrs = new JTextField();
		txtrs.setText("250RS");
		txtrs.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtrs.setBounds(88, 94, 60, 19);
		panel1.add(txtrs);
		txtrs.setColumns(10);
		
		JLabel qty = new JLabel("Quantity");
		qty.setFont(new Font("Times New Roman", Font.BOLD, 14));
		qty.setBounds(10, 116, 60, 28);
		panel1.add(qty);
		
		JSpinner spinner1 = new JSpinner();
		spinner1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				 quantityBriyani = (int) spinner1.getValue();
			         priceBriyani = 250; 
			       Briyani = quantityBriyani * priceBriyani;
			        updateTotal();
			}

		
		});
		spinner1.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinner1.setBounds(98, 122, 30, 20);
		panel1.add(spinner1);
		
		JCheckBox chckbx = new JCheckBox("Purchase");
		chckbx.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		chckbx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if ((int)spinner1.getValue() == 0 && chckbx.isSelected()) {
		            JOptionPane.showMessageDialog(null, "Please increase the quantity.");
		            chckbx.setSelected(false);
				
			}
			}
	
		});
		chckbx.setBounds(20, 152, 104, 21);
		panel1.add(chckbx);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(Color.WHITE);
		panel2.setBounds(228, 116, 158, 183);
		frame.getContentPane().add(panel2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Butter Naan");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_1.setBounds(10, 41, 138, 37);
		panel2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("price");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3_1.setBounds(10, 88, 60, 28);
		panel2.add(lblNewLabel_3_1);
		
		txtrs_1 = new JTextField();
		txtrs_1.setText("50RS");
		txtrs_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtrs_1.setColumns(10);
		txtrs_1.setBounds(88, 94, 60, 19);
		panel2.add(txtrs_1);
		
		JLabel qty1 = new JLabel("Quantity");
		qty1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		qty1.setBounds(10, 116, 60, 28);
		panel2.add(qty1);
		
		JSpinner spinner2 = new JSpinner();
		spinner2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				  quantitybutternaan = (int) spinner2.getValue();
			         pricebutternaan = 50; 
			        butternaan = quantitybutternaan * pricebutternaan;
			        updateTotal();
				
			}
		});
		spinner2.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		spinner2.setBounds(98, 122, 30, 20);
		panel2.add(spinner2);
		
		JCheckBox chckbx1 = new JCheckBox("purchase");
		chckbx1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if ((int)spinner2.getValue() == 0 && chckbx1.isSelected()) {
		            JOptionPane.showMessageDialog(null, "Please increase the quantity.");
		            chckbx1.setSelected(false);
				}
			}
		});
		chckbx1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		chckbx1.setBounds(20, 152, 108, 21);
		panel2.add(chckbx1);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBackground(Color.WHITE);
		panel3.setBounds(416, 116, 158, 183);
		frame.getContentPane().add(panel3);
		
		JLabel lblNewLabel_2_2 = new JLabel("Paneer Butter Masala");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2_2.setBackground(Color.WHITE);
		lblNewLabel_2_2.setBounds(10, 41, 138, 37);
		panel3.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("price");
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3_2.setBounds(10, 88, 60, 28);
		panel3.add(lblNewLabel_3_2);
		
		txtrs_2 = new JTextField();
		txtrs_2.setText("200RS");
		txtrs_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtrs_2.setColumns(10);
		txtrs_2.setBounds(88, 94, 60, 19);
		panel3.add(txtrs_2);
		
		JLabel qty2 = new JLabel("Quantity");
		qty2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		qty2.setBounds(10, 116, 60, 28);
		panel3.add(qty2);
		
		JSpinner spinner3 = new JSpinner();
		spinner3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				  quantitypaneerbuttermasala = (int) spinner3.getValue();
			         pricepaneerbuttermasala = 200; 
			        paneerbuttermasala = quantitypaneerbuttermasala * pricepaneerbuttermasala;
			        updateTotal();
			}
		});
		spinner3.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		spinner3.setBounds(98, 122, 30, 20);
		panel3.add(spinner3);
		
		JCheckBox chckbx2 = new JCheckBox("purchase");
		chckbx2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((int)spinner3.getValue() == 0 && chckbx2.isSelected()) {
		            JOptionPane.showMessageDialog(null, "Please increase the quantity.");
		            chckbx2.setSelected(false);
				}
				
			}
		});
		chckbx2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		chckbx2.setBounds(10, 152, 108, 21);
		panel3.add(chckbx2);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBackground(Color.WHITE);
		panel4.setBounds(610, 116, 158, 183);
		frame.getContentPane().add(panel4);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Butter Chicken");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_2_1.setBounds(10, 41, 138, 37);
		panel4.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("price");
		lblNewLabel_3_2_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3_2_1.setBounds(10, 88, 60, 28);
		panel4.add(lblNewLabel_3_2_1);
		
		txtrs_3 = new JTextField();
		txtrs_3.setText("200RS");
		txtrs_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtrs_3.setColumns(10);
		txtrs_3.setBounds(88, 94, 60, 19);
		panel4.add(txtrs_3);
		
		JLabel qty3 = new JLabel("Quantity");
		qty3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		qty3.setBounds(10, 116, 60, 28);
		panel4.add(qty3);
		
		JSpinner spinner4 = new JSpinner();
		spinner4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				 quantitybutterchicken = (int) spinner4.getValue();
		         pricebutterchicken = 200; 
		       butterchicken = quantitybutterchicken * pricebutterchicken;
		        updateTotal();
		
			}
		});
		spinner4.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		spinner4.setBounds(98, 122, 30, 20);
		panel4.add(spinner4);
		
		JCheckBox chckbx3 = new JCheckBox("purchase");
		chckbx3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((int)spinner4.getValue() == 0 && chckbx3.isSelected()) {
		            JOptionPane.showMessageDialog(null, "Please increase the quantity.");
		            chckbx3.setSelected(false);
				}
			}
		});
		chckbx3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		chckbx3.setBounds(20, 152, 98, 21);
		panel4.add(chckbx3);
		
		JPanel panel5 = new JPanel();
		panel5.setLayout(null);
		panel5.setBackground(Color.WHITE);
		panel5.setBounds(806, 116, 158, 183);
		frame.getContentPane().add(panel5);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Chicken Biryani");
		lblNewLabel_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2_2_2.setBackground(Color.WHITE);
		lblNewLabel_2_2_2.setBounds(10, 41, 138, 37);
		panel5.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("price");
		lblNewLabel_3_2_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3_2_2.setBounds(10, 88, 60, 28);
		panel5.add(lblNewLabel_3_2_2);
		
		txtrs_4 = new JTextField();
		txtrs_4.setText("300RS");
		txtrs_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtrs_4.setColumns(10);
		txtrs_4.setBounds(88, 94, 60, 19);
		panel5.add(txtrs_4);
		
		JLabel qty4 = new JLabel("Quantity");
		qty4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		qty4.setBounds(10, 116, 60, 28);
		panel5.add(qty4);
		
		JSpinner spinner5 = new JSpinner();
		spinner5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				 quantitychickenbriyani = (int) spinner5.getValue();
		         pricechickenbriyani = 300; 
		       chickenbriyani = quantitychickenbriyani * pricechickenbriyani;
		       updateTotal();
		
			}
		});
		spinner5.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		spinner5.setBounds(98, 122, 30, 20);
		panel5.add(spinner5);
		
		JCheckBox chckbx4 = new JCheckBox("purchase");
		chckbx4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((int)spinner5.getValue() == 0 && chckbx4.isSelected()) {
		            JOptionPane.showMessageDialog(null, "Please increase the quantity.");
		            chckbx4.setSelected(false);
				}
			}
		});
		chckbx4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		chckbx4.setBounds(10, 152, 108, 21);
		panel5.add(chckbx4);
		
		JPanel panel8 = new JPanel();
		panel8.setLayout(null);
		panel8.setBackground(Color.WHITE);
		panel8.setBounds(416, 320, 158, 183);
		frame.getContentPane().add(panel8);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("Manchurian");
		lblNewLabel_2_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2_2_3.setBackground(Color.WHITE);
		lblNewLabel_2_2_3.setBounds(10, 41, 138, 37);
		panel8.add(lblNewLabel_2_2_3);
		
		JLabel lblNewLabel_3_2_3 = new JLabel("price");
		lblNewLabel_3_2_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3_2_3.setBounds(10, 88, 60, 28);
		panel8.add(lblNewLabel_3_2_3);
		
		txtrs_7 = new JTextField();
		txtrs_7.setText("110RS");
		txtrs_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtrs_7.setColumns(10);
		txtrs_7.setBounds(88, 94, 60, 19);
		panel8.add(txtrs_7);
		
		JLabel qty7 = new JLabel("Quantity");
		qty7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		qty7.setBounds(10, 116, 60, 28);
		panel8.add(qty7);
		
		JSpinner spinner8 = new JSpinner();
		spinner8.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				quantitymanchurian = (int) spinner8.getValue();
		        pricemanchrian = 110; 
		       manchurian = quantitymanchurian * pricemanchrian;
		        updateTotal();
		
			}
		});
		spinner8.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		spinner8.setBounds(98, 122, 30, 20);
		panel8.add(spinner8);
		
		JCheckBox chckbx7 = new JCheckBox("purchase");
		chckbx7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if ((int)spinner8.getValue() == 0 && chckbx7.isSelected()) {
		            JOptionPane.showMessageDialog(null, "Please increase the quantity.");
		            chckbx7.setSelected(false);
					
				}
			}
		});
		chckbx7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		chckbx7.setBounds(10, 152, 118, 21);
		panel8.add(chckbx7);
		
		JPanel panel7 = new JPanel();
		panel7.setLayout(null);
		panel7.setBackground(Color.WHITE);
		panel7.setBounds(228, 320, 158, 183);
		frame.getContentPane().add(panel7);
		
		JLabel lblNewLabel_2_2_3_1 = new JLabel("Pizza");
		lblNewLabel_2_2_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_3_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2_2_3_1.setBackground(Color.WHITE);
		lblNewLabel_2_2_3_1.setBounds(10, 41, 138, 37);
		panel7.add(lblNewLabel_2_2_3_1);
		
		JLabel lblNewLabel_3_2_3_1 = new JLabel("price");
		lblNewLabel_3_2_3_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3_2_3_1.setBounds(10, 88, 60, 28);
		panel7.add(lblNewLabel_3_2_3_1);
		
		txtrs_6 = new JTextField();
		txtrs_6.setText("120RS");
		txtrs_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtrs_6.setColumns(10);
		txtrs_6.setBounds(88, 94, 60, 19);
		panel7.add(txtrs_6);
		
		JLabel qty6 = new JLabel("Quantity");
		qty6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		qty6.setBounds(10, 116, 60, 28);
		panel7.add(qty6);
		
		JSpinner spinner7 = new JSpinner();
		spinner7.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				quantitypizza = (int) spinner7.getValue();
		        pricepizza = 200; 
		        pizza = quantitypizza * pricepizza;
		        updateTotal();
		
			}
			
		});
		spinner7.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		spinner7.setBounds(98, 122, 30, 20);
		panel7.add(spinner7);
		
		JCheckBox chckbx6 = new JCheckBox("purchase");
		chckbx6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if ((int)spinner7.getValue() == 0 && chckbx6.isSelected()) {
		            JOptionPane.showMessageDialog(null, "Please increase the quantity.");
		            chckbx6.setSelected(false);
					
				}
			}
		});
		chckbx6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		chckbx6.setBounds(10, 152, 118, 21);
		panel7.add(chckbx6);
		
		JPanel panel6 = new JPanel();
		panel6.setLayout(null);
		panel6.setBackground(Color.WHITE);
		panel6.setBounds(33, 320, 158, 183);
		frame.getContentPane().add(panel6);
		
		JLabel lblNewLabel_2_2_3_2 = new JLabel("IceCreams");
		lblNewLabel_2_2_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_3_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2_2_3_2.setBackground(Color.WHITE);
		lblNewLabel_2_2_3_2.setBounds(10, 41, 138, 37);
		panel6.add(lblNewLabel_2_2_3_2);
		
		JLabel lblNewLabel_3_2_3_2 = new JLabel("price");
		lblNewLabel_3_2_3_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3_2_3_2.setBounds(10, 88, 60, 28);
		panel6.add(lblNewLabel_3_2_3_2);
		
		txtrs_5 = new JTextField();
		txtrs_5.setEditable(false);
		txtrs_5.setText("100RS");
		txtrs_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtrs_5.setColumns(10);
		txtrs_5.setBounds(88, 94, 60, 19);
		panel6.add(txtrs_5);
		
		JLabel qty5 = new JLabel("Quantity");
		qty5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		qty5.setBounds(10, 116, 60, 28);
		panel6.add(qty5);
		
		JSpinner spinner6 = new JSpinner();
		spinner6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				quantityicecreams = (int) spinner6.getValue();
		        priceicecreams = 100; 
		       icecreams = quantityicecreams * priceicecreams;
		        updateTotal();
		
			}
		});
		spinner6.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		spinner6.setBounds(98, 122, 30, 20);
		panel6.add(spinner6);
		
		JCheckBox chckbx5 = new JCheckBox("purchase");
		chckbx5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if ((int)spinner6.getValue() == 0 && chckbx5.isSelected()) {
		            JOptionPane.showMessageDialog(null, "Please increase the quantity.");
		            chckbx7.setSelected(false);
					
				}
			}
		});
		chckbx5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		chckbx5.setBounds(10, 152, 118, 21);
		panel6.add(chckbx5);
		
		JPanel panel9 = new JPanel();
		panel9.setLayout(null);
		panel9.setBackground(Color.WHITE);
		panel9.setBounds(610, 320, 158, 183);
		frame.getContentPane().add(panel9);
		
		JLabel lblNewLabel_2_2_3_3 = new JLabel("Noodles");
		lblNewLabel_2_2_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_3_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2_2_3_3.setBackground(Color.WHITE);
		lblNewLabel_2_2_3_3.setBounds(10, 41, 138, 37);
		panel9.add(lblNewLabel_2_2_3_3);
		
		JLabel lblNewLabel_3_2_3_3 = new JLabel("price");
		lblNewLabel_3_2_3_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3_2_3_3.setBounds(10, 88, 60, 28);
		panel9.add(lblNewLabel_3_2_3_3);
		
		txtrs_8 = new JTextField();
		txtrs_8.setText("80RS");
		txtrs_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtrs_8.setColumns(10);
		txtrs_8.setBounds(88, 94, 60, 19);
		panel9.add(txtrs_8);
		
		JLabel qty8 = new JLabel("Quantity");
		qty8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		qty8.setBounds(10, 116, 60, 28);
		panel9.add(qty8);
		
		JSpinner spinner9 = new JSpinner();
		spinner9.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				quantitynoodles = (int) spinner9.getValue();
		        pricenoodles = 80; 
		       noodles = quantitynoodles * pricenoodles;
		        updateTotal();
			}
		});
		spinner9.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		spinner9.setBounds(98, 122, 30, 20);
		panel9.add(spinner9);
		
		JCheckBox chckbx8 = new JCheckBox("purchase");
		chckbx8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if ((int)spinner9.getValue() == 0 && chckbx8.isSelected()) {
		            JOptionPane.showMessageDialog(null, "Please increase the quantity.");
		            chckbx8.setSelected(false); 
				
				}
			}
		});
		chckbx8.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		chckbx8.setBounds(10, 152, 108, 21);
		panel9.add(chckbx8);
		
		JPanel panel10 = new JPanel();
		panel10.setLayout(null);
		panel10.setBackground(Color.WHITE);
		panel10.setBounds(806, 320, 158, 183);
		frame.getContentPane().add(panel10);
		
		JLabel lblNewLabel_2_2_3_4 = new JLabel("waterbottle");
		lblNewLabel_2_2_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_3_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2_2_3_4.setBackground(Color.WHITE);
		lblNewLabel_2_2_3_4.setBounds(10, 41, 138, 37);
		panel10.add(lblNewLabel_2_2_3_4);
		
		JLabel lblNewLabel_3_2_3_4 = new JLabel("price");
		lblNewLabel_3_2_3_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3_2_3_4.setBounds(10, 88, 60, 28);
		panel10.add(lblNewLabel_3_2_3_4);
		
		txtrs_9 = new JTextField();
		txtrs_9.setText("30RS");
		txtrs_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtrs_9.setColumns(10);
		txtrs_9.setBounds(88, 94, 60, 19);
		panel10.add(txtrs_9);
		
		JLabel qty9 = new JLabel("Quantity");
		qty9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		qty9.setBounds(10, 116, 60, 28);
		panel10.add(qty9);
		
		JSpinner spinner = new JSpinner();
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				quantitywaterbottle = (int) spinner.getValue();
		        pricewaterbottle= 30; 
		       waterbottle = quantitywaterbottle * pricewaterbottle;
		     
		        updateTotal();
		
			}
		});
		spinner.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		spinner.setBounds(98, 122, 30, 20);
		panel10.add(spinner);
		
		JCheckBox chckbx9 = new JCheckBox("purchase");
		chckbx9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if ((int)spinner.getValue() == 0 && chckbx9.isSelected()) {
		            JOptionPane.showMessageDialog(null, "Please increase the quantity.");
		            chckbx9.setSelected(false); 
					
				}
			}
		});
		JButton btnNewButton = new JButton("ORDER");
		btnNewButton.setBounds(10, 10, 139, 46);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbx.isSelected()) {
					Briyani=250;
				}
				if(chckbx1.isSelected()) {
					butternaan=50;
				}
				if(chckbx2.isSelected()) {
					paneerbuttermasala=200;
				}
				if(chckbx3.isSelected()) {
					butterchicken=200;
				}
				if(chckbx4.isSelected()) {
					chickenbriyani=300;
				}
				if(chckbx5.isSelected()) {
					icecreams=100;
				}
				if(chckbx6.isSelected()) {
					pizza=120;
				}
				if(chckbx7.isSelected()) {
					manchurian=110;
				}
				if(chckbx8.isSelected()) {
					noodles=80;
				}
				if(chckbx9.isSelected()) {
					waterbottle=30;
				}      
				JOptionPane.showMessageDialog(frame,"Orderisconforming....");
				vender v= new vender(total);
				frame.setVisible(false);
			}
		});
		chckbx9.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		chckbx9.setBounds(10, 152, 108, 21);
		panel10.add(chckbx9);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
	
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(218, 10, 139, 46);
		panel.add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbx.setSelected(false);
				chckbx1.setSelected(false);
				chckbx2.setSelected(false);
				chckbx3.setSelected(false);
				chckbx4.setSelected(false);
				chckbx5.setSelected(false);
				chckbx6.setSelected(false);
				chckbx7.setSelected(false);
				chckbx8.setSelected(false);
				chckbx9.setSelected(false);
				spinner.setValue(0);
				spinner1.setValue(0);
				spinner2.setValue(0);
				spinner3.setValue(0);
				spinner4.setValue(0);
				spinner5.setValue(0);
				spinner6.setValue(0);
				spinner7.setValue(0);
				spinner8.setValue(0);
				spinner9.setValue(0);
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
	
		JButton btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnExit.setBounds(408, 10, 139, 46);
		panel.add(btnExit);
		

		

		frame.setVisible(true);
		
	}
	
	
}
