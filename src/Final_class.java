import java.util.*;
public class Final_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.ASCII value
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character:");
		char a =sc.next().charAt(0);
		int a1=a;
		System.out.println("ASCII value="+a1);
		
		//2.Quetiont and Remainder
		int q=35;
		System.out.println("Quotient="+q/3);
		System.out.println("Remainder="+q%3);
		
		//swap 2 numbers without temp
		int s1=10,s2=14;
		System.out.println("s1="+s1+" "+"s2="+s2);
		s1=s1+s2; //s1=24
		s2=s1-s2;  //s2=10
		s1=s1-s2;
		System.out.println("s1="+s1+" "+"s2="+s2);
		
		//is alpha
		char ch='*';
		if(Character.isAlphabetic(ch))
		{
			System.out.println("it is a alphabet");
		}
		else {
			System.out.println("it is not a alphabet");
		}
		
		//char to int
		char c='A';
		int c1=c;
		System.out.println("char A to int="+c1);
		
		//vowel or consonant
		System.out.println("enter alphabet to check vowel or consonent");
		Scanner sc1= new Scanner(System.in); 
		char a11= sc1.next().charAt(0);
		switch(a11) {
		case 'a':{
			System.out.println("it is a vowel");
			break;
		}
			
		case 'e':
		{
			System.out.println("it is a vowel");
			break;
		}
		case 'i':
		{
			System.out.println("it is a vowel");
			break;
		}
		case 'o':
		{
			System.out.println("it is a vowel");
			break;
		}
		case 'u':
		{
			System.out.println("it is a vowel");
			break;
		}
		default:
			System.out.println("it is a consonent");
		}
		
		//largest among 3 numbers
		int h=8,v=9,b=10;
		if(h>v && h>b)
			System.out.println("largest is h="+h);
		else if(v>h && v>b)
			System.out.println("largest is v="+v);
		else if(b>h && b>v)
			System.out.println("largest is b="+b);
		else
			System.out.println("all are equal");
		
		//simple interest
		int p=56000,t=5;
		float r=2.5f;
		double si=p*r*t/100;
		System.out.println("simple interest="+si);
		
		//area and circum. of circle
		int r1=21;
		double area=3.14*r1*r1;
		System.out.println("area="+area);
		double circum=2*3.14*r1;
		System.out.println("circumference="+circum);	
	}

}
