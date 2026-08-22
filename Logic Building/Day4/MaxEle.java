import java.util.*;
class MaxEle{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the Size of Array : ");
                int size = sc.nextInt();
                int arr[] = new int[size];
                System.out.print("Enter the Element : ");
                for(int i = 0; i < size; i++){
                        arr[i] = sc.nextInt();
                }
                int max = Integer.MIN_VALUE;
		for(int i = 0; i < size; i++){
			/*if(arr[i] > max){
				max = arr[i];
			}*/
			max = Math.max(max, arr[i]);
		}
		System.out.println("The Largest Element is : "+ max);
        }
}
