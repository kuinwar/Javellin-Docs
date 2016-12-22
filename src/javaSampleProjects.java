import java.util.Scanner;

//To test no is Prime or Not

public class javaSampleProjects {
	

	
	public static void main (String [] args)
	{
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter a number to check Prime or not:");

		int num=scan.nextInt();
		int flag=0;

	for (int i=2;i<=num/2;i++)
		
	{

		int num2 = num%i;
		if(num2== 0)
		{
			System.out.println(num2 + "Num is not Prime");
			flag=1;
			break;

		}
		if(flag ==0) 
		{
			System.out.println(num2 + "Num is Prime");
		}	

}
} 
}  


