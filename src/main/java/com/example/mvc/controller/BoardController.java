package com.example.mvc.controller;

import com.example.mvc.domain.Board;
import com.example.mvc.repository.BoardRepository;
import com.example.mvc.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
게시판 컨트롤러
@author 박상준
*/

@RestController
public class BoardController {
    
    @Autowired
    private BoardService boardService;
    
    /*
     * 목록 리턴
     * @param boardSeq
     * @return
     * */
    @GetMapping
    public List<Board> getList() {
        
        return boardService.getList();
    }
    
    /*
     * 상세 정보 리턴
     * @param boardSeq
     * @return
     * */
    @GetMapping("/{boardSeq}")
    public Board get(@PathVariable int boardSeq) {
        return boardService.get(boardSeq);
    }
    
    /*
     * 등록 처리
     * @param boardSeq
     * @return
     * */
    @GetMapping("/save")
    public void save(Board board) {
        boardService.save(board);
        
    }
    
    
    /*
     * 삭제 처리.
     * @param boardSeq
     * @return
     * */
    @GetMapping("/delete/{boardSeq}")
    public void delete(int boardSeq) {
        boardService.delete(boardSeq);
    }
    
    
}















