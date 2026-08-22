import java.util.*;
class AvgEle{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the Size of Array : ");
                int size = sc.nextInt();
                int arr[] = new int[size];
                System.out.print("Enter the Element : ");
                for(int i = 0; i < size; i++){
                        arr[i] = sc.nextInt();
                }
		int sum = 0 , avg = 0;
                for(int ele : arr){
                     	sum += ele;
                }
                System.out.println("The average of the element is : "+sum / size);
        }
}
