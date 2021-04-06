package work1;
import java.util.Scanner;
public class work1 {
	public static void main(String agrs[]) {
		double sumMoney;
		double Money;
		int yimeiyuanNum;
		int ermeiyuanNum;
		int wushiNum;
		int ershiNum;
		int shiNum;
		int wuNum;
		int yiNum;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入你的钱：");
		sumMoney=scan.nextDouble();
		Money=sumMoney*100;
		ermeiyuanNum=(int)sumMoney/2;
		yimeiyuanNum=(int)sumMoney%2;
		wushiNum=(int)Money%100/50;
		ershiNum=(int)Money%100%50/20;
		shiNum=(int)Money%100%50%20/10;
		wuNum=(int)Money%100%50%20%10/5;
		yiNum=(int)Money-ermeiyuanNum*200-yimeiyuanNum*100-wushiNum*50-ershiNum*20-shiNum*10-wuNum*5;
		
		System.out.println("两美元的数量是："+ermeiyuanNum);
		System.out.println("一美元的数量是："+yimeiyuanNum);
		System.out.println("五十美分的数量是："+wushiNum);
		System.out.println("二十美分的数量是："+ershiNum);
		System.out.println("十美分的数量是："+shiNum);
		System.out.println("五美分的数量是："+wuNum);
		System.out.println("一美分的数量是："+yiNum);
	}
}
