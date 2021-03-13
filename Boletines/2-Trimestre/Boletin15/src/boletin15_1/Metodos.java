package boletin15_1;

public class Metodos {
    public int[] crearArray(int[]lista){
        for(int i=0;i<lista.length;i++){
            lista[i]=(int)(Math.random()*50);
        }
        return lista;
    }
    public void visualizarArray(int[] lista){
        int posicion=lista.length-1;
        for (int i=0;i<lista.length;i++){
            System.out.println(lista[posicion]);
            posicion--;
        }
    }
}
