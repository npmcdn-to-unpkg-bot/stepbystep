package com.study.mybatis.mapper;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author youguilin
 */
public class TestDate {

    public static void main(String[] args) {
        Date d = new Date();
        d.setTime(1444292315639L);
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(f.format(d));
    }

}
