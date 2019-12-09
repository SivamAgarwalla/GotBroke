import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JProgressBar;
import javax.swing.JTable;

public class BudgetPage extends JPanel {
	
	private BudgetAmount ba;

	public BudgetPage() {
		ba = new BudgetAmount();
		setBorder(new LineBorder(new Color(0, 128, 0), 3));
		setLayout(null);
		
		//Header for the JPanel that indicates BudgetPage
		JLabel lblNewLabel = new JLabel("Budgeting Time!");
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 48));
		lblNewLabel.setBounds(32, 24, 420, 72);
		add(lblNewLabel);
		
		//label for remaining income
		JLabel lblNewLabel_1 = new JLabel("INCOME REMAINING:");
		lblNewLabel_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_1.setFont(new Font("Georgia", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(45, 158, 197, 16);
		add(lblNewLabel_1);
		
		// $ sign to indicate monetary income  
		JLabel lblNewLabel_11 = new JLabel("$");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setForeground(new Color(0, 100, 0));
		lblNewLabel_11.setFont(new Font("Georgia", Font.BOLD, 40));
		lblNewLabel_11.setBounds(227, 146, 48, 46);
		add(lblNewLabel_11);
		
		//label for desired savings 
		JLabel lblNewLabel_2 = new JLabel("DESIRED SAVINGS REMAINING:");
		lblNewLabel_2.setForeground(new Color(0, 100, 0));
		lblNewLabel_2.setFont(new Font("Georgia", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(45, 251, 275, 16);
		add(lblNewLabel_2);
		
		//$ sign to indicate monetary savings
		JLabel lblNewLabel_22 = new JLabel("$");
		lblNewLabel_22.setForeground(new Color(0, 100, 0));
		lblNewLabel_22.setFont(new Font("Georgia", Font.BOLD, 40));
		lblNewLabel_22.setBounds(321, 240, 36, 53);
		add(lblNewLabel_22);
	}
}
