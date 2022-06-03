package com.ktu.chess

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ktu.chess.chessData.Board
import com.ktu.chess.chessData.SquareData
import com.ktu.chess.chessPieces.*


class ChessGame : AppCompatActivity() {
    lateinit var board: Board
    lateinit var pieceDrawables: PieceDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chess_game)

        pieceDrawables = PieceDrawable(this)
        board = Board(this,8)
        initClassicBoard(board)
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun initClassicBoard(board: Board) {
        val boardData: MutableList<MutableList<SquareData>> = board.getData()
        boardData[0][0].setPiece( Rook("BLACK", board, pieceDrawables.BLACK_ROOK))
        boardData[1][0].setPiece( Knight("BLACK", board, pieceDrawables.BLACK_KNIGHT))
        boardData[2][0].setPiece( Bishop("BLACK", board, pieceDrawables.BLACK_BISHOP))
        boardData[3][0].setPiece( Queen("BLACK", board, pieceDrawables.BLACK_QUEEN))
        boardData[4][0].setPiece( King("BLACK", board, pieceDrawables.BLACK_KING))
        boardData[5][0].setPiece( Bishop("BLACK", board, pieceDrawables.BLACK_BISHOP))
        boardData[6][0].setPiece( Knight("BLACK", board, pieceDrawables.BLACK_KNIGHT))
        boardData[7][0].setPiece( Rook("BLACK",board, pieceDrawables.BLACK_ROOK))

        for (i in 0 until 8) {
            boardData[i][1].setPiece( Pawn("BLACK",board, pieceDrawables.BLACK_PAWN))
        }

        boardData[0][7].setPiece( Rook("WHITE", board, pieceDrawables.WHITE_ROOK))
        boardData[1][7].setPiece( Knight("WHITE", board, pieceDrawables.WHITE_KNIGHT))
        boardData[2][7].setPiece( Bishop("WHITE", board, pieceDrawables.WHITE_BISHOP))
        boardData[3][7].setPiece( King("WHITE", board, pieceDrawables.WHITE_KING))
        boardData[4][7].setPiece( Queen("WHITE", board, pieceDrawables.WHITE_QUEEN))
        boardData[5][7].setPiece( Bishop("WHITE", board, pieceDrawables.WHITE_BISHOP))
        boardData[6][7].setPiece( Knight("WHITE", board, pieceDrawables.WHITE_KNIGHT))
        boardData[7][7].setPiece( Rook("WHITE",board, pieceDrawables.WHITE_ROOK))

        for (i in 0 until 8) {
            boardData[i][6].setPiece( Pawn("WHITE",board, pieceDrawables.WHITE_PAWN))
        }
    }

}