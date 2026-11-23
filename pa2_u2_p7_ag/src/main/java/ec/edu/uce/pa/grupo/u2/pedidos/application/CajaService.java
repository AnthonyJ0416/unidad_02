package ec.edu.uce.pa.grupo.u2.pedidos.application;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Caja;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.CajaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional 
public class CajaService {
   @Inject
    private CajaRepository cajaRepository;

    public void guardar(Caja caja) {
        this.cajaRepository.create(caja);
    }

    public Caja buscarPorId(Integer id) {
        return this.cajaRepository.read(id);
    }

    public void eliminar(Integer id) {
        this.cajaRepository.delete(id);
    }

    public void actualizar(Caja caja) {
        this.cajaRepository.update(caja);
    }
}
