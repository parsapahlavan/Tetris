package com.pflance.mytetris;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

public class Board extends RelativeLayout {

    static final int BOARD_WIDTH = 10;
    static final int BOARD_HEIGHT = 20;
    static final int BOARD_X_RIGHT_BOUNDS = 10;

    private boolean[][] grid;   // If Filled or Empty
    private View[][] blocks;    // Holds the views of the grid

    // Default Constructors
    public Board(Context context){
        super(context);

        // Sets layout to the board
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.the_board_layout, this);

        // Sets all boolean values and views
        initBoard();

    }
    public Board(Context context, AttributeSet attrs){
        super(context, attrs);

        // Sets layout to the board
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.the_board_layout, this);

        // Sets all boolean values and views
        initBoard();

    }
    public Board(Context context, AttributeSet attrs, int defStyle){
        super(context, attrs, defStyle);

        // Sets layout to the board
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.the_board_layout, this);

        // Sets all boolean values and views
        initBoard();

    }

    /**
     * A method that sets the board's grid to empty AND
     * sets the board's view array to each individual view
     */
    private void initBoard() {

        // Init board grid to false
        grid = new boolean[BOARD_WIDTH][BOARD_HEIGHT];
        for (int i = 0; i < BOARD_WIDTH; ++i) {
            for (int j = 0; j < BOARD_HEIGHT; ++j) {
                grid[i][j] = false;
            }
        }

        // Set all views to blocks View 2d array
        blocks = new View[BOARD_WIDTH][BOARD_HEIGHT];

        // FIRST ROW
        blocks[0][0] = findViewById(R.id.board_0_0);
        blocks[0][1] = findViewById(R.id.board_0_1);
        blocks[0][2] = findViewById(R.id.board_0_2);
        blocks[0][3] = findViewById(R.id.board_0_3);
        blocks[0][4] = findViewById(R.id.board_0_4);
        blocks[0][5] = findViewById(R.id.board_0_5);
        blocks[0][6] = findViewById(R.id.board_0_6);
        blocks[0][7] = findViewById(R.id.board_0_7);
        blocks[0][8] = findViewById(R.id.board_0_8);
        blocks[0][9] = findViewById(R.id.board_0_9);
        blocks[0][10] = findViewById(R.id.board_0_10);
        blocks[0][11] = findViewById(R.id.board_0_11);
        blocks[0][12] = findViewById(R.id.board_0_12);
        blocks[0][13] = findViewById(R.id.board_0_13);
        blocks[0][14] = findViewById(R.id.board_0_14);
        blocks[0][15] = findViewById(R.id.board_0_15);
        blocks[0][16] = findViewById(R.id.board_0_16);
        blocks[0][17] = findViewById(R.id.board_0_17);
        blocks[0][18] = findViewById(R.id.board_0_18);
        blocks[0][19] = findViewById(R.id.board_0_19);

        // SECOND ROW
        blocks[1][0] = findViewById(R.id.board_1_0);
        blocks[1][1] = findViewById(R.id.board_1_1);
        blocks[1][2] = findViewById(R.id.board_1_2);
        blocks[1][3] = findViewById(R.id.board_1_3);
        blocks[1][4] = findViewById(R.id.board_1_4);
        blocks[1][5] = findViewById(R.id.board_1_5);
        blocks[1][6] = findViewById(R.id.board_1_6);
        blocks[1][7] = findViewById(R.id.board_1_7);
        blocks[1][8] = findViewById(R.id.board_1_8);
        blocks[1][9] = findViewById(R.id.board_1_9);
        blocks[1][10] = findViewById(R.id.board_1_10);
        blocks[1][11] = findViewById(R.id.board_1_11);
        blocks[1][12] = findViewById(R.id.board_1_12);
        blocks[1][13] = findViewById(R.id.board_1_13);
        blocks[1][14] = findViewById(R.id.board_1_14);
        blocks[1][15] = findViewById(R.id.board_1_15);
        blocks[1][16] = findViewById(R.id.board_1_16);
        blocks[1][17] = findViewById(R.id.board_1_17);
        blocks[1][18] = findViewById(R.id.board_1_18);
        blocks[1][19] = findViewById(R.id.board_1_19);

        // THIRD ROW
        blocks[2][0] = findViewById(R.id.board_2_0);
        blocks[2][1] = findViewById(R.id.board_2_1);
        blocks[2][2] = findViewById(R.id.board_2_2);
        blocks[2][3] = findViewById(R.id.board_2_3);
        blocks[2][4] = findViewById(R.id.board_2_4);
        blocks[2][5] = findViewById(R.id.board_2_5);
        blocks[2][6] = findViewById(R.id.board_2_6);
        blocks[2][7] = findViewById(R.id.board_2_7);
        blocks[2][8] = findViewById(R.id.board_2_8);
        blocks[2][9] = findViewById(R.id.board_2_9);
        blocks[2][10] = findViewById(R.id.board_2_10);
        blocks[2][11] = findViewById(R.id.board_2_11);
        blocks[2][12] = findViewById(R.id.board_2_12);
        blocks[2][13] = findViewById(R.id.board_2_13);
        blocks[2][14] = findViewById(R.id.board_2_14);
        blocks[2][15] = findViewById(R.id.board_2_15);
        blocks[2][16] = findViewById(R.id.board_2_16);
        blocks[2][17] = findViewById(R.id.board_2_17);
        blocks[2][18] = findViewById(R.id.board_2_18);
        blocks[2][19] = findViewById(R.id.board_2_19);

        // FOURTH ROW
        blocks[3][0] = findViewById(R.id.board_3_0);
        blocks[3][1] = findViewById(R.id.board_3_1);
        blocks[3][2] = findViewById(R.id.board_3_2);
        blocks[3][3] = findViewById(R.id.board_3_3);
        blocks[3][4] = findViewById(R.id.board_3_4);
        blocks[3][5] = findViewById(R.id.board_3_5);
        blocks[3][6] = findViewById(R.id.board_3_6);
        blocks[3][7] = findViewById(R.id.board_3_7);
        blocks[3][8] = findViewById(R.id.board_3_8);
        blocks[3][9] = findViewById(R.id.board_3_9);
        blocks[3][10] = findViewById(R.id.board_3_10);
        blocks[3][11] = findViewById(R.id.board_3_11);
        blocks[3][12] = findViewById(R.id.board_3_12);
        blocks[3][13] = findViewById(R.id.board_3_13);
        blocks[3][14] = findViewById(R.id.board_3_14);
        blocks[3][15] = findViewById(R.id.board_3_15);
        blocks[3][16] = findViewById(R.id.board_3_16);
        blocks[3][17] = findViewById(R.id.board_3_17);
        blocks[3][18] = findViewById(R.id.board_3_18);
        blocks[3][19] = findViewById(R.id.board_3_19);

        // FIFTH ROW
        blocks[4][0] = findViewById(R.id.board_4_0);
        blocks[4][1] = findViewById(R.id.board_4_1);
        blocks[4][2] = findViewById(R.id.board_4_2);
        blocks[4][3] = findViewById(R.id.board_4_3);
        blocks[4][4] = findViewById(R.id.board_4_4);
        blocks[4][5] = findViewById(R.id.board_4_5);
        blocks[4][6] = findViewById(R.id.board_4_6);
        blocks[4][7] = findViewById(R.id.board_4_7);
        blocks[4][8] = findViewById(R.id.board_4_8);
        blocks[4][9] = findViewById(R.id.board_4_9);
        blocks[4][10] = findViewById(R.id.board_4_10);
        blocks[4][11] = findViewById(R.id.board_4_11);
        blocks[4][12] = findViewById(R.id.board_4_12);
        blocks[4][13] = findViewById(R.id.board_4_13);
        blocks[4][14] = findViewById(R.id.board_4_14);
        blocks[4][15] = findViewById(R.id.board_4_15);
        blocks[4][16] = findViewById(R.id.board_4_16);
        blocks[4][17] = findViewById(R.id.board_4_17);
        blocks[4][18] = findViewById(R.id.board_4_18);
        blocks[4][19] = findViewById(R.id.board_4_19);

        // SIXTH ROW
        blocks[5][0] = findViewById(R.id.board_5_0);
        blocks[5][1] = findViewById(R.id.board_5_1);
        blocks[5][2] = findViewById(R.id.board_5_2);
        blocks[5][3] = findViewById(R.id.board_5_3);
        blocks[5][4] = findViewById(R.id.board_5_4);
        blocks[5][5] = findViewById(R.id.board_5_5);
        blocks[5][6] = findViewById(R.id.board_5_6);
        blocks[5][7] = findViewById(R.id.board_5_7);
        blocks[5][8] = findViewById(R.id.board_5_8);
        blocks[5][9] = findViewById(R.id.board_5_9);
        blocks[5][10] = findViewById(R.id.board_5_10);
        blocks[5][11] = findViewById(R.id.board_5_11);
        blocks[5][12] = findViewById(R.id.board_5_12);
        blocks[5][13] = findViewById(R.id.board_5_13);
        blocks[5][14] = findViewById(R.id.board_5_14);
        blocks[5][15] = findViewById(R.id.board_5_15);
        blocks[5][16] = findViewById(R.id.board_5_16);
        blocks[5][17] = findViewById(R.id.board_5_17);
        blocks[5][18] = findViewById(R.id.board_5_18);
        blocks[5][19] = findViewById(R.id.board_5_19);

        // SEVENTH ROW
        blocks[6][0] = findViewById(R.id.board_6_0);
        blocks[6][1] = findViewById(R.id.board_6_1);
        blocks[6][2] = findViewById(R.id.board_6_2);
        blocks[6][3] = findViewById(R.id.board_6_3);
        blocks[6][4] = findViewById(R.id.board_6_4);
        blocks[6][5] = findViewById(R.id.board_6_5);
        blocks[6][6] = findViewById(R.id.board_6_6);
        blocks[6][7] = findViewById(R.id.board_6_7);
        blocks[6][8] = findViewById(R.id.board_6_8);
        blocks[6][9] = findViewById(R.id.board_6_9);
        blocks[6][10] = findViewById(R.id.board_6_10);
        blocks[6][11] = findViewById(R.id.board_6_11);
        blocks[6][12] = findViewById(R.id.board_6_12);
        blocks[6][13] = findViewById(R.id.board_6_13);
        blocks[6][14] = findViewById(R.id.board_6_14);
        blocks[6][15] = findViewById(R.id.board_6_15);
        blocks[6][16] = findViewById(R.id.board_6_16);
        blocks[6][17] = findViewById(R.id.board_6_17);
        blocks[6][18] = findViewById(R.id.board_6_18);
        blocks[6][19] = findViewById(R.id.board_6_19);

        // EIGHTH ROW
        blocks[7][0] = findViewById(R.id.board_7_0);
        blocks[7][1] = findViewById(R.id.board_7_1);
        blocks[7][2] = findViewById(R.id.board_7_2);
        blocks[7][3] = findViewById(R.id.board_7_3);
        blocks[7][4] = findViewById(R.id.board_7_4);
        blocks[7][5] = findViewById(R.id.board_7_5);
        blocks[7][6] = findViewById(R.id.board_7_6);
        blocks[7][7] = findViewById(R.id.board_7_7);
        blocks[7][8] = findViewById(R.id.board_7_8);
        blocks[7][9] = findViewById(R.id.board_7_9);
        blocks[7][10] = findViewById(R.id.board_7_10);
        blocks[7][11] = findViewById(R.id.board_7_11);
        blocks[7][12] = findViewById(R.id.board_7_12);
        blocks[7][13] = findViewById(R.id.board_7_13);
        blocks[7][14] = findViewById(R.id.board_7_14);
        blocks[7][15] = findViewById(R.id.board_7_15);
        blocks[7][16] = findViewById(R.id.board_7_16);
        blocks[7][17] = findViewById(R.id.board_7_17);
        blocks[7][18] = findViewById(R.id.board_7_18);
        blocks[7][19] = findViewById(R.id.board_7_19);

        // NINETH ROW
        blocks[8][0] = findViewById(R.id.board_8_0);
        blocks[8][1] = findViewById(R.id.board_8_1);
        blocks[8][2] = findViewById(R.id.board_8_2);
        blocks[8][3] = findViewById(R.id.board_8_3);
        blocks[8][4] = findViewById(R.id.board_8_4);
        blocks[8][5] = findViewById(R.id.board_8_5);
        blocks[8][6] = findViewById(R.id.board_8_6);
        blocks[8][7] = findViewById(R.id.board_8_7);
        blocks[8][8] = findViewById(R.id.board_8_8);
        blocks[8][9] = findViewById(R.id.board_8_9);
        blocks[8][10] = findViewById(R.id.board_8_10);
        blocks[8][11] = findViewById(R.id.board_8_11);
        blocks[8][12] = findViewById(R.id.board_8_12);
        blocks[8][13] = findViewById(R.id.board_8_13);
        blocks[8][14] = findViewById(R.id.board_8_14);
        blocks[8][15] = findViewById(R.id.board_8_15);
        blocks[8][16] = findViewById(R.id.board_8_16);
        blocks[8][17] = findViewById(R.id.board_8_17);
        blocks[8][18] = findViewById(R.id.board_8_18);
        blocks[8][19] = findViewById(R.id.board_8_19);

        // TENTH ROW
        blocks[9][0] = findViewById(R.id.board_9_0);
        blocks[9][1] = findViewById(R.id.board_9_1);
        blocks[9][2] = findViewById(R.id.board_9_2);
        blocks[9][3] = findViewById(R.id.board_9_3);
        blocks[9][4] = findViewById(R.id.board_9_4);
        blocks[9][5] = findViewById(R.id.board_9_5);
        blocks[9][6] = findViewById(R.id.board_9_6);
        blocks[9][7] = findViewById(R.id.board_9_7);
        blocks[9][8] = findViewById(R.id.board_9_8);
        blocks[9][9] = findViewById(R.id.board_9_9);
        blocks[9][10] = findViewById(R.id.board_9_10);
        blocks[9][11] = findViewById(R.id.board_9_11);
        blocks[9][12] = findViewById(R.id.board_9_12);
        blocks[9][13] = findViewById(R.id.board_9_13);
        blocks[9][14] = findViewById(R.id.board_9_14);
        blocks[9][15] = findViewById(R.id.board_9_15);
        blocks[9][16] = findViewById(R.id.board_9_16);
        blocks[9][17] = findViewById(R.id.board_9_17);
        blocks[9][18] = findViewById(R.id.board_9_18);
        blocks[9][19] = findViewById(R.id.board_9_19);

        //set all colors to transparent
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 20; ++j) {
                blocks[i][j].setBackgroundColor(getResources().getColor(R.color.transparent));
            }
        }
    }

    /**
     * A method that places a piece on the board, setting the grid positions to true
     * and filling in the color at those blocks
     *
     * @param the_piece a Piece representing the piece being placed on the board
     *
     * Commented out a check for placing the piece in bounds of the board. I feel it's an unnecessary check, testing before removing entirely
     */
    public void placePiece(Piece the_piece){

        // Store common variables used for the piece
        int y = the_piece.getPieceY();
        int x = the_piece.getPieceX();
        int width = the_piece.getPieceWidth();
        int height = the_piece.getPieceHeight();
        // Relative positions of piece's grid to the board's grid
        int relative_x, relative_y;

        // Check the piece's grid for filled blocks
        for (int i=0; i<width; ++i) {
            for (int j=0; j<height; ++j) {

                // Set relative positions to each block checked
                relative_y = y - height + j + 1;
                relative_x = x + i;

                // Check to see if a filled block on a piece is over the board. Game over if accessed.
                if (relative_y < 0 && the_piece.getGridAt(i, j)) {
                    if (!MyTetrisMain.game_over) MyTetrisMain.gameOver();
                    return;
                }

                // Check if the piece's grid[i][j] is filled
                if (the_piece.getGridAt(i, j)) {

                    // Set the Board's grid and blocks color to true and the color of the piece
                    grid[relative_x][relative_y] = true;
                    blocks[relative_x][relative_y].setBackgroundColor(getResources().getColor(the_piece.getColor()));

                    // This piece is no longer in use
                    the_piece.setInUse(false);

                }

            }
        }

        // Clears any row that may have been completed by the placement
        boolean clear;
        for (int i=0; i<20; ++i){

            // Assume we are going to clear the board
            clear = true;

            for (int j=0; j<10; ++j){

                // Check to see if a block on the row i is empty
                if (!grid[j][i]) {

                    // We cannot clear this row
                    clear = false;
                    break;

                }

            }

            // If we can clear the row, clear row i and drop all rows above it by 1
            if (clear) {
                clearRowAndDrop(i);
            }
        }

    }

    /**
     * A private method used in clearing the board's row
     * and dropping all blocks above it down one row
     *
     * @param row an Integer which represents the row to be cleared and dropped from
     */
    private void clearRowAndDrop(int row) {

        // Update the score and goal count on the main activity
        MyTetrisMain.updateNumbers();

        // Recurse through the board starting from the y value above 'row' and going up
        for (int i=0; i<BOARD_X_RIGHT_BOUNDS; ++i) {
            for (int j=(row - 1); j >= 0; --j) {

                // Set the below block value to the current block value
                grid[i][j + 1] = grid[i][j];

                // Grab the color from the current block
                int color = ((ColorDrawable)blocks[i][j].getBackground()).getColor();

                // Set the below block value color to transparent
                blocks[i][j + 1].setBackgroundColor(getResources().getColor(R.color.transparent));

                // Check if the below block value is filled
                if (grid[i][j+1]) {

                    // Then set the below block color to the retrieved block color
                    blocks[i][j + 1].setBackgroundColor(color);
                }
            }
        }

    }

    /**
     * Getter methods
     */
    public boolean getGrid(int x, int y) { return grid[x][y]; }

    /**
     * Setter methods
     */
    public void setGrid(int x, int y, boolean bool) { grid[x][y] = bool; }
    public void setBlockColor(int x, int y, int color) { blocks[x][y].setBackgroundColor(color); }

}
