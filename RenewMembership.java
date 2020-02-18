package login_System;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RenewMembership {

	private JFrame frame;
	private JTextField priceTextField;
	static	Bookself bs ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RenewMembership window = new RenewMembership(bs);
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
	public RenewMembership(Bookself bs) {
		RenewMembership.bs = bs ; 
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
		
		JLabel lblRenewFor = new JLabel("Renew for :");
		lblRenewFor.setBounds(10, 66, 88, 14);
		frame.getContentPane().add(lblRenewFor);
		
		JComboBox<Integer> renewBox = new JComboBox<Integer>();
		renewBox.setBounds(108, 63, 121, 20);
		frame.getContentPane().add(renewBox);
		for(int i =1 ; i< 24 ; i+=3 )
		{
			renewBox.addItem(i);
			
		}
		
		JLabel lblMonths = new JLabel("Month(s)");
		lblMonths.setBounds(266, 66, 46, 14);
		frame.getContentPane().add(lblMonths);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = priceTextField.getText();
				RenewMembershipcntrlr c = new RenewMembershipcntrlr(temp); 
				
				
				JOptionPane.showMessageDialog(null, "You have "+ Student.noOFMonth + " membership month(s)");
				new Student(bs);
				frame.dispose(); 
			
			
			}
		});
		btnConfirm.setBounds(215, 203, 140, 23);
		frame.getContentPane().add(btnConfirm);
		
		JLabel lblPrice = new JLabel("Price : ");
		lblPrice.setBounds(10, 123, 63, 14);
		frame.getContentPane().add(lblPrice);
		
		priceTextField = new JTextField();
		priceTextField.setBounds(112, 120, 133, 20);
		frame.getContentPane().add(priceTextField);
		priceTextField.setColumns(10);

		
		JLabel lblEgp = new JLabel("EGP");
		lblEgp.setBounds(266, 123, 46, 14);
		frame.getContentPane().add(lblEgp);
		
		JButton btnCalculatePrice = new JButton("Calculate Price");
		btnCalculatePrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = (int) renewBox.getSelectedItem() ;
				priceTextField.setText(Integer.toString(x*50));
			}
		});
		btnCalculatePrice.setBounds(44, 203, 140, 23);
		frame.getContentPane().add(btnCalculatePrice);
	}

}
