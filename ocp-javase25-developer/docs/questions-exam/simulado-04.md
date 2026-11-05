# Simulado 04 — 1Z0-831 Java SE 25 Developer Professional

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

## Questão 02

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

## Questão 03

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

## Questão 04

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

## Questão 05

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

## Questão 06

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

## Questão 07

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

## Questão 08

```text
Which statements about the following class are correct? (Choose all that apply.)

1: public class ClownFish {
2:        int gills = 0, double weight=2;
3:        { int fins = gills; }
4:        void print(int length = 3) {
5:              System.out.println(gills);
6:              System.out.println(weight);
7:              System.out.println(fins);
8:              System.out.println(length);
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

## Questão 09

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

## Questão 10

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

## Questão 11

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

## Questão 12

```text
What is the result of the following?

var s = DoubleStream.of(1.2, 2.4);
s.peek(System.out::println).filter(x -> x> 2).count();

A. 1
B. 2
C. 2.4
D. 1.2 and 2.4
E. There is no output.
F. The code does not compile.
G. An exception is thrown.
```

## Questão 13

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

## Questão 14

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

## Questão 15

```text
Assuming that / is the root directory within the file system, which of the following are true statements? (Choose all that apply.)

A. /home/parrot is an absolute path.
B. /home/parrot is a directory.
C. /home/parrot is a relative path.
D. new File("/home") will throw an exception if /home does not exist.
E. new File("/home").delete() will throw an exception if /home does not exist.
F. A Reader offers character encoding, making it more useful when working with String data than an InputStream.
G. A Reader offers multithreading support, making it more useful than an InputStream.
```

## Questão 16

```text
What is the output of the following?

var result = LocalDate.of(2025, Month.OCTOBER, 31)
      .plusYears(1)
      .plusMonths(-5)
      .plusMonths(1)
      .withYear(2026)
      .atTime(LocalTime.of(13, 4));
System.out.println(result);

A. 2025-06-30T13:04
B. 2026-04-304
C. 2026-04-30T13:04
D. 2026-06-30T
E. 2026-06-30T13:04
F. The code does not compile.
G. A runtime exception is thrown.
```

## Questão 17

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

## Questão 18

```text
Which of the following can be used to change the order of operation in an expression?

A. [ ]
B. < >
C. ( )
D. \ /
E. { }
F. " "
```

## Questão 19

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

## Questão 20

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

## Questão 21

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

## Questão 22

```text
Which statements, when inserted into the following blanks, allow the code to compile and run without entering an infinite loop? (Choose all that apply.)

4:    int height = 1;
5:    L1: while (height++ <10) {
6:          long humidity = 12;
7:          L2: do {
8:                if (humidity-- % 12 == 0) ;
9:                int temperature = 30;
10:              L3: for ( ; ; ) {
11:                    temperature++;
12:                    if (temperature>50) ;
13:              }
14:        } while (humidity> 4);
15: }

A. break L2 on line 8; continue L2 on line 12
B. continue on line 8; continue on line 12
C. break L3 on line 8; break L1 on line 12
D. continue L2 on line 8; continue L3 on line 12
E. continue L2 on line 8; continue L2 on line 12
F. None of the above, as the code contains a compiler error
```

## Questão 23

```text
Which of these statements is true about the following code?

public void method() {
      x((var x) -> {}, (var x, var y) -> false);
}
public void x(Consumer<String> x, BinaryOperator<Boolean> y) {}

A. The code does not compile because of one of the variables named x.
B. The code does not compile because of one of the variables named y.
C. The code does not compile for another reason.
D. The code compiles, and the x in each lambda refers to the same type.
E. The code compiles, and the x in each lambda refers to a different type.
```

## Questão 24

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

## Questão 25

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

## Questão 26

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

## Questão 27

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

## Questão 28

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

## Questão 31

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

## Questão 32

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

## Questão 33

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

## Questão 34

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

## Questão 35

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

## Questão 36

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

## Questão 37

```text
Which of these statements compile? (Choose all that apply.)

A. HashSet<Number> hs = new HashSet<Integer>();
B. HashSet<? super ClassCastException> set = new HashSet<Exception>();
C. List<> list = new ArrayList<String>();
D. List<Object> values = new HashSet<Object>();
E. List<Object> objects = new ArrayList<? extends Object>();
F. Map<String, ? extends Number> hm = new HashMap<String, Integer>();
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
Assuming that the directories and files referenced exist and are not symbolic links, what is the result of executing the following code?

var p1 = Path.of("/lizard",".").resolve(Path.of("walking.txt"));
var p2 = new File("/lizard/././actions/../walking.txt").toPath();
System.out.print(Files.isSameFile(p1,p2));
System.out.print(" ");
System.out.print(p1.equals(p2));
System.out.print(" ");
System.out.print(Files.mismatch(p1,p2));

A. true true -1
B. true true 0
C. true false -1
D. true false 0
E. false true -1
F. false true 0
G. The code does not compile.
H. The result cannot be determined.
```

## Questão 40

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

## Questão 41

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

## Questão 42

```text
Which lines need to be changed to make the code compile?

