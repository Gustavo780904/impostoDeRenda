import java.util.Locale;
import java.util.Scanner;

public class impostoDeRenda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario, servico, capital, medico, educacional, impostoSal, impostoServ, impostoGcap, impostoBruto,
				impostoDevido, gastos, maxDedutivel, deducao;

		// Leitura dos dados
		System.out.print("Renda anual com sal�rio: ");
		salario = sc.nextDouble();
		System.out.print("Renda anual com presta��o de servi�o: ");
		servico = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		capital = sc.nextDouble();
		System.out.print("Gastos m�dicos: ");
		medico = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		educacional = sc.nextDouble();
		System.out.println();
		System.out.println("RELAT�RIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA:");
		// C�lculos

		if (salario >= 36000.00 && salario <= 60000.00) {
			impostoSal = salario * 0.1;
		} 
		else if (salario > 60000.00) {
			impostoSal = salario * 0.2;
		} 
		else {
			impostoSal = 0.0;
		}
		System.out.printf("Imposto sobre sal�rio: %.2f%n", impostoSal);
		impostoServ = servico * 0.15;
		System.out.printf("Imposto sobre servi�os: %.2f%n", impostoServ);
		impostoGcap = capital * 0.2;
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoGcap);
		System.out.println();
		
		impostoBruto = impostoSal + impostoServ + impostoGcap;
		gastos = medico + educacional;
		maxDedutivel = impostoBruto * 0.3;
		if (maxDedutivel >= gastos) {
			deducao = gastos;
		}
		else {
			deducao = maxDedutivel;
		}
		impostoDevido = impostoBruto - deducao;
		
		System.out.println("DEDU��ES:");
		System.out.printf("M�ximo dedut�vel: %.2f%n", maxDedutivel);
		System.out.printf("Gastos dedut�veis: %.2f%n", gastos);
		System.out.println();
		System.out.println("RESUMO:");
		System.out.printf("Imposto bruto total: %.2f%n", impostoBruto);
		System.out.printf("Abatimento: %.2f%n", deducao);
		System.out.printf("Imposto devido: %.2f%n", impostoDevido);
		
		sc.close();

	}
}
