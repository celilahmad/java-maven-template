package app.warmUp10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListNewTest {

    ArrayListNew a1 = new ArrayListNew();

    @BeforeEach
    void setUp() {
    }

    @Test
    void combined() {
       List expected =  a1.combined(Arrays.asList(1,2,4,6,8,2,4,8), Arrays.asList(5,8,9,11,15,4,5,6,8,1,2));
       List actual = a1.combined(Arrays.asList(1,2,4,6,8,2), Arrays.asList(5,9,11,15));
       assertEquals(expected, actual);


    }
}