import java.util.*;
class SortArray{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the Size of Array : ");
                int size = sc.nextInt();
                int arr[] = new int[size];
                System.out.print("Enter the Element : ");
                for(int i = 0; i < size; i++){
                        arr[i] = sc.nextInt();
                }
		Arrays.sort(arr);
		for(int ele : arr){
			System.out.print(ele + " ");
		}
		System.out.println();
        }
}
