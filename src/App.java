import br.com.natzuj.cm.modelo.Tabuleiro;

public class App {
    public static void main(String[] args) throws Exception {
        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 7);

        tabuleiro.abrir(3, 3);
        tabuleiro.alternarMarcacao(4, 4);
        tabuleiro.alternarMarcacao(4, 5);

        System.out.println(tabuleiro);
    }
}
