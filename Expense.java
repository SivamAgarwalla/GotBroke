public class Expense
{
	private String expenseType;
	private String expenseName;
	private double expenseAmount;
	

	public void setExpenseType(String _eType)
	{
		expenseType = _eType;
	}
	
	public void setExpenseName(String _eName)
	{
		expenseName = _eName;
		System.out.println(expenseName);
	}
	
	public void setExpenseAmount(String _eAmount)
	{
		expenseAmount = Double.parseDouble(_eAmount);
		System.out.println(expenseAmount);
	}
	
	public String getExpenseType()
	{
		return expenseType;
	}
	
	public String getExpensename()
	{
		return expenseName;
	}
	
	public double getExpenseAmount()
	{
		return expenseAmount;
	}
	
	@Override 
	public String toString()
	{
		return new String(expenseType + ": " + expenseName + " " + expenseAmount); 
	}
}
