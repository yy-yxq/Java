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
		System.out.println("���������Ǯ��");
		sumMoney=scan.nextDouble();
		Money=sumMoney*100;
		ermeiyuanNum=(int)sumMoney/2;
		yimeiyuanNum=(int)sumMoney%2;
		wushiNum=(int)Money%100/50;
		ershiNum=(int)Money%100%50/20;
		shiNum=(int)Money%100%50%20/10;
		wuNum=(int)Money%100%50%20%10/5;
		yiNum=(int)Money-ermeiyuanNum*200-yimeiyuanNum*100-wushiNum*50-ershiNum*20-shiNum*10-wuNum*5;
		
		System.out.println("����Ԫ�������ǣ�"+ermeiyuanNum);
		System.out.println("һ��Ԫ�������ǣ�"+yimeiyuanNum);
		System.out.println("��ʮ���ֵ������ǣ�"+wushiNum);
		System.out.println("��ʮ���ֵ������ǣ�"+ershiNum);
		System.out.println("ʮ���ֵ������ǣ�"+shiNum);
		System.out.println("�����ֵ������ǣ�"+wuNum);
		System.out.println("һ���ֵ������ǣ�"+yiNum);
	}
}
