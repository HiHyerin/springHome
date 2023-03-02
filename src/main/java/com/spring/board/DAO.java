package com.spring.board;

import java.awt.image.BandCombineOp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DAO {
    public void boardDao(BoardVO vo){
        System.out.println("제목:"+vo.getSubject());
        System.out.println("내용:"+vo.getContent());
        System.out.println("주제:"+vo.getArticle());
    }

    private ArrayList<HashMap<String,String>> boardList(){
        ArrayList<HashMap<String, String>> list = new ArrayList<>();

        HashMap<String, String> map = new HashMap<>();
        map.put("subject", "게시판");
        map.put("article", "스프링");
        map.put("content", "게시판 생성 흐름 이해하기");
        list.add(map);

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("subject", "게시판2");
        map2.put("article", "파이썬");
        map2.put("content", "파이썬 킼킼킼");
        list.add(map2);

        HashMap<String, String> map3 = new HashMap<>();
        map3.put("subject", "게시판3");
        map3.put("article", "자바");
        map3.put("content", "자바 화이팅");
        list.add(map3);

//        System.out.println(list.get(0).get("subject"));
        return list;
    }

    public ArrayList<BoardVO> getBoardList(){
        ArrayList<HashMap<String, String>> list = boardList();
        ArrayList<BoardVO> blist = new ArrayList<>();

        for(HashMap<String, String> map:list){
            BoardVO vo = new BoardVO();
            vo.setSubject(map.get("subject"));
            vo.setSubject(map.get("article"));
            vo.setSubject(map.get("content"));
        }
        return blist;
    }
}
