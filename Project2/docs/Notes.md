Gather a group of floating point numbers

Sum  and average them

display the results

Input:
  Multiple floating point numbers. - Using showInputDialog()

  	Sentinel-Controlled-Loop for input (999).



Calculation:
  Sum, Average, of the numbers.

Output:

1. Count
2. Sum
3. Average
4. Warning if sum > 100

Seperate Methods:

1. BenjaminBunkP2.input()
2. BenjaminBunkP2.sum()
3. BenjaminBunkP2.average()
4. BenjaminBunkP2.displayResults()

Notes:

1. Use floating point math.
2. Test plan include:
	1. Zero
	2. Negative Number
3. Sentinel value 999
4. Call each method from main
5. Use showInputDialog and showMessageDialog methods.

Test Data:

Input Data, Expected Output, Actual Output, pass/fail results.

2, 2, 3, 3, 999 = 2.5 (Normal)
	Count: 4, Sum: 10, Average: 2.5

-1, -1, 0, 1, 1, 999 = 0 (Lower Boundary)
	Count: 5, Sum: 0, Average: 0

50, 25, 25, 999 = 33.33 (Upper Boundary)
	Count: 3, Sum: 100, Average: 33.333333333333336

998, 998, 998, 999 = 998 (Error Checking)
	Values have exceeded a sum of 100.
