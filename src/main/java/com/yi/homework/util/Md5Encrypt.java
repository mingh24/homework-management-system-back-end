package com.yi.homework.util;

import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Project Name: homework-management-system-back-end
 * File Name: Md5Encrypt
 * Package Name: com.yi.homework.util
 *
 * @author yipple
 * @date 2020/6/16
 * @since 0.0.1
 */
@Component
public class Md5Encrypt {

    private static String byte2HexString(byte b) {
        int bInt = b;
        if (bInt < 0) {
            b ^= (1 << 7);
            bInt = b + (1 << 7);
        }

        String lowBit = Integer.toHexString(bInt / 16);
        String highBit = Integer.toHexString(bInt % 16);

        return lowBit + highBit;
    }

    public String getHexString(String str) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("md5");
            byte[] resultBytes = md5.digest(str.getBytes(StandardCharsets.UTF_8));

            StringBuilder builder = new StringBuilder();
            for (byte b : resultBytes) {
                builder.append(byte2HexString(b));
            }

            return builder.toString();
        } catch (NoSuchAlgorithmException ex) {
            return "";
        }
    }

}
