package ec.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Factura;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Proveedor;

public interface FacturaRepository {
// Create
    public void create(Factura Factura);

    // Read por id
    public Factura read(Integer id);

    // Update
    public void update(Factura factura);

    // Delete
    public void delete(Integer id);
}
