# Simulado 12 — 1Z0-831 Java SE 25 Developer Professional

> 50 questões · 120 minutos · aprovação 68% (34 acertos) · cronometre e não consulte material.
> Questões do tipo *Choose all that apply* só contam se todas as alternativas corretas forem marcadas.

| Tópico | Questões |
|---|--:|
| T1 Data, hora, texto, números e booleanos | 6 |
| T2 Controle de fluxo | 4 |
| T3 Princípios de orientação a objetos | 11 |
| T4 Tratamento de exceções | 4 |
| T5 Arrays e coleções | 5 |
| T6 Streams e expressões lambda | 7 |
| T7 Empacotamento e implantação | 4 |
| T8 Concorrência (multithreading) | 4 |
| T9 E/S (java.io e java.nio.file) | 3 |
| T10 Localização | 2 |

---

## Questão 01

```text
How many of these lines contain a compiler error?

23: double one = Math.pow(1, 2);
24: int two = Math.round(1.0);
25: float three = Math.random();
26: var doubles = new double[] {one, two, three};

A. 0
B. 1
C. 2
D. 3
E. 4
```

## Questão 02

```text
What data type (or types) will allow the following code snippet to compile? (Choose all that apply.)

byte apples = 5;
short oranges = 10;
____ bananas = apples + oranges;

A. int
B. long
C. boolean
D. double
E. short
F. byte
```

## Questão 03

```text
What is true of a module containing a file named module-info.java with the following contents? (Choose all that apply.)

A. module com.food.supplier {}
B. All packages inside the module are automatically exported.
C. No packages inside the module are automatically exported.
D. A main method inside the module can be run.
E. A main method inside the module cannot be run since the class is not exposed.
F. The module-info.java file contains a compiler error.
G. The module-info.java filename is incorrect.
```

## Questão 04

```text
What is the result of the following code?

Comparator<Integer> c1 = (o1, o2) -> o2 - o1;
Comparator<Integer> c2 = Comparator.naturalOrder();
Comparator<Integer> c3 = Comparator.reverseOrder();
 
var list = Arrays.asList(5, 4, 7, 2);
Collections.sort(list,_____________);
Collections.reverse(list);
Collections.reverse(list);
System.out.println(Collections.binarySearch(list, 2));

A. One or more of the comparators can fill in the blank so that the code prints 0.
B. One or more of the comparators can fill in the blank so that the code prints 1.
C. One or more of the comparators can fill in the blank so that the code prints 2.
D. The result is undefined regardless of which comparator is used.
E. A runtime exception is thrown regardless of which comparator is used.
F. The code does not compile.
```

## Questão 05

```text
What is the output of the following snippet, assuming a and b are both 0?

3:  try {
4:     System.out.print(a / b);
5:  } catch (RuntimeException e) {
6:     System.out.print(-1);
7:  } catch (ArithmeticException e) {
8:     System.out.print(0);
9:  } finally {
10:    System.out.print("done");
11: }

A. -1
B. 0
C. done-1
D. done0
E. The code does not compile.
F. An uncaught exception is thrown.
G. None of the above.
```

## Questão 06

```text
How many times is true printed out by this code?

import java.util.function.Predicate;
public class Fantasy {
   public static void scary(String animal) {
      var dino = s -> "dino".equals(animal);
      var dragon = s -> "dragon".equals(animal);
      var combined = dino.or(dragon);
      System.out.println(combined.test(animal));
   }
   public static void main(String[] args) {
      scary("dino");
      scary("dragon");
      scary("unicorn");
   }
}

A. One.
B. Two.
C. Three.
D. The code does not compile.
E. A runtime exception is thrown.
```

## Questão 07

```text
Which answer options represent the order in which the following statements can be assembled into a program that will compile successfully? (Choose all that apply.)

X: class Rabbit {}
Y: import java.util.*;
Z: package animals;

A. X, Y, Z
B. Y, Z, X
C. Z, Y, X
D. Y, X
E. Z, X
F. X, Z
G. None of the above
```

## Questão 08

```text
Fill in the blank: A class that implements _________________ may be in a try-with-resources statement. (Choose all that apply.)

A. AutoCloseable
B. Resource
C. Exception
D. AutomaticResource
E. Closeable
F. RuntimeException
G. Serializable
```

