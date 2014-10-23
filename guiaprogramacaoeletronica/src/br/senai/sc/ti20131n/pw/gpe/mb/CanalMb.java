package br.senai.sc.ti20131n.pw.gpe.mb;

import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.servlet.http.Part;

import br.senai.sc.ti20131n.pw.gpe.dao.CanalDao;
import br.senai.sc.ti20131n.pw.gpe.entity.Canal;
import br.senai.sc.ti20131n.pw.gpe.util.UploadImageUtil;

@ManagedBean
public class CanalMb {
	private CanalDao canalDao;
	
	private List<Canal> canais;
	private Canal canal;
	private Part logo;


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
	
	public Part getLogo() {
		return logo;
	}

	public void setLogo(Part logo) {
		this.logo = logo;
	}

	@PostConstruct
	public void init(){
		canalDao = new CanalDao();
		canal = new Canal();
	}
	
 //***************  ações *****************************
	
	public String caminho(String nomeImagem){
		return UploadImageUtil.getCaminho(nomeImagem);
	}
	
	public String salvar() throws IOException{
		String nomeImagem = UploadImageUtil.copiar(logo, canal.getLogo());
		canal.setLogo(nomeImagem);
		
		canalDao.salvar(getCanal());
		return "canallista";
	}
	
	public String carregarEdicao(String id){
		canal = canalDao.buscarPorId(Long.parseLong(id));
		return "canalform";
	}
	
	public String excluir(String id){
		Canal canalRemovido = canalDao.excluir(Long.parseLong(id));
		UploadImageUtil.deletar(canalRemovido.getLogo());
		canais = null;
		return "canallista";
	}
}
