# Simulado 20 — 1Z0-831 Java SE 25 Developer Professional

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
Which of the following operators are ranked in increasing or the same order of precedence? Assume the + operator is binary addition, not the unary form. (Choose all that apply.)

A. +, *, %, --
B. ++, (int), *
C. =, ==, !
D. (short), =, !, *
E. *, /, %, +, ==
F. !, ||, &
G. ^, +, =, +=
```

## Questão 02

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
15:        } }

A. Elysia Sophia
B. Webby Olivia
C. Olivia Olivia
D. Olivia Sophia
E. The code does not compile.
F. None of the above.
```

## Questão 03

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

## Questão 04

```text
Which of the following methods compile? (Choose all that apply.)

A. public void violin(int… nums) {}
B. public void viola(String values, int… nums) {}
C. public void cello(int… nums, String values) {}
D. public void bass(String… values, int… nums) {}
E. public void flute(String[] values, …int nums) {}
F. public void oboe(String[] values, int[] nums) {}
```

## Questão 05

```text
Which of the following are true? (Choose all that apply.)

4: Stream<Integer> s = Stream.of(1);
5: IntStream is = s.boxed();
6: DoubleStream ds = s.mapToDouble(x -> x);
7: Stream<Integer> s2 = ds.mapToInt(x -> x);
8: s2.forEach(System.out::print);

A. Line 4 causes a compiler error.
B. Line 5 causes a compiler error.
C. Line 6 causes a compiler error.
D. Line 7 causes a compiler error.
E. Line 8 causes a compiler error.
F. The code compiles but throws an exception at runtime.
G. The code compiles and prints 1.
```

## Questão 06

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

## Questão 07

```text
What is the minimum number of lines that would need to be changed or removed for the following code to compile and return a value when called with dance(10)?

41: double dance(Object speed) {
42:        return switch (speed) {
43:              case 5 -> {yield 4};
44:              case 10 -> 8;
45:              case 15,20 -> 12;
46:              default -> 20;
47:              case null -> 16;
48:        }
49: }

A. Zero, the code compiles and runs without issue
B. One
C. Two
D. Three
E. Four
F. Five
G. Six
```

## Questão 08

```text
Which of the following changes, when made independently, would make this code compile? (Choose all that apply.)

1:    import java.io.*;
2:    public class StuckTurkeyCage implements AutoCloseable {
3:          public void close() throws IOException {
4:                throw new FileNotFoundException("Cage not closed");
5:          }
6:          public static void main(String[] args) {
7:                try (StuckTurkeyCage t = new StuckTurkeyCage()) {
8:                      System.out.println("put turkeys in");
9:                }
10:        } }

A. Remove throws IOException from the declaration on line 3.
B. Add throws Exception to the declaration on line 6.
C. Change line 9 to } catch (Exception e) {}.
D. Change line 9 to } finally {}.
E. The code compiles as is.
F. None of the above.
```

## Questão 09

```text
What statements about the following code snippet are true? (Choose all that apply.)

Object o1 = new Object();
Object o2 = new Object();
try (var service = Executors.newFixedThreadPool(2)) {
   var f1 = service.submit(() -> {
      synchronized (o1) {
         synchronized (o2) { System.out.print("Tortoise"); }
      }
   });
   var f2 = service.submit(() -> {
      synchronized (o2) {
         synchronized (o1) { System.out.print("Hare"); }
      }
   });
   f1.get();
   f2.get();
}

A. The code will always output Tortoise followed by Hare.
B. The code will always output Hare followed by Tortoise.
C. If the code does output anything, the order cannot be determined.
D. The code does not compile.
E. The code compiles but may produce a deadlock at runtime.
F. The code compiles but may produce a livelock at runtime.
G. It compiles but throws an exception at runtime.
```

## Questão 10

