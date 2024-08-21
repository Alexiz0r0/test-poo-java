package poo.com.entity;

public class Libro {

    private String titulo;
    private String autor;
    private Integer paginas;

    public Libro(String titulo, String autor, Integer paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas * 7;
    }


    public String imprimirDetalle() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
