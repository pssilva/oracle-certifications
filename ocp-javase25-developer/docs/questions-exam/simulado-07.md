# Simulado 07 — 1Z0-831 Java SE 25 Developer Professional

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
What is the result of the following code?

1:    interface Climb {
2:          boolean isTooHigh(int height, int limit);
3:    }
4:
5:    public class Climber {
6:          public static void main(String[] args) {
7:                check((h, m) -> h.append(m).isEmpty(), 5);
8:          }
9:          private static void check(Climb climb, int height) {
10:              if (climb.isTooHigh(height, 10))
11:                    System.out.println("too high");
12:              else
13:                    System.out.println("ok");
14:        }
15: }

A. ok
B. too high
C. Compiler error on line 7.
D. Compiler error on line 10.
E. Compiler error on a different line.
F. A runtime exception is thrown.
```

## Questão 02

```text
Which of the following compiles and prints out the entire set?

Set<?> set = Set.of("lion", "tiger", "bear");
var s = Set.copyOf(set);
Consumer<Object> consumer =    ________________;
s.forEach(consumer);

A. () -> System.out.println(s)
B. s -> System.out.println(s)
C. (s) -> System.out.println(s)
D. System.out.println(s)
E. System::out::println
F. System.out::println
```

## Questão 03

```text
Which of the following are true about arrays? (Choose all that apply.)

A. The first element is index 0.
B. The first element is index 1.
C. Arrays are fixed size.
D. Arrays are immutable.
E. Calling equals() on two different arrays containing the same primitive values always returns true.
F. Calling equals() on two different arrays containing the same primitive values always returns false.
G. Calling equals() on two different arrays containing the same primitive values can return true or false.
```

## Questão 04

```text
Given the following code snippet, what are the values of the variables after it is executed? (Choose all that apply.)

int ticketsTaken = 1;
int ticketsSold = 3;
ticketsSold += 1 + ticketsTaken++;
ticketsTaken *= 2;
ticketsSold += (long)1;

A. ticketsSold is 8.
B. ticketsTaken is 2.
C. ticketsSold is 6.
D. ticketsTaken is 6.
E. ticketsSold is 7.
F. ticketsTaken is 4.
G. The code does not compile.
```

## Questão 05

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

## Questão 06

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

## Questão 07

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

## Questão 08

```text
What is the output of the following program?

1:    class Mammal {
2:          private void sneeze() {}
3:          public Mammal(int age) {
4:                System.out.print("Mammal");
5:          } }
6:    public class Platypus extends Mammal {
7:          int sneeze() { return 1; }
8:          public Platypus() {
9:                System.out.print("Platypus");
10:        }
11:        public static void main(String[] args) {
12:              new Mammal(5);
13:        } }

A. Platypus
B. Mammal
C. PlatypusMammal
D. MammalPlatypus
E. The code will compile if line 7 is changed.
F. The code will compile if line 9 is changed.
```

## Questão 09

```text
What is the output of the following code?

1:    class Arthropod {
2:          protected void printName(long input) {
3:                System.out.print("Arthropod");
4:          }
5:          void printName(int input) {
6:                System.out.print("Spooky");
7:          } }
8:    public class Spider extends Arthropod {
9:          protected void printName(int input) {
10:              System.out.print("Spider");
11:        }
12:        public static void main(String[] args) {
13:              Arthropod a = new Spider();
14:              a.printName((short)4);
15:              a.printName(4);
16:              a.printName(5L);
17:        } }

A. SpiderSpiderArthropod
B. SpiderSpiderSpider
C. SpiderSpookyArthropod
D. SpookySpiderArthropod
E. The code will not compile because of line 5.
F. The code will not compile because of line 9.
G. None of the above.
```

## Questão 10

```text
How many of these lines contain a compiler error?

23: int one = Math.min(5, 3);
24: long two = Math.round(5.5);
25: double three = Math.floor(6.6);
26: var doubles = new double[] {one, two, three};

