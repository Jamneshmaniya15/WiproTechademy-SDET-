package Promises;

public class copyArray {

	public static void main(Stringa[] args) {
		// TODO Auto-generated method stub
		int src[] = {1,2,3,4,5};
		int des[] = new int[5];
		
		System.arraycopy(src, 1, des, 0, src.length);
		
		for (int x:des) {
			System.out.print(x +" ");
		}
	}

}
