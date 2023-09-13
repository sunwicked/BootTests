package com.example.tst.tests.boot;

import com.example.tst.tests.boot.services.StudentService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentServiceStubTest {
    @Test
    void testFindTotal() {
        StudentDaoStub studentStub = new StudentDaoStub();
        StudentService studentService = new StudentService(studentStub);
        int total = studentService.findTotal();
        assertEquals(40, total);
    }
}