
/**
 * Gerir.java
 * @author Joaquim João Nsaku Ventura, Maria Renay e Paulino Domingos
 * @description Classe para armazenar informações sobre a execução do algoritmo de ordenação
 * @date 2023-10-01
 * @version 1.0
 * @description Esta classe contém os atributos quantidade, tempo, comparações e trocas,
 * 
 * 
 */
public class Gerir {
   // Atributos
    
    private int quantidade;
    private Double tempo;
    private int comparacoes;
    private int trocas;
    /**
     * Construtor da classe Gerir
     * @param quantidade de elementos do array
     * @param tempo de execução do algoritmo
     * @param comparacoes realizadas durante a ordenação
     * @param trocas realizadas durante a ordenação
     * @description Este construtor inicializa os atributos quantidade, tempo, comparacoes e trocas
     * com os valores passados como parâmetros.
     * @description O atributo quantidade representa o número de elementos do array a ser ordenado.
     * @description O atributo tempo representa o tempo de execução do algoritmo de ordenação.
     * @description O atributo comparacoes representa o número de comparações realizadas durante a ordenação.
     * @description O atributo trocas representa o número de trocas realizadas durante a ordenação.
     * @description O construtor é utilizado para criar um objeto da classe Gerir com os valores
     * especificados.
     * @description O construtor é utilizado para criar um objeto da classe Gerir com os valores
     */
    
    public Gerir(int quantidade, Double tempo, int comparacoes, int trocas) {
        this.quantidade = quantidade;   
        this.tempo = tempo;
        this.comparacoes = comparacoes;
        this.trocas = trocas;
    }
/**
 * Método para obter a quantidade de elementos do array
 * @return quantidade de elementos do array
 */
    public int getQuantidade() {
        return quantidade;
    }
/**
 * Método para obter o tempo de execução do algoritmo
 * @return tempo de execução do algoritmo
 */
   /**
    * Método para obter o tempo de execução do algoritmo
    * @return tempo de execução do algoritmo
    * @description Este método retorna o tempo de execução do algoritmo de ordenação.
    * @description O tempo é retornado em segundos.
 */
   public Double getTempo() {
       return tempo;
   }

   /**
    * Método para obter o número de comparações realizadas durante a ordenação
    * @return número de comparações realizadas  
    * @description Este método retorna o número de comparações realizadas durante a ordenação.
    
    */
   public int getComparacoes() {
       return comparacoes;
   }
   /**
    * Método para obter o número de trocas realizadas durante a ordenação
    * @return número de trocas realizadas
    * @description Este método retorna o número de trocas realizadas durante a ordenação.
    */
   public int getTrocas() {
       return trocas;
   }
}

