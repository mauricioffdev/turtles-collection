import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TurtlesCollection {

    public static void main(String[] args) {
        // 1. Criar nosso "banco de dados" (o Map) - FORA DO LOOP
        Map<String, Tartaruga> tartarugas = new HashMap<>();
        tartarugas.put("leonardo", new Tartaruga("Leonardo", "Azul", "Duas Katanas"));
        tartarugas.put("michelangelo", new Tartaruga("Michelangelo", "Laranja", "Dois Nunchakus"));
        tartarugas.put("donatello", new Tartaruga("Donatello", "Roxo", "Bastão Bō"));
        tartarugas.put("raphael", new Tartaruga("Raphael", "Vermelho", "Dois Sais"));

        // 2. Preparar para receber a entrada do usuário - FORA DO LOOP
        Scanner scanner = new Scanner(System.in);

        // 3. Iniciar o loop principal do programa
        while (true) {
            System.out.println("\n## BEM-VINDO AO TURTLES COLLECTION ##");
            System.out.println("Digite o nome de uma das Tartarugas Ninja:");
            System.out.println("(Leonardo, Michelangelo, Donatello ou Raphael)");
            System.out.println("--- Ou digite 'sair' para fechar ---"); // Nova instrução

            // 4. Ler a entrada e converter para minúsculas
            String nomeDigitado = scanner.nextLine().toLowerCase();

            // 5. CHECAR A CONDIÇÃO DE SAÍDA PRIMEIRO
            if (nomeDigitado.equals("sair")) {
                System.out.println("Obrigado por usar o Turtles Collection. Cowabunga!");
                break; // Encerra o loop 'while (true)'
            }

            // 6. Se não for 'sair', buscar no Map (lógica)
            if (tartarugas.containsKey(nomeDigitado)) {
                // Se encontrar, pegar o objeto e exibir as infos
                Tartaruga t = tartarugas.get(nomeDigitado);
                t.exibirInfo();
            } else {
                // Se não encontrar (e não for 'sair')
                System.out.println("Personagem não encontrado! Tente novamente.");
            }

            // O loop volta automaticamente para o topo
        }

        // 7. Fechar o scanner (APENAS DEPOIS que o loop terminar)
        scanner.close();
    }
}