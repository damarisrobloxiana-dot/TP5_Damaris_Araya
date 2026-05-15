
package ej2_tp5_damaris_araya;

import java.util.Scanner;
public class EJ2_TP5_Damaris_araya {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int[][] matriz = new int [3][3];
         for (int i = 0; i <= 2;i++) {
            for (int j = 0; j <= 2; j++) {
                matriz[i][j]= scanner.nextInt();
                
            //| 1 5 4 |
            //| 2 4 5 |
            //| 1 2 3 |

        }
        }
         int i = 0;
        
        while(i<3){
            
            int j = 0;
            while (j<3){
                System.out.print("[" + matriz[i][j] + "]");
               j++;
               //break;
            }
            System.out.println();
            
            i++;
        }
    }
    
}
