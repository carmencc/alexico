package practica_04;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.Buffer;

//implementa el DT identifica los tokens
public class Alex {
    
    public static class A_Buffer{
        public int pos_leida;//contador de los elementos leidos en una linea de código
        public int tamaño;//tamaño de la líina de código leida 
        public String cadena;//almacena las lineas de código del archivo fuente
        
    }
        //atributo utilizado a lo largo de las invocaciones del método compilador.
        public static A_Buffer Buffer = new Buffer();
        //atributo que permite leer y almacenar cada una de las instrucciones del archivo fte
        public static BufferedReader b = new BufferedReader(UAMI.Archivo_fte);
    
    
    //Metodo que implementa cada una de las partes del digrama de transiciones 
    public static String ALexico()throws IOException{
        String lexbuff;
        char caracter;
        Globales G = new Globales();
        caracter = Buffer.cadena.charAt(Buffer.pos_leida);
        //verificamos que el caracter leido es un digito       
        if(Character.isDigit(caracter)){
            lexbuff="";//preguntar
            while(Character.isDigit(caracter)){
                lexbuff = lexbuff + caracter;
                caracter = Lee_Caracter();
            }
            Deslee();
            UAMI.tokenval = lexbuff;
            return (G.NUM_ENT);
            
        }
            //CUANDO RECIBIMOS UN (*)
            if(caracter == '*'){
                UAMI.tokenval = String.valueOf(caracter);
                return (G.PRODUCTO);
            }
                //CUANDO RECIBIMOS UN SIGNO (+)
                if(caracter =='+'){//recibimos el primer (+)
                    caracter = Lee_Caracter();//vemos que hay en el siguiente posible caracter
                    if(caracter == '+' ){//si es el 2o (+)incrementamos
                        UAMI.tokenval = lexbuff;//enviamos el token
                        return (G.INCREMENTO);//regresamos INCREMENTO
                    }else{//si unicamnete se leyo un (+) y despúes otra casa 
                        Deslee();//Desleemos pues se trata de una SUMA
                        UAMI.tokenval = lexbuff;
                        return(G.SUMA);
                    }
                    
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
        char c = 0;
        while(!Buffer.cadena.isEmpty()){
            System.out.println("Leer Caracter...");
            c = Buffer.cadena.charAt(Buffer.pos_leida);
            Buffer.pos_leida++;
            //return c;
        }
        return (c);
        
    }
    public static void Deslee(){
        System.out.println("Desleemos..");
        Buffer.pos_leida--;//decremetamos el contador
    }
}   
