package login_System;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JSeparator;

public class Admin {
	 static Bookself  bs= new Bookself(); 
	private JFrame frame;
	
	 static ArrayList<Book> requestBookList = new ArrayList<Book>(); 
	 static ArrayList<Book> requestStatusList = new ArrayList<Book>(); 
	int returnFromSearch = 0 ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin window = new Admin(bs);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	  private  void createAndShowGUI() {
	        new loginSys();
	        frame.dispose();
	    }
	
	
	
	/**
	 * Create the application.
	 */
	public Admin(Bookself bss ) {
		Admin.bs = bss ;
		initialize();
		frame.setVisible(true);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Admin portal");
		frame.setBounds(100, 100, 715, 646);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAdminPortal = new JLabel("Admin portal ");
		lblAdminPortal.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblAdminPortal.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminPortal.setBounds(185, 11, 170, 38);
		frame.getContentPane().add(lblAdminPortal);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 SwingUtilities.invokeLater(new Runnable() {
			            public void run() {
			                createAndShowGUI();
			            }
			        });
				
			}
		});
		btnLogout.setBounds(296, 544, 119, 23);
		frame.getContentPane().add(btnLogout);
		
		JButton btnAddBook_1 = new JButton("Add book");
		btnAddBook_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 SwingUtilities.invokeLater(new Runnable() {
			            public void run() {
			                new AddNewBook (bs) ;
			                frame.dispose();
			            }
				  });       
			}
		});
		btnAddBook_1.setBounds(10, 178, 235, 29);
		frame.getContentPane().add(btnAddBook_1);
		

	
		
		JButton btnDeleteBook = new JButton("Delete book");
		btnDeleteBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				 SwingUtilities.invokeLater(new Runnable() {
			            public void run() {
			                new Deletebook(bs) ;
			                frame.dispose();
			            }
				  });  
			
			}
		});
		btnDeleteBook.setBounds(10, 219, 235, 29);
		frame.getContentPane().add(btnDeleteBook);
		
		JButton btnUpdateBook = new JButton("Update book");
		btnUpdateBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				 SwingUtilities.invokeLater(new Runnable() {
			            public void run() {
			                new UpdateBook(bs) ;
			                frame.dispose();
			            }
				  });  
			
			}
		});
		btnUpdateBook.setBounds(10, 260, 230, 29);
		frame.getContentPane().add(btnUpdateBook);
		
		JButton btnSearchBook = new JButton("Search book");
		btnSearchBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 SwingUtilities.invokeLater(new Runnable() {
			            public void run() {
			                new SearchBook(bs, returnFromSearch ) ;
			                frame.dispose();
			            }
				  });  
				
				
			}
		});
		btnSearchBook.setBounds(10, 301, 235, 29);
		frame.getContentPane().add(btnSearchBook);
	
		JTextArea bookTextArea = new JTextArea();
		bookTextArea.setEditable(false);
		JScrollPane scroll = new JScrollPane (bookTextArea );
		scroll.setBounds(274, 70, 420, 462);
		frame.getContentPane().add(scroll);
		
		JLabel lblBookMangmentOptions = new JLabel("Book mangment options");
		lblBookMangmentOptions.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		lblBookMangmentOptions.setBounds(21, 72, 200, 23);
		frame.getContentPane().add(lblBookMangmentOptions);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 121, 250, 12);
		frame.getContentPane().add(separator);
		
		JButton btnNewButton = new JButton("Respond to request");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 SwingUtilities.invokeLater(new Runnable() {
			            public void run() {
			                new RespondToRequest(Admin.bs) ;
			                frame.dispose();
			            }
				  });  
			
			}
		});
		btnNewButton.setBounds(10, 341, 235, 23);
		frame.getContentPane().add(btnNewButton);
		for(int i =0 ; i<bs.bookArrayList.size() ; i++ ) 
		{
			
			bookTextArea.append(Admin.bs.bookArrayList.get(i).name + "\t " + " : "+Admin.bs.bookArrayList.get(i).author+ "\n");
			
		}
		
		
		
		
		
		
	}
}
