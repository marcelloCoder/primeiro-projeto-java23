package br.com.ebac.primeiro.testes22;

import org.junit.Test;

import br.com.ebac.primeiro.testes2.ClienteDaoMock;
import br.com.ebac.primeiro.testes2.ClienteService;
import junit.framework.Assert;

public class ClienteServiceTest {
	
	@Test
	public void salvarTest() {
	
		ClienteDaoMock mockDao = new ClienteDaoMock();
		
		ClienteService service = new ClienteService(mockDao);
		
		String retorno = service.salvar();
		
		Assert.assertEquals("Sucesso", retorno);
	}

}
