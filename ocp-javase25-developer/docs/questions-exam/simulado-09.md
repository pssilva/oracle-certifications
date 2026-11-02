# Simulado 09 — 1Z0-831 Java SE 25 Developer Professional

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
For which value of path sent to this method would it be guaranteed for the following code to output Success?

public void removeBadFile(Path path) {
   if(Files.isDirectory(path))
      System.out.println(Files.deleteIfExists(path)
         ? "Success": "Try Again");
}

A. path refers to a regular file in the file system.
B. path refers to a symbolic link in the file system.
C. path refers to an empty directory in the file system.
D. path refers to a directory with content in the file system.
E. path does not refer to a record that exists within the file system.
F. The code does not compile.
```

## Questão 02

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

## Questão 03

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

## Questão 04

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

## Questão 05

```text
Which of the following statements about the Callable call() and Runnable run() methods are correct? (Choose all that apply.)

A. Both methods return void.
B. Both can throw unchecked exceptions.
C. Both can be implemented with lambda expressions.
D. Runnable returns a generic type.
E. Both can throw checked exceptions.
F. Callable returns a generic type.
```

## Questão 06

```text
An automatic module name is generated if one is not supplied. Which of the following JAR filenames and generated automatic module name pairs are correct? (Choose all that apply.)

A. emily-1.0.0.jar and emily
B. emily-1.0.0-SNAPSHOT.jar and emily
C. emily_the_cat-1.0.0.jar and emily_the_cat
D. emily_the_cat-1.0.0.jar and emily-the-cat
E. emily.$.jar and emily
F. emily.$.jar and emily.
G. emily.$.jar and emily..
```

## Questão 07

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
Which of the following statements is correct?

A. Package access is more lenient than protected access.
B. A public class that has private fields and package methods is not visible to classes outside the package.
C. You can use access modifiers so only some of the classes in a package see a particular package class.
D. You can use access modifiers to allow access to all methods and not any instance variables.
E. You can use access modifiers to restrict access to all classes that begin with the word Test.
```

## Questão 10

```text
Fill in the blanks: __________ occur(s) when two or more threads are blocked forever but both appear active. _______ occur(s) when two or more threads try to complete a related task at the same time, resulting in invalid or unexpected data.

A. Livelock, Deadlock
B. Deadlock, Starvation
C. Race conditions, Deadlock
D. Livelock, Race conditions
E. Starvation, Race conditions
F. Deadlock, Livelock
```

## Questão 11

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

## Questão 12

```text
Which lines of the following interface do not compile? (Choose all that apply.)

1: public interface BigCat {
2:    abstract String getName();
3:    static int hunt() { getName(); return 5; }
4:    default void climb() { rest(); }
5:    private void roar() { getName();  climb(); hunt(); }
6:    private static boolean sneak() { roar(); return true; }
7:    private int rest() { return 2; };
8: }

A. Line 2
B. Line 3
C. Line 4
D. Line 5
E. Line 6
F. Line 7
G. None of the above
```

## Questão 13

```text
Given the following class definitions, which lines in the main() method generate a compiler error? (Choose all that apply.)

// Classroom.java
package my.school;
public class Classroom {
   private int roomNumber;
   protected static String teacherName;
   static int globalKey = 54321;
   public static int floor = 3;
   Classroom(int r, String t) {
      roomNumber = r;
      teacherName = t; } }
 
// School.java
1: package my.city;
2: import my.school.*;
3: public class School {
4:    public static void main(String[] args) {
5:       System.out.println(Classroom.globalKey);
6:       Classroom room = new Classroom(101, "Mrs. Anderson");
7:       System.out.println(room.roomNumber);
8:       System.out.println(Classroom.floor);
9:       System.out.println(Classroom.teacherName); } }

A. None: the code compiles fine.
B. Line 5.
C. Line 6.
D. Line 7.
E. Line 8.
F. Line 9.
```

## Questão 14

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

## Questão 15

