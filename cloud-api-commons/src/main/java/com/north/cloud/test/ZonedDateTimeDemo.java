package com.north.cloud.test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author eternal
 * @version 1.0
 * @description: TODO
 * @date 2024/4/12 下午6:44
 */
public class ZonedDateTimeDemo
{
    public static void main(String[] args)
    {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);
    }
}