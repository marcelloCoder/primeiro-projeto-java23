package br.com.ebac.primeiro.testes3;

public class FuncaoService {
	
	private IFuncaoDao funcaoDao;
	
	public FuncaoService(IFuncaoDao funcaoDao) {
		this.funcaoDao = funcaoDao;
	}
	
	public String buscar() {
		funcaoDao.buscar();
		return "Sucess";
	}
	
	public String atualizar() {
		funcaoDao.atualizar();
		return "Sucess";
	}
	
	public String excluir() {
		funcaoDao.excluir();
		return "Sucess";
	}


}
