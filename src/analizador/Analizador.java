package analizador;

import java.io.File;

public class Analizador {

    CargarArchivo ca;
    public String[] partes = null;

    public void separadorLineas(String archivo) {
        ca = new CargarArchivo();
        String separar = archivo;
        partes = separar.split(" ");
        for (int i = 0; i <= partes.length-1; i++) {
            System.out.println(partes[i]);
        }
             //Declaramos el array de 6*4
        String nuevoArray[][] = new String[6][4];

        //Metemos un dato en cada posición
        nuevoArray[0][0] = "S4";
        nuevoArray[0][1] = null;
        nuevoArray[0][2] = "S1";
        nuevoArray[0][3] = "S5";

        nuevoArray[1][0] = null;
        nuevoArray[1][1] = "S2";
        nuevoArray[1][2] = "S1";
        nuevoArray[1][3] = null;

        nuevoArray[2][0] = null;
        nuevoArray[2][1] = null;
        nuevoArray[2][2] = "S3";
        nuevoArray[2][3] = null;

        nuevoArray[3][0] = null;
        nuevoArray[3][1] = null;
        nuevoArray[3][2] = null;
        nuevoArray[3][3] = null;

        nuevoArray[4][0] = "S4";
        nuevoArray[4][1] = null;
        nuevoArray[4][2] = "S4";
        nuevoArray[4][3] = null;

        nuevoArray[5][0] = null;
        nuevoArray[5][1] = null;
        nuevoArray[5][2] = null;
        nuevoArray[5][3] = null;

    }
    
       
}
