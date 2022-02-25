
import java.util.Scanner;
public class PS_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        //Write a program to find out whether a student is pass or fail;
        //if it requires a total of 40% and at least 33% in each subject
        // to pass. Assume 3 subjects and take marks as input from the user.
        System.out.print("ENTER TOTAL MARKS FOR EACH PAPER : ");
        float a = sc.nextInt();
        System.out.print("ENTER MARKS FOR PHYSICS PAPER : ");
        int b = sc.nextInt();
        System.out.print("ENTER MARKS FOR MATHS PAPER : ");
        int c = sc.nextInt();
        System.out.print("ENTER MARKS FOR CHEMISTRY PAPER : ");
        int d = sc.nextInt();
        int sum = b+c+d;
        float perb = (b*100)/a;
        float perc = (c*100)/a;
        float perd = (d*100)/a;
        float pert = (sum*100)/a;
        if(pert>40 && perb>33 && perc>33 && perd> 33){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
        */

        /*
        //Calculate income tax paid by an employee to the government as per the slabs mentioned below:
        //Income Slab	Tax
        //2.5L – 5.0L  	5%
        //5.0L – 10.0L 	20%
        //Above 10.0L	30%
        System.out.print("ENTER YOUR ANNUAL INCOME : ");
        int in = sc.nextInt();
        if(in >=250000 && in <500000){
            System.out.println("YOU HAVE TO PAY 5% TAX");
        }
        else if(in >=500000 && in <=1000000){
            System.out.println("YOU HAVE TO PAY 5% TAX");
        }
        else if(in >1000000 ){
            System.out.println("YOU HAVE TO PAY 5% TAX");
        }
        else{
            System.out.println("NO NEED TO PAY TAXES");
        }
         */

        /*
        //Question 4: Write a Java program to find out the day of the week given the number
        // [1 for Monday, 2 for Tuesday … and so on!]
        System.out.print("ENTER NUMBER : ");
        byte a = sc.nextByte();
        switch (a) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("oops !!!! \nYOU HAVE ENTERED WRONG NUMBER .......");
        }
         */

        /*
        //Question 5:Write a Java program to find whether a year entered by the user is a leap year or not.
        System.out.print("ENTER YEAR : ");
        short a = sc.nextShort();
        if((a%4==0 && a%100!=00) || a%400==0){
            System.out.println("leap year");
        }
        else {
            System.out.println("not a leap year");
        }

         */


    /*
        //Question 6:Write a program to find out the type of website from the URL:
        //.com – commercial website
        //.org – organization website
        //.in – Indian website
        String web = sc.next();
        if(web.endsWith("com")){
            System.out.println("COMMERCIAL WEBSITE");
        }
        else if(web.endsWith("org")){
            System.out.println("ORGANISATION WEBSITE");
        }
        else if(web.endsWith("in")){
            System.out.println("INDIAN WEBSITE");
        }
        else{
            System.out.println("Don't know ");
        }

     */
    }
}
