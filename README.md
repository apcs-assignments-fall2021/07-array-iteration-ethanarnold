# Array Iteration

In this assignment, you'll be writing three methods to iterate through arrays

The first method is reverse(). This method takes an array of integers as input, and returns an array of integers containing the elements in the original array in reversed order. The method has the following signature: public static int[] reverse(int[] arr) {}

The second method is secondLargest(). This method takes an array of integers as input, and returns the second largest number in an array. You may assume the array contains at least 2 values. The method has the following signature: public static int secondLargest(int[] arr) {}

The third method is spellCheck(). This method is given a word, and it checks to see if it was spelled correctly. To be considered as spelling correctly, it has to appear in a set array of Strings that is included in the code. If it doesn't show up in this dictionary array, it is not considered as being spelt correctly, even if it's actually a properly spelled English word. The method has the following signature: public static boolean spellCheck(String word) {} 

You don't need to include a Scanner in your main method. However, your main method should contain some code where you call your three functions to test that they work properly. 

<br />
<br />

Add code to [MyMain.java](src/main/java/MyMain.java) to do the desired thing.

## Run your code with:
The easiest way to run your code is to press the play button in [MyMain.java](src/main/java/MyMain.java).

However, you can also run your code by typing the following into the Terminal.

```shell script
make run
```

Alternatively, if that doesn't work, use:

```shell script
./gradlew run
```

## Run your tests with:
The easiest way to run your code is to press the play button in [MyTests.java](src/test/java/MyTests.java).

However, you can also run your code by typing the following into the Terminal.

```shell script
make test
```

Alternatively, if that doesn't work, use:

```shell script
./gradlew test
```