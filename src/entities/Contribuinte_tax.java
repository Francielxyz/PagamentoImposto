package entities;

public abstract class Contribuinte_tax {

	private String name;
	private Double rendimentoAnual; // anualIncome

	public Contribuinte_tax() {

	} 

	public Contribuinte_tax(String name, Double rendimentoAnual) {
		super();
		this.name = name;
		this.rendimentoAnual = rendimentoAnual;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRendimentoAnual() {
		return rendimentoAnual;
	}

	public void setRendimentoAnul(Double rendimentoAnual) {
		this.rendimentoAnual = rendimentoAnual;
	}

	public abstract double tax();

}
