import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;

public class ChatGUI {

	JFrame frame;
	private String nickname;
	private JTextField textField;
	public JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}

	/**
	 * Create the application.
	 */
	public ChatGUI(String nickname) {
		initialize();
		this.nickname = nickname;
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 11, 414, 205);
		frame.getContentPane().add(textArea);
		
		textField = new JTextField();
		textField.setBounds(10, 227, 321, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton sendButton = new JButton("Send");
		sendButton.setBounds(341, 227, 89, 20);
		frame.getContentPane().add(sendButton);
		sendButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
					Client.sendMessage(textField.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				textField.setText("");
			}
		});
	}
}
