package boletin16_2;

import javax.swing.JOptionPane;

public class Metodos2 {
    private int cantidadPersoas;
    private float[] alturaPersoas;
    private float alturaMedia;
    
    public void engadirAltura() {
        cantidadPersoas=Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cantas persoas desexa engadir?"));
        for (int i=0; i < cantidadPersoas; i++){
            alturaPersoas[i]= Float.parseFloat(JOptionPane.showInputDialog(null,""));
        }
        mediaAltura();
    }
    
    public float mediaAltura(){
        float calculo = 0;
        
        for (int i=0; i<alturaPersoas.length;i++){
            calculo += alturaPersoas[i];
        }
        alturaMedia = calculo / alturaPersoas.length;
        return alturaMedia;
    }
    
}
