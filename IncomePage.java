import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IncomePage extends JPanel {

	private JTextField txtSdasda;
	private JTextField textField;
	//public BudgetAmount ba;
	
	public IncomePage() {
		//ba = new BudgetAmount();
		setBorder(new LineBorder(new Color(0, 128, 0), 3));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Income");
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 48));
		lblNewLabel.setBounds(32, 24, 196, 72);
		add(lblNewLabel);
		
		JTextArea txtrEnterYourTotal = new JTextArea();
		txtrEnterYourTotal.setForeground(new Color(0, 128, 0));
		txtrEnterYourTotal.setFont(new Font("Georgia", Font.PLAIN, 13));
		txtrEnterYourTotal.setBackground(new Color(238, 238, 238));
		txtrEnterYourTotal.setWrapStyleWord(true);
		txtrEnterYourTotal.setLineWrap(true);
		txtrEnterYourTotal.setColumns(4);
		txtrEnterYourTotal.setText("Enter your total monthly income and the amount of it that you would like to save.");
		txtrEnterYourTotal.setBounds(37, 97, 277, 38);
		add(txtrEnterYourTotal);
		
		JLabel lblNewLabel_1 = new JLabel("MONTHLY INCOME:");
		lblNewLabel_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_1.setFont(new Font("Georgia", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(37, 213, 191, 16);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DESIRED SAVINGS:");
		lblNewLabel_2.setForeground(new Color(0, 100, 0));
		lblNewLabel_2.setFont(new Font("Georgia", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(37, 274, 183, 16);
		add(lblNewLabel_2);
		
		txtSdasda = new JTextField();
		/*
		txtSdasda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				ba.setMonthlyTotal(txtSdasda.getText());
				System.out.println(txtSdasda.getText());
			}
		});
		*/
		txtSdasda.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		txtSdasda.setHorizontalAlignment(SwingConstants.LEFT);
		txtSdasda.setBounds(218, 209, 130, 26);
		add(txtSdasda);
		txtSdasda.setColumns(20);
		
		textField = new JTextField();
		/*
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				ba.setDesiredSavings(textField.getText());
				System.out.println(textField.getText());
			}
		});
		*/
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBounds(218, 270, 130, 26);
		add(textField);
		textField.setColumns(20);
		
		/*
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(new Color(0, 100, 0));
		btnNewButton.setBounds(546, 394, 117, 29);
		add(btnNewButton);
		*/	
	}
	
	/*
	public BudgetAmount getBudgetAmount()
	{
		return ba;
	}
	*/
	
	public JTextField getTxtSdasda()
	{
		return txtSdasda;
	}
	
	public JTextField getTextField()
	{
		return textField;
	}
	
}
