public class BudgetAmount 
{
	private double MONTHLY_SPENDING;
	private double monthlyTotal;
	private double MONTHLY_SAVING;
	private double desiredSavings;
	private String errorMessage;
	
	
	public void setMonthlyTotal(String _amount)
	{
		double income = Double.parseDouble(_amount);
		System.out.println(income);
		MONTHLY_SPENDING = income - MONTHLY_SAVING; 
		monthlyTotal = MONTHLY_SPENDING; 
		System.out.println("" + monthlyTotal);
	}
	
	public void setDesiredSavings(String _savings)
	{
		double save = Double.parseDouble(_savings);
		System.out.println(save);
		MONTHLY_SAVING = save;
		desiredSavings = save;
		System.out.println("" + desiredSavings);
	}
	
	public void withdraw(String _expenseAmount)
	{
		double expenseAmount = Double.parseDouble(_expenseAmount);
		if(monthlyTotal >= expenseAmount)
		{
			monthlyTotal -= expenseAmount;
		}
		else
		{
			double remaining = Math.abs((monthlyTotal-expenseAmount));
			if(desiredSavings <= remaining)
				errorMessage = "You GOT BROKE!";
			else
			{
				desiredSavings -= remaining;
				expenseAmount -= remaining; 
				monthlyTotal -= expenseAmount; 
			}
		}
		
	}
	
	public double getConstantSpendAmount()
	{
		System.out.println("monthly spending: " + MONTHLY_SPENDING);
		return MONTHLY_SPENDING;
	}
	
	public double getConstantSaveAmount()
	{
		return MONTHLY_SAVING;
	}
	
	
	public double getMonthlyTotal()
	{
		System.out.println(monthlyTotal);
		return monthlyTotal;
	}
	
	public double getDesiredSavings()
	{
		System.out.println(desiredSavings);
		return desiredSavings;
		
	}

}
