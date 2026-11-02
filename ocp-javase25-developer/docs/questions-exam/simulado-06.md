# Simulado 06 — 1Z0-831 Java SE 25 Developer Professional

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

## Questão 02

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

## Questão 03

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

## Questão 04

```text
What is the output of executing the Chimp program?

// Rope.java
1: package rope;
2: public class Rope {
3:    public static int LENGTH = 5;
4:    static {
5:       LENGTH = 10;
6:    }
7:    public static void swing() {
8:       System.out.print("swing ");
9:    } }
 
// Chimp.java
1: import rope.*;
2: import static rope.Rope.*;
3: public class Chimp {
4:    public static void main(String[] args) {
5:       Rope.swing();
6:       new Rope().swing();
7:       System.out.println(LENGTH);
8:    } }

A. swing swing 5
B. swing swing 10
C. Compiler error on line 2 of Chimp
D. Compiler error on line 5 of Chimp
E. Compiler error on line 6 of Chimp
F. Compiler error on line 7 of Chimp
```

## Questão 05

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

## Questão 06

```text
What is the result of the following code?

1:  interface Climb {
2:     boolean isTooHigh(int height, int limit);
3:  }
4:
5:  public class Climber {
6:     public static void main(String[] args) {
7:        check((h, m) -> h.append(m).isEmpty(), 5);
8:     }
9:     private static void check(Climb climb, int height) {
10:       if (climb.isTooHigh(height, 10))
11:          System.out.println("too high");
12:       else
13:          System.out.println("ok");
14:    }
15: }

A. ok
B. too high
C. Compiler error on line 7.
D. Compiler error on line 10.
E. Compiler error on a different line.
F. A runtime exception is thrown.
```

## Questão 07

```text
What is the result of the following program?

11: public class Favorites {
12:    enum Flavors {
13:       VANILLA, CHOCOLATE, STRAWBERRY
14:       public Flavors() {}
15:    }
16:    public static void main(String[] args) {
17:       for(final var e : Flavors.values())
18:          System.out.print((e.ordinal() % 2) + " ");
19:    } }

A. 0 1 0
B. 1 0 1
C. Exactly one line of code does not compile.
D. More than one line of code does not compile.
E. The code compiles but produces an exception at runtime.
F. None of the above.
```

## Questão 08

```text
What is the result of executing the following code snippet?

SequencedCollection<Integer> lions = new ArrayList<>(List.of(1, 2, 3));
SequencedCollection<Integer> tigers = new CopyOnWriteArrayList<>(lions);
Set<Integer> bears = new ConcurrentSkipListSet<>();
bears.addAll(lions);
for (Integer item: tigers) tigers.add(4); // x1
for (Integer item: bears) bears.add(5);   // x2
System.out.println(lions.size() + " " + tigers.size()
   + " " + bears.size());

A. It outputs 3 6 4.
B. It outputs 6 6 6.
C. It outputs 6 3 4.
D. The code does not compile.
E. It compiles but throws an exception at runtime on line x1.
F. It compiles but throws an exception at runtime on line x2.
G. It compiles but enters an infinite loop at runtime.
```

## Questão 09

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

## Questão 10

```text
The _________ operator increases a value and returns the original value, while the _______ operator decreases a value and returns the new value.

A. post-increment, post-increment
B. pre-decrement, post-decrement
C. post-increment, post-decrement
D. post-increment, pre-decrement
E. pre-increment, pre-decrement
F. pre-increment, post-decrement
```

## Questão 11

```text
What is the output of the following code snippet?

9:  int w = 0, r = 1;
10: String name = "";
11: while (w < 2) {
12:    name += "A";
13:    do {
14:       name += "B";
15:       if (name.length()>0) name += "C";
16:       else break;
17:    } while (r <=1);
18:    r++; w++; }
19: System.out.println(name);

A. ABC
B. ABCABC
C. ABCABCABC
D. Line 15 contains a compilation error.
E. Line 18 contains a compilation error.
F. The code compiles but never terminates at runtime.
G. The code compiles but throws a NullPointerException at runtime.
```

## Questão 12

```text
Assuming this class is accessed by only a single thread at a time, what is the result of calling the countIceCreamFlavors() method?

import java.util.stream.LongStream;
public class Flavors {
   private static int counter;
   public static void countIceCreamFlavors()  {
      counter = 0;
      Runnable task = () -> counter++;
      LongStream.range(0, 500)
         .forEach(m -> Thread.ofPlatform()
           .priority(1)
           .unstarted(task)
           .run());
      System.out.println(counter);
   } }

A. The method consistently prints a number less than 500.
B. The method consistently prints 500.
C. The method compiles and prints a value, but that value cannot be determined ahead of time.
D. The method does not compile.
E. The method compiles but throws an exception at runtime.
F. None of the above.
```

