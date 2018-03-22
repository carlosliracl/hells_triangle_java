# Hells Triangle Challange - Java Solution
An implementation to solve hells triangle problem with java

## The Challenge

Given a triangle of numbers, find the maximum total from top to bottom Example:

``   6``
``  3 5``
`` 9 7 1``
``4 6 8 4``

In this triangle the maximum total is:  6 + 5 + 7 + 8 = 26

An element can only be summed with one of the two nearest elements in the next row. 
For example: The element 3 in the 2nd row can only be summed with 9 and 7, but not with 1.

Your code will receive an (multidimensional) array as input. The triangle from above would be:
example = [[6],[3,5],[9,7,1],[4,6,8,4]]

## Getting Started

[Java](http://www.oracle.com/technetwork/pt/java/javase/downloads/index.html) and [Maven](https://maven.apache.org/) are required.


```
> # Clone this repository
> $ git clone https://github.com/carlosliracl/hells_triangle_java.git
> $ cd hells_triangle_java
> # To run the tests
> $ mvn test 
```

## Solution

The first attempt was transform the triangles array in a binary tree, to be able to navigate through the nodes using a recursive funcion, but the process of create a tree was expenssive due iterate over the triangle multiple times and create a bunch of Node objects.

The second aproach was just iterate over the triangle recursivelly without creating aditional objects. In this case the result was archieved on 50% of the time the first aproach.

I choosed Java because it's one of the languages ​​I feel most comfortable using