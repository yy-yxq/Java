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
			default:System.out.println("�����������������");
			}
			choose=menu();
		}
		System.out.println("�˳�����");
	}
	
	public static int menu() {
		int choose=0;
		System.out.println("menu option is chosen");
		System.out.println("1.������������:firstNum��secondNum(firstNum<secondNum) ");
		System.out.println("2.���firstNum��secondNum֮�����������");
		System.out.println("3.���firstNum��secondNum֮������ż���ĺ�");
		System.out.println("4.���1��10֮����������ּ���ƽ��");
		System.out.println("5.���firstNum��secondNum֮������������ƽ����");
		System.out.println("6.�˳�����");
		System.out.print("���������ѡ��(1~6)��");
		Scanner scan=new Scanner(System.in);
		choose=scan.nextInt();
		return choose;
	}
	
	public static void inputNum() {
		System.out.println("��������������");
		Scanner scan=new Scanner(System.in);
		System.out.print("firstnum:");
		firstnum=scan.nextInt();
		System.out.print("secondnum:");
		secondnum=scan.nextInt();
		if(firstnum>=secondnum) {
			System.out.println("firstnumҪС��secondnum������������");
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
		System.out.println("firstNum��secondNum֮������ż���ĺ�Ϊ��"+sum);
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
		System.out.println(" firstNum��secondNum֮������������ƽ����Ϊ��"+sum);
	}
}