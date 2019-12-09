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

		JLabel lblNewLabel = new JLabel("Expense History");
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 34));
		lblNewLabel.setBounds(20, 20, 297, 47);
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
		
		JLabel label = new JLabel("HOUSING:");
		label.setForeground(new Color(255, 0, 0));
		label.setFont(new Font("Georgia", Font.PLAIN, 16));
		label.setBounds(40, 159, 164, 16);
		add(label);
		
		JLabel label_1 = new JLabel("TRANSPORTATION:");
		label_1.setForeground(new Color(255, 0, 0));
		label_1.setFont(new Font("Georgia", Font.PLAIN, 16));
		label_1.setBounds(40, 180, 164, 16);
		add(label_1);
		
		JLabel label_2 = new JLabel("RECREATIONAL:");
		label_2.setForeground(new Color(255, 0, 0));
		label_2.setFont(new Font("Georgia", Font.PLAIN, 16));
		label_2.setBounds(40, 201, 164, 16);
		add(label_2);
		
		JLabel label_3 = new JLabel("EDUCATION:");
		label_3.setForeground(new Color(255, 0, 0));
		label_3.setFont(new Font("Georgia", Font.PLAIN, 16));
		label_3.setBounds(40, 222, 164, 16);
		add(label_3);
		
		JLabel label_4 = new JLabel("MEDICAL:");
		label_4.setForeground(new Color(255, 0, 0));
		label_4.setFont(new Font("Georgia", Font.PLAIN, 16));
		label_4.setBounds(40, 243, 164, 16);
		add(label_4);
		
		JLabel label_5 = new JLabel("FOOD:");
		label_5.setForeground(new Color(255, 0, 0));
		label_5.setFont(new Font("Georgia", Font.PLAIN, 16));
		label_5.setBounds(40, 264, 164, 16);
		add(label_5);
		
		/*
		JLabel bpLabel1 = new JLabel();
		bpLabel1.setForeground(new Color(0, 100, 0));
		bpLabel1.setFont(new Font("Georgia", Font.PLAIN, 17));
		bpLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		bpLabel1.setBounds(210, 76, 145, 19);
		add(bpLabel1);
		
		JLabel label_6 = new JLabel();
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(new Color(0, 100, 0));
		label_6.setFont(new Font("Georgia", Font.PLAIN, 17));
		label_6.setBounds(210, 104, 145, 19);
		add(label_6);
		*/
		
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
		
		/*
		JLabel bpLabel1 = new JLabel();
		bpLabel1.setForeground(new Color(255, 0, 0));
		bpLabel1.setFont(new Font("Georgia", Font.PLAIN, 15));
		bpLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		bpLabel1.setBounds(200, 159, 140, 16);
		add(bpLabel1);
		
		JLabel bpLabel2 = new JLabel();
		bpLabel2.setForeground(new Color(255, 0, 0));
		bpLabel2.setFont(new Font("Georgia", Font.PLAIN, 15));
		bpLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		bpLabel2.setBounds(200, 178, 140, 16);
		add(bpLabel2);
		
		JLabel bpLabel3 = new JLabel();
		bpLabel3.setForeground(new Color(255, 0, 0));
		bpLabel3.setFont(new Font("Georgia", Font.PLAIN, 15));
		bpLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		bpLabel3.setBounds(200, 199, 140, 16);
		add(bpLabel3);
		
		JLabel bpLabel4 = new JLabel();
		bpLabel4.setForeground(new Color(255, 0, 0));
		bpLabel4.setFont(new Font("Georgia", Font.PLAIN, 15));
		bpLabel4.setHorizontalAlignment(SwingConstants.CENTER);
		bpLabel4.setBounds(200, 220, 140, 16);
		add(bpLabel4);
		
		JLabel bpLabel5 = new JLabel();
		bpLabel5.setForeground(new Color(255, 0, 0));
		bpLabel5.setFont(new Font("Georgia", Font.PLAIN, 15));
		bpLabel5.setHorizontalAlignment(SwingConstants.CENTER);
		bpLabel5.setBounds(200, 241, 140, 16);
		add(bpLabel5);
		
		JLabel bpLabel6 = new JLabel();
		bpLabel6.setForeground(new Color(255, 0, 0));
		bpLabel6.setFont(new Font("Georgia", Font.PLAIN, 15));
		bpLabel6.setHorizontalAlignment(SwingConstants.CENTER);
		bpLabel6.setBounds(200, 262, 140, 16);
		add(bpLabel6);
		*/
	}
}