# Simulado 14 — 1Z0-831 Java SE 25 Developer Professional

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
What is the result of the following code? (Choose all that apply.)

13: String s1 = """
14:        purr""";
15: String s2 = "";
16:
17: s1.toUpperCase();
18: s1.trim();
19: s1.substring(1, 3);
20: s1 += "two";
21:
22: s2 += 2;
23: s2 += 'c';
24: s2 += false;
25:
26: if ( s2 == "2cfalse") System.out.println("==");
27: if ( s2.equals("2cfalse")) System.out.println("equals");
28: System.out.println(s1.length());

A. 2
B. 4
C. 7
D. 10
E. ==
F. equals
G. An exception is thrown.
H. The code does not compile.
```

## Questão 02

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

## Questão 03

```text
What is the result of the following program?

3:  public class MyComparator implements Comparator<String> {
4:     public int compare(String a, String b) {
5:        return b.toLowerCase().compareTo(a.toLowerCase());
6:     }
7:     public static void main(String[] args) {
8:        String[] values = { "123", "Abb", "aab" };
9:        Arrays.sort(values, new MyComparator());
10:       for (var s: values)
11:          System.out.print(s + " ");
12:    }
13: }

A. Abb aab 123
B. aab Abb 123
C. 123 Abb aab
D. 123 aab Abb
E. The code does not compile.
F. A runtime exception is thrown.
```

## Questão 04

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

## Questão 05

```text
Which of the following lambda expressions are valid Callable expressions? (Choose all that apply.)

A. a -> {return 10;}
B. () -> {String s = "";}
C. () -> 5
D. () -> {return null}
E. () -> "The" + "Zoo"
F. (int count) -> count+1
G. () -> {System.out.print("Giraffe"); return 10;}
```

## Questão 06

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

## Questão 07

```text
Given the following class, which of the following lines of code can independently replace INSERT CODE HERE to make the code compile? (Choose all that apply.)

public class Price {
      public void admission() {
            INSERT CODE HERE
            System.out.print(amount);
            } }

A. int Amount = 0b11;
B. int amount = 9L;
C. int amount = 0xE;
D. int amount = 1_2.0;
E. double amount = 1_0_.0;
F. int amount = 0b101;
G. double amount = 9_2.1_2;
H. double amount = 1_2_.0_0;
```

## Questão 08

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

## Questão 09

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

## Questão 10

```text
Which of the following statements are true about this code? (Choose all that apply.)

20: Predicate<String> empty = String::isEmpty;
21: Predicate<String> notEmpty = empty.negate();
22:
23: var result = Stream.generate(() -> "")
24:    .limit(10)
25:    .filter(notEmpty)
26:    .collect(Collectors.groupingBy(k -> k))
27:    .entrySet()
28:    .stream()
29:    .map(Entry::getValue)
30:    .flatMap(Collection::stream)
31:    .collect(Collectors.partitioningBy(notEmpty));
32: System.out.println(result);

A. It outputs {}.
B. It outputs {false=[], true=[]}.
C. If we changed line 31 from partitioningBy(notEmpty) to groupingBy(n -> n), it would output {}.
D. If we changed line 31 from partitioningBy(notEmpty) to groupingBy(n -> n), it would output {false=[], true=[]}.
E. The code does not compile.
F. The code compiles but does not terminate at runtime.
```

## Questão 11

```text
Which of the following can be inserted on line 8 to make this code compile? (Choose all that apply.)

7: public void whatHappensNext() throws IOException {
8:        // INSERT CODE HERE
9: }

A. System.out.println("it’s ok");
B. throw new Exception();
C. throw new IllegalArgumentException();
D. throw new java.io.IOException();
E. throw new RuntimeException();
F. None of the above
```

## Questão 12

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

## Questão 13

```text
Which are true statements? (Choose all that apply.)

A. An automatic module exports all packages to named modules.
B. An automatic module exports only the specified packages to named modules.
C. An automatic module exports no packages to named modules.
D. An unnamed module exports only the named packages to named modules.
E. An unnamed module exports all packages to named modules.
F. An unnamed module exports no packages to named modules.
```

## Questão 14

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

## Questão 15

```text
Assume that /kang exists as a symbolic link to the directory /mammal/kangaroo within the file system. Which of the following statements are correct about this code snippet? (Choose all that apply.)

var path = Path.of("/kang");
if(Files.isDirectory(path) && Files.isSymbolicLink(path))
   Files.createDirectory(path.resolve("joey"));

