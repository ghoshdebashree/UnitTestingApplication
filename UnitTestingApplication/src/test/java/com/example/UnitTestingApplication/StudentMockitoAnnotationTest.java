package com.example.UnitTestingApplication;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StudentMockitoAnnotationTest {

    @Mock
    StudentDAO studentDAOMock;

    @InjectMocks
    StudentService studentService;

    @Test
    void testFindTotal(){
        when(studentDAOMock.getMarks()).thenReturn(new int[] { 5, 5, 5});
                assertEquals(15,studentService.findTotal());
    }
    @Test
    void testFindEmpty(){
        when(studentDAOMock.getMarks()).thenReturn(new int[] {});
            assertEquals(0, studentService.findTotal());
    }


}
