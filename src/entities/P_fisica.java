package entities;

public class P_fisica extends Contribuinte_tax {

	public Double despesaSaude;
	
	public P_fisica() {
		
	}

	public P_fisica(String name, Double rendimentoAnual, Double despesaSaude) {
		super(name, rendimentoAnual);
		this.despesaSaude = despesaSaude;
	}

	public Double getDespesaSaude() {
		return despesaSaude;
	}

	public void setDespesaSaude(Double despesaSaude) {
		this.despesaSaude = despesaSaude;
	}

	@Override
	public double tax() {
		
		//If de condição ternaria..
		double taxFisica = (getRendimentoAnual() < 20000.0) ? getRendimentoAnual() * 0.15 : getRendimentoAnual() * 0.25;
		
		taxFisica -= getDespesaSaude() * 0.50;
		if(taxFisica < 0) {
			taxFisica = 0;
		}
		
		return taxFisica;
	}

}