A. A new directory will always be created.
B. A new directory may be created.
C. If the code creates a directory, it will be reachable at /kang/joey.
D. If the code creates a directory, it will be reachable at /mammal/joey.
E. The code does not compile.
F. The code will compile but will always throw an exception at runtime.
```

## Questão 16

```text
Suppose we have a JAR file named cat-1.2.3-RC1.jar, and Automatic-Module-Name in the MANIFEST.MF is set to dog. What should an unnamed module referencing this automatic module include in module-info.java?

A. requires cat;
B. requires cat.RC;
C. requires cat-RC;
D. requires dog;
E. None of the above
```

## Questão 17

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

## Questão 18

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

## Questão 19

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

## Questão 20

```text
What is the result of the following code?

1:    abstract class Bird {
2:          private final void fly() { System.out.println("Bird"); }
3:          protected Bird() { System.out.print("Wow-"); }
4:    }
5:    public class Pelican extends Bird {
6:          public Pelican() { System.out.print("Oh-"); }
7:          protected void fly() { System.out.println("Pelican"); }
8:          public static void main(String[] args) {
9:                var chirp = new Pelican();
10:              chirp.fly();
11: } }

A. Oh-Bird
B. Oh-Pelican
C. Wow-Oh-Bird
D. Wow-Oh-Pelican
E. The code contains a compilation error.
F. None of the above.
```

## Questão 21

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

## Questão 22

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

## Questão 23

```text
Which of these statements can fill in the blank so that the Helper class compiles successfully? (Choose all that apply.)

2:  public class Helper {
3:     public static <U extends Exception>
4:        void printException(U u) {
5:
6:        System.out.println(u.getMessage());
7:     }
8:     public static void main(String[] args) {
9:        Helper.____________________________________________;
10:    } }

A. printException(new FileNotFoundException("A"))
B. printException(new Exception("B"))
C. <Throwable>printException(new Exception("C"))
D. <NullPointerException>printException(new NullPointerException ("D"))
E. printException(new Throwable("E"))
```

## Questão 24

```text
Note that March 12, 2028, is the weekend when we spring forward, and November 5, 2028, is when we fall back for daylight saving time. Which of the following can fill in the blank without the code throwing an exception? (Choose all that apply.)

var zone = ZoneId.of("US/Eastern");
var date = ______________________;
var time = LocalTime.of(2, 15);
var z = ZonedDateTime.of(date, time, zone);

A. LocalDate.of(2028, 3, 12)
B. LocalDate.of(2028, 3, 40)
C. LocalDate.of(2028, 11, 5)
D. LocalDate.of(2028, 11, 6)
E. LocalDate.of(2029, 2, 29)
F. LocalDate.of(2028, MonthEnum.MARCH, 12);
```

## Questão 25

```text
Given the generic type String, the partitioningBy() collector creates a Map<Boolean, List<String>> when passed to collect() by default. When a downstream collector is passed to partitioningBy(), which return types can be created? (Choose all that apply.)

A. Map<boolean, List<String>>
B. Map<Boolean, List<String>>
C. Map<Boolean, Map<String>>
D. Map<Boolean, Set<String>>
E. Map<Long, TreeSet<String>>
F. None of the above
```

## Questão 26

```text
A minimum of how many lines need to be corrected before the following method will compile?

21: void findZookeeper(Integer id) {
22:        System.out.print(switch (id) {
23:              case 10 -> {"Jane";}
24:              case 20 -> {yield "Lisa";};
25:              case 30 -> "Kelly";
26:              case 30 -> "Sarah";
27:              default -> "Unassigned";
28:        });
29: }

A. Zero
B. One
C. Two
D. Three
E. Four
F. Five
```

## Questão 27

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

## Questão 28

```text
Which of the following methods compile? (Choose all that apply.)

A. public void violin(int… nums) {}
B. public void viola(String values, int… nums) {}
C. public void cello(int… nums, String values) {}
D. public void bass(String… values, int… nums) {}
E. public void flute(String[] values, …int nums) {}
F. public void oboe(String[] values, int[] nums) {}
```

## Questão 29

```text
Which of the following functional interfaces contain an abstract method that returns a primitive value? (Choose all that apply.)

A. BooleanSupplier
B. CharSupplier
C. DoubleSupplier
D. FloatSupplier
E. IntSupplier
F. StringSupplier
```

## Questão 30

```text
Which statements, when inserted independently into the following blank, will cause the code to print 2 at runtime? (Choose all that apply.)

int count = 0;
BUNNY: for (int row = 1; row <=3; row++)
      RABBIT: for (int col = 0; col <3 ; col++) {
            if ((col + row) % 2 == 0)
                  ;
            count++;
      }
System.out.println(count);
  
