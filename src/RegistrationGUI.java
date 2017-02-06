import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class RegistrationGUI {
	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public RegistrationGUI() {
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
		
		JLabel lblEnterNickname = new JLabel("Enter nickname");
		lblEnterNickname.setBounds(66, 50, 80, 14);
		frame.getContentPane().add(lblEnterNickname);
		
		JLabel lblCreatePassword = new JLabel("Create password");
		lblCreatePassword.setBounds(56, 91, 90, 14);
		frame.getContentPane().add(lblCreatePassword);
		
		JLabel lblRepeatPassword = new JLabel("Repeat password");
		lblRepeatPassword.setBounds(56, 130, 90, 14);
		frame.getContentPane().add(lblRepeatPassword);
		
		textField = new JTextField();
		textField.setBounds(174, 47, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(174, 88, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(174, 127, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnRegister = new JButton("Register!");
		btnRegister.setBounds(171, 188, 89, 23);
		frame.getContentPane().add(btnRegister);
	}
}
