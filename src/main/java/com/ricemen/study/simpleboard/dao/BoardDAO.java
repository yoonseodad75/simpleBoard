package com.ricemen.study.simpleboard.dao;

import com.ricemen.study.simpleboard.vo.Board;

import java.util.List;
import java.util.Map;

public interface BoardDAO {

    List<Board> getBoardList();
    List<Board> getBoardList(Map<String, Object> params);

    Board getBoard(int bno);

    void insert(Board board);
    void update(Board board);
    void delete(Board board);
}
