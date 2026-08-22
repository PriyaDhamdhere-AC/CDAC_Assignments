import java.util.*;
class StringCreationNew{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                String str1 = new String("Java");
                String str2 = new String("Java");
                System.out.println("By == method = "+"Both variables point to the same object : " + (str1 == str2));
		System.out.println("By equals() method = "+"Both variables point to the same object : " + (str1.equals(str2)));
        }
}
