package com.spring;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Msg {
    private String id, name;

    public static void main(String[] args) {
        Temp temp = new Temp();
        temp.stringPrint("f");
    }

}
