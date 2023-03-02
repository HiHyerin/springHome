package com.sist.car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CarMain {

    public static void carPrint(List<Car> cList){
        for(Car car:cList){
            System.out.println("이름:"+car.getName()+" 상태:"+car.getStatus()+" 속도: "+car.getSpeed());
        }
        System.out.println();
    }
    public static List<Car> speedUpAll(List<Car> cList){
        for(Car car:cList){
            car.speedUp(5);
        }

//        for(int i=0;i<cList.size();i++){
//            cList.get(i).speedUp(5);
//        }
        return cList;
    }
    public static List<Car> createCar(int a){
        List<Car> list = new ArrayList<>();
        for(int i=0;i<a;i++){
            list.add(new Car());
        }
        return list;
    }
    private static List<Car> addCar(List<Car> carList, int a) {
        for(int i=0;i<a;i++){
            carList.add(new Car());
        }
        return carList;
    }

    private static List<Car> removeCar(List<Car> carList, int a){
        carList.remove(a);
        return carList;
    }

    private static List<Car> nameCar(List<Car> carList, String[] carNames){
        for (int i=0;i<carList.size();i++){
            carList.get(i).setName(carNames[i]);
        }
        return  carList;
    }

    public static void main(String[] args) {
//        Car car1 = new Car();
//        Car car2 = new Car();
//        car1.speedUp(5);
//        List<Car> carList = new ArrayList<>();
//        carList.add(car1); //carList.get(0)
//        carList.add(car2);
//
//        carPrint(carList);
//        speedUpAll(carList);
//        carPrint(carList);

//        List<Car> carList = new ArrayList<>();
//        carList.add(new Car()); //carList.get(0)
//        carList.add(new Car());

        List<Car> carList = createCar(2);
        carList = addCar(carList,3);
        carPrint(carList);

        String[] carNames = {"벤츠","테슬라","그랜저","마세라티","포르쉐"};
        nameCar(carList, carNames);


        speedUpAll(carList);
        carPrint(carList);
        removeCar(carList, 2);
        carPrint(carList);
        removeCar(carList, 2);
        carPrint(carList);




    }


}
