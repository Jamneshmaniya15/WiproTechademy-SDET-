package JamneshManiya;
import java.util.*;

public class BankLoanEligibilitySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer age = 24;
		Integer cibil = 400;
		
		ArrayList<Double>MonthlyIncome = new ArrayList();
		MonthlyIncome.add(35000.0);
		MonthlyIncome.add(54000.0);
		MonthlyIncome.add(35000.0);
		
		
		System.out.println("Loan Eligibility");
		
		for (Double income :MonthlyIncome)
		{
			if(income > 30000.0 && age>21 && cibil >=200)
			{
				System.out.println("Loan Approved  ");
			}
			else
			{
				System.out.println("Loan Rejected ");
			}
		}
	}

}