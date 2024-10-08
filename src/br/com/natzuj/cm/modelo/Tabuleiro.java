package br.com.natzuj.cm.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.natzuj.cm.excecao.ExplosaoException;

public class Tabuleiro {
    private int linhas, colunas, minas;

    private final List<Campo> campos = new ArrayList<>();

    public Tabuleiro(int linhas, int colunas, int minas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.minas = minas;

        gerarCampos();
        associarVizinhos();
        sortearMinas();
    }

    private void sortearMinas() {
        long minasArmadas = 0;
        do {
            int aleatorio = (int) (Math.random() * campos.size());
            campos.get(aleatorio).minar();
            minasArmadas = campos.stream().filter(c -> c.isMinado()).count();
        } while (minasArmadas < minas);
    }

    public boolean objetivoAlcancado() {
        return campos.stream().allMatch(c -> c.objetivoAlcancado());
    }

    public void reiniciar() {
        campos.stream().forEach(c -> c.reiniciar());
        sortearMinas();
    }

    private void associarVizinhos() {
        for (Campo c1 : campos) {
            for (Campo c2 : campos) {
                c1.adicionarVizinho(c2);
            }
        }
    }

    public void abrir(int linha, int coluna) {
        try {
            campos.stream().filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
                    .findFirst().ifPresent(c -> c.abrir());
        } catch (ExplosaoException e) {
            campos.forEach(c -> c.setAberto(true));
            throw e;
        }
    }

    public void alternarMarcacao(int linha, int coluna) {
        campos.stream().filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
                .findFirst().ifPresent(c -> c.alternarMarcacao());

    }
    
    public void alternarMarcacaoHack() {
        campos.stream().filter(c -> c.isMinado() && c.isFechado()).forEach(c -> c.alternarMarcacao());
    }

    private void gerarCampos() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                campos.add(new Campo(i, j));
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("  ");
        for (int c = 0; c < colunas; c++) {
            sb.append(" ");
            sb.append("\u001B[4m" + c + "\u001B[0m");
            sb.append(" ");
        }
        sb.append("\n");
        sb.append("\n");

        int i = 0;
        for (int l = 0; l < linhas; l++) {
            sb.append(l);
            sb.append("|");
            for (int c = 0; c < colunas; c++) {
                sb.append(" ");
                sb.append(campos.get(i));
                sb.append(" ");
                i++;
            }
            sb.append("\n");
        }
        return sb.toString();
    }


}
