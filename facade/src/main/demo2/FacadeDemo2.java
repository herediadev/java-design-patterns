package main.demo2;

import java.util.List;

public class FacadeDemo2 {
    public static void main(String[] args) {
        JdbcFacade jdbcFacade = new JdbcFacade();
        jdbcFacade.createTable();
        jdbcFacade.insertIntoTable();
        List<Address> addresses = jdbcFacade.getAddresses();
        addresses.forEach(System.out::println);
    }
}
