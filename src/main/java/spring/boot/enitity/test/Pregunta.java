package spring.boot.enitity.test;

import spring.boot.enitity.catalogos.Categoria;
import spring.boot.enitity.generic.Archivo;

import javax.persistence.*;

import java.util.List;
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
    @Column(name = "ID_CATEGORIA")
    private Categoria categoria;

    @OneToOne
    @Column(name = "ID_ARCHIVO")
    private Archivo archivo;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.REMOVE})
    @JoinTable(name="PREGUNTA_RESPUESTA",
            joinColumns={ @JoinColumn(name="ID_PREGUNTA", referencedColumnName="ID_PREGUNTA") },
            inverseJoinColumns={ @JoinColumn(name="ID_RESPUESTA", referencedColumnName="ID_RESPUESTA")})
    private List<Respuesta> respuestas;

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

    public List<Respuesta> getRespuestas() {
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

    public void setRespuestas(List<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }
}
