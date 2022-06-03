package com.ktu.chess.chessData

import com.ktu.chess.chessPieces.ChessPiece
import com.ktu.chess.views.SquareView

class SquareData(val board: Board, val x: Int, val y: Int, val view: SquareView) {
    var content: ChessPiece? = null

    fun setPiece(piece: ChessPiece?) {
        content = piece

        if (piece != null) {
            piece.square = this
            view.setDrawable(piece.drawable)
        } else {
            view.removeDrawable()
        }

    }



}