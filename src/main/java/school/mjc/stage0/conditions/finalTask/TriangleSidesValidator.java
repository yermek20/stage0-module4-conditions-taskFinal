package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        double a = firstSide;
        double b = secondSide;
        double c = thirdSide;
        if (a + b <= c || a + c <= b || b + c <= a)
            System.out.println("it's not a triangle");
        else
            System.out.println("this is a valid triangle");
    }
}
