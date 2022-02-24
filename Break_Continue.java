public class Break_Continue {
    public static void main(String[] args) {
        int j=0;
        for(int i = 0; i<5;i++){
            if(i==2){
                System.out.println("continue the loop");
                continue;
            }
            System.out.print(i);
            System.out.println("HELLO JAVA ");
        }
    }
}
//       for(int i = 0; i<5;i++){
//            if(i==2){
//                System.out.println("break the loop");
//                break;
//            }
//            System.out.print(i);
//            System.out.println("HELLO JAVA ");
//        }
//        for(int i = 0; i<5;i++){
//            if(i==2){
//                System.out.println("continue the loop");
//                continue;
//            }
//            System.out.print(i);
//            System.out.println("HELLO JAVA ");
//        }
//        while( j <5){
//            j++;
//            if (j==3){
//                System.out.println("break state");
//                break;
//            }
//            System.out.println("java love uh");
//        }
//        while( j <5){
//            j++;
//            if (j==3){
//                System.out.println("break state");
//                continue;
//            }
//            System.out.println("java love uh");
//        }

