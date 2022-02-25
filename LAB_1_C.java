
public class LAB_1_C {
    public static void main(String[] args) {
        /*
        TERNARY OPERATOR - Java ternary operator is the only conditional operator that takes three operands.
                         - a one-liner replacement for if-then-else statement
                         - operator used = ? :
                         - variable = Expression1 ? Expression2: Expression3
                 PROGRAM TO FIND MAX OF TWO NUMBERS
         */
        int x = 90 ;
        int y = 34 ;
        System.out.println();
        int z = (x> y)?x : y;
        System.out.printf("MAX OF %d and %d is %d" , x ,y ,z);
    }
}
 /*1. UNARY OPERATOR
              1. unary minus (-)    -used to convert a negative value to a positive one.
              2.NOT operator (!)    -used to convert true to false or vice versa
              3. Increment (++)     -used to increment the value of an integer.
              4. Decrement (--)
              5. Bitwise complement operator (~)

        System.out.println("---------------UNARY OPERATOR---------------");
        boolean condn = true;
        System.out.println("OUR CONDITION IS : "+ condn);
        System.out.println("IMPLEMENTING NOT OPERATOR : " + !condn);
        int n1 = 10;
        System.out.println("NUMBER IS : "+n1);
        System.out.println("IMPLEMENTING UNARY MINUS : " + -n1);
        n1++;
        System.out.println("IMPLEMENTING Post-increment operator : " + n1);
        int n2 = 34;
        System.out.println("NUMBER IS : "+n2);
        ++n2;
        System.out.println("IMPLEMENTING Pre-increment operator : " + n2);
        int n3 = 40;
        System.out.println("NUMBER IS : "+n3);
        n3--;
        System.out.println("IMPLEMENTING Post-decrement operator : " + n3);
        int n4 = 44;
        System.out.println("NUMBER IS : "+n4);
        --n4;
        System.out.println("IMPLEMENTING Pre-decrement operator : " + n4);
        int n5 = 6 ;
        System.out.println("NUMBER IS : "+n5);
        System.out.println("IMPLEMENTING Bitwise complement operator : "+ ~n5 );

         */

    /*
            ARITHMETIC OPERATOR :
            1.addition +       x+y
            2.subtraction -    x-y
            3.multiplication   x*y
            4.division /       x/y
            5.modulus %        x%y
            //Arithmetic operators cannot work with Booleans.

    int x = 27;
    int y =5;
        System.out.println("---------------ARITHMETIC OPERATOR---------------");
                System.out.println("add 27+5 :" + (x+y));
                System.out.println("subtract 27-5 : " + (x-y));
                System.out.println("multiply 27*5 : " + (x*y));
                System.out.println("division 27/5 : " + (x/y));
                System.out.println("modulus on 27%5 : " + (x%y));
     */
 /*
        RELATIONAL OPERATORS  ---  use to compare two variables return boolean value
        1. equals to ==
        2. not equal to ! =
        3. greater than >
        4. less than <
        5. grater than equal to >=
        6. less than equal to <=

    int x = 90 ;
    int y = 34 ;
        System.out.println(" x is : " +x);
                System.out.println(" y is : " +y);
                System.out.println(" x == y : "  + (x == y));
                System.out.println(" x != y : "  + (x != y));
                System.out.println(" x > y : "  + (x > y));
                System.out.println(" x <  y : "  + (x < y));
        System.out.println(" x >= y : "  + (x >= y));
        System.out.println(" x <= y : "  + (x <= y));
  */
/*
        LOGICAL OPERATOR
        1.AND &&   2.OR  ||   3.NOT !

    int a = 10, b = 20, c = 20 ,d = 0;
        System.out.println("a = " + a);
                System.out.println("b = " + b);
                System.out.println("c = " + c);
                if ((a < b) && (b == c))   System.out.println("(a < b) && (b == c) : " +"the conditions are true");
        else System.out.println("(a < b) && (b == c) : False conditions");
        if (a > b || c == d)  System.out.println("(a > b) || (c == d) : "+"One or both the conditions are true");
        else System.out.println("(a > b) || (c == d) : False conditions");
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));
 */
