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

    public double calcWomenBMR (double weight, double height, double age){
        if(weight < 1){
            throw new IllegalArgumentException("nem lehet ekkora a testömeg!");
        }
        if(height < 1){
            throw new IllegalArgumentException("nem lehet ekkora a magasság!");
        }
        if(age < 1){
            throw new IllegalArgumentException("nem lehet ekkora az életkor!");
        }
        double result = 9.247 * weight + 3.098 * height - 4.330 * age + 447.593;
        return result;
        

    }
    public double calcManBMR(double weight, double height, double age){
        if(weight < 1){
            throw new IllegalArgumentException("nem lehet ekkora a testömeg!");
        }
        if(height < 1){
            throw new IllegalArgumentException("nem lehet ekkora a magasság!");
        }
        if(age < 1){
            throw new IllegalArgumentException("nem lehet ekkora az életkor!");
        }
        double result = 13.397 * weight + 4.799 * height - 5.667 * age + 88.362;
        return result;
    }
}