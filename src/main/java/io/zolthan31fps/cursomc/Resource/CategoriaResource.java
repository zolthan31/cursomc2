package io.zolthan31fps.cursomc.Resource;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/categorias")
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public String listar() {
        return "Rest esta funcionando!";
    }
}
