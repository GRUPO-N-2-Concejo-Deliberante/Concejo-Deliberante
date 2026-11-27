package ar.com.ConcejoDeliberante.ServiceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ConcejoDeliberante.Entity.Concejal;
import ar.com.ConcejoDeliberante.Entity.DetalleAsistencia;
import ar.com.ConcejoDeliberante.Repository.IConcejalRepo;
import ar.com.ConcejoDeliberante.Repository.IDetalleAsistenciaRepo;
import ar.com.ConcejoDeliberante.Service.IDetalleAsistencia;

@Service
public class ImpleDetalleAsistencia implements IDetalleAsistencia {

    @Autowired
    private IDetalleAsistenciaRepo detalleAsistenciaRepo;

    @Autowired
    private IConcejalRepo concejalRepo;  
    
    @Override
     
    public void guardarAsistencia(DetalleAsistencia detAsistencia, Concejal  concejal) {
        
        
        Concejal  concejalBD = concejalRepo.findById(concejal.getId()  )  
                .orElseThrow(() -> new RuntimeException("Concejal no encontrado"));

        
        List<DetalleAsistencia> asistenciasExistentes = concejalBD.getAsistencia();
        
        boolean yaRegistrado = asistenciasExistentes != null && 
        		!asistenciasExistentes.isEmpty();																																	
        if (!yaRegistrado) {
            detAsistencia.setConcejal(concejalBD);
            detalleAsistenciaRepo.save(detAsistencia);
        }
    }

    @Override
    public List<DetalleAsistencia> listarAsistencia() {
        return detalleAsistenciaRepo.findAll();
    }

    @Override
    public DetalleAsistencia porID(int id) {
        return detalleAsistenciaRepo.findById(id).orElse(null);
    }
}