```text
What is the output of the following snippet, assuming a and b are both 0?

3:    try {
4:          System.out.print(a / b);
5:    } catch (RuntimeException e) {
6:          System.out.print(-1);
7:    } catch (ArithmeticException e) {
8:          System.out.print(0);
9:    } finally {
10:        System.out.print("done");
11: }

A. -1
B. 0
C. done-1
D. done0
E. The code does not compile.
F. An uncaught exception is thrown.
G. None of the above.
```

## Questão 11

```text
What is the result of the following code?

4: Map m = new HashMap();
5: m.put(123, "456");
6: m.put("abc", "def");
7: System.out.println(m.contains("123"));

A. false
B. true
C. Compiler error on line 4.
D. Compiler error on line 5.
E. Compiler error on line 7.
F. A runtime exception is thrown.
```

## Questão 12

```text
What changes need to be made together for this code to print the string 12345? (Choose all that apply.)

Stream.iterate(1, x -> x++)
   .limit(5).map(x -> x)
   .collect(Collectors.joining());

A. Changing Collectors.joining() to Collectors.joining(",")
B. Changing map(x -> x) to map(x -> "" + x)
C. Changing x -> x++ to x -> ++x
D. Adding .forEach(System.out::print) after the call to collect()
E. Wrapping the entire line in a System.out.print statement
F. None of the above; the code already prints 12345
```

## Questão 13

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

## Questão 14

```text
What is the output of the following code?

11: int sample1 = (2 * 4) % 3;
12: int sample2 = 3 * 2 % -3;
13: int sample3 = 5 * (1 % 2);
14: System.out.println(sample1 + ", " + sample2 + ", " + sample3);

A. 0, 0, 5
B. 1, 2, 10
C. 2, 1, 5
D. 2, 0, 5
E. 3, 1, 10
F. 3, 2, 6
G. The code does not compile.
```

## Questão 15

```text
Assume that the directory /animals exists and is empty. What is the result of executing the following code?

Path path = Path.of("/animals");
try (var z = Files.walk(path)) {
   boolean b = z
      .filter((p,a) -> a.isDirectory() && !path.equals(p)) // x
      .findFirst().isPresent();  // y
   System.out.print(b ? "No Sub": "Has Sub");
}

A. It prints No Sub.
B. It prints Has Sub.
C. The code will not compile because of line x.
D. The code will not compile because of line y.
E. The output cannot be determined.
F. It produces an infinite loop at runtime.
```

## Questão 16

```text
What is the result of the following program?

3:  public record Sorted(int num, String text)
4:     implements Comparable<Sorted>, Comparator<Sorted> {
5:
6:     public String toString() { return "" + num; }
7:     public int compareTo(Sorted s) {
8:        return text.compareTo(s.text);
9:     }
10:    public int compare(Sorted s1, Sorted s2) {
11:       return s1.num - s2.num;
12:    }
13:    public static void main(String[] args) {
14:       var s1 = new Sorted(88, "a");
15:       var s2 = new Sorted(55, "b");
16:       SequencedSet<Sorted> t1 = new TreeSet<Sorted>();
17:       t1.add(s1); t1.add(s2);
18:       var t2 = new TreeSet<Sorted>(s1);
19:       t2.add(s1); t2.add(s2);
20:       System.out.println(t1 + " " + t2);
21:    } }

A. [55, 88] [55, 88]
B. [55, 88] [88, 55]
C. [88, 55] [55, 88]
D. [88, 55] [88, 55]
E. The code does not compile.
F. A runtime exception is thrown.
```

## Questão 17

```text
Suppose you have separate modules for a service provider interface, service provider, service locator, and consumer. If you add a second service provider module, how many of the existing modules do you need to recompile?

A. Zero
B. One
C. Two
D. Three
E. Four
```

## Questão 18