A. 0
B. 1
C. 2
D. 3
E. 4
```

## Questão 11

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

## Questão 12

```text
Suppose module puppy depends on module dog and module dog depends on module animal. Fill in the blank so that code in module dog can access the animal.behavior package in module animal.

module animal {
    _________ animal.behavior;
}

A. export
B. exports
C. require
D. requires
E. require transitive
F. requires transitive
G. None of the above
```

## Questão 13

```text
What distinct numbers are printed when the following method is executed? (Choose all that apply.)

private void countAttendees() {
      int participants = 4, animals = 2, performers = -1;
  
      while ((participants = participants + 1) < 10) {}
      do {} while (animals++ <= 1);
      for ( ; performers < 2; performers += 2) {}
  
      System.out.println(participants);
      System.out.println(animals);
      System.out.println(performers);
}

A. 6
B. 3
C. 4
D. 5
E. 10
F. 9
G. The code does not compile.
H. None of the above.
```

## Questão 14

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

## Questão 15

```text
Which of the following expressions, when inserted independently into the blank line, allow the code to compile? (Choose all that apply.)

public void printMagicData() {
      var magic = ;
      System.out.println(magic);
}

A. 3_1
B. 1_329_.0
C. 3_13.0_
D. 5_291._2
E. 2_234.0_0
F. 9___6
G. _1_3_5_0
```

## Questão 16

```text
Which of the following can fill in the blank to print [7, 5, 3]? (Choose all that apply.)

8:  public record Platypus(String name, int beakLength) {
9:     @Override public String toString() {return "" + beakLength;}
10:
11:    public static void main(String[] args) {
12:       Platypus p1 = new Platypus("Paula", 3);
13:       Platypus p2 = new Platypus("Peter", 5);
14:       Platypus p3 = new Platypus("Peter", 7);
15:
16:       List<Platypus> list = Arrays.asList(p1, p2, p3);
17:
18:       Collections.sort(list, Comparator.comparing_______________);
19:
20:       System.out.println(list);
21:    }
22: }

A. (Platypus::beakLength)

B. (Platypus::beakLength).reversed()

C. (Platypus::name)
   .thenComparing(Platypus::beakLength)

D. (Platypus::name)
   .thenComparing(
   Comparator.comparing(Platypus::beakLength)
   .reversed())

E. (Platypus::name)
   .thenComparingNumber(Platypus::beakLength)
   .reversed()

F. (Platypus::name)
   .thenComparingInt(Platypus::beakLength)
   .reversed()
```

## Questão 17

```text
Which of the following are output by this code? (Choose all that apply.)

3: var s = "Hello";
4: var t = new String(s);
5: if ("Hello".equals(s)) System.out.println("one");
6: if (t == s) System.out.println("two");
7: if (t.intern() == s) System.out.println("three");
8: if ("Hello" == s) System.out.println("four");
9: if ("Hello".intern() == t) System.out.println("five");

A. one
B. two
C. three
D. four
E. five
F. The code does not compile.
H. None of the above.
```

## Questão 18

```text
Given the following program, what can be inserted into the blank line that would allow it to print Swim! at runtime?

interface Swim {
      default void perform() { System.out.print("Swim!"); }
}
interface Dance {
      default void perform() { System.out.print("Dance!"); }
}
public class Penguin implements Swim, Dance {
      public void perform() { System.out.print("Smile!"); }
      private void doShow() {
            ____________________;
      }
      public static void main(String[] eggs) {
            new Penguin().doShow();
      } }

A. super.perform()
B. Swim.perform()
C. super.Swim.perform()
D. Swim.super.perform()
E. The code does not compile regardless of what is inserted into the blank.
F. The code compiles, but due to polymorphism, it is not possible to produce the requested output without creating a new object.
```

## Questão 19

```text
Given the four statements (L, M, N, O), select the order that would cause the code to output 10 lines.

