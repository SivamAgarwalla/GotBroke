public class BudgetAmount 
{
	private double income;
	private double monthlyTotal;
	private double initialSavings;
	private double desiredSavings;
	private String errorMessage = null; 
	
	
	public void setMonthlyTotal(String _amount)
	{
		income = Double.parseDouble(_amount);
		monthlyTotal = income - initialSavings;
	}
	
	public void setDesiredSavings(String _savings)
	{
		initialSavings = Double.parseDouble(_savings);
		desiredSavings = initialSavings; 
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
			
			/*
			if(desiredSavings < remaining) {
				errorMessage = "You GOT BROKE!";
			}
			else
			{
			*/
				desiredSavings -= remaining;
				expenseAmount -= remaining; 
				monthlyTotal -= expenseAmount; 
				
			//}
		}
		
	}
	
	public double getConstantSpendAmount()
	{
		return income;
	}
	
	public double getConstantSaveAmount()
	{
		return initialSavings;
	}
	
	
	public double getMonthlyTotal()
	{
		return monthlyTotal;
	}
	
	public double getDesiredSavings()
	{
		return desiredSavings;
		
	}

}
