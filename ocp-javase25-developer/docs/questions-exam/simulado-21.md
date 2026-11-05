# Simulado 21 — 1Z0-831 Java SE 25 Developer Professional

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
Which of the following is equivalent to this code?

A. UnaryOperator<Integer> u = x -> x * x;
B. BiFunction<Integer> f = x -> x*x;
C. BiFunction<Integer, Integer> f = x -> x*x;
D. BinaryOperator<Integer, Integer> f = x -> x*x;
E. Function<Integer> f = x -> x*x;
F. Function<Integer, Integer> f = x -> x*x;
G. None of the above
```

## Questão 02

```text
What is the output of the following code?

try {
      LocalDateTime book = LocalDateTime.of(2025, 4, 5, 12, 30, 20);
      System.out.print(book.format(DateTimeFormatter.ofPattern("m")));
      System.out.print(book.format(DateTimeFormatter.ofPattern("z")));
      System.out.print(DateTimeFormatter.ofPattern("y").format(book));
} catch (Throwable e) {}

A. 4
B. 30
C. 402
D. 3002
E. 3002025
F. 402025
G. None of the above
```

## Questão 03

```text
Which of the following are valid record declarations? (Choose all that apply.)

public record Iguana(int age) {
      private static final int age = 10; }
  
public final record Gecko() {}
  
