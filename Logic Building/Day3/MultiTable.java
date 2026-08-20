import java.util.*;
class MultiTable {
	static void printMultiplicationTable(int num){
		for(int i = 1; i <= 10; i++){
			System.out.print(num * i + " ");
		}
		//System.out.println();
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		printMultiplicationTable(num);
		System.out.println();
	}
}

