package ec.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Caja;


public interface CajaRepository {
    // Create
    public void create(Caja caja);

    // Read por id
    public Caja read(Integer id);

    // Update
    public void update(Caja caja);

    // Delete
    public void delete(Integer id);

}
