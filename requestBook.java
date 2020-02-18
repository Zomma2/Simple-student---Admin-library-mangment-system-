package login_System;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class requestBook {

	private JFrame frame;
	private JTextField BookText;
	private JTextField authorText;
	private JTextField categoryTxt;
	private JTextField languagetxt;
	static Bookself  bs ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					requestBook window = new requestBook(bs);
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
	public requestBook(Bookself bs) {
	requestBook.bs = bs ; 
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
		lblBookName.setBounds(22, 90, 104, 14);
		frame.getContentPane().add(lblBookName);
		
		JButton btnRequestBook = new JButton("Request Book");
		btnRequestBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String requestedBookname = BookText.getText().trim() ;
				String requestAuthorName = authorText.getText().trim() ; 
				String requestedCategory = categoryTxt.getText().trim() ; 
				String requestedLanguage = languagetxt.getText().trim() ; 
				RequestBookcntrlr c = new  RequestBookcntrlr( requestedBookname ,requestAuthorName ,  requestedCategory , requestedLanguage) ;
			
				new Student (bs) ; 
				frame.dispose();
			
				
				
			}
		});
		btnRequestBook.setBounds(10, 210, 211, 23);
		frame.getContentPane().add(btnRequestBook);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(251, 210, 173, 23);
		frame.getContentPane().add(btnBack);
		
		BookText = new JTextField();
		BookText.setBounds(150, 86, 274, 23);
		frame.getContentPane().add(BookText);
		BookText.setColumns(10);
		
		authorText = new JTextField();
		authorText.setBounds(150, 120, 274, 20);
		frame.getContentPane().add(authorText);
		authorText.setColumns(10);
		
		categoryTxt = new JTextField();
		categoryTxt.setBounds(150, 146, 274, 20);
		frame.getContentPane().add(categoryTxt);
		categoryTxt.setColumns(10);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setBounds(22, 118, 46, 14);
		frame.getContentPane().add(lblAuthor);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setBounds(22, 149, 46, 14);
		frame.getContentPane().add(lblCategory);
		
		JLabel lblPerferedLanguage = new JLabel("Perfered Language");
		lblPerferedLanguage.setBounds(10, 185, 104, 14);
		frame.getContentPane().add(lblPerferedLanguage);
		
		languagetxt = new JTextField();
		languagetxt.setBounds(150, 177, 274, 20);
		frame.getContentPane().add(languagetxt);
		languagetxt.setColumns(10);
	}
}
