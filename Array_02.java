public class Array_02 {
    public static void main(String[] args) {
        int [] marks = {23,56,78,98,45};
        //for displaying array (for loop method)
        for(int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println("Printing array element in reverse order");
        for(int i = marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }
        System.out.println("Printing array element using FOR-EACH LOOP");
        for(int element: marks){
            System.out.println(element);

        }
    }
}
