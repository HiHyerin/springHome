package com.spring.user;

import java.util.Map;

public class Controller {
    public void signUp(Map<String,String> map){
        UserVO vo = new UserVO();
        vo.setName(map.get("name"));
        vo.setAge(map.get("age"));
        vo.setGender(map.get("gender"));

        DAO dao = new DAO();
        dao.signUp(vo);
    }
}
