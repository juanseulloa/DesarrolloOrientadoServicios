/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.tunja.wsbiblioteca.servicio;

import co.edu.usta.tunja.wsbiblioteca.ejb.LibroFacade;
import co.edu.usta.tunja.wsbiblioteca.entity.Libro;
import java.util.ArrayList;
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
@WebService(serviceName = "Servicio")
public class Servicio {

    @Resource
    WebServiceContext webServiceContext;
    @EJB
    private LibroFacade _ejbLibro;

  @WebMethod(operationName = "crearLibro")
    public boolean crearLibro(@WebParam(name = "nombre") String nombre, @WebParam(name = "autor") String autor, @WebParam(name = "edicion") String edicion, @WebParam(name = "anios") String anio) {
        Libro objLibro = new Libro();
        objLibro.setNombrelibro(nombre);
        objLibro.setAutor(autor);
        objLibro.setEdicion(edicion);
        objLibro.setAnio(anio);
         
        if (objLibro.getNombrelibro().isEmpty()) {
            return false;
        }
        this._ejbLibro.grabar(objLibro);
        return true;
    }
 
    @WebMethod
    public List<Libro>listarLibro() {
        List<Libro> libros = new ArrayList<>();
        libros = this._ejbLibro.listar();
        if (this._ejbLibro.listar().size() > 0) {
           return libros;
        }
        return libros;

    }

    @WebMethod(operationName = "editarLibro")
    public boolean editarLibro(@WebParam(name = "codigo") int codigo, @WebParam(name = "nombre") String nombre, @WebParam(name = "autor") String autor, @WebParam(name = "edicion") String edicion, @WebParam(name = "anios") String anio) {
        Libro objLibro = _ejbLibro.buscar(codigo);
        objLibro.setNombrelibro(nombre);
        objLibro.setEdicion(edicion);
        objLibro.setAutor(autor);
        objLibro.setAnio(anio);

        if (codigo != 0) {
            _ejbLibro.actulizar(objLibro);
            return true;
        }
        return false;

    }

    @WebMethod
    public boolean borrarLibro(@WebParam(name = "codigo") int codigo) {

        Libro objLibro = _ejbLibro.buscar(codigo);
        if (codigo != 0) {
            _ejbLibro.borrar(objLibro);
            return true;
        }
        return false;

    }
}