public abstract record Chameleon()    {
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

## Questão 04

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

## Questão 05

```text
What does the following method print?

11: public void tryAgain(String s) {
12:        try (FileReader r = null, p = new FileReader("")) {
13:              System.out.print("X");
14:              throw new IllegalArgumentException();
15:        } catch (Exception s) {
16:              System.out.print("A");
17:              throw new FileNotFoundException();
18:        } finally {
19:              System.out.print("O");
20:        }
21: }

A. XAO
B. XOA
C. One line of this method contains a compiler error.
D. Two lines of this method contain compiler errors.
E. Three or more lines of this method contain compiler errors.
F. The code compiles, but a NullPointerException is thrown at runtime.
G. None of the above.
```

## Questão 06

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

## Questão 07

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

## Questão 08

```text
How many lines in the following code have compiler errors?

1:  public class RopeSwing {
2:     private static final String leftRope;
3:     private static final String rightRope;
4:     private static final String bench;
5:     private static final String name = "name";
6:     static {
7:        leftRope = "left";
8:        rightRope = "right";
9:     }
10:    static {
11:       name = "name";
12:       rightRope = "right";
13:    }
14:    public static void main(String[] args) {
15:       bench = "bench";
16:    }
17: }

A. 0
B. 1
C. 2
D. 3
E. 4
F. 5
```

## Questão 09

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

## Questão 10

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

## Questão 11

```text
What is the output of the following code snippet?

2: double iguana = 0;
3: do {
4:        int snake = 1;
5:        System.out.print(snake++ + " ");
6:        iguana--;
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

## Questão 12

```text
What is the result of compiling and executing the following code?

1:    public class Movie {
2:          private int butter = 5;
3:          private Movie() {}
4:          protected class Popcorn {
5:                private Popcorn() {}
6:                public static int butter = 10;
7:                public void startMovie() {
8:                      System.out.println(butter);
9:                }
10:        }
11:        public static void main(String[] args) {
12:              var movie = new Movie();
13:              Movie.Popcorn in = new Movie().new Popcorn();
14:              in.startMovie();
15:        } }

A. The output is 5.
B. The output is 10.
C. Line 6 generates a compiler error.
D. Line 12 generates a compiler error.
E. Line 13 generates a compiler error.
F. The code compiles but produces an exception at runtime.
```

## Questão 13

```text
Given the following method and file1 data, which statements are correct? (Choose all that apply.)

// file1 data
ABCDEF
 
public void copyFile(File file1, File file2) throws Exception {
   var reader = new InputStreamReader(new FileInputStream(file1));
   try (var writer = new FileWriter(file2)) {
      char[] buffer = new char[5];
      while(reader.read(buffer) != -1) {
          writer.write(buffer);
          // n1
      }
   }
}

A. The code does not compile because reader is not a buffered stream.
B. The code does not compile because writer is not a buffered stream.
C. The contents of the copied file are: ABCDEF
D. The contents of the copied file are: ABCDEFBCDE
E. The contents of the copied file cannot be determined.
F. If we check file2 on line n1 within the file system after five iterations of the while loop, it may be empty.
G. If we check file2 on line n1 within the file system after five iterations, it will contain exactly 50 characters.
H. This method contains a resource leak.
```

## Questão 14

```text
Which line allows the code to print Not scared at runtime?

public class Ghost {
      public static void boo() {
            System.out.println("Not scared");
      }
      protected final class Spirit {
            public void boo() {
                  System.out.println("Booo!!!");
            }
      }
      public static void main(String… haunt) {
            var g = new Ghost().new Spirit() {};
            _______________________________;
      } }

A. g.boo()
B. g.super.boo()
C. new Ghost().boo()
D. g.Ghost.boo()
E. new Spirit().boo()
F. None of the above
```

## Questão 15

```text
Which statement is true of the following module?

|---zoo
   |-- staff
      |-- Vet.java

A. The directory structure shown is a valid module.
B. The directory structure would be a valid module if module.java were added directly underneath zoo/staff.
C. The directory structure would be a valid module if module.java were added directly underneath zoo.
D. The directory structure would be a valid module if module-info.java were added directly underneath zoo/staff.
E. The directory structure would be a valid module if module-info.java were added directly underneath zoo.
F. None of these changes would make this directory structure a valid module.
```

## Questão 16

```text
Which statement about methods in ReentrantLock is correct?

A. The lock() method will attempt to acquire a lock without waiting indefinitely for it.
B. The testLock() method will attempt to acquire a lock without waiting indefinitely for it.
C. The attemptLock() method will attempt to acquire a lock without waiting indefinitely for it.
D. By default, a ReentrantLock fairly releases to each thread in the order in which it was requested.
E. Calling the unlock() method once will release a resource so that other threads can obtain the lock.
F. None of the above.
```

## Questão 17

```text
The following code appears in a file named Ostrich.java. What is the result of compiling the source file?

1: public class Ostrich {
2:        private int count;
3:        static class OstrichWrangler {
4:              public int stampede() {
5:                    return count;
6:              } } }

A. The code compiles successfully, and one bytecode file is generated: Ostrich.class.
B. The code compiles successfully, and two bytecode files are generated: Ostrich.class and OstrichWrangler.class.
C. The code compiles successfully, and two bytecode files are generated: Ostrich.class and Ostrich$OstrichWrangler.class.
D. A compiler error occurs on line 3.
E. A compiler error occurs on line 5.
```

## Questão 18

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

## Questão 19

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

## Questão 20

```text
Which of the following are legal entry point methods that can be run from the command line? (Choose all that apply.)

A. private static void main(String[] args)
B. public static final main(String[] args)
C. public void main(String[] args)
D. public static final void main(String[] args)
E. public static void main(String[] args)
F. public static main(String[] args)
```

## Questão 21

```text
What is printed by the following program?

1:    public class DriveBus {
2:          public void go() {
3:                System.out.print("A");
4:                try {
5:                      stop();
6:                } catch (ArithmeticException e) {
7:                      System.out.print("B");
8:                } finally {
9:                      System.out.print("C");
10:              }
11:              System.out.print("D");
12:        }
13:        public void stop() {
14:              System.out.print("E");
15:              Object x = null;
16:              x.toString();
17:              System.out.print("F");
18:        }
19:        public static void main(String n[]) {
20:              new DriveBus().go();
21:        } }

A. AE
B. AEBCD
C. AEC
D. AECD
E. AE followed by a stack trace
F. AEBCD followed by a stack trace
G. AEC followed by a stack trace
H. A stack trace with no other output
```

## Questão 22

```text
What is the output of the following code snippet?

2: var tailFeathers = 3;
3: final var one = 1;
4: switch (tailFeathers) {
5:        case one: System.out.print(3 + " ");
6:        default: case 3: System.out.print(5 + " ");
7: }
8: while (tailFeathers> 1) {
9:        System.out.print(--tailFeathers + " "); }

A. 3
B. 5 1
C. 5 2
D. 3 5 1
E. 5 2 1
F. The code will not compile because of lines 3–5.
H. The code will not compile because of line 6.
```

## Questão 23

```text
Which of the following can fill in the blank to print avaJ? (Choose all that apply.)

3: var puzzle = new StringBuilder("Java");
4: puzzle._________________________;
5: System.out.println(puzzle);

A. reverse()
B. append("vaJ$").substring(0, 4)
C. append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1)
D. append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length())
E. None of the above
```

## Questão 24

```text
Which statements about the following classes are correct? (Choose all that apply.)

1:    public class Mammal {
2:          private void eat() {}
3:          protected static void drink() {}
4:          public Integer dance(String p) { return null; }
5:    }
6:    class Primate extends Mammal {
7:          public void eat(String p) {}
8:    }
9:    class Monkey extends Primate {
10:        public static void drink() throws RuntimeException {}
11:        public Number dance(CharSequence p) { return null; }
12:        public int eat(String p) {}
13: }

