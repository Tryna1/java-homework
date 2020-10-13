
import java.util.Scanner;
import java.util.Arrays;

//public class four {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] a = new int[110];
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter the integers between 1 and 100:");
//		while(true) {
//			int b = input.nextInt();
//			if(b == 0) break;
//			a[b] = a[b] + 1;
//		}
//		for(int i = 1; i <= 100; i++) {
//			if(a[i] != 0) {
//				System.out.print(i + " occurs " + a[i]);
//				if(a[i] == 1) System.out.println(" time");
//				else  System.out.println(" times");
//			}
//		}
//	}
//}                                 //7.3


//public class four {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] a = new int[110];
//		int[] c = new int[110];
//		int num = 0;
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter ten numbers:");
//		for(int i = 1; i <= 10 ; i++) {
//			int b = input.nextInt();
//			if(a[b] == 0) {  
//				num = num + 1;
//				c[num] = b;
//			}
//			a[b] = 1;
//		}
//		System.out.println("The number of distinct number is " + num);
//		System.out.print("The distinct numbers are:");
//		for(int i = 1; i <= num; i++) {
//				System.out.print(" " + c[i]);
//		}
//	}
//}                               //7.5


//public class four {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] score = new int[110];
//		String[] name = new String[110];
//		Scanner input = new Scanner(System.in);
//		System.out.println("请输入学生的个数");
//		int n = input.nextInt();
//		for(int i = 1; i <= n; i++) {
//			System.out.println("请输入第" + i + "个学生的姓名");
//			name[i] = input.next();
//			System.out.println("请输入第" + i + "个学生的成绩");
//			score[i] = input.nextInt();
//		}
//		for(int i = 1; i < n; i++) {
//			for(int j = i + 1; j <= n; j++) {
//				if(score[i] < score[j]) {
//					int tmp1 = score[i];
//					score[i] = score[j];
//					score[j] = tmp1;
//					
//					String tmp2 = name[i];
//					name[i] = name[j];
//					name[j] = tmp2;
//				}
//			}
//		}
//		for(int i = 1; i <= n; i++) System.out.println(name[i]);
//		
//	}
//}                             //7.17


//public class four {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner input = new Scanner(System.in);
//		double[] a = new double[15];
//		System.out.println("输入10个浮点数:");
//		for(int i = 1; i <= 10; i++) {
//			a[i] = input.nextDouble();
//		}
//		for(int i = 1; i < 10; i++) {
//			for(int j = i + 1; j <= 10; j++) {
//				if(a[i] > a[j]) {
//					double tmp1 = a[i];
//					a[i] = a[j];
//					a[j] = tmp1;
//				}
//			}
//		}
//		for(int i = 1; i <= 10; i++) System.out.println(a[i]);
//		
//	}
//}                              //7.18


//public class four {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner input = new Scanner(System.in);
//		int[] a = new int[110];
//		System.out.println("Enter list: ");
//		int n = input.nextInt();
//		for(int i = 1; i <= n; i++) {
//			a[i] = input.nextInt();
//		}
//		int flag = 0;
//		for(int i = 1; i < n; i++) {
//			if(a[i] > a[i + 1]) {
//				flag = 1;
//				break;
//			}
//		}
//		if(flag == 1) System.out.println("The list is not sorted");
//		else System.out.println("The list is already sorted");
//		
//	}
//}                                //7.19


//public class four {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner input = new Scanner(System.in);
//		int[] a = new int[110];
//		for(int i = 1; i <= 100; i++) {
//			for(int j = i; j <= 100; j = j + i)
//				a[j] = 1 - a[j];
//		}
//		System.out.println("开着的柜子有");
//		for(int i = 1; i <= 100; i++) {
//			if(a[i] == 1) System.out.println(i);
//		}
//		
//	}
//}                                //7.23


