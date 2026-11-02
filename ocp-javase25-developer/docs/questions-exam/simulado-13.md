# Simulado 13 — 1Z0-831 Java SE 25 Developer Professional

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
Which are true statements? (Choose all that apply.)

A. NIO.2 includes a method to delete an entire directory tree.
B. NIO.2 includes a method to traverse a directory tree.
C. NIO.2 includes methods that are aware of symbolic links.
D. Files.readAttributes() cannot access file system dependent attributes.
E. Files.readAttributes() is often more performant since it reads multiple attributes rather than accessing individual attributes.
F. Files.readAttributes() works with the File object.
```

## Questão 02

```text
Suppose that the working directory is /weather and the absolute path /weather/winter/snow.dat represents a file that exists within the file system. Which of the following lines of code create an object that represents the file? (Choose all that apply.)

A. new File("/weather", "winter", "snow.dat")
B. new File("/weather/winter/snow.dat")
C. new File("/weather/winter", new File("snow.dat"))
D. new File("weather", "/winter/snow.dat")
E. new File(new File("/weather/winter"), "snow.dat")
F. Path.of("/weather/winter/snow.dat").toFile()
G. None of the above
```

## Questão 03

```text
What is the output of the following code?

import java.io.*;
public class FamilyCar {
   static class Door implements AutoCloseable {
      public void close() {
         System.out.print("D");
   } }
   static class Window implements Closeable {
      public void close() {
         System.out.print("W");
         throw new RuntimeException();
   } }
   public static void main(String[] args) {
      var d = new Door();
      try (d; var w = new Window()) {
         System.out.print("T");
      } catch (Exception e) {
         System.out.print("E");
      } finally {
         System.out.print("F");
      } } }

A.TWF
B.TWDF
C.TWDEF
D.TWF followed by an exception
E.TWDF followed by an exception
F.TWEF followed by an exception
G. The code does not compile.
```

## Questão 04

```text
How many lines of the following code contain compiler errors?

int note = 1 * 2 + (long)3;
short melody = (byte)(double)(note *= 2);
double song = melody;
float symphony = (float)((song == 1_000f) ? song * 2L : song);

A. 0
B. 1
C. 2
D. 3
E. 4
```

## Questão 05

```text
What is the output of the following code?

var date = LocalDate.of(2025, Month.APRIL, 30);
date.plusDays(2);
date.plusYears(3);
System.out.println(date.getYear() + " " + date.getMonth()
   + " " + date.getDayOfMonth());

A. 2025 APRIL 30
B. 2025 MAY 2
C. 2028 APRIL 2
D. 2028 APRIL 30
E. 2028 MAY 2
F. The code does not compile.
G. A runtime exception is thrown.
```

## Questão 06

```text
Which of the following operators are ranked in increasing or the same order of precedence? Assume the + operator is binary addition, not the unary form. (Choose all that apply.)

A. +, *, %, --
B. ++, (int), *
C. =, ==, !
D. (short), =, !, *
E. *, /, %, +, ==
F. !, ||, &
G. ^, +, =, +=
```

## Questão 07

```text
What is the output of the following code?

// RopeSwing.java
import rope.*;
import static rope.Rope.*;
public class RopeSwing {
   private static Rope rope1 = new Rope();
   private static Rope rope2 = new Rope();
   {
      System.out.println(rope1.length);
   }
   public static void main(String[] args) {
      rope1.length = 2;
      rope2.length = 8;
      System.out.println(rope1.length);
   }
}
 
// Rope.java
package rope;
public class Rope {
   public static int length = 0;
}

A. 02
B. 08
C. 2
D. 8
E. The code does not compile.
F. An exception is thrown.
```

## Questão 08

```text
What is the output of the following code?

var date = LocalDate.of(2025, 4, 3);
date.plusDays(2);
date.plusHours(3);
System.out.println(date.getYear() + " " + date.getMonth()
    + " " + date.getDayOfMonth());

A. 2025 MARCH 4
B. 2025 MARCH 6
C. 2025 APRIL 3
D. 2025 APRIL 5
E. The code does not compile.
G. A runtime exception is thrown.
```

## Questão 09

```text
Which of the following can be inserted into the blank to allow the code to compile and run without throwing an exception?

