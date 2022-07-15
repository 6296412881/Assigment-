package anudeep;
 import java.util.Scanner;
public class CountNotOfDigit {
	public static void main(String[] args) {
	int count=0,num,temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number:");
	num=sc.nextInt(); //1234
	
	temp=num;
	for(;num>0;)
	{
		count++;
		num=num/10;
	}
	System.out.println("total  number of digits "+temp +" are: " +count);
	}

}
