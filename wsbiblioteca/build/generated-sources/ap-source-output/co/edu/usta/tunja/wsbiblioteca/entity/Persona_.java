package co.edu.usta.tunja.wsbiblioteca.entity;

import co.edu.usta.tunja.wsbiblioteca.entity.Prestamo;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-27T20:03:52")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> codigo;
    public static volatile CollectionAttribute<Persona, Prestamo> prestamoCollection;
    public static volatile SingularAttribute<Persona, String> apellidoestudiante;
    public static volatile SingularAttribute<Persona, Integer> idestudiante;
    public static volatile SingularAttribute<Persona, String> documento;
    public static volatile SingularAttribute<Persona, String> nombreestudiante;
    public static volatile SingularAttribute<Persona, String> dependencia;
    public static volatile SingularAttribute<Persona, String> email;

}