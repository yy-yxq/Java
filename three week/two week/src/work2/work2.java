package work2;

import java.util.Scanner;

public class work2 {
	public static void main(String[] args) {
		int num;
		int i;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("�����������εĲ���:");
		num=scan.nextInt();
		
		System.out.print("��һ������");
		for(i=0;i<=num;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.print("�ڶ�������");
		for(i=0;i<=num;i++) {
			for(int j=0;j<num-i;j++) {
				System.out.print(" ");
			}
			for(int x=0;x<i;x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("����������");
		for(i=0;i<num;i++) {
			for(int j=0;j<num-i;j++) {
				System.out.print(" ");
			}
		System.out.print("*");
			for(int x=0;x<i;x++) {
				System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