## Questão 13

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

## Questão 14

```text
What is the minimum number of lines that would need to be changed or removed for the following code to compile and return a value when called with dance(10)?

41: double dance(Object speed) {
42:    return switch (speed) {
43:       case 5 -> {yield 4};
44:       case 10 -> 8;
45:       case 15,20 -> 12;
46:       default -> 20;
47:       case null -> 16;
48:    }
49: }

A. Zero, the code compiles and runs without issue
B. One
C. Two
D. Three
E. Four
F. Five
G. Six
```

## Questão 15

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

## Questão 16

```text
What is the output of the following code? (Choose three.)

22: var p1 = Path.of("/zoo/./bear","../food.txt");
23: p1.normalize().relativize(Path.of("/lion"));
24: System.out.println(p1);
25:
26: var p2 = Path.of("/zoo/animals/bear/koala/food.txt");
27: System.out.println(p2.subpath(1,3).getName(1));
28:
29: var p3 = Path.of("/pets/../cat.txt");
30: var p4 = Path.of("./dog.txt");
31: System.out.println(p4.resolve(p3));

A. ../../lion
B. /zoo/./bear/../food.txt
C. animal
D. bear
E. /pets/../cat.txt
F. /pets/../cat.txt/./dog.txt
```

## Questão 17

```text
Which of the following statements about garbage collection are correct? (Choose all that apply.)

A. Calling System.gc() is guaranteed to free up memory by destroying objects eligible for garbage collection.
B. Garbage collection runs on a set schedule.
C. Garbage collection allows the JVM to reclaim memory for other objects.
D. Garbage collection runs when your program has used up half the available memory.
E. An object may be eligible for garbage collection but never removed from the heap.
F. An object is eligible for garbage collection once no references to it are accessible in the program.
G. Marking a variable final means its associated object will never be garbage collected.
```

## Questão 18

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

## Questão 19

```text
Which lines of the following interface declarations do not compile? (Choose all that apply.)

1: public interface Omnivore {
2:    int amount = 10;
3:    static boolean gather = true;
4:    static void eatGrass() {}
5:    int findMore() { return 2; }
6:    default float rest() { return 2; }
7:    protected int chew() { return 13; }
8:    private static void eatLeaves() {}
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

## Questão 20

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

## Questão 21

```text
Which of the following will compile when independently inserted in the following code? (Choose all that apply.)

1:  public class Order3 {
2:     final String value1 = "red";
3:     static String value2 = "blue";
4:     String value3 = "yellow";
5:     {
6:        // CODE SNIPPET 1
7:     }
8:     static {
9:        // CODE SNIPPET 2
10:    } }

A. Insert at line 6: value1 = "green";
B. Insert at line 6: value2 = "purple";
C. Insert at line 6: value3 = "orange";
D. Insert at line 9: value1 = "magenta";
E. Insert at line 9: value2 = "cyan";
F. Insert at line 9: value3 = "turquoise";
```

## Questão 22

```text
Which operator takes three operands or values?

A. =
B. &&
C. *=
D. ? :
E. &
F. ++
G. /
```

## Questão 23

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

## Questão 24

```text
Suppose you have separate modules for a service provider interface, service provider, service locator, and consumer. Which statements are true about the directives you need to specify? (Choose all that apply.)

A. The consumer must use the requires directive.
B. The consumer must use the uses directive.
C. The service locator must use the requires directive.
D. The service locator must use the uses directive.
E. None of the above.
```

## Questão 25

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

## Questão 26

```text
Which are true about this code? (Choose all that apply.)

var blocky = """
   squirrel \s
   pigeon   \
   termite""";
System.out.print(blocky);

A. It outputs two lines.
B. It outputs three lines.
C. It outputs four lines.
D. There is one line with trailing whitespace.
E. There are two lines with trailing whitespace.
F. If we indented each line five characters, it would change the output.
```

## Questão 27

```text
Which modifier pairs can be used together in a method declaration? (Choose all that apply.)

A. static and final
B. private and static
C. static and abstract
D. private and abstract
E. abstract and final
F. private and final
```

## Questão 28

```text
Given the following classes, which of the following snippets can independently be inserted in place of INSERT IMPORTS HERE and have the code compile? (Choose all that apply.)

package aquarium;
public class Water {
   boolean salty = false;
}
 
package aquarium.jellies;
public class Water {
   boolean salty = true;
}
 
package employee;
INSERT IMPORTS HERE
public class WaterFiller {
   Water water;
}