## Questão 09

```text
Which of the following statements about resource bundles are correct? (Choose all that apply.)

A. All keys must be in the same resource bundle to be used.
B. A resource bundle is loaded by calling the new ResourceBundle() constructor.
C. Resource bundle values are always read using the Properties class.
D. Changing the default locale lasts for only a single run of the program.
E. If a resource bundle for a specific locale is requested, then the resource bundle for the default locale will not be used.
F. It is possible to use a resource bundle for a locale without specifying a default locale.
```

## Questão 10

```text
What does the following method print?

11: public void tryAgain(String s) {
12:    try (FileReader r = null, p = new FileReader("")) {
13:       System.out.print("X");
14:       throw new IllegalArgumentException();
15:    } catch (Exception s) {
16:       System.out.print("A");
17:       throw new FileNotFoundException();
18:    } finally {
19:       System.out.print("O");
20:    }
21: }

A. XAO
B. XOA
C. One line of this method contains a compiler error.
D. Two lines of this method contain compiler errors.
E. Three or more lines of this method contain compiler errors.
F. The code compiles, but a NullPointerException is thrown at runtime.
G. None of the above.
```

## Questão 11

```text
Which statements about sealed classes are correct? (Choose all that apply.)

A. A sealed interface restricts which subinterfaces may extend it.
B. A sealed class cannot be indirectly extended by a class that is not listed in its permits clause.
C. A sealed class can be extended by an abstract class.
D. A sealed class can be extended by a subclass that uses the nonsealed modifier.
E. A sealed interface restricts which subclasses may implement it.
F. A sealed class cannot contain any nested subclasses.
G. None of the above.
```

## Questão 12

```text
What is the result of the following code? (Choose all that apply.)

48: var map = Map.of(1,2, 3, 6);
49: var list = List.copyOf(map.entrySet());
50:
51: List<Integer> one = List.of(8, 16, 2);
52: var copy = List.copyOf(one);
53: var copyOfCopy = List.copyOf(copy);
54: var thirdCopy = new ArrayList<>(copyOfCopy);
55:
56: list.replaceAll(x -> x * 2);
57: one.replaceAll(x -> x * 2);
58: thirdCopy.replaceAll(x -> x * 2);
59:
60: System.out.println(thirdCopy);

A. One line fails to compile.
B. Two lines fail to compile.
C. Three lines fail to compile.
D. The code compiles but throws an exception at runtime.
E. If any lines with compiler errors are removed, the code throws an exception at runtime.
F. If any lines with compiler errors are removed, the code prints [16, 32, 4].
G. The code compiles and prints [16, 32, 4] without any changes.
```

## Questão 13

```text
Two commands create artifacts that include smaller versions of the JDK. Which are used to create an .exe file and a directory, respectively?

A. jimage and jlink
B. jimage and jpackage
C. jlink and jimage
D. jlink and jpackage
E. jpackage and jimage
F. jpackage and jlink
```

## Questão 14

```text
What does the following code output?

Function<Integer, Integer> s = a -> a + 4;
Function<Integer, Integer> t = a -> a * 3;
Function<Integer, Integer> c = s.compose(t);
System.out.print(c.apply(1));

A. 7
B. 15
C. The code does not compile because of the data types in the lambda expressions.
D. The code does not compile because of the compose() call.
E. The code does not compile for another reason.
```

## Questão 15

```text
Which of the following statements about methods are true? (Choose all that apply.)

A. Overloaded methods must have the same signature.
B. Overridden methods must have the same signature.
C. Hidden methods must have the same signature.
D. Overloaded methods must have the same return type.
E. Overridden methods must have the same return type.
F. Hidden methods must have the same return type.
```

## Questão 16

```text
Which of the following Java operators can be used with boolean variables? (Choose all that apply.)

A. ==
B. +
C. --
D. !
E. %
F. -
G. Cast with (boolean)
```

## Questão 17

