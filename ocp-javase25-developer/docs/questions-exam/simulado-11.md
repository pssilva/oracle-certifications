# Simulado 11 — 1Z0-831 Java SE 25 Developer Professional

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
Which statements, when inserted into the following blanks, allow the code to compile and run without entering an infinite loop? (Choose all that apply.)

4:  int height = 1;
5:  L1: while (height++ <10) {
6:     long humidity = 12;
7:     L2: do {
8:        if (humidity-- % 12 == 0) ;
9:        int temperature = 30;
10:       L3: for ( ; ; ) {
11:          temperature++;
12:          if (temperature>50) ;
13:       }
14:    } while (humidity> 4);
15: }

A. break L2 on line 8; continue L2 on line 12
B. continue on line 8; continue on line 12
C. break L3 on line 8; break L1 on line 12
D. continue L2 on line 8; continue L3 on line 12
E. continue L2 on line 8; continue L2 on line 12
F. None of the above, as the code contains a compiler error
```

## Questão 02

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

## Questão 03

```text
Given that the sum of the numbers from 1 (inclusive) to 10 (exclusive) is 45, what are the possible results of executing the following program? (Choose all that apply.)

1:  import java.util.concurrent.locks.*;
2:  import java.util.stream.*;
3:  public class Bank {
4:     private Lock vault = new ReentrantLock();
5:     private int total = 0;
6:     public void deposit(int value) {
7:        try {
8:           vault.tryLock();
9:           total += value;
10:       } finally { vault.unlock(); }
11:    }
12:    public static void main(String[] unused) {
13:       var bank = new Bank();
14:       IntStream.range(1, 10).parallel()
15:          .forEach(s -> bank.deposit(s));
16:       System.out.println(bank.total);
17:    } }

A. 45 is printed.
B. A number less than 45 is printed.
C. A number greater than 45 is printed.
D. An exception is thrown.
E. None of the above, as the code does not compile.
```

## Questão 04

```text
Which of the following functional interfaces contain an abstract method that returns a primitive value? (Choose all that apply.)

A. BooleanSupplier
B. CharSupplier
C. DoubleSupplier
D. FloatSupplier
E. IntSupplier
F. StringSupplier
```

## Questão 05

```text
Suppose you have separate modules for a service provider interface, service provider, service locator, and consumer. Which statements are true about the directives you need to specify? (Choose all that apply.)

A. The consumer must use the requires directive.
B. The consumer must use the uses directive.
C. The service locator must use the requires directive.
D. The service locator must use the uses directive.
E. None of the above.
```

## Questão 06

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

## Questão 07

```text
Which of the following throw an exception when an Optional is empty? (Choose all that apply.)

A. opt.orElse("");
B. opt.orElseGet(() -> "");
C. opt.orElseThrow();
D. opt.orElseThrow(() -> throw new Exception());
E. opt.orElseThrow(RuntimeException::new);
F. opt.get();
G. opt.get("");
```

## Questão 08

```text
How many lines of the following program contain a compilation error?

1:  class Primate {
2:     protected int age = 2;
3:     { age = 1; }
4:     public Primate() {
5:        this().age = 3;
6:     }
7:  }
8:  public class Orangutan {
9:     protected int age = 4;
10:    { age = 5; }
11:    public Orangutan() {
12:       this().age = 6;
13:    }
14:    public static void main(String[] bananas) {
15:       final Primate x = (Primate)new Orangutan();
16:       System.out.println(x.age);
17:    }
18: }

A. None, and the program prints 1 at runtime.
B. None, and the program prints 3 at runtime.
C. None, but it causes a ClassCastException at runtime.
D. 1
E. 2
F. 3
G. 4
```

## Questão 09

```text
Which of the following is a legal command to run a modular program where n is the module name and c is the fully qualified class name?

A. java --module-path x -m n.c
B. java --module-path x -p n.c
C. java --module-path x-x -m n/c
D. java --module-path x -p n/c
E. java --module-path x-x -m n-c
F. java --module-path x -p n-c
G. None of the above
```

## Questão 10

```text
What is the output of the following program?

1: public class CandyCounter {
2:    static long addCandy(double fruit, float vegetables) {
3:       return (int)fruit+vegetables;
4:    }
5:    
6:    public static void main(String[] args) {
7:       System.out.print(addCandy(1.4, 2.4f) + ", ");
8:       System.out.print(addCandy(1.9, (float)4) + ", ");
9:       System.out.print(addCandy((long)(int)(short)2, (float)4)); } }

