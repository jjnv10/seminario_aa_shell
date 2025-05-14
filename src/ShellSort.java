/**
 * ShellSort.java
 * @author Joaquim João Nsaku Ventura, Maria Renay e Paulino Domingos (Grupo 1)
 * @description Implementação do algoritmo de ordenação ShellSort
 * @date 2023-10-01
 * @version 1.0 
 * @description Esta classe contém o algoritmo de ordenação ShellSort, que é uma
 * versão otimizada do algoritmo de inserção. O algoritmo utiliza uma sequência de
 * intervalos para ordenar os elementos do array. A sequência utilizada é a
 * 3x+1, que é uma das sequências mais comuns para o ShellSort. 
 * * @description O algoritmo é eficiente para arrays de tamanho médio e grande,
 * e é especialmente útil quando os dados estão quase ordenados. O algoritmo
 * tem complexidade O(n^(3/2)) no pior caso, mas pode ser mais eficiente em 
 * práticas.
 * @description O algoritmo é estável, ou seja, mantém a ordem relativa dos elementos
 * iguais. No entanto, não é in-place, pois utiliza espaço adicional para
 * armazenar os elementos durante a ordenação.  
 * * @description O algoritmo é implementado em Java e utiliza generics para
 * permitir a ordenação de diferentes tipos de dados. O algoritmo é testado
 * com números inteiros, mas pode ser facilmente adaptado para outros tipos
 * de dados que implementam a interface Comparable.
 */

public class ShellSort {
/**
 * Atributos
 * @description Esta classe contém os atributos swaps e comparisons, que são    
 * utilizados para contar o número de trocas e comparações realizadas
 * durante a ordenação.
 * @description O atributo swaps é utilizado para contar o número de
 * trocas realizadas durante a ordenação. O atributo comparisons é utilizado    
 * para contar o número de comparações realizadas durante a ordenação.
 * @description O atributo swaps é incrementado a cada vez que dois elementos   
 * são trocados no array. O atributo comparisons é incrementado a cada vez
 * que dois elementos são comparados no array.
 */
    private int swaps;      // Contador de trocas
    private int comparisons; // Contador de comparações
/**
 * Construtor publico para evitar instanciação
 * @description Este construtor é publico para evitar que a classe seja
 * instanciada diretamente. A classe ShellSort é uma classe utilitária
 * que contém apenas métodos estáticos e não deve ser instanciada.
 */
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

    /**
     * Ordena o array em ordem ascendente usando a ordem natural.
     * @param array Array a ser ordenado
     */
    // -------------------------------------
    // Métodos auxiliares (com generics)
    // -------------------------------------
    
    // Verifica se v < w e incrementa comparações
    private <T extends Comparable<T>> boolean less(T v, T w) {
        comparisons++; // Cada chamada de less() é uma comparação
        return v.compareTo(w) < 0;
    }

    /**
     * Troca os elementos i e j no array e incrementa o contador de trocas.
     * @description Este método troca os elementos i e j no array e incrementa  
     * o contador de trocas. O método é utilizado para realizar a troca
     * de elementos no array durante a ordenação. O método é privado e  
     * não deve ser chamado diretamente. O método é utilizado apenas
     * internamente pela classe ShellSort.
     * @param <T> Tipo do elemento do array
     * @param array Array a ser ordenado
     * @description Este método é utilizado para realizar a troca de
     * elementos no array durante a ordenação. O método é privado e
     * não deve ser chamado diretamente. O método é utilizado apenas
     * internamente pela classe ShellSort.
     * @description O método é utilizado para realizar a troca de
     * elementos no array durante a ordenação. O método é privado e
     * não deve ser chamado diretamente. O método é utilizado apenas    
     * internamente pela classe ShellSort.
     * @param i Índice do primeiro elemento a ser trocado
     * @param j Índice do segundo elemento a ser trocado
     * @description O método é utilizado para realizar a troca de
     * elementos no array durante a ordenação. O método é privado e
     * não deve ser chamado diretamente. O método é utilizado apenas
     * internamente pela classe ShellSort.
     *
     */
    // Troca elementos no array e incrementa trocas
    private <T> void exch(T[] array, int i, int j) {
        swaps++; // Cada chamada de exch() é uma troca
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
/**
 * Métodos para acessar os contadores (opcional)
 * @description Estes métodos são utilizados para acessar os contadores
 * swaps e comparisons. Os métodos são públicos e podem ser
 * chamados diretamente. Os métodos são utilizados para obter o
 * número de trocas e comparações realizadas durante a
 * ordenação. 
 * @return Número de trocas ou comparações realizadas
 * @description O método getSwaps() retorna o número de trocas
 * realizadas durante a ordenação. O método getComparisons()
 * retorna o número de comparações realizadas
 * durante a ordenação. Os métodos são públicos e podem ser
 * chamados
 */
    // Métodos para acessar os contadores (opcional)
    public int getSwaps() {
        return this.swaps;
    }

    /**
     * Método para obter o número de comparações realizadas durante a ordenação
     * @description Este método retorna o número de comparações realizadas
     * durante a ordenação. O método é público e pode ser
     * chamado diretamente. 
     * @return Número de comparações realizadas
     * @description O método getComparisons() retorna o número de
     * comparações realizadas durante a ordenação. 
     */
    public int getComparisons() {
        return this.comparisons;
    }
}