package com.programacion;

public class Libro {
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;

    public Libro (){

    }

    public Libro (String t, String at, int an, short nPag, float valor){
        titulo = t;
        autor = at;
        ano = an;
        numPaginas = nPag;
        valoracion = valor;
    }

    //Getters
    public String getTitulo ()
    {
        return titulo;
    }
    public String getAutor (){
        return autor;
    }
    public int getAno (){
        return ano;
    }
    public short getNumPaginas (){
        return numPaginas;
    }
    public float getValoracion (){
        return valoracion;
    }

    //Setters
    public void setTitulo (String newTitulo) {
        this.titulo = newTitulo;
    }
    public void setAutor (String newAutor) {
        this.autor = newAutor;
    }
    public void setAno (int newAno) {
        this.ano = newAno;
    }
    public void setNumPaginas (short newNumPaginas) {
        this.numPaginas = newNumPaginas;
    }
    public void setValoracion (float newValoracion) {
        this.valoracion = newValoracion;
    }

    public void amosar () {
        System.out.println("Informacion - ");
        System.out.println("Título - " + titulo);
        System.out.println("Autor - " + autor);
        System.out.println("Ano da Publicación - " + ano);
        System.out.println("Número de páginas - " + numPaginas);
        System.out.println("Valoración - " + valoracion);
    }
}