```text
Given the following code snippet and blank lines on p1 and p2, which values guarantee that 1 is printed at runtime? (Choose all that apply.)

var data = List.of(List.of(1, 2),
   List.of(3, 4),
   List.of(5, 6));
data._______________  // p1
   .flatMap(s -> s.stream())
   .________________  // p2
   .ifPresent(System.out::print);

A. stream() on line p1, findFirst() on line p2.
B. stream() on line p1, findAny() on line p2.
C. parallelStream() on line p1, findAny() on line p2.
D. parallelStream() on line p1, findFirst() on line p2.
E. The code does not compile regardless of what is inserted into the blanks.
F. None of the above.
```

## Questão 18

```text
Assuming the current locale uses dollars ($) and the following method is called with a double value of 100_102.2, which of the following values are printed? (Choose all that apply.)

public void print(double t) {
   System.out.print(NumberFormat.getCompactNumberInstance().format(t));
 
   System.out.print(
      NumberFormat.getCompactNumberInstance(
         Locale.getDefault(), Style.SHORT).format(t));
 
   System.out.print(NumberFormat.getCurrencyInstance().format(t));
}

A. 100
B. $100,000.00
C. 100K
D. 100 thousand
E. 100M
F. $100,102.20
G. None of the above
```

## Questão 19

```text
Which of the following data types can be used in a switch expression? (Choose all that apply.)

A. enum
B. int
C. Byte
D. long
E. boolean
F. double
```

## Questão 20

```text
What are possible results of executing the following code? (Choose all that apply.)

public static void main(String[] args) throws IOException {
   String line;
   var c = System.console();
   Writer w = c.writer();
   try (w) {
      if ((line = c.readLine("Enter your name: ")) != null)
         w.append(line);
       w.flush();
   }
}

A. The code runs, but nothing is printed.
B. The code prints what was entered by the user.
C. The code behaves the same if throws IOException is removed.
D. A NullPointerException may be thrown.
E. A NullPointerException will always be thrown.
F. A NullPointerException will never be thrown.
G. The code does not compile.
```

## Questão 21

```text
What is the output of the following code snippet?

3: int temperature = 4;
4: long humidity = -temperature + temperature * 3;
5: if (temperature>=4)
6: if (humidity < 6) System.out.println("Too Low");
7: else System.out.println("Just Right");
8: else System.out.println("Too High");

A. Too Low
B. Just Right
C. Too High
D. A NullPointerException is thrown at runtime.
E. The code will not compile because of line 7.
F. The code will not compile because of line 8.
```

## Questão 22

```text
Which of these array declarations are not legal? (Choose all that apply.)

A. int[][] scores = new int[5][];
B. Object[][][] cubbies = new Object[3][0][5];
C. String beans[] = new beans[6];
D. java.util.Date[] dates[] = new java.util.Date[2][];
E. int[][] types = new int[];
F. int[][] java = new int[][];
```

## Questão 23

```text
What is the output of the following program?

1: interface Aquatic {
2:    int getNumOfGills(int p);
3: }
4: public class ClownFish implements Aquatic {
5:    String getNumOfGills() { return "14"; }
6:    int getNumOfGills(int input) { return 15; }
7:    public static void main(String[] args) {
8:       System.out.println(new ClownFish().getNumOfGills(-1));
9: } }

A. 14
B. 15
C. The code will not compile because of line 4.
D. The code will not compile because of line 5.
E. The code will not compile because of line 6.
F. None of the above.
```

## Questão 24

```text
Which of the following are true given this declaration? (Choose all that apply.)

var is = IntStream.empty();

A. is.average() returns the type int.
B. is.average() returns the type OptionalInt.
C. is.findAny() returns the type int.
D. is.findAny() returns the type OptionalInt.
E. is.sum() returns the type int.
F. is.sum() returns the type OptionalInt.
```

## Questão 25

```text
What are some possible results of executing the following code? (Choose all that apply.)

var x = Path.of("/animals/fluffy/..");
Files.walk(x.toRealPath().getParent())      // u1
   .map(p -> p.toAbsolutePath().toString()) // u2
   .filter(s -> s.endsWith(".java"))
   .forEach(System.out::println);

A. It prints some files in the root directory.
B. It prints all files in the root directory.
C. FileSystemLoopException is thrown at runtime.
D. Another exception is thrown at runtime.
E. The code will not compile because of line u1.
F. The code will not compile because of line u2.
```

