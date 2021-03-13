package boletin15_2;

import javax.swing.*;

public class Metodos2 {
    public int[] crearArray(int[]lista){
        for(int i=0;i<lista.length;i++){
            lista[i]=(int) (Math.random()*10)+1;
        } 
        return lista;
    }
    public void amosarGrupos(int[] lista){
        int aprobados=0,suspensos=0;
        for (int i=0;i<lista.length;i++){
            if(lista[i]<5){
                suspensos++;
            }
            else {
                aprobados++;
            }
        }
        JOptionPane.showMessageDialog(null,"Número de aprobados: "+ aprobados);
        JOptionPane.showMessageDialog(null,"Número de suspensos: "+ suspensos);
    }
    public void MediaNotas(int[] lista){
        int media=0;
        for(int i=0;i<lista.length;i++){
            media=media+lista[i];
        }
        media=media/lista.length;
        JOptionPane.showMessageDialog(null,"A media dos alumnos é: "+media);
    }
    public void MaiorNota(int[] lista){
        int notaM=0;
        for (int i=0;i<lista.length;i++){
            if(lista[i]>notaM){
                notaM=lista[i];
            }
        }
        JOptionPane.showMessageDialog(null,"A nota máis alta do alumando é: "+notaM);
    }
}
    
