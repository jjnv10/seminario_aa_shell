
public class ShellSort {

    private int swaps;      // Contador de trocas
    private int comparisons; // Contador de comparações

    // Construtor privado para evitar instanciação
    public ShellSort() {
        super();
        this.swaps = 0;
        this.comparisons = 0;

    }

    /**
     * Ordena o array em ordem ascendente usando a ordem natural.
     * @param array Array a ser ordenado
     */
    public <T extends Comparable<T>> void sort(T[] array) {
       
        int n = array.length; 
        
        // Sequência 3x+1: 1, 4, 13, 40, 121, ...
        int h = 1;
        while (h < n / 3) h = 3 * h + 1;

        while (h >= 1) {
            for (int i = h; i < n; i++) { 
                // Insere array[i] na posição correta no subarray
                for (int j = i; j >= h && less(array[j], array[j - h]); j -= h) {
                    exch(array, j, j - h);
                }
            }
            h /= 3; // Reduz o intervalo
        }

    }

    // -------------------------------------
    // Métodos auxiliares (com generics)
    // -------------------------------------
    
    // Verifica se v < w e incrementa comparações
    private <T extends Comparable<T>> boolean less(T v, T w) {
        comparisons++; // Cada chamada de less() é uma comparação
        return v.compareTo(w) < 0;
    }

    // Troca elementos no array e incrementa trocas
    private <T> void exch(T[] array, int i, int j) {
        swaps++; // Cada chamada de exch() é uma troca
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Métodos para acessar os contadores (opcional)
    public int getSwaps() {
        return this.swaps;
    }

    public int getComparisons() {
        return this.comparisons;
    }
}