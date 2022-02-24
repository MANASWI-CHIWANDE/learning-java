import java.util.Scanner;

public class CBSEboardpercentcal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CBSE  board PERCENTAGE CALCULATOR");
        System.out.print("Enter marks of MATHEMATICS : ");
        int s1 = sc.nextInt();
        System.out.print("Enter marks of ENGLISH : ");
        int s2 = sc.nextInt();
        System.out.print("Enter marks of SCIENCE : ");
        int s3 = sc.nextInt();
        System.out.print("Enter marks of SOCIAL STUDIES : ");
        int s4 = sc.nextInt();
        System.out.print("Enter marks of SANSKRIT : ");
        int s5 = sc.nextInt();
        int sum = s1 + s2 + s3 + s4 + s5;
        float percent = (sum*100)/500f ;
        System.out.print("YOUR BOARD PERCENTAGE ARE : ");
        System.out.println(percent);

    }
}
