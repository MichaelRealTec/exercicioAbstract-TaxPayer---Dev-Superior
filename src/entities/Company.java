package entities;

public class Company extends TaxPayer {
	// Atributo

	private int numberOfEmployees;

	// Método Getter e Setter

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	// Método Construtor

	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	// Método
	@Override
	public Double tax() {
		Double taxSalary = 0.0;
		if (getNumberOfEmployees() <= 10) {
			taxSalary = getAnualIncome() * 0.16;
		} else {
			taxSalary = getAnualIncome() * 0.14;
		}

		return taxSalary;
	}
}
