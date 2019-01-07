package com.ricemen.study.simpleboard.controller;

import com.ricemen.study.simpleboard.service.BoardListService;
import com.ricemen.study.simpleboard.vo.Board;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/**/*.xml"})
@Rollback
public class BoardListControllerTest {

    @Autowired
    private BoardListService boardService;

    private List<Board> list;

    @Before
    public void setUp() {
        list = new ArrayList<>();
        list.add(0, Board.builder().btitle("제목1").bcontents("내용1").bwriter("ricemen").build());
        list.add(1, Board.builder().btitle("제목2").bcontents("내용2").bwriter("ricemen").build());
        list.add(2, Board.builder().btitle("제목3").bcontents("내용3").bwriter("ricemen").build());
    }

    @Test
    @Transactional
    @Rollback(false)
    public void getBoardList() {

        for(Board board: list) {
            boardService.insertBoard(board);
        }

        List<Board> boards = boardService.getBoardList();
        System.out.println(boards);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme