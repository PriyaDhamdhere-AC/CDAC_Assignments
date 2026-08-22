import java.util.*;
class IndexOfArray{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the Size of Array : ");
                int size = sc.nextInt();
                int arr[] = new int[size];
                System.out.print("Enter the Element : ");
                for(int i = 0; i < size; i++){
                        arr[i] = sc.nextInt();
                }
		System.out.print("Enter the checked number : ");
		int num = sc.nextInt();
                Arrays.sort(arr);
		int index = Arrays.binarySearch(arr , num);
		if(index >= 0){
			System.out.println(index);
		}else{
			System.out.println("Not Found");
		}
		
        }
}
