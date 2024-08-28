import br.com.natzuj.cm.modelo.Tabuleiro;
import br.com.natzuj.cm.visao.TabuleiroConsole;

public class App {
    public static void main(String[] args) throws Exception {

        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 7);
        new TabuleiroConsole(tabuleiro);
        
    }
}
