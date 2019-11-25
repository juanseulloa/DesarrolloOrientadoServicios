/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.tunja.wsbiblioteca.servicio;

import co.edu.usta.tunja.wsbiblioteca.ejb.PersonaFacade;
import co.edu.usta.tunja.wsbiblioteca.entity.Persona;
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
@WebService(serviceName = "ServicioPersona")
public class ServicePersona {

    @Resource
    WebServiceContext webServiceContext;
    @EJB
    private PersonaFacade _ejbPersona;

    @WebMethod
    public String createPersona(@WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "codigo") String codigo, @WebParam(name = "documento") String documento, @WebParam(name = "email") String email, @WebParam(name = "dependencia") String dependencia) {
        String resultado;
        Persona objPersona = new Persona();
        objPersona.setNombreestudiante(nombre);
        objPersona.setApellidoestudiante(apellido);
        objPersona.setCodigo(codigo);
        objPersona.setDocumento(documento);
        objPersona.setEmail(email);
        objPersona.setDependencia(dependencia);

        this._ejbPersona.grabar(objPersona);

        if (objPersona.getNombreestudiante()!= null) {
            return resultado="El estudiante fue creado con exito";
        }

        return resultado="El estudiante no pudo crearse, es posible que algun dato este erroneo";
    }

    @WebMethod
    public boolean listarPersona() {
        List<Persona> personas = new ArrayList<>();
        personas = this._ejbPersona.listar();
        if (this._ejbPersona.listar().size() > 0) {
            return true;
        }
        return false;

    }
    
    @WebMethod
    public boolean editarPersona( @WebParam(name = "codigo") int codigo, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido,@WebParam(name = "idEstudiante") String idEstudiante, @WebParam(name = "documento") String documento, @WebParam(name = "email") String email, @WebParam(name = "dependencia") String dependencia){
        Persona objPersona=_ejbPersona.buscar(codigo);
        objPersona.setNombreestudiante(nombre);
        objPersona.setApellidoestudiante(apellido);
        objPersona.setCodigo(idEstudiante);
        objPersona.setDocumento(documento);
        objPersona.setEmail(email);
        objPersona.setDependencia(dependencia);
        
        if (objPersona!=null) {
            _ejbPersona.actulizar(objPersona);
            return true;
        }
       return false;
        
    }
    @WebMethod
    public String borrarPersona (@WebParam(name = "codigo")int codigo){
        String resultado;
        Persona objPersona=_ejbPersona.buscar(codigo);
        if (objPersona!=null) {
            _ejbPersona.borrar(objPersona);
            return resultado="El estudiante fue borrado con exito";
        }
        return resultado="El proceso de borrado no pudo completarse";
        
    }
}
