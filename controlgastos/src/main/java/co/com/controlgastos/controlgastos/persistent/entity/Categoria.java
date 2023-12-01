package co.com.controlgastos.controlgastos.persistent.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    @Column(name = "tipo_de_gasto")
    private String tipoGasto;
    @Column(name="descripcion_de_gasto")
    private String descripcionGasto;
    @Column(name = "valor_del_gasto")
    private String valorGasto;
    private Integer idUsuario;
}
