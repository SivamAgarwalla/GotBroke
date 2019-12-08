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
		
		JLabel lblNewLabel = new JLabel("Budgeting Time!");
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 48));
		lblNewLabel.setBounds(32, 24, 420, 72);
		add(lblNewLabel);
		/*
		JButton btnNewButton = new JButton("ADD INCOME");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(new Color(0, 100, 0));
		btnNewButton.setBounds(507, 343, 146, 61);
		add(btnNewButton);
		
		/*
		JButton btnNewButton2 = new JButton("ADD EXPENSES");
		btnNewButton2.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton2.setForeground(new Color(0, 100, 0));
		btnNewButton2.setBounds(20, 343, 146, 61);
		add(btnNewButton2);
		*/
		
		JLabel lblNewLabel_1 = new JLabel("INCOME REMAINING:");
		lblNewLabel_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_1.setFont(new Font("Georgia", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(45, 158, 197, 16);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_11 = new JLabel("$");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setForeground(new Color(0, 100, 0));
		lblNewLabel_11.setFont(new Font("Georgia", Font.BOLD, 40));
		lblNewLabel_11.setBounds(227, 146, 48, 46);
		add(lblNewLabel_11);
		
		/*
		//Set the maximum of the JProgressBar to be the Income entered by the user
		JProgressBar progressBar = new JProgressBar(0,(int) ba.getConstantSpendAmount());
		//JProgressBar progressBar = new JProgressBar(0, 5000);
		progressBar.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		progressBar.setStringPainted(true);
		progressBar.setValue(1355);
		progressBar.setBounds(45, 188, 321, 42);
		add(progressBar);
		*/
		
		JLabel lblNewLabel_2 = new JLabel("DESIRED SAVINGS REMAINING:");
		lblNewLabel_2.setForeground(new Color(0, 100, 0));
		lblNewLabel_2.setFont(new Font("Georgia", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(45, 251, 275, 16);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_22 = new JLabel("$");
		lblNewLabel_22.setForeground(new Color(0, 100, 0));
		lblNewLabel_22.setFont(new Font("Georgia", Font.BOLD, 40));
		lblNewLabel_22.setBounds(321, 240, 36, 53);
		add(lblNewLabel_22);
		
		/*
		JLabel lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setText("" + ba.getMonthlyTotal());
		lblNewLabel_3.setForeground(new Color(0, 128, 0));
		lblNewLabel_3.setFont(new Font("Georgia", Font.PLAIN, 35));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(237, 147, 247, 46);
		add(lblNewLabel_3);
		
		JLabel label = new JLabel();
		lblNewLabel_3.setText("" + ba.getDesiredSavings());
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(0, 128, 0));
		label.setFont(new Font("Georgia", Font.PLAIN, 35));
		label.setBounds(320, 244, 247, 46);
		add(label);
		*/
		
		/*
		//Set the maximum of the JProgressBar to be the Income entered by the user
		JProgressBar progressBar1 = new JProgressBar(0,(int) ba.getConstantSaveAmount());
		//JProgressBar progressBar1 = new JProgressBar(0, 100);
		progressBar1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		progressBar1.setStringPainted(true);
		progressBar1.setValue(1700);
		progressBar1.setBounds(45, 269, 321, 42);
		add(progressBar1);
		*/
		 
	}
}