//public class four {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner input = new Scanner(System.in);
//		int f1 = 0;
//		int f2 = 0;
//		int f3 = 0;
//		int f4 = 0;
//		int num = 0;
//		while(true) {
//			int a = (int)(Math.random()*52+1);
//			num++;
//			if(a <= 13) {
//				if(f1 == 0) {
//					if(a == 11) System.out.println("Jack of Spades");
//					else if(a == 12) System.out.println("Queen of Spades");
//					else if(a == 13) System.out.println("King of Spades");
//					else System.out.println(a + " of Spades");
//				}
//				f1 = 1;	
//			}
//			else if(a <= 26) {
//				a = a - 13;
//				if(f2 == 0) {
//					if(a == 11) System.out.println("Jack of Clubs");
//					else if(a == 12) System.out.println("Queen of Clubs");
//					else if(a == 13) System.out.println("King of Clubs");
//					else System.out.println(a + " of Clubs");
//				}
//				f2 = 1;
//			}
//			else if(a <= 39) {
//				a = a - 26;
//				if(f3 == 0) {
//					if(a == 11) System.out.println("Jack of Hearts");
//					else if(a == 12) System.out.println("Queen of Hearts");
//					else if(a == 13) System.out.println("King of Hearts");
//					else System.out.println(a + " of Hearts");
//				}
//				f3 = 1;
//			}
//			else {
//				a = a - 39;
//				if(f4 == 0) {
//					if(a == 11) System.out.println("Jack of Diamonds");
//					else if(a == 12) System.out.println("Queen of Diamonds");
//					else if(a == 13) System.out.println("King of Diamonds");
//					else System.out.println(a + " of Diamonds");
//				}
//				f4 = 1;
//			}
//			if(f1 == 1 && f2 == 1 && f3 == 1 && f4 == 1) break;
//		}
//		System.out.println("Number of picks: " + num);
//	}
//}                          //7.24


//public class four {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner input = new Scanner(System.in);
//		int[] list1 = new int[110];
//		int[] list2 = new int[110];
//		System.out.print("Enter listl:");
//		int n1 = input.nextInt();
//		for(int i = 1; i <= n1; i++) list1[i] = input.nextInt();
//		System.out.print("Enter list2:");
//		int n2 = input.nextInt();
//		for(int i = 1; i <= n2; i++) list2[i] = input.nextInt();
//		System.out.print("The merged list is");
//		int i = 1;
//		int j = 1;
//		int num = 1;
//		int[] list = new int[250];
//		while(true) {
//			if(list1[i] > list2[j]) {
//				list[num] = list2[j];
//				if(j != n2) j = j + 1;
//				else list2[j] = 999999;
//			}
//			else {
//				list[num] = list1[i];
//				if(i != n1) i = i + 1;
//				else list1[i] = 999999;
//			}
//			if(num == list1.length + list2.length) break;
//			num = num + 1;
//		}
//		for(int k = 1; k <= n1 + n2; k++) System.out.print(" " + list[k]);
//	}
//}                               //7.31


//public class four {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner input = new Scanner(System.in);
//		int[] a = new int[110];
//		System.out.print("Enter list:");
//		int n = input.nextInt();
//		int num = 1;
//		for(int i = 1; i <= n; i++) {
//			a[i] = input.nextInt();
//			if(a[i] < a[1]) num = num + 1;
//		}
//		int[] b = new int[110];
//		int cnt1 = 1;
//		int cnt2 = 1;
//		b[num] = a[1];
//		for(int i = 2; i <= n; i++) {
//			if(a[i] < a[1]) {
//				b[cnt1] = a[i];
//				cnt1 = cnt1 + 1;
//			}
//			else {
//				b[num + cnt2] = a[i];
//				cnt2 = cnt2 + 1;
//			}
//		}
//		System.out.print("After the partition, the list is");
//		for(int i = 1; i <= n; i++) System.out.print(" " + b[i]);
//	}
//}                            //7.32


//public class four {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner input = new Scanner(System.in);
//		sort("acb");
//		
//	}
//	public static void sort(String s) {
//		char [] a=s.toCharArray();
//		Arrays.sort(a);
//		for(int i=0;i<a.length;i++){
//			System.out.print(a[i]);
//		}
//	}
//}                             //7.34