Stream.generate(() -> "1")
   L: .filter(x -> x.length()> 1)
   M: .forEach(System.out::println)
   N: .limit(10)
   O: .peek(System.out::println)
;

A. L, N
B. L, N, O
C. L, N, M
D. L, N, M, O
E. L, O, M
F. N, M
G. N, O
```

## Questão 20

```text
What is the result of executing the following program?

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;
public class PrintCounter {
   static int count = 0;
   public static void main(String[] args) throws
                     InterruptedException, ExecutionException {
      try (var service = Executors.newSingleThreadExecutor()) {
         var r = new ArrayList<Future<?>>();
         IntStream.iterate(0,i -> i + 1).limit(5).forEach(
            i -> r.add(service.execute(() -> {count++;})) // n1
         );
         for (Future<?> result : r) {
            System.out.print(result.get() + " "); // n2
         }
      }
   } }

A. It prints 0 1 2 3 4
B. It prints 1 2 3 4 5
C. It prints null null null null null
D. It hangs indefinitely at runtime.
E. The output cannot be determined.
F. The code will not compile because of line n1.
G. The code will not compile because of line n2.
```

## Questão 21

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

## Questão 22

```text
Which statement about the following class is correct?

1:    class Problem extends Exception {
2:          public Problem() {}
3:    }
4:    class YesProblem extends Problem {}
5:    public class MyDatabase {
6:          public static void connectToDatabase() throw Problem {
7:                throws new YesProblem();
8:          }
9:          public static void main(String[] c) throw Exception {
10:              connectToDatabase();
11:        }
12: }

A. The code compiles and prints a stack trace for YesProblem at runtime.
B. The code compiles and prints a stack trace for Problem at runtime.
C. The code does not compile because Problem defines a constructor.
D. The code does not compile because YesProblem does not define a constructor.
E. The code does not compile but would if Problem and YesProblem were switched on lines 6 and 7.
F. None of the above.
```

## Questão 23

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

## Questão 24

```text
Which of the following can replace line 2 to make this code compile?

1: import java.util.*;
2: // INSERT CODE HERE
3: public class Imports {
4:    public void method(ArrayList<String> list) {
5:       sort(list);
6:    }
7: }

A. import static java.util.Collections;
B. import static java.util.Collections.*;
C. import static java.util.Collections.sort(ArrayList<String>);
D. static import java.util.Collections;
E. static import java.util.Collections.*;
F. static import java.util.Collections.sort(ArrayList<String>);
```

## Questão 25

```text
What is the result of the following program?

1:  public class Squares {
2:     public static long square(int x) {
3:        var y = x * (long) x;
4:        x = -1;
5:        return y;
6:     }
7:     public static void main(String[] args) {
8:        var value = 9;
9:        var result = square(value);
10:       System.out.println(value);
11:    } }

A. -1
B. 9
C. 81
D. Compiler error on line 9
E. Compiler error on a different line
```

## Questão 26

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

## Questão 27

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

## Questão 28

```text
What is the output of calling printLocation(Animal.MAMMAL)?

10: class Zoo {
11:        enum Animal {BIRD, FISH, MAMMAL}
12:        void printLocation(Animal a) {
13:              long type = switch (a) {
14:                    case BIRD -> 1;
15:                    case FISH -> 2;
16:                    case MAMMAL -> 3;
17:                    default -> 4;
18:              };
19:              System.out.print(type);
20:        } }

A. 3
B. 4
C. 34
D. The code does not compile because of line 13.
E. The code does not compile because of line 17.
F. None of the above.
```

## Questão 29

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

## Questão 30

```text
What statement about the following code is true?

System.out.print(List.of("duck","flamingo","pelican")
   .parallelStream().parallel()   // q1
   .reduce(0,
      (c1, c2) -> c1.length() + c2.length(),  // q2
      (s1, s2) -> s1 + s2));      // q3

