package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		//

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		List<TaxPayer> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			while (type != 'i' && type != 'c') {
				System.out.println("Erro, digite novamente um valor válido!");
				System.out.print("Individual or company (i/c)? ");
				type = sc.next().charAt(0);
			}
			if (type == 'i') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();

				System.out.print("Anual income: ");
				Double anualIncome = sc.nextDouble();
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				TaxPayer individual = new Individual(name, anualIncome, healthExpenditures);
				list.add(individual);

			} else if (type == 'c') {
				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.nextLine();
				// sc.nextLine();
				System.out.print("Anual income: ");
				Double anualIncome = sc.nextDouble();
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				TaxPayer company = new Company(name, anualIncome, numberOfEmployees);
				list.add(company);

			}

		}
		Double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (TaxPayer taxPayer : list) {
			System.out.println(String.format("%s: $ %.2f", taxPayer.getName(), taxPayer.tax()));
			sum += taxPayer.tax();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", sum);

		sc.close();
	}

}