var f = DateTimeFormatter.ofPattern("hh o'clock");
System.out.println(f.format(___________________.now()));

A. ZonedTime
B. LocalDate
C. LocalTimestamp
D. LocalTime
E. The code does not compile regardless of what is placed in the blank.
F. None of the above.
```

## Questão 10

```text
Which is the first line to contain a compiler error?

1: module snake {
2:    exports com.snake.tail;
3:    exports com.snake.fangs to bird;
4:    requires skin;
5:    requires transitive skin;
6: }

A. Line 1.
B. Line 2.
C. Line 3.
D. Line 4.
E. Line 5.
F. The code does not contain any compiler errors.
```

## Questão 11

```text
Which of the following return 5 when run independently? (Choose all that apply.)

var string = "12345";
var builder = new StringBuilder("12345");

A. builder.charAt(4)
B. builder.replace(2, 4, "6").charAt(3)
C. builder.replace(2, 5, "6").charAt(2)
D. string.charAt(5)
E. string.length
F. string.replace("123", "1").charAt(2)
G. None of the above
```

## Questão 12

```text
Which of the following statements can be inserted in the blank so that the code will compile successfully? (Choose all that apply.)

abstract class Snake {}
class Cobra extends Snake {}
class GardenSnake extends Cobra {}
public class SnakeHandler {
   private Snake snakey;
   public void setSnake(Snake mySnake) { this.snakey = mySnake; }
   public static void main(String[] args) {
      new SnakeHandler().setSnake(_____________);
   } }

A. new Cobra()
B. new Snake()
C. new Object()
D. new String("Snake")
E. new GardenSnake()
F. null
G. None of the above. The class does not compile, regardless of the value inserted in the blank.
```

## Questão 13

```text
Which of the following are output by the following code? (Choose all that apply.)

public class StringBuilders {
   public static StringBuilder work(StringBuilder a,
      StringBuilder b) {
      a = new StringBuilder("a");
      b.append("b");
      return a;
   }
   public static void main(String[] args) {
      var s1 = new StringBuilder("s1");
      var s2 = new StringBuilder("s2");
      var s3 = work(s1, s2);
      System.out.println("s1 = " + s1);
      System.out.println("s2 = " + s2);
      System.out.println("s3 = " + s3);
   }
}

A. s1 = a
B. s1 = s1
C. s2 = s2
D. s2 = s2b
E. s3 = a
F. The code does not compile.
```

## Questão 14

```text
What is the output of the following code snippet?

var fishes = new TreeSet<String>();
fishes.add("Koi");
fishes.addFirst("clown");
fishes.add("carp");
for(var fish : fishes)
   System.out.print(fish + ", ");

A. carp, clown, Koi,
B. carp, Koi, clown,
C. clown, carp, Koi,
D. clown, Koi, carp,
E. Koi, carp, clown,
F. Koi, clown, carp,
G. The code does not compile.
H. The code compiles but throws an exception at runtime.
```

## Questão 15

```text
Which of these statements can fill in the blank so that the Wildcard class compiles successfully? (Choose all that apply.)

3:  public class Wildcard {
4:     public void showSize(List<?> list) {
5:        System.out.println(list.size());
6:     }
7:     public static void main(String[] args) {
8:        Wildcard card = new Wildcard();
9:        _________________________________________;
10:       card.showSize(list);
11:    } }

A. List<?> list = new HashSet <String>()
B. ArrayList<? super Date> list = new ArrayList<Date>()
C. List<?> list = new ArrayList<?>()
D. List<Exception> list = new LinkedList<java.io.IOException>()
E. ArrayList <? extends Number> list = new ArrayList <Integer>()
F. None of the above
```

## Questão 16

```text
Which of the following data types are permitted on the right side of a for-each expression? (Choose all that apply.)

A. Double[][]
B. Object
C. Map
D. List
E. String
F. char[]
G. Exception
```

## Questão 17

```text
What is the output of the following code?

4:    public abstract class Whale {
5:          public abstract void dive();
6:          public static void main(String[] args) {
7:                Whale whale = new Orca();
8:                whale.dive(3);
9:          }
10: }
11: class Orca extends Whale {
12:        static public int MAX = 3;
13:        public void dive() {
14:              System.out.println("Orca diving");
15:        }
16:        public void dive(int… depth) {
17:              System.out.println("Orca diving deeper "+MAX);
18: } }

