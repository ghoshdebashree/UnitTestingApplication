package com.example.UnitTestingApplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {

    @Test
    public void findIndexTest(){
        ArrayMethods arrayMethods = new ArrayMethods();
        int result = arrayMethods.findIndex(new int[] {1,2,3,4}, 3);
        assertEquals(2, result);
    }
    @Test
    public void searchTest(){
        ArrayMethods arrayMethods = new ArrayMethods();
        int result = arrayMethods.findIndex(new int[] {1,2,3,4}, 10);
        assertEquals(-1, result);
    }
    @Test
    public void testSort(){
        fail("Unimplemented method");
    }
    @Test
    public void testfindIndex_indexOutOfBound() {
        ArrayMethods arrayMethods = new ArrayMethods();
        assertThrows(ArrayIndexOutOfBoundsException.class, ()->arrayMethods.printArray(new int[] {1,8,5}, 3));
    }

    @Test
    public void findIndexAllTest(){
        ArrayMethods arrayMethods = new ArrayMethods();
        assertAll(
                () -> assertEquals(2,arrayMethods.findIndex(new int[] {1,3,4,6,}, 4)),
                () -> assertEquals(-1,arrayMethods.findIndex(new int[] {2,4,6,4}, 0)),
                () -> assertEquals(0,arrayMethods.findIndex(new int[] {1,3,5,6,}, 1))
        );

    }
}
