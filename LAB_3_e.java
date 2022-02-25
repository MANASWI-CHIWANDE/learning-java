
import java.util.Scanner;

public class LAB_3_e {
    public static int N;
    public static void matAdd(int r1, int c1, int mat1[][], int r2, int c2, int mat2[][]) {
        System.out.println("ADDING TWO MATRICES .......");
        int[][] sum = new int[r1][c1];
        if (r1 == r2 && c1 == c2) {
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    sum[i][j] = mat1[i][j] + mat2[i][j];
                }
            }
            System.out.println("SUM OF TWO MATRICES IS : ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
        } else System.out.println("ADDING TWO MATRICES NOT POSSIBLE ");
    }

    public static void matSub(int r1, int c1, int mat1[][], int r2, int c2, int mat2[][]) {
        System.out.println("SUBTRACTING TWO MATRICES .......");
        int[][] diff = new int[r1][c1];
        if (r1 == r2 && c1 == c2) {
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    diff[i][j] = mat1[i][j] - mat2[i][j];
                }
            }
            System.out.println("DIFFERENCE OF TWO MATRICES IS : ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(diff[i][j] + " ");
                }
                System.out.println();
            }
        } else System.out.println("SUBTRACTING TWO MATRICES NOT POSSIBLE ");
    }

    public static void matMul(int r1, int c1, int mat1[][], int r2, int c2, int mat2[][]) {
        if (c1 == r2) {
            int mul[][] = new int[r1][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < r2; k++)
                        mul[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
            System.out.println("MULTIPLICATION OF TWO MATRICES IS : ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(mul[i][j] + " ");
                }
                System.out.println();
            }
        } else
            System.out.println("MULTIPLICATION OF TWO MATRICES IS NOT POSSIBLE .....");
    }

    public static void cofactors(int[][]arr , int [][]arr1 , int x,int y,int z){
        int i = 0, j=0;
        for(int row = 0 ; row < z ; row++){
            for(int col = 0 ; col < z ; col++){
                if(row !=x && col != y){
                    arr1[i][j++] = arr[row][col];
                    if(j ==z -1){
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    public static int determinant(int[][] arr , int m){
        int d = 0;
        if(m==1) return arr[0][0];
        int [][] tempArr = new int[N][N];
        int sign = 1;
        for(int g = 0 ; g < m ; g++){
            cofactors(arr, tempArr , 0 , g , m);
            d += sign*arr[0][g]* determinant(tempArr, m-1);
            sign = - sign ;
        }
        return d;
    }

    public static  void adjoint_mat(int [][] arr, int [][]adjoint_arr){
        if(N == 1){
            adjoint_arr[0][0] = 1;
            return;
        }
        int sign = 1;
        int [][] temp = new int[N][N];
        for(int i = 0 ;i <N;i++){
            for(int j = 0 ;j <N;j++){
                cofactors(arr,temp , i,j,N);
                sign = ((i+j)%2==0)?1:-1;
                adjoint_arr[j][i] = sign*(determinant(temp,N-1));
            }
        }
    }

    public static boolean matInverse(int [][]arr , float[][] inv){
        int det = determinant(arr, N);
        if(det == 0) return false;
        int [][] adj = new int [N][N];
        adjoint_mat(arr,adj);
        for(int i =0; i<N ; i++){
            for(int j = 0 ; j<N ; j++){
                inv[i][j] = adj[i][j] / (float) det ;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //TAKING INPUT FOR MATRICES
        System.out.print("ENTER NO. OF ROWS IN MATRIX 1 : ");
        int x = sc.nextInt();
        System.out.print("ENTER NO. OF COLUMNS IN MATRIX 1 : ");
        int y = sc.nextInt();
        int[][] mat1 = new int[x][y];
        System.out.print("ENTER NO. OF ROWS IN MATRIX 2 : ");
        int z = sc.nextInt();
        System.out.print("ENTER NO. OF COLUMNS IN MATRIX 2 : ");
        int w = sc.nextInt();
        int[][] mat2 = new int[z][w];
        System.out.println("ENTER DATA FOR FIRST MATRIX : ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("ENTER DATA FOR SECOND MATRIX : ");
        for (int i = 0; i < z; i++) {
            for (int j = 0; j < w; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        //PRINTING MATRICES
        System.out.println("FIRST MATRIX IS : ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(mat1[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("SECOND MATRIX IS : ");
        for (int i = 0; i < z; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(mat2[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("==============================================================");
        System.out.println("To add the matrices ENTER \'1\'\nTo subtract the matrices ENTER \'2\'\n" +
                "To multiply the matrices ENTER \'3\'\nTo inverse the matrices ENTER \'4\'\n" +
                "to quit ENTER\'5\'");
        System.out.println("==============================================================");
        byte c = sc.nextByte();
        switch (c) {
            case 1 -> matAdd(x, y, mat1, z, w, mat2);
            case 2 -> matSub(x, y, mat1, z, w, mat2);
            case 3 -> matMul(x, y, mat1, z, w, mat2);
            case 4 -> {
                System.out.println("ENTER ORDER OF MATRIX : ");
                int n1 = sc.nextInt();
                System.out.println("ENTER DATA FOR FIRST MATRIX : ");
                int mat[][] = new int[n1][n1];
                for (int i = 0; i < n1; i++) {
                    for (int j = 0; j < n1; j++) {
                        mat[i][j] = sc.nextInt();
                    }
                }
                N = n1;
                float[][] inversedMat = new float[N][N];
                if (matInverse(mat, inversedMat)) {
                    System.out.println("inverse of matrix is : ");
                    for (int i = 0; i < n1; i++) {
                        for (int j = 0; j < n1; j++) {
                            System.out.print(inversedMat[i][j] + " ");
                        }
                        System.out.println();
                    }
                }
            }
            case 5 -> System.exit(0);
            default -> System.out.println("ENTER CORRECT OPTION NUMBER .....");
        }
    }
}

