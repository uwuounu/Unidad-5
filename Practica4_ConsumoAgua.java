package Practica4_ConsumoAgua;
public class Practica4_ConsumoAgua {

    public static void main(String[] args) {
       
        //Arreglo Casas-Días
        int [][] ConsumoAgua = {
            {100, 50, 30, 120, 60},
            {32, 122, 46, 80, 90},
            {45, 100, 56, 26, 36},
            {60, 110, 72, 33, 40},
        };      
        
        System.out.println("- - - PRACTICA 4. CONSUMO DE AGUA - - -");
        System.out.println();
        //MANDAMOS LLAMAR LOS METODOS VOID PARA QUE SE IMPRIMAN
        ConsumoPorCasa(ConsumoAgua);
        ConsumoDiario(ConsumoAgua);
    }

    ////METODO PARA CALCULAR EL CONSUMO DE AGUA POR CASA
        public static void ConsumoPorCasa(int [][] consumoCasa){
            
        System.out.println("===== CONSUMO DE AGUA POR CASA =====");  
        for (int i = 0; i < consumoCasa.length; i++) {
            double suma = 0;
            for (int j = 0; j < consumoCasa[i].length; j++) {
                suma += consumoCasa[i][j];
            }
                System.out.println("Consumo casa " + (i + 1) + ": "+ suma);
        }
        System.out.println();
        }
        
    //METODO PARA CALCULAR EL CONSUMO DE AGUA DIARIO 
        public static void ConsumoDiario(int[][] consumoDiario) {  
            
        System.out.println("===== CONSUMO DE AGUA DIARIO =====");
        for (int j = 0; j < consumoDiario[0].length; j++) {
            double suma = 0;
            for (int i = 0; i < consumoDiario.length; i++) {
                suma += consumoDiario[i][j];
            }
            System.out.println("Consumo dia "+ (j + 1) + ": "+suma);
        }
        System.out.println();
        }

}