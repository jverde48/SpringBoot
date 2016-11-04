package spring.boot.enitity.generic;

import javax.persistence.*;

/**
 * Created by Green4 on 04/11/2016.
 */
@Entity
@Table(name = "ARCHIVO")
public class Archivo {

    @Id
    @Column(name = "ID_ARCHIVO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArchivo;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "EXTENSION")
    private String  extension;

    @Column(name = "HASH_FILE")
    private String hashFile;

    @Column(name = "MIME_TYPE")
    private String mimeType;

    @Column(name = "PATH")
    private String path;

    public Long getIdArchivo() {
        return idArchivo;
    }

    public void setIdArchivo(Long idArchivo) {
        this.idArchivo = idArchivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getHashFile() {
        return hashFile;
    }

    public void setHashFile(String hashFile) {
        this.hashFile = hashFile;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