## Questão 26

```text
Given the following, select the statements that can be inserted into the blank line so that the code will compile and print true at runtime? (Choose all that apply.)

record Walrus(List<String> diet) {}
record Exhibit(Walrus animal, String location) {}
 
var e = new Exhibit(new Walrus(List.of("Wally")), "Artic");
System.out.print(e instanceof _____________);

A. Exhibit(Walrus(List<Integer> z), Object a)
B. Exhibit(Walrus(List m), Object n)
C. Object w && w.animal().diet().size() == 0
D. Exhibit(Walrus(var i), var i)
E. Exhibit(var p, var q)
F. Exhibit(List<?> g, var h)
G. Exhibit(var x, CharSequence y)
H. Exhibit(Walrus(null), var v)
I. None of the above
```

## Questão 27

```text
Which of the following is equivalent to this code?

A. UnaryOperator<Integer> u = x -> x * x;
B. BiFunction<Integer> f = x -> x*x;
C. BiFunction<Integer, Integer> f = x -> x*x;
D. BinaryOperator<Integer, Integer> f = x -> x*x;
E. Function<Integer> f = x -> x*x;
F. Function<Integer, Integer> f = x -> x*x;
G. None of the above
```

## Questão 28

```text
Assume that monkey.txt is a file that exists in the current working directory. Which statement about the following code snippet is correct?

Files.move(Path.of("monkey.txt"), Path.of("/animals"),
   StandardCopyOption.ATOMIC_MOVE);

A. If /animals/monkey.txt exists, it will be overwritten at runtime.
B. If /animals exists as an empty directory, /animals/monkey.txt will be the new location of the file.
C. If the move is successful and another process is monitoring the file system, it will not see an incomplete file at runtime.
D. None of the above.
```

## Questão 29

```text
What is the result of the following code?

7: var sb = new StringBuilder();
8: sb.append("aaa").insert(1, "bb").insert(4, "ccc");
9: System.out.println(sb);

A. abbaaccc
B. abbaccca
C. bbaaaccc
D. bbaaccca
E. An empty line.
F. The code does not compile.
```

## Questão 30

```text
Which of the following will compile when filling in the blank? (Choose all that apply.)

var list = List.of(1, 2, 3);
var set = Set.of(1, 2, 3);
var map = Map.of(1, 2, 3, 4);
 
____________.forEach(System.out::println);

A.list
B.set
C.map
D.map.keys()
E.map.keySet()
F. map.values()
G. map.valueSet()
```

## Questão 31

```text
Which of these classes compile and will include a default constructor created by the compiler? (Choose all that apply.)

A. public class Bird {}

B. public class Bird {
      public bird() {}
}

C. public class Bird {
      public bird(String name) {}
}

D. public class Bird {
      public Bird() {}
}

E. public class Bird {
      Bird(String name) {}
}

F. public class Bird {
      private Bird(int age) {}
}

G. public class Bird {
      public Bird bird() { return null; }
}
```

## Questão 32

```text
Which code can be inserted to have the code print 2?

public class BirdSeed {
      private int numberBags;
      boolean call;
  
      public BirdSeed() {
            // LINE 1
            call = false;
            // LINE 2
      }
  
      public BirdSeed(int numberBags) {
            this.numberBags = numberBags;
      }
  
      public static void main(String[] args) {
            var seed = new BirdSeed();
            System.out.print(seed.numberBags);
      } }

A. Replace line 1 with BirdSeed(2);
B. Replace line 2 with BirdSeed(2);
C. Replace line 1 with new BirdSeed(2);
D. Replace line 2 with new BirdSeed(2);
E. Replace line 1 with this(2);
F. Replace line 2 with this(2);
G. The code prints 2 without any changes.
```

## Questão 33

