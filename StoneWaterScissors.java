
import java.util.Scanner;
import java.util.Random;

public class StoneWaterScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int pcIn = rand(1,3);
        Random random = new Random();
        int pcIn = random.nextInt(1,3);
        System.out.println("======================= STONE PAPER SCISSOR ==========================");
        System.out.println("For STONE print 1 \t\t For PAPER print 2 \t\t For SCISSOR print 3 ");
        System.out.print("Your turn \t ENTER VALUE : ");
        int userIn = sc.nextInt();
        System.out.print("My turn : ");
        System.out.println(pcIn);
        if(userIn== pcIn){
            System.out.println("It's a tie .....");
        }
        else if(userIn==1 && pcIn == 2 || userIn==2 && pcIn == 3 || userIn==3 && pcIn == 1 ){
            System.out.println("YOU LOSE  .....");
        }
        else {
            System.out.println("YOU WIN .....");
        }
        }


//    public static int rand(int min, int max)
//    {
//        if (min > max || (max - min + 1 > Integer.MAX_VALUE)) {
//            throw new IllegalArgumentException("Invalid range");
//        }
//        return new Random().nextInt(max - min + 1) + min;
//    }

}