/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author AVITA
 */
public class No1_insertionsort {

    /**
     * @param args the command line arguments
     */
    public static void insertionSort(int[] A){
        for (int i = 1; i < A.length; i++){
            int key = A[i];
            int j = i - 1;
            while ((j >= 0) && (A[j] > key)){
                
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
    }
    public static void tampil(int data[]){
            for (int i = 0; i < data.length; i++){
                System.out.print(data[i] + " ");
            }
            System.out.println();
    }
    public static void main(String[] args) {
        // TODO code application logic here
         int A[] = {25, 7, 9, 13, 3};
        No1_insertionsort.tampil(A);
        No1_insertionsort.insertionSort(A);
        No1_insertionsort.tampil(A);
        
        
        System.out.println("\n");
        System.out.println();
        System.out.println("Nurul LIta Syahla Hadaya");
    }
    
}
