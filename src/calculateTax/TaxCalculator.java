package calculateTax;

public class TaxCalculator {
	public static void main(){
	}
	public int calculateTax(int status, int income){
		double tax;
		tax = 0;
		if(status == 1)
		{
			if(income >=0 && income <= 6000)
			{
				tax = 0;
			}
			else if(income >6000 && income <=55000)
			{
				tax = (double) ((income - 6000) * 0.1);
				
			}
			else if(income > 55000 && income <= 105000)
			{
				tax = (double)((income - 55000) * 0.2 + 4900);
			}
			else if(income > 105000 && income <= 160000)
			{
				tax = (double)((income - 105000) * 0.3 + 14900);
			}
			else if(income > 160000)
			{
				tax = (double)((income - 160000) *0.4 + 31400);
			}
			else {
				throw new IllegalArgumentException("Income should not be negative.");
			}

			return (int) Math.round(tax);
		}
		if(status == 2)
		{
			if(income >= 0 && income <= 10000)
			{
				tax = 0;
			}
			else if(income > 10000 && income <= 70000)
			{
				tax = (double)((income - 10000) * 0.1);
			}
			else if(income > 70000 && income <= 120000)
			{
				tax = (double)((income - 70000) * 0.2 + 6000);
			}
			else if(income > 120000 && income <= 250000)
			{
				tax = (double)((income - 120000) * 0.3 + 16000);
			}
			else if(income > 250000)
			{
				tax = (double)((income - 250000) * 0.4 + 55000);
			}
			else {
				throw new IllegalArgumentException("Income should not be negative.");
			}
			
		}
		else {
			throw new IllegalArgumentException("Status should be 1 or 2.");
		}
		return (int) Math.round(tax); 
	}
}
