
import java.util.Scanner;
public class LAB_3_b {
    public static void main(String[] args) {
        System.out.println("Author : Manaswi chiwande \t\tdate : 14-02-2022");
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE TEXT : ");
        String text = sc.nextLine();
        System.out.print("ENTER STRING TO FIND : ");
        String toFind = sc.nextLine();
        int index = text.indexOf(toFind);
        if( index ==-1){
            System.out.println("STRING NOT FOUND \tPLEASE TRY AGAIN ");
            return;
        }
        System.out.print("ENTER THE STRING TO REPLACE : ");
        String toReplace = sc.nextLine();
        int l = toFind.length();
        String ans = "";
        for(int i = 0; i<index ; i++){
            ans += text.charAt(i);
        }
        ans+=toReplace;
        for(int i=index +1 ; i <text.length(); i++){
            ans += text.charAt(i);
        }
        System.out.print("THE FINAL STRING IS : ");
        System.out.println(ans);
    }
}
