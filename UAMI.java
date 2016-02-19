/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author carmen
 */
public class UAMI {
  public static File archivo_tpl ,archivo_err;
  public static PrintWriter wr1, wr2; 
  public static BufferedWriter bw1, bw2;
  public static FileReader Archivo_fte;
  public static int linea = 1;
  public static String tokenval = null;
  private static int tamaño_N_3;
  
  public static void Crear_Archivos(String Nombre_Archivo){
    int tamaño_N = Nombre_Archivo.length();
    String Nombre_sin_Extension = Nombre_Archivo.substring(0, (tamaño_N_3));
    
    //Creación de los archivos tpl y err
    try{
        archivo_tpl = new File(Nombre_sin_Extension + "tpl");
        archivo_err = new File(Nombre_sin_Extension + "err");
    
        if(!archivo_tpl.exists()&& !archivo_err.exists()){
            archivo_tpl.createNewFile();
            archivo_err.createNewFile();
        }
    }catch(IOException e){
        System.out.println("No se pudieron crear los archivos *.tpl y *.err");
    }
}
  
  public static void Cierra_Archivos() throws IOException{
      
  }
  
  public static void Compilador(String Ruta_Archivo) throws IOException{
      
  }
}
