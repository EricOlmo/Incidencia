package jpaws;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
public class Incidencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @Column
    private String titulo;

    @Column
    private String descripcion;

    @Column
    private int estado;

    @Column
    private int idSolver;

    @Column
    private String comentario;

    @Column
    private String fechaIncidencia;

    @Column
    private String fechaResolucion;

    @ManyToOne
//    @JoinColumn(name = "Trabajadorxd", nullable = false)
    //   @JoinColumn(name = "Manytrabajador")
    private Aplicacion App;

    @ManyToOne
//    @JoinColumn(name = "Trabajadorxd", nullable = false)
 //   @JoinColumn(name = "Manytrabajador")
    private Trabajador Trabajador;




    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
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

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
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


    public jpaws.Trabajador getTrabajador() { return Trabajador; }

    public void setTrabajador(jpaws.Trabajador trabajador) {
        Trabajador = trabajador;
    }

    public Aplicacion getApp() {
        return App;
    }

    public void setApp(Aplicacion app) {
        App = app;
    }

    @Override
    public String toString() {
        return "Incidencia{" +
                "id=" + id +
                ", Aplicacion=" + App.getId() +
                ", Trabajador=" + Trabajador.getId() +
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
