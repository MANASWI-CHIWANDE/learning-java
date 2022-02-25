
import  java.util.Scanner;
public class KmtoMiles {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter in km : ");
        float a = sc.nextFloat();
        float b = a*0.621371f;
        System.out.print("Conversion in miles : ");
        System.out.println(b);

    }
}
