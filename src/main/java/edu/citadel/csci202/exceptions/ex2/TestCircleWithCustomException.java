package edu.citadel.csci202.exceptions.ex2;

public class TestCircleWithCustomException {
    public static void main(String[] args) {
        try {
            new CircleWithCustomException(5);
            new CircleWithCustomException(-5);
            new CircleWithCustomException(0);
        } catch (InvalidRadiusException ex) {
            System.err.println(ex.getMessage());
        }

        System.out.println("Number of objects created: " +
                CircleWithCustomException.getNumberOfObjects());
    }
}