A. Orca diving
B. Orca diving deeper 3
C. The code will not compile because of line 4.
D. The code will not compile because of line 8.
E. The code will not compile because of line 11.
F. The code will not compile because of line 12.
G. The code will not compile because of line 17.
H. None of the above.
```

## Questão 18

```text
Assuming one minute is enough time for the tasks submitted to the service executor to complete, what is the result of executing countSheep()?

import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
public class BedTime {
   private AtomicInteger s1 = new AtomicInteger(0); // w1
   private int s2 = 0;
 
   private void countSheep() throws InterruptedException {
      try (var service = Executors.newSingleThreadExecutor()) { // w2
         for (int i = 0; i < 100; i++)
         service.execute(() -> {
            s1.getAndIncrement(); s2++; }); // w3
         Thread.sleep(60_000);
         System.out.println(s1 + " " + s2);
      }
   }
   public static void main(String… nap)
     throws InterruptedException {
      new BedTime().countSheep();
   } }

A. The method consistently prints 100 99.
B. The method consistently prints 100 100.
C. The output cannot be determined ahead of time.
D. The code will not compile because of line w1.
E. The code will not compile because of line w2.
F. The code will not compile because of line w3.
G. It compiles but throws an exception at runtime.
```

## Questão 19

```text
Which is a true statement about a package in a JAR on the classpath containing a module-info.java file?

A. It is possible to make the package available to all other modules on the classpath.
B. It is possible to make the package available to all other modules on the module path.
C. It is possible to make the package available to exactly one other specific module on the classpath.
D. It is possible to make the package available to exactly one other specific module on the module path.
E. It is possible to make sure the package is not available to any other modules on the classpath.
```

## Questão 20

```text
What is the result of executing the following code snippet? (Choose all that apply.)

3: int start = 7;
4: int end = 4;
5: end += ++start;
6: start = (byte)(Byte.MAX_VALUE + 1);

A. start is 0.
B. start is -128.
C. start is 127.
D. end is 8.
E. end is 11.
F. end is 12.
G. The code does not compile.
H. The code compiles but throws an exception at runtime.
```

## Questão 21

```text
Which statements about the following class are correct? (Choose all that apply.)

1: public class ClownFish {
2:    int gills = 0, double weight=2;
3:    { int fins = gills; }
4:    void print(int length = 3) {
5:       System.out.println(gills);
6:       System.out.println(weight);
7:       System.out.println(fins);
8:       System.out.println(length);
9: } }

A. Line 2 generates a compiler error.
B. Line 3 generates a compiler error.
C. Line 4 generates a compiler error.
D. Line 7 generates a compiler error.
E. The code prints 0.
F. The code prints 2.0.
G. The code prints 2.
H. The code prints 3.
```

## Questão 22

```text
Suppose module puppy depends on module dog and module dog depends on module animal. Which lines allow module puppy to access the animal.behavior package in module animal? (Choose all that apply.)

module animal {
   exports animal.behavior;
}
module dog {
     _____________ animal;  // line S
}
module puppy {
     _____________ dog;     // line T
}

A. require on line S
B. require on line T
C. requires on line S
D. requires on line T
E. require transitive on line S
F. require transitive on line T
G. requires transitive on line S
H. requires transitive on line T
```

## Questão 23

```text
Assuming an implementation of the performCount() method is provided prior to runtime, which of the following are possible results of executing the following application? (Choose all that apply.)

import java.util.*;
import java.util.concurrent.*;
public class CountZooAnimals {
   public static void performCount(int animal) {
      // IMPLEMENTATION OMITTED
   }
   public static void printResults(Future<?> f) {
      try {
         System.out.println(f.get(1, TimeUnit.DAYS)); // o1
      } catch (Exception e) {
         System.out.println("Exception!");
      }
   }
   public static void main(String[] args) throws Exception {
      final var r = new ArrayList<Future<?>>();
      try (var s = Executors.newSingleThreadExecutor()) {
         for (int i = 0; i < 10; i++) {
            final int animal = i;
            r.add(s.submit(() -> performCount(animal))); // o2
         }
         r.forEach(f -> printResults(f));
      }
   } }

