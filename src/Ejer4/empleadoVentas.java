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

public class empleadoVentas extends empleados{
    int cantVentas;
    public empleadoVentas(){};
    
     public empleadoVentas(String nombreE , String apellidoE, int ide, String horario){
        this.nombreE=nombreE;
        this.apellidoE=apellidoE;
        this.IDE=ide;
        this.horario=horario;
    }
     
     public empleadoVentas(String nombreE , String apellidoE, int ide, String horario, int cantVentas){
        this.nombreE=nombreE;
        this.apellidoE=apellidoE;
        this.IDE=ide;
        this.horario=horario;
        this.cantVentas=cantVentas;
    }
     
     public void setCantVentas(int cantVentas){
         this.cantVentas=cantVentas;
     }
     public int getCantVentas(){
         return cantVentas;
     }
     
     @Override
     public void setNombreE(String nombreE){
           this.nombreE=nombreE;
           
       }
     
     @Override
     public String getNombreE(){
           return nombreE;
       }
     
     @Override
     public void setApellidoE(String apellidoE){
           this.apellidoE=apellidoE;
       }
     
     @Override
     public String getApellidoE(){
           return apellidoE;
       }
     
     @Override
     public void setIde(int ide){
           this.IDE=ide;
       }
     
     @Override
     public int getIde(){
           return IDE;
       }
     
     @Override
     public void setHorario(String horario){
           this.horario=horario;
       }
     
     @Override
     public String getHorario(){
           return horario;
       }
    
}

