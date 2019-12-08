import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomeScreen extends JPanel {
	private JTextField txtSdasda;
	private JTextField textField;
	private GotBroke gb;

	public HomeScreen()
	{
		gb = new GotBroke();
		setBorder(new LineBorder(new Color(0, 128, 0), 3));
		setLayout(null);

		JLabel lblNewLabel = new JLabel("Got Broke?");
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(157, 105, 324, 112);
		add(lblNewLabel);

		/*
		JButton btnNewButton = new JButton("BEGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnNewButton.setForeground(new Color(0, 128, 0));
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnNewButton.setBounds(547, 395, 117, 29);
		add(btnNewButton);
		 */

		JLabel lblNewLabel_1 = new JLabel("NAME:");
		lblNewLabel_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_1.setFont(new Font("Georgia", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(211, 254, 61, 16);
		add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("MONTH:");
		lblNewLabel_2.setForeground(new Color(0, 100, 0));
		lblNewLabel_2.setFont(new Font("Georgia", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(211, 282, 76, 16);
		add(lblNewLabel_2);

		txtSdasda = new JTextField();
		txtSdasda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				gb.setName(txtSdasda.getText());
			}
		});

		txtSdasda.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		txtSdasda.setHorizontalAlignment(SwingConstants.LEFT);
		txtSdasda.setBounds(299, 250, 130, 26);
		add(txtSdasda);
		txtSdasda.setColumns(20);

		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				gb.setMonth(textField.getText());
			}
		});

		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBounds(299, 278, 130, 26);
		add(textField);
		textField.setColumns(20);

	}

	public String getName()
	{
		return txtSdasda.getText();
	}

	public String getMonth()
	{
		return textField.getText();
	}

}
