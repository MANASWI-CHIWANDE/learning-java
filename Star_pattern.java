

public class Star_pattern {
    public static void main(String[] args) {
        //*
        //**
        //***
        //****
        for(int i =1 ; i<=4 ; i++){
            for(int j = 0 ; j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int k =4 ; k>=1 ; k--){
            for(int z = 0 ; z<k;z++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
