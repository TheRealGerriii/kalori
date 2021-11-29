/*
 * File: calcBMR.java
 * Created Date: 2021-11-29 08:18:00
 * Author: Hermányi Gergely
 * Github: https://github.com/TheRealGeriii
 * Group: SZOFT II/N
 * -----
 * Last Modified: 2021-11-29
 * Modified By: Hermányi Gergely
 * -----
 * Copyright (c) 2021 Hermányi Gergely
 * 
 * GNU GPL v2
 */

public class calcBMR {
    double weight;
    double height;
    double age;
    
    public void setData(double weight, double height, double age){
        this.weight = weight;
        this.height = height;
        this.age = age;
    }
    public double calcWomenBMR (){
        double result = 9.247 * weight + 3.098 * height - 4.330 * age + 447.593;
        return result;
    }
    public double calcManBMR(){
        double result = 13.397 * weight + 4.799 * height - 5.667 * age + 88.362;
        return result;
    }
}