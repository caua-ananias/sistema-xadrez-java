package boardgame;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if (rows < 1 || columns < 1) {
            throw new BoardException("Erro ao criar o tabuleiro: É necessario que aja ao menos 1 linha e 1 coluna");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Piece piece(int row, int column) {
        if(!positionExists(row, column)){
            throw new BoardException("A posição não está no tabuleiro");
        }
        return pieces[row][column];
    }

    public Piece piece(Position posisiton) {
        if(!positionExists(posisiton)){
            throw new BoardException("A posição não está no tabuleiro");
        }
        return pieces[posisiton.getRow()][posisiton.getColumn()];
    }

    public void placePiece(Piece piece, Position posisiton) {
        if(thereIsAPiece(posisiton)){
            throw new BoardException("Nesta posição já existe uma peça " + posisiton);
        }
        pieces[posisiton.getRow()][posisiton.getColumn()] = piece;
        piece.position = posisiton;
    }

    private boolean positionExists(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public boolean positionExists(Position posisiton) {
        return positionExists(posisiton.getRow(), posisiton.getColumn());
    }

    public boolean thereIsAPiece(Position posisiton) {
        if(!positionExists(posisiton)){
            throw new BoardException("A posição não está no tabuleiro");
        }
        return piece(posisiton) != null;
    }


}
