package com.programacion;

public class Main {

    public static void main(String[] args) {
        Libro obxlibro = new Libro();
        obxlibro.setTitulo("Titulo");
        obxlibro.setAutor("Autor");
        obxlibro.setAno(2010);
        obxlibro.setNumPaginas((short)100);
        obxlibro.setValoracion(5);

        obxlibro.amosar();
    }
}
