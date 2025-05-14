
public class Gerir {
   
    private int quantidade;
    private Double tempo;
    private int comparacoes;
    private int trocas;
    
    public Gerir(int quantidade, Double tempo, int comparacoes, int trocas) {
        this.quantidade = quantidade;   
        this.tempo = tempo;
        this.comparacoes = comparacoes;
        this.trocas = trocas;
    }

    public int getQuantidade() {
        return quantidade;
    }

   public Double getTempo() {
       return tempo;
   }
   public int getComparacoes() {
       return comparacoes;
   }
   public int getTrocas() {
       return trocas;
   }
}

