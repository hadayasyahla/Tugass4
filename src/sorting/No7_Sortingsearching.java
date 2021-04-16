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
public class No7_Sortingsearching {

    /**
     * @param args the command line arguments
     */
    public static void tampil(int []data){
        
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]+ " ");
        }
        System.out.println();
    }
    public static void Sorting(int []A){
        for(int i=1; i<A.length; i++){
            int key = A[i];
            int j = i-1;
            while ((j>=0) && (A[j]>key)){
                A[j +1] = A[j];
                j--;
            }
            A[j + 1]= key;
        }
    }
    public static void Searching(int A[]){
        int key =13;
        System.out.println("Isi data adalah : ");
        for (int i=0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
        
        for (int i =0; i<A.length; i++){
            if(key == A[i]){
                System.out.print("Data " + key + " Berada Di Indeks ke : " + i);
                break;
            }
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Program Pengurutan InsertionSort dan SequentialSearching");
        int data[] = {25,7,9,13,3};
        System.out.println("Data Sebelum Diurutkan : ");
        No7_Sortingsearching.tampil(data);
        No7_Sortingsearching.Sorting(data);
        System.out.println("Data Sesudah Diurutkan : ");
        No7_Sortingsearching.tampil(data);
        No7_Sortingsearching.Searching(data);
        System.out.println();
        System.out.print("Nurul Lita Syahla Hadaya");
    }
    
}
