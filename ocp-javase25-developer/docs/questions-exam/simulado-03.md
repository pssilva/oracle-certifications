# Simulado 03 — 1Z0-831 Java SE 25 Developer Professional

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
What is the result of the following class?

1:  import java.util.function.*;
2:
3:  public class Panda {
4:     int age;
5:     public static void main(String[] args) {
6:        Panda p1 = new Panda();
7:        p1.age = 1;
8:        check(p1, p -> p.age < 5);
9:     }
10:    private static void check(Panda panda,
11:       Predicate<Panda> pred) {
12:       String result =
13:          pred.test(panda) ? "match" : "not match";
14:       System.out.print(result);
15: } }

A.match
B.not match
C.Compiler error on line 8
D.Compiler error on lines 10 and 11
E.Compiler error on lines 12 and 13
F.A runtime exception
```

## Questão 02

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

## Questão 03

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

## Questão 04

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

## Questão 05

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

## Questão 06

```text
What change, when applied independently, would allow the following code snippet to compile? (Choose all that apply.)

3: long ear = 10;
4: int hearing = 2 * ear;

A. No change; it compiles as is.
B. Cast ear on line 4 to int.
C. Change the data type of ear on line 3 to short.
D. Cast 2 * ear on line 4 to int.
E. Change the data type of hearing on line 4 to short.
F. Change the data type of hearing on line 4 to long.
```

## Questão 07

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

## Questão 08

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

## Questão 09

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

## Questão 10

```text
Which are true statements about terminal operations in a stream that runs successfully? (Choose all that apply.)

A. At most one terminal operation can exist in a stream pipeline.
B. Terminal operations are a required part of the stream pipeline in order to get a result.
C. Terminal operations have Stream as the return type.
D. The peek() method is an example of a terminal operation.
E. The referenced Stream may be used after calling a terminal operation.
```

## Questão 11

```text
What is the result of compiling and executing the following code?

1:  public class Movie {
2:     private int butter = 5;
3:     private Movie() {}
4:     protected class Popcorn {
5:        private Popcorn() {}
6:        public static int butter = 10;
7:        public void startMovie() {
8:           System.out.println(butter);
9:        }
10:    }
11:    public static void main(String[] args) {
12:       var movie = new Movie();
13:       Movie.Popcorn in = new Movie().new Popcorn();
14:       in.startMovie();
15:    } }

A. The output is 5.
B. The output is 10.
C. Line 6 generates a compiler error.
D. Line 12 generates a compiler error.
E. Line 13 generates a compiler error.
F. The code compiles but produces an exception at runtime.
```

## Questão 12

```text
Which of the following is correct?

A. An instance variable of type float defaults to 0.
B. An instance variable of type char defaults to null.
C. A local variable of type double defaults to 0.0.
D. A local variable of type int defaults to null.
E. A class variable of type String defaults to null.
F. A class variable of type String defaults to the empty string "".
G. None of the above.
```

## Questão 13

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

## Questão 14

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

## Questão 15

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

## Questão 16

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

## Questão 17

```text
Assuming a record is defined with at least one field, which components does the compiler always insert, each of which may be overridden or redeclared? (Choose all that apply.)

A. A no-argument constructor
B. An accessor method for each field
C. The toString() method
D. The equals() method
E. A mutator method for each field
F. A sort method for each field
G. The hashCode() method
```

## Questão 18

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

## Questão 19

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

## Questão 20

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

## Questão 21

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

## Questão 22

```text
What is the output of the following code snippet?

6:  String instrument = "violin";
7:  final String CELLO = "cello";
8:  String viola = "viola";
9:  int p = -1;
10: switch (instrument) {
11:    case "bass" : break;
12:    case CELLO : p++;
13:    default: p++;
14:    case "VIOLIN": p++;
15:    case "viola" : ++p; break;
16: }
17: System.out.print(p);

A. -1
B. 0
C. 1
D. 2
E. 3
F. The code does not compile.
```

## Questão 23

```text
What is the output of the following code snippet?

int ph = 7, vis = 2;
boolean clear = vis> 1 & (vis < 9 || ph < 2);
boolean safe = (vis> 2) && (ph++> 1);
boolean tasty = 7 <= --ph;
System.out.println(clear + "-" + safe + "-" + tasty);

