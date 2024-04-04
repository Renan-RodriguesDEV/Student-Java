package DsSoftI.condicionais;

import java.util.Scanner;

public class CalculandoSalario {
    public static void main(String[] args) {
        // A empresa possui dois tipos de colaboradores: Junior e Sênior.
        // O colaborador Junior se enquadra na faixa etária de 18 a 36 anos.
        // O colaborador Sênior se enquadra na faixa etária de 37 a 70 anos.
        // Os colaboradores Junior possuem um desconto de 11% de INSS e um adicional de
        // 5% sobre o salário bruto.
        // Já os colaboradores Sênior possuem um desconto de 11% de INSS e 7% de
        // adicional sobre o salário bruto.

        // estanciando a classe Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua idade: ");
        int idade = sc.nextInt();
        System.out.println("insira seu salario");
        float salario = sc.nextFloat();
        sc.close();// fechando pq o vs code me recomendou para n haver problemas

        // 11% -> 0.11
        final float INSS = 0.11f;// FINAL pq será uma constante
        float adicional = 0;

        if (idade >= 18 && idade <= 36) {
            // 5% -> 0.5
            adicional = salario * 0.5f;
        } else if (idade >= 37 && idade <= 70) {
            // 7% -> 0.7
            adicional = salario * 0.7f;
        } else {
            System.out.println("Salario ou idade invalidos!!!");
        }

        float salarioLiquido = salario - INSS + adicional;

        System.out.println("O Desconto do INSS: R$ " + INSS);
        System.out.println("Seu Salário de Desenvolvedor: R$ " + salario);
        System.out.println("Valor do Adicional: R$ " + adicional);
        System.out.println("Seu Salário Líquido: R$ " + String.format("%.2f", salarioLiquido));// %.2f -> deixa o numero
                                                                                               // com duas casas
                                                                                               // decimais
                                                                                               //
    }
}
