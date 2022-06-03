package com.ktu.chess.chessData

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.widget.LinearLayout
import com.ktu.chess.ChessGame
import com.ktu.chess.R
import com.ktu.chess.chessPieces.PieceDrawable
import com.ktu.chess.views.SquareView
import kotlin.math.roundToInt


class Board {
    private val boardData: MutableList<MutableList<SquareData>> = mutableListOf()
    private lateinit var boardLayout: LinearLayout
    lateinit var drawables: PieceDrawable
    var turn: String = "WHITE"
    var length: Int = 8
    var selected = SelectedData()

    constructor(game: ChessGame, l: Int) {
        boardLayout = game.findViewById(R.id.BoardLayout) as LinearLayout
        drawables = game.pieceDrawables
        length = l

        var white = true
        //val width = boardLayout!!.width / l
        val width: Int = (1000f/l).roundToInt()
        val pair = (l == (l/2f).roundToInt()*2)
        val param = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)

        for (i in 0 until l) {
            val columnLayout = LinearLayout(game)
            columnLayout.orientation = LinearLayout.VERTICAL
            val rowData: MutableList<SquareData> = mutableListOf()
            for (j in 0 until l) {
                val square = SquareView(game, null)
                val data = SquareData(this, i, j, square)
                square.initialize(if (white) {Color.LTGRAY} else {Color.DKGRAY}, data)

                columnLayout.addView(square, width, width)
                rowData.add(data)

                white = !white
            }
            boardLayout.addView(columnLayout, param)
            boardData.add(rowData.toMutableList())

            rowData.clear()
            if (pair) {white = !white}
        }
    }

    constructor(game: ChessGame) {
        Board(game,8)
    }

    fun getData(): MutableList<MutableList<SquareData>> {
        return boardData
    }

    fun nextTurn(team: String?) {
        if (team != null) {
            turn = if (team == "WHITE") {"BLACK"} else {"WHITE"}
        }

    }

}