A. It outputs a number 10 times.
B. It outputs a Boolean value 10 times.
C. It outputs a null value 10 times.
D. It outputs Exception! 10 times.
E. The code will not compile because of line o1.
F. The code will not compile because of line o2.
```

## Questão 24

```text
Which of the following is true?

List<Integer> x1 = List.of(1, 2, 3);
List<Integer> x2 = List.of(4, 5, 6);
List<Integer> x3 = List.of();
Stream.of(x1, x2, x3).map(x -> x + 1)
   .flatMap(x -> x.stream())
   .forEach(System.out::print);

A. The code compiles and prints 123456.
B. The code compiles and prints 234567.
C. The code compiles but does not print anything.
D. The code compiles but prints stream references.
E. The code runs infinitely.
F. The code does not compile.
G. The code throws an exception.
```

## Questão 25

```text
Given the following two class files, what is the maximum number of imports that can be removed and have the code still compile?

// Water.java
package aquarium;
public class Water { }
 
// Tank.java
package aquarium;
import java.lang.*;
import java.lang.System;
import aquarium.Water;
import aquarium.*;
public class Tank {
   public void print(Water water) {
      System.out.println(water); } }

A. 0
B. 1
C. 2
D. 3
E. 4
F. Does not compile
```

## Questão 26

```text
Which of the following are true statements about exception handling in Java? (Choose all that apply.)

A. A traditional try statement without a catch block requires a finally block.
B. A traditional try statement without a finally block requires a catch block.
C. A traditional try statement with only one statement can omit the {}.
D. A try-with-resources statement without a catch block requires a finally block.
E. A try-with-resources statement without a finally block requires a catch block.
F. A try-with-resources statement with only one statement can omit the {}.
```

## Questão 27

```text
What is the output of the following code snippet?

2: boolean keepGoing = true;
3: int result = 15, meters = 10;
4: do {
5:    meters--;
6:    if (meters==8) keepGoing = false;
7:    result -= 2;
8: } while keepGoing;
9: System.out.println(result);

A. 7
B. 9
C. 10
D. 11
E. 15
F. The code will not compile because of line 6.
H. The code does not compile for a different reason.
```

## Questão 28

```text
Given the following record declaration, which line of code can fill in the blank and allow the code to compile?

public record RabbitFood(int size, String brand, LocalDate expires) {
   public static int MAX_STORAGE = 100;
   public RabbitFood() {
      __________________________;
   }
}

A. size = MAX_STORAGE
B. this.size = 10
C. if(expires.isAfter(LocalDate.now())) throw new RuntimeException()
D. if(brand==null) super.brand = "Unknown"
E. throw new RuntimeException()
F. None of the above
```

## Questão 29

```text
What is the output of the following?

var spliterator = Stream.generate(() -> "x")
   .spliterator();
 
spliterator.tryAdvance(System.out::print);  
var split = spliterator.trySplit();
split.tryAdvance(System.out::print);

A. x
B. xx
C. A long list of x’s.
D. There is no output.
E. The code does not compile.
F. The code compiles but does not terminate at runtime.
```

## Questão 30

```text
What could be the output of the following?

Predicate<String> predicate = s -> s.startsWith("g");
var stream1 = Stream.generate(() -> "growl!");
var stream2 = Stream.generate(() -> "growl!");
var b1 = stream1.anyMatch(predicate);
var b2 = stream2.allMatch(predicate);
System.out.println(b1 + " " + b2);

A. true false
B. true true
C. java.util.stream.ReferencePipeline$3@4517d9a3
D. The code does not compile.
E. An exception is thrown.
F. The code hangs.
```

## Questão 31

```text
What is printed by the following program?

1:    class Antelope {
2:          public Antelope(int p) {
3:                System.out.print("4");
4:          }
5:          { System.out.print("2"); }
6:          static { System.out.print("1"); }
7:    }
8:    public class Gazelle extends Antelope {
9:          public Gazelle(int p) {
10:              super(6);
11:              System.out.print("3");
12:        }
13:        public static void main(String hopping[]) {
14:          new Gazelle(0);
15:    }
16:    static { System.out.print("8"); }
17:    { System.out.print("9"); }
18: }

