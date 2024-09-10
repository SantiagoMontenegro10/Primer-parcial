public class LibroTextoIUAJC extends LibroTexto {
private String facultad;


public LibroTextoIUAJC(String titulo, String autor, String curso, String facultad) {
        super(titulo, autor, curso);
        this.facultad = facultad;
    }

public String getFacultad() {
        return facultad;
    }

public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

public void visualizar() {
        super.visualizar();
        System.out.println("Facultad: " + facultad);
    }
}

class Novela extends Libro {
    private String tipo;


public Novela(String titulo, String autor, String tipo) {
        super(titulo, autor);
        this.tipo = tipo;
    }

public String getTipo() {
        return tipo;
    }

public void setTipo(String tipo) {
        this.tipo = tipo;
    }

public void visualizar() {
        super.visualizar();
        System.out.println("Tipo de Novela: " + tipo);
}

}