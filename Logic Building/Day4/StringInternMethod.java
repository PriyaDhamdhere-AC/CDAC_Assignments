class StringInternMethod{
	public static void main(String [] args){
		String str1 = new String("Java");
		String str2 = str1.intern();
		String str3 = "Java";
		System.out.println("Is str2 and str3 is pointing to the same object or not ? "+(str2 == str3));
	}
}
