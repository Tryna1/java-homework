import java.util.Scanner;

//public class five {
//
//	public static void main(String[] args) {
//		SimpleCircle circle1 = new SimpleCircle();
//		System.out.println("The area of the circle of radius "
//				+ circle1.radius + " is " + circle1.getArea());
//		
//		SimpleCircle circle2 = new SimpleCircle(25);
//		System.out.println("The area of the circle of radius "
//				+ circle2.radius + " is " + circle2.getArea());
//		
//		SimpleCircle circle3 = new SimpleCircle(125);
//		System.out.println("The area of the circle of radius "
//				+ circle3.radius + " is " + circle3.getArea());
//		
//		circle2.radius = 100;
//		System.out.println("The area of the circle of radius "
//				+ circle2.radius + " is " + circle2.getArea());
//	}
//
//}
//
//class SimpleCircle{
//	double radius;
//	SimpleCircle(){
//		radius = 1;
//	}
//	
//	SimpleCircle(double newRadius){
//		radius = newRadius;
//	}
//	
//	double getArea() {
//		return radius * radius * Math.PI;
//	}
//	
//	double getPerimeter() {
//		return 2 * radius * Math.PI;
//	}
//	
//	void setRadius(double newRadius) {
//		radius = newRadius;
//	}
//}                  // 9 - 1

//public class SimpleCircle {
//	public static void main(String[] args) {
//		SimpleCircle circle1 = new SimpleCircle();
//		System.out.println("The area of the circle of radius "
//				+ circle1.radius + " is " + circle1.getArea());
//		
//		five circle2 = new SimpleCircle(25);
//		System.out.println("The area of the circle of radius "
//				+ circle2.radius + " is " + circle2.getArea());
//		
//		five circle3 = new SimpleCircle(125);
//		System.out.println("The area of the circle of radius "
//				+ circle3.radius + " is " + circle3.getArea());
//		
//		circle2.radius = 100;
//		System.out.println("The area of the circle of radius "
//				+ circle2.radius + " is " + circle2.getArea());
//	}
//	double radius;
//	SimpleCircle(){
//		radius = 1;
//	}
//	SimpleCircle(double newRadius){
//		radius = newRadius;
//	}
//	double getArea() {
//		return radius * radius * Math.PI;
//	}
//	double getPerimeter() {
//		return 2 * radius * Math.PI;
//	}
//	void setRadius(double newRadius) {
//		radius = newRadius;
//	}
//}                      // 9 - 2


//public class TV {
//	int channel = 1;
//	int volumeLevel = 1;
//	boolean on = false;
//	
//	public TV() {
//	}
//	
//	public void turnOn() {
//		on = true;
//	}
//	
//	public void turnOff() {
//		on = false;
//	}
//	
//	public void setChannel(int newChannel) {
//		if(on && newChannel >= 1 && newChannel <= 120)
//			channel = newChannel;
//	}
//	
//	public void setVolume(int newVolumeLevel) {
//		if(on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
//			volumeLevel = newVolumeLevel;
//	}
//	
//	public void channelUp() {
//		if(on && channel < 120)
//			channel++;
//	}
//	
//	public void channelDown() {
//		if(on && channel > 1)
//			channel--;
//	}
//	
//	public void volumeUp() {
//		if(on && volumeLevel < 7)
//			volumeLevel++;
//	}
//	
//	public void volumeDown() {
//		if(on && volumeLevel > 1)
//			volumeLevel--;
//	}
//}             // 9 - 3



//public class TestTV {
//	public static void main(String[] args) {
//		TV tv1 = new TV();
//		tv1.turnOn();
//		tv1.setChannel(30);
//		tv1.setVolume(3);
//		
//		TV tv2 = new TV();
//		tv2.turnOn();
//		tv2.channelUp();
//		tv2.channelUp();
//		tv2.volumeUp();
//		
//		System.out.println("tv1's channel is" + tv1.channel
//				+ " and volume level is " + tv1.volumeLevel);
//		System.out.println("tv2's channel is" + tv2.channel
//				+ " and volume level is " + tv2.volumeLevel);
//	}
//}                // 9 - 4


