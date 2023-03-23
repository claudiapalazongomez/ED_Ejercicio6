package es.studium.ejercicio6;

public class Pelicula
{
	//Atributos
	
	private String titulo;
	private	int anio;
	private int duracion;
	
	//Constructores
	
		//Constructor vac�o
	
	public Pelicula() 
	{
		titulo = "";
		anio = 0;
		duracion = 0;
	}
	
		//Contructor por par�metros
	
	public Pelicula(String titulo, int anio, int duracion)
	{
		this.titulo = titulo;
		this.anio = anio;
		this.duracion = duracion;
	}
	
	//M�todos

	public String getTitulo()
	{
		return titulo;
	}

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	public int getAnio()
	{
		return anio;
	}

	public void setAnio(int anio)
	{
		this.anio = anio;
	}

	public int getDuracion()
	{
		return duracion;
	}

	public void setDuracion(int duracion)
	{
		this.duracion = duracion;
	}
	
}
