package com.example.tst.tests.boot.services;

import com.example.tst.tests.boot.daos.StudentDao;
import org.springframework.stereotype.Service;

@Service
public class StudentService{

    private StudentDao studentDao;

    public StudentService(StudentDao studentDao) {
        super();
        this.studentDao = studentDao;
    }
   //other methods

    public int findTotal() {
        //fetch student marks from a database
        int[] array = studentDao.getMarks();
 
        int sum = 0;
    
        for(int value : array) {
        sum += value;
        }
        return sum;
    }
}