package br.senai.sc.ti20131n.pw.gpe.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.senai.sc.ti20131n.pw.gpe.dao.ProgramaDao;
import br.senai.sc.ti20131n.pw.gpe.entity.Programa;

@ManagedBean
public class ProgramaMb {
	private Programa programa;
	private List<Programa> programas;
	private ProgramaDao dao;
	
	@PostConstruct
	public void init(){
		dao = new ProgramaDao();
		programa = new Programa();
	}
	
	public Programa getPrograma() {
		return programa;
	}
	
	public void setPrograma(Programa programa) {
		this.programa = programa;
	}
	
	
	
	public List<Programa> getProgramas() {
		if(programas == null){
			programas = dao.listar();
		}
		return programas;
	}

	public void setProgramas(List<Programa> programas) {
		this.programas = programas;
	}

	public String salvar() {
		dao.salvar(programa);
		
		return "programalista";
	}
	
	public String carregarEdicao(String id) {
		programa = dao.buscarPorId(Long.parseLong(id));
		return "programaform";
	}
	
	public String excluir(String id){
		dao.excluir(Long.parseLong(id));
		programas = null;
		return "";
	}
}
