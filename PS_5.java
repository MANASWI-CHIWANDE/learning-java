

public class PS_5 {
    public static void main(String[] args) {
        /*
        //Question 1: Write a program to print the following pattern :
        //
        //****
        //***
        //**
        //*
        for (int i = 4;i> 0;i--){
            for(int j= 0 ;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

         */

        /*
        //Question 2: Write a program to sum first n even numbers using a while loop.
        int i = 1;
        int  sum = 0;
        while(i <=5){
            sum +=2*i;//2+4+6+8+10
            i++;
        }
        System.out.println(sum);

         */

        /*
        //Question 3: Write a program to print the multiplication table of a given number n.
        int n = 7;
        for(int i =1 ; i<11 ; i++){
            System.out.printf("\t%d  x  %d  = %d ",n,i,7*i);
            System.out.print("\n");
        }
         */

        /*
        //Question 4: Write a program to print a multiplication table of 10 in reverse order.
        for(int i =10 ; i>0 ; i--){
            System.out.printf("\t10  x  %d  = %d ",i,10*i);
            System.out.print("\n");
        }
         */
        /*
        //Question 5: Write a program to find the factorial of a given number using for loops.
        int fac =1;
        for (int i = 1 ; i <=5 ; i++) {
            fac *= i;
        }
        System.out.printf("FACTORIAL IS : %d",fac);
         */

        /*
        //Question 6: Repeat problem 5 using a while loop.
        int fac =1;int i =1;
        while(i<=4){
            fac *= i;
            i++;
        }
        System.out.printf("FACTORIAL IS : %d",fac);
         */

        /*
        //Question 7: Repeat problem 1 using for/while loop.
        int i = 2;int j = 0;
        while(i >0 ){
            while( j < i ){
                System.out.print("*");
                j++;
            }
            i--;
            System.out.print("\n");
        }
         */

        //Question 8: What can be done using one type of loop can also be done using the other two types of loops - True or False.
        //---->TRUE
        /*
        //Question 9: Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
        int sum = 0;
        for(int i =1 ; i<11 ; i++){
            sum += 8*i;
        }
        System.out.println(sum);
         */

        //Question 10 :A do-while loop is executed:
        //
        //       At least once ----> CORRECT
        //       At least twice
        //      At most once
        /*
        //Question 11: Repeat problem 2 using for loop.
        int i ;
        int  sum = 0;
        for (i=1 ; i <= 5 ; i++){
            sum +=2*i;//2+4+6+8+10
        }
        System.out.println(sum);
         */
    }
}
