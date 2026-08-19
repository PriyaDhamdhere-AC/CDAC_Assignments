class UnintializedVariable {
		// In java global variable get the default value
		static byte a;
                static short b;
                static int c;
                static long d;
                static float e;
                static double f;
                static char g;
                static boolean h;
	public static void main(String [] args){
		// ****It give Error because in java local variable do not get default value; ****
	     /*	byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		char g;
		boolean h; */

		System.out.println("Byte : " + a);
		System.out.println("Short : " + b);
	 	System.out.println("Int : " + c);
		System.out.println("Long : " + d);
		System.out.println("Float : " + e);
	        System.out.println("Double : " + f);
	        System.out.println("Char : " + g);
	        System.out.println("Boolean : " + h);
	}
}	
