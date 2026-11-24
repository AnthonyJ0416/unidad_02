package ec.edu.uce.pa.grupo.u2;

import java.time.LocalDateTime;
import java.util.Optional;

import ec.edu.uce.pa.grupo.u2.pedidos.application.CajaService;
import ec.edu.uce.pa.grupo.u2.pedidos.application.ClienteService;
import ec.edu.uce.pa.grupo.u2.pedidos.application.FacturaService;
import ec.edu.uce.pa.grupo.u2.pedidos.application.PedidoService;
import ec.edu.uce.pa.grupo.u2.pedidos.application.ProductoService;
import ec.edu.uce.pa.grupo.u2.pedidos.application.ProveedorService;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
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
        Optional<Pedido> pedido = this.pedidoService.buscarPorId(100);
        if(pedido.isPresent()){
            System.out.println("Pedido encontrado" + pedido.get());
        }else{
            System.out.println("Pedido no encontrado");
        }

         Pedido pedidoN = new Pedido();
        pedidoN.setProducto("laptop");
        pedidoN.setPrecio(100.0);
        pedidoN.setFecha(LocalDateTime.now());
        pedidoN.setNumero("PED-0001");
        this.pedidoService.guardar(pedidoN);
        //read by number
        Optional<Pedido> pedidoByNumber= this.pedidoService.buscarPorNumero("PED-0001");
          if(pedido.isPresent()){
            System.out.println("Pedido encontrado por numero" + pedido.get());
        }else{
            System.out.println("Pedido no encontrado por numero");
        }
        return 0;
    }

}
