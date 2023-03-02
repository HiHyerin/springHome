package com.spring.user;

import java.util.HashMap;
import java.util.Map;

public class Front {
    public static void onClick(Map<String,String> map){
        Controller controller = new Controller();
        controller.signUp(map);
        
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        map.put("age","30");
        map.put("name","홍풍통");
        map.put("gender","남자");

        onClick(map);
    }
}