A. 182640
B. 182943
C. 182493
D. 421389
E. The code does not compile.
F. The output cannot be determined until runtime.
```

## Questão 32

```text
What is the output of the following code?

1:    class Reptile {
2:          {System.out.print("A");}
3:          public Reptile(int hatch) {}
4:          void layEggs() {
5:                System.out.print("Reptile");
6:          } }
7:    public class Lizard extends Reptile {
8:          static {System.out.print("B");}
9:          public Lizard(int hatch) {}
10:        public final void layEggs() {
11:              System.out.print("Lizard");
12:        }
13:        public static void main(String[] args) {
14:              var reptile = new Lizard(1);
15:              reptile.layEggs();
16:        } }

A. AALizard
B. BALizard
C. BLizardA
D. ALizard
E. The code will not compile because of line 3.
F. None of the above.
```

## Questão 33

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

## Questão 34

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

## Questão 35

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

## Questão 36

```text
What code change is needed to make the method compile, assuming there is no class named T?

public static T identity(T t) {
   return t;
}

A. Add <T> after the public keyword.
B. Add <T> after the static keyword.
C. Add <T> after T.
D. Add <?> after the public keyword.
E. Add <?> after the static keyword.
F. No change is required. The code already compiles.
```

## Questão 37

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

## Questão 38

```text
What is the output of the following program?

20: public enum Animals {
21:    MAMMAL(List.of(2,4)),
22:    INVERTEBRATE(List.of(2, 4, 6, 8, 100)),
23:    BIRD(null) {
24:       public int stand() {
25:          return legs.get(0) + 4;
26:       }
27:    };
28:    List<Integer> legs;
29:    Animals(List<Integer> legs) {
30:       this.legs = legs;
31:    }
32:    public int stand() { return legs.get(0); }
33:    public static void main(String[] a) {
34:       Animals.BIRD.legs = List.of(-1);
35:       System.out.println(Animals.BIRD.stand());
36:    } }

A. null
B. -1
C. 3
D. 4
E. Compiler error on lines 23.
F. Compiler error on lines 24.
G. Compiler error on line 34.
H. The code compiles but produces a NullPointerException at runtime.
I. None of the above.
```

## Questão 39

```text
Assume that all of the files mentioned in the answer choices exist and define the same keys. Which one will be used to find the key in line 8?

6: Locale.setDefault(Locale.of("en", "US"));
7: var b = ResourceBundle.getBundle("Dolphins");
8: System.out.println(b.getString("name"));

A. Dolphins.properties
B. Dolphins_US.properties
C. Dolphins_en.properties
D. Whales.properties
E. Whales_en_US.properties
F. The code does not compile.
```

## Questão 40

```text
Which of the following lines can be inserted to make the code compile? (Choose all that apply.)

class W {}
class X extends W {}
class Y extends X {}
class Z<Y> {
   // INSERT CODE HERE
}

A. W w1 = new W();
B. W w2 = new X();
C. W w3 = new Y();
D. Y y1 = new W();
E. Y y2 = new X();
F. Y y3 = new Y();
```

## Questão 41

```text
Which scenario is the best use of an exception?

A. An element is not found when searching a list.
B. An unexpected parameter is passed into a method.
C. The computer caught fire.
D. You want to loop through a list.
E. You don’t know how to code a method.
```

## Questão 42

```text
Assume that the source instance passed to the following method represents a file that exists. Also assume that /flip/sounds.txt exists as a file prior to executing this method. When this method is executed, which statement correctly copies the file to the path specified by /flip/sounds.txt?

void copyIntoFlipDirectory(Path source) throws IOException {
   var dolphinDir = Path.of("/flip");
   dolphinDir = Files.createDirectories(dolphinDir);
   var n = Path.of("sounds.txt");
   Files.copy(source,____________________________________________);
}

A. dolphinDir
B. dolphinDir.resolve(n), StandardCopyOption.REPLACE_EXISTING
C. dolphinDir, StandardCopyOption.REPLACE_EXISTING
D. dolphinDir.resolve(n)
E. The method does not compile, regardless of what is placed in the blank.
F. The method compiles but throws an exception at runtime, regardless of what is placed in the blank.
```

## Questão 43

```text
Which functional interfaces complete the following code? For line 7, assume m and n are instances of functional interfaces that exist and have the same type as y. (Choose three.)

