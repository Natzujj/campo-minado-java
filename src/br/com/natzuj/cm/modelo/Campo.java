package br.com.natzuj.cm.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {

    private final int linha;
    private final int coluna;

    private boolean minado, aberto, marcado = false;
    private List<Campo> vizinhos = new ArrayList<>();

    Campo(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }
    
    // boolean adicionarVizinho(Campo vizinho) {
        
    // }
}
