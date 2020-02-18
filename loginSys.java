package login_System;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.*;
public class loginSys {
	Bookself  bs = new Bookself() ; 
	private JFrame frame;
	private JTextField txtPleaseEnterYour;
	private JPasswordField passwordField;
	static ArrayList<Book> studentRentedBook ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginSys window = new loginSys();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	
	
	
	
	}

	
    private  void createAndShowGUI() {
    	new Student(Student.bs) ;
    	frame.dispose();
    }
	
    private  void createAndShowGUIAdmin() {
        new Admin(Admin.bs);
    	frame.dispose();
    }
	
	
	/**
	 * Create the application.
	 */
	public loginSys() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Login window");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsername.setBounds(10, 82, 103, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(10, 143, 90, 14);
		frame.getContentPane().add(lblPassword);
		
		txtPleaseEnterYour = new JTextField();
		txtPleaseEnterYour.setText("Please enter your username here");
		txtPleaseEnterYour.setBounds(136, 81, 235, 20);
		frame.getContentPane().add(txtPleaseEnterYour);
		txtPleaseEnterYour.setColumns(10);
	
		passwordField = new JPasswordField("");
		passwordField.setToolTipText("");
		passwordField.setEchoChar('*');
		passwordField.setBounds(136, 142, 235, 20);
		frame.getContentPane().add(passwordField);
		
		
		JButton btnLoginAsStudent = new JButton("Login as student");
		btnLoginAsStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		        SwingUtilities.invokeLater(new Runnable() {
		            public void run() {
		                createAndShowGUI();
		            }
		        });
		    }
		
		});
		btnLoginAsStudent.setBounds(10, 198, 170, 38);
		frame.getContentPane().add(btnLoginAsStudent);
		
		JButton btnLoginAsAdmin = new JButton("Login as Admin");
		btnLoginAsAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  SwingUtilities.invokeLater(new Runnable() {
			            public void run() {
			                createAndShowGUIAdmin();
			            }
			        });
				
			}
		});
		btnLoginAsAdmin.setBounds(237, 198, 170, 38);
		frame.getContentPane().add(btnLoginAsAdmin);
		
		JLabel lblLogin = new JLabel("Login ");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblLogin.setBounds(104, 11, 219, 38);
		frame.getContentPane().add(lblLogin);
	
		
		
		
	}



}
