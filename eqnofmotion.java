package chandriki1;
import java.util.Scanner;
public class eqnofmotion {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the final velocity:");
		int v=sc.nextInt();
		System.out.println("Enter the initial:");
		int u=sc.nextInt();
		System.out.println("Enter the displacement:");
		int s=sc.nextInt();
		System.out.println("Enter the acceleration:");
		int a=sc.nextInt();
		
	//solution
		float ans;
		ans=((v*v)-(u*u))/(2*a*s);
		System.out.println(ans);
		
	}

}
