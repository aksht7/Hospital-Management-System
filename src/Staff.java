import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Panel;

public class Staff extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Staff frame = new Staff();
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
	public Staff() {
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
 		First op=new First();
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
 panel.setBounds(60, 105, 359, 306);
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
 
 JLabel lblDate = new JLabel("Department");
 lblDate.setBounds(10, 93, 136, 30);
 panel.add(lblDate);
 lblDate.setFont(new Font("Yu Gothic Light", Font.BOLD, 23));
 
 txt2 = new JTextField();
 txt2.setBounds(217, 53, 117, 23);
 panel.add(txt2);
 txt2.setColumns(10);
 
 txt3 = new JTextField();
 txt3.setBounds(217, 93, 117, 23);
 panel.add(txt3);
 txt3.setColumns(10);
 
 JButton bt1 = new JButton("Register");
 bt1.setBounds(23, 230, 145, 37);
 panel.add(bt1);
 bt1.setBackground(Color.WHITE);
 bt1.addActionListener(new ActionListener() {
 	public void actionPerformed(ActionEvent e) {
 	}
 });
 bt1.setFont(new Font("Yu Gothic Light", Font.BOLD, 25));
 bt1.setBorder(null);
 
 JButton bt2 = new JButton("Reset");
 bt2.setBounds(189, 230, 145, 37);
 panel.add(bt2);
 bt2.setBackground(Color.WHITE);
 bt2.addActionListener(new ActionListener() {
 	public void actionPerformed(ActionEvent e) {
 		txt1.setText("");
 		txt2.setText("");
 		txt3.setText("");
 	
 	}
 });
 bt2.setFont(new Font("Yu Gothic Light", Font.BOLD, 25));
 bt2.setBorder(null);
 bt2.setLayout(null);
 
 JLabel lblDesignation = new JLabel("Designation");
 lblDesignation.setFont(new Font("Yu Gothic Light", Font.BOLD, 23));
 lblDesignation.setBounds(10, 147, 136, 30);
 panel.add(lblDesignation);
 
 JLabel lpic = new JLabel("");
 lpic.setBounds(20, 0, 1040, 700);
 Image imgg = new ImageIcon(this.getClass().getResource("/pa.jpg")).getImage();
 lpic.setIcon(new ImageIcon(imgg));
 contentPane.add(lpic);
 
	}
}
