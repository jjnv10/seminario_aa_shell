
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * App
 * @author Joaquim João Nsaku Ventura, Maria Renay e Paulino Domingos
 * @description Classe principal para executar o algoritmo de ordenação ShellSort
 * @date 2023-10-01
 * @version 1.0
 * @description Esta classe contém o método main que executa o algoritmo de ordenação ShellSort
 * e mede o tempo de execução para diferentes tamanhos de entrada.
 * @description O método listar gera uma lista de números inteiros aleatórios para serem ordenados.
 * @version 1.0
 */

public class App {
    // Classe para armazenar a quantidade de elementos e o tempo de execução
    public static Integer[] listar(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n deve ser maior que zero.");
        }
        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            lista.add(i);
        }

        Collections.shuffle(lista); // Embaralha os números

        return lista.toArray(new Integer[0]); // Converte para array
    }

    public static void main(String[] args) throws Exception {

        int[] elementos = { 1000, 4000, 8000, 1000000 };
ShellSort shellSort;
        Gerir[] g = new Gerir[elementos.length];

        for (int i = 0; i < elementos.length; i++) {
            shellSort = new ShellSort();
            // Gerir g = new Gerir(0, 0.0);
            Integer[] lista = listar(elementos[i]);
            // tempo inicial
            long startTime = System.currentTimeMillis();
            // Executa o algoritmo de ordenação
            shellSort.sort(lista);
            // tempo final
            long endTime = System.currentTimeMillis();
            // tempo total
            double tempo = (endTime - startTime) / 1_000_000_000.0;

            g[i] = new Gerir(elementos[i], tempo, shellSort.getComparisons(), shellSort.getSwaps());
       
        }
        // Exibe os resultados
        System.out.println("Quantidade\tTempo (s)\t\tComparações\tTrocas");
        System.out.println("---------------------------*-*-*-*--------------------------");
        for (Gerir ger : g) {
            System.out.printf("%d\t\t%.9f\t\t%d\t\t%d\n", ger.getQuantidade(), ger.getTempo(), ger.getComparacoes(),
                    ger.getTrocas());
        }

    }
}
