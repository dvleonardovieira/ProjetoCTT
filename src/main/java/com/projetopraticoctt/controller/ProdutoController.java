package com.projetopraticoctt.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetopraticoctt.entity.Produto;
import com.projetopraticoctt.repository.ProdutoRepository;
import com.projetopraticoctt.service.ProdutoService;

@RestController
@RequestMapping("/apifinal")


public class ProdutoController {	//entrada da aplicação

	ProdutoService produtoService;

	private ProdutoRepository produtoRepository;

	public ProdutoController(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}

	@GetMapping("/")
	public List<Produto> listar() {
		return produtoRepository.findAll();
	}

	@PostMapping("/cadastra")
	public Produto cadastrar(Produto produto) {
		return produtoService.cadastra(produto);

	}

	@GetMapping("/buscar")
	public List<Produto> buscar() {
		return produtoService.buscar();
	}

	@PutMapping("/editar")
	public Produto editar(@RequestBody Produto produto) {
		return produtoService.editar(produto);
	}

	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		produtoService.deletar(id);
	}
}