```text
Which of the following are true statements about serialization in Java? (Choose all that apply.)

A. All non-null instance members of the class must be serializable or marked transient.
B. Records are automatically serializable.
C. Serialization involves converting data into Java objects.
D. Serializable is a functional interface.
E. The class must declare a static serialVersionUID variable.
F. The class must extend the Serializable class.
G. The class must implement the Serializable interface.
```

## Questão 19

```text
What statements about the following class definition are true? (Choose all that apply.)

public final class TicketManager {
   private int tickets;
   private static TicketManager instance;
   private TicketManager() {}
   static synchronized TicketManager getInstance() {      // k1
      if (instance==null) instance = new TicketManager(); // k2
      return instance;
   }
 
   public int getTicketCount() { return tickets; }
   public void addTickets(int value) {tickets += value;}  // k3
   public void sellTickets(int value) {
      synchronized (this) {                               // k4
         tickets -= value;
      } } }

A. It compiles without issue.
B. The code will not compile because of line k2.
C. The code will not compile because of line k3.
D. The locks acquired on k1 and k4 are on the same object.
E. The class correctly protects the tickets data from race conditions.
F. At most one instance of TicketManager will be created in an application that uses this class.
```

## Questão 20

```text
Note that March 12, 2028 is the weekend that clocks spring ahead for daylight saving time. What is the output of the following? (Choose all that apply.)

var date = LocalDate.of(2028, Month.MARCH, 12);
var time = LocalTime.of(1, 30);
var zone = ZoneId.of("US/Eastern");
var dateTime1 = ZonedDateTime.of(date, time, zone);
var dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS);
  
long diff = ChronoUnit.HOURS.between(dateTime1, dateTime2);
int hour = dateTime2.getHour();
boolean offset = dateTime1.getOffset()
      == dateTime2.getOffset();
System.out.println("diff = " + diff);
System.out.println("hour = " + hour);
System.out.println("offset = " + offset);

A. diff = 1
B. diff = 2
C. hour = 2
D. hour = 3
E. offset = true
F. The code does not compile.
G. A runtime exception is thrown.
```

## Questão 21

```text
What is output by the following code ignoring any new lines in the ouput? (Choose all that apply.)

var numbers = "012345678".indent(1);
numbers = numbers.stripLeading();
System.out.println(numbers.substring(1, 3));
System.out.println(numbers.substring(7, 7));
System.out.println(numbers.substring(7));

A. 12
B. 123
C. 7
D. 78
E. A blank line.
G. An exception is thrown.
```

## Questão 22

```text
Which of the following fill in the blank to print a positive integer? (Choose all that apply.)

String[] s1 = { "Camel", "Peacock", "Llama"};
String[] s2 = { "Camel", "Llama", "Peacock"};
String[] s3 = { "Camel"};
String[] s4 = { "Camel", null};
System.out.println(Arrays.)____________________________;

A. compare(s1, s2)
B. mismatch(s1, s2)
C. compare(s3, s4)
D. mismatch (s3, s4)
E. compare(s4, s4)
F. mismatch (s4, s4)
```

## Questão 23

```text
How many lines of the following program contain a compilation error?

1:  public class Rodent {
2:     public Rodent(Integer x) {}
3:     protected static Integer chew() throws Exception {
4:        System.out.println("Rodent is chewing");
5:        return 1;
6:     }
7:  }
8:  class Beaver extends Rodent {
9:     public Number chew() throws RuntimeException {
10:       System.out.println("Beaver is chewing on wood");
11:       return 2;
12:    } }

A. None
B. 1
C. 2
D. 3
E. 4
F. 5
```

## Questão 24

```text
What is the output of the following program?

20: public enum Animals {
21:        MAMMAL(List.of(2,4)),
22:        INVERTEBRATE(List.of(2, 4, 6, 8, 100)),
23:        BIRD(null) {
24:              public int stand() {
25:                    return legs.get(0) + 4;
26:              }
27:        };
28:        List<Integer> legs;
29:        Animals(List<Integer> legs) {
30:              this.legs = legs;
31:        }
32:        public int stand() { return legs.get(0); }
33:        public static void main(String[] a) {
34:              Animals.BIRD.legs = List.of(-1);
35:              System.out.println(Animals.BIRD.stand());
36:        } }

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

## Questão 25

```text
Which of the following are common types to localize? (Choose all that apply.)