try (ExecutorService service =         // w1
   Executors.newSingleThreadScheduledExecutor()) {
   service.scheduleWithFixedDelay(() -> {
      System.out.println("Open Zoo");
      return null;                     // w2
   }, 0, 1, TimeUnit.MINUTES);
   var result = service.submit(() ->   // w3
      System.out.println("Wake Staff"));
   System.out.println(result.get());
}

A. Only line w1.
B. Only line w2.
C. Only line w3.
D. Line w1 and w2.
E. Line w1 and w2.
F. Line w1 and w3.
G. None of the above; the code compiles.
```

## Questão 43

```text
What is the output of the following code snippet?

2: boolean keepGoing = true;
3: int result = 15, meters = 10;
4: do {
5:        meters--;
6:        if (meters==8) keepGoing = false;
7:        result -= 2;
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

## Questão 44

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

## Questão 45

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

## Questão 46

```text
Which of the following are legal entry point methods that can be run from the command line? (Choose all that apply.)

A. private static void main(String[] args)
B. public static final main(String[] args)
C. public void main(String[] args)
D. public static final void main(String[] args)
E. public static void main(String[] args)
F. public static main(String[] args)
```

## Questão 47

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

## Questão 48

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

## Questão 49

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

## Questão 50

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

---

## Folha de respostas

Preencha **Resposta**; depois confira no livro (Apêndice *Answers to Review Questions*) e registre os erros em `docs/ocp-study/error-log.md`.

| # | Tópico | Fonte | Resposta | Gabarito | ✔/✘ |
|--:|---|---|---|---|:-:|
| 01 | T3 | `01-class-design/QCAP06_26` | | | |
| 02 | T3 | `01-class-design/QCAP06_12` | | | |
| 03 | T1 | `15-core-apis/QCAP04_21` | | | |
| 04 | T10 | `04-exceptions-localization/QCAP11_06` | | | |
| 05 | T5 | `05-collections-generics/QCAP09_18` | | | |
| 06 | T6 | `07-streams/QCAP10_21` | | | |
| 07 | T4 | `04-exceptions-localization/QCAP11_12` | | | |
| 08 | T3 | `01-building-blocks/QCAP01_12` | | | |
| 09 | T4 | `04-exceptions-localization/QCAP11_04` | | | |
| 10 | T10 | `04-exceptions-localization/QCAP11_16` | | | |
| 11 | T2 | `02-making-decisions/QCAP03_28` | | | |
| 12 | T6 | `07-streams/QCAP10_17` | | | |
| 13 | T5 | `05-collections-generics/QCAP09_02` | | | |
| 14 | T8 | `13-concurrency/QCAP13_21` | | | |
| 15 | T9 | `09-io-api/QCAP14_02` | | | |
| 16 | T1 | `15-core-apis/QCAP04_22` | | | |
| 17 | T8 | `13-concurrency/QCAP13_05` | | | |
| 18 | T1 | `14-operators/QCAP02_18` | | | |
| 19 | T2 | `02-making-decisions/QCAP03_21` | | | |
| 20 | T1 | `15-core-apis/QCAP04_17` | | | |
| 21 | T6 | `06-lambdas-functional-interfaces/QCAP08_08` | | | |
| 22 | T2 | `02-making-decisions/QCAP03_20` | | | |
| 23 | T6 | `06-lambdas-functional-interfaces/QCAP08_07` | | | |
| 24 | T9 | `09-io-api/QCAP14_22` | | | |
| 25 | T6 | `06-lambdas-functional-interfaces/QCAP08_15` | | | |
| 26 | T3 | `01-beyond-classes/QCAP07_26` | | | |
| 27 | T6 | `06-lambdas-functional-interfaces/QCAP08_18` | | | |
| 28 | T3 | `03-methods/QCAP05_18` | | | |
| 29 | T7 | `01-building-blocks/QCAP01_02` | | | |
| 30 | T4 | `04-exceptions-localization/QCAP11_07` | | | |
| 31 | T6 | `07-streams/QCAP10_18` | | | |
| 32 | T1 | `15-core-apis/QCAP04_20` | | | |
| 33 | T4 | `04-exceptions-localization/QCAP11_01` | | | |
| 34 | T8 | `13-concurrency/QCAP13_22` | | | |
| 35 | T3 | `01-beyond-classes/QCAP07_16` | | | |
| 36 | T1 | `14-operators/QCAP02_16` | | | |
| 37 | T5 | `05-collections-generics/QCAP09_04` | | | |
| 38 | T3 | `01-class-design/QCAP06_05` | | | |
| 39 | T9 | `09-io-api/QCAP14_19` | | | |
| 40 | T3 | `01-class-design/QCAP06_23` | | | |
| 41 | T5 | `05-collections-generics/QCAP09_15` | | | |
| 42 | T8 | `13-concurrency/QCAP13_04` | | | |
| 43 | T2 | `02-making-decisions/QCAP03_14` | | | |
| 44 | T5 | `05-collections-generics/QCAP09_12` | | | |
| 45 | T3 | `01-beyond-classes/QCAP07_15` | | | |
| 46 | T7 | `01-building-blocks/QCAP01_01` | | | |
| 47 | T7 | `11-modules/QCAP12_01` | | | |
| 48 | T3 | `01-class-design/QCAP06_18` | | | |
| 49 | T7 | `11-modules/QCAP12_05` | | | |
| 50 | T3 | `01-beyond-classes/QCAP07_21` | | | |

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
