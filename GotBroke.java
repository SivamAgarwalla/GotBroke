import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class GotBroke {

	private static CardLayout cl;
	private static JPanel homeScreen;
	private static JPanel incomePage;
	private static JPanel budgetPage;
	private static JPanel expensePage;
	private static JPanel bsPanel;
	private static JPanel expenseHistory; 
	private static String userName;
	private static String budgetMonth;
	private static DecimalFormat df = new DecimalFormat("0.00");
	private static ArrayList<String> expenseList; 
	private static Expense expense; 
	
	public static void main(String[] args)
	{
		//initialize arrayList
		expenseList = new ArrayList<>(); 
		BudgetAmount ba = new BudgetAmount();
		
		JFrame mFrame = new JFrame("CardLayout GotBroke");
		cl = new CardLayout(5, 5);
		
		//add all the panels to the cardlayout
		bsPanel = new JPanel(cl);
		
		homeScreen = new HomeScreen();
		bsPanel.add(homeScreen, "HomeScreen");
		
		incomePage = new IncomePage();
		bsPanel.add(incomePage, "IncomePage");
		
		budgetPage = new BudgetPage();
		bsPanel.add(budgetPage, "BudgetPage");
		
		expensePage = new ExpensePage();
		bsPanel.add(expensePage, "ExpensePage");
		
		expenseHistory = new ExpenseHistory(); 
		bsPanel.add(expenseHistory, "ExpenseHistory"); 
		
		//button to move from homeScreen to incomePage
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
		
		//button to move from incomePage to budgetPage, sets initial Income and Savings
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
		
		//Button to move budgetPage to expensePage
		JButton btnNewButton3 = new JButton("ADD EXPENSES");
		btnNewButton3.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		btnNewButton3.addActionListener(e -> 
		{
			budgetPage.setVisible(false);
			expense = new Expense(); 
			expensePage.setVisible(true);
		});
		btnNewButton3.setForeground(new Color(0, 100, 0));
		btnNewButton3.setBounds(20, 343, 146, 61);
		budgetPage.add(btnNewButton3);
		
		//Button to calculate expense differences and move back to budgetPage
		JButton btnNewButton4 = new JButton("FINISH");
		btnNewButton4.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ba.withdraw(((ExpensePage) expensePage).getTextField2().getText());
				bpLabel1.setText("" + df.format(ba.getMonthlyTotal()));
				bpLabel2.setText("" + df.format(ba.getDesiredSavings()));
				//System.out.println(((ExpensePage) expensePage).getExpense()); 
				expense.setExpenseType(((ExpensePage) expensePage).getType());
				expense.setExpenseName(((ExpensePage) expensePage).getTextField1().getText()); 
				expense.setExpenseAmount(((ExpensePage) expensePage).getTextField2().getText());
				System.out.println(expense.toString());
				expenseList.add(expense.toString()); 
				budgetPage.revalidate();
				budgetPage.repaint();
				budgetPage.setVisible(true);
				expensePage.setVisible(false);
			}
		});
		btnNewButton4.setForeground(new Color(0, 100, 0));
		btnNewButton4.setBounds(269, 368, 127, 42);
		expensePage.add(btnNewButton4);
		
	
		//button to move from budgetPage to expenseHistory
		JButton printButton = new JButton("Print Expense Report");
		printButton.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		printButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				budgetPage.setVisible(false);
				for(int i = 0; i < expenseList.size(); i++) {
					JLabel expenseLabel = new JLabel();
					expenseLabel.setHorizontalAlignment(SwingConstants.LEFT);
					expenseLabel.setForeground(new Color(0, 128, 0));
					expenseLabel.setFont(new Font("Georgia", Font.PLAIN, 35));
					expenseLabel.setBounds(27, 70 + (50*(i +1)), 500, 30);
					expenseLabel.setText(expenseList.get(i));
					expenseHistory.add(expenseLabel);
					System.out.println(expenseList.get(i));
				}

				expenseHistory.setVisible(true);
			}
		});
		printButton.setForeground(new Color(0, 100, 0));
		printButton.setBounds(507, 343, 146, 61);
		budgetPage.add(printButton);
		
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
