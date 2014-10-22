package br.senai.sc.ti20131n.pw.gpe.mb;

import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;

import br.senai.sc.ti20131n.pw.gpe.util.JpaUtil;

@ManagedBean
public class ContatoMb {
	private String nome;
	private String email;
	private String senha;
	private Boolean news;
	private Integer area;
	private String mensagem;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Boolean getNews() {
		return news;
	}
	public void setNews(Boolean news) {
		this.news = news;
	}
	public Integer getArea() {
		return area;
	}
	public void setArea(Integer area) {
		this.area = area;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public String enviar(){
		EntityManager entityManager = JpaUtil.getEntityManager();
		
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("Senha: " + senha);
		System.out.println("Área: " + area);
		System.out.println("Mensagem: " + mensagem);
		System.out.println("News: " + news);
		return "";
	}
}
