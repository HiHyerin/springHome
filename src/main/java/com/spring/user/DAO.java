package com.spring.user;

public class DAO {
    public void signUp(UserVO vo){
        System.out.println("나이:"+vo.getAge());
        System.out.println("이름:"+vo.getName());
        System.out.println("성별:"+vo.getGender());
    }
}
