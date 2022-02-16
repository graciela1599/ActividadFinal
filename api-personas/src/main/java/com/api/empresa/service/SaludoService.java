package com.api.empresa.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.api.empresa.response.SaludoResponse;

@Service
public class SaludoService {
	
	
	RestTemplate restTemplate;
	
	String url = "http://localhost:8080/api/saludo/get/tipo/";
	
	

	public SaludoResponse getSaludo() {
		restTemplate = new RestTemplate();
		
		SaludoResponse saludo = new SaludoResponse();
	
		try {
			 saludo = restTemplate.getForObject(url + getTipoSaludo(),SaludoResponse.class);
		}catch(NullPointerException e) {
			
		}
		
		return saludo;
	}
	
	private String getTipoSaludo() {
		int hora_actual = LocalDateTime.now().getHour();

		if(hora_actual >= 5 && hora_actual < 12) 
			return "dia";

			
		if(hora_actual >= 12 && hora_actual <= 18 ) 
			return "tarde";
			
				
		return "noche";
		
	}

}
