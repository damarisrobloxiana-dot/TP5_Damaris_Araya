
package ej1_tp5_damaris_araya;


public class EJ1_TP5_Damaris_araya {
    
    public static void main(String[] args) {
         int[][] matriz = new int [2][2];
                matriz[0][0]=4;
                matriz[0][1]=5;
                matriz[1][0]=3;
                matriz[1][1]=2;  
        for (int i = 0; i <= 1;i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print("[" + matriz[i][j] + "]");
                
            }
            System.out.println();
        }
    }
    
}