//import java.util.Scanner;
//import javafx.geometry.Point2D;
//
//public class TestPoint2D {
//
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("Enter point1's x-, y-coordinates: ");
//		double x1 = input.nextDouble();
//		double y1 = input.nextDouble();
//		System.out.print("Enter point2's x-, y-coordinates: ");
//		double x2 = input.nextDouble();
//		double y2 = input.nextDouble();
//		
//		Point2D p1 = new Point2D(x1, y1);
//		Point2D p2 = new Point2D(x2, y2);
//		System.out.println("p1 is " + p1.toString());
//		System.out.println("p2 is " + p2.toString());
//		System.out.println("The distance between p1 and p2 is " +
//		p1.distance(p2));
//
//	}
//
//}                     // 9 - 5



//public class CircleWithStaticMembers {
//	double radius;
//	
//	static int numberOfObjects = 0;
//	
//	CircleWithStaticMembers(){
//		radius = 1;
//		numberOfObjects++;
//	}
//	
//	CircleWithStaticMembers(double newRadius){
//		radius = newRadius;
//		numberOfObjects++;
//	}
//	
//	static int getNumberOfObjects() {
//		return numberOfObjects;
//	}
//	
//	double getArea() {
//		return radius * radius * Math.PI;
//	}
//}             // 9 - 6



//public class TestCircleWithStaticMembers {
//
//	public static void main(String[] args) {
//		System.out.println("Before creating objects");
//		System.out.println("The number of Circle objects is " + 
//		CircleWithStaticMembers.numberOfObjects);
//		
//		CircleWithStaticMembers c1 = new CircleWithStaticMembers();
//		
//		System.out.println("\nAfter creating c1");
//		System.out.println("c1: radius (" + c1.radius + 
//				") and number of Circle objects (" +
//				c1.numberOfObjects + ")");
//		
//		CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
//		c1.radius = 9;
//		
//		System.out.println("\nAfter creating c2 and modifying c1");
//		System.out.println("c1: radius (" + c1.radius +
//				") and number of Circle objects (" +
//				c1.numberOfObjects + ")");
//		System.out.println("c2: radius (" + c2.radius +
//				") and number of Circle objects (" +
//				c2.numberOfObjects + ")");
//				
//
//	}
//
//}              // 9 - 7



//public class CircleWithPrivateDataFields {
//	private double radius = 1;
//	private static int numberOfObjects = 0;
//	
//	public CircleWithPrivateDataFields() {
//		numberOfObjects++;
//	}
//	
//	public CircleWithPrivateDataFields(double newRadius) {
//		radius = newRadius;
//		numberOfObjects++;
//	}
//	
//	public double getRadius() {
//		return radius;
//	}
//	
//	public void setRadius(double newRadius) {
//		radius = (newRadius >= 0) ? newRadius : 0;
//	}
//	
//	public static int getNumberOfObjects() {
//		return numberOfObjects;
//	}
//	
//	public double getArea() {
//		return radius * radius * Math.PI;
//	}
//}                      // 9 - 8


//public class TestCircleWithPrivateDataFields {
//
//	public static void main(String[] args) {
//		CircleWithPrivateDataFields myCircle = 
//				new CircleWithPrivateDataFields(5.0);
//		
//		System.out.println("The area of the circle of radius "
//				+ myCircle.getRadius() + " is " + myCircle.getArea());
//		
//		myCircle.setRadius(myCircle.getRadius() * 1.1);
//		System.out.println("The area of the circle of radius "
//				+ myCircle.getRadius() + " is " + myCircle.getArea());
//		System.out.println("The number of ovjects created is "
//				+ CircleWithPrivateDataFields.getNumberOfObjects());
//	}
//
//}                      // 9 - 9


//public class TestPassObject {
//
//	public static void main(String[] args) {
//		CircleWithPrivateDataFields myCircle = 
//				new CircleWithPrivateDataFields(1);
//		
//		int n = 5;
//		printAreas(myCircle, n);
//		
//		System.out.println("\n" + "Radius is " + myCircle.getRadius());
//		System.out.println("n is " + n);
//
//	}
//	
//	public static void printAreas(
//			CircleWithPrivateDataFields c, int times) {
//			
//			System.out.println("Radius \t\tArea");
//			while(times >= 1) {
//				System.out.println(c.getRadius() + "\t\t" + c.getArea());
//				c.setRadius(c.getRadius() + 1);
//				times--;
//		}
//	}
//
//}                        // 9 - 10








