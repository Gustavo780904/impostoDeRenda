import java.util.Locale;
import java.util.Scanner;

public class impostoDeRenda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario, servico, capital, medico, educacional, impostoSal, impostoServ, impostoGcap, impostoBruto,
				impostoDevido, deducao;

		// Leitura dos dados
		System.out.print("Renda anual com salário: ");
		salario = sc.nextDouble();
		System.out.print("Renda anual com prestação de serviço: ");
		servico = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		capital = sc.nextDouble();
		System.out.print("Gastos médicos: ");
		medico = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		educacional = sc.nextDouble();
		System.out.println();
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA:");
		// Cálculos

		if (salario >= 36000.00 && salario <= 60000.00) {
			impostoSal = salario * 0.1;
		} 
		else if (salario > 60000.00) {
			impostoSal = salario * 0.2;
		} 
		else {
			impostoSal = 0.0;
		}
		System.out.printf("Imposto sobre salário: %.2f%n", impostoSal);
		impostoServ = servico * 0.15;
		System.out.printf("Imposto sobre serviços: %.2f%n", impostoServ);
		impostoGcap = capital * 0.2;
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoGcap);

		sc.close();

	}
}
