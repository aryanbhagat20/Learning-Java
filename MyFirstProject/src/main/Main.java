package main;
import java.util.Scanner;
import java.util.Timer;

public class Main {

	public static void main(String[] args) {
		 
	    /* 
	    Scanner sc = new Scanner(System.in) ;
	    System.out.println("Enter Your Name :");
	    String s = sc.nextLine() ;
	    System.out.println("Hello " + s + " have a good day"); 
	    */
		
		/* 
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter Kilometer :");
		float km = sc.nextFloat() ;
		Double miles = km*0.62137119 ;
		System.out.println(miles); 
		*/
		
		/*
		float total = 0;
		System.out.println("WELCOME TO THE CBSE PERCENTAGE MAKER");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Total marks of the subject (Eg:- 100, 80):") ;
		int total_marks = input.nextInt();
		System.out.print("Enter Marks Of Subject 1: ");
		float s1 = input.nextFloat();
		total = total + s1;
		System.out.print("Enter Marks Of Subject 2: ");
		float s2 = input.nextFloat();
		total = total + s2;
		System.out.print("Enter Marks Of Subject 3:");
		float s3 = input.nextFloat();
		total = total + s3;
		System.out.print("Enter Marks Of Subject 4: ");
		float s4 = input.nextFloat();
		total = total + s4;
		System.out.print("Enter Marks Of Subject 5:");
		float s5 = input.nextFloat();
		total = total + s5;
		float grandTotal = total * 100 / (total_marks*5);
		System.out.println("Your total Percentage = " + grandTotal + " percent");
		*/
		
		//int a =7*49/7 + 35/7;
	   //System.out.println(a);
		
		/*
		int v,u,a,s ;
		v = 5 ;
		u = 4;
		a = 6 ;
		s = 9 ;
	    float X = (v*v) - (u*u)/ (2*a*s)  ;
	    System.out.println(X) ;
	    */
		
		/*
		Scanner s = new Scanner(System.in);
		System.out.print("Enter You Name : ") ;
		String name = s.nextLine();
		System.out.printf("Your Name is : %s", name) ;
		*/
		
		/*
		String Name = new String("Aryan") ;
		System.out.println(Name) ;
		*/
		
		// System.out.println("Hi i'am \\\\ Aryan ") ;
		
		
		//Practice Set - 3 , Question - 3
		
		/* 
		String Letter = new String("Dear <Name> , Thanks a lot") ;
		System.out.println(Letter) ;
		System.out.println("Enter Your name :") ;
		Scanner d = new Scanner(System.in) ; 
		String name = d.nextLine();
		System.out.println(Letter.replace("<Name>",name)) ;
		*/
		
		//Practice Set - 3 , Question - 4
		
		/*
		String a = "Hi i am  Aryan   Bhagat" ;
		System.out.printf("Triple Space detected at Index no. : %s \n", a.indexOf("   ") );
		System.out.printf("Double Space detected at Index no. : %s \n", a.indexOf("  ") );
		*/
		
		/*
		System.out.println("Enter Your Age : ");
		Scanner s = new Scanner(System.in) ;
		int age = s.nextInt();
		if(age>=18) {
			System.out.println("Yes you can vote !!");
		}
		else {
			System.out.println("No you can't Vote");
		}
		*/
		
		//Practice Set - 4 , Question - 1
		
		/*
		int a = 10 ;
		if(a==11) {
		    System.out.println("i am 11");
		}
		else {
		System.out.println("i am not 11");
		}
		*/
		
		//Practice Set - 4 , Question - 2
		
		/*
		Scanner Marks = new Scanner(System.in);
		
		System.out.println("Enter your Hindi marks :") ;
		Float Hindi = Marks.nextFloat();
		
		System.out.println("Enter your English marks :") ;
		Float English = Marks.nextFloat();
		
		System.out.println("Enter your Maths marks :") ;
		Float Maths = Marks.nextFloat();
		
		Float TotalMarks = Hindi+English+Maths;
		Float TotalPercentage = TotalMarks/300*100;
		
		System.out.printf("Your Percentage is : %.2f \n", TotalPercentage);
		
		if(TotalPercentage>=40 && Hindi>=33 && English>=33 && Maths>=33) {
			System.out.println("You're passed");
		}
		else {
			System.out.println("You're Failed");
		}
		*/
		
		//Practice Set - 4 , Question - 3
		
		/*
		System.out.println("Enter your Yearly Income (In Thousand) : ");
		
		Scanner s = new Scanner(System.in);
		Float Income = s.nextFloat();
		
		if (Income>250000 && Income<5000000) {
			Float tax = (Income*5)/100;
			System.out.printf("Your Tax is : %.2f",tax); }
		
		else if (Income>500000 && Income<1000000) {
				Float tax = (Income*5)/100;
				System.out.printf("Your Tax is : %.2f",tax); }
		
		else if (Income>1000000) {
				Float tax = (Income*5)/100;
				System.out.printf("Your Tax is : %.2f",tax); }
		
		else {
			System.out.printf("You're Tax Free !!");
		}
		*/
	
		//Practice Set - 4 , Question - 4
		
		/*
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Day number :") ;
		int Day = s.nextInt();
		
		switch(Day){
			case 1 -> System.out.println("It' Monday");
			case 2 -> System.out.println("It' Tuesday");
			case 3 -> System.out.println("It' Wednesday");
			case 4 -> System.out.println("It' Thrusday");
			case 5 -> System.out.println("It' Friday");
			case 6 -> System.out.println("It' Saturday");
			case 7 -> System.out.println("It' Sunday");
			default -> System.out.println("Enter a valid number between 1-7");
		}
		*/
		
		//Practice Set - 4 , Question - 5
		
		/*
		System.out.println("Enter your Year to check :");
		
		Scanner s = new Scanner(System.in);
		int Year = s.nextInt();
		
		if ((Year % 4 == 0 && Year % 100 !=0) || (Year % 400 == 0)) {
			System.out.printf("%d is a Leap Year", Year) ;
		}
		else {
			System.out.printf("%d is not a Leap Year", Year) ;
		};
		*/
		
		//Practice Set - 4 , Question - 6
		
		/*
		System.out.println("Enter your Website url : ");
		
		Scanner s = new Scanner(System.in);
		String url = s.nextLine();
		
		if(url.endsWith(".com")) {
			System.out.printf("It's a Commercial Website") ; }
			
		else if(url.endsWith(".org")) {
			System.out.printf("It's a Organisation Website"); }
			
		else if(url.endsWith(".in")) {
			System.out.printf("It's a Indian Website"); }
		
		else {
			System.out.printf("This is a Jhantu Website");
		}
		*/
		
		//While loop
		
		/*
		int a = 100;
		while(a<=200) { //Condition
			System.out.println(a); //Work Statment
			++a; //Termination Condition
		} 
		*/
		
		//Do-While loop
		
		/*
		int a = 1;
		while(a<=10) { //Condition
			System.out.println(a); //Work
			a++; //Termination Condition
		}
		*/
	}
	
}
 
