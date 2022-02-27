
   package com.company;
import java.util.Scanner;
    public class Main {

        static int N = 3;
        public static int check_lower_triangular(int mat[][])
        {
            int i, j;
            for (i = 0; i < N; i++)
                for (j = i + 1; j < N; j++)
                    if (mat[i][j] != 0)
                        return 0;
            return 1;
        }
        public static void main(String[] args)
        {
            int n, flag = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the order of the matrix :");
            n = sc.nextInt();
            int[][] mat1 = new int[n][n];
            System.out.print("Input the matrix elements :" );
            int i, j;
            for(i = 0; i < n; i++)
            {
                for(j = 0;j < n; j++)
                    mat1[i][j] = sc.nextInt();
            }
            System.out.println("array:");
            for(int k=0;k<n;k++){
                for(int l=0;l<n;l++){
                    System.out.print(mat1[k][l]+" ");
                }
                System.out.println();
            }
            int res = check_lower_triangular(mat1);
            if (res == 1)
                System.out.println("Lower Triangular Matrix");
            else
                System.out.println("Not an Lower Triangular Matrix");
        }
    }