A. It compiles and runs without issue, outputting the total length of all strings in the stream.
B. The code will not compile because of line q1.
C. The code will not compile because of line q2.
D. The code will not compile because of line q3.
E. It compiles but throws an exception at runtime.
F. None of the above.
```

## Questão 31

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

## Questão 32

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

## Questão 33

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

## Questão 34

```text
Which of the following statements can be inserted in the blank line so that the code will compile successfully? (Choose all that apply.)

interface CanHop {}
public class Frog implements CanHop {
      public static void main(String[] args) {
            ____________ frog = new TurtleFrog();
      }
}

class BrazilianHornedFrog extends Frog {}
class TurtleFrog extends Frog {}

A. Frog
B. TurtleFrog
C. BrazilianHornedFrog
D. CanHop
E. var
F. Long
G. None of the above; the code contains a compilation error.
```

## Questão 35

```text
Which of the following are true statements about exception handling in Java? (Choose all that apply.)

A. A traditional try statement without a catch block requires a finally block.
B. A traditional try statement without a finally block requires a catch block.
C. A traditional try statement with only one statement can omit the {}.
D. A try-with-resources statement without a catch block requires a finally block.
E. A try-with-resources statement without a finally block requires a catch block.
F. A try-with-resources statement with only one statement can omit the {}.
```

## Questão 36

```text
What is the result of executing the following code? (Choose all that apply.)

4: var p = Path.of("sloth.schedule");
5: var a = Files.readAttributes(p, BasicFileAttributes.class);
6: Files.mkdir(p.resolve(".backup"));
7: if(a.size()>0 && a.isDirectory()) {
8:    a.setTimes(null,null,null);
9: }

A. It compiles and runs without issue.
B. The code will not compile because of line 5.
C. The code will not compile because of line 6.
D. The code will not compile because of line 7.
E. The code will not compile because of line 8.
F. None of the above.
```

## Questão 37

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

## Questão 38

```text
Which scenario is the best use of an exception?

A. An element is not found when searching a list.
B. An unexpected parameter is passed into a method.
C. The computer caught fire.
D. You want to loop through a list.
E. You don’t know how to code a method.
```

## Questão 39

```text
Which of the following can we add after line 6 for the code to run without error and not produce any output? (Choose all that apply.)

4: var stream = LongStream.of(1, 2, 3);
5: var opt = stream.map(n -> n * 10)
6:    .filter(n -> n < 5).findFirst();

A. if (opt.isPresent())
   System.out.println(opt.get());

B. if (opt.isPresent())
   System.out.println(opt.getAsLong());

C. opt.ifPresent(System.out.println);
D. opt.ifPresent(System.out::println);
E. None of these; the code does not compile.
F. None of these; line 6 throws an exception at runtime.
```

## Questão 40

```text
What is the output of this code?

13: record Gorilla(int x, Double y) {
14:        Gorilla {}
15:        Gorilla() { this(1,2.0); }
16: }
17: record Family(Gorilla parent1, Gorilla parent2) {}
18:
19: var family = new Family(
20:        new Gorilla(1, null), new Gorilla(0, 1.2));
21: System.out.print(switch (family) {
22:        case Family(var a, var b) -> "1";
23:        case Family(Gorilla c, Gorilla (int d, double e)) -> "2";
24:        case Family(Gorilla (int f, Double g), var h) -> "3";
25:        case Family(Gorilla i, Gorilla (int j, Double k)) -> "4";
26:        case Family(Object m, Object n) -> "5";
27:        case null -> "6";
28:        default -> "7";
29: });

A. 1
B. 2
C. 3
D. 4
E. 5
F. 6
G. 7
H. None of the above
```

## Questão 41

```text
Assuming the following class compiles, how many variables defined in the class or method are in scope on the line marked on line 14?

