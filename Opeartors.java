

public class Opeartors {
    public static void main(String[] args) {
        //ARITHMETIC OPERATORS
        int a = 6;
             //x + y = 9  , x - y = 5 ,   x * y = 14  ,  x / y = 3  , x % y = 1  ,  x++ = 8  ,  y-- =  1
            //Arithmetic operators cannot work with Booleans.
        int b = a%4;   // % --> MODULO operator
        float c = 6.789f;
        float d = c%4.112f;
            //Arithmetic operators cannot work with Booleans.
        System.out.println(d);

        //COMPARISON OPERATOR  -->return a boolean value
        System.out.println(6==9);
        System.out.println(5678>345555);
           //x == y   ,	x != y,	x > y,	x < y,	x >= y,   x <= y

        //ASSIGNMENT OPERATORS        : == , += , -= , *= , /=


        //LOGICAL OPERATORS
           //x<y && x!=y  , 	x<y && x==y    ,    !(x<y && x==y)
        System.out.println(2>1 && 7>0);


        //BITWISE OPERATOR
           //& (bitwise and)		(A & B) = (100 & 011) = 000
        //| (bitwise or)		(A | B)  = (100 | 011 ) = 111
        //^ (bitwise XOR)	(A ^ B) = (100 ^ 011 ) = 111
        //<< (left shift)	 	13<<2 = 52(decimal)
        //>> (right shift)		13>>2 = 3(decimal)
    }
}
