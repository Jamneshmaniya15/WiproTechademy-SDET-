package JamneshManiya;

public class EmployeeName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"Renu Sai","Akhil Kumar","John Doe","Meera"};
		for (int i=0;i<arr.length;i++) {
			String name = arr[i];
			System.out.println(name.toUpperCase());
			StringBuffer rev = new StringBuffer(name);
			System.out.println(rev.reverse());
			StringBuilder app = new StringBuilder(name);
			System.out.println(app.append("-verified"));
			if(name.length()>10) {
				System.out.println("Employee:"+name+"Long Name");
			}else if(name.contains(" ")) {
				System.out.println("Single Word Name");
			}else {
				System.out.println("Normal name");
			}
		}
	}

}