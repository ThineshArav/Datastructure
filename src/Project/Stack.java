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

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField Size;
	private JTextField Element;
	private JTextField display;
	private int s[];
	private int size;
	private int top=-1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 459, 298);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Stack = new JLabel("STACK DATA STRUCTURE");
		Stack.setFont(new Font("Tahoma", Font.BOLD, 14));
		Stack.setBounds(143, 11, 181, 17);
		contentPane.add(Stack);
		
		JLabel EnterSize = new JLabel("ENTER THE STACK SIZE");
		EnterSize.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EnterSize.setBounds(46, 39, 134, 15);
		contentPane.add(EnterSize);
		
		Size = new JTextField();
		Size.setBounds(190, 39, 86, 20);
		contentPane.add(Size);
		Size.setColumns(10);
		
		JButton Create = new JButton("CREATE STACK");
		Create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size=Integer.valueOf(Size.getText());
				s=new int[size];
				String message ="Stack size"+size+"created";
				JOptionPane.showMessageDialog(contentPane, message);
				Size.getText();
			}
		});
		Create.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Create.setBounds(187, 70, 117, 23);
		contentPane.add(Create);
		
		JLabel EnterElement = new JLabel("ENTER AN ELEMENT");
		EnterElement.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EnterElement.setBounds(67, 117, 113, 15);
		contentPane.add(EnterElement);
		
		Element = new JTextField();
		Element.setBounds(190, 115, 86, 20);
		contentPane.add(Element);
		Element.setColumns(10);
		
		JButton Push = new JButton("PUSH");
		Push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int elem;
				if(top==size-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Push not possible");
				}
				else
				{
					elem=Integer.valueOf(Element.getText());
					++top;
					s[top]=elem;
					JOptionPane.showInternalMessageDialog(contentPane, "Push is succesfull");
				}
				Element.setText("");
			}
		});
		Push.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Push.setBounds(309, 114, 63, 23);
		contentPane.add(Push);
		
		JButton Pop = new JButton("POP");
		Pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (top==-1)
				{
					JOptionPane.showInternalMessageDialog(contentPane, "POP is not possible" );
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane," the deltion value"+s[top]);
					--top;
				}
			}
		});
		Pop.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Pop.setBounds(200, 152, 55, 23);
		contentPane.add(Pop);
		
		JButton Display = new JButton("DISPLAY");
		Display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String msg="";
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane,"display is not possible");
				}
				else
				{
					for (int i=top;i>=0;i--)
					{
					 msg=msg+""+s[i];
					}
				}
				display.setText(msg);
			}
		});
		Display.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Display.setBounds(190, 186, 81, 23);
		contentPane.add(Display);
		
		display = new JTextField();
		display.setBounds(90, 220, 282, 20);
		contentPane.add(display);
		display.setColumns(10);
		
		JButton homebutton = new JButton("HOME");
		homebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home H=new Home();
				H.setVisible(true);
				dispose();
			}
		});
		homebutton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		homebutton.setBounds(10, 10, 65, 23);
		contentPane.add(homebutton);
	}

}
