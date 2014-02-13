4.2 While loop
===

The boolean expression that determines if the loop will continue is called the loop-continuation-condition. This must be in parentheses.

The loop's braces can be omitted if 1 or fewer statements exist just like if statements.

Counter Controlled Loops use an expression with a counter.

```java
int count = 0;
 while (count < 1) {
  count++;
}
```

4.2.4 Controlling a loop with a sentinel value
===

A sentinel value is a special value that ends a loop. A loop controlled by a sentinel value is called a sentinel-controlled-loop.

Example:

```java
while (value != 0) {
	value = input.nextInt();
}
```

Never use floating point values for comparison in a loop. Floating points are an approximation in some cases and could cause iradic behavior.

4.2.5 Input and Output redirections
===

Input redirection is when input is taken from a file instead of from a keyboard. This can be done with a simple command:
```bash
java SentinelValue < input.txt
```

The file should be a space delimited list.

The output can also be redirected to a file in the same way:
```bash
java SentinelValue > output.txt
```

Both can happen at once as well:
```bash
java SentinelValue < input.txt > output.txt
```

4.4 The foor loop
===

The syntax for a for loop is generally:

```java
for (initial-action; loop-continuation-condition; action-after-each-iteration) {
	// Loop body.
}
```

The initial action always occurs atleast once...this is similar to a do...while. Then the loop continuation condition is checked. Then the body is executed. Then the action after is executed. This is a lot like a finally block in a try...catch.

The action-after-each-iteration part of the for loop can contain a series of statements seperated by a comma. Like this:

```java
for (int i = 0; i < 100; System.out.println("Hi" + i); i++) {}
```

The loop-contiuation-condition may be omitted and if it is, it will be implicitly TRUE.

```java
for (int i = 0; i >= 0; i++)

// is equivalent to

for (int i = 0; TRUE==TRUE ; i++)

// is equivalent to

for (int i = 0; ; i++)
```

4.5 Which loop to use?
===

The for and while loops are pre-test loops.

The do...while loop is a posttest loop.

Any of the three types of loops are interchanable and can be made equivalent.

4.7 Minimizing Numeric Errors
===

Add smaller numbers before bigger numbers to minimize errors.

