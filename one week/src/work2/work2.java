package work2;
import java.util.Scanner;

public class work2 {
    public static void main(String[] args){
    	
        double colorFrame = 0.1;
        double regularFrame = 0.15;
        double fancyFrame = 0.25;
        double crown = 0.35;
        double length;
        double width;
        int choose;

        Scanner scan = new Scanner(System.in);
        System.out.print("请输入长度：");
        length = scan.nextDouble();
        System.out.print("请输入宽度：");
        width = scan.nextDouble();

        double money=0;
        double zhouLength = 2 *(length + width);
        double mianji = length * width;
        System.out.println("1:普通画框 2:精美画框");
        choose=scan.nextInt();
        switch (choose) {
            case 1:
                money += zhouLength * regularFrame;
                break;
            case 2:
                money += zhouLength * fancyFrame; 
                break;
        }
        
        System.out.println("1:白色 2:彩色");
        choose=scan.nextInt();
        switch (choose) {
            case 1:
                break;
            case 2:
                money += zhouLength * colorFrame;
                break;

        }

        System.out.print("请输入皇冠的数量:（1~4）");
        choose = scan.nextInt();
        if (choose > 4 || choose < 0) {
            System.out.println("输入错误！");
        } else{
            money += choose * crown;
        }

        System.out.print("总价为:"+money+"元");
    }
}