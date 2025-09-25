import java.util.Scanner;

 class ReajusteSalarial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o salário atual do colaborador
        System.out.print("Informe o salário atual do colaborador: ");
        double salarioAtual = scanner.nextDouble();

        double percentualAumento;
        double inflacao = 0.038; // 3.8%

        // Determina o percentual de aumento com base no salário
        if (salarioAtual <= 280.00) {
            percentualAumento = 0.20;
        } else if (salarioAtual <= 700.00) {
            percentualAumento = 0.15;
        } else if (salarioAtual <= 1500.00) {
            percentualAumento = 0.10;
        } else {
            percentualAumento = 0.05;
        }

        // Calcula o valor do aumento
        double valorAumento = salarioAtual * percentualAumento;

        // Calcula o novo salário
        double novoSalario = salarioAtual + valorAumento;

        // Calcula o aumento real, descontando a inflação
        double aumentoReal = valorAumento - (salarioAtual * inflacao);

        // Exibe os resultados
        System.out.println("\n=== Resumo do Reajuste ===");
        System.out.printf("1. Salário antes do reajuste: R$ %.2f\n", salarioAtual);
        System.out.printf("2. Percentual de aumento aplicado: %.0f%%\n", percentualAumento * 100);
        System.out.printf("3. O valor do aumento: R$ %.2f\n", valorAumento);
        System.out.printf("4. O novo salário, após o aumento: R$ %.2f\n", novoSalario);
        System.out.printf("5. O valor do aumento real, descontado a inflação: R$ %.2f\n", aumentoReal);

        scanner.close();
    }
}