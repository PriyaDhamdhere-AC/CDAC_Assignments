import java.util.*;
class Question17{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row : ");
		int row = sc.nextInt();
	
		for(int i = 0; i < row; i++){
			int count = 1;
			for(int j = 0; j < 2*i+1; j++){
				if(j % 2 == 0){
					System.out.print(count);
					count += 2;
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
