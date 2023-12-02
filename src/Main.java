import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextInt();
        double d = a;

        System.out.print("Введите второе число: ");
        double b = scanner.nextInt();
        double f = b;

        System.out.print("Введите третье число: ");
        double c = scanner.nextInt();
        double g = c;


        System.out.println("Вы ввели: a = " + a + ", b = " + b + ", c = " + c);
        // Вывести на консоль переменные, значения которых делятся на 5 (вида: a=25, c=15), если нет ни одного значений, делящегося на 5, вывести строку: "нет значений, кратных 5"
            double d1 = d/5;
            double f1 = f/5;
            double g1 = g/5;
            int h = 0;
            if(d1 % 1 == 0){
                System.out.print("a = " + a);
                h++;
            }
            if(f1 % 1 == 0){
            System.out.print(" b = " + b);
                h++;
            }
            if(g1 % 1 == 0){
            System.out.print(" с = " + c);
                h++;
            }
            if (h <= 0){
                System.out.print("нет значений, кратных 5");
            }
        // Вывести наконсоль значение от целочисленного деления a на b (результат - целое число)
        double d2 = a;
        double f2 = b;
        int d3 = (int) d2;
        int f3 = (int) f2;
        double h2 = d3/f3;
        int h3 = (int) h2;
        System.out.println ("\n" + h3);
        // Вывести на консоль значение от деления a на b (результат - число с плавающей запятой)
        double h4 = d2/f2;
        System.out.println (h4);
        // Вывести на консоль значение от деления a на b, округленного до ближайшего целого в большую сторону
        System.out.println (Math.ceil(h4));
        // Вывести на консоль значение от деления a на b, округленного до ближайшего целого в меньшую сторону
        System.out.println (Math.floor(h4));
        // Вывести на консоль значение от деления a на b, округленного до ближайшего целого математическим округлением
        System.out.println (Math.round(h4));
        // Вывести на консоль остаток от деления b на c
        double q = b;
        double w = c;
        double u = q/w;
        int j = (int) u;
        System.out.println (u-j);
        // Вывести на консоль наименьшее значение из a и b
        double k = 0;
        if(a>=b){
            k = b;
        }
        if(b>=a){
            k = a;
        }
        System.out.println (k);
        //Вывести на консоль наибольшее значение из b и c
        double l = 0;
        if(c>=b){
            l = c;
        }
        if(b>=c){
            l = c;
        }
        System.out.println (l);
    }
}