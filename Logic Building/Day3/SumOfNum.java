import java.util.*;
class SumOfNum {
	 static int sumOfTwoNumber(int a, int b){
		 return a + b;
	 }
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int a = sc.nextInt();
		System.out.print("Enter second number : ");
		int b = sc.nextInt();
		int sum = sumOfTwoNumber(a,b);
		System.out.println("The sum of " + a+ " and "+ b + " is " + sum);
	}
}
