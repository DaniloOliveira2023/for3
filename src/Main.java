import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int eleitor;
        int idade;
        int eleitores = 0;
        Scanner s = new Scanner(System.in);
        for (eleitor = 0; eleitor <= 3; eleitor++) {
            System.out.println("Digite o número do eleitor");
            eleitor = s.nextInt();
            System.out.println("Digite a idade do eleitor");
            idade = s.nextInt();
            if (idade >= 18 && idade <= 90) {
                System.out.println("Essa pessoa tem " + idade + " anos e pode votar");
                eleitores = eleitor;
            } else {
                System.out.println("Essa pessoa tem " + idade + " anos e não pode votar");
            }
        }
        System.out.println("O número de eleitores é " +eleitores);
    }
}