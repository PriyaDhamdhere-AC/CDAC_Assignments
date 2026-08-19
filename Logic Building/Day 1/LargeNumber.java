class LargeNumber {
	public static void main(String [] args){
		int num1 = 20;
		int num2 = 30;
		int num3 = 10;
		if(num1 > num2 && num1 > num3){
			System.out.println(num1 + " is the Largest number");
		}else if(num2 > num1 && num2 > num3){
			System.out.println(num2 + " is the Largest number");
		}else{
			System.out.println(num3 + " is the Largest number");
		}
	}
}
