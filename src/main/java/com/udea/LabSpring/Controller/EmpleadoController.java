/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.LabSpring.Controller;


import com.udea.LabSpring.Model.Empleado;
import com.udea.LabSpring.Service.EmpleadoService;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

/**
 *
 * @author Esteban
 */


//@RequestMapping("/persona")
@CrossOrigin("*")
@RestController
public class EmpleadoController {
    
    @Autowired
    private EmpleadoService empleadoService;
    
    @PostMapping("/aggEmpl")
    public String aggEmpleado(@RequestBody Empleado empleado){
        if(empleado.getEdad()<18 || empleado.getSalario()<0){
            return "Datos invalidos";
        }
        else {
            try{
                if(empleadoService.existsById(empleado.getEmpleadoId())){
                    return "ya existe";
                }
                empleadoService.save(empleado);
                return "Agregado con id: "+empleado.getEmpleadoId();
            }
            catch (Exception e)
            {
                return e.getMessage();
            }
        }
    }
    
    @GetMapping(value = "/findAllEmp",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Empleado> getEmpleados(){
        return empleadoService.findAll();
    }

    @GetMapping(value ="/findEmp/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Empleado> getEmpleado(@PathVariable String id){
        return empleadoService.findById(id);
    }
    
    
    @DeleteMapping("/delEmp/{id}")
    public String deleteEmpleado(@PathVariable String id){
        empleadoService.deleteById(id);
        return "Empleado despedido";
    }
    @PutMapping(value = "/update")
    public String updateEmpleado(@RequestBody Empleado empleado){
        //Optional<Empleado> lista = repository.findById(id);
        empleadoService.save(empleado);
        //return lista.get().getId();
        return "update exitoso";
    }
    
}
