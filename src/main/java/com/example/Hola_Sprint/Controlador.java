/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Hola_Sprint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *    
 * @author Crist
 */
@RestController
public class Controlador {
    @GetMapping("/")
    public String Mensaje (){
        
        
        
        return "Que hizo";
    }
    
}