A. Dates
B. Lambda expressions
C. Class names
D. Currency
E. Numbers
F. Variable names
```

## Questão 26

```text
Which is not an output of the following code snippet?

short height = 1, weight = 3;
short zebra = (byte) weight * (byte) height;
double ox = 1 + height * 2 + weight;
long giraffe = 1 + 9 % height + 1;
System.out.println(zebra);
System.out.println(ox);
System.out.println(giraffe);

A. 2
B. 3
C. 6
D. 6.0
E. The code does not compile.
```

## Questão 27

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

## Questão 28

```text
Which of the following fills in the blank, allowing the code to compile and run without issue?

11: SequencedCollection<String> animals = new _____________<>();
12: animals.addFirst("lions");
13: animals.addLast("tigers");
14: for(var a : animals)
15:    System.out.println(a);
16: System.out.println(animals.get(0));

A. HashSet
B. LinkedList
C. TreeSetMap
D. HashMap
E. None of the above
```

## Questão 29

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

## Questão 30

```text
Which is true of the following code?

int length = 3;
  
for (int i = 0; i<3; i++) {
      if (i%2 == 0) {
            Supplier<Integer> supplier = () -> length; // A
            System.out.println(supplier.get());                // B
      } else {
            int j = i;
            Supplier<Integer> supplier = () -> j;            // C
            System.out.println(supplier.get());                // D
      }
}

A. The first compiler error is on line A.
B. The first compiler error is on line B.
C. The first compiler error is on line C.
D. The first compiler error is on line D.
E. The code compiles successfully.
```

## Questão 31

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

## Questão 32

```text
Which lines of the following interface declarations do not compile? (Choose all that apply.)

1: public interface Omnivore {
2:        int amount = 10;
3:        static boolean gather = true;
4:        static void eatGrass() {}
5:        int findMore() { return 2; }
6:        default float rest() { return 2; }
7:        protected int chew() { return 13; }
8:        private static void eatLeaves() {}
9: }

A. All of the lines compile without issue.
B. Line 2.
C. Line 3.
D. Line 4.
E. Line 5.
F. Line 6.
G. Line 7.
H. Line 8.
```

## Questão 33

```text
Which is true of the following code?

Set<String> birds = Set.of("oriole", "flamingo");
Stream.concat(birds.stream(), birds.stream(), birds.stream())
   .sorted()       // line X
   .distinct()
   .findAny()
   .ifPresent(System.out::println);

A. It is guaranteed to print flamingo as is and when line X is removed.
B. It is guaranteed to print oriole as is and when line X is removed.
C. It is guaranteed to print flamingo as is, but not when line X is removed.
D. It is guaranteed to print oriole as is, but not when line X is removed.
E. The output may vary as is.
F. The code does not compile.
G. It throws an exception because the same list is used as the source for multiple streams.
```

## Questão 34

```text
What is the result of the following code?

1: public class PrintIntegers {
2:        public static void main(String[] args) {
3:              int y = -2;
4:              do System.out.print(++y + " ");
5:              while (y <= 5);
6: } }

A. -2 -1 0 1 2 3 4 5
B. -2 -1 0 1 2 3 4
C. -1 0 1 2 3 4 5 6
D. -1 0 1 2 3 4 5
E. The code will not compile because of line 5.
F. The code contains an infinite loop and does not terminate.
```

## Questão 35

```text
What lines are printed by the following program? (Choose all that apply.)

1:    public class WaterBottle {
2:          private String brand;
3:          private boolean empty;
4:          public static float code;
5:          public static void main(String[] args) {
6:                WaterBottle wb = new WaterBottle();
7:                System.out.println("Empty = " + wb.empty);
8:                System.out.println("Brand = " + wb.brand);
9:                System.out.println("Code = " + code);
10:        } }