A. break BUNNY
B. break RABBIT
C. continue BUNNY
D. continue RABBIT
E. break
F. continue
G. None of the above, as the code contains a compiler error
```

## Questão 31

```text
Which of the following are legal entry point methods that can be run from the command line? (Choose all that apply.)

A. private static void main(String[] args)
B. public static final main(String[] args)
C. public void main(String[] args)
D. public static final void main(String[] args)
E. public static void main(String[] args)
F. public static main(String[] args)
```

## Questão 32

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

## Questão 33

```text
What is output by the following code?

1: public class Fish {
2:        public static void main(String[] args) {
3:              int numFish = 4;
4:              String fishType = "tuna";
5:              String anotherFish = numFish + 1;
6:              System.out.println(anotherFish + " " + fishType);
7:              System.out.println(numFish + " " + 1);
8: } }

A. 4 1
B. 5
C. 5 tuna
D. 5tuna
E. 51tuna
F. The code does not compile.
```

## Questão 34

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

## Questão 35

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

## Questão 36

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

## Questão 37

```text
Which of the following statements about unary operators are true? (Choose all that apply.)

A. Unary operators are always executed before any surrounding numeric binary or ternary operators.
B. The - operator can be used to flip a boolean value.
C. The pre-increment operator (++) returns the value of the variable before the increment is applied.
D. The post-decrement operator (--) returns the value of the variable before the decrement is applied.
E. The ! operator cannot be used on numeric values.
F. None of the above.
```

## Questão 38

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

## Questão 39

```text
Which of these statements are true? (Choose all that apply.)

var letters = new StringBuilder("abcdefg");

A. letters.substring(1, 2) returns a single-character String.
B. letters.substring(2, 2) returns a single-character String.
C. letters.substring(6, 5) returns a single-character String.
D. letters.substring(6, 6) returns a single-character String.
E. letters.substring(1, 2) throws an exception.
F. letters.substring(2, 2) throws an exception.
G. letters.substring(6, 5) throws an exception.
H. letters.substring(6, 6) throws an exception.
```

## Questão 40

```text
Which of the following fields will be null after an instance of the class created on line 17 is serialized and then deserialized using ObjectOutputStream and ObjectInputStream?

1:  import java.io.Serializable;
2:  import java.util.List;
3:  public class Zebra implements Serializable {
4:     private transient String name = "George";
5:     private static String birthPlace = "Africa";
6:     private transient Integer age;
7:     List<Zebra> friends = new java.util.ArrayList<>();
8:     private Object stripes = new Object();
9:     { age = 10;}
10:    public Zebra() {
11:       this.name = "Sophia";
12:    }
13:    static Zebra writeAndRead(Zebra z) {
14:       // Implementation omitted
15:    }
16:    public static void main(String[] args) {
17:       var zebra = new Zebra();
18:       zebra = writeAndRead(zebra);
19:    } }

A. age
B. birthplace
C. friends
D. name
E. stripes
F. The code does not compile.
G. The code compiles but throws an exception at runtime.
```

## Questão 41

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

## Questão 42

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

## Questão 43

```text
What is the result of the following class?

1:    import java.util.function.*;
2:
3:    public class Panda {
4:          int age;
5:          public static void main(String[] args) {
6:                Panda p1 = new Panda();
7:                p1.age = 1;
8:                check(p1, p -> p.age < 5);
9:          }
10:        private static void check(Panda panda,
11:              Predicate<Panda> pred) {
12:              String result =
13:                    pred.test(panda) ? "match" : "not match";
14:              System.out.print(result);
15: } }

A.match
B.not match
C.Compiler error on line 8
D.Compiler error on lines 10 and 11
E.Compiler error on lines 12 and 13
F.A runtime exception
```

## Questão 44

```text
What is the output of calling getFish("goldie")?

40: void getFish(Object fish) {
41:        if (!(fish instanceof String guppy))
42:              System.out.print("Eat!");
43:        else if (!(fish instanceof String guppy)) {
44:              throw new RuntimeException();
45:        }
46:        System.out.print("Swim!");
47: }

A. Eat!
B. Swim!
C. Eat! followed by an exception
D. Eat!Swim!
E. An exception is printed
F. None of the above
```

## Questão 45

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

## Questão 46

```text
Which statements about the final modifier are correct? (Choose all that apply.)

A. Instance and static variables can be marked final.
B. A variable is effectively final only if it is marked final.
C. An object that is marked final cannot be modified.
D. Local variables cannot be declared with type var and the final modifier.
E. A primitive that is marked final cannot be modified.
```

## Questão 47

```text
For what value of pattern will the following print <005.21> <008.49> <1,234.0>?

