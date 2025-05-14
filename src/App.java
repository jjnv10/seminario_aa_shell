
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

        int[] elementos = { 1000, 4000, 8000, 1000000, 99999999, 999999999, 1000000000 };

        Gerir[] g = new Gerir[elementos.length];

        for (int i = 0; i < elementos.length; i++) {
            // Gerir g = new Gerir(0, 0.0);
            Integer[] lista = listar(elementos[i]);
            // tempo inicial
            long startTime = System.currentTimeMillis();
            // Executa o algoritmo de ordenação
            ShellSort.sort(lista);
            // tempo final
            long endTime = System.currentTimeMillis();
            // tempo total
            double tempo = (endTime - startTime) / 1_000_000_000.0;
            
            g[i] = new Gerir(elementos[i], tempo);
        }
        // Exibe os resultados
        System.out.println("Quantidade\tTempo (s)");
        for (Gerir ger : g) {
            System.out.printf("%d\t\t%.9f\n", ger.getQuantidade(), ger.getTempo());
        }

    }
}