A. 4, 6, 6.0
B. 3, 5, 6
C. 3, 6, 6
D. 4, 5, 6
E. The code does not compile because of line 9.
F. None of the above.
```

## Questão 11

```text
Which of the following can be inserted on line 8 to make this code compile? (Choose all that apply.)

7: public void whatHappensNext() throws IOException {
8:    // INSERT CODE HERE
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
What would be the value of name if the instance of Eagle created in the main() method were serialized and then deserialized?

import java.io.Serializable;
class Bird {
   protected transient String name;
   public void setName(String name) { this.name = name; }
   public String getName() { return name; }
   public Bird() {
      this.name = "Matt";
   }
}
public class Eagle extends Bird implements Serializable {
   { this.name = "Olivia"; }
   public Eagle() {
      this.name = "Bridget";
   }
   public static void main(String[] args) {
      var e = new Eagle();
      e.name = "Adeline";
   }
}

A. Adeline
B. Bridget
C. Matt
D. Olivia
E. null
F. The code does not compile.
G. The code compiles but throws an exception at runtime.
```

## Questão 13

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

## Questão 14

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

## Questão 15

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

## Questão 16

```text
Suppose you need to display a collection of products for sale, which may contain duplicates. Additionally, you have a collection of sales that you need to track, sorted by the natural order of the sale ID, and you need to retrieve the text of each. Which two of the following classes best suit your needs for each of these scenarios? (Choose two.)

A. ArrayList
B. HashMap
C. HashSet
D. LinkedList
E. SequencedTreeSet
F. TreeMap
```

## Questão 17

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

## Questão 18

```text
Which scenario is the best use of an exception?

A. An element is not found when searching a list.
B. An unexpected parameter is passed into a method.
C. The computer caught fire.
D. You want to loop through a list.
E. You don’t know how to code a method.
```

## Questão 19

```text
Which are true about this code? (Choose all that apply.)

public class KitchenSink {
    private int numForks;
 
    public static void main(String[] args) {
       int numKnives;
       System.out.print("""
          "# forks = " + numForks +
           " # knives = " + numKnives +
          # cups = 0""");
    }
}

A. The output includes # forks = 0.
B. The output includes # knives = 0.
C. The output includes # cups = 0.
D. The output includes a blank line.
E. The output includes one or more lines that begin with whitespace.
F. The code does not compile.
```

## Questão 20

```text
What is the output of the following? (Choose all that apply.)

var arr = new String[] { "PIG", "pig", "123"};
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));
System.out.println(Arrays.binarySearch(arr, "Pippa"));

A. [pig, PIG, 123]
B. [PIG, pig, 123]
C. [123, PIG, pig]
D. [123, pig, PIG]
E. -3
F. -2
G. The results of binarySearch() are undefined in this example.
```

## Questão 21

```text
Which statements about the following program are correct? (Choose all that apply.)

2:  public class Bear {
3:     private Bear pandaBear;
4:     private void roar(Bear b) {
5:        System.out.println("Roar!");
6:        pandaBear = b;
7:     }
8:     public static void main(String[] args) {
9:        Bear brownBear = new Bear();
10:       Bear polarBear = new Bear();
11:       brownBear.roar(polarBear);
12:       polarBear = null;
13:       brownBear = null;
14:       System.gc(); } }

A. The object created on line 9 is first eligible for garbage collection after line 13.
B. The object created on line 9 is first eligible for garbage collection after line 14.
C. The object created on line 10 is first eligible for garbage collection after line 12.
D. The object created on line 10 is first eligible for garbage collection after line 13.
E. Garbage collection is guaranteed to run.
F. Garbage collection might or might not run.
G. The code does not compile.
```

## Questão 22

```text
Which of the following classes and interfaces do not compile? (Choose all that apply.)

public abstract class Camel { void travel(); }
 
public interface EatsGrass { private abstract int chew(); }
 
public abstract class Elephant {
   abstract private class SleepsAlot {
      abstract int sleep();
   } }
 
public class Eagle { abstract soar(); }

public interface Spider { default void crawl() {} }

A. Camel
B. EatsGrass
C. Elephant
D. Eagle
E. Spider
```

## Questão 23

```text
What is the output of executing the following class?

