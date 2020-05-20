/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasearreglos;
import java.util.Scanner;
/**
 *
 * @author chris
 */
public class ArreglosMulti {
    private int c;int f;
    private int LimiteF;int LimiteC;
    persona[][] APersonas;
    Scanner leer=new Scanner(System.in);
    public ArreglosMulti(int filas,int columnas){
        APersonas=new persona[filas][columnas];
        f=0;
        c=0;
        LimiteF=filas;
        LimiteC=columnas;
    }
    
    public void menu(){
        int opc=0;
        do{
            System.out.println("Menu Principal");
            System.out.println("1.-Agregar");
            System.out.println("2.-Mostrar");
            System.out.println("3.-Llenar matriz");
            System.out.println("4.-Salir");
            opc=leer.nextInt();
            switch(opc){
                case 1:Agregar(new persona());
                    break;
                case 2: this.MostrarTodo();
                        break; 
                case 3: inicializar(new persona()); break;
                case 4: System.out.println("Saliendo del sistema"); break;
                default:
                    System.out.println("Elige una opcion valida");
            }
        }while(opc<4);
    }
    
    public void Agregar(persona P){
        if(f<LimiteF ){
            if(c<LimiteC){
                this.APersonas[f][c++]=P;
            }else{
                c=0;
                this.APersonas[f++][c++]=P;                
                
            }
            
        }else{
            System.out.println("Matriz llena");
        }
        
    }
   
   public void MostrarTodo(){
     for(int y=0;y<LimiteF;y++){
         for(int x=0;x<LimiteC;x++){
             if(APersonas[y][x]!=null){
              System.out.println("posicion Fila "+y+" col "+x+":"+APersonas[y][x].getNombre());}
             }
         }
     }  
   public void inicializar(persona P){
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingresa la cantidad de objetos que quieres inicializar (maximo 13)");
       int j = sc.nextInt();
       for(int i = 0; i <= j; i++){
       if(f<LimiteF ){
            if(c<LimiteC){
                this.APersonas[f][c++]=P;
            }else{
                c=0;
                this.APersonas[f++][c++]=P;                
                
            }
            
        }else{
            System.out.println("Matriz llena");
        }
     } 
}
   }
   