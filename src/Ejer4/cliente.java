/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejer4;

/**
 *
 * @author César Fernández
 */

public class cliente {
    public String nombre, apellido;
    
    public int ID;
     public cliente(){};
    
   public cliente(String nombre){
       this.nombre=nombre;
   }
   
   public cliente (String nombre, String apellido){
       this.nombre=nombre;
       this.apellido=apellido;
       
   }
   
   public cliente(String nombre, String apellido, int id){
       this.nombre=nombre;
       this.apellido=apellido;
       this.ID=id;
               
   }
   
   public void setNombre(String nombre){
       this.nombre=nombre;
   }
   public String getNombre(){
       return nombre;
   }
   
   public void setApellido (String apellido){
       this.apellido=apellido;
   }
   public String getApellido(){
       return apellido;
   }
   
   public void setId(int id){
       this.ID=id;
   }
   public int getId(){
       return ID;
   }
     }
          

