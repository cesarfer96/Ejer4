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

public class empleados {
    public String nombreE;
    public String apellidoE;
    public int IDE;
    public String horario;
    
    public empleados(){};
    
    public empleados(String nombreE){
        this.nombreE=nombreE;
    }
    
    public empleados(String nombreE , String apellidoE){
        this.nombreE=nombreE;
        this.apellidoE=apellidoE;
    }
    
    public empleados(String nombreE , String apellidoE, int ide){
        this.nombreE=nombreE;
        this.apellidoE=apellidoE;
        this.IDE=ide;
    }
    
    public empleados(String nombreE , String apellidoE, int ide, String horario){
        this.nombreE=nombreE;
        this.apellidoE=apellidoE;
        this.IDE=ide;
        this.horario=horario;
    }
   
       public void setNombreE(String nombreE){
           this.nombreE=nombreE;
           
       }
       public String getNombreE(){
           return nombreE;
       }
       
       public void setApellidoE(String apellidoE){
           this.apellidoE=apellidoE;
       }
       public String getApellidoE(){
           return apellidoE;
       }
       
       public void setIde(int ide){
           this.IDE=ide;
       }
       public int getIde(){
           return IDE;
       }
       
       public void setHorario(String horario){
           this.horario=horario;
       }
       public String getHorario(){
           return horario;
       }
    
}
