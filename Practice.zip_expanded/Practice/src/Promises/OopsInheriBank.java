package Promises;

class Account1
{
	String name;
	int accNo;
	double bal;
	
	Account1(String name,int accNo,double bal)
	{
		this.name=name;
		this.accNo=accNo;
		this.bal=bal;
	}
	
	void deposit(double amt) {
		bal+=amt;
		System.out.println("deposited " +amt );
	}
	
	void t_bal()
	{
		System.out.println("total bal : " +bal);
	}
}

class Current_acc extends Account1
{
	double min_bal=1000;
	double pen =100;
	Current_acc(String name,int accNo,double bal)
	{
		super(name,accNo,bal);
	}
	
	void withdraw(double amt)
	{
		bal-=amt;
		if (bal < min_bal)
        {
            bal -= pen;
            System.out.println("Penalty imposed: " + pen);
        }
    }
	
	
	
}

class Saving_acc extends Account1
{
	double rate = 0.05;
	Saving_acc(String name,int accNo,double bal)
	{
		super(name,accNo,bal);
	}
	
	void ComputeInterest() {
		double inte = bal*rate;
		bal +=inte;
		System.out.println("interest added " +inte);
	}
	
	void withdraw(double amt) {
		if(bal>=amt) {
			bal-=amt;
		}else {
			System.out.println(":Not sufficient balance" );
		}
	}
}

public class OopsInheriBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saving_acc s = new Saving_acc("Ravi", 101, 5000);
        s.deposit(1000);
        s.ComputeInterest();
        s.withdraw(2000);
        s.t_bal();

        System.out.println("------");

        Current_acc c = new Current_acc("Amit", 102, 3000);
        c.withdraw(2200);
        c.t_bal();
	}

}
