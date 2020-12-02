package com.redsocial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redsocial.entity.Sistema;
import com.redsocial.service.SistemaService;

@RestController
@RequestMapping("/api/rest/sistema")
public class SistemaController {

	@Autowired
	private SistemaService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Sistema>> lista(){
		return ResponseEntity.ok(service.listaSistema());
	}
}
