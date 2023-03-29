package com.example.dao;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.example.entities.Produit;

public class ProduitRepositoryImpl implements ProduitRepository {

	@Override
	public List<Produit> findAll() {
	
		return null;
	}

	@Override
	public List<Produit> findAll(Sort sort) {
	
		return null;
	}

	@Override
	public List<Produit> findAllById(Iterable<String> ids) {
		
		return null;
	}

	@Override
	public <S extends Produit> List<S> saveAll(Iterable<S> entities) {
	
		return null;
	}

	@Override
	public void flush() {
	
		
	}

	@Override
	public <S extends Produit> S saveAndFlush(S entity) {

		return null;
	}

	@Override
	public <S extends Produit> List<S> saveAllAndFlush(Iterable<S> entities) {

		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Produit> entities) {

		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<String> ids) {

		
	}

	@Override
	public void deleteAllInBatch() {

		
	}

	@Override
	public Produit getOne(String id) {
		
		return null;
	}

	@Override
	public Produit getById(String id) {
		
		return null;
	}

	@Override
	public Produit getReferenceById(String id) {

		return null;
	}

	@Override
	public <S extends Produit> List<S> findAll(Example<S> example) {

		return null;
	}

	@Override
	public <S extends Produit> List<S> findAll(Example<S> example, Sort sort) {

		return null;
	}

	@Override
	public Page<Produit> findAll(Pageable pageable) {

		return null;
	}

	@Override
	public <S extends Produit> S save(S entity) {
		
		return null;
	}

	@Override
	public Optional<Produit> findById(String id) {
	
		return Optional.empty();
	}

	@Override
	public boolean existsById(String id) {
		
		return false;
	}

	@Override
	public long count() {
		
		return 0;
	}

	@Override
	public void deleteById(String id) {

		
	}

	@Override
	public void delete(Produit entity) {
		
		
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
	
		
	}

	@Override
	public void deleteAll(Iterable<? extends Produit> entities) {
	
		
	}

	@Override
	public void deleteAll() {
	
		
	}

	@Override
	public <S extends Produit> Optional<S> findOne(Example<S> example) {
		
		return Optional.empty();
	}

	@Override
	public <S extends Produit> Page<S> findAll(Example<S> example, Pageable pageable) {
		
		return null;
	}

	@Override
	public <S extends Produit> long count(Example<S> example) {
	
		return 0;
	}

	@Override
	public <S extends Produit> boolean exists(Example<S> example) {
		
		return false;
	}

	@Override
	public <S extends Produit, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		
		return null;
	}

	@Override
	public Page<Produit> chercherProduit(String mc, java.awt.print.Pageable pageable) {
		
		return null;
	}

	@Override
	public Page<Produit> findByDesignationContains(String mc, PageRequest pageRequest) {
		
		return null;
	}

}
