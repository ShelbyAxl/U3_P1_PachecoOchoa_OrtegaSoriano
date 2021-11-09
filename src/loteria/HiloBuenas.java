/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loteria;

import java.applet.*;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author luisa
 */
public class HiloBuenas extends Thread{
    
    Mesa m;
    
    boolean barajear = false, tirar = false;
    
    public HiloBuenas(Mesa m){
        this.m = m;
    }

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
          if(barajear){
            while(m.i != 54){
                m.txtBase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/" + m.baraja[m.i] + ".png")));
                m.audio[m.i] = Applet.newAudioClip(getClass().getResource("/wav/" +m.baraja[m.i] + ".wav"));
                m.i++;
                try {
                    sleep(20);
                } catch (InterruptedException ex) {
                    Logger.getLogger(HiloBuenas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(m.i == 54){
                m.txtBase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/base.png")));
                m.i=0;
                m.btnBarajear.setEnabled(false);
                m.btnEmpezar.setEnabled(true);
                barajear = false;
                stop();
            }
        }
        
        if(tirar){
            m.btnEmpezar.setEnabled(false);
            while(m.i != 53){
                m.txtCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/" + m.baraja[m.i] + ".png")));
                if(m.i >= 15)m.btnBuenas.setEnabled(true);
                if(m.buenas){
                    m.txtNombre.setForeground(Color.RED);
                }
                m.txtNombre.setText(m.cartas[m.baraja[m.i]].toUpperCase());
                m.audio[m.i].play();
                m.i++;
                try {
                    sleep(4000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(HiloBuenas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(m.i == 53){
                m.txtCarta.setIcon(null);
                m.txtNombre.setText("");
                m.i=0;
                tirar = false;
                m.btnBarajear.setEnabled(true);
                m.btnEmpezar.setEnabled(false);
                m.btnBuenas.setEnabled(true);
                stop();
            }
        }
        
    }
    
    
    
}
