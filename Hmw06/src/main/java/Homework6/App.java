package Homework6;

import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        String message = "Hello, Maven!";
        System.out.println(StringUtils.upperCase(message));
		System.out.println(StringUtils.swapCase(message));
    }
}
