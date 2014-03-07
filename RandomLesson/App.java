public class App {
	
	public static void main (String[] args) {
		
        // The pattern for generating a range of ranom numbers looks like so.

        // (Math.random() * (Min - Max + 1)) + Min

        // Here's what a basic ranom number looks like.
		for (int i = 0; i < 100; i++) {
			System.out.println( Math.random() );
		}

        // AS you can see they're all fractions or could be used like a percentaged.

        // This means that when you multiply this number by your maxium you can 
        // get upto 99 percent of the maximum but never the max.

        // Here get numbers upto 10.
        for (int i = 0; i < 100; i++) {
            System.out.println( Math.random() * 10 );
        }

        // What if we want to include the maxium?

        // For that we must add 1 to the number.
        for (int i = 0; i < 100; i++) {
            System.out.println( Math.random() * 10 + 1 );
        }

        // But now we created a new problem because we'll go over our maximum.

        // We can either round down the decimal using Math.floor() if we need 
        // to retain a double for some reason.
        for (int i = 0; i < 100; i++) {
            System.out.println( Math.floor(Math.random() * 10 + 1) );
        }

        // Or we can simply cast the double to an integer.
        for (int i = 0; i < 100; i++) {
            System.out.println( (int) (Math.random() * 10 + 1) );
        }

        // At this point we have a random between 1 - 10 including 10. We 
        // also know how to remove the decimal in a double using Math.floor 
        // or to change the random double into an integer.

        // Now what if we have a minimum. Like if we want a random between
        // 5 and 10.

        // You first might try to simply add the minimum to all the numbers.
        for (int i = 0; i < 100; i++) {
            System.out.println( (Math.random() * 10 + 1) + 5 );
        }

        // But, now you're going over the maximum.

        // The remedy is to subtract the minimum from the maximum. This way 
        // you only generate numbers that can have the minimum added to them 
        // without going over the maximum.
        for (int i = 0; i < 100; i++) {
            System.out.println( (Math.random() * (10 - 5 + 1)) + 5 );
        }

        // Putting it altogether:
        final int MAX = 10;
        final int MIN = 5;
        for (int i = 0; i < 100; i++) {
            System.out.println( (int) (Math.random() * (MAX - MIN + 1)) + MIN );
        }
	}
}