A. The eat() method in Mammal is correctly overridden on line 7.
B. The eat() method in Mammal is correctly overloaded on line 7.
C. The drink() method in Mammal is correctly overridden on line 10.
D. The drink() method in Mammal is correctly hidden on line 10.
E. The dance() method in Mammal is correctly overridden on line 11.
F. The dance() method in Mammal is correctly overloaded on line 11.
G. The eat() method in Primate is correctly hidden on line 12.
H. The eat() method in Primate is correctly overloaded on line 12.
```

## Questão 25

```text
Which of the following is printed by the Bear program?

public class Bear {
      enum FOOD {
            BERRIES, INSECTS {
                  public boolean isHealthy() { return true; }},
            FISH, ROOTS, COOKIES, HONEY;
            public abstract boolean isHealthy();
      }
      public static void main(String[] args) {
            System.out.print(FOOD.INSECTS);
            System.out.print(FOOD.INSECTS.ordinal());
            System.out.print(FOOD.INSECTS.isHealthy());
            System.out.print(FOOD.COOKIES.isHealthy());
      } }

A. insects
B. Insects
C. 0
D. 1
E. false
F. The code does not compile.
```

## Questão 26

```text
Assuming that the /fox/food-schedule.csv file exists with the specified contents, what is the expected output of calling printData() on it?

/fox/food-schedule.csv
6am,Breakfast
9am,SecondBreakfast
12pm,Lunch
6pm,Dinner
 
void printData(Path path) throws IOException {
   Files.readAllLines(path) // r1
      .flatMap(p -> Stream.of(p.split(","))) // r2
       .map(q -> q.toUpperCase())  // r3
       .forEach(System.out::println);
}

A. The code will not compile because of line r1.
B. The code will not compile because of line r2.
C. The code will not compile because of line r3.
D. It throws an exception at runtime.
E. It does not print anything at runtime.
F. None of the above.
```

## Questão 27

```text
A(n) _____________ module is on the classpath while a(n) _____________ module is on the module path. (Choose all that apply.)

A. automatic, named
B. automatic, unnamed
C. named, automatic
D. named, unnamed
E. unnamed, automatic
F. unnamed, named
G. None of the above
```

## Questão 28

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

## Questão 29

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

## Questão 30

```text
What is the output of the following code snippet?

32: Object skips = 10;
33: switch (skips) {
34:        case a when a < 10    -> System.out.print(2);
35:        case b when b>= 10 -> System.out.print(4);
36:        case null -> System.out.print(6);
37:        default      -> System.out.print(8);
38: }

A. 2
B. 4
C. 6
D. 8
E. Exactly one line does not compile.
F. Exactly two lines do not compile.
G. None of the above.
```

## Questão 31

```text
Which statements are true of the following code? (Choose all that apply.)

1:  public class Rope {
2:     public static void swing() {
3:        System.out.print("swing");
4:     }
5:     public void climb() {
6:        System.out.println("climb");
7:     }
8:     public static void play() {
9:        swing();
10:       climb();
11:    }
12:    public static void main(String[] args) {
13:       Rope rope = new Rope();
14:       rope.play();
15:       Rope rope2 = null;
16:       System.out.print("-");
17:       rope2.play();
18:    } }

A. The code compiles as is.
B. There is exactly one compiler error in the code.
C. There are exactly two compiler errors in the code.
D. If the line(s) with compiler errors are removed, the output is swing-climb.
E. If the line(s) with compiler errors are removed, the output is swing-swing.
F. If the line(s) with compile errors are removed, the code throws a NullPointerException.
```

## Questão 32

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

## Questão 33

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

## Questão 34

```text
Which of the following statements are true? (Choose all that apply.)

A. Comparable is in the java.util package.
B. Comparator is in the java.util package.
C. compare() is in the Comparable interface.
D. compare() is in the Comparator interface.
E. compare() takes one method parameter.
F. compare() takes two method parameters.
```

## Questão 35

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

## Questão 36

```text
What statement about the following code is true?

Integer i1 = List.of(1, 2, 3, 4, 5).stream().findAny().get();
synchronized(i1) { // y1
   Integer i2 = List.of(6, 7, 8, 9, 10)
      .parallelStream()
      .sorted()
      .findAny().get(); // y2
   System.out.println(i1 + " " + i2);
}

A. The first value printed is always 1.
B. The second value printed is always 6.
C. The code will not compile because of line y1.
D. The code will not compile because of line y2.
E. The code compiles but throws an exception at runtime.
F. The output cannot be determined ahead of time.
G. It compiles but waits forever at runtime.
```

## Questão 37

```text
Which functional interfaces complete the following code? For line 7, assume m and n are instances of functional interfaces that exist and have the same type as y. (Choose three.)

