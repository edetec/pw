package br.senai.sc.ti20131n.pw.gpe.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.senai.sc.ti20131n.pw.gpe.entity.Canal;
import br.senai.sc.ti20131n.pw.gpe.util.JpaUtil;

public class CanalDao {
	

	private EntityManager entityManager;

	public CanalDao() {
		entityManager = JpaUtil.getEntityManager();
	}
	
	public List<Canal> listar() {
		Query query = entityManager
				.createQuery("From Canal", Canal.class);
		return query.getResultList();
	}

	public void salvar(Canal canal) {
		entityManager.merge(canal);
	}

	public Canal buscarPorId(Long id) {
		return entityManager.find(Canal.class, id);
	}

	public Canal excluir(Long id) {
		Canal canal = entityManager.find(Canal.class, id);
		entityManager.remove(canal);
		return canal;
	}

}
