package ec.edu.uce.pa.grupo.u2.pedidos.application;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Proveedor;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.PedidoRepository;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.ProveedorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional 
public class ProveedorService {
   @Inject
    private ProveedorRepository proveedorRepository;

    public void guardar(Proveedor proveedor) {
        this.proveedorRepository.create(proveedor);
    }

    public Proveedor buscarPorId(Integer id) {
        return this.proveedorRepository.read(id);
    }

    public void eliminar(Integer id) {
        this.proveedorRepository.delete(id);
    }

    public void actualizar(Proveedor proveedor) {
        this.proveedorRepository.update(proveedor);
    }
}
