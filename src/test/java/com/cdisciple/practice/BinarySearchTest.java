package com.cdisciple.practice;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BinarySearchTest {
    @InjectMocks
    BinarySearch binarySearch;


    @Test
    void testBinarySearch(){
        int[] array = {1,2,3,4,5,6,7};
        int target = 4;
        int answer = binarySearch.search(array, target);
        assertEquals(3, answer);

    }
    @Test
    void testBinarySearch_TargetNotFound(){
        int[] array = {1,2,3,4,5,6,7,8};
        int target = 9;
        int answer = binarySearch.search(array, target);
        assertEquals(-1, answer);
    }
}
