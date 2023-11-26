
package com.ebac.reflections.anotacao.cadastro.service.generic;

import com.ebac.reflections.anotacao.cadastro.dao.generic.IGenericDao;
import com.ebac.reflections.anotacao.cadastro.domain.Persistente;
import com.ebac.reflections.anotacao.cadastro.exception.TipoChaveNaoEncontradaException;
import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author tote1i
 * @param <T>
 * @param <E>
 */
public abstract class GenericService<T extends Persistente, E extends Serializable> 
	implements IGenericService<T, E> {
	
	protected IGenericDao<T,E> dao;
	
	public GenericService(IGenericDao<T,E> dao) {
		this.dao = dao;
	}

	@Override
	public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException {
		return this.dao.cadastrar(entity);
	}

	@Override
	public void excluir(E valor) {
		this.dao.excluir(valor);
	}

	@Override
	public void alterar(T entity) throws TipoChaveNaoEncontradaException {
		this.dao.alterar(entity);
	}

	@Override
	public T consultar(E valor) {
		return this.dao.consultar(valor);
	}

	@Override
	public Collection<T> buscarTodos() {
		return this.dao.buscarTodos();
	}

}