A. import aquarium.*;
B. import aquarium.Water;
C. import aquarium.jellies.*;
D. import aquarium.*;
E. import aquarium.jellies.Water;
F. import aquarium.*;
G. import aquarium.jellies.*;
H. import aquarium.Water;
I. import aquarium.jellies.Water;
J. None of the above
```

## Questão 29

```text
What is the output of the following code?

LocalDate date = LocalDate.parse("2025-04-30",
   DateTimeFormatter.ISO_LOCAL_DATE_TIME);
System.out.println(date.getYear() + " "
   + date.getMonth() + " "+ date.getDayOfMonth());

A. 2025 APRIL 2
B. 2025 APRIL 30
C. 2025 MAY 2
D. The code does not compile.
E. A runtime exception is thrown.
```

## Questão 30

```text
Suppose you are creating a service provider that contains the following class. Which line of code needs to be in your module-info.java?

package dragon;
import magic.*;
public class Dragon implements Magic {
   public String getPower() {
     return "breathe fire";
   }
}

A. provides dragon.Dragon by magic.Magic;
B. provides dragon.Dragon using magic.Magic;
C. provides dragon.Dragon with magic.Magic;
D. provides magic.Magic by dragon.Dragon;
E. provides magic.Magic using dragon.Dragon;
F. provides magic.Magic with dragon.Dragon;
```

## Questão 31

```text
Which lines can fill in the blank to make the following code compile? (Choose all that apply.)

void rollOut() throws ClassCastException {}
 
public void transform(String c) {
   try {
      rollOut();
   } catch (IllegalArgumentException |________________________) {
   }
}

A. IOException a
B. Error b
C. NullPointerException c
D. RuntimeException d
E. NumberFormatException e
F. ClassCastException f
G. None of the above. The code contains a compiler error regardless of what is inserted into the blank.
```

## Questão 32

```text
Assume that reader is a valid stream whose next characters are PEACOCKS. Which is true about the output of the following code snippet?

var sb = new StringBuilder();
sb.append((char)reader.read());
reader.mark(10);
for(int i=0; i<2; i++) {
   sb.append((char)reader.read());
   reader.skip(2);
}
reader.reset();
reader.skip(0);
sb.append((char)reader.read());
System.out.println(sb.toString());

A. The code may print PEAE.
B. The code may print PEOA.
C. The code may print PEOE.
D. The code may print PEOS.
E. The code will always print PEAE.
F. The code will always print PEOA.
G. The code will always print PEOE.
H. The code will always print PEOS.
```

## Questão 33

```text
Which of the following functional interfaces contain an abstract method that returns a primitive value? (Choose all that apply.)

A. BooleanSupplier
B. CharSupplier
C. DoubleSupplier
D. FloatSupplier
E. IntSupplier
F. StringSupplier
```

## Questão 34

```text
Which are true of ExecutorService? (Choose all that apply.)

A. If a task is submitted when no threads are available, the executor discards the task without completing it.
B. If a task is submitted when no threads are available, the executor adds the task to an internal queue and completes when there is an available thread.
C. If a task is submitted when no threads are available, the thread submitting the task waits on the submit call until a thread is available before continuing.
D. Platform threads can be pooled using ExecutorService, but not virtual threads.
E. Virtual threads can be pooled using ExecutorService, but not platform threads.
F. Both platform threads and virtual threads can be pooled using ExecutorService.
```

## Questão 35

```text
Which of the following are true about the following code? (Choose all that apply.)

public class Run {
   static void execute() {
      System.out.print("1-");
   }
   static void execute(int num) {
      System.out.print("2-");
   }
   static void execute(Integer num) {
      System.out.print("3-");
   }
   static void execute(Object num) {
      System.out.print("4-");
   }
   static void execute(int… nums) {
      System.out.print("5-");
   }
   public static void main(String[] args) {
      Run.execute(100);
      Run.execute(100L);
   }
}

A. The code prints out 2-4-.
B. The code prints out 3-4-.
C. The code prints out 4-2-.
D. The code prints out 4-4-.
E. The code prints 3-4- if you remove the method static void execute(int num).
F. The code prints 4-4- if you remove the method static void execute(int num).
```

## Questão 36

```text
Which of the following are true? (Choose all that apply.)

12: List<?> q = List.of("mouse", "parrot");
13: var v = List.of("mouse", "parrot");
14:
15: q.removeIf(String::isEmpty);
16: q.removeIf(s -> s.length() == 4);
17: v.removeIf(String::isEmpty);
18: v.removeIf(s -> s.length() == 4);

