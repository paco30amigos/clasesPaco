package models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2015-03-25T09:33:33")
@StaticMetamodel(CentrosDiversion.class)
public class CentrosDiversion_ { 

    public static volatile SingularAttribute<CentrosDiversion, Integer> codigo;
    public static volatile SingularAttribute<CentrosDiversion, String> nombre;
    public static volatile SingularAttribute<CentrosDiversion, Date> fechaFundacion;
    public static volatile SingularAttribute<CentrosDiversion, Integer> tipoLugar;
    public static volatile SingularAttribute<CentrosDiversion, Integer> capacidadPersonas;
    public static volatile SingularAttribute<CentrosDiversion, Integer> fkPais;

}