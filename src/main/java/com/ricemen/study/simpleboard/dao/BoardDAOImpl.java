package com.ricemen.study.simpleboard.dao;

import com.ricemen.study.simpleboard.vo.Board;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class BoardDAOImpl implements BoardDAO {

    private SqlSession sqlSession;

    public BoardDAOImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<Board> getBoardList() {
        return sqlSession.selectList("boardList.listBoard");
    }

    @Override
    public List<Board> getBoardList(Map<String, Object> params) {
        return sqlSession.selectList("boardList.listBoard");
    }

    @Override
    public Board getBoard(int bno) {
        return null;
    }

    @Override
    public void insert(Board board) {
        sqlSession.insert("boardList.insertBoard", board);
    }

    @Override
    public void update(Board board) {

    }

    @Override
    public void delete(Board board) {

    }
}
