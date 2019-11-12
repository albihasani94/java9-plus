package com.jdk.java10.var;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class LocalTypeInference {

    public static void main(String[] args) throws IOException {

        // Before Java 10
        /*URL url = new URL("https://www.albinhasani.net/");
        URLConnection conn = url.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        String inputLine;
        while ((inputLine = reader.readLine()) != null) {
            System.out.println(inputLine);
        }*/

        // With Java 10
        var url = new URL("https://www.albinhasani.net/");
        var conn = url.openConnection();
        var reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        var inputLine = "";
        while ((inputLine = reader.readLine()) != null) {
            System.out.println(inputLine);
        }

        var numbers = List.of(1, 2, "three");
        System.out.println(numbers.getClass());

        var list = new ArrayList<String>();
        System.out.println(list.getClass());

    }

}
