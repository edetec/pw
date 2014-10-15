package br.senai.sc.ti20131n.pw.gpe.mb;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.Query;

import br.senai.sc.ti20131n.pw.gpe.entity.Canal;
import br.senai.sc.ti20131n.pw.gpe.util.JpaUtil;

@ManagedBean
public class CanalMb {
	private List<Canal> canais;
	private String nome;
	private String genero;
	private Integer classificacao;
	private Integer numero;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(Integer classificacao) {
		this.classificacao = classificacao;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public List<Canal> getCanais() {
		if(canais == null){
			Query query = JpaUtil.getEntityManager()
					.createQuery("From Canal", Canal.class);
			canais = query.getResultList();
		}
		return canais;
	}

	public void setCanais(List<Canal> canais) {
		this.canais = canais;
	}
	
	public String salvar(){
		Canal canal = new Canal();
		canal.setClassificacao(classificacao);
		canal.setGenero(genero);
		canal.setNome(nome);
		canal.setNumero(numero);

		JpaUtil.getEntityManager().persist(canal);
		return "";
	}
}
