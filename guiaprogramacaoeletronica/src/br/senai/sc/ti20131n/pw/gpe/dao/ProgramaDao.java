package br.senai.sc.ti20131n.pw.gpe.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.senai.sc.ti20131n.pw.gpe.entity.Programa;
import br.senai.sc.ti20131n.pw.gpe.util.JpaUtil;

public class ProgramaDao {
	

	private EntityManager entityManager;

	public ProgramaDao() {
		entityManager = JpaUtil.getEntityManager();
	}
	
	public List<Programa> listar() {
		Query query = entityManager
				.createQuery("From Programa", Programa.class);
		return query.getResultList();
	}

	public void salvar(Programa programa) {
		entityManager.merge(programa);
	}

	public Programa buscarPorId(Long id) {
		return entityManager.find(Programa.class, id);
	}

	public Programa excluir(Long id) {
		Programa programa = entityManager.find(Programa.class, id);
		entityManager.remove(programa);
		return programa;
	}

}
