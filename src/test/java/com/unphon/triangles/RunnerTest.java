package com.unphon.triangles;

import com.unphon.triangles.model.TriangleTest;
import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class RunnerTest extends TestCase {
    public RunnerTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite testSuite = new TestSuite(RunnerTest.class);
        testSuite.addTest(new JUnit4TestAdapter(TriangleTest.class));
        return testSuite;
    }

    public void testApp() {
        assertTrue(true);
    }
}
