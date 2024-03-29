
package com.ebac.reflections.anotacao.cadastro.service.generic;

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
public interface IGenericService <T extends Persistente, E extends Serializable> {
	
	/**
     * Método para cadastrar novos registro no banco de dados
     *
     * @param entity a ser cadastrado
     * @return retorna verdadeiro para cadastrado e falso para não cadastrado
     * @throws com.ebac.reflections.anotacao.cadastro.exception.TipoChaveNaoEncontradaException
     */
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

    /**
     * Método para excluir um registro do banco de dados
     *
     * @param valor chave única do dado a ser excluído
     */
    public void excluir(E valor);

    /**
     *Método para alterar um registro no bando de dados.
     *
     * @param entity a ser atualizado
     * @throws com.ebac.reflections.anotacao.cadastro.exception.TipoChaveNaoEncontradaException
     */
    public void alterar(T entity) throws TipoChaveNaoEncontradaException;

    /**
     * Método para consultar um registro no banco de dados
     *
     * @param valor chave única do dado a ser consultado
     * @return
     */
    public T consultar(E valor);

    /**
     * Método que irá retornar todos os registros do banco de dados de uma determinado dado ou tabela
     *
     * @return Registros encontrados
     */
    public Collection<T> buscarTodos();

}