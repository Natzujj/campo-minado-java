# Campo Minado em Java

Este é um jogo de Campo Minado desenvolvido em Java durante o acompanhamento das aulas na plataforma Udemy. O projeto utiliza conceitos de Programação Orientada a Objetos (POO) para modelar o comportamento do jogo, incluindo classes para representar o tabuleiro, campos, exceções personalizadas, e uma classe de visão para interação via console.

## Funcionalidades

- Geração aleatória de minas no tabuleiro.
- Abertura de campos com lógica de vizinhança segura.
- Marcação e desmarcação de campos suspeitos.
- Exceções personalizadas para tratamento de explosões.
- Interface de console interativa para jogar o jogo.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes principais:

- **Campo**: Representa um campo individual no tabuleiro. Pode estar minado, aberto, ou marcado.
- **Tabuleiro**: Gerencia a coleção de campos e a lógica do jogo.
- **TabuleiroConsole**: Classe de visão responsável pela interação com o usuário no console.
- **ExplosaoException** e **SairException**: Exceções personalizadas para controle do fluxo do jogo.

## Como Jogar

1. Clone este repositório para o seu ambiente local:

   ```bash
   git clone https://github.com/Natzujj/campo-minado-java.git
   ```

2. Navegue até o diretodio do projeto:
    ```bash
        cd campo-minado
    ```

3. Compile o projeto utilizando compilador Java:
    ```bash
        java *.java
    ```
5. Siga as instruções no console para jogar o jogo:

    - Digite as coordenadas (linha, coluna) para abrir um campo.

    - Escolha 1 para abrir o campo ou 2 para marcar/desmarcar um campo.

    - Continue até alcançar o objetivo (abrir todos os campos não minados) ou até explodir uma mina.

## Recursos Utilizados

* Java: Linguagem de programação principal usada para desenvolver o jogo.
* POO (Programação Orientada a Objetos): Para modelar o jogo de maneira organizada e modular.
* Tratamento de Exceções: Para gerenciar condições de erro, como a abertura de uma mina.

## Exemplo de Uso
Ao iniciar o jogo, você verá o tabuleiro no console. Os campos não abertos serão representados por -, campos marcados por x, minas por * após uma explosão, e números que indicam o número de minas adjacentes.

```bash
       0  1  2  3  4  5
    0| -  -  -  -  -  -
    1| -  -  -  -  -  -
    2| -  -  -  -  -  -
    3| -  -  -  -  -  -
    4| -  -  -  -  -  -
    5| -  -  -  -  -  -

    Digite (x, y): 1, 2
    1 - Abrir ou 2 - (Des)Marcar: 1
```

## Licença
Este projeto está licenciado sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.