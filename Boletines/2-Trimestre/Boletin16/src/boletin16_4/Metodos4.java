package boletin16_4;

public class Metodos4 {
	private String texto;

	public void convertirMaiuscula(String texto) {
		this.texto = texto.toUpperCase();

		System.out.printf(this.texto);
		System.out.println("");
	}

	public void convertirMinuscula() {
		String textoAnterior = texto;
		texto = texto.toLowerCase();

		System.out.printf(texto);
		System.out.println("");
	}
}
