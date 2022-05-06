/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g23_poo_ejercicio_01_02_1;

/**
 *
 * @author erika
 */
public class Empleado {
        String nombre;
    int horasTrabajadas;
    double costoHora;
    int anioIngreso;
    

    public double calcularIngreso(int anioActual)
    {
        double resultado;
        double totalIngreso;
        double ingresoExtra;
        int yearsTrabajados;
        totalIngreso = this.horasTrabajadas*this.costoHora;
        yearsTrabajados = anioActual-this.anioIngreso;
        ingresoExtra = (totalIngreso * 2/100)*yearsTrabajados;
        resultado = totalIngreso + ingresoExtra;
        return resultado;
    }
    public double   calcularBonoHorasExtra(int maximoHorasTrabajadas)
    {
        double resultado;
        double horasExtra =  this.horasTrabajadas - maximoHorasTrabajadas;
        if (horasExtra>0)
        {
            resultado = (this.costoHora * 2) * horasExtra;
        }
        else
        {
            resultado = 0;
        }                
        return resultado;
    }
      public double calcularImpuesto(int limite1, int limite2, int limite3)
    {
        double resultado = 0;
        double totalPago=this.costoHora*this.horasTrabajadas;
        
        double ingreso = this.calcularIngreso(anioIngreso);
        
        
        if(ingreso <= limite1){
            resultado=0;
        }else{
            if(ingreso > limite1 && ingreso <= limite2){
                resultado=(5*totalPago)/100;
            }else{
                if(ingreso>limite2 && ingreso <= limite3){
                    resultado=(12*totalPago)/100;
                }else{
                    if(ingreso>limite3){
                        resultado=(25*totalPago)/100;
                    }
                }
            }
           
        }
return resultado;
}
     public double calcularAPagar(double n, double m, double k)
    {
        double resultadoT = n+m-k;
        return resultadoT;
    }
    
}
