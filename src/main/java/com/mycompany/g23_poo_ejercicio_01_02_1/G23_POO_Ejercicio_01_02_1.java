/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.g23_poo_ejercicio_01_02_1;

/**
 *
 * @author erika
 */
public class G23_POO_Ejercicio_01_02_1 {

    public static void main(String[] args) {
        int limite1 = 500;
        int limite2 = 1000;
        int limite3 = 2000;
        int maximoHorasTrabajadas = 100;
        int anioActual = 2022;
        
        // Empleado 1 
        
        System.out.println("____EMPLEADO1____");
        
        var empleado1 = new Empleado();
        empleado1.nombre="Juan";
        empleado1.anioIngreso=2010;
        empleado1.costoHora=6;
        empleado1.horasTrabajadas=100;
        
        
        System.out.println("Nombre del Trabajador: " + empleado1.nombre);
        System.out.println("Horas trabajadas: " + empleado1.horasTrabajadas);
        System.out.println("Costo hora: " + empleado1.costoHora);
        System.out.println("Año ingreso: " + empleado1.anioIngreso);
        System.out.println("Año actual: 2022 ");
        
        System.out.println("Ingresos: " + empleado1.calcularIngreso(anioActual));
        double in1=empleado1.calcularIngreso(anioActual);
        System.out.println("Bono por horas extra: " 
                + empleado1.calcularBonoHorasExtra(maximoHorasTrabajadas));
        double bon1=empleado1.calcularBonoHorasExtra(maximoHorasTrabajadas);
        System.out.println("Limite 1: " + limite1);
        System.out.println("Limite 2: " + limite2);
        System.out.println("Limite 3: " + limite3);
        System.out.println("Impuestos: " + empleado1.calcularImpuesto(limite1, limite2, limite3));
        double imp1=empleado1.calcularImpuesto(limite1, limite2, limite3);
        System.out.println("Total a pagar: " + empleado1.calcularAPagar(in1,bon1,imp1));
      
        // Empleado 2
        System.out.println("____EMPLEADO2____");
        
        var empleado2 = new Empleado();
        empleado2.nombre="Mariana";
        empleado2.anioIngreso=2018;
        empleado2.costoHora=8;
        empleado2.horasTrabajadas=150;
        
        
        System.out.println("Trabajador " + empleado2.nombre);
        System.out.println("Horas trabajadas: " + empleado2.horasTrabajadas);
        System.out.println("Costo hora: " + empleado2.costoHora);
        System.out.println("Año ingreso: " + empleado2.anioIngreso);
        System.out.println("Año actual: 2022 ");
        System.out.println("Ingresos: " + empleado2.calcularIngreso(anioActual));
        double in2= empleado2.calcularIngreso(anioActual);
        System.out.println("Bono horas extra: " + empleado2.calcularBonoHorasExtra(maximoHorasTrabajadas));
        double bon2 = empleado2.calcularBonoHorasExtra(maximoHorasTrabajadas);
        System.out.println("Limite 1: " + limite1);
        System.out.println("Limite 2: " + limite2);
        System.out.println("Limite 3: " + limite3);
        System.out.println("Impuestos: " + empleado2.calcularImpuesto(limite1, limite2, limite3));
        double imp2=empleado2.calcularImpuesto(limite1, limite2, limite3);
        System.out.println("Total a pagar: " + empleado2.calcularAPagar(in2,bon2,imp2));
        
        
        // Empleado 3
        System.out.println("____EMPLEADO3____");
        
        var empleado3 = new Empleado();
        empleado3.nombre="Carlos";
        empleado3.anioIngreso=2018;
        empleado3.costoHora=8;
        empleado3.horasTrabajadas=150;
        
        
        System.out.println("Trabajador " + empleado3.nombre);
        System.out.println("Horas trabajadas: " + empleado3.horasTrabajadas);
        System.out.println("Costo hora: " + empleado3.costoHora);
        System.out.println("Año ingreso: " + empleado3.anioIngreso);
        System.out.println("Año actual: 2022 ");
        System.out.println("Ingresos: " + empleado3.calcularIngreso(anioActual));
        double in3=empleado3.calcularIngreso(anioActual);
        System.out.println("Bono horas extra: " + empleado3.calcularBonoHorasExtra(maximoHorasTrabajadas));
        double bon3=empleado3.calcularBonoHorasExtra(maximoHorasTrabajadas);
        System.out.println("Limite 1: " + limite1);
        System.out.println("Limite 2: " + limite2);
        System.out.println("Limite 3: " + limite3);
        System.out.println("Impuestos: " + empleado3.calcularImpuesto(limite1, limite2, limite3));
        double imp3=empleado3.calcularImpuesto(limite1, limite2, limite3);
        System.out.println("Total a pagar: " + empleado3.calcularAPagar(in3,bon3,imp3));
        
        
    }
    }

