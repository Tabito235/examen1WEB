package examen1.examen1.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class inventarioControllers {
    @GetMapping("/Inventario/agregar") 
    public String inventarioAgregar() {
        return "/inventario/agregar";
    }
    @GetMapping("/Inventario/editar")
    public String inventarioditar() {
        return "/inventario/editar";
    }
    @GetMapping("/Inventario/eliminar")
    public String inventarioEliminar() {
        return "/inventario/eliminar";
    }
    @GetMapping("/Inventario")
    public String inventario() {
        return "/inventario/inventario";
    }
}