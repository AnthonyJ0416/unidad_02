package ec.edu.uce.pa.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "cajas")
public class Caja {
      @Id
    @SequenceGenerator(name="caja_seq",sequenceName ="caja_seq_db", allocationSize =  1)  //nombre de la secuencia, nombre del objeto , incrementak
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="caja_seq")
    @Column(name = "caja_id") // nombre de la columna de la base de datos
    private Integer id;
    @Column(name = "caja_numero") // nombre de la columna de la base de datos
    private String numero;
    @Column(name = "caja_saldoInicial") 
    private double saldoInicial;
    @Column(name = "caja_saldoActual") 
    private double saldoActual;
    @Column(name = "caja_isAbierta") 
    private boolean isAbierta;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNumeroCaja() {
        return numero;
    }
    public void setNumeroCaja(String numeroCaja) {
        this.numero = numeroCaja;
    }
    public double getSaldoInicial() {
        return saldoInicial;
    }
    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
    public double getSaldoActual() {
        return saldoActual;
    }
    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    public boolean isAbierta() {
        return isAbierta;
    }
    public void setAbierta(boolean abierta) {
        this.isAbierta = abierta;
    }


    
}
