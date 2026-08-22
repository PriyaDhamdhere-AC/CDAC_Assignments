import java.util.*;
class StringLiteral{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str1 = "Java";
		String str2 = "Java";
		System.out.println("Both variables point to the same object : " + (str1 == str2));
	}
}
