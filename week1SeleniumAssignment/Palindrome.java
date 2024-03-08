package week1Assignment;

public class Palindrome {

	public static void main(String[] args) {
		int rem, rev=0, n=123;
		int i=n;
        while(n>0)
        {
        	rem = n%10;
        	rev= rev*10+rem;
        	n=n/10;		
        }
        if(i==rev) {
        	System.out.println(i+" Is a palindrome number");
        }
        else {
        	System.out.println(i+" Is NOT a palindrome number");
        }
	}

}