6:    _____________ x = String::new;
7:    _____________ y = m.andThen(n);
8:    _____________ z = a -> a + a;

A. BinaryConsumer<String, String>
B. BiConsumer<String, String>
C. BinaryFunction<String, String>
D. BiFunction<String, String>
E. Predicate<String>
F. Supplier<String>
G. UnaryOperator<String>
H. UnaryOperator<String, String>
```

## Questão 38

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

## Questão 39

```text
What is the output of the following?

11: public class Paging {
12:    record Sesame(String name, boolean human)  {
13:       @Override public String toString() {
14:          return name();
15:       }
16:    }
17:    record Page(List<Sesame> list, long count)  {}
18:
19:    public static void main(String[] args) {
20:       var monsters = Stream.of(new Sesame("Elmo", false));
21:       var people = Stream.of(new Sesame("Abby", true));
22:       printPage(monsters, people);
23:    }
24:
25:    private static void printPage(Stream<Sesame> monsters,
26:          Stream<Sesame> people) {
27:       Page page = Stream.concat(monsters, people)
28:          .collect(Collectors.teeing(
29:             Collectors.filtering(s -> s.name().startsWith("E"),
30:                Collectors.toList()),
31:             Collectors.counting(),
32:             (l, c) -> new Page(l, c)));
33:       System.out.println(page);
34:    } }

A. Page[list=[Abby], count=1]
B. Page[list=[Abby], count=2]
C. Page[list=[Elmo], count=1]
D. Page[list=[Elmo], count=2]
E. The code does not compile due to Stream.concat().
F. The code does not compile due to Collectors.teeing().
G. The code does not compile for another reason.
```

## Questão 40

```text
Which of the following declare immutable classes? (Choose all that apply.)

public final class Moose {
      private final int antlers;
}
  
public class Caribou {
      private int antlers = 10;
}
  
public class Reindeer {
      private final int antlers = 5;
}
  
public final class Elk {}
  
public final class Deer {
      private final Object o = new Object();
}

A. Moose
B. Caribou
C. Reindeer
D. Elk
E. Deer
F. None of the above
```

## Questão 41

```text
Suppose you have separate modules for a service provider interface, service provider, service locator, and consumer. Which module(s) need to specify a requires directive on the service provider?

A. Service locator
B. Service provider interface
C. Consumer
D. Consumer and service locator
E. Consumer and service provider
F. Service locator and service provider interface
G. Consumer, service locator, and service provider interface
H. None of the above
```

## Questão 42

```text
Which of these array declarations are not legal? (Choose all that apply.)

A. int[][] scores = new int[5][];
B. Object[][][] cubbies = new Object[3][0][5];
C. String beans[] = new beans[6];
D. java.util.Date[] dates[] = new java.util.Date[2][];
E. int[][] types = new int[];
F. int[][] java = new int[][];
```

## Questão 43

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

## Questão 44

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

## Questão 45

```text
Which of the following are valid lambda expressions? (Choose all that apply.)

A. (Wolf w, var c) -> 39
B. (final Camel c) -> {}
C. (a,b,c) -> {int b = 3; return 2;}
D. (x,y) -> new RuntimeException()
E. (var y) -> return 0;
F. () -> {float r}
G. (Cat a, b) -> {}
```

## Questão 46

```text
What is the result of the following code?

public class Lion {
      public void roar(String roar1, StringBuilder roar2) {
            roar1.concat("!!!");
            roar2.append("!!!");
      }
      public static void main(String[] args) {
            var roar1 = "roar";
            var roar2 = new StringBuilder("roar");
            new Lion().roar(roar1, roar2);
            System.out.println(roar1 + " " + roar2);
} }

A. roar roar
B. roar roar!!!
C. roar!!! Roar
D. roar!!! Roar!!!
E. An exception is thrown.
G. The code does not compile.
```

## Questão 47

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

## Questão 48

```text
Which are true statements? (Choose all that apply.)

A. NIO.2 includes a method to delete an entire directory tree.
B. NIO.2 includes a method to traverse a directory tree.
C. NIO.2 includes methods that are aware of symbolic links.
D. Files.readAttributes() cannot access file system dependent attributes.
E. Files.readAttributes() is often more performant since it reads multiple attributes rather than accessing individual attributes.
F. Files.readAttributes() works with the File object.
```

## Questão 49

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

## Questão 50

```text
Which of the following statements are correct? (Choose all that apply.)