1:    public class Camel {
2:          { int hairs = 3_000_0; }
3:          long water, air=2;
4:          boolean twoHumps = true;
5:          public void spit(float distance) {
6:                var path = "";
7:                { double teeth = 32 + distance++; }
8:                while(water> 0) {
9:                      int age = twoHumps ? 1 : 2;
10:                    short i=-1;
11:                    for(i=0; i<10; i++) {
12:                          var Private = 2;
13:                    }
14:                    // SCOPE
15:              }
16:        }
17: }

A. 2
B. 3
C. 4
D. 5
E. 6
F. 7
G. None of the above
```

## Questão 42

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

## Questão 43

```text
What is the result of executing the following application?

import java.util.concurrent.*;
import java.util.stream.*;
public class StockRoomTracker {
   public static void await(CyclicBarrier cb) { // j1
      try { cb.await(); } catch (Exception e) {}
   }
   public static void main(String[] args) {
      var cb = new CyclicBarrier(10,
         () -> System.out.println("Stock Room Full!")); // j2
      IntStream.iterate(1, i -> 1).limit(9).parallel()
         .forEach(i -> await(cb)); // j3
   } }

A. It outputs Stock Room Full!
B. The code will not compile because of line j1.
C. The code will not compile because of line j2.
D. The code will not compile because of line j3.
E. It compiles but throws an exception at runtime.
F. It compiles but waits forever at runtime.
```

## Questão 44

```text
Which of the following, when inserted independently in the blank, use locale parameters that are properly formatted? (Choose all that apply.)

import java.util.Locale;
public class ReadMap implements AutoCloseable {
      private Locale locale;
      private boolean closed = false;
      @Override public void close() {
            System.out.println("Folding map");
            locale = null;
            closed = true;
      }
      public void open() {
            this.locale = ____________;
      }
      public void use() {
            // Implementation omitted
      }
}

A. Locale.of("xM")
B. Locale.of("MQ", "ks")
C. Locale.of("qw")
D. Locale.of("wp", "VW")
E. Locale.create("zp")
F. new Locale.Builder().setLanguage("yw").setRegion("PM")
G. The code does not compile regardless of what is placed in the blank.
```

## Questão 45

```text
For a top-down migration, all modules other than named modules are _____________ modules and are on the _____________.

A. automatic, classpath
B. automatic, module path
C. unnamed, classpath
D. unnamed, module path
E. None of the above
```

## Questão 46

```text
What could be the output of the following?

var stream = Stream.iterate("", (s) -> s + "1");
System.out.println(stream.limit(2).map(x -> x + "2"));

A. 12112
B. 212
C. 212112
D. java.util.stream.ReferencePipeline$3@4517d9a3
E. The code does not compile.
F. An exception is thrown.
G. The code hangs.
```

## Questão 47

```text
Which of the following lambda expressions can be passed to a function of Predicate<String> type? (Choose all that apply.)

A. s -> s.isEmpty()
B. s --> s.isEmpty()
C. (String s) -> s.isEmpty()
D. (String s) --> s.isEmpty()
E. (StringBuilder s) -> s.isEmpty()
F. (StringBuilder s) --> s.isEmpty()
```

## Questão 48

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

## Questão 49

```text
Which classes will allow the following to compile? (Choose all that apply.)

var is = new BufferedInputStream(new FileInputStream("z.txt"));
InputStream wrapper = new ____________________________________________ (is);
try (wrapper) {}

A. BufferedInputStream
B. BufferedReader
C. BufferedWriter
D. FileInputStream
E. ObjectInputStream
F. ObjectOutputStream
G. None of the above, as the first line does not compile
```

## Questão 50

```text
Suppose you have separate modules for a service provider interface, service provider, service locator, and consumer. If you add a second service provider module, how many of the existing modules do you need to recompile?

