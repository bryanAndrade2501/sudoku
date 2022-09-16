/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudoku;



public class Sudoku extends SudokuJFrame{
    //definición de variables
    private int[][] tablero;
    private static final int SIN_ASIGNAR = 0;
    
    //constructores
    public Sudoku(){
        tablero = new int[9][9];
    }
    
    public Sudoku(int sudoku[][]){
        this.tablero = sudoku;
    }
    
    //método para resolver el sudoku con backtracking
    public boolean resolverSudoku(){
        for(int fila=0 ; fila<9; fila++){
            System.out.println();
            for(int columna=0 ; columna<9 ; columna++){
                
                if(tablero[fila][columna] == SIN_ASIGNAR){ //si el cuadro está vació entra al if
                    System.out.println();
                    
                    for(int numero=1 ; numero<=9 ; numero++){
                        if(esValido(fila, columna, numero)){ //si el número de prueba no se repite en la fila, columna y cuadro3x3 es válido
                            tablero[fila][columna] = numero; //se añade ese número de prueba en la matriz
                            
                            if (resolverSudoku()){ //llamada recursiva al método
                                return true;
                            }else{
                                tablero[fila][columna] = SIN_ASIGNAR; //número no coincide, se vuelve 0
                            }
                        }
                    }return false;
                }else{
                    System.out.print(tablero[fila][columna]+" "); //impresión de los valores de la matriz para observar cómo se va resolviendo
                }
            }
        }return true;
    }
    
    //comprueba si el número de prueba está presente en la fila
    private boolean contieneFila(int fila, int numero){
        for(int i=0 ; i<9 ; i++){
            if(tablero[fila][i]==numero){
                return true;
            }
        }
        return false;
    }
    //comprueba si el número de prueba está presente en la columna
    private boolean contieneColumna(int columna, int numero){
        for(int i=0 ; i<9 ;i++){
            if(tablero[i][columna] == numero){
                return true;
            }
        }
        return false;
    }
    //comprueba si el número de prueba está presente en la caja 3x3
    private boolean contieneEnCaja(int fila, int columna, int numero){
        int f = fila - fila % 3;
        int c = columna - columna % 3;
        for(int i=f ; i<f+3 ; i++){
            for(int j=c ; j<c+3 ; j++){
                if(tablero[i][j] == numero){
                    return true;
                }
            }
        }
        return false;
    }
    //comprueba si el número de prueba está presente en la fila, columna o caja

    private boolean esValido(int fila, int columna, int numero){
        return !(contieneFila(fila, numero)||contieneColumna(columna, numero)||contieneEnCaja(fila, columna, numero));
    }



    public boolean esResolvible(){
        for(int fila=0 ; fila<9; fila++){
            for(int columna=0 ; columna<9 ; columna++){
                if(tablero[fila][columna] != SIN_ASIGNAR){ //si el cuadro está vació entra al if
                    int p = tablero[fila][columna];
                    tablero[fila][columna]=0;
                    if(esValido(fila, columna, p)){ //si el número de prueba no se repite en la fila, columna y cuadro3x3 es válido
                        tablero[fila][columna]=p;
                    }else{
                        return false;
                    }
                }
            }
        }return true;
    }
    
    
}
