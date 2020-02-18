package login_System;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;

public class SearchBook {
	private JFrame frame;
	private JTextField bookName;
	private JTextField Author;
	private JTextField noOfPages;
	private JTextField Language;
	private JTextField Category;
	static Bookself  bs ; 
	private JTextField SearchBookName;
	static int returnFromSearch ; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchBook window = new SearchBook(bs,returnFromSearch);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param returnFromSearch 
	 */
	public SearchBook(Bookself bs, int returnFromSearch) {
		SearchBook.bs = bs ;
		SearchBook.returnFromSearch = returnFromSearch ;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 478);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBookName = new JLabel("Book name");
		lblBookName.setBounds(25, 203, 105, 16);
		frame.getContentPane().add(lblBookName);
		
		JLabel lblBookAuthor = new JLabel("Book author");
		lblBookAuthor.setBounds(25, 240, 105, 16);
		frame.getContentPane().add(lblBookAuthor);
		
		JLabel lblNumberOfPages = new JLabel("Number of pages");
		lblNumberOfPages.setBounds(25, 280, 122, 16);
		frame.getContentPane().add(lblNumberOfPages);
		
		JLabel lblLanguage = new JLabel("Language");
		lblLanguage.setBounds(25, 324, 105, 16);
		frame.getContentPane().add(lblLanguage);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setBounds(25, 375, 105, 16);
		frame.getContentPane().add(lblCategory);
		
		bookName = new JTextField();
		bookName.setEditable(false);
		bookName.setBounds(123, 198, 304, 26);
		frame.getContentPane().add(bookName);
		bookName.setColumns(10);
		
		Author = new JTextField();
		Author.setEditable(false);
		Author.setColumns(10);
		Author.setBounds(175, 235, 252, 26);
		frame.getContentPane().add(Author);
		
		noOfPages = new JTextField();
		noOfPages.setEditable(false);
		noOfPages.setColumns(10);
		noOfPages.setBounds(175, 275, 252, 26);
		frame.getContentPane().add(noOfPages);
		
		Language = new JTextField();
		Language.setEditable(false);
		Language.setColumns(10);
		Language.setBounds(175, 319, 252, 26);
		frame.getContentPane().add(Language);
		
		Category = new JTextField();
		Category.setEditable(false);
		Category.setColumns(10);
		Category.setBounds(175, 370, 252, 26);
		frame.getContentPane().add(Category);
		
		JButton btnConfirm = new JButton("Back");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (SearchBook.returnFromSearch==0)
					{new Admin(bs) ; 
					frame.dispose(); 
					}
					if (SearchBook.returnFromSearch==1)
					{
					new Student(bs) ; 
					frame.dispose(); 
					}
				
				
				}
		catch(Exception exp) {
			

		}
				
		
			}
		});
		btnConfirm.setBounds(175, 421, 117, 29);
		frame.getContentPane().add(btnConfirm);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 184, 463, 12);
		frame.getContentPane().add(separator);
		
		JLabel SearchBookNametxt = new JLabel("Book name");
		SearchBookNametxt.setBounds(25, 45, 105, 16);
		frame.getContentPane().add(SearchBookNametxt);
		
		SearchBookName = new JTextField();
		SearchBookName.setColumns(10);
		SearchBookName.setBounds(175, 40, 252, 26);
		frame.getContentPane().add(SearchBookName);
		
		JButton btnSearchBook = new JButton("Search Book");
		btnSearchBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if( SearchBookNametxt.getText() != "" )
			{	
				SearchBookCntrlr c = new SearchBookCntrlr(bs, SearchBookName.getText().trim()) ; 
				Book b = c.b ;
				bookName.setText(b.name);
				Author.setText(b.author);
				noOfPages.setText(String.valueOf(b.numberOfPages)) ;
				Language.setText(b.language);
				Category.setText(b.BookCategory);
				}
				else {
					
				}	
				
		}
		catch(Exception exp) {
			

		}
				
		
			}
		});
		btnSearchBook.setBounds(94, 110, 291, 29);
		frame.getContentPane().add(btnSearchBook);
	}
}
