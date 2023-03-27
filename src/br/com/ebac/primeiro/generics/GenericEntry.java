package br.com.ebac.primeiro.generics;

public class GenericEntry<D, C> {
	
	private D data;
	
	private C codigo;

	public D getData() {
		return this.data;
	}


	public C getCodigo() {
		return this.codigo;
	}
	
	


	public GenericEntry() {
		super();
	}


	public GenericEntry(D data, C codigo) {
		super();
		this.data = data;
		this.codigo = codigo;
	}


	@Override
	public String toString() {
		return "GenericEntry [data=" + data + ", codigo=" + codigo + "]";
	}
	
	
	
	



}
