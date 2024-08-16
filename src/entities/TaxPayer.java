package entities;

public abstract class TaxPayer {
	// Atributo
	private String name;
	private Double anualIncome;

	// Método Getter e Setter

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	// Método Construtor

	public TaxPayer() {

	}

	public TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	// Método
	public abstract Double tax();
}
