package br.com.ebac.primeiro.abstractfactory.carros;

public class Customer {
	private String gradeRequest;
	private boolean hasCompanyContract;
	
	public Customer(String gradeRequest, boolean hasCompanyContract) {
		this.gradeRequest = gradeRequest;
		this.hasCompanyContract = hasCompanyContract;
	}

	public String getGradeRequest() {
		return gradeRequest;
	}

	public void setGradeRequest(String gradeRequest) {
		this.gradeRequest = gradeRequest;
	}

	public boolean isHasCompanyContract() {
		return hasCompanyContract;
	}

	public void setHasCompanyContract(boolean hasCompanyContract) {
		this.hasCompanyContract = hasCompanyContract;
	}
	
	
}
