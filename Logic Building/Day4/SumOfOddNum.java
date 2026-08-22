import java.util.*;
class SumOfOddNum {
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the Number : ");
                int N = sc.nextInt();
		int sum = 0;
                for(int i = 1; i <= N; i++){
                        if(i % 2 != 0){
                           sum += i;
                        }
                }
                System.out.println("The sum of odd Number from 1 to "+ N + " is : "+ sum);
        }
}
