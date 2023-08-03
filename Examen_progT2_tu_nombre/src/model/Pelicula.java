package model;

public class Pelicula {

	private String titulo;
	private int duracion;
	private String genero;
	private String director;
	
	public Pelicula(String titulo, int duracion, String genero, String director) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
		this.genero = genero;
		this.director = director;
	}
	
	public Pelicula() {
		super();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	public void mostrarPelicula() {
		System.out.println("\n" + this.titulo + "\n" +
		this.duracion + "\n" + this.genero + "\n" + this.director);
	}
	
}
