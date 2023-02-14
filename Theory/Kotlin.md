
- [Kotlin docs](https://kotlinlang.org/docs/control-flow.html#if-expression)
- [Exercices](https://leetcode.com/problemset/all/)
- [Kotlin command-line compiler](https://kotlinlang.org/docs/command-line.html)

## Program entry point
---

<pre>
	<code>
		fun main() {
		    println("Hello world!")
		}
	</code>
	</pre>

## Print to the standard output
---
- `print` prints its argument to the standard output.

<pre>
	<code>
		print("Hello ")
		print("world!")
	</code>
</pre>

- `println` prints its arguments and adds a line break, so that the next thing you print appears on the next line.

<pre>
	<code>
		println("Hello world!")
		println(42)
	</code>
</pre>


## Variables
--- 

Variables that can be reassigned use the `var` keyword.
<pre>
	<code>
		var x = 5 // `Int` type is inferred
		x += 1
	</code>
</pre>

## Constantes
---
Read-only local variables are defined using the keyword `val`. They can be assigned a value only once.
<pre>
	<code>
		val a: Int = 1  // immediate assignment
		val b = 2   //  'Int' type is inferred
		val c: Int  // Type required when no initializer is provided
		c = 3       // deferred assignment
	</code>
</pre>

## Sentencia IF
---
In Kotlin, `if` is an expression: it returns a value. Therefore, there is no ternary operator (`condition ? then : else`) because ordinary `if` works fine in this role.
<pre>
	<code>
		fun maxOf(a: Int, b: Int): Int {
		    if (a > b) {
		        return a
		    } else {
		        return b
		    }
		}
	</code>
</pre>
   -  More info: [If expression](https://kotlinlang.org/docs/control-flow.html#if-expression)


## Sentencia WHEN
---

<pre>
	<code>
		fun describe(obj: Any): String =
		    when (obj) {
		        1          -> "One"
		        "Hello"    -> "Greeting"
		        is Long    -> "Long"
		        !is String -> "Not a string"
		        else       -> "Unknown"
		    }
	</code>
</pre>

## Rangos
---
Check if a number is within a range using `in` operator.

- Check if a number is out of range.
<pre>
	<code>
		val x = 10
		val y = 9
		if (x in 1..y+1) {
		    println("fits in range")
		}
	</code>
</pre>
   -  More Info: [Ranges and progressions](https://kotlinlang.org/docs/control-flow.html#if-expression)

## Arrays
---
## Bucles For
--- 
The `for` loop iterates through anything that provides an iterator. This is equivalent to the `foreach` loop in languages like C#. The syntax of `for` is the following:

<pre>
	<code>
		for (item in collection) print(item)
	</code>
</pre>
   -  Example(Range expressions):
		   - From 0 to 10
<pre>
	<code>
		for (i in 0..10) {
		    println(i)
		}
	</code>
</pre>
		 - From 1 to 10
<pre>
	<code>
		for (i in 0 until 10) {
		    println(i)
		}
	</code>
</pre>
		 - Increase
<pre>
	<code>
		for (i in 0..10 step 2) {
		    println(i)
		}
	</code>
</pre>
		 - Countdown
<pre>
	<code>
		for (i in 10 downTo 0 ) {
		    println(i)
		}
	</code>
</pre>

   -  Example(Array):
<pre>
	<code>
		for (i in array.indices) {
		    println(array[i])
		}
	</code>
</pre>
or 
<pre>
	<code>
		val items = listOf("apple", "banana", "kiwifruit")
		for (item in items) {
		    println(item)
		}
	</code>
</pre>

   -  More info: [For loops](https://kotlinlang.org/docs/control-flow.html#for-loops)

## Bucles While
---
`while` and `do-while` loops execute their body continuously while their condition is satisfied. The difference between them is the condition checking time:

-   `while` checks the condition and, if it's satisfied, executes the body and then returns to the condition check.
<pre>
	<code>
		while (x > 0) {
		    x++ / x += 1
		}
	</code>
</pre>

-   `do-while` executes the body and then checks the condition. If it's satisfied, the loop repeats. So, the body of `do-while` executes at least once regardless of the condition.
<pre>
	<code>
		do {
		    val y = retrieveData()
		} while (y != null) // y is visible here!
	</code>
</pre>

- More info: [While loops](https://kotlinlang.org/docs/control-flow.html#while-loops)
