package main.demo1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class FacadeDemo1 {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http", "www.google.com", 80, "/");

        InputStream inputStream = url.openStream();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String inputLine;

        while ((inputLine = bufferedReader.readLine()) != null) {
            System.out.println(inputLine);
        }
    }
}
