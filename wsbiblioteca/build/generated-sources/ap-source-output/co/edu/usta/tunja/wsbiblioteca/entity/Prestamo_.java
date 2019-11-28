package co.edu.usta.tunja.wsbiblioteca.entity;

import co.edu.usta.tunja.wsbiblioteca.entity.Libro;
import co.edu.usta.tunja.wsbiblioteca.entity.Persona;
import co.edu.usta.tunja.wsbiblioteca.entity.PrestamoEstado;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-27T20:03:52")
@StaticMetamodel(Prestamo.class)
public class Prestamo_ { 

    public static volatile SingularAttribute<Prestamo, String> fechaentrega;
    public static volatile SingularAttribute<Prestamo, Libro> idlibro;
    public static volatile CollectionAttribute<Prestamo, PrestamoEstado> prestamoEstadoCollection;
    public static volatile SingularAttribute<Prestamo, String> fechaprestamo;
    public static volatile SingularAttribute<Prestamo, Integer> idprestamo;
    public static volatile SingularAttribute<Prestamo, Persona> idestudiante;

}