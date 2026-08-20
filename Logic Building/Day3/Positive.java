import java.util.*;
class Positive {
	static void printEvenNumber(){
		Scanner sc = new Scanner(System.in);
		int num;
		do{
			System.out.print("Enter the num : ");
			num = sc.nextInt();
		}while(num <= 0);
			
  		System.out.println(num);
		
		}
		public static void main(String [] args){
		printEvenNumber();
	}
}
