public class Expense
{
	private String expenseType;
	private String expenseName;
	private double expenseAmount;
	
	/*
	public Expense(String expenseType, String expenseName, double expenseAmount) 
	{
		this.expenseType = expenseType; 
		this.expenseName = expenseName; 
		this.expenseAmount = expenseAmount;
	}
	*/
	
	public void setExpenseType(String _eType)
	{
		expenseType = _eType;
		System.out.println(expenseType);
	}
	
	public void setExpenseName(String _eName)
	{
		expenseName = _eName;
		System.out.println(expenseName);
	}
	
	public void setExpenseAmount(String _eAmount)
	{
		expenseAmount = Double.parseDouble(_eAmount);
	}
	
	public String getExpenseType()
	{
		return expenseType;
	}
	
	public String getExpensename()
	{
		return expenseName;
	}
	
	public double expenseAmount()
	{
		return expenseAmount;
	}
	
}
