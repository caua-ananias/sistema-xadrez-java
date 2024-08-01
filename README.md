# Sistema de Xadrez em Java ☕♟️
Este é um jogo de xadrez desenvolvido em Java que pode ser jogado no terminal. O jogo suporta as regras básicas do xadrez, incluindo movimentos especiais como roque, promoção e en passant.

## Funcionalidades

- Movimentos Básicos: Peças se movem de acordo com as regras tradicionais do xadrez. <br>
- Roque: Movimento especial de roque para o lado do rei e da rainha. <br>
- Promoção: Peões podem ser promovidos a qualquer outra peça quando atingem a última linha do tabuleiro. <br>
- En Passant: Regras de captura especial para peões. <br>
- Xeque e Xeque-Mate: Detecção de xeque e xeque-mate. <br>

### Requisitos

- Java 17 ou superior (Pode ser que a partir da 8 já funcione)

## Instalação

### 1. Clone este repositório:
```
git clone https://github.com/caua-ananias/sistema-xadrez-java.git
```
### 2. Navegue até o diretório do projeto:
```
cd seu-repositorio
```
### 3. Compile o projeto:
```
javac application/Program.java
```

### 4. Execute o programa:
```
java application.Program
```

## Uso
O jogo será executado no terminal e solicitará que você insira movimentos na forma de coordenadas, como e2 e e4. O jogo exibe o tabuleiro e informações sobre o estado atual após cada movimento.

## Exemplos de Comandos

### Movimentar uma peça:
- Digite Origem: e2 e depois Alvo: e4 para mover um peão de e2 para e4. <br>

### Promoção:
- Quando um peão alcança a última linha, você pode promovê-lo a uma peça como a Rainha (Q), Torre (R), Bispo (B) ou Cavalo (N). <br>
