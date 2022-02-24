import java.util.Scanner;
public class CGPA_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float cgpa = (a+b+c)/30f;
        System.out.println("YOUR CGPA IS : "+cgpa);
    }
}