A. true-true-true
B. true-true-false
C. true-false-true
D. true-false-false
E. false-true-true
F. false-true-false
G. false-false-true
H. false-false-false
```

## Questão 24

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

## Questão 25

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

## Questão 26

```text
Which of the following statements are true in a module-info.java file? (Choose all that apply.)

A. The opens directive allows the use of reflection.
B. The opens directive declares that an API is called.
C. The use directive allows the use of reflection.
D. The use directive declares that an API is called.
E. The uses directive allows the use of reflection.
F. The uses directive declares that an API is called.
```

## Questão 27

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

## Questão 28

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

## Questão 29

```text
Which of the following are valid Java identifiers? (Choose all that apply.)

A. _
B. _helloWorld$
C. true
D. java.lang
E. Public
F. 1980_s
G. _Q2_
```

## Questão 30

```text
Which of the following are true about a concrete class? (Choose all that apply.)

A. A concrete class can be declared as abstract.
B. A concrete class must implement all inherited abstract methods.
C. A concrete class can be marked as final.
D. A concrete class must be immutable.
E. A concrete method that implements an abstract method must match the method declaration of the abstract method exactly.
```

## Questão 31

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

## Questão 32

```text
Which statement about the following class is correct?

1:  class Problem extends Exception {
2:     public Problem() {}
3:  }
4:  class YesProblem extends Problem {}
5:  public class MyDatabase {
6:     public static void connectToDatabase() throw Problem {
7:        throws new YesProblem();
8:     }
9:     public static void main(String[] c) throw Exception {
10:       connectToDatabase();
11:    }
12: }

A. The code compiles and prints a stack trace for YesProblem at runtime.
B. The code compiles and prints a stack trace for Problem at runtime.
C. The code does not compile because Problem defines a constructor.
D. The code does not compile because YesProblem does not define a constructor.
E. The code does not compile but would if Problem and YesProblem were switched on lines 6 and 7.
F. None of the above.
```

## Questão 33

```text
Given the following code snippet, which options correctly create a parallel stream? (Choose all that apply.)

var c = List.of(19, 66);
var s = ThreadLocalRandom.current().doubles();
var p = ________________;

A. new ParallelStream(s)
B. c.parallel()
C. s.parallelStream()
D. c.parallelStream()
E. new ParallelStream(c)
F. s.parallel()
```

## Questão 34

```text
Which of the following pairs make up a service?

A. Consumer and service locator
B. Consumer and service provider interface
C. Service locator and service provider
D. Service locator and service provider interface
E. Service provider and service provider interface
```

## Questão 35

```text
Which of these statements is true of the two values? (Choose all that apply.)

2025–08–28T05:00 GMT-04:00
2025–08–28T09:00 GMT-06:00

A. The first date/time is earlier.
B. The second date/time is earlier.
C. Both date/times are the same.
D. The date/times are two hours apart.
E. The date/times are six hours apart.
F. The date/times are 10 hours apart.
```

## Questão 36

```text
What is the result of the following statements?

1:  public class Test {
2:     public void print(byte x) {
3:        System.out.print("byte-");
4:     }
5:     public void print(int x) {
6:        System.out.print("int-");
7:     }
8:     public void print(float x) {
9:        System.out.print("float-");
10:    }
11:    public void print(Object x) {
12:       System.out.print("Object-");
13:    }
14:    public static void main(String[] args) {
15:       Test t = new Test();
16:       short s = 123;
17:       t.print(s);
18:       t.print(true);
19:       t.print(6.789);
20:    }
21: }

A. byte-float-Object-
B. int-float-Object-
C. byte-Object-float-
D. int-Object-float-
E. int-Object-Object-
F. byte-Object-Object-
```

## Questão 37

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

## Questão 40

```text
Which is a true statement about a package in a JAR on the classpath containing a module-info.java file?

