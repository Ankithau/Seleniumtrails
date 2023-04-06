
public class Prime {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=11,count=0;
		
		for(i=2;i<=n;i++) {
			for(j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
		}
				if(count==2) 
				{
					System.out.println("it is prime num");
					
				}
				else
				{
					System.out.println("it is not a prime num");
				}
			}
			
		}

	

