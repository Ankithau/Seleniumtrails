
public class palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=122;
		int backup=num;
		int rev=0;
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(backup==rev) {
			System.out.println("given num  is  palidrome "  + backup);
		}
		else {
			System.out.println("given num  is NOT palidrome  " + backup);
		}
	}

}
