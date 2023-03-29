package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.example.dao.ProduitRepository;
import com.example.entities.Produit;
import com.exemple.config.AppConfig;



@SpringBootApplication
@Import(AppConfig.class)
public class SpringCCatMvcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringCCatMvcApplication.class, args);
		
		
		
	}
	@Autowired
	ProduitRepository ipRepository;
	@Override
	public void run(String... args) throws Exception {	
		Produit p = new Produit();
		p.setReference("PR100");
		p.setDesignation("PC P");
		p.setPrix(2550.00);
		p.setQuantite(50); 
		ipRepository.save(p);
		
	}
	
	

	

}
