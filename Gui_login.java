import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui_login {

	private JFrame frame;
	private JTextField txtDenvercrime;
	private JTextField txtKorisnikoIme;
	private JTextField txtLozinka;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_login window = new Gui_login();
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
	public Gui_login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("Button.darkShadow"));
		frame.setBounds(300, 300, 1350, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDenvercrime = new JTextField();
		txtDenvercrime.setEditable(false);
		txtDenvercrime.setBackground(UIManager.getColor("Button.darkShadow"));
		txtDenvercrime.setFont(new Font("Century Schoolbook L", Font.BOLD, 20));
		txtDenvercrime.setText("DenverCrime");
		txtDenvercrime.setBounds(15, 15, 200, 39);
		frame.getContentPane().add(txtDenvercrime);
		txtDenvercrime.setColumns(10);
		
		txtKorisnikoIme = new JTextField();
		txtKorisnikoIme.setText("Korisničko ime");
		txtKorisnikoIme.setFont(new Font("Century Schoolbook L", Font.BOLD, 20));
		txtKorisnikoIme.setEditable(false);
		txtKorisnikoIme.setColumns(10);
		txtKorisnikoIme.setBackground(UIManager.getColor("Button.background"));
		txtKorisnikoIme.setBounds(575, 316, 200, 50);
		frame.getContentPane().add(txtKorisnikoIme);
		
		txtLozinka = new JTextField();
		txtLozinka.setText("Lozinka");
		txtLozinka.setFont(new Font("Century Schoolbook L", Font.BOLD, 20));
		txtLozinka.setEditable(false);
		txtLozinka.setColumns(10);
		txtLozinka.setBackground(UIManager.getColor("Button.background"));
		txtLozinka.setBounds(575, 407, 200, 50);
		frame.getContentPane().add(txtLozinka);
		
		JButton btnUlogirajSe = new JButton("Ulogiraj se");
		btnUlogirajSe.setFont(new Font("Dialog", Font.BOLD, 15));
		btnUlogirajSe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUlogirajSe.setBounds(575, 509, 200, 50);
		frame.getContentPane().add(btnUlogirajSe);
	}
}
