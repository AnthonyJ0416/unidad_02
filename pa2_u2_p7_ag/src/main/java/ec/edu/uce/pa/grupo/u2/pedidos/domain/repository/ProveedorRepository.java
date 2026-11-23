package ec.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Proveedor;

public interface ProveedorRepository {
// Create
    public void create(Proveedor proveedor);

    // Read por id
    public Proveedor read(Integer id);

    // Update
    public void update(Proveedor proveedor);

    // Delete
    public void delete(Integer id);
}
