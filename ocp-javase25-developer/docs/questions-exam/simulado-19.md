# Simulado 19 — 1Z0-831 Java SE 25 Developer Professional

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

## Questão 02

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

## Questão 03

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

## Questão 04

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

## Questão 05

```text
Which of the following methods compile? (Choose all that apply.)

A. public void january() { return; }
B. public int february() { return null;}
C. public void march() {}
D. public int april() { return 9;}
E. public int may() { return 9.0;}
F. public int june() { return;}
```

## Questão 06

```text
Given the generic type String, the partitioningBy() collector creates a Map<Boolean, List<String>> when passed to collect() by default. When a downstream collector is passed to partitioningBy(), which return types can be created? (Choose all that apply.)

A. Map<boolean, List<String>>
B. Map<Boolean, List<String>>
C. Map<Boolean, Map<String>>
D. Map<Boolean, Set<String>>
E. Map<Long, TreeSet<String>>
F. None of the above
```

## Questão 07

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

## Questão 08

```text
Which of the following statements is correct?

A. Package access is more lenient than protected access.
B. A public class that has private fields and package methods is not visible to classes outside the package.
C. You can use access modifiers so only some of the classes in a package see a particular package class.
D. You can use access modifiers to allow access to all methods and not any instance variables.
E. You can use access modifiers to restrict access to all classes that begin with the word Test.
```

## Questão 09

```text
Which lambda can replace the MySecret class to return the same value? (Choose all that apply.)

interface Secret {
      String magic(double d);
}
  
class MySecret implements Secret {
      public String magic(double d) {
            return "Poof";
      } }

A. (e) -> "Poof"
B. (e) -> {"Poof"}
C. (e) -> { String e = ""; "Poof" }
D. (e) -> { String e = ""; return "Poof"; }
E. (e) -> { String e = ""; return "Poof" }
F. (e) -> { String f = ""; return "Poof"; }
```

## Questão 10

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

## Questão 11

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

## Questão 12

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

## Questão 13

```text
Which are true of ExecutorService? (Choose all that apply.)

A. If a task is submitted when no threads are available, the executor discards the task without completing it.
B. If a task is submitted when no threads are available, the executor adds the task to an internal queue and completes when there is an available thread.
C. If a task is submitted when no threads are available, the thread submitting the task waits on the submit call until a thread is available before continuing.
D. Platform threads can be pooled using ExecutorService, but not virtual threads.
E. Virtual threads can be pooled using ExecutorService, but not platform threads.
F. Both platform threads and virtual threads can be pooled using ExecutorService.
```

## Questão 14

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

## Questão 15

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

## Questão 16

```text
Which method signatures are valid overloads of the following method signature? (Choose all that apply.)

A. public void moo(int m, int… n)
B. public void moo(int a, int… b)
C. public int moo(char ch)
D. public void moooo(int… z)
E. private void moo(int… x)
F. public void moooo(int y)
G. public void moo(int… c, int d)
H. public void moo(int… i, int j…)
```

## Questão 17

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

## Questão 18

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

## Questão 19

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

## Questão 20

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

## Questão 21

```text
Which of the following statements about the Callable call() and Runnable run() methods are correct? (Choose all that apply.)

A. Both methods return void.
B. Both can throw unchecked exceptions.
C. Both can be implemented with lambda expressions.
D. Runnable returns a generic type.
E. Both can throw checked exceptions.
F. Callable returns a generic type.
```

## Questão 22

```text
Which of the following statements about methods are true? (Choose all that apply.)

A. Overloaded methods must have the same signature.
B. Overridden methods must have the same signature.
C. Hidden methods must have the same signature.
D. Overloaded methods must have the same return type.
E. Overridden methods must have the same return type.
F. Hidden methods must have the same return type.
```

## Questão 23

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

## Questão 24

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

## Questão 25

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

## Questão 26

```text
What does the following program print?

1:    public class Zebra {
2:          private int x = 24;
3:          public int hunt() {
4:                String message = "x is ";
5:                abstract class Stripes {
6:                      private int x = 0;
7:                      public void print() {
8:                            System.out.print(message + Zebra.this.x);
9:                      }
10:              }
11:              var s = new Stripes() {};
12:              s.print();
13:              return x;
14:        }
15:        public static void main(String[] args) {
16:              new Zebra().hunt();
17:        } }

A. x is 0
B. x is 24
C. Line 6 generates a compiler error.
D. Line 8 generates a compiler error.
E. Line 11 generates a compiler error.
F. None of the above.
```