```text
What is the result of the following?

1:    public class PolarBear {
2:          StringBuilder value = new StringBuilder("t");
3:          { value.append("a"); }
4:          { value.append("c"); }
5:          private PolarBear() {
6:                value.append("b");
7:          }
8:          public PolarBear(String s) {
9:                this();
10:              value.append(s);
11:        }
12:        public PolarBear(CharSequence p) {
13:              value.append(p);
14:        }
15:        public static void main(String[] args) {
16:              Object bear = new PolarBear();
17:              bear = new PolarBear("f");
18:              System.out.println(((PolarBear)bear).value);
19:        } }

A. tacb
B. tacf
C. tacbf
D. tcafb
E. taftacb
F. The code does not compile.
G. An exception is thrown.
```

## Questão 34

```text
Which of the following can be inserted in the rest() method? (Choose all that apply.)

public class Lion {
   class Cub {}
   static class Den {}
   static void rest() {
      ________________;
   } }

A. Cub a = Lion.new Cub()
B. Lion.Cub b = new Lion().Cub()
C. Lion.Cub c = new Lion().new Cub()
D. var d = new Den()
E. var e = Lion.new Cub()
F. Lion.Den f = Lion.new Den()
G. Lion.Den g = new Lion.Den()
H. var h = new Cub()
```

## Questão 35

```text
What is the output of calling printReptile(6)?

void printReptile(int category) {
   var type = switch (category) {
      case 1,2 -> "Snake";
      case 3,4 -> "Lizard";
      case 5,6 -> "Turtle";
      case 7,8 -> "Alligator";
   };
   System.out.print(type);
}

A. Snake
B. Lizard
C. Turtle
D. Alligator
E. TurtleAlligator
F. None of the above
```

## Questão 36

```text
What is the result of running the following class?

1:  import java.util.function.*;
2:
3:  public class Panda {
4:     int age;
5:     public static void main(String[] args) {
6:        Panda p1 = new Panda();
7:        p1.age = 1;
8:        check(p1, p -> {p.age < 5});
9:     }
10:    private static void check(Panda panda,
11:       Predicate<Panda> pred) {
12:       String result = pred.test(panda)
13:          ? "match" : "not match";
14:       System.out.print(result);
15: } }

A. match
B. not match
C. Compiler error on line 8.
D. Compiler error on line 10.
E. Compiler error on line 12.
F. A runtime exception is thrown.
```

## Questão 37

```text
Which of the following statements about the code snippet are true? (Choose all that apply.)

3: short numPets = 5L;
4: int numGrains = 2.0;
5: String name = "Scruffy";
6: int d = numPets.length();
7: int e = numGrains.length;
8: int f = name.length();

A.Line 3 generates a compiler error.
B.Line 4 generates a compiler error.
C.Line 5 generates a compiler error.
D.Line 6 generates a compiler error.
E.Line 7 generates a compiler error.
F.Line 8 generates a compiler error.
```

## Questão 38

```text
Which of the following completes the constructor so that this code prints out 50?

class Speedster {
      int numSpots;
}
public class Cheetah extends Speedster {
      int numSpots;
  
      public Cheetah(int numSpots) {
            // INSERT CODE HERE
      }
  
      public static void main(String[] args) {
            Speedster s = new Cheetah(50);
            System.out.print(s.numSpots);
      }
}

A. numSpots = numSpots;
B. numSpots = this.numSpots;
C. this.numSpots = numSpots;
D. numSpots = super.numSpots;
E. super.numSpots = numSpots;
F. The code does not compile regardless of the code inserted into the constructor.
G. None of the above.
```

## Questão 39

```text
What does the following program print?

1:    class Person {
2:          static String name;
3:          void setName(String q) { name = q; } }
4:    public class Child extends Person {
5:          static String name;
6:          void setName(String w) { name = w; }
7:          public static void main(String[] p) {
8:                final Child m = new Child();
9:                final Person t = m;
10:              m.name = "Elysia";
11:              t.name = "Sophia";
12:              m.setName("Webby");
13:              t.setName("Olivia");
14:              System.out.println(m.name + " " + t.name);
15:    } }

A. Elysia Sophia
B. Webby Olivia
C. Olivia Olivia
D. Olivia Sophia
E. The code does not compile.
F. None of the above.
```

## Questão 40

