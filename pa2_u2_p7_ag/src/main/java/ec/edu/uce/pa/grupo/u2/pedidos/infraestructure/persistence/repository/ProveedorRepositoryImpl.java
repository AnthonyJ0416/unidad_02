package ec.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Cliente;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Proveedor;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.ProveedorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class ProveedorRepositoryImpl implements ProveedorRepository {
    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Proveedor proveedor) {
        this.entityManager.persist(proveedor); // insert
    }

    @Override
    public Proveedor read(Integer id) {
        return this.entityManager.find(Proveedor.class, id);
    }

    @Override
    public void update(Proveedor proveedor) {
        this.entityManager.merge(proveedor);

    }

    @Override
    public void delete(Integer id) {
        Proveedor proveedor = this.read(id);
        this.entityManager.remove(proveedor);

    }
}
