package Main;

import java.util.Scanner;

import model.Pelicula;

public class ManagerPelicula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		Pelicula[] newFilms = new Pelicula[6];
		Pelicula peli = new Pelicula();
		//Pelicula[] newFilms1 = {peli, peli, peli, peli, peli, peli};

		newFilms[0] = new Pelicula("Drive",100,"Drama","Nicolas Winding");
		newFilms[1] = new Pelicula("Moon",97,"Ciencia Ficción","Duncan Jones");
		newFilms[2] = new Pelicula("X-Men",104,"Superhéroes","Bryan Singer");
		newFilms[3] = new Pelicula("The Hobbit",169,"Fantasía","Peter Jackson");
	    //newFilms[4] = new Pelicula();
		//newFilms[5] = new Pelicula();

		System.out.println("Introduce el nombre de la película:");
		String name = scn.nextLine();
		int num = 0;
		boolean valid = false;

		while (valid == false) {
			Scanner scn1 = new Scanner(System.in);
			System.out.println("\nIntroduce la duracción de la película:");			
			if (scn1.hasNextInt())  {
				num = scn1.nextInt();
				valid = true;
			} else {
				System.out.println("El año introducido no es válido");
				valid = false;
			}
		}

		System.out.println("Introduce el Género de la película:");
		String gender = scn.nextLine();
		System.out.println("\nIntroduce el director de la película:");
		String director = scn.nextLine();
		Pelicula film = new Pelicula(name,num,gender,director);

		for (int i = 0; i < newFilms.length; i++) {
			Pelicula attribute = newFilms[i];
			if (attribute == null) {
			  //if (attribute.getTitulo() == null) {
					newFilms[i] = film;
					break;
			  //}
			}
		}
		System.out.println("\nAgregada película:\n");

		System.out.println("Introduce el nombre de la película a buscar:");
		String searchName = scn.nextLine();

		Pelicula searchFilm = buscarPelicula(newFilms, searchName);
		if (searchFilm == null) {
			System.out.println("\nEl nombre de la película no se ha encontrado.");
		} else {
			System.out.println("La ficha de la película buscada:");
			searchFilm.mostrarPelicula();
		}

		System.out.println("\nListado completo de las películas:\n");
		mostrarPeliculas(newFilms);

		System.out.println("\nIntroduce el nombre de la película a borrar:");
		String deleteName = scn.nextLine();

		borrarPelicula(newFilms, deleteName);

		mostrarPeliculas(newFilms);

		System.out.println("\nIntroduce el nombre de la película que no esté en la lista:");
		String foundName = scn.nextLine();
		boolean found = false;
		for (Pelicula foundFilm : newFilms) {
			if (foundFilm != null){
				if (foundFilm.getTitulo().equals(foundName)) {
					found = true;
				}
			}
		}
		if (found == false) {
			System.out.println("\nEl nombre de la película no se ha encontrado.");
		} else {
			System.out.println("\nEl nombre de la película se ha encontrado.");
		}

	}

	private static void mostrarPeliculas(Pelicula[] showFilms) {
		for (Pelicula film : showFilms) {
			if (film != null){
				film.mostrarPelicula();
			}
		}
	}

	private static Pelicula buscarPelicula(Pelicula[] searchFilms, String nombrePeli) {
		for (Pelicula film : searchFilms) {
			if (film != null){
				if (film.getTitulo().equals(nombrePeli)) {
					return film;
				}
			}
		}
		return null;
	}

	private static Pelicula[] borrarPelicula(Pelicula[] delFilms, String nombrePeli) {
		boolean existe = false;
		for (int i = 0; i < delFilms.length; i++) {
			Pelicula film = delFilms[i];
			if(film != null) {
				if (film.getTitulo().equals(nombrePeli)) {
					Pelicula newFilm = new Pelicula();
					delFilms[i] = null;
					//delFilms[i] = newFilm;
					existe = true;
				}
			}
		}
		if (existe == false) {
			System.out.println("No hemos encontrado una película con el nombre requerido");
		}
		return delFilms;
	}
}
