/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.fvh.reto3;

import com.fvh.reto3.view.JFrameSplash;
import com.fvh.reto3.view.JFrameMain;

/**
 *
 * @author fercho
 */
public class Reto3 {

    public static void main(String[] args) {
        JFrameSplash splash = new JFrameSplash();
        JFrameMain main = new JFrameMain();
        
        splash.setVisible(true);
        try{
            Thread.sleep(1000); // Retrasa la ejecucioń de la línea qeu sigue en 7 Segundos
            splash.setVisible(false);
            main.setVisible(true);
            
        }
        catch(Exception e){
                
        }
    }
}
