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

public class pelicula  extends video{
    public pelicula(){};
    public pelicula (String director){
       this.director=director;
   }
    public pelicula(String director, String productor){
       this.director=director;
       this.productor=productor;
   }
    public pelicula (String director, String productor, String genero){
       this.director=director;
       this.productor=productor;
       this.genero=genero;
   }
    public pelicula (String director, String productor, String genero, String nombre, int duracion, String descripcion ){
       this.director=director;
       this.productor=productor;
       this.genero=genero;
       this.nombre=nombre;
       this.duracion=duracion;
       this.descripcion=descripcion;
       
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
    
    @Override
    public void setNombre(String nombre){
       this.nombre=nombre;
   }
    
    @Override
    public String getNombre(){
       return nombre;
   }
    
    @Override
    public void setDuracion(int duracion){
       this.duracion=duracion;
   }
    
    @Override
    public int getDuracion(){
       return duracion;
   }
    
    @Override
    public void setDescripcion(String descripcion){
       this.descripcion=descripcion;
   }
    
    @Override
    public String getDescripcion(){
       return descripcion;
   }
}