```text
Which of the following sets result to 8.0? (Choose all that apply.)

A. double result = LongStream.of(6L, 8L, 10L)
   .mapToInt(x -> (int) x)
   .collect(Collectors.groupingBy(x -> x))
   .keySet()
   .stream()
   .collect(Collectors.averagingInt(x -> x));

B. double result = LongStream.of(6L, 8L, 10L)
   .mapToInt(x -> x)
   .boxed()
   .collect(Collectors.groupingBy(x -> x))
   .keySet()
   .stream()
   .collect(Collectors.averagingInt(x -> x));

C. double result = LongStream.of(6L, 8L, 10L)
   .mapToInt(x -> (int) x)
   .boxed()
   .collect(Collectors.groupingBy(x -> x))
   .keySet()
    .stream()
   .collect(Collectors.averagingInt(x -> x));

D. double result = LongStream.of(6L, 8L, 10L)
   .mapToInt(x -> (int) x)
   .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
   .keySet()
   .stream()
   .collect(Collectors.averagingInt(x -> x));

E. double result = LongStream.of(6L, 8L, 10L)
   .mapToInt(x -> x)
   .boxed()
   .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
   .keySet()
   .stream()
   .collect(Collectors.averagingInt(x -> x));

F. double result = LongStream.of(6L, 8L, 10L)
   .mapToInt(x -> (int) x)
   .boxed()
   .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
   .keySet()
   .stream()
   .collect(Collectors.averagingInt(x -> x));
```

## Questão 41

```text
Assuming keys are printed in order, what is the result of the following?

var map = new HashMap<Integer, Integer>();
map.put(1, 10);
map.put(2, 20);
map.put(3, null);
map.merge(1, 3, (a,b) -> a + b);
map.merge(3, 3, (a,b) -> a + b);
System.out.println(map);

A. {1=10, 2=20}
B. {1=10, 2=20, 3=null}
C. {1=10, 2=20, 3=3}
D. {1=13, 2=20}
E. {1=13, 2=20, 3=null}
F. {1=13, 2=20, 3=3}
G. The code does not compile.
H. An exception is thrown.
```

## Questão 42

```text
Which are true of ExecutorService? (Choose all that apply.)

A. If a task is submitted when no threads are available, the executor discards the task without completing it.
B. If a task is submitted when no threads are available, the executor adds the task to an internal queue and completes when there is an available thread.
C. If a task is submitted when no threads are available, the thread submitting the task waits on the submit call until a thread is available before continuing.
D. Platform threads can be pooled using ExecutorService, but not virtual threads.
E. Virtual threads can be pooled using ExecutorService, but not platform threads.
F. Both platform threads and virtual threads can be pooled using ExecutorService.
```

## Questão 43

```text
What is the output of the following code snippet?

32: Object skips = 10;
33: switch (skips) {
34:     case a when a < 10  -> System.out.print(2);
35:    case b when b>= 10 -> System.out.print(4);
36:    case null -> System.out.print(6);
37:    default   -> System.out.print(8);
38: }

A. 2
B. 4
C. 6
D. 8
E. Exactly one line does not compile.
F. Exactly two lines do not compile.
G. None of the above.
```

## Questão 44

```text
What is the output of the following code snippet?

4: int pig = (short)4;
5: pig = pig++;
6: long goat = (int)2;
7: goat -= 1.0;
8: System.out.print(pig + " - " + goat);

A. 4 - 1
B. 4 - 2
C. 5 - 1
D. 5 - 2
E. The code does not compile due to line 7.
F. None of the above.
```

## Questão 45

```text
What could be the output of the following?

Predicate<String> predicate = s -> s.length()> 3;
var stream = Stream.iterate("-",
    s -> ! s.isEmpty(), (s) -> s + s);
var b1 = stream.noneMatch(predicate);
var b2 = stream.anyMatch(predicate);
System.out.println(b1 + " " + b2);

A. false false
B. false true
C. java.util.stream.ReferencePipeline$3@4517d9a3
D. The code does not compile.
E. An exception is thrown.
F. The code hangs.
```

## Questão 46

