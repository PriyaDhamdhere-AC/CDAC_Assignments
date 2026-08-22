import java.util.*;
class MultiBy3 {
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the Number : ");
                int N = sc.nextInt();
                for(int i = 1; i <= N; i++){
			if(i % 3 == 0){
                            System.out.print(i + " ");
			}
                }
                System.out.println();
        }
}
