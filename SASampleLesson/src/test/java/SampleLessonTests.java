import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class SampleLessonTests {
    // Note: In all below unit tests, edge cases involving zeroes, negative numbers, and inappropriate inputs would be
    // included in testing. Given this is an introductory lesson, these tests have been intentionally excluded
    @Test
    public void calculatePerimeter(){
        SampleLesson sl = new SampleLesson();
        int res1 = sl.calculatePerimeter(1, 2);
        Assertions.assertEquals(6, res1);
        int res2 = sl.calculatePerimeter(0, 5);
        Assertions.assertEquals(10, res2);
        int res3 = sl.calculatePerimeter(0, 0);
        Assertions.assertEquals(0, res3);
    }
    @Test
    public void calculateTriangleArea(){
        SampleLesson sl = new SampleLesson();
        double res1 = sl.calculateTriangleArea(2, 3);
        Assertions.assertEquals(3, res1);
        double res2 = sl.calculateTriangleArea(0, 100);
        Assertions.assertEquals(0, res2);
        double res3 = sl.calculateTriangleArea(5, 3);
        Assertions.assertEquals(7.5, res3);
    }
    @Test
    public void calculateSquareArea(){
        SampleLesson sl = new SampleLesson();
        int res1 = sl.calculateSquareArea(10);
        Assertions.assertEquals(100, res1);
        int res2 = sl.calculateSquareArea(0);
        Assertions.assertEquals(0, res2);
        int res3 = sl.calculateSquareArea(7);
        Assertions.assertEquals(49, res3);
    }
    @Test
    public void calculateTriangularPrismVolume(){
        SampleLesson sl = new SampleLesson();
        double res1 = sl.calculateTriangularPrismVolume(1,2,3);
        Assertions.assertEquals(3, res1);
        double res2 = sl.calculateTriangularPrismVolume(0,2,3);
        Assertions.assertEquals(0, res2);
        double res3 = sl.calculateTriangularPrismVolume(5,7,2);
        Assertions.assertEquals(35, res3);
    }
    @Test
    public void calculateSphereVolume(){
        SampleLesson sl = new SampleLesson();
        double res1 = sl.calculateSphereVolume(1);
        Assertions.assertEquals(4*Math.PI/3, res1);
        double res2 = sl.calculateSphereVolume(5.5);
        Assertions.assertTrue(res2 - 4*Math.PI/3*166.375 < 0.0000001);
        double res3 = sl.calculateSphereVolume(10);
        Assertions.assertEquals(4000*Math.PI/3, res3);
    }
    @Test
    public void calculateConeVolume(){
        SampleLesson sl = new SampleLesson();
        double res1 = sl.calculateConeVolume(1, 1);
        Assertions.assertEquals(Math.PI/3, res1);
        double res2 = sl.calculateConeVolume(10, 5);
        Assertions.assertEquals(500*Math.PI/3, res2);
        double res3 = sl.calculateConeVolume(0, 10000000);
        Assertions.assertEquals(0, res3);
    }
}
