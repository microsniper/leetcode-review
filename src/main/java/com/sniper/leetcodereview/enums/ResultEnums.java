package com.sniper.leetcodereview.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

/**
 * @Description TODO
 * @Author sniper
 * @Date 2023/6/25 12:06 AM
 **/
@Getter
@AllArgsConstructor
public enum ResultEnums {
    INT("int"),
    CHAR("char"),
    SHORT("short"),
    BYTE("byte"),
    FLOAT("float"),
    DOUBLE("double"),
    LONG("long"),
    BOOLEAN("boolean");

    private String code;

    public static ResultEnums get(String code){
        return Stream.of(values()).filter(item -> item.getCode().equals(code)).findAny().orElse(null);
    }
}
