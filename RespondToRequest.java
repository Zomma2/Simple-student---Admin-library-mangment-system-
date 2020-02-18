package login_System;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RespondToRequest {

	private JFrame frame;
	static Bookself  bs ; 
	boolean approveRequest  ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RespondToRequest window = new RespondToRequest(bs);
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
	public RespondToRequest(Bookself bs) {
		RespondToRequest.bs = bs ; 
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox<String> currentRequestComboBox = new JComboBox<String>();
		currentRequestComboBox.setBounds(169, 45, 221, 20);
		frame.getContentPane().add(currentRequestComboBox);
		for(int i =0 ; i<Admin.requestBookList.size() ; i++)
		{
		currentRequestComboBox.addItem(Admin.requestBookList.get(i).name);
		}
		JLabel lblCurrentRequests = new JLabel("Current requests");
		lblCurrentRequests.setBounds(10, 48, 118, 14);
		frame.getContentPane().add(lblCurrentRequests);
		
		JButton btnNewButton = new JButton("Approve request");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					approveRequest= true ; 
					String requestBookName = (String) currentRequestComboBox.getSelectedItem() ; 
					RespondToRequestCntrlr c = new RespondToRequestCntrlr( requestBookName, approveRequest) ; 
					
				new Admin (RespondToRequest.bs) ; 
				frame.dispose();
			
		
			}
		
		catch(Exception exp) {
			

		}
			
			}
		});
		btnNewButton.setBounds(10, 106, 164, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Deny request");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					approveRequest= false  ; 
					String requestBookName = (String) currentRequestComboBox.getSelectedItem() ; 
					RespondToRequestCntrlr c = new RespondToRequestCntrlr( requestBookName, approveRequest) ; 
					
				new Admin (RespondToRequest.bs) ; 
				frame.dispose();
			
		
			}
		
		catch(Exception exp) {
			

		}
				
				
			}
		});
		btnNewButton_1.setBounds(228, 106, 179, 40);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(10, 157, 397, 23);
		frame.getContentPane().add(btnBack);
	}
}
