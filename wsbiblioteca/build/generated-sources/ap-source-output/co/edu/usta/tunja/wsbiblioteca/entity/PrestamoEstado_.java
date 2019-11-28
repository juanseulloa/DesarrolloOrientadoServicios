package co.edu.usta.tunja.wsbiblioteca.entity;

import co.edu.usta.tunja.wsbiblioteca.entity.Estado;
import co.edu.usta.tunja.wsbiblioteca.entity.Prestamo;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-27T20:03:52")
@StaticMetamodel(PrestamoEstado.class)
public class PrestamoEstado_ { 

    public static volatile SingularAttribute<PrestamoEstado, Prestamo> idprestamo;
    public static volatile SingularAttribute<PrestamoEstado, String> hora;
    public static volatile SingularAttribute<PrestamoEstado, Integer> idprestamoestado;
    public static volatile SingularAttribute<PrestamoEstado, Estado> idestado;

}