package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        // task1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);

        // task2
        String fullName1 = firstName + " " + middleName + " " + lastName;
        String lowerCaseFry = fullName1.toLowerCase();
        String upperCaseFry = fullName1.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperCaseFry);

        // task3
        List<String> fullName2 = Arrays.asList(
                "Ivan",
                "Ivanovich",
                "Ivanov"
        );
        String peopleString = String.join("; ", fullName2);
        System.out.println("Данные ФИО сотрудника для административного отдела — " + peopleString);

        // task4
        String oldString = "Иванов Семён Семёнович";
        String newString = oldString.replace('ё' , 'е');
        System.out.println("Данные ФИО сотрудника — " + newString);

    }
}
