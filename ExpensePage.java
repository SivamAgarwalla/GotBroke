import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class ExpensePage extends JPanel {
	
	private JTextField textField1;
	private JTextField textField2;
	private String expenseType;
	private Expense expense;
	//private BudgetAmount ba;

	public ExpensePage() {
		expense = new Expense();
		
		setBorder(new LineBorder(new Color(0, 128, 0), 3));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Expense!");
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 48));
		lblNewLabel.setBounds(-13, 18, 420, 72);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TYPE OF EXPENSE:");
		lblNewLabel_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_1.setFont(new Font("Georgia", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(37, 117, 191, 16);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("EXPENSE NAME:");
		lblNewLabel_2.setForeground(new Color(0, 100, 0));
		lblNewLabel_2.setFont(new Font("Georgia", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(37, 200, 191, 33);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("EXPENSE AMOUNT:");
		lblNewLabel_3.setForeground(new Color(0, 100, 0));
		lblNewLabel_3.setFont(new Font("Georgia", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(37, 307, 191, 16);
		add(lblNewLabel_3);
		
		textField1 = new JTextField();
		textField1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		textField1.setHorizontalAlignment(SwingConstants.LEFT);
		textField1.setBounds(210, 204, 153, 26);
		add(textField1);
		textField1.setColumns(20);
		
		textField2 = new JTextField();
		textField2.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		textField2.setHorizontalAlignment(SwingConstants.LEFT);
		textField2.setBounds(210, 303, 153, 26);
		add(textField2);
		textField2.setColumns(20);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(7);
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select One", "Housing", "Transportation", "Recreational", "Education", "Medical", "Food"}));
		comboBox.setBounds(222, 115, 208, 27);
		add(comboBox);
	
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				expenseType = comboBox.getSelectedItem().toString(); 
			}
		});
		
		}
	
	public JTextField getTextField2()
	{
		return textField2;
	}
	
	public JTextField getTextField1()
	
	{
		return textField1; 
	}
	
	public String getType()
	{
		return expenseType; 
	}
	
	public String getExpense()
	{
		return new String("[" + expense.getExpenseType() + "] " + expense.getExpenseName() + ": $" + expense.getExpenseAmount());
	}
}
