class StringConcatenation{
	public static void main(String [] args){
		//String is immutable , if we perform any operation on string its address is change
		String str1 = "Hello";
		String str2 = "World";
		String str3 = str1 + str2;
		System.out.println("Is str3 pointing to the same object or not? : "+ (str3 == str1));
	}
}	
