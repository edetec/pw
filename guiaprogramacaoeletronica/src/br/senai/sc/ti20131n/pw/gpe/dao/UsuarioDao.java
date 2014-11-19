package br.senai.sc.ti20131n.pw.gpe.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.senai.sc.ti20131n.pw.gpe.entity.Usuario;
import br.senai.sc.ti20131n.pw.gpe.util.JpaUtil;

public class UsuarioDao {
	private EntityManager entityManager;

	public UsuarioDao() {
		entityManager = JpaUtil.getEntityManager();
	}

	public Usuario buscarUsuarioPorNome(String nome) {
		Query query = entityManager.createQuery(
				"From Usuario u Where u.nome = :nome", Usuario.class);
		query.setParameter("nome", nome);
		try {
			return (Usuario) query.getSingleResult();
		} catch (Exception exception) {
			return null;
		}
	}
}
