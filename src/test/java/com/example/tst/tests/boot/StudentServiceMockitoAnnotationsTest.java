package com.example.tst.tests.boot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.example.tst.tests.boot.daos.StudentDao;
import com.example.tst.tests.boot.services.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class StudentServiceMockitoAnnotationsTest {

	@Mock
	StudentDao studentDaoMock;
	
	@InjectMocks
	StudentService studentService;
	
	@Test
	void testFindTotal() {
		when(studentDaoMock.getMarks()).thenReturn(new int[] {15, 20, 5});
		assertEquals(40, studentService.findTotal());
	}

	@Test
	void testFindTotal_EmptyArray() {
		when(studentDaoMock.getMarks()).thenReturn(new int[] {});
		assertEquals(0, studentService.findTotal());
	}
}
