package work1;
import java.util.Arrays;
import java.util.Scanner;

public class work1 {
	public static double score[];
	public static void main(String[] args) {
		int choose=menu();
		while(choose!=7) {
			switch(choose) {
			case 1:EnterResult();break;
			case 2:ClassAverage();break;
			case 3:HightGrade();break;
			case 4:LowestGrade();break;
			case 5:Ascendingorder();break;
			case 6:Descendingorder();break;
			default:System.out.println("�����������������");
			}
			choose=menu();
		}
		System.out.println("�����˳�");
	}
	
	public static int menu() {
		int choose=0;
		System.out.println("menu option is chosen");
		System.out.println("1.Enter Student Results");
		System.out.println("2.Class Average");
		System.out.println("3.Hight Grade");
		System.out.println("4.Lowest Grade");
		System.out.println("5.Ascending order");
		System.out.println("6.Descending order");
		System.out.println("7.Exit");
		System.out.print("���������ѡ��(1~5)��");
		Scanner scan=new Scanner(System.in);
		choose=scan.nextInt();
		return choose;
	}
	
	public static void EnterResult(){
		score=new double[5];
		Scanner scan=new Scanner(System.in);
		int x;
		for(int i=0;i<score.length;i++) {
			int num=i+1;
			System.out.print("�������"+num+"��ѧ���ĳɼ�:");
			score[i]=scan.nextInt();
			if(score[i]>100||score[i]<0) {
				System.out.println("�����������������");
				i--;
				num--;
			}
		}
	}
	
	public static void ClassAverage() {
		double ave=0;
		for(int i=0;i<5;i++) {
			ave=ave+score[i];
		}
		System.out.println("ƽ��ֵ��"+(ave/5));
	}
	
	public static void HightGrade() {
		int max=0;
		for(int i=0;i<5;i++) {
			if(score[i]>max)
				max=(int)score[i];
		}
		System.out.println("��߷�Ϊ��"+max);
	}
	
	public static void LowestGrade() {
		int min=(int)score[0];
		for(int i=0;i<5;i++) {
			if(score[i]<min)
				min=(int)score[i];
		}
		System.out.println("��ͷ�Ϊ:"+min);
	}
	
	public static void Ascendingorder() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++)
			 {
				
			}
		}
	}
	
	public static void Descendingorder() {
		
	}
}