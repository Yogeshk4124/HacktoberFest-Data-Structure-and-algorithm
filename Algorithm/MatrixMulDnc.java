package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMulDnc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int size = (int) Math.pow(2,k);
        int[][] A =  new int[size][size];
        int[][] B = new int[size][size];
        int[][] C = new int[size][size];
        int[][] D = new int[size][size];
        System.out.println("Enter values of first Matrix: ");
        for(int i =0;i<size;i++) {
            for (int j = 0; j < size; j++) {
                A[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter Values of Second Matrix: ");
        for(int i =0;i<size;i++) {
            for (int j = 0; j < size; j++) {
                B[i][j]= sc.nextInt();
            }
        }
        /*for(int i =0;i<size;i++){
            for(int j =0;j<size;j++) {
                A[i][j] = (int) (Math.random() % 10 + 1);
                B[i][j] = (int) (Math.random() % 10 + 1);
            }
        }*/
        //long start1 = System.nanoTime();
        D = multiply(A, B, 0, 0, 0, 0, A.length);
        //long stop= System.nanoTime();
        //System.out.println(stop-start1);
        //long start2 = System.nanoTime();
        naiveMul(A,B,C,size);
        //long st= System.nanoTime();
        //System.out.println(st-start2);
        System.out.println("Naive: ");
        for(int i =0;i<size;i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(C[i][j] + " ");
            } System.out.println();
        }
        System.out.println("Divide n Conquer: ");
        for(int i =0;i<size;i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(D[i][j] + " ");
            } System.out.println();
        }


    }

    public static int[][] multiply(int[][] a, int[][] b, int rowA, int colA,
                                   int rowB, int colB, int size) {
        int[][] C = new int[size][size];
        if (size == 1) {
            C[0][0] = a[rowA][colA] * b[rowB][colB];
        } else {
            int newSize = size / 2;
            // C11 = A11 * B11 + A12 * B21
            add(C, multiply(a,b, rowA, colA, rowB, colB, newSize),//A11*B11
                    multiply(a,b, rowA, colA + newSize, rowB + newSize, colB, newSize), //A12*B21
                    0, 0);//C11

            // C12 = A11 * B12 + A12 * B22
            add(C, multiply(a,b, rowA, colA, rowB, colB + newSize, newSize),//A11*B12
                    multiply(a,b, rowA, colA + newSize, rowB + newSize, colB + newSize, newSize),//A12*B22
                    0, newSize);//C12

            // C21 = A21 * B11 + A22 * B21
            add(C, multiply(a,b, rowA + newSize, colA, rowB, colB, newSize),//A21*B11
                    multiply(a,b, rowA + newSize, colA + newSize, rowB + newSize, colB, newSize),//A22*B21
                    newSize, 0);//C21

            // C22 = A21 * B12 + A22 * B22
            add(C, multiply(a,b, rowA + newSize, colA, rowB, colB + newSize, newSize),//A21*B12
                    multiply(a,b, rowA + newSize, colA + newSize, rowB + newSize, colB + newSize, newSize), //A22*B22
                    newSize, newSize);//C22
        }

        return C;
    }

    private static void add(int[][] c, int[][] a, int[][] b, int rowC, int colC) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i + rowC][j + colC] = a[i][j] + b[i][j];
            }
        }
    }
    public static void naiveMul( int[][] a,int[][] b, int[][] c,int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                c[i][j]=0;
                for(int k=0;k<n;k++)
                    c[i][j]+=a[i][k]*b[k][j];
            }
        }
    }
}