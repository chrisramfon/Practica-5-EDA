/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasearreglos;

/**
 *
 * @author chris
 */
public class persona {
    public int edad;
    private String nombre;
    public persona(){
        edad=0;
        nombre="Sin nombre";
    }
    
    public void setNombre(String n){
        nombre=n;
    }
    public String getNombre(){
        return nombre;
    } 
}
