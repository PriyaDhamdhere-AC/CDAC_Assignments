import java.util.*;
class Question15{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row : ");
		int row = sc.nextInt();
		int count = 1;
		for(int i =1; i <= row; i++){
			for(int j =1; j <= 2*i-1; j++){
				if(j %2 != 0){
					System.out.print(count);
					
				}else{
					System.out.print("*");
				}
			}
			count++;
			System.out.println();
		}
		for(int i = row; i > 1; i--){
			for(int j = 1; j <= 2*i-1; j++){
				if(j % 2 != 0){
					System.out.print(count-1);
				}else{
					System.out.print("*");
				}
			}
			count--;
			System.out.println();
		}
	}
}
