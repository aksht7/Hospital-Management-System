import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.JCheckBox;
import java.awt.Scrollbar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JTextField;

public class Bill extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bill frame = new Bill();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Bill() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(160, 40, 1060, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(0, 191, 255));
		panel_1.setBounds(30, 190, 190, 399);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(0, 10, 131, 29);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Blood Test");
		lblNewLabel_1.setForeground(new Color(0, 191, 255));
		lblNewLabel_1.setBounds(10, 0, 109, 29);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 21));
		
		JCheckBox c1 = new JCheckBox("Calcium blood test");
		c1.setForeground(new Color(255, 255, 255));
		c1.setBackground(new Color(0, 191, 255));
		c1.setFont(new Font("Verdana", Font.BOLD, 12));
		c1.setBounds(6, 59, 147, 29);
		panel_1.add(c1);
		
		JCheckBox c2 = new JCheckBox("Sugar test");
		c2.setForeground(new Color(255, 255, 255));
		c2.setBackground(new Color(0, 191, 255));
		c2.setFont(new Font("Verdana", Font.BOLD, 12));
		c2.setBounds(6, 108, 137, 29);
		panel_1.add(c2);
		
		JCheckBox c3 = new JCheckBox("Lipid tests");
		c3.setForeground(new Color(255, 255, 255));
		c3.setBackground(new Color(0, 191, 255));
		c3.setFont(new Font("Verdana", Font.BOLD, 12));
		c3.setBounds(6, 157, 125, 29);
		panel_1.add(c3);
		
		JCheckBox c4 = new JCheckBox("Folate test");
		c4.setForeground(new Color(255, 255, 255));
		c4.setBackground(new Color(0, 191, 255));
		c4.setFont(new Font("Verdana", Font.BOLD, 12));
		c4.setBounds(6, 208, 125, 29);
		panel_1.add(c4);
		
		JCheckBox c5 = new JCheckBox("D-dimer test");
		c5.setForeground(new Color(255, 255, 255));
		c5.setBackground(new Color(0, 191, 255));
		c5.setFont(new Font("Verdana", Font.BOLD, 12));
		c5.setBounds(6, 258, 110, 29);
		panel_1.add(c5);
		
		Panel panel_3 = new Panel();
		panel_3.setBackground(new Color(0, 191, 255));
		panel_3.setLayout(null);
		panel_3.setBounds(295, 190, 190, 399);
		contentPane.add(panel_3);
		
		Panel panel_4 = new Panel();
		panel_4.setBackground(new Color(255, 255, 224));
		panel_4.setLayout(null);
		panel_4.setBounds(0, 10, 131, 29);
		panel_3.add(panel_4);
		
		JLabel lblPizza = new JLabel("Cardio");
		lblPizza.setForeground(new Color(0, 191, 255));
		lblPizza.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 21));
		lblPizza.setBounds(10, 0, 109, 29);
		panel_4.add(lblPizza);
		
		JCheckBox c6 = new JCheckBox("Chest X-ray");
		c6.setForeground(new Color(255, 255, 255));
		c6.setBackground(new Color(0, 191, 255));
		c6.setFont(new Font("Verdana", Font.BOLD, 12));
		c6.setBounds(6, 59, 125, 29);
		panel_3.add(c6);
		
		JCheckBox c7 = new JCheckBox("CT scan");
		c7.setForeground(new Color(255, 255, 255));
		c7.setBackground(new Color(0, 191, 255));
		c7.setFont(new Font("Verdana", Font.BOLD, 12));
		c7.setBounds(6, 108, 125, 29);
		panel_3.add(c7);
		
		JCheckBox c8 = new JCheckBox("Echocardiogram");
		c8.setForeground(new Color(255, 255, 255));
		c8.setBackground(new Color(0, 191, 255));
		c8.setFont(new Font("Verdana", Font.BOLD, 12));
		c8.setBounds(6, 157, 137, 29);
		panel_3.add(c8);
		
		JCheckBox c9 = new JCheckBox("MRI");
		c9.setForeground(new Color(255, 255, 255));
		c9.setBackground(new Color(0, 191, 255));
		c9.setFont(new Font("Verdana", Font.BOLD, 12));
		c9.setBounds(6, 208, 125, 29);
		panel_3.add(c9);
		
		JCheckBox c10 = new JCheckBox("Holter Moniter");
		c10.setForeground(new Color(255, 255, 255));
		c10.setBackground(new Color(0, 191, 255));
		c10.setFont(new Font("Verdana", Font.BOLD, 12));
		c10.setBounds(6, 258, 125, 29);
		panel_3.add(c10);
		
		Panel panel_5 = new Panel();
		panel_5.setBackground(new Color(0, 191, 255));
		panel_5.setLayout(null);
		panel_5.setBounds(563, 190, 190, 399);
		contentPane.add(panel_5);
		
		Panel panel_6 = new Panel();
		panel_6.setBackground(new Color(255, 255, 255));
		panel_6.setLayout(null);
		panel_6.setBounds(0, 10, 131, 29);
		panel_5.add(panel_6);
		
		JLabel lblSnacks = new JLabel("Ortho");
		lblSnacks.setForeground(new Color(0, 191, 255));
		lblSnacks.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 21));
		lblSnacks.setBounds(10, 0, 109, 29);
		panel_6.add(lblSnacks);
		
		JCheckBox c11 = new JCheckBox("Bone scan");
		c11.setBackground(new Color(0, 191, 255));
		c11.setForeground(new Color(255, 255, 255));
		c11.setFont(new Font("Verdana", Font.BOLD, 12));
		c11.setBounds(6, 59, 125, 29);
		panel_5.add(c11);
		
		JCheckBox c12 = new JCheckBox("X-Ray");
		c12.setBackground(new Color(0, 191, 255));
		c12.setForeground(new Color(255, 255, 255));
		c12.setFont(new Font("Verdana", Font.BOLD, 12));
		c12.setBounds(6, 108, 125, 29);
		panel_5.add(c12);
		
		JCheckBox c13 = new JCheckBox("Ultra-Sound");
		c13.setBackground(new Color(0, 191, 255));
		c13.setForeground(new Color(255, 255, 255));
		c13.setFont(new Font("Verdana", Font.BOLD, 12));
		c13.setBounds(6, 157, 138, 29);
		panel_5.add(c13);
		
		JCheckBox c14 = new JCheckBox("Electromyography");
		c14.setBackground(new Color(0, 191, 255));
		c14.setForeground(new Color(255, 255, 255));
		c14.setFont(new Font("Verdana", Font.BOLD, 12));
		c14.setBounds(6, 208, 145, 29);
		panel_5.add(c14);
		
		JCheckBox c15 = new JCheckBox("Venography");
		c15.setBackground(new Color(0, 191, 255));
		c15.setForeground(new Color(255, 255, 255));
		c15.setFont(new Font("Verdana", Font.BOLD, 12));
		c15.setBounds(6, 258, 110, 29);
		panel_5.add(c15);
		
		JButton bt = new JButton("Total");
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=0;
				int pid=Integer.parseInt(txt1.getText());
				String msg="";
				if(c1.isSelected())
				{
					a+=700;
				}
				if(c2.isSelected())
				{
					a+=69;
				}
				if(c3.isSelected())
				{
					a+=69;
				}
				if(c4.isSelected())
				{
					a+=100;
				}
				if(c5.isSelected())
				{
					a+=80;
				}
				if(c6.isSelected())
				{
					a+=150;
				}
				if(c7.isSelected())
				{
					a+=200;
				}
				if(c8.isSelected())
				{
					a+=150;
				}
				if(c9.isSelected())
				{
					a+=200;
				}
				if(c10.isSelected())
				{
					a+=200;
				}
				if(c11.isSelected())
				{
					a+=60;
				}
				if(c12.isSelected())
				{
					a+=100;
				}
				if(c13.isSelected())
				{
					a+=13;
				}
				if(c14.isSelected())
				{
					a+=60;
				}
				if(c15.isSelected())
				{
					a+=90;
				}
				JOptionPane.showMessageDialog(null,"Total Price:"+msg+a);
				try{
		 			Class.forName("com.mysql.jdbc.Driver");  
		 			Connection con=DriverManager.getConnection(  
		 			"jdbc:mysql://localhost:3306/Database2k19","root","root");  
		 			//here sonoo is database name, root is username and password  
		 			Statement stmt=con.createStatement();  
		 			String sql= "insert into bill values("+pid+","+a+");";
		 		   stmt.executeUpdate(sql);
		 		  JOptionPane.showMessageDialog(null,"Bill Information Saved Successfully");
		 			}
		 				catch(Exception z)
		 		{ 
		 					JOptionPane.showMessageDialog(null,z.getMessage());
		 			}  
			}
		});
		bt.setForeground(new Color(0, 191, 255));
		bt.setBackground(new Color(255, 255, 255));
		bt.setFont(new Font("Verdana", Font.BOLD, 22));
		bt.setBounds(771, 576, 211, 81);
		bt.setBorder(null);
		contentPane.add(bt);
		
		JButton bt2 = new JButton("Back");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				First open=new First();
				open.setVisible(true);
				setVisible(false);
				
			}
		});
		bt2.setForeground(new Color(0, 0, 0));
		bt2.setBackground(new Color(255, 255, 255));
		bt2.setFont(new Font("Yu Gothic Light", Font.BOLD, 15));
		bt2.setBounds(0, 11, 60, 27);
		bt2.setBorder(null);
		contentPane.add(bt2);
		
		JLabel lp = new JLabel("Patient ID");
		lp.setFont(new Font("Yu Gothic Light", Font.BOLD, 18));
		lp.setBounds(30, 80, 87, 27);
		contentPane.add(lp);
		
		txt1 = new JTextField();
		txt1.setBounds(141, 80, 148, 25);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		
	
	}
}
