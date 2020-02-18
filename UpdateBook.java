package login_System;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;

public class UpdateBook {


	private JFrame frame;
	private JTextField bookName;
	private JTextField Author;
	private JTextField noOfPages;
	private JTextField Language;
	private JTextField Category;
	static Bookself  bs ; 
	private JButton btnBack;
	private JSeparator separator;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateBook window = new UpdateBook(bs);
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
	public UpdateBook(Bookself bs) {
		UpdateBook.bs = bs ;
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
		lblBookName.setBounds(25, 25, 105, 16);
		frame.getContentPane().add(lblBookName);
		
		JLabel lblBookAuthor = new JLabel("New book author");
		lblBookAuthor.setBounds(25, 67, 138, 16);
		frame.getContentPane().add(lblBookAuthor);
		
		JLabel lblNumberOfPages = new JLabel("New Number of pages");
		lblNumberOfPages.setBounds(25, 114, 146, 16);
		frame.getContentPane().add(lblNumberOfPages);
		
		JLabel lblLanguage = new JLabel("New Language");
		lblLanguage.setBounds(25, 158, 105, 16);
		frame.getContentPane().add(lblLanguage);
		
		JLabel lblCategory = new JLabel("New Category");
		lblCategory.setBounds(25, 197, 105, 16);
		frame.getContentPane().add(lblCategory);
		
		bookName = new JTextField();
		bookName.setBounds(175, 20, 252, 26);
		frame.getContentPane().add(bookName);
		bookName.setColumns(10);
		
		Author = new JTextField();
		Author.setColumns(10);
		Author.setBounds(175, 62, 252, 26);
		frame.getContentPane().add(Author);
		
		noOfPages = new JTextField();
		noOfPages.setColumns(10);
		noOfPages.setBounds(175, 109, 252, 26);
		frame.getContentPane().add(noOfPages);
		
		Language = new JTextField();
		Language.setColumns(10);
		Language.setBounds(175, 153, 252, 26);
		frame.getContentPane().add(Language);
		
		Category = new JTextField();
		Category.setColumns(10);
		Category.setBounds(175, 192, 252, 26);
		frame.getContentPane().add(Category);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if( bookName.getText() != "" &&  noOfPages.getText() != "" &&Author.getText() != "" && Category.getText() != "" && Language.getText() != "")
			{	Book b = new Book(bookName.getText(),Integer.parseInt(noOfPages.getText()), Author.getText(), Category.getText(), Language.getText()) ; 
				UpdateBookcntrlr c = new UpdateBookcntrlr(bs, b) ; 
				new Admin (bs) ; 
				frame.dispose();
			
				}
				else {
					
				}	
				
		}
		catch(Exception exp) {
			

		}
				
		
			}
		});
		btnConfirm.setBounds(175, 230, 117, 29);
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
		btnBack.setBounds(310, 230, 117, 29);
		frame.getContentPane().add(btnBack);
		
		separator = new JSeparator();
		separator.setBounds(6, 47, 438, 12);
		frame.getContentPane().add(separator);
	}
}
