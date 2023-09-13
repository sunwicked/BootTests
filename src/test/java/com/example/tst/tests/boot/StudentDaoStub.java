package com.example.tst.tests.boot;

import com.example.tst.tests.boot.daos.StudentDao;

class StudentDaoStub extends StudentDao {
    @Override
    public int[] getMarks() {
        return new int[]{15, 20, 5};
    }
}