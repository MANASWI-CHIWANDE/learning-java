/*
   Author : Manaswi chiwande
   date : 31-01-2022
 */
import java.io.*;
public class LAB_3_a {
    public static void main(String[] args) throws IOException{
        System.out.println("Author : Manaswi chiwande \t\tdate : 14-02-2022");
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        boolean f = true;
        System.out.print("Enter the key or type in quit to exit : \n");
        while(f){
            String s = b.readLine();
            if(s.compareTo("quit")==0){
                break;
            }
            char c = s.charAt(0);
            System.out.println(c+" Character is typed ");
            System.out.println("Keyboard  is working good enter 1 else 0 : " );
            int i = Integer.parseInt(b.readLine());
            if(i==0) f = false;
        }
        if(f) System.out.println("keyboard working fine ");
        else System.out.println("keyboard not working fine  ");
    }
}
