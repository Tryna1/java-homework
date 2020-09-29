

import java.util.Scanner;

//public class  three {
//
//	public static void main(String[] args) {
//		int month = (int)(Math.random()*12+1);
//		String s = new String ("");
//		if(month == 1) {
//			s="January";
//		}
//		else if(month == 2) {
//			s="February";
//		}
//		else if(month == 3) {
//			s="March";
//		}
//		else if(month == 4) {
//			s="April";
//		}
//		else if(month == 5) {
//			s="May";
//		}
//		else if(month == 6) {
//			s="June";
//		}
//		else if(month == 7) {
//			s="July";
//		}
//		else if(month == 8) {
//			s="August";
//		}
//		else if(month == 9) {
//			s="September";
//		}
//		else if(month == 10) {
//			s="October";
//		}
//		else if(month == 11) {
//			s="November";
//		}
//		else if(month == 12) {
//			s="December";
//		}
//		System.out.println(s);
//	}
//
//}                                //3.4



//public class three {
//
//      public static void main(String[] args) { 
//    	  Scanner input = new Scanner(System.in);
//    	  System.out.print("Enter the first 9 digits of an ISBN as integer: ");
//    	  int[]  d=new int[20];
//    	  int D = input.nextInt();
//    	  for(int i = 9; i>= 1 ;i-- ) {
//    		  d[i] = D%10;
//    		  D = D/10;
//    		  d[10] +=d[i]*i;
//    	  }
//    	  d[10] %= 11;
//    	  System.out.print("The ISBN-10 number is ");
//    	  for(int i = 1; i<= 9;i++) {
//    		  System.out.print(d[i]);
//    	  }
//    	  if(d[10] == 10) System.out.print("X");
//    	  else  System.out.print(d[10]);
//}
//
//}                                //3.9


//public class three {
//
//      public static void main(String[] args) {
//    	  int a = (int)(Math.random()*900+100);
//    	  Scanner input = new Scanner(System.in);
//    	  System.out.print("输入一个三位整数: ");
//    	  int b = input.nextInt();
//    	  int a1 , a2 , a3 , b1 , b2 , b3;
//    	  a1 = a/100;
//    	  a2 = a/10%10;
//    	  a3 = a%10;
//    	  b1 = b/100;
//    	  b2 = b/10%10;
//    	  b3 = b%10;
//    	  if(a == b) {
//    		  System.out.println("奖金是 10000 美元");
//    	  }
//    	  else if(((a1==b1)&&(a2==b2)&&(a3==b3))||((a1==b1)&&(a2==b3)&&(a2==b3))||((a1==b2)&&(a2==b1)&&(a3==b3))||(a1==b2)&&(a2==b3)&&(a3==b1)||((a1==b3)&&(a2==b2)&&(a3==b1))||(a1==b3)&&(a2==b1)&&(a3==b2)) {
//    		  System.out.println("奖金是 3000 美元");
//    	  }
//    	  else if((a1==b1)||(a1==b2)||(a1==b3)||(a2==b1)||(a2==b2)||(a2==b3)||(a3==b1)||(a3==b2)||(a3==b3)) {
//    		  System.out.println("奖金是 1000 美元");
//    	  }
//    	  else System.out.println("没有奖金");
//}
// 
//}                                     // 3.15


//public class three {
//
//    public static void main(String[] args) {
//    	Scanner input = new Scanner(System.in);
//    	double a = input.nextDouble();
//    	double b = input.nextDouble();
//    	double c = input.nextDouble();
//    	double C = a+b+c;
//    	if((a+b>c)&&(a+c>b)&&(b+c>a)) {
//    		System.out.println(C);
//    	}
//    	else System.out.println("输入的三角形不合法");
//	 
//}
//
//}                                    //  3.19


//public class three {
//
//    public static void main(String[] args) {
//    	Scanner input = new Scanner(System.in);
//    	System.out.print("Enter year: (e.g., 2012): ");
//    	int year = input.nextInt();
//    	System.out.print("Enter month: 1-12: ");
//    	int month = input.nextInt();
//    	System.out.print("Enter the day of the month: 1-31: ");
//    	int day = input.nextInt();
//	    double q = day;
//	    double m = month;
//	    if(month==1||month==2) {
//	    	m+=12;
//	    	year-=1;
//	    };
//	    double j = (int)(year/100) ;
//	    double k = year%100;
//	    double h = (q + (26*(m+1)/10) + k + (k/4) + (j/4) + 5*j);
//	    h = (int)(h%7);
//	    System.out.print("Day of the week is ");
//	    if(h == 0) System.out.println("Saturday");
//	    else if(h == 1) System.out.println("Sunday");
//	    else if(h == 2) System.out.println("Monday");
//	    else if(h == 3) System.out.println("Tuesday");
//	    else if(h == 4) System.out.println("Wednesday");
//	    else if(h == 5) System.out.println("Thursday");
//	    else System.out.println("Friday");
//}
// 
//}                                    // 3.21


