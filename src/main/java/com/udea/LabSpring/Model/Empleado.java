/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.LabSpring.Model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 *
 * @author Team
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@ApiModel(description = "Toda la informacion del empleado. ")

@Document(collection = "Empleados")
public class Empleado implements Serializable{
    
    @ApiModelProperty(notes = " ID del empelado")
    @Id
    private String empleadoId;
    
    @ApiModelProperty(notes = "nombre completo")
    private @NonNull String nombreCompleto;
    
    @ApiModelProperty(notes = "correo")
    private @NonNull String email;
    
    @ApiModelProperty(notes = "cargo empleado")
    private @NonNull String cargo;
    
    @ApiModelProperty(notes = "salario")
    private @NonNull Double salario;
    
    @ApiModelProperty(notes = "nombre completo")
    private @NonNull String genero;
    
    @ApiModelProperty(notes = "Estado civil del empleado")
    private String estadoCivil;

    @ApiModelProperty(notes = "edad del empleado")
    private int edad;

    @ApiModelProperty(notes = "telefono empleado")
    private String telefono;

    public Double getSalario() {
        return salario;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmpleadoId() {
        return empleadoId;
    }
}