A. Line 8 generates a compiler error.
B. Line 9 generates a compiler error.
C. Empty =
D. Empty = false
E. Brand =
F. Brand = null
G. Code = 0.0
H. Code = 0f
```

## Questão 36

```text
What is the output of the following code snippet?

List<Integer> myFavoriteNumbers = new ArrayList<>();
myFavoriteNumbers.add(10);
myFavoriteNumbers.add(14);
for (var a : myFavoriteNumbers) {
      System.out.print(a + ", ");
      break;
}
  
for (int b : myFavoriteNumbers) {
      continue;
      System.out.print(b + ", ");
}
  
for (Object c : myFavoriteNumbers)
      System.out.print(c + ", ");

A. It compiles and runs without issue but does not produce any output.
B. 10, 14,
C. 10, 10, 14,
D. 10, 10, 14, 10, 14,
E. Exactly one line of code does not compile.
F. Exactly two lines of code do not compile.
G. Three or more lines of code do not compile.
H. The code contains an infinite loop and does not terminate.
```

## Questão 37

```text
Assuming -g:vars is used when the code is compiled to include debug information, what is the output of the following code snippet?

var huey = (String)null;
Integer dewey = null;
Object louie = null;
if(louie == huey.substring(dewey.intValue())) {
      System.out.println("Quack!");
}

A. A NullPointerException that does not include any variable names in the stack trace
B. A NullPointerException naming huey in the stack trace
C. A NullPointerException naming dewey in the stack trace
D. A NullPointerException naming louie in the stack trace
E. A NullPointerException naming huey and louie in the stack trace
F. A NullPointerException naming huey and dewey in the stack trace
G. None of the above
```

## Questão 38

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

## Questão 39

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

## Questão 40

```text
Which of the following can fill in the blank in this code to make it compile? (Choose all that apply.)

public class Ant {
    _________ void method() {}
}

A. default
B. final
C. private
D. Public
E. String
F. zzz:
```

## Questão 41

```text
What is the output of the following program?

public class SnowStorm {
      static class WalkToSchool implements AutoCloseable {
            public void close() {
                  throw new RuntimeException("flurry");
            } }
      public static void main(String[] args) {
            WalkToSchool walk1 = new WalkToSchool();
            try (walk1; WalkToSchool walk2 = new WalkToSchool()) {
                  throw new RuntimeException("blizzard");
            } catch(Exception e) {
                  System.out.println(e.getMessage()
                        + " " + e.getSuppressed().length);
            }
            walk1 = null;
      } }

A. blizzard 0
B. blizzard 1
C. blizzard 2
D. flurry 0
E. flurry 1
F. flurry 2
G. None of the above
```

## Questão 42

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

## Questão 43

```text
Which of the following pairs, when inserted into the blanks, allow the code to compile? (Choose all that apply.)

1:    public class Howler {
2:          public Howler(long shadow) {
3:                ____________;
4:          }
5:          private Howler(int moon) {
6:                super();
7:          }
8:    }
9:    class Wolf extends Howler {
10:        protected Wolf(String stars) {
11:              super(2L);
12:        }
13:        public Wolf() {
14:              _____________;
15:        }
16: }

A. this(3) at line 3, this("") at line 14.
B. this() at line 3, super(1) at line 14.
C. this((short)1) at line 3, this(null) at line 14.
D. super() at line 3, super() at line 14.
E. this(2L) at line 3, super((short)2) at line 14.
F. this(5) at line 3, super(null) at line 14.
G. Remove lines 3 and 14.
```

## Questão 44

```text
Fill in the blanks so this command to run the program is correct:

java
_________ modules
_________ zoo.animal.talks/zoo/animal/talks/Peacocks

