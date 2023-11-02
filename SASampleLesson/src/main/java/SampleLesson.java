public class SampleLesson {

    // This first function calculates the perimeter of a rectangle. It takes in two integer inputs, marked as "int"
    // named "baseLength" and "heightLength" and will produce an integer result.
    // Ignoring the "public" and "static" keyword for now, the first "int" before "calculatePerimeter" sets the kind of
    // data the function will send when it completes. "calculatePerimeter" is the name of the function and will be what
    // we type when we want the function to activate. The best function names are descriptive without being too lengthy.
    // Inside the parentheses are the function parameters, the information the function needs to operate. Each parameter
    // has its data type declared, in the case of both parameters "int", and each parameter is given a name that can be
    // used in the function,
    public int calculatePerimeter(int baseLength, int heightLength){

        // Here inside the function, the information given to the function initially can be accessed using the names
        // given in the parentheses above. We can use the names to declare new "variables", pieces of data that we can
        // create and operate on.

        // Let's declare some new variables now. Every variable needs (at least) four things:
            // 1. A datatype
            // 2. A name
            // 3. A value
            // 4. A semicolon (;) at the end of the line
        // Let's declare a new integer variable called "x" and set its value equal to the baseLength variable above:
        int x = baseLength;
        // NOTE: If any of the four elements above are missing, the program will fail since the compiler, the
        // process that runs our program, won't understand what were trying to do.
        // NOTE: If we try to assign an int variable to a value that isn't an int, or vice versa, the program will fail
        // to compile e.g., int x = "banana" will break the program.

        // Now you declare one more integer variable called "y" with value equal to heightLength. Remember the four
        // necessary components!
        int y = heightLength; // (This line would be written by the student)

        // Great! We have two new handy variables "x" and "y". With these we can calculate the perimeter. The formula
        // for the perimeter of a rectangle is "2x" + "2y". But how do we write this in java?

        // Each mathematical operation in Java has its own syntax or way of being written. In each case, the result can
        // be assigned to a variable or used in a larger operation, but it can't be done in isolation.

        // Addition uses the + character:
        int sum = 2 + 2;
        // Subtraction uses the - character:
        int diff = 2 - 2;
        // Multiplication uses the * character:
        int prod = 2 * 2;
        // And Division uses the / character:
        int quot = 2 / 2;

        // If we scroll down to the main method at the bottom of the page, we can see these calculations in action.

        // Back to our perimeter calculator, we've declared x and y as the variables we're going to use in our formula:
        // 2x + 2y. How should we write out this formula using the operation syntax above? Remember that we need to
        // declare a variable to set the result equal to!

        int perimeter = 2 * x + 2 * y; // (This line would be written by the student)

        // With this variable we have our answer! Below we print the answer alongside a "string" message that will make
        // the results easier to interpret in the console. You should also "return" the value meaning that the result
        // will be accessible wherever the function was initially activated. You can do this my simply writing
        // "return *variableName*;"

        // Note that when adding a number (perimeter) to a string ("The perimeter is: "), Java automatically converts
        // the number into a string form.
        // System.out.println("The perimeter is: " + perimeter);
        return perimeter; // (This line would be written by the student)

        // In the main method, you'll also want to add a function "call". This will run the code contained in this
        // function. The syntax for a function call is this.*functionName*(parameter1, parameter2, ...); If you try
        // to call a function that doesn't exist, or give a function the incorrect number or type of parameters,
        // IntelliJ will let you know!
    }
    // Using the strategies learned creating our calculatePerimeter method, try to write a function to calculate the
    // area of a triangle. The formula is 1/2 x base x height.
    public double calculateTriangleArea(int baseLength, int heightLength){
       int x = baseLength; // (This line would be written by the student)
       int y = heightLength; // (This line would be written by the student)

       // For this function, we're going to need a new data type. The int data type only allows whole numbers, and the
       // formula for a triangle's area can produce a decimal. In Java, the "double" data type can be used to handle
       // decimal and integer numbers alike! Using "double" as the data type, declare a variable for the area, print,
       // and return the result. Note that the function definition already has the correct type for the return value.
       double area = 0.5 * x * y; // (This line would be written by the student)
        // System.out.println("The triangle area is: " + area);
       return area;
    }

    // Try a few more exercises on your own!
    public int calculateSquareArea(int sideLength){
        // System.out.println("The square area is: " + sideLength * sideLength);
        return sideLength * sideLength; // (This line would be written by the student)
    }
    // Bonus points if you use a method we already made within this function!
    public double calculateTriangularPrismVolume(int baseTriangleWidth, int baseTriangleHeight, int prismHeight){
        // System.out.println("The triangular prism volume is: " + this.calculateTriangleArea(baseTriangleWidth,
               // baseTriangleHeight) * prismHeight); // (This line would be written by the student)
        return calculateTriangleArea(baseTriangleWidth, baseTriangleHeight)
                * prismHeight; // (This line would be written by the student)
    }
    // Other mathematical operations are listed here, ask your teacher if you have questions!:
        // Exponent: Math.pow(double base, double exponent)
        // Square Root: Math.sqrt(double val)
        // Pi: Math.PI

    // Formula: V = (4/3)πr^3
    public double calculateSphereVolume(double radius){
        // System.out.println("The sphere volume is: " + (4/3)*Math.PI*Math.pow(radius, 3));
        return 4*Math.PI*Math.pow(radius, 3)/3; // (This line would be written by the student)
    }
    // Formula: V = (1/3)*πr^3*h
    public double calculateConeVolume(double radius, double height){
        double baseVolume=radius*radius*Math.PI; // (This line would be written by the student)
        // System.out.println("The cone volume is " + baseVolume*height/3);
        return baseVolume*height/3; // (This line would be written by the student)
    }
    public void main(String[] args){
        // Addition uses the + character:
        int sum = 2 + 2;
        // Subtraction uses the - character:
        int diff = 2 - 2;
        // Multiplication uses the * character:
        int prod = 2 * 2;
        // And Division uses the / character:
        int quot = 2 / 2;

        // To see our program work, we use this function to print results:
        System.out.println();
        // Don't worry too much about what these words mean for now, just know this is how you see the info your program
        // is working with. Like so!
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(prod);
        System.out.println(quot);

        // In IntelliJ, you can press the green triangle on the left where the main function is declared to run the
        // program, or you can click the green triangle on the top bar. Click either to see our operations at work!

        // Let's go back to our calculatorPerimeter function

        // Write your function calls below using any numerical values for the parameters
        this.calculatePerimeter(10,5); // (This line would be written by the student)
        this.calculateTriangleArea(5, 7); // (This line would be written by the student)
        this.calculateSquareArea(9); // (This line would be written by the student)
        this.calculateTriangularPrismVolume
                (2,4,5); // (This line would be written by the student)
        this.calculateSphereVolume(5); // (This line would be written by the student)
        this.calculateConeVolume(5, 10); // (This line would be written by the student)
    }
}
