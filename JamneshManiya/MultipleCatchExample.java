package JamneshManiya;

public class MultipleCatchExample {
public static void main(String[] args)
{
try {
	int arr[]= {10, 20, 30};
	
	for (int i=0 ; i< arr.length;i++) {
		arr[i]/=0;
	}
	
	System.out.println(arr[5]);
	
	}
	 catch(ArithmeticException e)
	{
	System.out.println(" Arithmetic Exception occurred");
	}
 
	catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("Array index out of");
}
catch (Exception e)
{
		System.out.println("Generic Exception");
}
}
}