package jpaws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class IncidenciaController {

    @Autowired
    IncidenciaRepository incidenciaRepository;

    @Autowired
    TrabajadorRepository trabajadorRepository;

    @Autowired
    AplicacionRepository aplicacionRepository;

    @GetMapping("/incidencias")
    public Page<Incidencia> getAllIncidencia(Pageable pageable) {
        return incidenciaRepository.findAll(pageable);
    }


    @GetMapping("/incidencias/{idincidencia}")
    public String getIncidencia(@PathVariable int idincidencia) {
        return incidenciaRepository.findById(idincidencia).map(incidencia -> { // busca la incidencia
            return incidencia.toString();
        }).orElseThrow(() -> new ResourceNotFoundException("Incidencia " + idincidencia + " not found"));
    }


    @PostMapping("/incidencias/{idapp}/{idtrabajador}")
    public Incidencia createIncidencia(@PathVariable int idapp, @PathVariable int idtrabajador,
                                       @Valid @RequestBody Incidencia incidencia) {

        return aplicacionRepository.findById(idapp).map(app -> { // busca la app
            incidencia.setApp(app);
            return trabajadorRepository.findById(idtrabajador).map(trabajador -> { // busca el trabajador
                incidencia.setTrabajador(trabajador);
                return incidenciaRepository.save(incidencia);
            }).orElseThrow(() -> new ResourceNotFoundException("Trabajador " + idtrabajador + " not found"));
        }).orElseThrow(() -> new ResourceNotFoundException("App " + idapp + " not found"));

    }


    @PutMapping("/incidencias/{incidenciaID}/{estado}")
    public Incidencia updateIncidenciaEstado(@PathVariable Integer incidenciaID,@PathVariable Integer estado) {
        return incidenciaRepository.findById(incidenciaID).map(post -> {
            post.setEstado(estado);
            return incidenciaRepository.save(post);
        }).orElseThrow(() -> new ResourceNotFoundException("Incidencia " + incidenciaID + " not found"));
    }


    @DeleteMapping("/incidencias/{incidenciaID}")
    public ResponseEntity<?> deleteIncidencia(@PathVariable Integer incidenciaId) {
        return incidenciaRepository.findById(incidenciaId).map(post -> {
            incidenciaRepository.delete(post);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("IncidenciaId " + incidenciaId + " not found"));
    }

}