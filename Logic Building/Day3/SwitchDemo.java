import java.util.*;
class SwitchDemo {
                static byte a;
                static int b;
                static long c;
                static float d;
                static double e;
                static boolean f;
                static char g;
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int choice ;
		do{
			System.out .println("1. Grade Choice ");
			System.out .println("2. Leap Year ");
			System.out .println("3. Day of Week ");
		   	System.out .println("4. Default Value ");
		        System.out .println("5. Exit ");	
			System.out.print("Enter the Choice : ");
			choice = sc.nextInt();

			switch(choice){
				case 1 :
					System.out.print("Enter the Marks : ");
					int marks = sc.nextInt();
					if(marks >= 90){
						System.out.println("Grade A");
					}else if(marks >= 70){
						System.out.println("Grade B");
                                        }else if(marks >= 40){
						 System.out.println("Grade C");
                                        }else{
						 System.out.println("fail");
                                        }
					break;

				case 2 :
					 System.out.print("Enter the Year : ");
					 int year = sc.nextInt();
					 if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
						 System.out.println(year + " is leap year");
					 }else{
						  System.out.println(year + " is not leap year");
					 }
					 break;

				case 3 :

					System.out.print("Enter the Day : ");
					int day = sc.nextInt();
					switch(day){
						case 1 :
							System.out.println("Monday");
							break;
						case 2 :
							System.out.println("Tuesday");
                                                        break;
						case 3 :
							System.out.println("Wednesday");
                                                        break;
						case 4 :
							System.out.println("Thrusday");
                                                        break;
						case 5 :
							System.out.println("Friday");
                                                        break;
						case 6 :
							System.out.println("Saturday");
                                                        break;
						case 7 :
							System.out.println("Sunday");
                                                        break;
						default :
							System.out.println("Invalid Choice");
						}
						break;
					
				case 4 :
						System.out.println("byte " + a);
						System.out.println("int " + b);
						System.out.println("long " + c);
						System.out.println("float " + d);
						System.out.println("double " + e);
						System.out.println("boolaen " + f);
						System.out.println("char " + g);
						break;
				case 5 :
						System.out.println("Program is Exit");
						break;
				}
			}while(choice != 5);
		}
	}

