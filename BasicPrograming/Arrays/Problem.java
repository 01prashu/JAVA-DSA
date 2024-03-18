/*
 * 
 * Alice was a brilliant mathematician who had always been fascinated by the intricacies of arrays. She had a knack for solving complex array-related problems, and her colleagues often sought her for advice.

One day, Alice was presented with a particularly challenging problem. She was given a large 2D array of size NxM and tasked with finding a square of size PxP within it. However, this square had to meet a special requirement - all its elements had to be greater than or equal to P.

You need to help Alice to find the maximum possible value of P from a given 2D array.

Input Format

The first line will contain an integer N, denoting the number of rows.
The next line will contain an integer M, denoting the number of columns.
Next N lines will contain space-separated M integers, denoting the element of an array.
Constraints

1<=N*M<=106
1<=array[i]<=105
Output Format

Return the maximum value of P.
Evaluation Parameters

Sample Input1

3
4
1 2 3 4
5 6 7 8
9 2 3 5
Sample Output1

2
Explanation

[﻿1 2 3 4

5 6 7 8

9 2 3 5]

We can choose a 2x2 square where all elements greater and equal to 2 that is:

3 4

7 8

Note we have multiple answers but that is also of 2x2.

Sample Input2

5
5
1 2 3 4 5
5 6 7 8 3
9 2 3 5 7
4 5 6 7 8
3 4 5 6 7
Sample Output2

3
Explanation

[1 2 3 4 5

5 6 7 8 3

9 2 3 5 7

9 2 3 5 8

3 4 5 6 7]

We can choose a 3x3 square where all elements greater and equal to 3 that is:

3 4 5

7 8 3

3 5 7

Note we have multiple answers but that is also of 3x3.


Execution time limit
 */
public class Problem {
    
}
