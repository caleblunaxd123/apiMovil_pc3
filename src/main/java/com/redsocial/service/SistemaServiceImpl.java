package com.redsocial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entity.Sistema;
import com.redsocial.repository.SistemaRepository;

@Service
public class SistemaServiceImpl implements SistemaService {

	@Autowired
	private SistemaRepository repository;

	@Override
	public List<Sistema> listaSistema() {
		return repository.findAll();
	}

}
