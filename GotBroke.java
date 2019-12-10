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
import javax.swing.JPanel;
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
	private static Expense expense; 
	private static double[] categoryTotals = new double[6];
	private static double totalSpending = 0.0;
	private static ArrayList<String> expenseList; 
	
	public static void main(String[] args)
	{
	
		//initialize budget container class
		BudgetAmount ba = new BudgetAmount();
		//initialize arraylist of total expenses 
		expenseList = new ArrayList<>(); 
		
		JFrame mFrame = new JFrame("CardLayout GotBroke");
		cl = new CardLayout(5, 5);
		
		//add all the panels to the cardlayout
		bsPanel = new JPanel(cl);
		//entry page for all users, includes name & month
		homeScreen = new HomeScreen();
		bsPanel.add(homeScreen, "HomeScreen");
		//2nd page, includes monthlyIncome and desiredSavings
		incomePage = new IncomePage();
		bsPanel.add(incomePage, "IncomePage");
		//3rd page, displays dynamic income & savings, add expense & print report buttons
		budgetPage = new BudgetPage();
		bsPanel.add(budgetPage, "BudgetPage");
		//4th page, allows user to add an expense, will adjust budget and report page
		expensePage = new ExpensePage();
		bsPanel.add(expensePage, "ExpensePage");
		//5th page, displays final report of user's data
		expenseHistory = new ExpenseHistory(); 
		bsPanel.add(expenseHistory, "ExpenseHistory"); 
		
		//button to move from homeScreen to incomePage
		JButton beginButton = new JButton("BEGIN");
		beginButton.addActionListener(e -> 
		{
			userName = ((HomeScreen) homeScreen).getNameField().getText(); 
			System.out.println(userName);
			budgetMonth = ((HomeScreen) homeScreen).getMonthField().getText(); 
			System.out.println(budgetMonth);
			homeScreen.setVisible(false);
			incomePage.setVisible(true);
		});
		beginButton.setForeground(new Color(0, 128, 0));
		beginButton.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		beginButton.setBounds(547, 395, 117, 29);
		homeScreen.add(beginButton);
		
		
		//Labels for the BudgetPage of monthly income and desired savings
		JLabel monthlyIncomeLabel = new JLabel();
		monthlyIncomeLabel.setForeground(new Color(0, 128, 0));
		monthlyIncomeLabel.setFont(new Font("Georgia", Font.PLAIN, 35));
		monthlyIncomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		monthlyIncomeLabel.setBounds(237, 147, 247, 46);
		budgetPage.add(monthlyIncomeLabel);
		
		JLabel initialSavingsLabel = new JLabel();
		initialSavingsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		initialSavingsLabel.setForeground(new Color(0, 128, 0));
		initialSavingsLabel.setFont(new Font("Georgia", Font.PLAIN, 35));
		initialSavingsLabel.setBounds(320, 244, 247, 46);
		budgetPage.add(initialSavingsLabel);
		
		//button to move from incomePage to budgetPage, sets initial Income and Savings
		JButton nextButton = new JButton("NEXT");
		nextButton.addActionListener(e -> 
		{
			ba.setDesiredSavings(((IncomePage) incomePage).getTextField().getText());
			ba.setMonthlyTotal(((IncomePage) incomePage).getTxtSdasda().getText());
			
			incomePage.setVisible(false);
			monthlyIncomeLabel.setText("" + df.format(ba.getMonthlyTotal()));
			initialSavingsLabel.setText("" + df.format(ba.getDesiredSavings()));
			budgetPage.revalidate();
			budgetPage.repaint();
			budgetPage.setVisible(true);
		});
		nextButton.setForeground(new Color(0, 100, 0));
		nextButton.setBounds(546, 394, 117, 29);
		incomePage.add(nextButton);
		
		//Button to move budgetPage to expensePage
		//initializes an instance of expense class
		JButton addExpenseButton = new JButton("ADD EXPENSES");
		addExpenseButton.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		addExpenseButton.addActionListener(e -> 
		{
			budgetPage.setVisible(false);
			expense = new Expense(); 
			expensePage.setVisible(true);
		});
		addExpenseButton.setForeground(new Color(0, 100, 0));
		addExpenseButton.setBounds(20, 343, 146, 61);
		budgetPage.add(addExpenseButton);
		
		//Button to calculate expense differences and move back to budgetPage
		//builds an array that calculates expenses per category type
		JButton finishButton = new JButton("FINISH");
		finishButton.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		finishButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ba.withdraw(((ExpensePage) expensePage).getTextField2().getText());
				monthlyIncomeLabel.setText("" + df.format(ba.getMonthlyTotal()));
				if(ba.getDesiredSavings() >= 0)
					initialSavingsLabel.setText("" + df.format(ba.getDesiredSavings()));
				else
				{
					initialSavingsLabel.setText("" + df.format(ba.getDesiredSavings()));
					initialSavingsLabel.setForeground(new Color(255, 0, 0));
					JLabel gotBrokeLabel = new JLabel("YOU GOT BROKE!");
					gotBrokeLabel.setForeground(Color.RED);
					gotBrokeLabel.setFont(new Font("Lucida Grande", Font.BOLD, 30));
					gotBrokeLabel.setHorizontalAlignment(SwingConstants.CENTER);
					gotBrokeLabel.setBounds(180, 292, 304, 72);
					budgetPage.add(gotBrokeLabel);
				}
				//set all values for initialized expense 
				String expenseType = ((ExpensePage) expensePage).getType();
				expense.setExpenseType(expenseType);
				if(expenseType.equals("Housing"))
					categoryTotals[0] += Double.parseDouble(((ExpensePage) expensePage).getTextField2().getText());
				
				else if(expenseType.equals("Transportation"))
					categoryTotals[1] += Double.parseDouble(((ExpensePage) expensePage).getTextField2().getText());
					
				else if(expenseType.equals("Recreational"))
					categoryTotals[2] += Double.parseDouble(((ExpensePage) expensePage).getTextField2().getText());
					
				else if(expenseType.equals("Education"))
					categoryTotals[3] += Double.parseDouble(((ExpensePage) expensePage).getTextField2().getText());
					
				else if(expenseType.equals("Medical"))
					categoryTotals[4] += Double.parseDouble(((ExpensePage) expensePage).getTextField2().getText());
					
				else if(expenseType.equals("Food"))
					categoryTotals[5] += Double.parseDouble(((ExpensePage) expensePage).getTextField2().getText());
					
				expense.setExpenseName(((ExpensePage) expensePage).getTextField1().getText()); 
				expense.setExpenseAmount(((ExpensePage) expensePage).getTextField2().getText());
				expenseList.add(expense.toString());
				budgetPage.revalidate();
				budgetPage.repaint();
				budgetPage.setVisible(true);
				expensePage.setVisible(false);
			}
		});
		finishButton.setForeground(new Color(0, 100, 0));
		finishButton.setBounds(269, 368, 127, 42);
		expensePage.add(finishButton);
		
		//labels for final monthly expense report: username & month 
		JLabel nameMonthLabel = new JLabel();
		nameMonthLabel.setForeground(new Color(0, 100, 0));
		nameMonthLabel.setFont(new Font("Georgia", Font.BOLD, 25));
		nameMonthLabel.setHorizontalAlignment(SwingConstants.LEFT);
		nameMonthLabel.setBounds(20, 0, 297, 47);
		expenseHistory.add(nameMonthLabel);
		
		//labels for final monthly expense report for users including initial and remaining income and savings. 
		JLabel incomeLabel = new JLabel();
		incomeLabel.setForeground(new Color(0, 100, 0));
		incomeLabel.setFont(new Font("Georgia", Font.PLAIN, 17));
		incomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		incomeLabel.setBounds(210, 76, 145, 19);
		expenseHistory.add(incomeLabel);
		
		JLabel dSavingLabel = new JLabel();
		dSavingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dSavingLabel.setForeground(new Color(0, 100, 0));
		dSavingLabel.setFont(new Font("Georgia", Font.PLAIN, 17));
		dSavingLabel.setBounds(210, 104, 145, 19);
		expenseHistory.add(dSavingLabel);
		
		JLabel totalSpendLabel = new JLabel();
		totalSpendLabel.setHorizontalAlignment(SwingConstants.LEFT);
		totalSpendLabel.setForeground(new Color(255, 0, 0));
		totalSpendLabel.setFont(new Font("Georgia", Font.PLAIN, 19));
		totalSpendLabel.setBounds(240, 303, 145, 30);
		expenseHistory.add(totalSpendLabel);
		
		JLabel endSaveLabel = new JLabel();
		endSaveLabel.setHorizontalAlignment(SwingConstants.LEFT);
		endSaveLabel.setForeground(new Color(0, 100, 0));
		endSaveLabel.setFont(new Font("Georgia", Font.PLAIN, 22));
		endSaveLabel.setBounds(240, 350, 145, 40);
		expenseHistory.add(endSaveLabel);
		
		//button to move from budgetPage to expenseHistory & display data about the user
		JButton printButton = new JButton("VIEW REPORT");
		printButton.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		printButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				budgetPage.setVisible(false);
				String nameMonth = userName + "'s " + budgetMonth; 
				System.out.println(nameMonth);
				nameMonthLabel.setText(nameMonth);
				for(int i = 0; i < expenseList.size(); i++) {
					JLabel expenseLabel = new JLabel();
					expenseLabel.setHorizontalAlignment(SwingConstants.LEFT);
					expenseLabel.setForeground(new Color(0, 0, 0));
					expenseLabel.setFont(new Font("Georgia", Font.PLAIN, 15));
					expenseLabel.setBounds(370, 30 + (20*(i)), 250, 30);
					expenseLabel.setText(expenseList.get(i));
					expenseHistory.add(expenseLabel);
				}
				//display initial values from user
				incomeLabel.setText("$" + df.format(ba.getConstantSpendAmount()));
				dSavingLabel.setText("$" + df.format(ba.getConstantSaveAmount()));
				//calculate end results for user
				for(int j = 0; j < categoryTotals.length; j++)
				{
					totalSpending += categoryTotals[j];
				}
				
				totalSpendLabel.setText("$ " + df.format(totalSpending));
				
				if(ba.getConstantSpendAmount() > totalSpending)
				{
					endSaveLabel.setText("$ " + df.format((ba.getConstantSpendAmount() - totalSpending)));
				}
				else
					endSaveLabel.setText("$ 0.00");
				
				//create a new label for each category & spending
				for(int i = 0; i < categoryTotals.length; i++)
				{
					JLabel reportLabel = new JLabel();
					reportLabel.setForeground(new Color(255, 0, 0));
					reportLabel.setFont(new Font("Georgia", Font.PLAIN, 15));
					reportLabel.setHorizontalAlignment(SwingConstants.CENTER);
					reportLabel.setBounds(200, 159 + (21*i), 140, 16);
					reportLabel.setText("$ " + df.format(categoryTotals[i]));
					expenseHistory.add(reportLabel);
				}
				expenseHistory.setVisible(true);
			}
		});
		printButton.setForeground(new Color(0, 100, 0));
		printButton.setBounds(507, 343, 146, 61);
		budgetPage.add(printButton);
		
		//button to move from report back to budgetPage
		JButton backButton = new JButton("GO BACK");
		backButton.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		backButton.addActionListener(e -> 
		{
			totalSpending = 0.0;
			expenseHistory.setVisible(false);
			budgetPage.setVisible(true);
		});
		backButton.setForeground(new Color(0, 100, 0));
		backButton.setBounds(507, 343, 146, 61);
		expenseHistory.add(backButton);
		
		
		mFrame.add(bsPanel);
		cl.show(bsPanel, "bs");
		homeScreen.setVisible(true);
		mFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mFrame.setLocationRelativeTo(null);
		mFrame.setSize(700, 480);
		mFrame.setVisible(true);
		
		
	}	

}