A. It is possible to make the package available to all other modules on the classpath.
B. It is possible to make the package available to all other modules on the module path.
C. It is possible to make the package available to exactly one other specific module on the classpath.
D. It is possible to make the package available to exactly one other specific module on the module path.
E. It is possible to make sure the package is not available to any other modules on the classpath.
```

## Questão 41

```text
Assuming U.S. currency is in dollars ($) and German currency is in euros (€), what is the output of the following program?

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Locale.Category;
public record Wallet(double money) {
   private String openWallet() {
      Locale.setDefault(Category.DISPLAY,
         new Locale.Builder().setRegion("us").build());
      Locale.setDefault(Category.FORMAT,
         new Locale.Builder().setLanguage("en").build());
      return NumberFormat.getCurrencyInstance(Locale.GERMANY)
         .format(money);
   }
   public void printBalance() {
      System.out.println(openWallet());
   }   
   public static void main(String… unused) {
      new Wallet(2.4).printBalance();
   } }

A. 2,40 €
B. $2.40
C. 2.4
D. The code does not compile.
E. None of the above.
```

## Questão 42

```text
Which statements about the following code are correct? (Choose all that apply.)

var data = List.of(2, 5, 1, 9, 8);
data.stream().parallel()
   .mapToInt(s -> s)
   .peek(System.out::print)
   .forEachOrdered(System.out::print);

A. The peek() method will print the entries in the sorted order: 12589.
B. The peek() method will print the entries in the original order: 25198.
C. The peek() method will print the entries in an order that cannot be determined ahead of time.
D. The forEachOrdered() method will print the entries in the sorted order: 12589.
E. The forEachOrdered() method will print the entries in the original order: 25198.
F. The forEachOrdered() method will print the entries in an order that cannot be determined ahead of time.
G. The code does not compile.
```

## Questão 43

```text
Which statements are true? (Choose all that apply.)

A. The Consumer interface is good for printing out an existing value.
B. The Supplier interface is good for printing out an existing value.
C. The IntegerSupplier interface returns an int.
D. The Predicate interface returns an int.
E. The Function interface has a method named test().
F. The Predicate interface has a method named test().
```

## Questão 44

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

## Questão 45

```text
Which of the following exceptions must be handled or declared in the method in which they are thrown? (Choose all that apply.)

class Apple extends RuntimeException {}
class Orange extends Exception {}
class Banana extends Error {}
class Pear extends Apple {}
class Tomato extends Orange {}
class Peach extends Throwable {}

A. Apple
B. Orange
C. Banana
D. Pear
E. Tomato
F. Peach
```

## Questão 46

```text
Which are true statements? (Choose all that apply.)

A. An automatic module exports all packages to named modules.
B. An automatic module exports only the specified packages to named modules.
C. An automatic module exports no packages to named modules.
D. An unnamed module exports only the named packages to named modules.
E. An unnamed module exports all packages to named modules.
F. An unnamed module exports no packages to named modules.
```

## Questão 47

```text
What is the output of the following code snippet?

22: String zooStatus = "Closed";
23: int visitors = switch (zooStatus) {
24:    case String s when s.equals("Open") -> 10;
25:    case Object s when s != null && !s.equals("") -> 20;
26:    case null -> {yield 30;}
27:    default -> 40;
28: };
29: System.out.print(visitors);

A. 10
B. 20
C. 30
D. 40
E. Exactly one line does not compile.
F. Exactly two lines do not compile.
G. Three or more lines do not compile.
```

## Questão 48

```text
Which statement about the following program is correct?

1: abstract class Nocturnal {
2:        boolean isBlind();
3: }
4: public class Owl extends Nocturnal {
5:        public boolean isBlind() { return false; }
6:        public static void main(String[] args) {
7:              var nocturnal = (Nocturnal)new Owl();
8:              System.out.println(nocturnal.isBlind());
9: } }

A. It compiles and prints true.
B. It compiles and prints false.
C. The code will not compile because of line 2.
D. The code will not compile because of line 5.
E. The code will not compile because of line 7.
F. The code will not compile because of line 8.
G. None of the above.
```

## Questão 49

```text
Assume that monkey.txt is a file that exists in the current working directory. Which statement about the following code snippet is correct?

Files.move(Path.of("monkey.txt"), Path.of("/animals"),
   StandardCopyOption.ATOMIC_MOVE);

