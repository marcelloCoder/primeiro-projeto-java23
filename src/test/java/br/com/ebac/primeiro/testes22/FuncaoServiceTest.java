package br.com.ebac.primeiro.testes22;

import org.junit.Test;

import br.com.ebac.primeiro.testes3.FuncaoDao;
import br.com.ebac.primeiro.testes3.FuncaoDaoMock;
import br.com.ebac.primeiro.testes3.FuncaoService;
import br.com.ebac.primeiro.testes3.IFuncaoDao;
import junit.framework.Assert;

public class FuncaoServiceTest {
	
	@Test
	public void buscarTest() {
		IFuncaoDao mockDao = new FuncaoDaoMock();
		FuncaoService service = new FuncaoService(mockDao);
		String retorno = service.buscar();
		Assert.assertEquals("Sucess", retorno);
	}
	
	@Test
	public void atualizarTest() {
		IFuncaoDao mockDao = new FuncaoDaoMock();
		FuncaoService service = new FuncaoService(mockDao);
		String retorno = service.atualizar();
		Assert.assertEquals("Sucess", retorno);
	}
	
	@Test
	public void excluirTest() {
		IFuncaoDao mockDao = new FuncaoDaoMock();
		FuncaoService service = new FuncaoService(mockDao);
		String retorno = service.excluir();
		Assert.assertEquals("Sucess", retorno);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void errorBuscarTest() {
		IFuncaoDao dao = new FuncaoDao();
		FuncaoService service = new FuncaoService(dao);
		String retorno = service.buscar();
		Assert.assertEquals("Sucess", retorno);
	}

}