```text
Which statement about the following class is correct?

1:  public class PoliceBox {
2:     String color;
3:     long age;
4:     public void PoliceBox() {
5:        color = "blue";
6:        age = 1200;
7:     }
8:     public static void main(String []time) {
9:        var p = new PoliceBox();
10:       var q = new PoliceBox();
11:       p.color = "green";
12:       p.age = 1400;
13:       p = q;
14:       System.out.println("Q1="+q.color);
15:       System.out.println("Q2="+q.age);
16:       System.out.println("P1="+p.color);
17:       System.out.println("P2="+p.age);
18: } }

A. It prints Q1=blue.
B. It prints Q2=1200.
C. It prints P1=null.
D. It prints P2=1400.
E. Line 4 does not compile.
F. Line 12 does not compile.
G. Line 13 does not compile.
H. None of the above.
```

## Questão 16

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

## Questão 17

```text
Which of the following changes, when made independently, would make this code compile? (Choose all that apply.)

1:  import java.io.*;
2:  public class StuckTurkeyCage implements AutoCloseable {
3:     public void close() throws IOException {
4:        throw new FileNotFoundException("Cage not closed");
5:     }
6:     public static void main(String[] args) {
7:        try (StuckTurkeyCage t = new StuckTurkeyCage()) {
8:           System.out.println("put turkeys in");
9:        }
10:    } }

A. Remove throws IOException from the declaration on line 3.
B. Add throws Exception to the declaration on line 6.
C. Change line 9 to } catch (Exception e) {}.
D. Change line 9 to } finally {}.
E. The code compiles as is.
F. None of the above.
```

## Questão 18

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

## Questão 19

```text
Which of the following statements are true? (Choose all that apply.)

A. Modules with cyclic dependencies will not compile.
B. Packages with a cyclic dependency will not compile.
C. A cyclic dependency always involves exactly two modules.
D. A cyclic dependency always involves at least two requires statements.
E. An unnamed module can be involved in a cyclic dependency with an automatic module.
```

## Questão 20

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

## Questão 21

```text
Which statement about the following code snippet is correct?

2: var cats = Stream.of("leopard", "lynx", "ocelot", "puma")
3:    .parallel();
4: var bears = Stream.of("panda","grizzly","polar").parallel();
5: var data = Stream.of(cats,bears).flatMap(s -> s)
6:    .collect(Collectors.groupingByConcurrent(
7:       s -> !s.startsWith("p")));
8: System.out.println(data.get(false).size()
9:    + " " + data.get(true).size());

A. It outputs 3 4.
B. It outputs 4 3.
C. The code will not compile because of line 6.
D. The code will not compile because of line 7.
E. The code will not compile because of line 8.
F. It compiles but throws an exception at runtime.
```

## Questão 22

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

## Questão 23

```text
Which of the following statements about var are true? (Choose all that apply.)

A. A var can be used as a constructor parameter.
B. The type of a var is known at compile time.
C. A var cannot be used as an instance variable.
D. A var can be used in a multiple variable assignment statement.
E. The value of a var cannot change at runtime.
F. The type of a var cannot change at runtime.
G. The word var is a reserved word in Java.
```

## Questão 24

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

## Questão 25

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

## Questão 26

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

## Questão 27

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

## Questão 28

```text
Given the following, which can correctly fill in the blank allowing the code to compile? (Choose all that apply.)

var date = LocalDate.now();
var time = LocalTime.now();
var dateTime = date.______(time);
var zoneId = ZoneId.systemDefault();
var zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
Instant instant = ___________________________;

A. asTime()
B. atTime()
C. withTime()
D. dateTime.toInstant()
E. new Instant()
F. zonedDateTime.toInstant()
```

## Questão 29

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

## Questão 30

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

## Questão 31

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

## Questão 32

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

## Questão 33

```text
Which are true statements about terminal operations in a stream that runs successfully? (Choose all that apply.)

A. At most one terminal operation can exist in a stream pipeline.
B. Terminal operations are a required part of the stream pipeline in order to get a result.
C. Terminal operations have Stream as the return type.
D. The peek() method is an example of a terminal operation.
E. The referenced Stream may be used after calling a terminal operation.
```

## Questão 34

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

## Questão 35

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

## Questão 36

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

## Questão 37

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

## Questão 38

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

## Questão 39

```text
Which of the following can fill in the blank and allow the code to compile? (Choose all that apply.)

final ______ song = 6;

A. int
B. Integer
C. long
D. Long
E. double
F. Double
```

