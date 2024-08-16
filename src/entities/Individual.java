package entities;

public class Individual extends TaxPayer {
	// Atributo

	private Double healthExpenditures;

	// Método Getter e Setter

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	// Método construtor
	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	// Método
	@Override
	public Double tax() {
		Double taxSalary = 0.0;
		if (getAnualIncome() < 20000) {
			taxSalary = getAnualIncome() * 0.15;
		} else if (getAnualIncome() >= 20000) {
			taxSalary = getAnualIncome() * 0.25;
		}

		if (getHealthExpenditures() > 0) {
			taxSalary -= getHealthExpenditures() * 0.50;
		}

		return taxSalary;
	}
}
