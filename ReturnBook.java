package login_System;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ReturnBook {

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
					ReturnBook window = new ReturnBook(bs);
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
	public ReturnBook(Bookself bs) {
		ReturnBook.bs= bs ;
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
		lblBookName.setBounds(10, 25, 96, 29);
		frame.getContentPane().add(lblBookName);
		
		JButton btnRtrnBook = new JButton("Return Book");
		btnRtrnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				ReturnBookcntrlr c = new 	ReturnBookcntrlr(RentBook.bs, (String) avaBooks.getSelectedItem(), studentRentedBook);
				Student.studentRentedBook = studentRentedBook ; 
				new Student (bs); 
				frame.dispose(); 
			
			
			
			}
		});
		btnRtrnBook.setBounds(55, 146, 282, 61);
		frame.getContentPane().add(btnRtrnBook);
		
		avaBooks = new JComboBox<String>();
		avaBooks.setBounds(132, 22, 275, 32);
		frame.getContentPane().add(avaBooks);
		for (Book book : 	studentRentedBook)
		{
			avaBooks.addItem(book.name);
		}
	
	}
}
