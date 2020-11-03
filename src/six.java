import java.util.Scanner;
import java.util.Date;
import java.util.Random;
import java.util.GregorianCalendar;
//public class six {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		long base = 10000;
//		Date data = new Date(base);
//		System.out.println(base + ": " + data.toString());
//		for(int i = 1; i <= 7; i++) {
//			base *= 10;
//			data.setTime(base);
//			System.out.println(base + ": " + data.toString());
//		}
//	}
//
//}                   // 9 - 3


//public class six {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Random random1 = new Random(1000);
//		for(int i = 1; i <= 50; i++) {
//			System.out.println(random1.nextInt(100));
//		}
//	}
//
//}                  // 9 - 4


//public class six {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		GregorianCalendar gregorianCalendar = new GregorianCalendar();
//		int m =  gregorianCalendar.get(GregorianCalendar.MONTH);
//		m += 1;
//		System.out.println(gregorianCalendar.get(GregorianCalendar.YEAR) + "年" + m + 
//				"月" + gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH) + "日");
//		gregorianCalendar.setTimeInMillis(1234567898765L);
//		m =  gregorianCalendar.get(GregorianCalendar.MONTH);
//		m += 1;
//		System.out.println(gregorianCalendar.get(GregorianCalendar.YEAR) + "年" + m + 
//				"月" + gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH) + "日");
//	}
//
//}                 // 9 - 5


//public class StopWatch {
//	private long startTime;
//	private long endTime;
//	public StopWatch() {
//		this.startTime = System.currentTimeMillis();
//	}
//	public void start() {
//		this.startTime = System.currentTimeMillis();
//	}
//	public void stop() {
//		this.endTime = System.currentTimeMillis();
//	}
//	public long getElapsedTime() {
//		return endTime - startTime;
//	}
//}

//public class six {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Random random1 = new Random(1000);
//		StopWatch watch = new StopWatch();
//		int[] a = new int[100010];
//		for(int i = 1; i <= 100000; i++) a[i] = random1.nextInt(1000000);
//		int minn = 0, p = 0;
//		watch.start();
//		for(int i = 1; i <= 99999; i++) {
//			minn = a[i];
//			p = i;
//			for(int j = i + 1; j <= 100000; j++) {
//				if(a[j] < minn) {
//					minn = a[j];
//					p = j;
//				}
//			}
//			int tmp = a[i];
//			a[i] = a[p];
//			a[p] = tmp;
//		}
//		watch.stop();
//		System.out.println(watch.getElapsedTime());
//	}
//
//}                         // 9 - 6



//public class QuadraticEquation {
//	private double a;
//	private double b;
//	private double c;
//	public QuadraticEquation(double a, double b, double c) {
//		this.a = a;
//		this.b = b;
//		this.c = c;
//	}
//	public double getA() {
//		return a;
//	}
//	public double getB() {
//		return b;
//	}
//	public double getC() {
//		return c;
//	}
//	public double getDiscriminant() {
//		return b * b - 4 * a * c;
//	}
//	public double getRoot1() {
//		if(getDiscriminant() < 0) return 0;
//		return (-1 * b + Math.sqrt(getDiscriminant())) / (2 * a);
//	}
//	public double getRoot2() {
//		if(getDiscriminant() < 0) return 0;
//		return (-1 * b - Math.sqrt(getDiscriminant())) / (2 * a);
//	}
//}

//public class six {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.print("Enter a, b, c: ");
//		Scanner input = new Scanner(System.in);
//		int a = input.nextInt();
//		int b = input.nextInt();
//		int c = input.nextInt();
//		QuadraticEquation q = new QuadraticEquation(a, b, c);
//		if(q.getDiscriminant() < 0) {
//			System.out.println("The equation has no roots.");
//		}
//		else if(q.getDiscriminant() == 0) {
//			System.out.println(q.getRoot1());
//		}
//		else {
//			System.out.println(q.getRoot1() + " " +  q.getRoot2());
//		}
//	}
//
//}                                  // 9 - 10



//public class LinearEquation {
//	private double a, b, c, d, e, f;
//	public LinearEquation(double a, double b, double c, double d, double e, double f) {
//		this.a = a;
//		this.b = b;
//		this.c = c;
//		this.d = d;
//		this.e = e;
//		this.f = f;
//	}
//	public double getA() {
//		return a;
//	}
//	public double getB() {
//		return b;
//	}
//	public double getC() {
//		return c;
//	}
//	public double getD() {
//		return d;
//	}
//	public double getE() {
//		return e;
//	}
//	public double getF() {
//		return f;
//	}
//	public boolean isSolvable() {
//		if(a * d != b * c) return true;
//		return false;
//	}
//	public double getX() {
//		return (e * d - b * f) / (a * d - b * c);
//	}
//	public double getY() {
//		return (a * f - e * c) / (a * d - b * c);
//	}
//	
//}
//
//public class six {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter a, b, c, d, e, f:");
//		double a = input.nextDouble();
//		double b = input.nextDouble();
//		double c = input.nextDouble();
//		double d = input.nextDouble();
//		double e = input.nextDouble();
//		double f = input.nextDouble();
//		LinearEquation L  = new LinearEquation(a, b, c, d, e, f);
//		if(!L.isSolvable()) System.out.println("The equation has no solution");
//		else {
//			System.out.println("x is " + L.getX() + " and y is " + L.getY());
//		}
//	}
//
//}                            // 9 - 11