```text
Assuming each call to takeNap() takes five seconds to execute without throwing an exception, what is the expected result of executing the following code snippet? (Choose all that apply.)

public void shutdown() throws InterruptedException {
   var service = Executors.newFixedThreadPool(4);
   try {
      service.execute(() -> takeNap());
      service.execute(() -> takeNap());
      service.execute(() -> takeNap());
   } finally {
      service.shutdown();
   }
   service.awaitTermination(2, TimeUnit.SECONDS);
   System.out.println("DONE!");
}
public void refactored() {
   try (var service = Executors.newFixedThreadPool(4)) {
      service.execute(() -> takeNap());
      service.execute(() -> takeNap());
      service.execute(() -> takeNap());
   }
   System.out.println("DONE!");
}

A. shutdown() will pause for approximately 2 seconds and then print DONE!.
B. shutdown() will pause for approximately 5 seconds and then print DONE!.
C. shutdown() will pause for approximately 15 seconds and then print DONE!.
D. refactored() will pause for approximately 2 seconds and then print DONE!.
E. refactored() will pause for approximately 5 seconds and then print DONE!.
F. refactored() will pause for approximately 15 seconds and then print DONE!.
G. One of the methods returns the result immediately.
H. One of the methods throws an exception.
```

## Questão 47

```text
Suppose you have separate modules for a service provider interface, service provider, service locator, and consumer. If you add a second service provider module, how many of the existing modules do you need to recompile?

A. Zero
B. One
C. Two
D. Three
E. Four
```

## Questão 48

```text
Which of the following are valid record declarations? (Choose all that apply.)

public record Iguana(int age) {
   private static final int age = 10; }
 
public final record Gecko() {}
 
public abstract record Chameleon()  {
   private static String name; }
 
public record BeardedDragon(boolean fun) {
   @Override public boolean fun() { return false; } }
 
public record Reptile(long size) {
   public Reptile {
      if(size == 1) throw new IllegalArgumentException();
   } }
 
public record Newt(double age) extends Reptile {
   public Newt(double age) {
      age = this.age % 2 == 0 ? 5 : 10;
   } }

A. Iguana
B. Gecko
C. Chameleon
D. BeardedDragon
E. Reptile
F. Newt
G. None of the above
```

## Questão 49

```text
Which change allows the following program to compile?

1: public class AhChoo {
2:    static class SneezeException extends Exception {}
3:    static class SniffleException extends SneezeException {}
4:    public static void main(String[] args) {
5:       try {
6:          throw new SneezeException();
7:       } catch (SneezeException | SniffleException e) {
8:       } finally {}
9:    } }

A. Add throws SneezeException to the declaration on line 4.
B. Add throws Throwable to the declaration on line 4.
C. Change line 7 to } catch (SneezeException e) {.
D. Change line 7 to } catch (SniffleException e) {.
E. Remove line 7.
F. The code compiles correctly as is.
G. None of the above.
```

## Questão 50

```text
What is the result of executing the following application? (Choose all that apply.)

import java.util.concurrent.*;
import java.util.stream.*;
public class PrintConstants {
   public static void main(String[] args) {
      var s = Executors.newVirtualThreadPerTaskExecutor();
      DoubleStream.of(3.14159, 2.71828)   // b1
         .forEach(c -> s.submit(          // b2
            () -> System.out.println(10 * c))); // b3
      s.execute(() -> System.out.println("Printed"));
   } }

A. It compiles and outputs the two numbers followed by Printed.
B. The code will not compile because of line b1.
C. The code will not compile because of line b2.
D. The code will not compile because of line b3.
E. It compiles, but the output cannot be determined ahead of time.
F. It compiles but throws an exception at runtime.
G. It compiles but waits forever at runtime.
```

---

## Folha de respostas

Preencha **Resposta**; depois confira no livro (Apêndice *Answers to Review Questions*) e registre os erros em `docs/ocp-study/error-log.md`.

