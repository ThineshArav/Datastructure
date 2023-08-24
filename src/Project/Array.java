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

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField Length;
	private JTextField Element;
	private JTextField Position;
	private JTextField Deleteposition;
	private JTextField display;
	private int arr[];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Array = new JLabel("ARRAY DATA STRUCTURE");
		Array.setForeground(new Color(128, 64, 64));
		Array.setFont(new Font("Tahoma", Font.BOLD, 14));
		Array.setBounds(122, 11, 182, 17);
		contentPane.add(Array);
		
		JLabel EnterLength = new JLabel("ENTER ARRAY LENGTH");
		EnterLength.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EnterLength.setBounds(47, 50, 128, 15);
		contentPane.add(EnterLength);
		
		Length = new JTextField();
		Length.setBounds(185, 48, 86, 20);
		contentPane.add(Length);
		Length.setColumns(10);
		
		JButton Create = new JButton("CREATE ARRAY");
		Create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String len=Length.getText();
				int l=Integer.valueOf(len);
				arr=new int[l];
				String message ="Array Length"+l+"created";
				JOptionPane.showMessageDialog(contentPane, message);
				Length.getText();
				}
				catch (Exception e1) {
					JOptionPane.showMessageDialog(contentPane, "Enter the positive value");
				}
			}
		});
		Create.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Create.setBounds(310, 47, 119, 23);
		contentPane.add(Create);
		
		JLabel InsertElement = new JLabel("INSERT AN INTEGER ELEMENT");
		InsertElement.setFont(new Font("Tahoma", Font.PLAIN, 12));
		InsertElement.setBounds(10, 88, 170, 15);
		contentPane.add(InsertElement);
		
		Element = new JTextField();
		Element.setBounds(185, 86, 86, 20);
		contentPane.add(Element);
		Element.setColumns(10);
		
		JLabel Pos = new JLabel("POSITION");
		Pos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Pos.setBounds(124, 128, 56, 15);
		contentPane.add(Pos);
		
		Position = new JTextField();
		Position.setBounds(185, 126, 86, 20);
		contentPane.add(Position);
		Position.setColumns(10);
		
		JButton Insert = new JButton("INSERT");
		Insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int elem=Integer.valueOf(Element.getText());
				int pos=Integer.valueOf(Position.getText());
				
				//if(pos<=l-1)
				{
				arr[pos]=elem;
				String message="Elemnt"+elem+"Insert position"+pos;
				JOptionPane.showInternalMessageDialog(contentPane, message);
				}
				/*else
				{
					String message="";
					JOptionPane.showInternalMessageDialog(contentPane, message);
				}*/
				
				Element.setText("");
				Position.setText("");
				}
				catch (Exception e2) {
					JOptionPane.showMessageDialog(contentPane, "enter the value");
				}
			}
		});
		Insert.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Insert.setBounds(325, 124, 73, 23);
		contentPane.add(Insert);
		
		JLabel Delete = new JLabel("DELETE POSITION");
		Delete.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Delete.setBounds(77, 164, 103, 15);
		contentPane.add(Delete);
		
		Deleteposition = new JTextField();
		Deleteposition.setBounds(185, 162, 86, 20);
		contentPane.add(Deleteposition);
		Deleteposition.setColumns(10);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				int pos = Integer.valueOf(Deleteposition.getText());
				arr[pos]=0;
				String message = "delete Element position"+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				Deleteposition.setText("");
			}
			catch (Exception e3) {
				JOptionPane.showMessageDialog(contentPane, "Insert value first");
			}
			}
		});
		delete.setFont(new Font("Tahoma", Font.PLAIN, 12));
		delete.setBounds(322, 161, 75, 23);
		contentPane.add(delete);
		
		JButton Display = new JButton("DISPLAY");
		Display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				for(int i=0;i<=arr.length-1;i++)
				{
					msg=msg+" "+arr[i];
				}
				display.setText(msg);
			}
		});
		Display.setBounds(182, 203, 89, 23);
		contentPane.add(Display);
		
		display = new JTextField();
		display.setBounds(110, 230, 265, 20);
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
