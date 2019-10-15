/*
  This class will create Cell objects, corresponding to each of the cells on the game board
  Each of the cells contains the following member properties
  mImageView -> Store the ImageView of each cell, whose color will be changed
               with setBackgroundColo
  mOwner     -> Here it is saved who was the player who took the cell
               (0-Vacant cell / 1-Player 1 / 2-Player 2
  mWeight    -> The weight of a cell represents the number of winning combinations
               in which it can participate
*/

package com.example.tresenraya;

import android.widget.ImageView;

/**
 * Clase para instanciar cada celda
 */
public class Cell {
    private ImageView mImageView;
    private int mOwner;
    private int mWeight;

    Cell(ImageView cell, int weigth) {
        mImageView = cell;
        mWeight = weigth;
        mOwner = 0;
    }

    ImageView getImageView() {
        return mImageView;
    }

    int getOwner() {
        return mOwner;
    }

    void setOwner(int turn) {
        mOwner = turn;
    }

    int getWeigth() {
        return mWeight;
    }
}