## Questão 40

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

## Questão 41

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

## Questão 42

```text
What is the result of the following program?

public class Weather {
   enum Seasons {
      WINTER, SPRING, SUMMER, FALL
   }
 
   public static void main(String[] args) {
      Seasons v = null;
      switch (v) {
         case Seasons.SPRING -> System.out.print("s");
         case Seasons.WINTER -> System.out.print("w");
         case Seasons.SUMMER -> System.out.print("m");
         default -> System.out.println("missing data"); }
   } }

A. s
B. w
C. m
D. missing data
E. Exactly one line of code does not compile.
F. More than one line of code does not compile.
G. The code compiles but produces an exception at runtime.
```

## Questão 43

```text
Given the following array, which code snippets print the elements in reverse order from how they are declared? (Choose all that apply.)

char[] wolf = {'W', 'e', 'b', 'b', 'y'};

A. int q = wolf.length;
for ( ; ; ) {
   System.out.print(wolf[--q]);
   if (q==0) break;
}

B. for (int m=wolf.length-1; m>=0; --m)
   System.out.print(wolf[m]);

C. for (int z=0; z<wolf.length; z++)
   System.out.print(wolf[wolf.length-z]);

D. int x = wolf.length-1;
for (int j=0; x>=0 && j==0; x--)
   System.out.print(wolf[x]);

E. final int r = wolf.length;
for (int w = r-1; r>-1; w = r-1)
   System.out.print(wolf[w]);

F. for (int i=wolf.length; i>0; --i)
   System.out.print(wolf[i]);

G. None of the above
```

## Questão 44

```text
Assuming weather is a well-formed nonempty array, which code snippet, when inserted independently into the blank in the following code, prints all of the elements of weather? (Choose all that apply.)

private void print(int[] weather) {
   for () {
      System.out.println(weather[i]);
   }
}

A. int i=weather.length; i>0; i--
B. int i=0; i<=weather.length-1; ++i
C. var w : weather
D. int i=weather.length-1; i>=0; i--
E. int i=0, int j=3; i<weather.length; ++i
F. int i=0; ++i<10 && i<weather.length;
G. None of the above
```

## Questão 45

```text
Which of the following compiles and is equivalent to this loop?

List<Unicorn> all  = new ArrayList<>();
for (Unicorn current : ServiceLoader.load(Unicorn.class))
   all.add(current);

A. List<Unicorn> all = ServiceLoader.load(Unicorn.class)
.getStream()
.toList();

B. List<Unicorn> all = ServiceLoader.load(Unicorn.class)
.stream()
.toList();

C. List<Unicorn> all = ServiceLoader.load(Unicorn.class)
.getStream()
.map(Provider::get)
.toList();

D. List<Unicorn> all = ServiceLoader.load(Unicorn.class)
.stream()
.map(Provider::get)
.toList();

E. None of the above
```

## Questão 46

```text
What is printed by the following code snippet?

23: byte amphibian = 2;
24: String name = "Salamander";
25: String color = switch (amphibian) {
26:    case 1 -> { yield "Red"; }
27:    case 2 -> { if (name.equals("Frog")) yield "Green";
28:                yield "Blue"; }
29:    case 3 -> { yield "Purple"; }
30:    default -> throw new RuntimeException();
31: };
32: System.out.print(color);

A. Red
B. Green
C. Purple
D. Blue
E. The code does not compile.
F. An exception is thrown at runtime.
```

## Questão 47

```text
Which of the following statements are true? (Choose all that apply.)

A. Comparable is in the java.util package.
B. Comparator is in the java.util package.
C. compare() is in the Comparable interface.
D. compare() is in the Comparator interface.
E. compare() takes one method parameter.
F. compare() takes two method parameters.
```

## Questão 48

```text
Which are true about the following code? (Choose all that apply.)

var num1 = Integer.parseInt("11");
var num2 = Integer.valueOf("B", 16);
System.out.println(Integer.max(num1, num2));

A. The output is 11.
B. The output is B.
C. The code does not compile.
D. num1 is a primitive.
E. num2 is a primitive.
F. A NumberFormatException is thrown.
```

