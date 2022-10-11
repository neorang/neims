package com.neorang.neims.globals.mapper;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class EnumMapper {
    public static List<EnumValue> get(Class<? extends EnumModel> e) {
        return toEnumValues(e);
    }

    private static List<EnumValue> toEnumValues(Class<? extends EnumModel> e) {
        return Arrays.stream(e.getEnumConstants())
                .map(EnumValue::new)
                .collect(Collectors.toList());
    }
}
