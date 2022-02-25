
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Static_Initializer_Block {
    /*
    Java Static Initializer Block : - https://www.c-sharpcorner.com/UploadFile/3614a6/static-initialization-block-in-java/#:~:text=The%20following%20describes%20the%20Static%20Initialization%20Block%20in,will%20execute%20only%20one%20time.%20More%20items...%20
     //In Java, we have a special block known as a Static Initialization Block. A Static Initialization Block is executed before the main( ) method. This is the main advantage of the Static Initialization Block in Java.
     //Static Initialization Block in Java
     //The following describes the Static Initialization Block in Java:
     //A Static Initialization Block in Java is a block that runs before the main( ) method in Java.
     //Java does not care if this block is written after the main( ) method or before the main( ) method, it will be executed before the main method( ) regardless.
     //In the entire program, the Static Initialization Block will execute only one time.
     //There can be many Static Initialization Blocks in a specific class.
     //If we have many Static Initialization Blocks in Java then they are called in a manner in the order they are written in the program.
     //This block will not return anything.
     //Checked exceptions cannot be thrown.
     //We cannot use the "this" keyword since it does not have any instance.
     //Syntax
     //static
     //{
     //.......
     //.......
     //}
     */
    static Scanner sc = new Scanner(System.in);
    static int B = sc.nextInt();
    static int H = sc.nextInt();
    static boolean flag = false;
    static {
        if(B > 0 && H > 0){
            flag = true;
        }
        else System.out.println("java.lang.Exception: Breadth and height must be positive");
    }

//Write your code here

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main
}