## Questão 49

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

## Questão 50

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

---

## Folha de respostas

Preencha **Resposta**; depois confira no livro (Apêndice *Answers to Review Questions*) e registre os erros em `docs/ocp-study/error-log.md`.

| # | Tópico | Fonte | Resposta | Gabarito | ✔/✘ |
|--:|---|---|---|---|:-:|
| 01 | T9 | `09-io-api/QCAP14_04` | | | |
| 02 | T3 | `03-methods/QCAP05_11` | | | |
| 03 | T4 | `04-exceptions-localization/QCAP11_04` | | | |
| 04 | T1 | `14-operators/QCAP02_15` | | | |
| 05 | T8 | `13-concurrency/QCAP13_03` | | | |
| 06 | T7 | `11-modules/QCAP12_07` | | | |
| 07 | T7 | `11-modules/QCAP12_01` | | | |
| 08 | T3 | `01-class-design/QCAP06_04` | | | |
| 09 | T3 | `03-methods/QCAP05_08` | | | |
| 10 | T8 | `13-concurrency/QCAP13_07` | | | |
| 11 | T3 | `01-class-design/QCAP06_07` | | | |
| 12 | T3 | `01-beyond-classes/QCAP07_24` | | | |
| 13 | T3 | `03-methods/QCAP05_09` | | | |
| 14 | T5 | `05-collections-generics/QCAP09_13` | | | |
| 15 | T3 | `01-building-blocks/QCAP01_20` | | | |
| 16 | T4 | `04-exceptions-localization/QCAP11_23` | | | |
| 17 | T4 | `04-exceptions-localization/QCAP11_12` | | | |
| 18 | T5 | `05-collections-generics/QCAP09_03` | | | |
| 19 | T7 | `11-modules/QCAP12_08` | | | |
| 20 | T6 | `07-streams/QCAP10_14` | | | |
| 21 | T8 | `13-concurrency/QCAP13_15` | | | |
| 22 | T6 | `07-streams/QCAP10_12` | | | |
| 23 | T3 | `01-building-blocks/QCAP01_18` | | | |
| 24 | T2 | `02-making-decisions/QCAP03_18` | | | |
| 25 | T5 | `15-core-apis/QCAP04_18` | | | |
| 26 | T1 | `14-operators/QCAP02_14` | | | |
| 27 | T10 | `04-exceptions-localization/QCAP11_25` | | | |
| 28 | T1 | `15-core-apis/QCAP04_14` | | | |
| 29 | T6 | `06-lambdas-functional-interfaces/QCAP08_01` | | | |
| 30 | T8 | `13-concurrency/QCAP13_01` | | | |
| 31 | T10 | `04-exceptions-localization/QCAP11_05` | | | |
| 32 | T4 | `04-exceptions-localization/QCAP11_14` | | | |
| 33 | T6 | `07-streams/QCAP10_04` | | | |
| 34 | T5 | `05-collections-generics/QCAP09_20` | | | |
| 35 | T6 | `07-streams/QCAP10_18` | | | |
| 36 | T6 | `07-streams/QCAP10_13` | | | |
| 37 | T9 | `09-io-api/QCAP14_03` | | | |
| 38 | T6 | `06-lambdas-functional-interfaces/QCAP08_07` | | | |
| 39 | T3 | `03-methods/QCAP05_04` | | | |
| 40 | T9 | `09-io-api/QCAP14_13` | | | |
| 41 | T3 | `01-beyond-classes/QCAP07_27` | | | |
| 42 | T3 | `01-beyond-classes/QCAP07_13` | | | |
| 43 | T2 | `02-making-decisions/QCAP03_17` | | | |
| 44 | T2 | `02-making-decisions/QCAP03_07` | | | |
| 45 | T7 | `11-modules/QCAP12_13` | | | |
| 46 | T2 | `02-making-decisions/QCAP03_27` | | | |
| 47 | T5 | `05-collections-generics/QCAP09_21` | | | |
| 48 | T1 | `01-building-blocks/QCAP01_19` | | | |
| 49 | T1 | `01-building-blocks/QCAP01_09` | | | |
| 50 | T1 | `01-building-blocks/QCAP01_10` | | | |

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
