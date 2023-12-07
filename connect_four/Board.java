package connect_four;
import connect_four.Vector2;

public class Board{
    // 0 = empty, 1 = player 1, 2 = player 2
    private int[][] board;
    // the size of the board in x and y
    Vector2 size;
    public Board(Vector2 _size){
        // save the size
        this.size = _size;
        // create the board
        board = new int[this.size.x][this.size.y];
    }

    public boolean add_chip(int column, int player){
        // check if the column is full
        if(board[column][0] != 0){
            // if it is, return
            return false;
        }
        // loop through the column but backwards like this the chip will be placed at the most bottom slot
        for(int i = this.size.y - 1; i >= 0; i--){
            // check if the current slot is empty
            if(board[column][i] == 0){
                // if it is, add the chip
                board[column][i] = player;
                // return
                return true;
            }
        }
        return false;
    }

    public void print_board(){
        // loop through the board
        for(int y = -1; y < this.size.y; y++){
            for(int x = 0; x < this.size.x; x++){
                // print the column number if y is -1
                if (y == -1){
                    // print the column number
                    System.out.print(x);
                    // skip the rest of the loop
                    continue;
                }
                // print the current slot
                System.out.print(board[x][y]);
            }
            // print a new line
            System.out.println();
        }
    }
}