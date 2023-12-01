package co.com.controlgastos.controlgastos.persistent.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
@Embeddable
public class UsuarioPK implements Serializable {
    @Column(name="id_usuario")
    private Integer idUsuario;

}
