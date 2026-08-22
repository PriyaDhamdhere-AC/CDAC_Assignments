import java.util.*;
class Question19{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row : ");
		int row = sc.nextInt();
		for(int i = 1; i <= row; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
