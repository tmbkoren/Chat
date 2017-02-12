import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class LoginGUI {
	static LoginGUI window;
	JFrame frame;
	JTextField textField;

	public LoginGUI() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(239, 114, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblLogin = new JLabel("Nickname");
		lblLogin.setBounds(69, 117, 104, 14);
		frame.getContentPane().add(lblLogin);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(161, 182, 89, 23);
		frame.getContentPane().add(btnLogin);
		btnLogin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Client.setNickname();
				frame.setVisible(false);
			}
		});
		
	}
}
