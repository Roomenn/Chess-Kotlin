package com.ktu.chess.chessPieces

import android.annotation.SuppressLint
import com.ktu.chess.ChessGame
import com.ktu.chess.R

@SuppressLint("UseCompatLoadingForDrawables")
class PieceDrawable(game: ChessGame) {
    val BLACK_BISHOP = game.resources.getDrawable(R.drawable.ic_black_bishop, game.theme)
    val BLACK_KING = game.resources.getDrawable(R.drawable.ic_black_king, game.theme)
    val BLACK_KNIGHT = game.resources.getDrawable(R.drawable.ic_black_knight, game.theme)
    val BLACK_PAWN = game.resources.getDrawable(R.drawable.ic_black_pawn, game.theme)
    val BLACK_QUEEN = game.resources.getDrawable(R.drawable.ic_black_queen, game.theme)
    val BLACK_ROOK = game.resources.getDrawable(R.drawable.ic_black_rook, game.theme)

    val WHITE_BISHOP = game.resources.getDrawable(R.drawable.ic_white_bishop, game.theme)
    val WHITE_KING = game.resources.getDrawable(R.drawable.ic_white_king, game.theme)
    val WHITE_KNIGHT = game.resources.getDrawable(R.drawable.ic_white_knight, game.theme)
    val WHITE_PAWN = game.resources.getDrawable(R.drawable.ic_white_pawn, game.theme)
    val WHITE_QUEEN = game.resources.getDrawable(R.drawable.ic_white_queen, game.theme)
    val WHITE_ROOK = game.resources.getDrawable(R.drawable.ic_white_rook, game.theme)
}