/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ong.uv.programa02cc;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author octav
 */
public class Singleton {
     private static Singleton singleton = null;

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    private Singleton() {
    }
    
    public  void imprimir(){
        Logger.getLogger(Singleton.class.getName()).log(Level.INFO,"holamundo");
    }

    
}
