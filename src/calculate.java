/**
 * Created by Administrator on 2016/10/28.
 */
import java.util.Scanner;
public class calculate {
    public static void main(String args[])
    {
        System.out.printf("请输入你想计算的几何图形");
        System.out.printf("１．圆形　２．正方形　３．三角形");
        Scanner i=new Scanner(System.in);
        int j=i.nextInt();
        System.out.printf("它的面积为：");
        if(j==1)
        {
            circle c=new circle();
            c.get();
            c.getarea();
        }
        else if(j==2)
        {
            square s=new square();
            s.get();
            s.getarea();
        }
        else
        {
            triangle t=new triangle();
            t.get();
            t.getarea();
        }
    }
}
