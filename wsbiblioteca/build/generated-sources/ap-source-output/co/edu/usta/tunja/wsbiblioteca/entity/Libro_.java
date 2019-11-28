package co.edu.usta.tunja.wsbiblioteca.entity;

import co.edu.usta.tunja.wsbiblioteca.entity.Prestamo;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-27T20:03:52")
@StaticMetamodel(Libro.class)
public class Libro_ { 

    public static volatile SingularAttribute<Libro, Integer> idlibro;
    public static volatile CollectionAttribute<Libro, Prestamo> prestamoCollection;
    public static volatile SingularAttribute<Libro, String> autor;
    public static volatile SingularAttribute<Libro, String> anio;
    public static volatile SingularAttribute<Libro, String> nombrelibro;
    public static volatile SingularAttribute<Libro, String> edicion;

}