6:  _____________ x = String::new;
7:  _____________ y = m.andThen(n);
8:  _____________ z = a -> a + a;

A. BinaryConsumer<String, String>
B. BiConsumer<String, String>
C. BinaryFunction<String, String>
D. BiFunction<String, String>
E. Predicate<String>
F. Supplier<String>
G. UnaryOperator<String>
H. UnaryOperator<String, String>
```

## Questão 44

```text
What lines are printed by the following program? (Choose all that apply.)

1:  public class WaterBottle {
2:     private String brand;
3:     private boolean empty;
4:     public static float code;
5:     public static void main(String[] args) {
6:        WaterBottle wb = new WaterBottle();
7:        System.out.println("Empty = " + wb.empty);
8:        System.out.println("Brand = " + wb.brand);
9:        System.out.println("Code = " + code);
10:    } }

A. Line 8 generates a compiler error.
B. Line 9 generates a compiler error.
C. Empty =
D. Empty = false
E. Brand =
F. Brand = null
G. Code = 0.0
H. Code = 0f
```

## Questão 45

```text
Suppose you need to display a collection of products for sale, which may contain duplicates. Additionally, you have a collection of sales that you need to track, sorted by the natural order of the sale ID, and you need to retrieve the text of each. Which two of the following classes best suit your needs for each of these scenarios? (Choose two.)

A. ArrayList
B. HashMap
C. HashSet
D. LinkedList
E. SequencedTreeSet
F. TreeMap
```

## Questão 46

```text
What statement about the following code is true?

var value1 = new AtomicLong(0);
final long[] value2 = {0};
IntStream.iterate(1, i -> 1).limit(100).parallel()
   .forEach(i -> value1.incrementAndGet());
IntStream.iterate(1, i -> 1).limit(100).parallel()
   .forEach(i -> ++value2[0]);
System.out.println(value1 + " " + value2[0]);

A. It outputs 100 100.
B. It outputs 100 99.
C. The output cannot be determined ahead of time.
D. The code does not compile.
E. It compiles but throws an exception at runtime.
F. It compiles but enters an infinite loop at runtime.
G. None of the above.
```

## Questão 47

```text
Which of the following statements about inheritance are correct? (Choose all that apply.)

A. A class can directly extend any number of classes.
B. A class can implement any number of interfaces.
C. All variables inherit java.lang.Object.
D. If class A is extended by B, then B is a superclass of A.
E. If class C implements interface D, then C is a subtype of D.
F. Multiple inheritance is the property of a class to have multiple direct superclasses.
```

## Questão 48

```text
Which of the following methods can fill in the blank so that the code prints out false?

var s = Stream.generate(() -> "meow");
var match = s.__________(String::isEmpty);
System.out.println(match);

A. Only allMatch
B. Only anyMatch
C. Only noneMatch
D. Both allMatch and anyMatch
E. Both allMatch and noneMatch
F. None of the above
```

## Questão 49

```text
What is the output of the following code snippet?

2: double iguana = 0;
3: do {
4:    int snake = 1;
5:    System.out.print(snake++ + " ");
6:    iguana--;
7: } while (snake <= 5);
8: System.out.println(iguana);
 

A. 1 2 3 4 -4.0
B. 1 2 3 4 -5.0
C. 1 2 3 4 5 -4.0
D. 0 1 2 3 4 5 -5.0
E. The code does not compile.
F. The code compiles but produces an infinite loop at runtime.
G. None of the above.
```

## Questão 50

```text
What is the output of the following code snippet?

2: var tailFeathers = 3;
3: final var one = 1;
4: switch (tailFeathers) {
5:    case one: System.out.print(3 + " ");
6:    default: case 3: System.out.print(5 + " ");
7: }
8: while (tailFeathers> 1) {
9:    System.out.print(--tailFeathers + " "); }