String pattern = "____________________";
var message = DoubleStream.of(5.21, 8.49, 1234)
      .mapToObj(v -> new DecimalFormat(pattern).format(v))
      .collect(Collectors.joining("> <"));
System.out.println("<"+message+">");

A. ##.#
B. 0,000.0#
C. #,###.0
D. #,###,000.0#
E. The code does not compile regardless of what is placed in the blank.
F. None of the above.
```

## Questão 48

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

## Questão 49

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

## Questão 50

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

---

## Folha de respostas

Preencha **Resposta**; depois confira no livro (Apêndice *Answers to Review Questions*) e registre os erros em `docs/ocp-study/error-log.md`.

| # | Tópico | Fonte | Resposta | Gabarito | ✔/✘ |
|--:|---|---|---|---|:-:|
| 01 | T1 | `15-core-apis/QCAP04_17` | | | |
| 02 | T6 | `07-streams/QCAP10_01` | | | |
| 03 | T5 | `05-collections-generics/QCAP09_09` | | | |
| 04 | T5 | `15-core-apis/QCAP04_09` | | | |
| 05 | T8 | `13-concurrency/QCAP13_18` | | | |
| 06 | T6 | `06-lambdas-functional-interfaces/QCAP08_15` | | | |
| 07 | T3 | `01-building-blocks/QCAP01_22` | | | |
| 08 | T8 | `13-concurrency/QCAP13_25` | | | |
| 09 | T3 | `03-methods/QCAP05_15` | | | |
| 10 | T6 | `07-streams/QCAP10_16` | | | |
| 11 | T4 | `04-exceptions-localization/QCAP11_01` | | | |
| 12 | T3 | `01-beyond-classes/QCAP07_20` | | | |
| 13 | T7 | `11-modules/QCAP12_22` | | | |
| 14 | T4 | `04-exceptions-localization/QCAP11_12` | | | |
| 15 | T9 | `09-io-api/QCAP14_07` | | | |
| 16 | T7 | `11-modules/QCAP12_17` | | | |
| 17 | T4 | `04-exceptions-localization/QCAP11_14` | | | |
| 18 | T3 | `01-class-design/QCAP06_10` | | | |
| 19 | T4 | `04-exceptions-localization/QCAP11_24` | | | |
| 20 | T3 | `01-class-design/QCAP06_08` | | | |
| 21 | T5 | `05-collections-generics/QCAP09_16` | | | |
| 22 | T6 | `07-streams/QCAP10_14` | | | |
| 23 | T5 | `05-collections-generics/QCAP09_10` | | | |
| 24 | T1 | `15-core-apis/QCAP04_03` | | | |
| 25 | T6 | `07-streams/QCAP10_15` | | | |
| 26 | T2 | `02-making-decisions/QCAP03_21` | | | |
| 27 | T3 | `01-beyond-classes/QCAP07_17` | | | |
| 28 | T3 | `03-methods/QCAP05_06` | | | |
| 29 | T6 | `06-lambdas-functional-interfaces/QCAP08_05` | | | |
| 30 | T2 | `02-making-decisions/QCAP03_09` | | | |
| 31 | T7 | `01-building-blocks/QCAP01_01` | | | |
| 32 | T10 | `04-exceptions-localization/QCAP11_22` | | | |
| 33 | T1 | `15-core-apis/QCAP04_01` | | | |
| 34 | T5 | `05-collections-generics/QCAP09_02` | | | |
| 35 | T7 | `11-modules/QCAP12_02` | | | |
| 36 | T3 | `01-class-design/QCAP06_23` | | | |
| 37 | T1 | `14-operators/QCAP02_20` | | | |
| 38 | T8 | `13-concurrency/QCAP13_11` | | | |
| 39 | T1 | `15-core-apis/QCAP04_16` | | | |
| 40 | T9 | `09-io-api/QCAP14_22` | | | |
| 41 | T8 | `13-concurrency/QCAP13_23` | | | |
| 42 | T3 | `01-class-design/QCAP06_18` | | | |
| 43 | T6 | `06-lambdas-functional-interfaces/QCAP08_01` | | | |
| 44 | T2 | `02-making-decisions/QCAP03_28` | | | |
| 45 | T9 | `09-io-api/QCAP14_09` | | | |
| 46 | T3 | `03-methods/QCAP05_01` | | | |
| 47 | T10 | `04-exceptions-localization/QCAP11_09` | | | |
| 48 | T2 | `02-making-decisions/QCAP03_29` | | | |
| 49 | T3 | `01-beyond-classes/QCAP07_11` | | | |
| 50 | T1 | `15-core-apis/QCAP04_20` | | | |

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