A. -d and -m
B. -d and –p
C. -m and -d
D. -m and -p
E. -p and -d
F. -p and -m
G. None of the above
```

## Questão 45

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

## Questão 46

```text
Which lambda expression, when entered into the blank line in the following code, causes the program to print hahaha? (Choose all that apply.)

import java.util.function.Predicate;
public class Hyena {
      private int age = 1;
      public static void main(String[] args) {
            var p = new Hyena();
            double height = 10;
            int age = 1;
            testLaugh(p,    ________________);
            age = 2;
      }
      static void testLaugh(Hyena panda, Predicate<Hyena> joke) {
            var r = joke.test(panda) ? "hahaha" : "silence";
            System.out.print(r);
      }
}

A. var -> p.age <= 10
B. shenzi -> age==1
C. p -> true
D. age==1
E. shenzi -> age==2
F. h -> h.age < 5
G. None of the above, as the code does not compile
```

## Questão 47

```text
Which are true of ExecutorService? (Choose all that apply.)

A. If a task is submitted when no threads are available, the executor discards the task without completing it.
B. If a task is submitted when no threads are available, the executor adds the task to an internal queue and completes when there is an available thread.
C. If a task is submitted when no threads are available, the thread submitting the task waits on the submit call until a thread is available before continuing.
D. Platform threads can be pooled using ExecutorService, but not virtual threads.
E. Virtual threads can be pooled using ExecutorService, but not platform threads.
F. Both platform threads and virtual threads can be pooled using ExecutorService.
```

## Questão 48

```text
What is the output of the following program?

1:  class Canine {
2:     public Canine(boolean t) { logger.append("a"); }
3:     public Canine() { logger.append("q"); }
4:     
5:     private StringBuilder logger = new StringBuilder();
6:     protected void print(String v) { logger.append(v); }
7:     protected String view() { return logger.toString(); }
8:  }
9:  
10: class Fox extends Canine {
11:    public Fox(long x) { print("p"); }
12:    public Fox(String name) {
13:       this(2);
14:       print("z");
15:    }
16: }
17:
18: public class Fennec extends Fox {
19:    public Fennec(int e) {
20:       super("tails");
21:       print("j");
22:    }
23:    public Fennec(short f) {
24:       super("eevee");
25:       print("m");
26:    }
27:
28:    public static void main(String… unused) {
29:       System.out.println(new Fennec(1).view());
30:    } }

A. qpz
B. qpzj
C. jzpa
D. apj
E. apjm
F. The code does not compile.
G. None of the above.
```

## Questão 49

```text
Which options are true of the following code? (Choose all that apply.)

_____________ q = new LinkedList<>();
var u = Collections.unmodifiableCollection(q);
q.add(10);
q.add(12);
q.remove(1);
System.out.print(u);

A. If we fill in the blank with List<Integer>, the output is [10].
B. If we fill in the blank with Queue<Integer>, the output is [10].
C. If we fill in the blank with var, the output is [10].
D. One or more of the scenarios does not compile.
E. One or more of the scenarios throws a runtime exception.
```

## Questão 50

```text
What is the output of the following code snippet?

9:    int w = 0, r = 1;
10: String name = "";
11: while (w < 2) {
12:        name += "A";
13:        do {
14:              name += "B";
15:              if (name.length()>0) name += "C";
16:              else break;
17:        } while (r <=1);
18:        r++; w++; }
19: System.out.println(name);

