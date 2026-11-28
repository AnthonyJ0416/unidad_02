package ec.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Caja;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Cliente;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.CajaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class CajaRepositoryImpl implements CajaRepository {
    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Caja caja) {
        this.entityManager.persist(caja); // insert
    }

    @Override
    public Caja read(Integer id) {
        return this.entityManager.find(Caja.class, id);
    }

    @Override
    public void update(Caja caja) {
        this.entityManager.merge(caja);

    }

    @Override
    public void delete(Integer id) {
        Caja caja= this.read(id);
        this.entityManager.remove(caja);
    }
}
