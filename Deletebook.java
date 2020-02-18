package login_System;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Deletebook {
	

	private JFrame frame;
	private JTextField bookName;
	static Bookself  bs ; 
	private JButton btnBack;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deletebook window = new Deletebook(bs);
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
	public Deletebook(Bookself bs) {
		Deletebook.bs = bs ;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 181);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBookName = new JLabel("Book name");
		lblBookName.setBounds(25, 25, 105, 16);
		frame.getContentPane().add(lblBookName);
		
		bookName = new JTextField();
		bookName.setBounds(175, 20, 252, 26);
		frame.getContentPane().add(bookName);
		bookName.setColumns(10);
		
		
		
		
		
		
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if( bookName.getText() != "" )
					{		
						
						    	DeleteBookCntrlr c = new DeleteBookCntrlr(bs, bookName.getText().trim()) ;
						    
				
					}
						
						
				
				new Admin (bs) ; 
				frame.dispose();
			
		
			}
		
		catch(Exception exp) {
			

		}
				
		
			}
		});
		btnConfirm.setBounds(175, 89, 117, 29);
		frame.getContentPane().add(btnConfirm);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		
					new Admin(bs) ; 
					frame.dispose(); 
				
		}
		catch(Exception exp) {
			

		}
				
		
			}
		});
		btnBack.setBounds(175, 124, 117, 29);
		frame.getContentPane().add(btnBack);
	}
}



