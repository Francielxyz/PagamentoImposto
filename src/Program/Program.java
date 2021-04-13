package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte_tax;
import entities.P_fisica;
import entities.P_juridaca;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Qual o total de contribuintes? ");
		int n = sc.nextInt();

		List<Contribuinte_tax> list = new ArrayList<>();

		for (int x = 1; x <= n; x++) {
			System.out.println("Entre com os dados do contribuite " + x);
			System.out.print("Pesso Física ou Pessoa Jurídica (f/j) ");
			char tipo = sc.next().charAt(0);

			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Renda Anual: ");
			double rendimentoAnual = sc.nextDouble();

			if (tipo == 'f') {
				System.out.print("Valor do Gasto com Saúde: ");
				double saude = sc.nextDouble();
				P_fisica pf = new P_fisica(nome, rendimentoAnual, saude);
				list.add(pf);

			} else {
				System.out.print("Número de Funcionário: ");
				int numEmpregados = sc.nextInt();
				P_juridaca pj = new P_juridaca(nome, rendimentoAnual, numEmpregados);
				list.add(pj);
			}

		}

		System.out.println();
		System.out.println("Contribuintes");
		for (Contribuinte_tax tp : list) {
			System.out.println(tp.getName() + ": R$ " + String.format("%.2f", tp.tax()));
		}
		
		System.out.println();
		double sum = 0.0;
		for (Contribuinte_tax tp : list) {
			sum += tp.tax();
		}
		System.out.println("TOTAL DE IMPOSTO: R$ " + String.format("%.2f", sum));

		sc.close();
	}

}
