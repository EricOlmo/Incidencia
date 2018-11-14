package jpaws;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Incidencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int idTrabajador;

    private int idApp;

    private String titulo;

    private String descripcion;

    private String estado;

    private int idSolver;

    private String comentario;

    private String fechaIncidencia;

    private String fechaResolucion;



    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public int getIdApp() {
        return idApp;
    }

    public void setIdApp(int idApp) {
        this.idApp = idApp;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdSolver() {
        return idSolver;
    }

    public void setIdSolver(int idSolver) {
        this.idSolver = idSolver;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFechaIncidencia() {
        return fechaIncidencia;
    }

    public void setFechaIncidencia(String fechaIncidencia) {
        this.fechaIncidencia = fechaIncidencia;
    }

    public String getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(String fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    @Override
    public String toString() {
        return "Incidencia{" +
                "id=" + id +
                ", idTrabajador=" + idTrabajador +
                ", idApp=" + idApp +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", estado='" + estado + '\'' +
                ", idSolver=" + idSolver +
                ", comentario='" + comentario + '\'' +
                ", fechaIncidencia='" + fechaIncidencia + '\'' +
                ", fechaResolucion='" + fechaResolucion + '\'' +
                '}';
    }
}
