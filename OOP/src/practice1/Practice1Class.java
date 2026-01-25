package practice1;
import java.util.Scanner;

public class Practice1Class {
	public static void main(String[] args) {
		printMyName(); //problem #1
		
		//problem #2
		System.out.println("Please enter the side length of the square:");
		
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int area = calcArea(length);
		int perimeter = calcPer(length);
		double diagonal = calcDiagonal(length);
		System.out.printf("For a square with side length %d the area is %d, the perimeter is %d and the diagonal is %.2f %n", length, area, perimeter, diagonal);
		
		//problem #3
		System.out.println("Please enter the grade:");
		
		int grade = scanner.nextInt();
		String resGrade = calcGrade(grade);
		System.out.printf("Your grade is %s %n", resGrade);
		
		//problem #4
		System.out.println("Please enter 3 coefficients: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		rootOfQuadEq(a,b,c);
		
		//problem #5
		System.out.println("Please enter balance and interest:");
		int balance = scanner.nextInt();
		int interest = scanner.nextInt();
		scanner.nextLine(); //to avoid skip
		addInterest(balance, interest);
		
		//problem #6
		System.out.println("Please enter your word:");
		String word = scanner.nextLine();
		if(isPalindrome(word)) System.out.println("Palindrome!");
		else System.out.println("No");
	}
	
//problem #1
	public static void printMyName() {
		System.out.println("+---+\n|Eva|\n+---+");
	}
	
//problem #2
	public static int calcArea(int a) {
		return a*a;
	}
	
	public static int calcPer(int a) {
		return a*4;
	}
	
	public static double calcDiagonal(int a) {
		return a*Math.sqrt(2);
	}	
	
//problem #3
	public static String calcGrade(int grade) {
		if(grade<0 || grade>100) return "error";
		if(grade<50 && grade>-1) return "F";
		else if(grade<55) return "D";
		else if(grade<60) return "D+";
		else if(grade<65) return "C-";
		else if(grade<70) return "C";
		else if(grade<75) return "C+";
		else if(grade<80) return "B-";
		else if(grade<85) return "B";
		else if(grade<90) return "B+";
		else if(grade<95) return "A-";
		else return "A";
	}
	
//problem #4
	public static void rootOfQuadEq(int a, int b, int c) {
		double d = b*b-4*a*c;
		if(d<0) {
			System.out.println("complex root");
			return;
		}
		else {
			d=Math.sqrt(d);
			double denominator = 2*a;
			double root1 = (-b+d)/denominator;
			double root2 = (-b-d)/denominator;
			System.out.printf("roots: %.2f and %.2f %n", root1, root2);
		}
	}
	
//problem #5
	public static void addInterest(double balance, double interest) {
		double newBalance = balance + balance*interest/100;
		System.out.printf("New balance: %.2f %n", newBalance);
	}

//problem #6
	public static boolean isPalindrome(String word) {
		for(int i=0;i<word.length()/2;i++) {
			if(word.charAt(i)!=word.charAt(word.length()-i-1)) {
				return false;
			}
		}
		return true;
	}
}
