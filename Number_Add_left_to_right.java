import java.util.*;
	public class Number_Add_left_to_right {

	    public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int a1=0,b1=0;
			while(a>0 || b>0)
			{
				int r=a%10;
				a1=a1*10+r;
				a/=10;
				
				r=b%10;
				b1=b1*10+r;
				b/=10;
			}
			a=a1+b1;
			int sum=0;
			while(a>0)
			{
				int r=a%10;
				sum=sum*10+r;
				a/=10;
			}
			System.out.print(sum);

		}
	}