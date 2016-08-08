import java.util.Scanner;


public class PALIN {
public static void main(String args[])
{
	int i=121;
	int k=0;
	while(i!=0){
		k=k*10+i%10;
		i=i/10;
				
	}
	//System.out.println(a);
	if(i==k){
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not a palindrome");
	}
}
}
