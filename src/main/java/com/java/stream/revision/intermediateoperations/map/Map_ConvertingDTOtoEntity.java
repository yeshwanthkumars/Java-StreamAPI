package com.java.stream.revision.intermediateoperations.map;

import java.util.Arrays;
import java.util.List;

public class Map_ConvertingDTOtoEntity {

    public static void main(String[] args) {

        List<PersonDTO> person = Arrays.asList(
                  new PersonDTO(1, "Yeshwanth")
                , new PersonDTO(2,"Vishal")
                , new PersonDTO(3,"Gokul"));

        person.stream()
                .map(emp -> new Person(emp.getId(),emp.getName()))
                .forEach(System.out::println);

    }
}
