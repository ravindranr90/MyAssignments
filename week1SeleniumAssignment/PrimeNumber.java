package week1Assignment;

public class PrimeNumber {

	public static void main(String[] args) {
	int i,j;
	
	for(i=1;i<=10;i++) 
	{
		int count=0;
		for(j=1;j<=i;j++) 
		{
			
		if (i%j==0)
		{
			count++; //1
		}
		}
		if(count==2)
		{
			System.out.println(i);
		}
		}
	

}
}