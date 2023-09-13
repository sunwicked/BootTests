package com.example.tst.tests.boot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest  // Loads the complete context as in production // For unit test excessive
//1. Launch context
class RecommenderImplementationSpringBootTest {

    @Autowired
    //2. Load bean from context
    private RecommenderImplementation recommenderImpl;

    @Test
    void testRecommendMovies() {
        //3. Call method on the bean
        //4. Check if the result is as expected
        assertArrayEquals(new String[] {"Finding Nemo", "Ice Age", "Toy Story"},
                recommenderImpl.recommendMovies("Finding Dory"));
    }
}