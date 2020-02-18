package login_System;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class RentBook {

	private JFrame frame;
	static	Bookself bs ;
	JComboBox<String> avaBooks ; 
	 ArrayList<Book> studentRentedBook=Student.studentRentedBook ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RentBook window = new RentBook(bs);
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
	public RentBook(Bookself bs) {
		RentBook.bs = bs ; 
		
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
		
		JLabel lblBookName = new JLabel("Book name");
		lblBookName.setBounds(43, 25, 79, 14);
		frame.getContentPane().add(lblBookName);
		
		JButton btnRentBook = new JButton("Rent Book");
		btnRentBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				RentBookCntrlr c = new RentBookCntrlr(RentBook.bs, (String) avaBooks.getSelectedItem(), studentRentedBook);
				Student.studentRentedBook = studentRentedBook ; 
				new Student (bs); 
				frame.dispose(); 
			
			
			
			}
		});
		btnRentBook.setBounds(148, 184, 89, 23);
		frame.getContentPane().add(btnRentBook);
		
		avaBooks = new JComboBox<String>();
		avaBooks.setBounds(132, 22, 205, 20);
		frame.getContentPane().add(avaBooks);
		for (Book book : 	RentBook.bs.bookArrayList)
		{
			avaBooks.addItem(book.name);
		}
	
	}
}