A. If /animals/monkey.txt exists, it will be overwritten at runtime.
B. If /animals exists as an empty directory, /animals/monkey.txt will be the new location of the file.
C. If the move is successful and another process is monitoring the file system, it will not see an incomplete file at runtime.
D. None of the above.
```

## Questão 50

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

---

## Folha de respostas

Preencha **Resposta**; depois confira no livro (Apêndice *Answers to Review Questions*) e registre os erros em `docs/ocp-study/error-log.md`.

| # | Tópico | Fonte | Resposta | Gabarito | ✔/✘ |
|--:|---|---|---|---|:-:|
| 01 | T6 | `06-lambdas-functional-interfaces/QCAP08_01` | | | |
| 02 | T10 | `04-exceptions-localization/QCAP11_09` | | | |
| 03 | T3 | `03-methods/QCAP05_11` | | | |
| 04 | T9 | `09-io-api/QCAP14_05` | | | |
| 05 | T3 | `01-building-blocks/QCAP01_17` | | | |
| 06 | T1 | `14-operators/QCAP02_03` | | | |
| 07 | T1 | `15-core-apis/QCAP04_03` | | | |
| 08 | T5 | `15-core-apis/QCAP04_09` | | | |
| 09 | T1 | `15-core-apis/QCAP04_11` | | | |
| 10 | T6 | `07-streams/QCAP10_04` | | | |
| 11 | T3 | `01-beyond-classes/QCAP07_11` | | | |
| 12 | T1 | `01-building-blocks/QCAP01_09` | | | |
| 13 | T3 | `01-beyond-classes/QCAP07_08` | | | |
| 14 | T2 | `02-making-decisions/QCAP03_09` | | | |
| 15 | T6 | `07-streams/QCAP10_08` | | | |
| 16 | T3 | `01-building-blocks/QCAP01_22` | | | |
| 17 | T3 | `01-beyond-classes/QCAP07_27` | | | |
| 18 | T5 | `05-collections-generics/QCAP09_16` | | | |
| 19 | T5 | `05-collections-generics/QCAP09_06` | | | |
| 20 | T5 | `05-collections-generics/QCAP09_23` | | | |
| 21 | T6 | `07-streams/QCAP10_03` | | | |
| 22 | T2 | `02-making-decisions/QCAP03_25` | | | |
| 23 | T1 | `14-operators/QCAP02_07` | | | |
| 24 | T6 | `06-lambdas-functional-interfaces/QCAP08_11` | | | |
| 25 | T9 | `09-io-api/QCAP14_07` | | | |
| 26 | T7 | `11-modules/QCAP12_06` | | | |
| 27 | T4 | `04-exceptions-localization/QCAP11_24` | | | |
| 28 | T5 | `05-collections-generics/QCAP09_17` | | | |
| 29 | T3 | `01-building-blocks/QCAP01_04` | | | |
| 30 | T3 | `01-class-design/QCAP06_25` | | | |
| 31 | T8 | `13-concurrency/QCAP13_25` | | | |
| 32 | T4 | `04-exceptions-localization/QCAP11_02` | | | |
| 33 | T8 | `13-concurrency/QCAP13_01` | | | |
| 34 | T7 | `11-modules/QCAP12_04` | | | |
| 35 | T1 | `15-core-apis/QCAP04_07` | | | |
| 36 | T3 | `03-methods/QCAP05_16` | | | |
| 37 | T2 | `02-making-decisions/QCAP03_22` | | | |
| 38 | T4 | `04-exceptions-localization/QCAP11_10` | | | |
| 39 | T8 | `13-concurrency/QCAP13_14` | | | |
| 40 | T7 | `11-modules/QCAP12_24` | | | |
| 41 | T10 | `04-exceptions-localization/QCAP11_25` | | | |
| 42 | T8 | `13-concurrency/QCAP13_06` | | | |
| 43 | T6 | `06-lambdas-functional-interfaces/QCAP08_09` | | | |
| 44 | T3 | `01-class-design/QCAP06_13` | | | |
| 45 | T4 | `04-exceptions-localization/QCAP11_11` | | | |
| 46 | T7 | `11-modules/QCAP12_22` | | | |
| 47 | T2 | `02-making-decisions/QCAP03_24` | | | |
| 48 | T3 | `01-class-design/QCAP06_15` | | | |
| 49 | T9 | `09-io-api/QCAP14_20` | | | |
| 50 | T6 | `07-streams/QCAP10_06` | | | |

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
