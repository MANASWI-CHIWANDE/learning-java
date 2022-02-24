public class Do_While_loop {
    public static void main(String[] args) {
        //Do- while loop is similar to a while loop except for the fact that
        // it is guaranteed to execute at least once.
        //Use a do-while loop when the exact number of iterations is unknown,
        // but you need to execute a code block at least once.
        int a = 1;
        System.out.println("while loop");
        while(a<5){
            System.out.println(a);
            a++;
        }
        System.out.println("do - while loop");
        int b = 1;
        do{
            System.out.println(b);
            b++;
        }while (b<5);
        System.out.println("dusara example ");

        int c = 10;
        do{
            System.out.println(c);
            c++;
        }while (c<5);
    }
}
