import java.util.Scanner;
class SumOfN {
	void calculateSum(int num){
		int sum = 0;
		for(int i = 1; i <= num; i++){
			sum += i;
		}
		System.out.println(sum);
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		SumOfN obj = new SumOfN();
		obj.calculateSum(num);
	}
}
