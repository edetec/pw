package br.senai.sc.ti20131n.pw.gpe.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.persistence.Query;

import br.senai.sc.ti20131n.pw.gpe.dao.CanalDao;
import br.senai.sc.ti20131n.pw.gpe.entity.Canal;
import br.senai.sc.ti20131n.pw.gpe.util.JpaUtil;

@ManagedBean
public class CanalMb {
	private CanalDao canalDao;
	
	private List<Canal> canais;
	private Canal canal;


	public List<Canal> getCanais() {
		if(canais == null){
			canais = canalDao.listar();
		}
		return canais;
	}

	public void setCanais(List<Canal> canais) {
		this.canais = canais;
	}

	public Canal getCanal() {
		return canal;
	}

	public void setCanal(Canal canal) {
		this.canal = canal;
	}
	
 //***************  ações *****************************
	
	@PostConstruct
	public void init(){
		canalDao = new CanalDao();
		canal = new Canal();
	}
	
	public String salvar(){
		canalDao.salvar(getCanal());
		return "canallista";
	}
	
	public String carregarEdicao(Long id){
		canal = canalDao.buscarPorId(id);
		return "canalform";
	}
	
	public String excluir(Long id){
		canalDao.excluir(id);
		return "canalform";
	}
}
