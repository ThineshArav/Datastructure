package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField Size;
	private JTextField Element;
	private JTextField display;
	private int[] cq;
	private int size;
	private int r=-1;
	private int count=0;
	private int f =0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 332);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel CircularQueue = new JLabel("CIRCULAR QUEUE DATA STRUCTURE");
		CircularQueue.setForeground(new Color(255, 255, 255));
		CircularQueue.setFont(new Font("Tahoma", Font.BOLD, 12));
		CircularQueue.setBounds(109, 11, 219, 15);
		contentPane.add(CircularQueue);
		
		JLabel Enterqueue = new JLabel("ENTER CICULAR QUEUE SIZE");
		Enterqueue.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Enterqueue.setForeground(new Color(255, 255, 255));
		Enterqueue.setBounds(10, 55, 160, 15);
		contentPane.add(Enterqueue);
		
		Size = new JTextField();
		Size.setBounds(180, 53, 86, 20);
		contentPane.add(Size);
		Size.setColumns(10);
		
		JButton Create = new JButton("CREATE");
		Create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size=Integer.valueOf(Size.getText());
				cq=new int[size];
				String message ="Circular Queue size"+size+" is created";
				JOptionPane.showMessageDialog(contentPane, message);
				Size.getText();
			}
		});
		Create.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Create.setBounds(298, 52, 77, 23);
		contentPane.add(Create);
		
		JLabel element = new JLabel("ENTER AN ELEMENT");
		element.setFont(new Font("Tahoma", Font.PLAIN, 12));
		element.setForeground(new Color(255, 255, 255));
		element.setBounds(57, 93, 113, 15);
		contentPane.add(element);
		
		Element = new JTextField();
		Element.setBounds(180, 91, 86, 20);
		contentPane.add(Element);
		Element.setColumns(10);
		
		JButton Insert = new JButton("INSERT");
		Insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count==size)
				{
					JOptionPane.showMessageDialog(contentPane,"insertion is not possible");
				}
				else
				{
					System.out.println("enter the element");
					int elem=Integer.valueOf(Element.getText());
					r=(r+1)%size;
					cq[r]=elem;
					count++;
					JOptionPane.showMessageDialog(contentPane,"element inserted successfully");
				}
				Element.setText("");
			}
		});
		Insert.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Insert.setBounds(298, 89, 73, 23);
		contentPane.add(Insert);
		
		JButton Delete = new JButton("DELETE");
		Delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count==0)
				{
					JOptionPane.showMessageDialog(contentPane,"deletion is not possible");
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane,"element deleted is"+cq[f]);
					f=(f+1)%size;
					count--;
				}
				Delete.setText("");
			}
		});
		Delete.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Delete.setBounds(300, 131, 75, 23);
		contentPane.add(Delete);
		
		JButton btnNewButton = new JButton("DISPLAY");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg ="" ;
				int f1 = f;
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane,"Display is not possible");
				}
				else
				{
					for(int i=1;i<=count;i++)
					{
						msg=msg+cq[f1]+" ";
						f1=(f1+1)%size;
					}
				}
				display.setText(msg);
			}
		});
		btnNewButton.setBounds(302, 179, 81, 23);
		contentPane.add(btnNewButton);
		
		display = new JTextField();
		display.setFont(new Font("Tahoma", Font.PLAIN, 12));
		display.setBounds(22, 179, 244, 20);
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
		homebutton.setBounds(10, 8, 65, 23);
		contentPane.add(homebutton);
	}

}
