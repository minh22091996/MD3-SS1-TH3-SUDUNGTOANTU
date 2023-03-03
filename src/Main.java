import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner resul = new  Scanner(System.in);

        System.out.println("nhap chieu rong :");
        double with = resul.nextDouble();
        System.out.println("nhap chieu cao :");
        double heigh = resul.nextDouble();
        double area = with*heigh;
        System.out.println("dien tich la :" + area);
    }
}
