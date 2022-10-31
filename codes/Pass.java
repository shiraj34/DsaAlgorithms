public class MultiplyMatrices {

    public static void main(String[] args) {
        int r1 = 2, c1 = 3;
        int r2 = 3, c2 = 2;
        int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
        int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };

        // Mutliplying Two matrices
        int[][] product = multiplyMatrices(firstMatrix, secondMatrix, r1, c1, c2);

        // Displaying the result
        displayProduct(product);
    }

    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix, int r1, int c1, int c2) {
        int[][] product = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        return product;
    }

    public static void displayProduct(int[][] product) {
        System.out.println("Product of two matrices is: ");
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
Output

Product of two matrices is:
24    29    
6    25    
In the above program, there are two functions:

multiplyMatrices() which multiplies the two given matrices and returns the product matrix
displayProduct() which displays the output of the product matrix on the screen.
The multiplication takes place as:

|-    (a11 x b11) + (a12 x b21) + (a13 x b31)    (a11 x b12) + (a12 x b22) + (a13 x b32)    -|
|_    (a21 x b11) + (a22 x b21) + (a23 x b31)    (a21 x b12) + (a22 x b22) + (a23 x b32)    _|
In our example, it takes place as:

|-    (3 x 2) + (-2 x -9) + (5 x 0) = 24    (3 x 3) + (-2 x 0) + (5 x 4) = 29    -|
|_    (3 x 2) + ( 0 x -9) + (4 x 0) = 6    (3 x 3) + ( 0 x 0) + (4 x 4) = 25    _|
 

Share on:
Did you find this article helpful?

Related Examples
Java Example

Multiply Two Matrix Using Multi-dimensional Arrays

Java Example

Add Two Matrix Using Multi-dimensional Arrays

Java Example

Multiply two Floating Point Numbers

Java Example

Find Transpose of a Matrix


Join our newsletter for the latest updates.
Enter Email Address*
Join


Tutorials
Python 3 Tutorial
JavaScript Tutorial
SQL Tutorial
C Tutorial
Java Tutorial
Kotlin Tutorial
C++ Tutorial
Swift Tutorial
C# Tutorial
Go Tutorial
DSA Tutorial
Examples
Python Examples
JavaScript Examples
C Examples
Java Examples
Kotlin Examples
C++ Examples
Company
About
Advertising
Privacy Policy
Terms & Conditions
Contact
Blog
Youtube
Apps
Learn Python
Learn C Programming
Learn Java
© Parewa Labs Pvt. Ltd. All rights reserved.

   
