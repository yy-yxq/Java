package work1;
import java.util.Scanner;

public class work1 {
	public static void main(String[] agrs) {
		int weishu;
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入位数（3~7）:");
		weishu=scan.nextInt();
		
		if(weishu<3||weishu>7) {
			System.out.println("输入错误，请重新输入（3~7）");
		}else {
			for(int a=(int)Math.pow(10,weishu-1);a<(int)Math.pow(10,weishu);a++){
				int c=a;
				int total=0;
				for(int i=0;i<weishu;i++) {
					int b=c%10;
					c=c/10;
					total=total+(int)Math.pow(b, weishu);
				}
				if(total==a) {
					System.out.println(a);
				}
			}
			
		}
	}
}	
