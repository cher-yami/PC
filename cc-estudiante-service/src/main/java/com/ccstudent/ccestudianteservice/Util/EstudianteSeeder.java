package com.ccstudent.ccestudianteservice.Util;

import com.ccstudent.ccestudianteservice.Entidad.Estudiante;
import com.ccstudent.ccestudianteservice.Repositorio.EstudianteRepositorio;
import com.ccstudent.ccestudianteservice.Servicio.EstudianteServicio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EstudianteSeeder implements CommandLineRunner {

    private final EstudianteRepositorio estudianteRepositorio;
    public EstudianteSeeder(EstudianteRepositorio estudianteRepositorio) {
        this.estudianteRepositorio = estudianteRepositorio;
    }
    @Override
    public void run(String... args){
        if (estudianteRepositorio.count() == 0) {

            Estudiante estudiante1 = new Estudiante(null, "pedrito" , "contabilidad", "activo",1);
            Estudiante estudiante2 = new Estudiante(null, "elvis", "sistemas", "activo",5);


            estudianteRepositorio.save(estudiante1);
            estudianteRepositorio.save(estudiante2);



            System.out.println("Datos de Estudiante insertados correctamente.");
        }else {
            System.out.println("Los Estudiantes ya existen, no se insertaron datos.");
}
}
}
