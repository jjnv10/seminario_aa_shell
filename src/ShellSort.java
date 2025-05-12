import java.util.Arrays;

public class ShellSort {

    // Construtor privado para evitar instanciação
    private ShellSort() {}

    /**
     * Ordena o array em ordem ascendente usando a ordem natural.
     * @param array Array a ser ordenado
     */
    public static <T extends Comparable<T>> void sort(T[] array) {
        int n = array.length;
        
        // Sequência 3x+1: 1, 4, 13, 40, 121, ...
        int h = 1;
        while (h < n / 3) h = 3 * h + 1;

        while (h >= 1) {
            // Realiza a h-ordenacao
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
    
    // Verifica se v < w
    private static <T extends Comparable<T>> boolean less(T v, T w) {
        return v.compareTo(w) < 0;
    }

    // Troca elementos no array
    private static <T> void exch(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
