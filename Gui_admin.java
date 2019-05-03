import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class Gui_admin {

	private JFrame frame;
	private JTextField txtAdministrator;
	private JTextField txtSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_admin window = new Gui_admin();
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
	public Gui_admin() {
		try {
			initialize();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("Button.darkShadow"));
		frame.setBounds(300, 300, 1350, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtAdministrator = new JTextField();
		txtAdministrator.setEditable(false);
		txtAdministrator.setBackground(UIManager.getColor("Button.darkShadow"));
		txtAdministrator.setFont(new Font("Century Schoolbook L", Font.BOLD, 20));
		txtAdministrator.setText("Administrator");
		txtAdministrator.setBounds(15, 15, 200, 39);
		frame.getContentPane().add(txtAdministrator);
		txtAdministrator.setColumns(10);
		
		JButton btnMine = new JButton("Mine");
		btnMine.setBounds(816, 131, 117, 25);
		frame.getContentPane().add(btnMine);
		
		txtSearch = new JTextField();
		txtSearch.setText("Search");
		txtSearch.setBounds(945, 134, 114, 19);
		frame.getContentPane().add(txtSearch);
		txtSearch.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(659, 198, 538, 463);
		frame.getContentPane().add(textArea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setBounds(679, 701, 170, 24);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(849, 701, 170, 24);
		frame.getContentPane().add(comboBox_1);
		
		JButton btnPreusmjeri = new JButton("Preusmjeri");
		btnPreusmjeri.setBounds(1036, 701, 170, 25);
		frame.getContentPane().add(btnPreusmjeri);
		
		JButton btnPoaljiPojaanje = new JButton("Pošalji pojačanje");
		btnPoaljiPojaanje.setBounds(1036, 725, 170, 25);
		frame.getContentPane().add(btnPoaljiPojaanje);
		
		JButton btnLogOut = new JButton("Log out");
		btnLogOut.setForeground(UIManager.getColor("MenuItem.selectionForeground"));
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLogOut.setBackground(UIManager.getColor("OptionPane.errorDialog.border.background"));
		btnLogOut.setBounds(1200, 24, 117, 25);
		frame.getContentPane().add(btnLogOut);
		
		JPanel panel = new JPanel();
		panel.setBounds(43, 183, 570, 550);
		BufferedImage image = null;
		image = ImageIO.read(new File("/home/bacva/eclipse-workspace/00.Programsko_projekt/src/slike/denver1.jpg"));
		Image scaledImage = image.getScaledInstance(panel.getWidth(),panel.getHeight(),Image.SCALE_SMOOTH);
		panel.add(new JLabel(new ImageIcon(scaledImage)));
		frame.getContentPane().add(panel);
	}
}
