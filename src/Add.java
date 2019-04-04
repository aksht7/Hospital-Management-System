import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Add extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add frame = new Add();
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
	public Add() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(160, 40, 1065, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("");
		lbl1.setForeground(new Color(255, 255, 255));
		lbl1.setBackground(new Color(192, 192, 192));
		lbl1.setBounds(0, 0, 1083, 700);
		Image imgg = new ImageIcon(this.getClass().getResource("/hospital.jpg")).getImage();
		lbl1.setIcon(new ImageIcon(imgg));
		contentPane.add(lbl1);
		
		JButton admin = new JButton("Add Staff");
		admin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStaff open=new AddStaff();
				open.setVisible(true);
				setVisible(false);
			}
		});
		admin.setBackground(Color.LIGHT_GRAY);
		admin.setFont(new Font("Yu Gothic Light", Font.BOLD, 25));
		admin.setBounds(811, 143, 164, 46);
		admin.setLayout(null);
		admin.setBorder(null);
		contentPane.add(admin);
		
		JButton bill = new JButton("View Patient Details");
		bill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bill open=new Bill();
				open.setVisible(true);
				setVisible(false);
				
			}
		});
		bill.setBackground(Color.LIGHT_GRAY);
		bill.setFont(new Font("Yu Gothic Light", Font.BOLD, 24));
		bill.setBounds(811, 235, 254, 46);
		bill.setLayout(null);
		bill.setBorder(null);
		contentPane.add(bill);
		
		JButton patient = new JButton("View Bill Details");
		patient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Patient open=new Patient();
				open.setVisible(true);
				setVisible(false);
			}
		});
		patient.setBackground(Color.LIGHT_GRAY);
		patient.setFont(new Font("Yu Gothic Light", Font.BOLD, 25));
		patient.setBounds(811, 327, 244, 46);
		patient.setLayout(null);
		patient.setBorder(null);
		contentPane.add(patient);
		
		JButton cls = new JButton("back");
		cls.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First open=new First();
				open.setVisible(true);
				setVisible(false);
			}
		});
		cls.setFont(new Font("Yu Gothic Light", Font.BOLD, 20));
		cls.setBackground(Color.LIGHT_GRAY);
		cls.setBounds(967, 11, 83, 19);
		cls.setLayout(null);
		cls.setBorder(null);
		contentPane.add(cls);
	}
}
