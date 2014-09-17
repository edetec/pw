package br.senai.sc.ti20131n.pw.gpe.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Programa {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private Date inicio;
	private Date fim;
	@Lob
	private String descricao;
	private Integer classificacao;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Canal canal;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	public Date getFim() {
		return fim;
	}
	public void setFim(Date fim) {
		this.fim = fim;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(Integer classificacao) {
		this.classificacao = classificacao;
	}
	public Canal getCanal() {
		return canal;
	}
	public void setCanal(Canal canal) {
		this.canal = canal;
	}
	
}
