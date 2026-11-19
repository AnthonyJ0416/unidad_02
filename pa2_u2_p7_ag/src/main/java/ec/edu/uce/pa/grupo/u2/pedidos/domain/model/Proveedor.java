package ec.edu.uce.pa.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity 
@Table(name="proveedores")
public class Proveedor {
     @Id
    @SequenceGenerator(name = "proveedor_seq", sequenceName = "proveedor_seq_db", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "proveedor_seq")
    @Column(name = "prove_id")
    private Integer id;
     @Column(name = "prove_nombreEmpresa")
    private String nombreEmpresa;
     @Column(name = "prove_contacto")
    private String contacto;
     @Column(name = "prove_telefono")
    private String telefono;
     @Column(name = "prove_ciudad")
    private String ciudad;

}
