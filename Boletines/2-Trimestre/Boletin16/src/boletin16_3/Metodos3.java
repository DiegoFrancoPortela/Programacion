package boletin16_3;

public class Metodos3 {
	private String texto = "www.javadesde0.com";
	private String[] textoArray;

	public void separarTexto() {
		textoArray = new String[] {
				texto.substring(0, 8),
				texto.substring(8, texto.length()),
		};

		texto = "";

		System.out.printf(textoArray[0], textoArray[1]);
	}

	public void fusionarTexto() {
		if (texto.length() == 0) {
			for (String linea : textoArray) {
				texto += linea;
			}
		}

		System.out.printf(texto);
	}
}