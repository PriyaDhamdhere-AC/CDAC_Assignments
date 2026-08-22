import java.util.*;
class ReverseString{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		/*StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse().toString());*/
		String rev = "";
		for(int i = str.length()-1; i>=0; i--){
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}
}