A. ABC
B. ABCABC
C. ABCABCABC
D. Line 15 contains a compilation error.
E. Line 18 contains a compilation error.
F. The code compiles but never terminates at runtime.
G. The code compiles but throws a NullPointerException at runtime.
```

---

## Folha de respostas

Preencha **Resposta**; depois confira no livro (Apêndice *Answers to Review Questions*) e registre os erros em `docs/ocp-study/error-log.md`.

| # | Tópico | Fonte | Resposta | Gabarito | ✔/✘ |
|--:|---|---|---|---|:-:|
| 01 | T1 | `14-operators/QCAP02_05` | | | |
| 02 | T3 | `01-class-design/QCAP06_22` | | | |
| 03 | T3 | `01-class-design/QCAP06_19` | | | |
| 04 | T3 | `03-methods/QCAP05_06` | | | |
| 05 | T6 | `07-streams/QCAP10_14` | | | |
| 06 | T7 | `01-building-blocks/QCAP01_11` | | | |
| 07 | T2 | `02-making-decisions/QCAP03_30` | | | |
| 08 | T4 | `04-exceptions-localization/QCAP11_12` | | | |
| 09 | T8 | `13-concurrency/QCAP13_14` | | | |
| 10 | T4 | `04-exceptions-localization/QCAP11_04` | | | |
| 11 | T5 | `05-collections-generics/QCAP09_17` | | | |
| 12 | T6 | `07-streams/QCAP10_11` | | | |
| 13 | T3 | `03-methods/QCAP05_13` | | | |
| 14 | T1 | `14-operators/QCAP02_11` | | | |
| 15 | T9 | `09-io-api/QCAP14_05` | | | |
| 16 | T5 | `05-collections-generics/QCAP09_13` | | | |
| 17 | T7 | `11-modules/QCAP12_16` | | | |
| 18 | T9 | `09-io-api/QCAP14_13` | | | |
| 19 | T8 | `13-concurrency/QCAP13_24` | | | |
| 20 | T1 | `15-core-apis/QCAP04_19` | | | |
| 21 | T1 | `15-core-apis/QCAP04_12` | | | |
| 22 | T5 | `15-core-apis/QCAP04_18` | | | |
| 23 | T3 | `01-class-design/QCAP06_12` | | | |
| 24 | T3 | `01-beyond-classes/QCAP07_26` | | | |
| 25 | T10 | `04-exceptions-localization/QCAP11_03` | | | |
| 26 | T1 | `14-operators/QCAP02_10` | | | |
| 27 | T10 | `04-exceptions-localization/QCAP11_08` | | | |
| 28 | T5 | `05-collections-generics/QCAP09_08` | | | |
| 29 | T7 | `01-building-blocks/QCAP01_02` | | | |
| 30 | T6 | `06-lambdas-functional-interfaces/QCAP08_13` | | | |
| 31 | T9 | `09-io-api/QCAP14_03` | | | |
| 32 | T3 | `01-beyond-classes/QCAP07_17` | | | |
| 33 | T6 | `07-streams/QCAP10_12` | | | |
| 34 | T2 | `02-making-decisions/QCAP03_29` | | | |
| 35 | T3 | `01-building-blocks/QCAP01_17` | | | |
| 36 | T2 | `02-making-decisions/QCAP03_06` | | | |
| 37 | T4 | `04-exceptions-localization/QCAP11_14` | | | |
| 38 | T8 | `13-concurrency/QCAP13_12` | | | |
| 39 | T6 | `07-streams/QCAP10_13` | | | |
| 40 | T3 | `03-methods/QCAP05_02` | | | |
| 41 | T4 | `04-exceptions-localization/QCAP11_24` | | | |
| 42 | T1 | `14-operators/QCAP02_08` | | | |
| 43 | T3 | `01-class-design/QCAP06_10` | | | |
| 44 | T7 | `11-modules/QCAP12_03` | | | |
| 45 | T6 | `07-streams/QCAP10_02` | | | |
| 46 | T6 | `06-lambdas-functional-interfaces/QCAP08_15` | | | |
| 47 | T8 | `13-concurrency/QCAP13_09` | | | |
| 48 | T3 | `01-class-design/QCAP06_23` | | | |
| 49 | T5 | `05-collections-generics/QCAP09_16` | | | |
| 50 | T2 | `02-making-decisions/QCAP03_26` | | | |

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
