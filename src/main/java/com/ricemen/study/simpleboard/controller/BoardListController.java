package com.ricemen.study.simpleboard.controller;

import com.ricemen.study.simpleboard.service.BoardListService;
import com.ricemen.study.simpleboard.vo.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BoardListController {

    @Autowired
    private BoardListService boardService;

    @RequestMapping("/list")
    public String getBoardList(ModelAndView mav) {
        List<Board> list = boardService.getBoardList();
        mav.addObject("list", list);
        return "board/boardList";
    }

}
