package com.example.mvc.service;

import com.example.mvc.domain.Board;
import com.example.mvc.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    
    @Autowired
    private BoardRepository repository;
    /*
     * 목록 리턴
     * @param boardSeq
     * @return
     * */
    public List<Board> getList() {
        return repository.getList();
    }
    
    /*
     * 상세 정보 리턴
     * @param boardSeq
     * @return
     * */
    public Board get(int boardSeq) {
        return repository.get(boardSeq);
    }
    /*
     * 등록 처리
     * @param boardSeq
     * @return
     * */
    public void save(Board board) {
        repository.save(board);
        
    }
    /*
     * 업데이트 처리
     * @param boardSeq
     * @return
     * */
    public void update(Board board) {
        repository.update(board);
    }
    /*
     * 삭제 처리.
     * @param boardSeq
     * @return
     * */
    public void delete(int boardSeq) {
        repository.delete(boardSeq);
    }
    
    
}
