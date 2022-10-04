
package com.co.pojo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="cliente")
public class Cliente implements Serializable{
    
    @Id
    private Integer idcliente;
    private String nombre;
    private String apellidos;
    private String usuario;
    private String password;
    
    
    
}
