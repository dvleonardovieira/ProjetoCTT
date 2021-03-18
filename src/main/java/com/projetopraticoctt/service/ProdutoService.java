package com.projetopraticoctt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.projetopraticoctt.entity.Produto;
import com.projetopraticoctt.repository.ProdutoRepository;

@Service
public class ProdutoService {

	private ProdutoRepository produtoRepository;

	public ProdutoService(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}

	public Produto cadastra(Produto produto) {
		return produtoRepository.save(produto);
	}

	public List<Produto> buscar() {
		return produtoRepository.findAll(); // get
	}

	public Produto editar(Produto produto) { // put
		return produtoRepository.save(produto);
	}

	public void deletar(Long id) { // delete
		produtoRepository.deleteById(id);
	}

	public Optional<Produto> buscarPorId(Long id) {
		return produtoRepository.findById(id);
	}

}
