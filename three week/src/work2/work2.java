package work2;
import java.util.Scanner;

public class work2 {
	public static int firstnum,secondnum;
	public static void main(String[] args) {
		int choose=menu();
		while(choose!=6) {
			switch(choose) {
			case 1:inputNum();break;
			case 2:outputOdd();break;
			case 3:outputSum();break;
			case 4:outputSquares();break;
			case 5:outputOddSquares();break;
			default:System.out.println("输入错误，请重新输入");
			}
			choose=menu();
		}
		System.out.println("退出程序");
	}
	
	public static int menu() {
		int choose=0;
		System.out.println("menu option is chosen");
		System.out.println("1.输入两个整数:firstNum和secondNum(firstNum<secondNum) ");
		System.out.println("2.输出firstNum和secondNum之间的所有奇数");
		System.out.println("3.输出firstNum和secondNum之间所有偶数的和");
		System.out.println("4.输出1到10之间的所有数字及其平方");
		System.out.println("5.输出firstNum和secondNum之间所有奇数的平方和");
		System.out.println("6.退出程序");
		System.out.print("请输入你的选择(1~6)：");
		Scanner scan=new Scanner(System.in);
		choose=scan.nextInt();
		return choose;
	}
	
	public static void inputNum() {
		System.out.println("请输入两个整数");
		Scanner scan=new Scanner(System.in);
		System.out.print("firstnum:");
		firstnum=scan.nextInt();
		System.out.print("secondnum:");
		secondnum=scan.nextInt();
		if(firstnum>=secondnum) {
			System.out.println("firstnum要小于secondnum，请重新输入");
			inputNum();
		}
	}
	
	public static void outputOdd() {
		for(int a=firstnum;a<secondnum;a++) {
			if(a%2==1) {
				System.out.println(a+" ");
			}
		}
	}
	
	public static void outputSum() {
		int sum=0;
		for(int a=firstnum;a<secondnum;a++) {
			if(a%2==0) {
				sum=sum+a;
			}
		}
		System.out.println("firstNum和secondNum之间所有偶数的和为："+sum);
	}
	
	public static void outputSquares() {
		for(int a=1;a<=10;a++) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(int b=1;b<=10;b++) {
			System.out.print(b*b+" ");
		}
		System.out.println();
	}
	
	public static void outputOddSquares() {
		int sum=0;
		for(int a=firstnum;a<secondnum;a++) {
			if(a%2==1) {
				sum=sum+a*a;
			}
		}
		System.out.println(" firstNum和secondNum之间所有奇数的平方和为："+sum);
	}
}