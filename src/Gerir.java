
public class Gerir {
   
    private int quantidade;
    private Double tempo;
    
    public Gerir(int quantidade, Double tempo) {
        this.quantidade = quantidade;   
        this.tempo = tempo;
        // Construtor vazio
    }

    public int getQuantidade() {
        return quantidade;
    }

   public Double getTempo() {
       return tempo;
   }
}