A. The return value of an assignment operation expression can be void.
B. The inequality operator (!=) can be used to compare objects.
C. The equality operator (==) can be used to compare a boolean value with a numeric value.
D. During runtime, the & and | operators may cause only the left side of the expression to be evaluated.
E. The return value of an assignment operation expression is the value of the newly assigned variable.
F. In Java, 0 and false may be used interchangeably.
G. The logical complement operator (!) cannot be used to flip numeric values.
```

---

## Folha de respostas

Preencha **Resposta**; depois confira no livro (Apêndice *Answers to Review Questions*) e registre os erros em `docs/ocp-study/error-log.md`.

| # | Tópico | Fonte | Resposta | Gabarito | ✔/✘ |
|--:|---|---|---|---|:-:|
| 01 | T6 | `06-lambdas-functional-interfaces/QCAP08_08` | | | |
| 02 | T10 | `04-exceptions-localization/QCAP11_22` | | | |
| 03 | T3 | `01-beyond-classes/QCAP07_01` | | | |
| 04 | T1 | `15-core-apis/QCAP04_10` | | | |
| 05 | T4 | `04-exceptions-localization/QCAP11_07` | | | |
| 06 | T1 | `15-core-apis/QCAP04_06` | | | |
| 07 | T5 | `05-collections-generics/QCAP09_11` | | | |
| 08 | T3 | `03-methods/QCAP05_14` | | | |
| 09 | T6 | `07-streams/QCAP10_03` | | | |
| 10 | T3 | `03-methods/QCAP05_18` | | | |
| 11 | T2 | `02-making-decisions/QCAP03_19` | | | |
| 12 | T3 | `01-beyond-classes/QCAP07_11` | | | |
| 13 | T9 | `09-io-api/QCAP14_09` | | | |
| 14 | T3 | `01-beyond-classes/QCAP07_15` | | | |
| 15 | T7 | `11-modules/QCAP12_01` | | | |
| 16 | T8 | `13-concurrency/QCAP13_17` | | | |
| 17 | T3 | `01-beyond-classes/QCAP07_16` | | | |
| 18 | T4 | `04-exceptions-localization/QCAP11_02` | | | |
| 19 | T1 | `14-operators/QCAP02_01` | | | |
| 20 | T7 | `01-building-blocks/QCAP01_01` | | | |
| 21 | T4 | `04-exceptions-localization/QCAP11_20` | | | |
| 22 | T2 | `02-making-decisions/QCAP03_22` | | | |
| 23 | T1 | `15-core-apis/QCAP04_20` | | | |
| 24 | T3 | `01-class-design/QCAP06_18` | | | |
| 25 | T3 | `01-beyond-classes/QCAP07_19` | | | |
| 26 | T9 | `09-io-api/QCAP14_08` | | | |
| 27 | T7 | `11-modules/QCAP12_05` | | | |
| 28 | T10 | `04-exceptions-localization/QCAP11_06` | | | |
| 29 | T4 | `04-exceptions-localization/QCAP11_26` | | | |
| 30 | T2 | `02-making-decisions/QCAP03_01` | | | |
| 31 | T3 | `03-methods/QCAP05_11` | | | |
| 32 | T5 | `05-collections-generics/QCAP09_02` | | | |
| 33 | T8 | `13-concurrency/QCAP13_25` | | | |
| 34 | T5 | `05-collections-generics/QCAP09_21` | | | |
| 35 | T2 | `02-making-decisions/QCAP03_11` | | | |
| 36 | T8 | `13-concurrency/QCAP13_11` | | | |
| 37 | T6 | `06-lambdas-functional-interfaces/QCAP08_18` | | | |
| 38 | T3 | `03-methods/QCAP05_10` | | | |
| 39 | T6 | `07-streams/QCAP10_18` | | | |
| 40 | T3 | `01-class-design/QCAP06_06` | | | |
| 41 | T7 | `11-modules/QCAP12_21` | | | |
| 42 | T5 | `15-core-apis/QCAP04_02` | | | |
| 43 | T6 | `07-streams/QCAP10_01` | | | |
| 44 | T6 | `06-lambdas-functional-interfaces/QCAP08_12` | | | |
| 45 | T6 | `06-lambdas-functional-interfaces/QCAP08_14` | | | |
| 46 | T1 | `15-core-apis/QCAP04_13` | | | |
| 47 | T8 | `13-concurrency/QCAP13_08` | | | |
| 48 | T9 | `09-io-api/QCAP14_17` | | | |
| 49 | T5 | `05-collections-generics/QCAP09_23` | | | |
| 50 | T1 | `14-operators/QCAP02_14` | | | |

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
