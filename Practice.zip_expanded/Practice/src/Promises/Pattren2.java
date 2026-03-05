package Promises;

public class Pattren2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for (int j =1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
				for(int i=4;i>=1;i--) {
					for (int j =1;j<=i;j++) {
				System.out.print("*");
			
		}
			System.out.println();
		}
				
				int n =6;
				
				for(int i =1;i<=n;i++) {
					for(int j = 1;j<=n-i;j++) {
						System.out.print(" ");
					
					}
					
					for(int k=1;k<=i;k++) {
						System.out.print("* ");
					}
					System.out.println();	
				}
				for(int i =n-1;i>=1;i--) {
					for(int j = 1;j<=n-i;j++) {
						System.out.print(" ");
					
					}
					
					for(int k=1;k<=i;k++) {
						System.out.print("* ");
					}
					System.out.println();	
				}
				System.out.println();
				
				//----------------------------//
				//int a=0;
				for(int i = 1;i<=n;i++) {
					for (int j =1;j<=i;j++) {
						if ((i+j)%2==0) {
							System.out.print("1");
						}else {
							System.out.print("0");
						}
					}
					System.out.println();
				}
				System.out.println();
				//----------------------------------------//
				for(int i =1-1;i<=n;i++) {
					for(int j = 1;j<=n-i;j++) {
						System.out.print(" ");
					
					}
					
					for(int k=1;k<=i;k++) {
						System.out.print(k);
					}
					for(int l =i-1;l>=1;l--) {
						System.out.print(l);
					}
					System.out.println();	
				}
				System.out.println();
				//---------------------------------------------//
				

						
						for(int i = 1; i<=n;i++) {
							for(int k = 1;k<=n-i;k++) {
								System.out.print(" ");
							}
							
							for(int j = 1;j<=i;j++) {
								System.out.print((char)('A'+j-1));
							}
						
							for(int l = i-1;l>=1;l--) {
								System.out.print((char)('A'+l-1));
							}
							System.out.println();
						}
					
					

				
	}

}
