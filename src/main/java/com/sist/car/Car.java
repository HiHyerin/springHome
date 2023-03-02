package com.sist.car;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private int speed = 0;
    private String status = "정지";
    private  String name;


    public String changeStatus(int speed){
        if (speed == 0){
            return "정지";
        } else if (speed > 0) {
            return "전진";
        } else {
            return "후진";
        }
    }

    public String speedUp(int a){
        this.speed+=a;
        this.status = changeStatus(this.speed);
        String x = "속도: " + this.speed + "\n상태: " + this.status;

        return x;
    }
}
