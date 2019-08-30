package xyz.redtorch.gateway.ctp.x64v6v3v15v;

import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

import static org.junit.Assert.*;

public class MdSpiTest {


    public static void main(String[] args) {
//        String text = "20180225142051591";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
//        LocalDate dt = LocalDate.parse("20180225142051591", formatter);
//        System.out.println(dt.getDayOfMonth());

        String text = "20180225142051591";
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                // 解析date+time
                .appendPattern("yyyyMMddHHmmss")
                // 解析毫秒数
                .appendValue(ChronoField.MILLI_OF_SECOND, 3)
                .toFormatter();
        LocalDate dt = LocalDate.parse("20180225142051591", formatter);
        System.out.println(dt.getDayOfMonth());
    }

}