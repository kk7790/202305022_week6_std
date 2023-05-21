package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HashMakeTest {

    @Test
    void hashAddTest() {
        HashMake hashmake = new HashMake();
        hashmake.saveData(1, "lee");
        hashmake.saveData(2, "aa");
        hashmake.saveData(3, "lsse");
        List<Objects> readResult = new ArrayList<>();
        readResult = (List<Objects>) hashmake.readAllData();
        System.out.println(readResult);
    }

    @Test
    void hashKeyCheck() {
        HashMake hashmake = new HashMake();
        hashmake.saveData(1, "lee");
        hashmake.saveData(2, "aa");
        hashmake.saveData(3, "lsse");

        Object returnvalue = hashmake.readValue(2);
        assertEquals(returnvalue, "aa");
    }

    @Test
    void hashDelete() {
        HashMake hashmake = new HashMake();
        hashmake.saveData(1, "lee");
        hashmake.saveData(2, "aa");
        hashmake.saveData(3, "lsse");

        List<Objects> readResult = new ArrayList<>();
        hashmake.deleteData(2);
        readResult = (List<Objects>) hashmake.readAllData();
        System.out.println(readResult);

    }
}