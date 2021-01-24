package com.headfirst.design.decorator.myio.test;

import com.headfirst.design.decorator.myio.LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author LiuCan
 * @date 2021/1/24 21:04
 * @description InputTest
 */
public class InputTest {

    public static void main(String[] args) throws IOException {
        int c;
        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("D:\\lim\\projects\\HFirst4Design\\src\\main\\resources\\txt\\test.txt")
                            ));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();

        }



    }
}
