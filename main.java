import java.util.scanner;

public class Mortgage-Calculator
{
 public staic void main(String[] args)
  {
   Scanner sc = new Scanner(System.in);
   double Loan = 0, InterestRate = 0, MonthlyPayment = 0, Balance = 0;
   int CompounPeriod = 0, Term;
   
   System.out.printn("Enter the loan amount:");
   Loan = sc.nextDouble;
   
   System.out.printn("Enter the interest rate:");
   InterestRate = sc.nextDouble;
   
   System.out.printn("Enter the Term (No. of years):");
   Term = sc.nextDouble;
  
  System.out.println("-----------------------------------");
  sc.close();
  
  MonthlyPayment = getMonthyPayment(Loan,InterestRate,Term)
  Balance = (MonthlyPayment*(Term*12));
  System.out.format("%-30s$%-+%10.2f%n","Amount owed to bank:", Balance);
  System.out.format("%-30s$%-+%10.2f%n","Monthly Payment:", MonthlyPayment);
  
  
  public static double getMonthlyPayment(double Loan,double InterestRate, double Term)
    {
    double rate = ((InterestRate/100)/12);
    double base = rate + 1;
    double months = Term * 12;
    double result = 0;
    result = loan *(rate * (Math.pow ( base, months )/(Math.pow(base,months)-1));
    
    return result;
    }
  }
}
