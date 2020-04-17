package com.uca.capas.tareaclase8.controller;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@RequestMapping("/tarea")
	public @ResponseBody String nombre() throws Exception
	{
		String alumno = "Guillermo Javier, Morales Cornejo, 00011417, Ingenieria en Sistemas, Cuarto Año";
		return alumno; 			
	}
	@RequestMapping("/tarea2")
	public @ResponseBody String parametro(HttpServletRequest request) throws Exception
	{
		
		String mess = (request.getParameter("mes"));
		String diaa = (request.getParameter("dia"));
        String anioo = (request.getParameter("anio")); 
        /*Ejemplo:  http://localhost:8080/tarea2?dia=16&mes=04&anio=2020*/
        
        String fechaEntrada = String.format("%s/%s/%s", diaa, mess, anioo);
        java.util.Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fechaEntrada);
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(fecha);
        String diaSemana = calendario.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        if (diaSemana.equals("WEDNESDAY"))
        {
        	return "El día es: Miércoles";
        }
        else if(diaSemana.equals("THURSDAY"))
        {
        	return "El día es: Jueves";
        }
        else if(diaSemana.equals("FRIDAY"))
        {
        	return "El día es: Viernes";
        }
        else if(diaSemana.equals("SATURDAY"))
        {
        	return "El día es: Sábado";
        }
        else if(diaSemana.equals("SUNDAY"))
        {
        	return "El día es: Domingo";
        }
        else if(diaSemana.equals("MONDAY"))
        {
        	return "El día es: Lunes";
        }
        else if(diaSemana.equals("TUESDAY"))
        {
        	return "El día es: Martes";
        }
        else
        {
        	return diaSemana;
        }
		
	}	
	}


