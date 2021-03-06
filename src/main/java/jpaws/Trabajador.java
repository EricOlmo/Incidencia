package jpaws;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Trabajador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nombre;

    private String correo;
    //@OneToMany
    //@JoinColumn(name = "ManyTrabajador")
   // private Set<Incidencia> getIncidencia;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