//public class three {
//
//    public static void main(String[] args) {
//    	Scanner input = new Scanner(System.in);
//    	System.out.print("Enter a point with two coordinates: ");
//    	double a = input.nextDouble();
//    	double b = input.nextDouble();
//	    double d = Math.sqrt(a*a + b*b);
//	    System.out.print("Point ("+ a + ", "+ b + ") is");
//	    if(d <= 10) System.out.print(" in the circle");
//	    else  System.out.print(" not in the circle");
//}
//
//}                                   // 3.22


//public class three {
//
//    public static void main(String[] args) {
//    	Scanner input = new Scanner(System.in);
//    	System.out.print("Enter a point with two coordinates: ");
//    	double a = input.nextDouble();
//    	double b = input.nextDouble();
//    	System.out.print("Point ("+ a + ", "+ b + ") is");
//    	if(a <= 5 && b <= 2.5) System.out.print(" in the rectangle");
//    	else  System.out.print(" not in the rectangle");
//	
//}
//
//}                                   // 3.23




//public class three {
//
//    public static void main(String[] args) {
//	      int a = (int)(Math.random()*13+1);
//	      int b = (int)(Math.random()*4+1);
//	      System.out.print("The Card you picked is ");
//	      if(a == 1) System.out.print("Ace");
//	      else if(a == 11) System.out.print("Jack");
//	      else if(a == 12) System.out.print("Queen");
//	      else if(a == 13) System.out.print("King");
//	      else System.out.print(a);
//	      System.out.print(" of ");
//	      if(b == 1) System.out.print("Clubs ");
//	      else if(b == 2) System.out.print("Diamonds ");
//	      else if(b == 3) System.out.print("Hearts ");
//	      else System.out.print("Spades ");
//}
//
//}                                    // 3.24




//public class three {
//
//    public static void main(String[] args) {
//    	Scanner input = new Scanner(System.in);
//    	System.out.print("Enter a point's x- and y-coordinates: ");
//    	double x = input.nextDouble();
//    	double y = input.nextDouble();
//    	if(x >= 0&&y >= 0&&(y + x/2.0 -100 <=0)) System.out.print("The point is in the triangle");
//    	else System.out.print("The point is not in the triangle");
//	
//}
//
//}                                     // 3.27




//public class three {
//
//    public static void main(String[] args) {
//    	Scanner input = new Scanner(System.in);
//    	System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
//    	double x1 = input.nextDouble();
//    	double y1 = input.nextDouble();
//    	double w1 = input.nextDouble();
//    	double h1 = input.nextDouble();
//    	System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
//	    double x2 = input.nextDouble();
//	    double y2 = input.nextDouble();
//	    double w2 = input.nextDouble();
//	    double h2 = input.nextDouble();
//	    int flag = 0;
//	    if(Math.abs(x2 - w2/2 -x1)<w1/2 && Math.abs(y2 - h2/2 - y1)<h1/2) flag+=1;
//	    else if(Math.abs(x2 - w2/2 -x1)<w1/2 && Math.abs(y2 + h2/2 - y1)<h1/2) flag+=1;
//	    else if(Math.abs(x2 + w2/2 -x1)<w1/2 && Math.abs(y2 - h2/2 - y1)<h1/2) flag+=1;
//	    else if(Math.abs(x2 + w2/2 -x1)<w1/2 && Math.abs(y2 + h2/2 - y1)<h1/2) flag+=1;
//	    if(flag == 4) System.out.print("r2 is inside r1");
//	    else if(flag >= 1) System.out.print("r2 overlaps r1");
//	    else System.out.print("r2 does not overlap r1");
//	    		
//}
//
//}                                      // 3.28




//public class three {
//
//    public static void main(String[] args) {
//    	Scanner input = new Scanner(System.in);
//    	System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
//    	double x1 = input.nextDouble();
//    	double y1 = input.nextDouble();
//    	double r1 = input.nextDouble();
//    	System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
//	    double x2 = input.nextDouble();
//	    double y2 = input.nextDouble();
//	    double r2 = input.nextDouble();
//	    double d = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
//	    if(d <= Math.abs(r1 - r2)) System.out.print("circle2 is inside circle1");
//	    else if(d <= r1 +r2 ) System.out.print("circle2 overlaps circle1");
//	    else System.out.print("circle2 does not overlap circle1");
//}
//
//} 