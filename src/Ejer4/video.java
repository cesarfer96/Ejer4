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

public class video extends productores {
    String nombre, descripcion;
    int duracion;
    public video(){};
    
    public video (String director, String productor, String genero){
       this.director=director;
       this.productor=productor;
       this.genero=genero;
       
   }
       
    public video (String director, String productor, String genero, String nombre){
       this.director=director;
       this.productor=productor;
       this.genero=genero;
       this.nombre=nombre;
   }
    public video (String director, String productor, String genero, String nombre, int duracion ){
       this.director=director;
       this.productor=productor;
       this.genero=genero;
       this.nombre=nombre;
       this.duracion=duracion;
       
   }
    public video (String director, String productor, String genero, String nombre, int duracion, String descripcion ){
       this.director=director;
       this.productor=productor;
       this.genero=genero;
       this.nombre=nombre;
       this.duracion=duracion;
       this.descripcion=descripcion;
       
   }
    
    public void setNombre(String nombre){
       this.nombre=nombre;
   }
    public String getNombre(){
       return nombre;
   }
    public void setDuracion(int duracion){
       this.duracion=duracion;
   }
    public int getDuracion(){
       return duracion;
   }
    public void setDescripcion(String descripcion){
       this.descripcion=descripcion;
   }
    public String getDescripcion(){
       return descripcion;
   }
    
    @Override
    public void setDirector(String director){
       this.director=director;
   }
    
    @Override
    public String getDirector(){
       return director;
   }
    
    @Override
    public void setProductor(String productor){
       this.productor=productor;
   }
    
    @Override
    public String getProductor(){
       return productor;
   }
    
    @Override
    public void setGenero(String genero){
       this.genero=genero;
   }
    
    @Override
    public String getGenero(){
       return genero;
   }
}
