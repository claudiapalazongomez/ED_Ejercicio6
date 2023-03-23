package es.studium.ejercicio6;

public class TestPeliculas
{

	public static void main(String[] args)
	{
		//Constructor vacío
		Pelicula pelicula1 = new Pelicula();
		pelicula1.setTitulo("Tenet");
		pelicula1.setAnio(2020);
		pelicula1.setDuracion(150);
		
		Pelicula pelicula2 = new Pelicula();
		pelicula2.setTitulo("The Lord of the Rings: The Two Towers");
		pelicula2.setAnio(2002);
		pelicula2.setDuracion(179);
		
		
		//Constructor por parámetros
		Pelicula pelicula3 = new Pelicula("Matrix", 1999, 136);
		Pelicula pelicula4 = new Pelicula("Us", 2019, 121);
		Pelicula pelicula5 = new Pelicula("Spirited Away", 2001, 125);
		
		System.out.println(pelicula5.getTitulo());
		System.out.println(pelicula1.getTitulo());
	}

}
