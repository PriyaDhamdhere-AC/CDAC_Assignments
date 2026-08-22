import java.util.*;
class CheckNum{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the Size of Array : ");
                int size = sc.nextInt();
                Integer arr[] = new Integer[size];
                System.out.print("Enter the Element : ");
                for(int i = 0; i < size; i++){
                        arr[i] = sc.nextInt();
                }
		System.out.print("Enter the Check Element : ");
		int num = sc.nextInt();
                List<Integer> list = Arrays.asList(arr);
		if(list.contains(num)){
			System.out.println("Found");
		}else{
			System.out.println("Not Found");
		}
		             
        }
}
