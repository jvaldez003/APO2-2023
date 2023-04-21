import java.util.Scanner;
public class Libro {
String titulo;
String autor;
int isbn;
int numeroPaginas;

public void setIsbn (int isbn) {
	this.isbn=isbn;
}

public void setNumeroPaginas(int numeroPaginas) {
	this.numeroPaginas=numeroPaginas;
}
public void setAutor(String autor) {
	this.autor= autor;
}
public void setTitulo(String titulo) {
	this.titulo= titulo;
}

public String toString() {
	return " el libro con Isbn " + isbn + " creado por : " + autor 
			+ " tiene: " +  numeroPaginas;
}

//public String getIsbn() {
//return "el ISBN es:" + isbn;
//}
//public String getNumeroPaginas() {
	//return "el numero de paginas es:" + numeroPaginas;
//}
//public String getAutor() {
	//return "el Autor es:" + autor;
//}
//public String getTitulo() {
	//return "el titulo es:" + titulo;
//}



}
