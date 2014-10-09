package br.senai.sc.ti20131n.pw.introducaojsf.mb;

import javax.faces.bean.ManagedBean;

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
	
	public void enviar(){
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("Senha: " + senha);
		System.out.println("Área: " + area);
		System.out.println("Mensagem: " + mensagem);
		System.out.println("News: " + news);
	}
}
