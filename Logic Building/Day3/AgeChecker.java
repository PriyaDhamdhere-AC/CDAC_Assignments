import java.util.Scanner;
class AgeChecker {
	static void checkAgeCategory(int age){
		if(age < 18){
			System.out.println("Minor");
		}else if(age >= 18 && age <= 50){
			System.out.println("Adult");
		}else{
			System.out.println("Senior citizon");
		}
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Age : ");
		int age = sc.nextInt();
		checkAgeCategory(age);
	}
}
