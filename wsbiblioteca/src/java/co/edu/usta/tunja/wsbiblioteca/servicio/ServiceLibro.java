/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.tunja.wsbiblioteca.servicio;

import co.edu.usta.tunja.wsbiblioteca.ejb.LibroFacade;
import co.edu.usta.tunja.wsbiblioteca.entity.Libro;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.WebServiceContext;

/**
 *
 * @author JUANSE
 */
@WebService(serviceName = "ServicioLibro")
public class ServiceLibro {

    @Resource
    WebServiceContext webServiceContext;
    @EJB
    private LibroFacade _ejbLibro;

    @WebMethod
    public String createLibro(@WebParam(name = "nombre") String nombre, @WebParam(name = "autor") String autor, @WebParam(name = "edicion") String edicion, @WebParam(name = "año") String anio) {
        String resultado;
        Libro objLibro = new Libro();
        objLibro.setNombrelibro(nombre);
        objLibro.setAutor(autor);
        objLibro.setEdicion(edicion);
        objLibro.setAnio(anio);

        this._ejbLibro.grabar(objLibro);

        if (objLibro.getNombrelibro() != null) {
            return resultado="El libro fue creado con exito";
        }

        return resultado="El libro no pudo crearse, es posible que algun dato este erroneo";
    }

    @WebMethod
    public boolean listarLibro() {
        List<Libro> libros = new ArrayList<>();
        libros = this._ejbLibro.listar();
        if (this._ejbLibro.listar().size() > 0) {
            return true;
        }
        return false;

    }
    
    @WebMethod
    public boolean editarLibro(@WebParam(name="codigo") int codigo,@WebParam (name="nombre")String nombre,@WebParam(name="autor") String autor,@WebParam (name="edicion") String edicion,@WebParam(name="año")String anio){
        Libro objLibro=_ejbLibro.buscar(codigo);
        objLibro.setNombrelibro(nombre);
        objLibro.setEdicion(edicion);
        objLibro.setAutor(autor);
        objLibro.setAnio(anio);
        
        if (codigo!=0) {
            _ejbLibro.actulizar(objLibro);
            return true;
        }
       return false;
        
    }
    @WebMethod
    public String borrarLibro (@WebParam(name = "codigo")int codigo){
        String resultado;
        Libro objLibro=_ejbLibro.buscar(codigo);
        if (codigo!=0) {
            _ejbLibro.borrar(objLibro);
            return resultado="El libro fue borrado con exito";
        }
        return resultado="El proceso de borrado no pudo completarse";
        
    }
}
