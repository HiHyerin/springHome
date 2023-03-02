package com.spring.board;

import java.util.ArrayList;
import java.util.Map;

public class Controller2 {
    public void boardController(Map<String, String> map){
        BoardVO vo = new BoardVO();
        vo.setArticle(map.get("article"));
        vo.setContent(map.get("content"));
        vo.setSubject(map.get("subject"));

        DAO dao = new DAO();
        dao.boardDao(vo);

    }

    public ArrayList<BoardVO> boardListController(){
       DAO dao = new DAO();
       ArrayList<BoardVO> list = dao.getBoardList();


        return list;
    }
}
