/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sudoku;

/**
 *
 * @author J4IRO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] tablero = {
            {6,0,0,0,0,0,3,0,5},
            {8,3,0,7,5,2,0,0,0},
            {0,0,9,0,0,0,0,7,0},
            {0,5,0,0,0,0,0,6,0},
            {3,9,6,0,4,0,0,0,2},
            {0,0,4,6,0,0,5,0,0},
            {0,0,5,0,0,0,6,2,0},
            {7,0,0,0,0,4,8,0,1},
            {0,0,0,0,6,0,7,4,0},
        };
        Sudoku miSudoku = new Sudoku(tablero);
        miSudoku.resolverSudoku();
        System.out.println();
        
        
    }
    
}
