import java.util.*;
class EvenNum {
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the Number : ");
                int N = sc.nextInt();
                for(int i = 1; i <= N; i++){
                        if(i % 2 == 0){
			   System.out.print(i + " ");
			}
                }
                System.out.println();
        }
}
