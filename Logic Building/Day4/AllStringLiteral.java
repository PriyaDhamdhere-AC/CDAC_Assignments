class AllStringLiteral{
	public static void main(String [] args){
		String str1 = "Java";
		String str2 = "Java";
		String str3 = "Java";
		System.out.println("str1 and str2 pointing to the same object or not ? "+ (str1 == str2));
	 	System.out.println("str1 and str3 pointing to the same object or not ? "+ (str1 == str3));
		System.out.println("str2 and str3 pointing to the same object or not ? "+ (str2 == str3));
	}
}
