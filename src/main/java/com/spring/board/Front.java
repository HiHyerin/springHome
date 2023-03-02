package com.spring.board;

import java.util.HashMap;
import java.util.Map;

public class Front {
    public static void boardFront(Map map){
        Controller controller = new Controller();
        controller.boardController(map);
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("subject","게시판");
        map.put("article","스프링");
        map.put("content","게시판 생성 흐름 이해하기");

//        boardFront(map);

    Controller con = new Controller();
        System.out.println(con.boardListController());

    }
}
