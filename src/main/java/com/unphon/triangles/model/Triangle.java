package com.unphon.triangles.model;

import java.util.Arrays;

public class Triangle {

    private double length1;
    private double length2;
    private double length3;

    public Triangle(double length1, double length2, double length3) {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    /*
    Scalene triangle: A triangle with no congruent sides
    Isosceles triangle: A triangle with at least two congruent sides
    Equilateral triangle: A triangle with three congruent sides
    */
    public TriangleType getType() {
        if(length1 == length2 && length2 == length3) {
            return TriangleType.EQUILATERAL;
        }

        double[] sides = {length1, length2, length3};
        Arrays.sort(sides);

        if(sides[0] == sides[1] || sides[1] == sides[2]) {
            return TriangleType.ISOSCELES;
        } else {
            return TriangleType.SCALENE;
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "length1=" + length1 +
                ", length2=" + length2 +
                ", length3=" + length3 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.length1, length1) != 0) return false;
        if (Double.compare(triangle.length2, length2) != 0) return false;
        return Double.compare(triangle.length3, length3) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(length1);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(length2);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(length3);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
