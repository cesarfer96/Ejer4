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

public class serie extends productores {
    int capitulos;
    public serie(){};
       
    public serie(String director, String productor, String genero){
       this.director=director;
       this.productor=productor;
       this.genero=genero;
   }
    public serie(String director, String productor, String genero, int capitulos){
       this.director=director;
       this.productor=productor;
       this.genero=genero;
       this.capitulos=capitulos;
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
    
    public void setCapitulos(int capitulos){
       this.capitulos=capitulos;
}
    public int getCapitulos(){
       return capitulos;
   }

}