A. 3
B. 5 1
C. 5 2
D. 3 5 1
E. 5 2 1
F. The code will not compile because of lines 3–5.
H. The code will not compile because of line 6.
```

---

## Folha de respostas

Preencha **Resposta**; depois confira no livro (Apêndice *Answers to Review Questions*) e registre os erros em `docs/ocp-study/error-log.md`.

| # | Tópico | Fonte | Resposta | Gabarito | ✔/✘ |
|--:|---|---|---|---|:-:|
| 01 | T9 | `09-io-api/QCAP14_17` | | | |
| 02 | T9 | `09-io-api/QCAP14_15` | | | |
| 03 | T4 | `04-exceptions-localization/QCAP11_18` | | | |
| 04 | T1 | `14-operators/QCAP02_16` | | | |
| 05 | T1 | `15-core-apis/QCAP04_21` | | | |
| 06 | T1 | `14-operators/QCAP02_05` | | | |
| 07 | T3 | `03-methods/QCAP05_13` | | | |
| 08 | T1 | `15-core-apis/QCAP04_11` | | | |
| 09 | T10 | `04-exceptions-localization/QCAP11_16` | | | |
| 10 | T7 | `11-modules/QCAP12_23` | | | |
| 11 | T1 | `15-core-apis/QCAP04_08` | | | |
| 12 | T3 | `01-beyond-classes/QCAP07_09` | | | |
| 13 | T3 | `03-methods/QCAP05_18` | | | |
| 14 | T5 | `05-collections-generics/QCAP09_23` | | | |
| 15 | T5 | `05-collections-generics/QCAP09_12` | | | |
| 16 | T2 | `02-making-decisions/QCAP03_04` | | | |
| 17 | T3 | `01-class-design/QCAP06_26` | | | |
| 18 | T8 | `13-concurrency/QCAP13_22` | | | |
| 19 | T7 | `11-modules/QCAP12_24` | | | |
| 20 | T1 | `14-operators/QCAP02_19` | | | |
| 21 | T3 | `01-building-blocks/QCAP01_12` | | | |
| 22 | T7 | `11-modules/QCAP12_11` | | | |
| 23 | T8 | `13-concurrency/QCAP13_25` | | | |
| 24 | T6 | `07-streams/QCAP10_13` | | | |
| 25 | T7 | `01-building-blocks/QCAP01_11` | | | |
| 26 | T4 | `04-exceptions-localization/QCAP11_13` | | | |
| 27 | T2 | `02-making-decisions/QCAP03_14` | | | |
| 28 | T3 | `01-beyond-classes/QCAP07_21` | | | |
| 29 | T6 | `07-streams/QCAP10_21` | | | |
| 30 | T6 | `07-streams/QCAP10_02` | | | |
| 31 | T3 | `01-class-design/QCAP06_24` | | | |
| 32 | T3 | `01-class-design/QCAP06_19` | | | |
| 33 | T8 | `13-concurrency/QCAP13_21` | | | |
| 34 | T4 | `04-exceptions-localization/QCAP11_21` | | | |
| 35 | T6 | `07-streams/QCAP10_03` | | | |
| 36 | T5 | `05-collections-generics/QCAP09_19` | | | |
| 37 | T6 | `06-lambdas-functional-interfaces/QCAP08_08` | | | |
| 38 | T3 | `01-beyond-classes/QCAP07_26` | | | |
| 39 | T10 | `04-exceptions-localization/QCAP11_08` | | | |
| 40 | T5 | `05-collections-generics/QCAP09_15` | | | |
| 41 | T4 | `04-exceptions-localization/QCAP11_10` | | | |
| 42 | T9 | `09-io-api/QCAP14_24` | | | |
| 43 | T6 | `06-lambdas-functional-interfaces/QCAP08_18` | | | |
| 44 | T3 | `01-building-blocks/QCAP01_17` | | | |
| 45 | T5 | `05-collections-generics/QCAP09_01` | | | |
| 46 | T8 | `13-concurrency/QCAP13_05` | | | |
| 47 | T3 | `01-class-design/QCAP06_14` | | | |
| 48 | T6 | `07-streams/QCAP10_06` | | | |
| 49 | T2 | `02-making-decisions/QCAP03_19` | | | |
| 50 | T2 | `02-making-decisions/QCAP03_22` | | | |

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
