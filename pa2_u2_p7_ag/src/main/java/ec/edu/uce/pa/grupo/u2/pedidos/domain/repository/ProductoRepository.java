package ec.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Producto;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Proveedor;

public interface ProductoRepository {
// Create
    public void create(Producto producto);

    // Read por id
    public Producto read(Integer id);

    // Update
    public void update(Producto producto);

    // Delete
    public void delete(Integer id);
}
