Enter 10 numbers (double precision)

into an array

Sort the array lowest to highest
	Use Arrays.sort()

Display the array

Test case should include numbers:
-.001 -.0011 0.0 .001 .0011 .00111 .0010001 -999 999 999.00001

999.00001 999 -999 .0010001 .00111 .0011 .001 0.0 -.0011 -.001


private static final int MAX_INPUTS = 10;

main () {
	double[] numbers;

	numbers = getInput(MAX_INPUTS);

	sortArray(numbers);

	output(numbers);
}

double[] getInput (int numInputs) {
  double[] numbers = new double[numInputs];

  return numbers;
}

void sortArray (double[] numbers) {
	Arrays.sort(numbers);
}

void output (double[] numbers) {

}