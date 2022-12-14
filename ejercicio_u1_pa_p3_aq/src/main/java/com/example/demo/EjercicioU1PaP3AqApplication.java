package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.sdmatricula.modelo.Propietario;
import com.example.demo.sdmatricula.modelo.Vehiculo;
import com.example.demo.sdmatricula.service.IMatriculaService;
import com.example.demo.sdmatricula.service.IPropietarioService;
import com.example.demo.sdmatricula.service.IVehiculoService;
import com.example.demo.sdmatricula.service.MatriculaServiceImpl;
import com.example.demo.sdmatricula.service.PropietarioServiceImpl;
import com.example.demo.sdmatricula.service.VehiculoServiceImpl;

@SpringBootApplication
public class EjercicioU1PaP3AqApplication implements CommandLineRunner{
@Autowired
private IMatriculaService iMatriculaService;
@Autowired 
private IPropietarioService iPropietarioService;
@Autowired 
IVehiculoService iVehiculoService;
	public static void main(String[] args) {
		SpringApplication.run(EjercicioU1PaP3AqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("SPRING");
	 VehiculoServiceImpl vehiculoServiceImpl = new VehiculoServiceImpl();
	 vehiculoServiceImpl.Crear("Mazda", "12347", "liviano", new BigDecimal(500));
	VehiculoServiceImpl vehiculoactual=  new VehiculoServiceImpl();
			vehiculoServiceImpl.Actualizar("12347").setMarca("Zuzuki");
			vehiculoServiceImpl.Actualizar("12347").setPrecio(new BigDecimal(400));
	PropietarioServiceImpl propietarioServiceImpl = new PropietarioServiceImpl();
	Propietario propietario = new Propietario();
	propietarioServiceImpl.Crear(propietario);
	propietario.setNombre("Anddy ");
	propietario.setApellido("Quisilema");
	propietario.setCedula("1721483814");
	propietario.setFechanacimiento(LocalDateTime.of(2000, 07, 19, 10, 5));
		
	MatriculaServiceImpl serviceImpl = new MatriculaServiceImpl();
	serviceImpl.valor(vehiculoServiceImpl.Actualizar("12347").getTipo());
	
	}

}