## Questão 27

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

## Questão 28

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

## Questão 29

```text
What types can be inserted in the blanks on the lines marked X and Z that allow the code to compile? (Choose all that apply.)

interface Walk { private static List move() { return null; } }
interface Run extends Walk { public ArrayList move(); }
class Leopard implements Walk {
      public ___________ move() {    // X
            return null;
      }
}
class Panther implements Run {
      public    move(___________) {    // Z
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

## Questão 30

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

## Questão 31

```text
Suppose that we have the following three properties files and code. Which bundles are used on lines 8 and 9, respectively?

Dolphins.properties
name=The Dolphin
age=0
  
Dolphins_en.properties
name=Dolly
age=4
  
Dolphins_fr.properties
name=Dolly
  
5: var fr = Locale.of("fr");
6: Locale.setDefault(Locale.of("en", "US"));
7: var b = ResourceBundle.getBundle("Dolphins", fr);
8: b.getString("name");
9: b.getString("age");

A. Dolphins.properties and Dolphins.properties
B. Dolphins.properties and Dolphins_en.properties
C. Dolphins_en.properties and Dolphins_en.properties
D. Dolphins_fr.properties and Dolphins.properties
E. Dolphins_fr.properties and Dolphins_en.properties
F. The code does not compile.
G. None of the above.
```

## Questão 32

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

## Questão 33

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

## Questão 34

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

## Questão 35

```text
Which of the following lambda expressions can be passed to a function of Predicate<String> type? (Choose all that apply.)

A. s -> s.isEmpty()
B. s --> s.isEmpty()
C. (String s) -> s.isEmpty()
D. (String s) --> s.isEmpty()
E. (StringBuilder s) -> s.isEmpty()
F. (StringBuilder s) --> s.isEmpty()
```

## Questão 36

```text
What is the output of calling printType(11)?