A. This code compiles and runs without error.
B. Exactly one of these lines contains a compiler error.
C. Exactly two of these lines contain a compiler error.
D. Exactly three of these lines contain a compiler error.
E. Exactly four of these lines contain a compiler error.
F. If any lines with compiler errors are removed, this code runs without throwing an exception.
G. If any lines with compiler errors are removed, this code throws an exception.
```

## Questão 37

```text
We have a method that returns a sorted list without changing the original. We want to rewrite it. Which of the following pairs can fill in the blanks in refactored() to do the same with streams?

private static List<String> sort(List<String> list) {
   var copy = new ArrayList<String>(list);
   Collections.sort(copy, (a, b) -> b.compareTo(a));
   return copy;
}
 
private static List<String> refactored(List<String> list) {
   return list.stream()
      ._______((a, b) -> b.compareTo(a))
      .__________;
}

A. compare and toList()
B. compare and sort()
C. compareTo and toList()
D. compareTo and sort()
E. sorted and collect()
F. sorted and collect(Collectors.toList())
```

## Questão 38

```text
What is printed by the following program?

1:  public class DriveBus {
2:     public void go() {
3:        System.out.print("A");
4:        try {
5:           stop();
6:        } catch (ArithmeticException e) {
7:           System.out.print("B");
8:        } finally {
9:           System.out.print("C");
10:       }
11:       System.out.print("D");
12:    }
13:    public void stop() {
14:       System.out.print("E");
15:       Object x = null;
16:       x.toString();
17:       System.out.print("F");
18:    }
19:    public static void main(String n[]) {
20:       new DriveBus().go();
21:    } }

A. AE
B. AEBCD
C. AEC
D. AECD
E. AE followed by a stack trace
F. AEBCD followed by a stack trace
G. AEC followed by a stack trace
H. A stack trace with no other output
```

## Questão 39

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

## Questão 40

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

## Questão 41

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

## Questão 42

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

## Questão 43

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

## Questão 44

```text
What is the result of the following code snippet?

3: int sing = 8, squawk = 2, notes = 0;
4: while (sing> squawk) {
5:    sing--;
6:    squawk += 2;
7:    notes += sing + squawk;
8: }
9: System.out.println(notes);

A. 11
B. 13
C. 23
D. 33
E. 50
F. The code will not compile because of line 7.
```

## Questão 45

```text
What are the unique outputs of the following code snippet? (Choose all that apply.)

int a = 2, b = 4, c = 2;
System.out.println(a> 2 ? --c : b++);
System.out.println(b = (a!=c ? a : b++));
System.out.println(a> b ? b < c ? b : 2 : 1);

A. 1
B. 2
C. 3
D. 4
E. 5
F. 6
G. The code does not compile.
```

## Questão 46

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

## Questão 47

```text
Which of the following method signatures are valid overrides of the hairy() method in the Alpaca class? (Choose all that apply.)

import java.util.*;
 
public class Alpaca {
   public List<String> hairy(List<String> list) { return null; }
}

A. public List<String> hairy(List<CharSequence> list) { return null; }
B. public List<String> hairy(List<String> list) { return null; }
C. public List<String> hairy(List<Integer> list) { return null; }
D. public List<CharSequence> hairy(List<String> list) { return null; }
E. public Object hairy(List<String> list) { return null; }
F. public ArrayList<String> hairy(List<String> list) { return null; }
```

## Questão 48

```text
Which of the following statements about resource bundles are correct? (Choose all that apply.)

A. All keys must be in the same resource bundle to be used.
B. A resource bundle is loaded by calling the new ResourceBundle() constructor.
C. Resource bundle values are always read using the Properties class.
D. Changing the default locale lasts for only a single run of the program.
E. If a resource bundle for a specific locale is requested, then the resource bundle for the default locale will not be used.
F. It is possible to use a resource bundle for a locale without specifying a default locale.
```

## Questão 49

```text
What is the output of the following program?

public sealed class ArmoredAnimal permits Armadillo {
   public ArmoredAnimal(int size) {}
   @Override public String toString() { return "Strong"; }
   public static void main(String[] a) {
      var c = new Armadillo(10, null);
      System.out.println(c);
   }
}
class Armadillo extends ArmoredAnimal {
   @Override public String toString() { return "Cute"; }
   public Armadillo(int size, String name) {
      super(size);
   }   
}

A. Strong
B. Cute
C. The program does not compile.
D. The code compiles but produces an exception at runtime.
E. None of the above.
```

## Questão 50

```text
Which of the following are valid functional interfaces? (Choose all that apply.)

public interface Transport {
   public int go();
   public boolean equals(Object o);
}
 
