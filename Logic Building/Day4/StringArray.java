import java.util.*;
class StringArray{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int size = sc.nextInt();
		String arr [] = new String[size];
		System.out.print("Enter the name of Students : ");
		for(int i = 0; i < size; i++){
			arr[i] = sc.next();
		}
		for(String name : arr){
			System.out.println(name + " ");
		}
		
	}
}
