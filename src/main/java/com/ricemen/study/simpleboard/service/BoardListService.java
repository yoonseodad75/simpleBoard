package com.ricemen.study.simpleboard.service;

import com.ricemen.study.simpleboard.dao.BoardDAO;
import com.ricemen.study.simpleboard.vo.Board;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardListService {

    private BoardDAO boardDAO;

    public BoardListService(BoardDAO boardDAO) {
        this.boardDAO = boardDAO;
    }

    public List<Board> getBoardList() {
        return boardDAO.getBoardList();
    }

    public void insertBoard(Board board) {
        boardDAO.insert(board);
    }
}