A. Zero
B. One
C. Two
D. Three
E. Four
```

---

## Folha de respostas

Preencha **Resposta**; depois confira no livro (Apêndice *Answers to Review Questions*) e registre os erros em `docs/ocp-study/error-log.md`.

| # | Tópico | Fonte | Resposta | Gabarito | ✔/✘ |
|--:|---|---|---|---|:-:|
| 01 | T6 | `06-lambdas-functional-interfaces/QCAP08_02` | | | |
| 02 | T6 | `06-lambdas-functional-interfaces/QCAP08_19` | | | |
| 03 | T5 | `15-core-apis/QCAP04_09` | | | |
| 04 | T1 | `14-operators/QCAP02_17` | | | |
| 05 | T5 | `05-collections-generics/QCAP09_08` | | | |
| 06 | T3 | `01-beyond-classes/QCAP07_22` | | | |
| 07 | T10 | `04-exceptions-localization/QCAP11_08` | | | |
| 08 | T3 | `01-class-design/QCAP06_04` | | | |
| 09 | T3 | `01-class-design/QCAP06_07` | | | |
| 10 | T1 | `15-core-apis/QCAP04_10` | | | |
| 11 | T2 | `02-making-decisions/QCAP03_03` | | | |
| 12 | T7 | `11-modules/QCAP12_02` | | | |
| 13 | T2 | `02-making-decisions/QCAP03_18` | | | |
| 14 | T8 | `13-concurrency/QCAP13_08` | | | |
| 15 | T1 | `01-building-blocks/QCAP01_10` | | | |
| 16 | T5 | `05-collections-generics/QCAP09_06` | | | |
| 17 | T1 | `15-core-apis/QCAP04_04` | | | |
| 18 | T3 | `01-beyond-classes/QCAP07_23` | | | |
| 19 | T6 | `07-streams/QCAP10_10` | | | |
| 20 | T8 | `13-concurrency/QCAP13_20` | | | |
| 21 | T1 | `15-core-apis/QCAP04_06` | | | |
| 22 | T4 | `04-exceptions-localization/QCAP11_02` | | | |
| 23 | T4 | `04-exceptions-localization/QCAP11_04` | | | |
| 24 | T3 | `03-methods/QCAP05_15` | | | |
| 25 | T3 | `03-methods/QCAP05_17` | | | |
| 26 | T7 | `11-modules/QCAP12_11` | | | |
| 27 | T6 | `06-lambdas-functional-interfaces/QCAP08_21` | | | |
| 28 | T2 | `02-making-decisions/QCAP03_11` | | | |
| 29 | T5 | `05-collections-generics/QCAP09_18` | | | |
| 30 | T8 | `13-concurrency/QCAP13_13` | | | |
| 31 | T3 | `03-methods/QCAP05_13` | | | |
| 32 | T1 | `15-core-apis/QCAP04_19` | | | |
| 33 | T5 | `05-collections-generics/QCAP09_14` | | | |
| 34 | T3 | `01-beyond-classes/QCAP07_02` | | | |
| 35 | T4 | `04-exceptions-localization/QCAP11_13` | | | |
| 36 | T9 | `09-io-api/QCAP14_12` | | | |
| 37 | T3 | `01-class-design/QCAP06_10` | | | |
| 38 | T4 | `04-exceptions-localization/QCAP11_10` | | | |
| 39 | T6 | `07-streams/QCAP10_09` | | | |
| 40 | T3 | `01-beyond-classes/QCAP07_20` | | | |
| 41 | T3 | `01-building-blocks/QCAP01_06` | | | |
| 42 | T9 | `09-io-api/QCAP14_15` | | | |
| 43 | T8 | `13-concurrency/QCAP13_23` | | | |
| 44 | T10 | `04-exceptions-localization/QCAP11_15` | | | |
| 45 | T7 | `11-modules/QCAP12_15` | | | |
| 46 | T6 | `07-streams/QCAP10_01` | | | |
| 47 | T6 | `06-lambdas-functional-interfaces/QCAP08_06` | | | |
| 48 | T2 | `02-making-decisions/QCAP03_05` | | | |
| 49 | T9 | `09-io-api/QCAP14_11` | | | |
| 50 | T7 | `11-modules/QCAP12_16` | | | |

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