| # | Tópico | Fonte | Resposta | Gabarito | ✔/✘ |
|--:|---|---|---|---|:-:|
| 01 | T1 | `15-core-apis/QCAP04_06` | | | |
| 02 | T1 | `14-operators/QCAP02_02` | | | |
| 03 | T7 | `11-modules/QCAP12_10` | | | |
| 04 | T5 | `05-collections-generics/QCAP09_14` | | | |
| 05 | T4 | `04-exceptions-localization/QCAP11_04` | | | |
| 06 | T6 | `06-lambdas-functional-interfaces/QCAP08_11` | | | |
| 07 | T7 | `01-building-blocks/QCAP01_02` | | | |
| 08 | T4 | `04-exceptions-localization/QCAP11_23` | | | |
| 09 | T10 | `04-exceptions-localization/QCAP11_17` | | | |
| 10 | T4 | `04-exceptions-localization/QCAP11_07` | | | |
| 11 | T3 | `01-beyond-classes/QCAP07_14` | | | |
| 12 | T5 | `05-collections-generics/QCAP09_18` | | | |
| 13 | T7 | `11-modules/QCAP12_18` | | | |
| 14 | T6 | `06-lambdas-functional-interfaces/QCAP08_12` | | | |
| 15 | T3 | `01-class-design/QCAP06_03` | | | |
| 16 | T1 | `14-operators/QCAP02_01` | | | |
| 17 | T8 | `13-concurrency/QCAP13_21` | | | |
| 18 | T10 | `04-exceptions-localization/QCAP11_05` | | | |
| 19 | T2 | `02-making-decisions/QCAP03_02` | | | |
| 20 | T9 | `09-io-api/QCAP14_03` | | | |
| 21 | T2 | `02-making-decisions/QCAP03_03` | | | |
| 22 | T5 | `15-core-apis/QCAP04_02` | | | |
| 23 | T3 | `01-beyond-classes/QCAP07_07` | | | |
| 24 | T6 | `07-streams/QCAP10_08` | | | |
| 25 | T9 | `09-io-api/QCAP14_23` | | | |
| 26 | T3 | `01-beyond-classes/QCAP07_08` | | | |
| 27 | T6 | `06-lambdas-functional-interfaces/QCAP08_08` | | | |
| 28 | T9 | `09-io-api/QCAP14_20` | | | |
| 29 | T1 | `15-core-apis/QCAP04_05` | | | |
| 30 | T5 | `05-collections-generics/QCAP09_11` | | | |
| 31 | T3 | `01-class-design/QCAP06_13` | | | |
| 32 | T3 | `01-class-design/QCAP06_01` | | | |
| 33 | T3 | `01-class-design/QCAP06_11` | | | |
| 34 | T3 | `01-beyond-classes/QCAP07_22` | | | |
| 35 | T2 | `02-making-decisions/QCAP03_05` | | | |
| 36 | T6 | `06-lambdas-functional-interfaces/QCAP08_17` | | | |
| 37 | T1 | `01-building-blocks/QCAP01_14` | | | |
| 38 | T3 | `01-class-design/QCAP06_05` | | | |
| 39 | T3 | `01-class-design/QCAP06_22` | | | |
| 40 | T6 | `07-streams/QCAP10_05` | | | |
| 41 | T5 | `05-collections-generics/QCAP09_20` | | | |
| 42 | T8 | `13-concurrency/QCAP13_09` | | | |
| 43 | T2 | `02-making-decisions/QCAP03_01` | | | |
| 44 | T1 | `14-operators/QCAP02_08` | | | |
| 45 | T6 | `07-streams/QCAP10_03` | | | |
| 46 | T8 | `13-concurrency/QCAP13_12` | | | |
| 47 | T7 | `11-modules/QCAP12_16` | | | |
| 48 | T3 | `01-beyond-classes/QCAP07_01` | | | |
| 49 | T4 | `04-exceptions-localization/QCAP11_21` | | | |
| 50 | T8 | `13-concurrency/QCAP13_19` | | | |

**Resultado:** ___ / 50 (___%) · Tempo: ___ min · Data: ___/___/______

| Tópico | Acertos |
|---|--:|
| T1 Data, hora, texto, números e booleanos | ___ / 6 |
| T2 Controle de fluxo | ___ / 4 |
| T3 Princípios de orientação a objetos | ___ / 11 |
| T4 Tratamento de exceções | ___ / 4 |
| T5 Arrays e coleções | ___ / 5 |
| T6 Streams e expressões lambda | ___ / 7 |
| T7 Empacotamento e implantação | ___ / 4 |
| T8 Concorrência (multithreading) | ___ / 4 |
| T9 E/S (java.io e java.nio.file) | ___ / 3 |
| T10 Localização | ___ / 2 |
