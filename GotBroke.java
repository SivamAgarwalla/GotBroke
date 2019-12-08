import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GotBroke {

	private static CardLayout cl;
	private static JPanel homeScreen;
	private static JPanel incomePage;
	private static JPanel budgetPage;
	private static JPanel expensePage;
	private static JPanel bsPanel;
	private static String userName;
	private static String budgetMonth;
	private static DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args)
	{
		BudgetAmount ba = new BudgetAmount();
		
		JFrame mFrame = new JFrame("CardLayout GotBroke");
		cl = new CardLayout(5, 5);
		
		bsPanel = new JPanel(cl);
		
		homeScreen = new HomeScreen();
		bsPanel.add(homeScreen, "HomeScreen");
		
		incomePage = new IncomePage();
		bsPanel.add(incomePage, "IncomePage");
		
		budgetPage = new BudgetPage();
		bsPanel.add(budgetPage, "BudgetPage");
		
		expensePage = new ExpensePage();
		bsPanel.add(expensePage, "ExpensePage");
		
		JButton btnNewButton = new JButton("BEGIN");
		btnNewButton.addActionListener(e -> 
		{
			homeScreen.setVisible(false);
			incomePage.setVisible(true);
		});
		
		btnNewButton.setForeground(new Color(0, 128, 0));
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnNewButton.setBounds(547, 395, 117, 29);
		homeScreen.add(btnNewButton);
		
		//Labels for the BudgetPage
		JLabel bpLabel1 = new JLabel();
		bpLabel1.setForeground(new Color(0, 128, 0));
		bpLabel1.setFont(new Font("Georgia", Font.PLAIN, 35));
		bpLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		bpLabel1.setBounds(237, 147, 247, 46);
		budgetPage.add(bpLabel1);
		
		JLabel bpLabel2 = new JLabel();
		bpLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		bpLabel2.setForeground(new Color(0, 128, 0));
		bpLabel2.setFont(new Font("Georgia", Font.PLAIN, 35));
		bpLabel2.setBounds(320, 244, 247, 46);
		budgetPage.add(bpLabel2);
		
		JButton btnNewButton2 = new JButton("NEXT");
		btnNewButton2.addActionListener(e -> 
		{
			ba.setMonthlyTotal(((IncomePage) incomePage).getTxtSdasda().getText());
			ba.setDesiredSavings(((IncomePage) incomePage).getTextField().getText());
			
			incomePage.setVisible(false);
			bpLabel1.setText("" + df.format(ba.getMonthlyTotal()));
			bpLabel2.setText("" + df.format(ba.getDesiredSavings()));
			budgetPage.revalidate();
			budgetPage.repaint();
			budgetPage.setVisible(true);
		});
		btnNewButton2.setForeground(new Color(0, 100, 0));
		btnNewButton2.setBounds(546, 394, 117, 29);
		incomePage.add(btnNewButton2);
		
		JButton btnNewButton3 = new JButton("ADD EXPENSES");
		btnNewButton3.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		btnNewButton3.addActionListener(e -> 
		{
			budgetPage.setVisible(false);
			expensePage.setVisible(true);
		});
		btnNewButton3.setForeground(new Color(0, 100, 0));
		btnNewButton3.setBounds(20, 343, 146, 61);
		budgetPage.add(btnNewButton3);
		
		JButton btnNewButton4 = new JButton("FINISH");
		btnNewButton4.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ba.withdraw(((ExpensePage) expensePage).getTextField2().getText());
				bpLabel1.setText("" + df.format(ba.getMonthlyTotal()));
				bpLabel2.setText("" + df.format(ba.getDesiredSavings()));
				budgetPage.revalidate();
				budgetPage.repaint();
				budgetPage.setVisible(true);
				expensePage.setVisible(false);
			}
		});
		btnNewButton4.setForeground(new Color(0, 100, 0));
		btnNewButton4.setBounds(269, 368, 127, 42);
		expensePage.add(btnNewButton4);
		
		mFrame.add(bsPanel);
		cl.show(bsPanel, "bs");
		homeScreen.setVisible(true);
		mFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mFrame.setLocationRelativeTo(null);
		mFrame.setSize(700, 480);
		mFrame.setVisible(true);
	}
	
	public void setName(String _name) {
		userName = _name;
	}
	
	public void setMonth(String _month) {
		budgetMonth = _month;
	}

}