1:  public class Salmon {
2:     int count;
3:     { System.out.print(count+"-"); }
4:     { count++; }
5:     public Salmon() {
6:        count = 4;
7:        System.out.print(2+"-");
8:     }
9:     public static void main(String[] args) {
10:       System.out.print(7+"-");
11:       var s = new Salmon();
12:       System.out.print(s.count+"-"); } }

A. 7-0-2-1-
B. 7-0-1-
C. 0-7-2-1-
D. 7-0-2-4-
E. 0-7-1-
F. The class does not compile because of line 3.
G. The class does not compile because of line 4.
H. None of the above.
```

## Questão 24

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

## Questão 25

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

## Questão 26

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

## Questão 27

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

## Questão 28

```text
What is the output of calling printType(11)?

31: void printType(Object o) {
32:    if (o instanceof Integer bat) {
33:       System.out.print("int");
34:    } else if (o instanceof Integer bat && bat < 10) {
35:       System.out.print("small int");
36:    } else if (o instanceof Long bat || bat <= 20) {
37:       System.out.print("long");
38:    } default {
39:       System.out.print("unknown");
40:    }
41: }

A. int
B. small int
C. long
D. unknown
E. Nothing is printed.
F. The code contains one line that does not compile.
G. The code contains two lines that do not compile.
H. None of the above.
```

## Questão 29

```text
What is the result of the following statements?

3:  var greetings = new ArrayDeque<String>();
4:  greetings.offerLast("hello");
5:  greetings.offerLast("hi");
6:  greetings.offerFirst("ola");
7:  greetings.pop();
8:  greetings.peek();
9:  while (greetings.peek() != null)
10:    System.out.print(greetings.pop());

A. hello
B. hellohi
C. hellohiola
D. hiola
E. The code does not compile.
F. An exception is thrown.
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
What types can be inserted in the blanks on the lines marked X and Z that allow the code to compile? (Choose all that apply.)

interface Walk { private static List move() { return null; } }
interface Run extends Walk { public ArrayList move(); }
class Leopard implements Walk {
   public ___________ move() {  // X
      return null;
   }
}
class Panther implements Run {
   public  move(___________) {  // Z
      return null;
   }
}

A. Integer on the line marked X
B. ArrayList on the line marked X
C. List on the line marked X
D. List on the line marked Z
E. ArrayList on the line marked Z
F. None of the above, since the Run interface does not compile.
G. Does not compile for a different reason.
```

## Questão 32

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

## Questão 33

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

## Questão 36

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

## Questão 37

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

## Questão 38

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

## Questão 39

```text
Which statements about functional interfaces are true? (Choose all that apply.)

A. A functional interface can contain default and private methods.
B. A functional interface can be defined as a class or an interface.
C. Abstract methods with signatures that are contained in public methods of java.lang.Object do not count toward the abstract method count for a functional interface.
D. A functional interface cannot contain static or private static methods.
E. A functional interface must be marked with the @FunctionalInterface annotation.
```

## Questão 40

```text
What is the result of calling getHatSize(9f) on the following code snippet?

10: int getHatSize(Number measurement) {
11:    return switch (measurement) {
12:       case Double d -> 1 + d.intValue();
13:       case null     -> 11;
14:       case !(Number n) -> 3 + n.intValue();
15:       case Float f when f < 10 -> 4 + f.intValue();
16:    };
17: }

A. 10
B. 11
C. 12
D. 13
E. The code does not compile because it is missing a default clause.
F. The code does not compile for a different reason.
```

## Questão 41

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

## Questão 42

```text
Which would you expect to see when describing any module?

A. requires java.base mandated
B. requires java.core mandated
C. requires java.lang mandated
D. requires mandated java.base
E. requires mandated java.core
F. requires mandated java.lang
G. None of the above
```

## Questão 43

```text
Given the following method, which of the method calls return 2? (Choose all that apply.)

public int juggle(boolean b, boolean… b2) {
   return b2.length;
}

A. juggle();
B. juggle(true);
C. juggle(true, true);
D. juggle(true, true, true);
E. juggle(true, {true, true});
F. juggle(true, new boolean[2]);
```

## Questão 44

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

## Questão 45

```text
What is the simplest way of rewriting this code?

List<Integer> x = IntStream.range(1, 6)
   .mapToObj(i -> i)
   .collect(Collectors.toList());
x.forEach(System.out::println);

A. IntStream.range(1, 6);
B. IntStream.range(1, 6)
   .forEach(System.out::println);
