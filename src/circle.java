/**
 * Created by Administrator on 2016/10/28.
 */
import java.util.Scanner;
public class circle extends shape {
    private double r;

    @Override
    public void get() {
        System.out.printf("请输入圆的半径：");
        Scanner r=new Scanner(System.in);
        this.r=r.nextInt();
    }

    @Override
    public double getarea() {
        System.out.printf("%d",3.14*r*r);
        return (3.14*r*r);
    }
}
