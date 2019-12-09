import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class IncomePage extends JPanel {

	private JTextField txtSdasda;
	private JTextField textField;
	//public BudgetAmount ba;
	
	public IncomePage() {
		//ba = new BudgetAmount();
		setBorder(new LineBorder(new Color(0, 128, 0), 3));
		setLayout(null);
		
		//IncomePage Header
		JLabel incomeHeader = new JLabel("Income");
		incomeHeader.setForeground(new Color(0, 100, 0));
		incomeHeader.setHorizontalAlignment(SwingConstants.CENTER);
		incomeHeader.setFont(new Font("Georgia", Font.BOLD, 48));
		incomeHeader.setBounds(32, 24, 196, 72);
		add(incomeHeader);
		
		JTextArea txtrEnterYourTotal = new JTextArea();
		txtrEnterYourTotal.setForeground(new Color(0, 128, 0));
		txtrEnterYourTotal.setFont(new Font("Georgia", Font.PLAIN, 13));
		txtrEnterYourTotal.setBackground(new Color(238, 238, 238));
		txtrEnterYourTotal.setWrapStyleWord(true);
		txtrEnterYourTotal.setLineWrap(true);
		txtrEnterYourTotal.setColumns(4);
		txtrEnterYourTotal.setText("Enter your total monthly income and the amount of it that you would like to save. (Input numbers)");
		txtrEnterYourTotal.setBounds(37, 97, 244, 53);
		add(txtrEnterYourTotal);
		
		//label for monthly income
		JLabel lblNewLabel_1 = new JLabel("MONTHLY INCOME:");
		lblNewLabel_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_1.setFont(new Font("Georgia", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(37, 213, 191, 16);
		add(lblNewLabel_1);
		
		//label for desired savings
		JLabel lblNewLabel_2 = new JLabel("DESIRED SAVINGS:");
		lblNewLabel_2.setForeground(new Color(0, 100, 0));
		lblNewLabel_2.setFont(new Font("Georgia", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(37, 274, 183, 16);
		add(lblNewLabel_2);
		
		//textField for income 
		txtSdasda = new JTextField();
		txtSdasda.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		txtSdasda.setHorizontalAlignment(SwingConstants.LEFT);
		txtSdasda.setBounds(218, 209, 130, 26);
		add(txtSdasda);
		txtSdasda.setColumns(20);
		
		//textField for savings
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBounds(218, 270, 130, 26);
		add(textField);
		textField.setColumns(20);
	}
	
	
	public JTextField getTxtSdasda()
	{
		return txtSdasda;
	}
	
	public JTextField getTextField()
	{
		return textField;
	}
	
}
