/*
name : CHIWANDE MANASWI SACHIN
q4 b Let Series 3,4,7, 11, 18. Display series using do while loop. Upload Screen Shot with output
 */
public class SERIES_LUCAS {
    public static void main(String[] args) {
        int prev = 3;
        int next = 4;
        int num;
        int i = 2;
        System.out.print(prev + " ");
        System.out.print(next + " ");
        do{
            num = prev + next;
            System.out.print(num + " ");
            prev = next;
            next = num;
            i++;
        }while(i !=5);
    }
}
