import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.protocol.Resultset;

import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Panel;
import java.sql.*;

public class AddStaff extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField txt5;
	private JTextField txt6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStaff frame = new AddStaff();
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
	public AddStaff() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(160, 40, 1060, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		ButtonGroup bg=new ButtonGroup();
 
 JButton bck = new JButton("Back");
 bck.setFont(new Font("Yu Gothic Light", Font.BOLD, 15));
 bck.setBackground(Color.WHITE);
 bck.addActionListener(new ActionListener() {
 	public void actionPerformed(ActionEvent e) {
 		Add op=new Add();
 		op.setVisible(true);
 		setVisible(false);
 	}
 });
 bck.setBounds(20, 11, 55, 23);
 bck.setBorder(null);
 bck.setLayout(null);
 contentPane.add(bck);
 
 Panel panel = new Panel();
 panel.setBackground(Color.WHITE);
 panel.setBounds(60, 105, 359, 411);
 contentPane.add(panel);
 panel.setLayout(null);
 
 JLabel l_name = new JLabel("Name");
 l_name.setBounds(10, 11, 125, 30);
 panel.add(l_name);
 l_name.setFont(new Font("Yu Gothic Light", Font.BOLD, 23));
 
 txt1 = new JTextField();
 txt1.setBounds(217, 19, 117, 23);
 panel.add(txt1);
 txt1.setColumns(10);
 
 JLabel l_age = new JLabel("Id");
 l_age.setBounds(10, 52, 125, 30);
 panel.add(l_age);
 l_age.setFont(new Font("Yu Gothic Light", Font.BOLD, 23));
 
 JLabel lblDate = new JLabel("Joining Date");
 lblDate.setBounds(10, 93, 145, 30);
 panel.add(lblDate);
 lblDate.setFont(new Font("Yu Gothic Light", Font.BOLD, 23));
 
 JLabel lblAge = new JLabel("Age");
 lblAge.setBounds(10, 129, 125, 30);
 panel.add(lblAge);
 lblAge.setFont(new Font("Yu Gothic Light", Font.BOLD, 23));
 
 JLabel lblGender = new JLabel("Gender");
 lblGender.setBounds(10, 170, 125, 30);
 panel.add(lblGender);
 lblGender.setFont(new Font("Yu Gothic Light", Font.BOLD, 23));
 
 JLabel lblAppointmentDate = new JLabel("Department");
 lblAppointmentDate.setBounds(10, 211, 210, 30);
 panel.add(lblAppointmentDate);
 lblAppointmentDate.setFont(new Font("Yu Gothic Light", Font.BOLD, 22));
 
 JLabel lblPhoneNo = new JLabel("Phone no");
 lblPhoneNo.setBounds(10, 252, 158, 30);
 panel.add(lblPhoneNo);
 lblPhoneNo.setFont(new Font("Yu Gothic Light", Font.BOLD, 23));
 
 txt2 = new JTextField();
 txt2.setBounds(217, 53, 117, 23);
 panel.add(txt2);
 txt2.setColumns(10);
 
 txt3 = new JTextField();
 txt3.setBounds(217, 93, 117, 23);
 panel.add(txt3);
 txt3.setColumns(10);
 
 txt4 = new JTextField();
 txt4.setBounds(217, 137, 117, 23);
 panel.add(txt4);
 txt4.setColumns(10);
 
 JRadioButton rb1 = new JRadioButton("Male");
 rb1.setBackground(Color.WHITE);
 rb1.setBounds(187, 177, 66, 23);
 panel.add(rb1);
 rb1.setFont(new Font("Yu Gothic Light", Font.BOLD, 15));
 bg.add(rb1); 
 
 JRadioButton rb2 = new JRadioButton("Female");
 rb2.setBackground(Color.WHITE);
 rb2.setBounds(255, 177, 79, 23);
 panel.add(rb2);
 rb2.setFont(new Font("Yu Gothic Light", Font.BOLD, 15));
 bg.add(rb2);
 
 txt5 = new JTextField();
 txt5.setBounds(217, 218, 117, 23);
 panel.add(txt5);
 txt5.setColumns(10);
 
 txt6 = new JTextField();
 txt6.setBounds(217, 260, 117, 23);
 panel.add(txt6);
 txt6.setColumns(10);
 
 JButton bt1 = new JButton("Register");
 bt1.setBounds(10, 312, 145, 37);
 panel.add(bt1);
 bt1.setBackground(Color.WHITE);
 bt1.addActionListener(new ActionListener() {
 	public void actionPerformed(ActionEvent e) {
 		String name=txt1.getText().trim();
 		int id=Integer.parseInt(txt2.getText());
 		String joining_date=txt3.getText().trim();
 		int age=Integer.parseInt(txt4.getText());
 		String gender="";
 		if(rb1.isSelected()==true)
 		{
 			gender="male";
 		}
 		else if(rb2.isSelected()==true)
 		{
 			gender="female";
 		}
 		String department=txt5.getText().trim();
 		String phone_no=txt6.getText().trim();
 		try{
 			Class.forName("com.mysql.jdbc.Driver");  
 			Connection con=DriverManager.getConnection(  
 			"jdbc:mysql://localhost:3306/Database2k19","root","root");  
 			//here sonoo is database name, root is username and password  
 			Statement stmt=con.createStatement();  
 			String sql= "insert into staff values("+id+","+"'"+name+"',"+"'"+joining_date+"',"+age+","+"'"+gender+"',"+"'"+department+"','"+phone_no+"'"+");";
 		   stmt.executeUpdate(sql);
 		  JOptionPane.showMessageDialog(null,"Added Successfully");
 			}
 				catch(Exception z)
 		{ 
 					JOptionPane.showMessageDialog(null,z.getMessage());
 			}  
 			}  
 			});
 bt1.setFont(new Font("Yu Gothic Light", Font.BOLD, 25));
 bt1.setBorder(null);
 
 JButton bt2 = new JButton("Reset");
 bt2.setBounds(189, 312, 145, 37);
 panel.add(bt2);
 bt2.setBackground(Color.WHITE);
 bt2.addActionListener(new ActionListener() {
 	public void actionPerformed(ActionEvent e) {
 		txt1.setText("");
 		txt2.setText("");
 		txt3.setText("");
 		txt4.setText("");
 		txt5.setText("");
 		txt6.setText("");
 		txt5.setText("");
 		txt6.setText("");
 	}
 });
 bt2.setFont(new Font("Yu Gothic Light", Font.BOLD, 25));
 bt2.setBorder(null);
 bt2.setLayout(null);
 
 JLabel lpic = new JLabel("");
 lpic.setBounds(20, 0, 1040, 700);
 Image imgg = new ImageIcon(this.getClass().getResource("/pa.jpg")).getImage();
 lpic.setIcon(new ImageIcon(imgg));
 contentPane.add(lpic);
 
	}
}
