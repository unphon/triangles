package com.unphon.triangles.model;

import junit.framework.TestCase;

import java.util.Arrays;

public class TriangleTest extends TestCase {

    public void testScalene() throws Exception {
        Triangle triangle = new Triangle(1.0, 2.0, 3.0);
        assertEquals(TriangleType.SCALENE, triangle.getType());
    }

    public void testIsosceles() throws Exception {
        Triangle triangle = new Triangle(10.5, 10.5, 15.5);
        assertEquals(TriangleType.ISOSCELES, triangle.getType());
    }

    public void testEquilateral() throws Exception {
        Triangle triangle = new Triangle(50.8, 50.8, 50.8);
        assertEquals(TriangleType.EQUILATERAL, triangle.getType());
    }

    public void testTriangle() throws Exception {
        Triangle triangle = new Triangle(0, 0, 0);
        assertTrue(Arrays.asList(TriangleType.values()).contains(triangle.getType()));
    }

}