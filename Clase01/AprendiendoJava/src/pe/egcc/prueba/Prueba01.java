/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.prueba;

import pe.egcc.model.Estudiante;

/**
 *
 * @author Alumno
 */
public class Prueba01 
{
    public static void main(String[] args)
    {
        Estudiante est01 = new Estudiante();
        est01.setNombre("Silva");
        est01.setApellido("Albert");
        est01.setEdad(20);
        est01.setEmail("albert@gmail.com");
        est01.setCasado(true);
        
//        Estudiante est02 = new Estudiante();
        System.out.println("Nombre: " + est01.getNombre());
        System.out.println("--------------------------");
        System.out.println(est01);
    }
    
}
