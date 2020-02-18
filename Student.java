package login_System;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JSeparator;

public class Student {

	private JFrame frame;
	private JTextField txtLoggedInAs;
	private JTextField txtMembershipEndsIn;
	static Bookself  bs = new Bookself()  ;
	static ArrayList<Book> studentRentedBook = new ArrayList<Book>();
	int returnFromSearch = 1 ;
	public static int noOFMonth = 2 ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student window = new Student(bs);
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
	public Student ( Bookself  bs ) {
		Student.bs = bs ; 
		initialize();
		frame.setVisible(true);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Student Portal");
		frame.setType(Type.UTILITY);
		frame.setBounds(100, 100, 600, 646);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblStudentPortal = new JLabel("Student portal");
		lblStudentPortal.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblStudentPortal.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentPortal.setBounds(213, 11, 238, 39);
		frame.getContentPane().add(lblStudentPortal);
		
		JButton btnRentBook = new JButton("Rent book");
		btnRentBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  SwingUtilities.invokeLater(new Runnable() {
			            public void run() {
			            new RentBook(bs) ; 
			            frame.dispose();
			            }
			        });
			
			
			}
		});
		btnRentBook.setBounds(10, 202, 179, 23);
		frame.getContentPane().add(btnRentBook);
		
		JButton btnReturnBook = new JButton("Return book");
		btnReturnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  SwingUtilities.invokeLater(new Runnable() {
			            public void run() {
			            new ReturnBook(bs) ; 
			            frame.dispose();
			            }
			        });
			
			
			}
		});
		btnReturnBook.setBounds(10, 272, 179, 23);
		frame.getContentPane().add(btnReturnBook);
		
		JButton btnRenewMembership = new JButton("Renew membership");
		btnRenewMembership.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 SwingUtilities.invokeLater(new Runnable() {
			            public void run() {
			                new  RenewMembership(bs) ;
			                frame.dispose();
			            }
				  });  
				
				
			}
		});
			
			
		btnRenewMembership.setBounds(10, 307, 179, 23);
		frame.getContentPane().add(btnRenewMembership);
		
		JButton btnSearchBook = new JButton("Search book");
		btnSearchBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 SwingUtilities.invokeLater(new Runnable() {
			            public void run() {
			                new SearchBook(bs,returnFromSearch) ;
			                frame.dispose();
			            }
				  });  
				
				
			}
		});
		btnSearchBook.setBounds(10, 237, 179, 23);
		frame.getContentPane().add(btnSearchBook);
		
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
		btnLogout.setBounds(495, 554, 89, 23);
		frame.getContentPane().add(btnLogout);
		
		JButton btnRequestBook = new JButton("Request book");
		btnRequestBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 SwingUtilities.invokeLater(new Runnable() {
			            public void run() {
			                new requestBook(Student.bs) ;
			                frame.dispose();
			            }
				  });  
				
				
			}
		});
		btnRequestBook.setBounds(0, 554, 167, 23);
		frame.getContentPane().add(btnRequestBook);
		
		JLabel lblLookingForUnavilable = new JLabel("looking for unavilable book ?...request it ");
		lblLookingForUnavilable.setBounds(10, 529, 231, 14);
		frame.getContentPane().add(lblLookingForUnavilable);
		
		txtLoggedInAs = new JTextField();
		txtLoggedInAs.setEditable(false);
		txtLoggedInAs.setText("Logged in as , One");
		txtLoggedInAs.setBounds(10, 26, 140, 20);
		frame.getContentPane().add(txtLoggedInAs);
		txtLoggedInAs.setColumns(10);
		
		txtMembershipEndsIn = new JTextField();
		txtMembershipEndsIn.setForeground(Color.RED);
		txtMembershipEndsIn.setEditable(false);
		txtMembershipEndsIn.setText("MemberShip ends in" + "\n"+ noOFMonth + " month(s)");
		txtMembershipEndsIn.setBounds(10, 61, 214, 44);
		frame.getContentPane().add(txtMembershipEndsIn);
		txtMembershipEndsIn.setColumns(10);
		
		JTextArea txtrDsdasdasdad = new JTextArea();
		txtrDsdasdasdad.setEditable(false);
		txtrDsdasdasdad.setBounds(275, 75, 349, 275);
		frame.getContentPane().add(txtrDsdasdasdad);
		
		JLabel lblStudentBookMangment = new JLabel("Student book mangment options");
		lblStudentBookMangment.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		lblStudentBookMangment.setBounds(6, 140, 235, 16);
		frame.getContentPane().add(lblStudentBookMangment);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 168, 253, 12);
		frame.getContentPane().add(separator);
	
		if(studentRentedBook.size()!=0)
		{
		for (int i  =0 ; i<studentRentedBook.size() ; i++ )
		{
			txtrDsdasdasdad.append(studentRentedBook.get(i).name + "\n");
		}
		}
		else 
		{
			txtrDsdasdasdad.setText("NO CURRENTLY RENTED BOOKS");
		}
	
}
	}