31: void printType(Object o) {
32:        if (o instanceof Integer bat) {
33:              System.out.print("int");
34:        } else if (o instanceof Integer bat && bat < 10) {
35:              System.out.print("small int");
36:        } else if (o instanceof Long bat || bat <= 20) {
37:              System.out.print("long");
38:        } default {
39:              System.out.print("unknown");
40:        }
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

## Questão 37

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

## Questão 38

```text
What is the result of running the following class?

1:    import java.util.function.*;
2:
3:    public class Panda {
4:          int age;
5:          public static void main(String[] args) {
6:                Panda p1 = new Panda();
7:                p1.age = 1;
8:                check(p1, p -> {p.age < 5});
9:          }
10:        private static void check(Panda panda,
11:              Predicate<Panda> pred) {
12:              String result = pred.test(panda)
13:                    ? "match" : "not match";
14:              System.out.print(result);
15: } }

A. match
B. not match
C. Compiler error on line 8.
D. Compiler error on line 10.
E. Compiler error on line 12.
F. A runtime exception is thrown.
```

## Questão 39

```text
Which of the following pairs make up a service?

A. Consumer and service locator
B. Consumer and service provider interface
C. Service locator and service provider
D. Service locator and service provider interface
E. Service provider and service provider interface
```

## Questão 40

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

## Questão 41

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

## Questão 42

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

## Questão 43

```text
For a top-down migration, all modules other than named modules are _____________ modules and are on the _____________.

A. automatic, classpath
B. automatic, module path
C. unnamed, classpath
D. unnamed, module path
E. None of the above
```

## Questão 44

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

## Questão 45

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

## Questão 46

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

## Questão 47

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

## Questão 48

```text
Which of the following statements about the code snippet are true? (Choose all that apply.)

3: short numPets = 5L;
4: int numGrains = 2.0;
5: String name = "Scruffy";
6: int d = numPets.length();
7: int e = numGrains.length;
8: int f = name.length();

A.Line 3 generates a compiler error.
B.Line 4 generates a compiler error.
C.Line 5 generates a compiler error.
D.Line 6 generates a compiler error.
E.Line 7 generates a compiler error.
F.Line 8 generates a compiler error.
```

## Questão 49

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

## Questão 50

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

---

## Folha de respostas

Preencha **Resposta**; depois confira no livro (Apêndice *Answers to Review Questions*) e registre os erros em `docs/ocp-study/error-log.md`.

| # | Tópico | Fonte | Resposta | Gabarito | ✔/✘ |
|--:|---|---|---|---|:-:|
| 01 | T6 | `07-streams/QCAP10_17` | | | |
| 02 | T1 | `14-operators/QCAP02_17` | | | |
| 03 | T3 | `01-class-design/QCAP06_07` | | | |
| 04 | T10 | `04-exceptions-localization/QCAP11_05` | | | |
| 05 | T3 | `03-methods/QCAP05_05` | | | |
| 06 | T6 | `07-streams/QCAP10_15` | | | |
| 07 | T3 | `01-beyond-classes/QCAP07_23` | | | |
| 08 | T3 | `03-methods/QCAP05_08` | | | |
| 09 | T6 | `06-lambdas-functional-interfaces/QCAP08_04` | | | |
| 10 | T9 | `09-io-api/QCAP14_19` | | | |
| 11 | T4 | `04-exceptions-localization/QCAP11_12` | | | |
| 12 | T4 | `04-exceptions-localization/QCAP11_01` | | | |
| 13 | T8 | `13-concurrency/QCAP13_09` | | | |
| 14 | T5 | `05-collections-generics/QCAP09_07` | | | |
| 15 | T6 | `06-lambdas-functional-interfaces/QCAP08_02` | | | |
| 16 | T3 | `03-methods/QCAP05_21` | | | |
| 17 | T5 | `05-collections-generics/QCAP09_03` | | | |
| 18 | T5 | `05-collections-generics/QCAP09_20` | | | |
| 19 | T3 | `01-class-design/QCAP06_04` | | | |
| 20 | T9 | `09-io-api/QCAP14_12` | | | |
| 21 | T8 | `13-concurrency/QCAP13_03` | | | |
| 22 | T3 | `01-class-design/QCAP06_03` | | | |
| 23 | T5 | `05-collections-generics/QCAP09_14` | | | |
| 24 | T8 | `13-concurrency/QCAP13_20` | | | |
| 25 | T3 | `03-methods/QCAP05_07` | | | |
| 26 | T3 | `01-beyond-classes/QCAP07_25` | | | |
| 27 | T4 | `04-exceptions-localization/QCAP11_07` | | | |
| 28 | T5 | `05-collections-generics/QCAP09_19` | | | |
| 29 | T3 | `01-beyond-classes/QCAP07_10` | | | |
| 30 | T1 | `15-core-apis/QCAP04_17` | | | |
| 31 | T10 | `04-exceptions-localization/QCAP11_19` | | | |
| 32 | T7 | `11-modules/QCAP12_13` | | | |
| 33 | T9 | `09-io-api/QCAP14_07` | | | |
| 34 | T2 | `02-making-decisions/QCAP03_04` | | | |
| 35 | T6 | `06-lambdas-functional-interfaces/QCAP08_06` | | | |
| 36 | T2 | `02-making-decisions/QCAP03_08` | | | |
| 37 | T7 | `11-modules/QCAP12_23` | | | |
| 38 | T6 | `06-lambdas-functional-interfaces/QCAP08_17` | | | |
| 39 | T7 | `11-modules/QCAP12_04` | | | |
| 40 | T6 | `06-lambdas-functional-interfaces/QCAP08_01` | | | |
| 41 | T1 | `14-operators/QCAP02_03` | | | |
| 42 | T1 | `14-operators/QCAP02_15` | | | |
| 43 | T7 | `11-modules/QCAP12_15` | | | |
| 44 | T4 | `04-exceptions-localization/QCAP11_23` | | | |
| 45 | T2 | `02-making-decisions/QCAP03_14` | | | |
| 46 | T1 | `15-core-apis/QCAP04_07` | | | |
| 47 | T3 | `03-methods/QCAP05_15` | | | |
| 48 | T1 | `01-building-blocks/QCAP01_14` | | | |
| 49 | T2 | `02-making-decisions/QCAP03_28` | | | |
| 50 | T8 | `13-concurrency/QCAP13_01` | | | |

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
