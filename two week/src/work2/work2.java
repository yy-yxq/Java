package work2;

import java.util.Scanner;

public class work2 {
	public static void main(String[] args) {
		int num;
		int i;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入三角形的层数:");
		num=scan.nextInt();
		
		System.out.print("第一种类型");
		for(i=0;i<=num;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.print("第二种类型");
		for(i=0;i<=num;i++) {
			for(int j=0;j<num-i;j++) {
				System.out.print(" ");
			}
			for(int x=0;x<i;x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("第三种类型");
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
