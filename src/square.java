/**
 * Created by Administrator on 2016/10/28.
 */
import java.util.Scanner;
public class square extends shape {
    private double k;
    @Override
    public void get() {
        System.out.printf("请输入正方形的边长：");
        Scanner k=new Scanner(System.in);
        this.k=k.nextInt();
    }
    @Override
    public double getarea() {
        System.out.printf("%d",k*k);
        return (k*k);
    }
}
