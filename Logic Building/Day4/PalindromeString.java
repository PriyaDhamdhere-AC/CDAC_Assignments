import java.util.*;
class PalindromeString{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		str.toLowerCase();
		/*boolean isPalindrome = true;
		for(int i = 0; i < str.length()/2; i++){
			if(str.charAt(i) != str.charAt(str.length()-1-i)){
				isPalindrome=false;
				break;
			}
		}
		if(isPalindrome){
			System.out.println("The string "+ str + " is palindrome");
		}else{
			 System.out.println("The string "+ str + " is not palindrome");
		}*/
		StringBuilder sb = new StringBuilder();
		for(int i = str.length()-1; i >=0; i--){
			sb.append(str.charAt(i));
		}
		if(sb.toString().equals(str)){
			  System.out.println("The string "+ str + " is palindrome");
		}else{
			  System.out.println("The string "+ str + " is not palindrome");
		}
	}
}

