/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.LabSpring.Service;

import com.udea.LabSpring.Model.Empleado;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
 *
 * @author Esteban
 */
public interface EmpleadoService extends MongoRepository<Empleado,String> {
    
}
