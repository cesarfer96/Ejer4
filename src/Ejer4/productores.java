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

public class productores {
   public String director, productor, genero;
   
   public productores(){};
   
   public productores(String director){
       this.director=director;
   }
   
   public productores(String director, String productor){
       this.director=director;
       this.productor=productor;
   }
   
   public productores(String director, String productor, String genero){
       this.director=director;
       this.productor=productor;
       this.genero=genero;
   }
   
   public void setDirector(String director){
       this.director=director;
   }
   public String getDirector(){
       return director;
   }
   
   public void setProductor(String productor){
       this.productor=productor;
   }
   public String getProductor(){
       return productor;
   }
   
   public void setGenero(String genero){
       this.genero=genero;
   }
   public String getGenero(){
       return genero;
   }
}
