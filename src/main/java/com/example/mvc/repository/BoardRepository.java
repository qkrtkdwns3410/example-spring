package com.example.mvc.repository;


import com.example.mvc.domain.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/*
* 게시판 서비스
* //@author 박상준
* */


@Repository
public interface BoardRepository {
    
    //목록 리턴 @return
    List<Board> getList();
    
    /*
     * 상세 정보 리턴
     * @param boardSeq
     * @return
     * */
    Board get(int boardSeq);
    /*
     *
     * */
    
    void save(Board board);
    
    void update(Board board);
    
    void delete(int boardSeq);
    
}

















