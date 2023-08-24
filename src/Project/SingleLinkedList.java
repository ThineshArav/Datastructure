package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SingleLinkedList<Node> extends JFrame {

	private JPanel contentPane;
	private JTextField Rear;
	private JTextField Front;
	private JTextField display;
class Node
	
	{
		int data;
		Node link;
	}
	private Node first;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SingleLinkedList frame = new SingleLinkedList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SingleLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Singlelist = new JLabel("SINGLE LINKED LIST DATA STRUCTURE");
		Singlelist.setForeground(new Color(0, 128, 0));
		Singlelist.setBackground(new Color(0, 0, 0));
		Singlelist.setFont(new Font("Tahoma", Font.BOLD, 14));
		Singlelist.setBounds(86, 11, 283, 17);
		contentPane.add(Singlelist);
		
		JLabel Enter = new JLabel("ENTER THE ELEMENT REAR");
		Enter.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Enter.setBounds(10, 46, 153, 15);
		contentPane.add(Enter);
		
		JLabel Enterfront = new JLabel("ENTER THE ELEMENT FRONT");
		Enterfront.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Enterfront.setBounds(10, 90, 162, 15);
		contentPane.add(Enterfront);
		
		Rear = new JTextField();
		Rear.setBounds(203, 44, 86, 20);
		contentPane.add(Rear);
		Rear.setColumns(10);
		
		Front = new JTextField();
		Front.setBounds(199, 88, 86, 20);
		contentPane.add(Front);
		Front.setColumns(10);
		
		JButton RearButton = new JButton("INSERT REAR");
		RearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
			int elem= Integer.valueOf(Rear.getText());
			 Node newnode=new Node();
			 newnode.data=elem;
			 newnode.link=null;
			
			if(first==null)
			 {
				 first=newnode;
			 }
			 else
				{
					temp=first;
					while(temp.link!=null)
					{
						temp=temp.link;
					}
					temp.link=newnode;
				}
			JOptionPane.showMessageDialog(contentPane, "insert rear Succesfull");
			Rear.setText("");
			}
		});
		RearButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		RearButton.setBounds(317, 42, 107, 23);
		contentPane.add(RearButton);
		
		JButton FrontButton = new JButton("INSERT FRONT");
		FrontButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem = Integer.valueOf(Front.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link = null;
				if(first == null)
				{
					first = newnode;
				}
				else
				{
					newnode.link = first;
					first = newnode;
				}
				JOptionPane.showMessageDialog(contentPane, "insert Front Succesfull");
				Front.setText("");
			}
		});
		FrontButton.setBackground(new Color(192, 192, 192));
		FrontButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		FrontButton.setBounds(309, 86, 115, 23);
		contentPane.add(FrontButton);
		
		JButton DeleteRear = new JButton("DELETE REAR");
		DeleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
				}
				else if(first.link==null)
				{
					JOptionPane.showConfirmDialog(contentPane, "element deleted is" + first.data);
					first = null;
				}
				else
				{
					temp = first;
					while(temp.link.link!=null)
					{
						temp = temp.link;
					}
					JOptionPane.showConfirmDialog(contentPane, " element deleted is" + temp.link.data);
					temp.link = null;
				}
			}
		});
		DeleteRear.setFont(new Font("Tahoma", Font.PLAIN, 12));
		DeleteRear.setBounds(309, 120, 109, 23);
		contentPane.add(DeleteRear);
		
		JButton DeleteFront = new JButton("DELETE FRONT");
		DeleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "deletion is not possible");
				}
				else if(first.link == null)
				{
					JOptionPane.showConfirmDialog(contentPane, "element deleted is" + first.data);
					first = null;
				}
				else
				{
					JOptionPane.showConfirmDialog(contentPane, "element deleted is " + first.data);
					first = first.link;
				}
			}
		});
		DeleteFront.setFont(new Font("Tahoma", Font.PLAIN, 12));
		DeleteFront.setBounds(309, 154, 117, 23);
		contentPane.add(DeleteFront);
		
		JButton Display = new JButton("DISPLAY");
		Display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				String msg = "";
				if(first ==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display Not Possible");
					//JOptionPane.showConfirmDialog(contentPane, "Display Not Possible");
				}
				
				else if (first.link == null)
				{
					//JOptionPane.showInternalMessageDialog(contentPane, first.data);
					JOptionPane.showMessageDialog(contentPane, first.data);
					//JOptionPane.showConfirmDialog(contentPane, first.data);
				}
				else
				{
					temp = first;
					while (temp !=null)
					{
						msg = msg + " " +temp.data;
						temp = temp.link;
					}
					display.setText(msg);
				}

			}
		});
		Display.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Display.setBounds(327, 203, 81, 23);
		contentPane.add(Display);
		
		display = new JTextField();
		display.setBounds(29, 205, 260, 20);
		contentPane.add(display);
		display.setColumns(10);
		
		JButton homebutton = new JButton("HOME");
		homebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Home().setVisible(true);
				dispose();
			}
		});
		homebutton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		homebutton.setBounds(0, 10, 65, 23);
		contentPane.add(homebutton);
	}

}
