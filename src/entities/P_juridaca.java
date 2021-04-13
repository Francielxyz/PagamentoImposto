package entities;

public class P_juridaca extends Contribuinte_tax {

	public int numEmpregados;

	public P_juridaca() {
		
	}
	
	public P_juridaca(String name, Double rendimentoAnual, int numEmpregados) {
		super(name, rendimentoAnual);
		this.numEmpregados = numEmpregados;
	}

	public int getNumEmpregados() {
		return numEmpregados;
	}

	public void setNumEmpregados(int numEmpregados) {
		this.numEmpregados = numEmpregados;
	}

	@Override
	public double tax() {
		
		double taxJuridica = (getNumEmpregados() > 10) ? getRendimentoAnual() * 0.14 : getRendimentoAnual() * 0.16;
		
		return taxJuridica;
	}

}
