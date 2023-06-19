package coreJava1;

import java.util.Scanner;

public class reportCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in); 
		System.out.println("What is your name:");
		String name= scan.nextLine();
		System.out.println("what is your student ID:");
		String sId= scan.nextLine();
		System.out.println("what is your Branch:");
		String branch= scan.nextLine();
		System.out.println("what is the Semester:");
		String sem= scan.nextLine();
	
		String[] inputs= {name, sId,branch,sem};
		
		System.out.println("==================================== ");	
		System.out.println("What is your Java grade:");
		int java= scan.nextInt();
		System.out.println("What is your Python grade:");
		int python= scan.nextInt();
		System.out.println("What is your Web grade:");
		int web= scan.nextInt();
		System.out.println("What is your C grade:");
		int cgrade = scan.nextInt();
		System.out.println("What is your CPP grade:");
		int cpp = scan.nextInt();
		System.out.println("What is your Spring boot grade:");
		int spring = scan.nextInt();
		
		int [] grade= {java, python,web,cgrade,cpp,spring};
		int total =0;
		int avg=0;
		for(int i:grade) {
			total+=i;
		}
		avg= total/grade.length;
		 String lGrade;
		 int range= avg/10;
		
		 switch (range) {
		 case 10:
		 	lGrade  = "A++";
		 	break;
         case 9:
             lGrade = "A++";
             break;
         case 8:
             lGrade = "A+";
             break;
         case 7:
             lGrade = "B++";
             break;
         case 6:
             lGrade = "B+";
             break;
         case 5:
             lGrade = "C";
             break;
         default:
             lGrade = "E";
             break;
     }
		
		
		System.out.println("CIT       REPORT       CARD ");
		System.out.println("==================================== ");
		System.out.println(name +"      " +sId +"     "+ branch+"    SEM"+sem);
		System.out.println("==================================== ");
		System.out.println("1. Java              "+java);
		System.out.println("2. Python            "+python);
		System.out.println("3. Web               "+web);
		System.out.println("4. C                 "+cgrade);
		System.out.println("5. CPP               "+cpp);
		System.out.println("6. Spring boot       "+spring);
		System.out.println("==================================== ");
		System.out.println("Total: "+ total+ "   Avg: "+avg +"   Grade: " +lGrade);
	}

}
