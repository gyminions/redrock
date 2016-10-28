/**
 * Created by Administrator on 2016/10/28.
 */
import java.util.Scanner;
public class triangle extends shape{
        private double bottom;
        private double height;
        @Override
        public void get() {
            System.out.printf("请输入三角形的底：");
            Scanner m=new Scanner(System.in);
            this.bottom=m.nextInt();
            System.out.printf("请输入三角形的高：");
            Scanner n=new Scanner(System.in);
            this.height=n.nextInt();
        }
        @Override
        public double getarea() {
            System.out.printf("%d",0.5*bottom*height);
            return (0.5*bottom*height);
        }
    }
