package spring.boot.entity.test;

import spring.boot.entity.catalogos.Categoria;
import spring.boot.entity.generic.Archivo;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Green4 on 04/11/2016.
 */
@Entity
@Table(name = "PREGUNTA")
public class Pregunta {

    @Id
    @Column(name = "ID_PREGUNTA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPregunta;

    @Column(name = "PREGUNTA")
    private String pregunta;

    @Column(name = "DIFICULTAD")
    private Character dificultad;

    @Column(name = "ACTIVA")
    private Boolean activa;

    @OneToOne
    @JoinColumn(name="ID_CATEGORIA", nullable = false)
    private Categoria categoria;

    @OneToOne
    @JoinColumn(name="ID_ARCHIVO", nullable = true)
    private Archivo archivo;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST,
            CascadeType.REFRESH, CascadeType.REMOVE}, mappedBy = "pregunta")
    private Set<Respuesta> respuestas;

    @ManyToOne
    @JoinTable(name="ENCUESTA_PREGUNTA",
            joinColumns =  @JoinColumn(name = "ID_PREGUNTA", referencedColumnName = "ID_PREGUNTA"),
            inverseJoinColumns = @JoinColumn(name = "ID_ENCUESTA", referencedColumnName = "ID_ENCUESTA"))
    private Encuesta encuesta;

    public Long getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(Long idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public Character getDificultad() {
        return dificultad;
    }

    public void setDificultad(Character dificultad) {
        this.dificultad = dificultad;
    }

    public Boolean getActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }

    public Set<Respuesta> getRespuestas() {
        return respuestas;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Archivo getArchivo() {
        return archivo;
    }

    public void setArchivo(Archivo archivo) {
        this.archivo = archivo;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setRespuestas(Set<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }
}
