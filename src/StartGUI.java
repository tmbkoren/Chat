import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class StartGUI {

	private JFrame frame;
	private JTextField ipTextField;
	private JTextField portTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartGUI window = new StartGUI();
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
	public StartGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIp = new JLabel("IP");
		lblIp.setBounds(100, 70, 46, 14);
		frame.getContentPane().add(lblIp);
		
		ipTextField = new JTextField();
		ipTextField.setBounds(156, 67, 86, 20);
		frame.getContentPane().add(ipTextField);
		ipTextField.setColumns(10);
		
		JLabel lblPort = new JLabel("Port");
		lblPort.setBounds(100, 120, 46, 14);
		frame.getContentPane().add(lblPort);
		
		portTextField = new JTextField();
		portTextField.setBounds(156, 117, 86, 20);
		frame.getContentPane().add(portTextField);
		portTextField.setColumns(10);
		
		JButton btnConnect = new JButton("Connect!");
		btnConnect.setBounds(153, 173, 89, 23);
		frame.getContentPane().add(btnConnect);
		btnConnect.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
					new Client(ipTextField.getText(), Integer.parseInt(portTextField.getText()));
					frame.setVisible(false);
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
	}

}
