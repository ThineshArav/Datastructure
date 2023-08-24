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

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField Size;
	private JTextField Element;
	private JTextField display;
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Queue = new JLabel("QUEUE DATA STRUCTURE");
		Queue.setFont(new Font("Tahoma", Font.BOLD, 14));
		Queue.setBounds(142, 11, 182, 17);
		contentPane.add(Queue);
		
		JLabel queue = new JLabel("ENTER QUEUE SIZE");
		queue.setFont(new Font("Tahoma", Font.PLAIN, 12));
		queue.setBounds(37, 48, 109, 15);
		contentPane.add(queue);
		
		Size = new JTextField();
		Size.setBounds(175, 46, 86, 20);
		contentPane.add(Size);
		Size.setColumns(10);
		
		JButton Create = new JButton("CREATE");
		Create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size=Integer.valueOf(Size.getText());
				q=new int[size];
				String message ="Queue size"+size+" is created";
				JOptionPane.showMessageDialog(contentPane, message);
				Size.getText();
			}
		});
		Create.setBounds(304, 45, 71, 23);
		contentPane.add(Create);
		
		JLabel element = new JLabel("ENTER AN ELEMENT");
		element.setFont(new Font("Tahoma", Font.PLAIN, 12));
		element.setBounds(37, 102, 113, 17);
		contentPane.add(element);
		
		Element = new JTextField();
		Element.setBounds(175, 101, 86, 20);
		contentPane.add(Element);
		Element.setColumns(10);
		
		JButton Insert = new JButton("INSERT");
		Insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem;
				if(r==size-1)
				{
					JOptionPane.showMessageDialog(contentPane,"insret is not possible");
				}
				else
				{
					elem=Integer.valueOf(Element.getText());
					++r;
					q[r]=elem;
					JOptionPane.showMessageDialog(contentPane,"Element Queue is insreted");
				}
				Element.setText("");
				
			}
		});
		Insert.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Insert.setBounds(302, 99, 73, 23);
		contentPane.add(Insert);
		
		JButton Delete = new JButton("DELETE");
		Delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					if(r==-1||f>r)
					{
					JOptionPane.showMessageDialog(contentPane,"deletion is not possible");
					}
					else
					{
						JOptionPane.showMessageDialog(contentPane,"deletion value is"+q[f]);
						++f;
					}
				}
			}
		});
		Delete.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Delete.setBounds(172, 153, 89, 23);
		contentPane.add(Delete);
		
		JButton Display = new JButton("DISPLAY");
		Display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				if(r==-1||f>r)
				{
					JOptionPane.showMessageDialog(contentPane,"display is not possible");
				}
				else
				{
					for(int i=f;i<=r;i++)
					{
						msg=msg+q[i]+" ";
					}
			}
				display.setText(msg);
		}
		});
		Display.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Display.setBounds(172, 187, 89, 23);
		contentPane.add(Display);
		
		display = new JTextField();
		display.setBounds(84, 221, 291, 20);
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
		homebutton.setBounds(37, 10, 65, 23);
		contentPane.add(homebutton);
	}

}
