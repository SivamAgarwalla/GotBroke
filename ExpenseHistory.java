import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ExpenseHistory extends JPanel {
	private String data; 

	public ExpenseHistory()
	{
		setBorder(new LineBorder(new Color(0, 128, 0), 3));
		setLayout(null);

		//label to indicate Expense History Report JPanel 
		JLabel lblNewLabel = new JLabel("Expense Report");
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 25));
		lblNewLabel.setBounds(20, 25, 297, 47);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TOTAL INCOME:");
		lblNewLabel_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_1.setFont(new Font("Georgia", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(30, 79, 191, 16);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DESIRED SAVINGS:");
		lblNewLabel_2.setForeground(new Color(0, 100, 0));
		lblNewLabel_2.setFont(new Font("Georgia", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(30, 105, 191, 16);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("SPENDING GROUPS");
		lblNewLabel_3.setForeground(new Color(0, 100, 0));
		lblNewLabel_3.setFont(new Font("Georgia", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(30, 131, 191, 16);
		add(lblNewLabel_3);
		
		//all category labels for expense history report
		JLabel housingCategory = new JLabel("HOUSING:");
		housingCategory.setForeground(new Color(255, 0, 0));
		housingCategory.setFont(new Font("Georgia", Font.PLAIN, 16));
		housingCategory.setBounds(40, 159, 164, 16);
		add(housingCategory);
		
		JLabel transportationLabel = new JLabel("TRANSPORTATION:");
		transportationLabel.setForeground(new Color(255, 0, 0));
		transportationLabel.setFont(new Font("Georgia", Font.PLAIN, 16));
		transportationLabel.setBounds(40, 180, 164, 16);
		add(transportationLabel);
		
		JLabel recLabel = new JLabel("RECREATIONAL:");
		recLabel.setForeground(new Color(255, 0, 0));
		recLabel.setFont(new Font("Georgia", Font.PLAIN, 16));
		recLabel.setBounds(40, 201, 164, 16);
		add(recLabel);
		
		JLabel educationLabel = new JLabel("EDUCATION:");
		educationLabel.setForeground(new Color(255, 0, 0));
		educationLabel.setFont(new Font("Georgia", Font.PLAIN, 16));
		educationLabel.setBounds(40, 222, 164, 16);
		add(educationLabel);
		
		JLabel medicalLabel = new JLabel("MEDICAL:");
		medicalLabel.setForeground(new Color(255, 0, 0));
		medicalLabel.setFont(new Font("Georgia", Font.PLAIN, 16));
		medicalLabel.setBounds(40, 243, 164, 16);
		add(medicalLabel);
		
		JLabel foodLabel = new JLabel("FOOD:");
		foodLabel.setForeground(new Color(255, 0, 0));
		foodLabel.setFont(new Font("Georgia", Font.PLAIN, 16));
		foodLabel.setBounds(40, 264, 164, 16);
		add(foodLabel);
		
		//Total Spending and Savings Labels and their values
		JLabel lblTotalSpending = new JLabel("TOTAL SPENDING:");
		lblTotalSpending.setForeground(new Color(255, 0, 0));
		lblTotalSpending.setFont(new Font("Georgia", Font.PLAIN, 18));
		lblTotalSpending.setBounds(30, 310, 174, 16);
		add(lblTotalSpending);
		
		JLabel lblTotalSavings = new JLabel("TOTAL SAVINGS: ");
		lblTotalSavings.setForeground(new Color(0, 100, 0));
		lblTotalSavings.setFont(new Font("Georgia", Font.PLAIN, 24));
		lblTotalSavings.setBounds(30, 358, 200, 28);
		add(lblTotalSavings);
		
		JLabel totalSpendLabel = new JLabel();
		totalSpendLabel.setHorizontalAlignment(SwingConstants.LEFT);
		totalSpendLabel.setForeground(new Color(255, 0, 0));
		totalSpendLabel.setFont(new Font("Georgia", Font.PLAIN, 19));
		totalSpendLabel.setBounds(240, 303, 145, 30);
		add(totalSpendLabel);
		
		JLabel endSaveLabel = new JLabel();
		endSaveLabel.setHorizontalAlignment(SwingConstants.LEFT);
		endSaveLabel.setForeground(new Color(0, 100, 0));
		endSaveLabel.setFont(new Font("Georgia", Font.PLAIN, 22));
		endSaveLabel.setBounds(240, 350, 145, 40);
		add(endSaveLabel);
		
	}
}
