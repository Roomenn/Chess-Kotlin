package com.ktu.chess.chessPieces

import android.graphics.drawable.Drawable
import com.ktu.chess.chessData.Board
import com.ktu.chess.chessData.SquareData

class Bishop(
    override val team: String,
    override val board: Board,
    override val drawable: Drawable
) : ChessPiece {
    override lateinit var square: SquareData

    override val allowed: Array<Array<Int>> = arrayOf(
        arrayOf(1,1), arrayOf(1,-1),
        arrayOf(-1,1), arrayOf(-1,-1))

    override fun movement(): ChessPiece.Move {
        return linearMovement()
    }
}