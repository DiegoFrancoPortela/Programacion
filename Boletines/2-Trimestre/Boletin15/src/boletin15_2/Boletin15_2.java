package boletin15_2;

public class Boletin15_2 {
    public static void main(String[] args) {
        Metodos2 met=new Metodos2();
        int[] notas=new int[30];

        notas=met.crearArray(notas);
        met.amosarGrupos(notas);
        met.MediaNotas(notas);
        met.MaiorNota(notas);
    }
}