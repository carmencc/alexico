
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

//implementa el DT identifica los tokens
public class Alex {
    
    
    public static class A_Buffer{
        public int pos_leida;//contador de los elementos leidos en una linea de código
        public int tamaño;//tamaño de la líina de código leida 
        public String cadena;//almacena las lineas de código del archivo fuente
    }
    public static A_Buffer Buffer = new Buffer();
    public static BufferedReader b = new BufferedReader(UAMI.Archivo_fte);
    
    //Metodo que implementa cada una de las partes del digrama de transiciones 
    public static String ALexico()throws IOException{
        String lexbuff;
               
        if(Character.isDigit(caracter)){
            lexbuff="";
            while(Character.isDigit(caracter)){
                lexbuff = lexbuff + caracter;
                caracter = Lee_Caracter();
            }
            Deslee();
            UAMI.tokenval = lexbuff;
            return (G.NUM_ENT);
            
        }
            if(caracter == '*'){
                UAMI.tokenval = String.valueOf(caracter);
                return (G.PRODUCTO);
            }
                if(caracter =='+'){
                lexbuf=="";
                    while(caracter == '+'&& cont != 2){
                        lexbuf = lexbuff +caracter;
                        caracter = Lee_Caracter();
                    }
                    UAMI.tokenval = lexbuff;
                    return (G.INCREMENTO)
                }
        if(caracter == '+'){
            UAMI.tokenval = lexbuff;
            return(G.SUMA);
        }
        
    }
    public static void Llena_Buffer() throws FileNotFoundException, IOException{
        String cadena;
        
        cadena = b.readLine() +"";
        if(!cadena.equals("null ")){
            Buffer.pos_leida = 0;
            Buffer.cadena = cadena;
            Buffer.tamaño = cadena.length();
            UAMI.wr2.append(cadena + "\n");
        }
        else{
            Buffer.pos_leida = 0;
            Buffer.cadena = "null ";
            Buffer.tamaño = 0;
        }
    }
    public static char Lee_Caracter() throws IOException{
        //método que permite leer cada uno de los caracteres de las líneas
        //almacenadas en el atributo cadena del objeto buffer
        
        
    }
    public static void Deslee(){
        System.out.println("DECREMETO EN CONTADOR\n");
        Buffer.pos_leida--;//decremetamos el contador
    }
}   
