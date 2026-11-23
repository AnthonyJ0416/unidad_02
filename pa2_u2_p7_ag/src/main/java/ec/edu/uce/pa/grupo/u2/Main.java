package ec.edu.uce.pa.grupo.u2;

import java.time.LocalDateTime;

import ec.edu.uce.pa.grupo.u2.pedidos.application.CajaService;
import ec.edu.uce.pa.grupo.u2.pedidos.application.ClienteService;
import ec.edu.uce.pa.grupo.u2.pedidos.application.FacturaService;
import ec.edu.uce.pa.grupo.u2.pedidos.application.PedidoService;
import ec.edu.uce.pa.grupo.u2.pedidos.application.ProductoService;
import ec.edu.uce.pa.grupo.u2.pedidos.application.ProveedorService;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Caja;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Cliente;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Factura;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Producto;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Proveedor;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {
    @Inject
    private PedidoService pedidoService;

    @Inject
    private CajaService cajaService;

    @Inject
    private ClienteService clienteService;

    @Inject
    private ProveedorService proveedorService;

    @Inject
    private FacturaService facturaService;

    @Inject
    private ProductoService productoService;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println("hELLO QUARKUS !");

        Pedido pedido = new Pedido();
        pedido.setProducto("laptop ");
        pedido.setPrecio(100.0);
        pedido.setFecha(LocalDateTime.now());
        this.pedidoService.guardar(pedido);

        // Read (buscar)
        this.pedidoService.buscarPorId(2);
        System.out.println("Pedido encontrado: " + pedido);

        // Update

        pedido.setPrecio(200.0);
        this.pedidoService.actualizar(pedido);

        Pedido pedido2 = this.pedidoService.buscarPorId(2);
        System.out.println("Pedido actualizado:" + pedido2);

        // Delete
        this.pedidoService.eliminar(2);
        /*
         * 
         * Caja caja = new Caja();
         * caja.setAbierta(false);
         * caja.setNumeroCaja("01");
         * caja.setSaldoInicial(100);
         * caja.setSaldoActual(500);
         * this.cajaService.guardar(caja);
         * 
         * Factura factura = new Factura();
         * factura.setNombreVendedor("Carlos Pérez");
         * factura.setNumeroFactura("FAC-001");
         * factura.setTotal(150.75);
         * factura.setFecha("2026-11-23");
         * this.facturaService.guardar(factura);
         * 
         * Cliente cliente = new Cliente();
         * cliente.setNombre("Ana Gómez");
         * cliente.setCorreo("ana.gomez@correo.com");
         * cliente.setTelefono("0991234567");
         * cliente.setDireccion("Av. Amazonas y Patria");
         * this.clienteService.guardar(cliente);
         * 
         * Producto producto = new Producto();
         * producto.setNombre("Mouse inalámbrico");
         * producto.setPrecio(25.50);
         * producto.setDescripcion("Mouse óptico ergonómico");
         * producto.setStock(50);
         * this.productoService.guardar(producto);
         * 
         * Proveedor proveedor = new Proveedor();
         * proveedor.setNombreEmpresa("TechDistribuciones S.A.");
         * proveedor.setContacto("Luis Morales");
         * proveedor.setTelefono("022345678");
         * proveedor.setCiudad("Quito");
         * this.proveedorService.guardar(proveedor);
         */
        return 0;
    }

}
