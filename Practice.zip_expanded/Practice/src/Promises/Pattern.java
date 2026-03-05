package Promises;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Square
		int m = 5;
		int n=7;
		
		for (int i = 1;i<=m;i++) {
			for (int j=1;j<=n;j++) {
				if (i==1 || j==1 || i==m || j==n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}				
			}
			System.out.println();
		}
		System.out.println();
		//--------//

		int a = 5;
		for (int i = 1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//----------//
		
		for (int i=a;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//--------------//
		for (int i=1;i<=a;i++) {
			for (int j = 1;j<=a-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//-----------------------//
		for(int i = 1; i <= a ; i++) {
			for (int j = 1; j<=i ;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		//--------------------------?//
		for(int i = a; i>=1;i--) {
			for (int j = 1; j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		//----------------------------//
		int q=1;
		for(int i = 1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(q);
				q++;
			}
			System.out.println();
		}
		//----------------------------//
				for(int i = 1;i<=a;i++) {
					for(int j=1;j<=i;j++) {
						int sum = i+j;
						if(sum%2==0) {
							System.out.print("1");
						}else {
							System.out.print("0");
						}
					}
					System.out.println();
				}
				System.out.println();

				//----------------------------//
				for(int i = 1;i<=a;i++) {
					for(int j=1;j<=i;j++) {
						System.out.print("*");
					}
					for(int k = 1;k<=2*(a-i);k++) {
						System.out.print(" ");
					}
					for(int j=1;j<=i;j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				for(int i = a-1;i>=1;i--) {
					for(int j=1;j<=i;j++) {
						System.out.print("*");
					}
					for(int k = 1;k<=2*(a-i);k++) {
						System.out.print(" ");
					}
					for(int j=1;j<=i;j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				System.out.println();
				//----------------------------//
				for(int i = a;i>=1;i--) {
					for(int j=1;j<=i;j++) {
						System.out.print(" ");
					}
					System.out.println("****");
					System.out.println();
				}
				
	
	}

}
