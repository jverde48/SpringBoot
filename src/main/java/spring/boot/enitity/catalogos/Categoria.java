package spring.boot.enitity.catalogos;

import javax.persistence.*;

/**
 * Created by Green4 on 04/11/2016.
 */
@Entity
@Table(name = "CATEGORIA")
public class Categoria {

    @Id
    @Column(name = "ID_CATEGORIA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategotia;

    @Column(name = "DESCRIPCION")
    private String descripcion;
}
