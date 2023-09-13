package com.example.tst.tests.boot;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="/testContext.xml")
class RecommenderImplementationXmlConfigTest {
 
    @Autowired
    private RecommenderImplementation recommenderImpl;
 
    @Test
    void testRecommendMovies() {
        assertArrayEquals(new String[] {"Finding Nemo", "Ice Age", "Toy Story"},
                                recommenderImpl.recommendMovies("Finding Nemo"));
    }
}