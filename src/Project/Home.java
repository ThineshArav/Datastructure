package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 313);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 0));
		contentPane.setForeground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel CHOOSE = new JLabel("CHOOSE A DATASTRUCTURE");
		CHOOSE.setForeground(new Color(0, 0, 64));
		CHOOSE.setFont(new Font("Tahoma", Font.BOLD, 14));
		CHOOSE.setBounds(133, 11, 204, 17);
		contentPane.add(CHOOSE);
		
		JButton ARRAY = new JButton("ARRAY");
		ARRAY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Array a=new Array();
				//a.setVisible(true);
				new Array().setVisible(true);
				dispose();
			}
		});
		ARRAY.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ARRAY.setBounds(30, 60, 75, 25);
		contentPane.add(ARRAY);
		
		JButton STACK = new JButton("STACK");
		STACK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Stack().setVisible(true);
				dispose();
			}
			
		});
		STACK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		STACK.setBounds(30, 131, 73, 25);
		contentPane.add(STACK);
		
		JButton QUEUE = new JButton("QUEUE");
		QUEUE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Queue().setVisible(true);
				dispose();
			}
		});
		QUEUE.setFont(new Font("Tahoma", Font.PLAIN, 14));
		QUEUE.setBounds(30, 213, 77, 25);
		contentPane.add(QUEUE);
		
		JButton CIRCULARQUEUE = new JButton("CIRCULAR QUEUE");
		CIRCULARQUEUE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CircularQueue().setVisible(true);
				dispose();
			}
		});
		CIRCULARQUEUE.setFont(new Font("Tahoma", Font.PLAIN, 14));
		CIRCULARQUEUE.setBounds(133, 175, 145, 25);
		contentPane.add(CIRCULARQUEUE);
		
		JButton SINGLELINKEDLIST = new JButton("SINGLE LINKED LIST");
		SINGLELINKEDLIST.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SingleLinkedList().setVisible(true);
				dispose();
			}
		});
		SINGLELINKEDLIST.setFont(new Font("Tahoma", Font.PLAIN, 14));
		SINGLELINKEDLIST.setBounds(133, 93, 159, 25);
		contentPane.add(SINGLELINKEDLIST);
		
		JButton DOUBLELINKEDLIST = new JButton("DOUBLE LINKED LIST");
		DOUBLELINKEDLIST.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DoubleLinkedList().setVisible(true);
				dispose();
			}
		});
		DOUBLELINKEDLIST.setFont(new Font("Tahoma", Font.PLAIN, 14));
		DOUBLELINKEDLIST.setBounds(262, 131, 165, 25);
		contentPane.add(DOUBLELINKEDLIST);
	}
}
