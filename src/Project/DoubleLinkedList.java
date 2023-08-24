package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DoubleLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField Rear;
	private JTextField Front;
	private JTextField display;
	class Node
	{
		Node prelink;
		int data;
		Node nextlink;
	}
	Node first;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoubleLinkedList frame = new DoubleLinkedList();
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
	public DoubleLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Double = new JLabel(" DOUBLE LINKED LIST DATA STRUCTURE");
		Double.setFont(new Font("Tahoma", Font.BOLD, 14));
		Double.setBounds(78, 11, 291, 17);
		contentPane.add(Double);
		
		JLabel Enterelement = new JLabel("ENTER THE  ELEMENT REAR");
		Enterelement.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Enterelement.setBounds(10, 53, 157, 15);
		contentPane.add(Enterelement);
		
		Rear = new JTextField();
		Rear.setBounds(176, 51, 86, 20);
		contentPane.add(Rear);
		Rear.setColumns(10);
		
		JButton RearButton = new JButton("INSERT REAR");
		RearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				int elem = Integer.valueOf(Rear.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.prelink = null;
				newnode.nextlink = null;
				if (first == null)
				{
					first = newnode;
				}
				else
				{
					temp = first;
					while(temp.nextlink != null)
					{
						temp = temp.nextlink;
					}
					temp.nextlink = newnode;
					temp.prelink = temp;
				}
			
				JOptionPane.showMessageDialog(contentPane, "Insertion at rear is Succesfull");
				Rear.setText("");
			}
		});
		RearButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		RearButton.setBounds(299, 50, 107, 23);
		contentPane.add(RearButton);
		
		JButton FrontButton = new JButton("INSERT FRONT");
		FrontButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem = Integer.valueOf(Front.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.prelink = null;
				newnode.nextlink = null;
				if (first == null)
				{
					first = newnode;
				}
				else
				{
					newnode.nextlink = first;
					first.prelink = newnode;
					first = newnode;
				}
				
				JOptionPane.showMessageDialog(contentPane, "Insertion at front Succesfull");
				Front.setText("");
			}
		});
		FrontButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		FrontButton.setBounds(299, 84, 115, 23);
		contentPane.add(FrontButton);
		
		Front = new JTextField();
		Front.setBounds(176, 86, 86, 20);
		contentPane.add(Front);
		Front.setColumns(10);
		
		JLabel Elementfront = new JLabel("ENTER THE ELEMENT FRONT");
		Elementfront.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Elementfront.setBounds(5, 88, 162, 15);
		contentPane.add(Elementfront);
		
		JButton Deleterear = new JButton("DELETE REAR");
		Deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
			if (first ==  null)
			{
				JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
			}
			else if(first.nextlink == null)
			{
				JOptionPane.showMessageDialog(contentPane, " Element deleted is " + first.data);
				first = null;
			}
			else
			{
				temp = first;
				while(temp.nextlink.nextlink!=null)
				{
					temp = temp.nextlink;
				}
				JOptionPane.showMessageDialog(contentPane, " Element deleted is " + temp.nextlink.data);
				temp.nextlink = null;
			}
			}
		});
		Deleterear.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Deleterear.setBounds(176, 130, 109, 23);
		contentPane.add(Deleterear);
		
		JButton Deletefront = new JButton("DELETE FRONT");
		Deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
				}
				else if(first.nextlink == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element Deleted is" + first.data);
					first = null;
				}
				else
				{
					first = first.nextlink;
					first.prelink = null;
					JOptionPane.showMessageDialog(contentPane, " Element deleted is " + first.nextlink.data);
				}

			}
		});
		Deletefront.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Deletefront.setBounds(173, 164, 117, 23);
		contentPane.add(Deletefront);
		
		JButton Display = new JButton("DISPLAY");
		Display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				String msg = "";
				if (first == null)
				{
					JOptionPane.showMessageDialog(contentPane, " Display Not Possible");
				}
				else if( first.nextlink == null)
				{
					JOptionPane.showMessageDialog(contentPane, first.data);
				}
				else 
				{
					temp = first;
					while(temp!=null)
					{
						msg = msg + " " +temp.data;
						temp = temp.nextlink;
					}
					display.setText(msg);
					//display.setText("");
				}
			}
		});
		Display.setBounds(317, 201, 73, 23);
		contentPane.add(Display);
		
		display = new JTextField();
		display.setBounds(10, 202, 291, 20);
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
		homebutton.setBounds(10, 10, 65, 23);
		contentPane.add(homebutton);
	}

}
