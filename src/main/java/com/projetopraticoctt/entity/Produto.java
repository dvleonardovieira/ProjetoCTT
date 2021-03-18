package com.projetopraticoctt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "db_prduto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // id auto incremental
	private Long id;

	@Column(nullable = false)
	private Long preco;

	@Column(nullable = false)
	private String nomeProduto;

	@Column(nullable = false)
	private String categoria;

	@Column(nullable = false)
	private String descricao;

}
