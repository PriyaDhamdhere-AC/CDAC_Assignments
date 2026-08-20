import java.util.*;
class EvIenNumber {
	static void printEvenNumber(int num){
		for(int i = 1; i <= num; i++){
			if(i % 2 == 0){
				System.out .print(i+ " ");
			}
		}
		System.out.println();
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		printEvenNumber(num);
	}
}
