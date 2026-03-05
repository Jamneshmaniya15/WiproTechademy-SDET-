package JamneshManiya;

class Data
{
	int bal;
	int amt;
	
	Data(int bal,int amt){
		this.bal=bal;
		this.amt=amt;
	}
	
	public void deposit()
	{
		if (amt>0) {
			bal+=amt;
		}else {
			System.out.println("Invalid Deposit amt");
		}
	}
	
	public void withdraw()
	{
		if (amt >0 && amt<=bal) {
			bal-=amt;
		}else {
			System.out.println("Invalid wuthdraw amt");
		}
	}
	
	public void displayBalance() {
		System.out.println(bal);
	}
}



public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data(1000,100);
		d.deposit();
		d.displayBalance();
		d.withdraw();
		d.displayBalance();

	}

}