C. IntStream.range(1, 6)
    .mapToObj(i -> i)
    .forEach(System.out::println);
D. None of the above is equivalent.
E.The provided code does not compile.
```

## Questão 46

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

## Questão 47

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

## Questão 50

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

---

## Folha de respostas

Preencha **Resposta**; depois confira no livro (Apêndice *Answers to Review Questions*) e registre os erros em `docs/ocp-study/error-log.md`.

| # | Tópico | Fonte | Resposta | Gabarito | ✔/✘ |
|--:|---|---|---|---|:-:|
| 01 | T2 | `02-making-decisions/QCAP03_20` | | | |
| 02 | T3 | `01-beyond-classes/QCAP07_03` | | | |
| 03 | T8 | `13-concurrency/QCAP13_02` | | | |
| 04 | T6 | `06-lambdas-functional-interfaces/QCAP08_05` | | | |
| 05 | T7 | `11-modules/QCAP12_25` | | | |
| 06 | T1 | `15-core-apis/QCAP04_19` | | | |
| 07 | T6 | `07-streams/QCAP10_20` | | | |
| 08 | T3 | `01-beyond-classes/QCAP07_29` | | | |
| 09 | T7 | `11-modules/QCAP12_14` | | | |
| 10 | T1 | `14-operators/QCAP02_06` | | | |
| 11 | T4 | `04-exceptions-localization/QCAP11_01` | | | |
| 12 | T9 | `09-io-api/QCAP14_06` | | | |
| 13 | T9 | `09-io-api/QCAP14_19` | | | |
| 14 | T4 | `04-exceptions-localization/QCAP11_18` | | | |
| 15 | T3 | `01-beyond-classes/QCAP07_19` | | | |
| 16 | T5 | `05-collections-generics/QCAP09_01` | | | |
| 17 | T9 | `09-io-api/QCAP14_08` | | | |
| 18 | T4 | `04-exceptions-localization/QCAP11_10` | | | |
| 19 | T1 | `01-building-blocks/QCAP01_07` | | | |
| 20 | T5 | `15-core-apis/QCAP04_15` | | | |
| 21 | T3 | `01-building-blocks/QCAP01_05` | | | |
| 22 | T3 | `01-beyond-classes/QCAP07_28` | | | |
| 23 | T3 | `01-building-blocks/QCAP01_21` | | | |
| 24 | T5 | `05-collections-generics/QCAP09_09` | | | |
| 25 | T8 | `13-concurrency/QCAP13_22` | | | |
| 26 | T10 | `04-exceptions-localization/QCAP11_22` | | | |
| 27 | T1 | `14-operators/QCAP02_07` | | | |
| 28 | T2 | `02-making-decisions/QCAP03_08` | | | |
| 29 | T5 | `05-collections-generics/QCAP09_03` | | | |
| 30 | T3 | `01-class-design/QCAP06_25` | | | |
| 31 | T3 | `01-beyond-classes/QCAP07_10` | | | |
| 32 | T4 | `04-exceptions-localization/QCAP11_07` | | | |
| 33 | T6 | `07-streams/QCAP10_02` | | | |
| 34 | T7 | `11-modules/QCAP12_04` | | | |
| 35 | T3 | `03-methods/QCAP05_19` | | | |
| 36 | T5 | `05-collections-generics/QCAP09_12` | | | |
| 37 | T1 | `14-operators/QCAP02_10` | | | |
| 38 | T10 | `04-exceptions-localization/QCAP11_09` | | | |
| 39 | T6 | `06-lambdas-functional-interfaces/QCAP08_03` | | | |
| 40 | T2 | `02-making-decisions/QCAP03_13` | | | |
| 41 | T1 | `15-core-apis/QCAP04_12` | | | |
| 42 | T7 | `11-modules/QCAP12_20` | | | |
| 43 | T3 | `03-methods/QCAP05_07` | | | |
| 44 | T2 | `02-making-decisions/QCAP03_26` | | | |
| 45 | T6 | `07-streams/QCAP10_19` | | | |
| 46 | T6 | `06-lambdas-functional-interfaces/QCAP08_18` | | | |
| 47 | T8 | `13-concurrency/QCAP13_06` | | | |
| 48 | T6 | `07-streams/QCAP10_06` | | | |
| 49 | T3 | `01-class-design/QCAP06_15` | | | |
| 50 | T8 | `13-concurrency/QCAP13_11` | | | |

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
