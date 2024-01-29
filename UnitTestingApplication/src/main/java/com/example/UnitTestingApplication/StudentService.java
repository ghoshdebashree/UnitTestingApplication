package com.example.UnitTestingApplication;

public class StudentService {
    private StudentDAO studentDAO;
    public StudentService(StudentDAO studentDAO){
        super();
        this.studentDAO = studentDAO;
    }
    int findTotal(){
        int sum = 0;
        int[] arr = studentDAO.getMarks();
        for(Integer i : arr){
            sum += i;
        }
        return sum;
    }

}