public abstract class Car {
   public abstract Object swim(double speed, int duration);
}
 
public interface Locomotive extends Train {
   public int getSpeed();
}
 
public interface Train extends Transport {}
 
abstract interface Spaceship extends Transport {
   default int blastOff();
}
 
public interface Boat {
   int hashCode();
   int hashCode(String input);
}

A. Boat
B. Car
C. Locomotive
D. Spaceship
E. Transport
F. Train
G. None of these is a valid functional interface.
```

---

## Folha de respostas

Preencha **Resposta**; depois confira no livro (Apêndice *Answers to Review Questions*) e registre os erros em `docs/ocp-study/error-log.md`.

| # | Tópico | Fonte | Resposta | Gabarito | ✔/✘ |
|--:|---|---|---|---|:-:|
| 01 | T2 | `02-making-decisions/QCAP03_06` | | | |
| 02 | T5 | `05-collections-generics/QCAP09_19` | | | |
| 03 | T6 | `07-streams/QCAP10_13` | | | |
| 04 | T3 | `03-methods/QCAP05_10` | | | |
| 05 | T7 | `11-modules/QCAP12_03` | | | |
| 06 | T6 | `06-lambdas-functional-interfaces/QCAP08_02` | | | |
| 07 | T3 | `01-beyond-classes/QCAP07_03` | | | |
| 08 | T8 | `13-concurrency/QCAP13_10` | | | |
| 09 | T3 | `01-class-design/QCAP06_22` | | | |
| 10 | T1 | `14-operators/QCAP02_12` | | | |
| 11 | T2 | `02-making-decisions/QCAP03_26` | | | |
| 12 | T8 | `13-concurrency/QCAP13_08` | | | |
| 13 | T1 | `15-core-apis/QCAP04_08` | | | |
| 14 | T2 | `02-making-decisions/QCAP03_30` | | | |
| 15 | T5 | `15-core-apis/QCAP04_18` | | | |
| 16 | T9 | `09-io-api/QCAP14_14` | | | |
| 17 | T3 | `01-building-blocks/QCAP01_15` | | | |
| 18 | T6 | `07-streams/QCAP10_02` | | | |
| 19 | T3 | `01-beyond-classes/QCAP07_17` | | | |
| 20 | T5 | `05-collections-generics/QCAP09_15` | | | |
| 21 | T3 | `03-methods/QCAP05_19` | | | |
| 22 | T1 | `14-operators/QCAP02_15` | | | |
| 23 | T3 | `03-methods/QCAP05_02` | | | |
| 24 | T7 | `11-modules/QCAP12_25` | | | |
| 25 | T4 | `04-exceptions-localization/QCAP11_23` | | | |
| 26 | T1 | `01-building-blocks/QCAP01_16` | | | |
| 27 | T3 | `01-class-design/QCAP06_02` | | | |
| 28 | T7 | `01-building-blocks/QCAP01_13` | | | |
| 29 | T10 | `04-exceptions-localization/QCAP11_06` | | | |
| 30 | T7 | `11-modules/QCAP12_09` | | | |
| 31 | T4 | `04-exceptions-localization/QCAP11_26` | | | |
| 32 | T9 | `09-io-api/QCAP14_18` | | | |
| 33 | T6 | `06-lambdas-functional-interfaces/QCAP08_05` | | | |
| 34 | T8 | `13-concurrency/QCAP13_09` | | | |
| 35 | T3 | `03-methods/QCAP05_20` | | | |
| 36 | T5 | `05-collections-generics/QCAP09_02` | | | |
| 37 | T6 | `07-streams/QCAP10_07` | | | |
| 38 | T4 | `04-exceptions-localization/QCAP11_20` | | | |
| 39 | T9 | `09-io-api/QCAP14_23` | | | |
| 40 | T6 | `07-streams/QCAP10_12` | | | |
| 41 | T8 | `13-concurrency/QCAP13_24` | | | |
| 42 | T3 | `01-class-design/QCAP06_24` | | | |
| 43 | T4 | `04-exceptions-localization/QCAP11_24` | | | |
| 44 | T2 | `02-making-decisions/QCAP03_12` | | | |
| 45 | T1 | `14-operators/QCAP02_09` | | | |
| 46 | T1 | `14-operators/QCAP02_05` | | | |
| 47 | T5 | `05-collections-generics/QCAP09_07` | | | |
| 48 | T10 | `04-exceptions-localization/QCAP11_17` | | | |
| 49 | T3 | `01-beyond-classes/QCAP07_04` | | | |
| 50 | T6 | `06-lambdas-functional-interfaces/QCAP08_21` | | | |

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
