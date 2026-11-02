# Simulado 17 — 1Z0-831 Java SE 25 Developer Professional

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

## Questão 02

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

## Questão 03

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

## Questão 04

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

## Questão 05

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

## Questão 06

```text
What is true of a module containing a file named module-info.java with the following contents? (Choose all that apply.)

A. module com.food.supplier {}
B. All packages inside the module are automatically exported.
C. No packages inside the module are automatically exported.
D. A main method inside the module can be run.
E. A main method inside the module cannot be run since the class is not exposed.
F. The module-info.java file contains a compiler error.
G. The module-info.java filename is incorrect.
```

## Questão 07

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

## Questão 08

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

## Questão 09

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

## Questão 10

```text
Which is true of the following code?

int length = 3;
 
for (int i = 0; i<3; i++) {
   if (i%2 == 0) {
      Supplier<Integer> supplier = () -> length; // A
      System.out.println(supplier.get());        // B
   } else {
      int j = i;
      Supplier<Integer> supplier = () -> j;      // C
      System.out.println(supplier.get());        // D
   }
}

A. The first compiler error is on line A.
B. The first compiler error is on line B.
C. The first compiler error is on line C.
D. The first compiler error is on line D.
E. The code compiles successfully.
```

## Questão 11

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

## Questão 12

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

## Questão 13

```text
Which of the following methods compile? (Choose all that apply.)

A. final static void rain() {}
B. public final int void snow() {}
C. private void int hail() {}
D. static final void sleet() {}
E. void final ice() {}
F. void public slush() {}
```

## Questão 14

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

## Questão 15

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

## Questão 16

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

## Questão 17

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

## Questão 18

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

## Questão 19

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

## Questão 20

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

## Questão 21

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

## Questão 22

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

## Questão 23

```text
What data type (or types) will allow the following code snippet to compile? (Choose all that apply.)

byte apples = 5;
short oranges = 10;
____ bananas = apples + oranges;

A. int
B. long
C. boolean
D. double
E. short
F. byte
```

## Questão 24

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

## Questão 25

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

## Questão 26

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

## Questão 27

```text
Assuming the following classes are declared as top-level types in the same file, which classes contain compiler errors? (Choose all that apply.)

sealed class Bird {
   public final class Flamingo extends Bird {}   
}
 
sealed class Monkey {}
 
class EmperorTamarin extends Monkey {}
 
non-sealed class Mandrill extends Monkey {}
 
sealed class Friendly extends Mandrill permits Silly {}
 
final class Silly {}
 

A. Bird
B. Monkey
C. EmperorTamarin
D. Mandrill
E. Friendly
F. Silly
G. All of the classes compile without issue.
```

## Questão 28

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

## Questão 29

```text
Suppose you need to display a collection of products for sale, which may contain duplicates. Additionally, you have a collection of sales that you need to track, sorted by the natural order of the sale ID, and you need to retrieve the text of each. Which two of the following classes best suit your needs for each of these scenarios? (Choose two.)

A. ArrayList
B. HashMap
C. HashSet
D. LinkedList
E. SequencedTreeSet
F. TreeMap
```

## Questão 30

```text
Which of the following can be inserted without causing a compilation error? (Choose all that apply.)

public void remove(List<Character> chars) {
   char end = 'z';
   Predicate<Character> predicate = c -> {
      char start = 'a'; return start <= c && c <= end; };
 
   // INSERT LINE HERE
}

A. char start = ’a’;
B. char c = ’x’;
C. chars = null;
D. end = ’1’;
E. None of the above
```

## Questão 31

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

## Questão 32

```text
Which variables or members are accessible from within the hiss() method? (Choose all that apply.)

13: public class BoaConstrictor {
14:    private Body body;
15:    BoaConstrictor(Body b) { this.body = b; }
16:    private long tail = 10;
17:    record Body(int stripes) {
18:       private static int counter = 0;
19:       int counter() { return counter; }
20:       Body {
21:          stripes = stripes + counter++;
22:       }
23:       private void hiss() {} } }


A. counter()
B. tail
C. body
D. stripes()
E. stripes
F. counter
G. Line 15 does not compile.
H. Line 17 does not compile.
I. Lines 20–22 do not compile.
```

## Questão 33

```text
Suppose you have separate modules for a service provider interface, service provider, service locator, and consumer. Which statements are true about the directives you need to specify? (Choose all that apply.)

A. The consumer must use the requires directive.
B. The consumer must use the uses directive.
C. The service locator must use the requires directive.
D. The service locator must use the uses directive.
E. None of the above.
```

## Questão 34

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

## Questão 35

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

## Questão 36

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

## Questão 37

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

## Questão 38

```text
Which statement about methods in ReentrantLock is correct?

A. The lock() method will attempt to acquire a lock without waiting indefinitely for it.
B. The testLock() method will attempt to acquire a lock without waiting indefinitely for it.
C. The attemptLock() method will attempt to acquire a lock without waiting indefinitely for it.
D. By default, a ReentrantLock fairly releases to each thread in the order in which it was requested.
E. Calling the unlock() method once will release a resource so that other threads can obtain the lock.
F. None of the above.
```

## Questão 39

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

## Questão 40

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

## Questão 41

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

## Questão 42

```text
Which statements are true? (Choose all that apply.)

A. The Consumer interface is good for printing out an existing value.
B. The Supplier interface is good for printing out an existing value.
C. The IntegerSupplier interface returns an int.
D. The Predicate interface returns an int.
E. The Function interface has a method named test().
F. The Predicate interface has a method named test().
```

## Questão 43

```text
Which statements about the following class are true? (Choose all that apply.)

1:  public class River {
2:     int Depth = 1;
3:     float temp = 50.0;
4:     public void flow() {
5:        for (int i = 0; i < 1; i++) {
6:           int depth = 2;
7:           depth++;
8:           temp--;
9:        }
10:       System.out.println(depth);
11:       System.out.println(temp); }
12:    public static void main(String… s) {
13:       new River().flow();
14: } }

A. Line 3 generates a compiler error.
B. Line 6 generates a compiler error.
C. Line 7 generates a compiler error.
D. Line 10 generates a compiler error.
E. The program prints 3 on line 10.
F. The program prints 4 on line 10.
G. The program prints 50.0 on line 11.
H. The program prints 49.0 on line 11.
```

## Questão 44

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

## Questão 45

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

## Questão 46

```text
What is the result of the following code snippet?

final char a = 'A', e = 'E';
char grade = 'B';
switch (grade) {
   default:
   case a:
   case 'B': 'C': System.out.print("great ");
   case 'D':      System.out.print("good "); break;
   case e:
   case 'F':      System.out.print("not good ");
}

A. great
B. great good
C. good
D. not good
E. The code does not compile because the data type of one or more case clauses does not match the data type of the switch variable.
F. None of the above.
```

## Questão 47

```text
A minimum of how many lines need to be corrected before the following method will compile?

21: void findZookeeper(Integer id) {
22:    System.out.print(switch (id) {
23:       case 10 -> {"Jane";}
24:       case 20 -> {yield "Lisa";};
25:       case 30 -> "Kelly";
26:       case 30 -> "Sarah";
27:       default -> "Unassigned";
28:    });
29: }

A. Zero
B. One
C. Two
D. Three
E. Four
F. Five
```

## Questão 48

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

## Questão 49

```text
Which are true statements? (Choose all that apply.)

A. An automatic module exports all packages to named modules.
B. An automatic module exports only the specified packages to named modules.
C. An automatic module exports no packages to named modules.
D. An unnamed module exports only the named packages to named modules.
E. An unnamed module exports all packages to named modules.
F. An unnamed module exports no packages to named modules.
```

## Questão 50

```text
Which of the following methods compile? (Choose all that apply.)

A. public void january() { return; }
B. public int february() { return null;}
C. public void march() {}
D. public int april() { return 9;}
E. public int may() { return 9.0;}
F. public int june() { return;}
```

---

## Folha de respostas

Preencha **Resposta**; depois confira no livro (Apêndice *Answers to Review Questions*) e registre os erros em `docs/ocp-study/error-log.md`.

| # | Tópico | Fonte | Resposta | Gabarito | ✔/✘ |
|--:|---|---|---|---|:-:|
| 01 | T8 | `13-concurrency/QCAP13_05` | | | |
| 02 | T2 | `02-making-decisions/QCAP03_03` | | | |
| 03 | T3 | `01-class-design/QCAP06_24` | | | |
| 04 | T4 | `04-exceptions-localization/QCAP11_01` | | | |
| 05 | T1 | `14-operators/QCAP02_16` | | | |
| 06 | T7 | `11-modules/QCAP12_10` | | | |
| 07 | T1 | `15-core-apis/QCAP04_04` | | | |
| 08 | T5 | `05-collections-generics/QCAP09_12` | | | |
| 09 | T10 | `04-exceptions-localization/QCAP11_06` | | | |
| 10 | T6 | `06-lambdas-functional-interfaces/QCAP08_13` | | | |
| 11 | T3 | `01-beyond-classes/QCAP07_29` | | | |
| 12 | T6 | `07-streams/QCAP10_20` | | | |
| 13 | T3 | `03-methods/QCAP05_03` | | | |
| 14 | T9 | `09-io-api/QCAP14_12` | | | |
| 15 | T2 | `02-making-decisions/QCAP03_17` | | | |
| 16 | T4 | `04-exceptions-localization/QCAP11_18` | | | |
| 17 | T10 | `04-exceptions-localization/QCAP11_09` | | | |
| 18 | T5 | `05-collections-generics/QCAP09_15` | | | |
| 19 | T9 | `09-io-api/QCAP14_15` | | | |
| 20 | T1 | `14-operators/QCAP02_09` | | | |
| 21 | T9 | `09-io-api/QCAP14_18` | | | |
| 22 | T3 | `01-beyond-classes/QCAP07_02` | | | |
| 23 | T1 | `14-operators/QCAP02_02` | | | |
| 24 | T7 | `11-modules/QCAP12_07` | | | |
| 25 | T6 | `06-lambdas-functional-interfaces/QCAP08_21` | | | |
| 26 | T1 | `01-building-blocks/QCAP01_10` | | | |
| 27 | T3 | `01-beyond-classes/QCAP07_30` | | | |
| 28 | T3 | `01-class-design/QCAP06_13` | | | |
| 29 | T5 | `05-collections-generics/QCAP09_01` | | | |
| 30 | T6 | `06-lambdas-functional-interfaces/QCAP08_10` | | | |
| 31 | T4 | `04-exceptions-localization/QCAP11_04` | | | |
| 32 | T3 | `01-beyond-classes/QCAP07_12` | | | |
| 33 | T7 | `11-modules/QCAP12_25` | | | |
| 34 | T8 | `13-concurrency/QCAP13_04` | | | |
| 35 | T4 | `04-exceptions-localization/QCAP11_24` | | | |
| 36 | T8 | `13-concurrency/QCAP13_14` | | | |
| 37 | T1 | `15-core-apis/QCAP04_08` | | | |
| 38 | T8 | `13-concurrency/QCAP13_17` | | | |
| 39 | T3 | `01-building-blocks/QCAP01_18` | | | |
| 40 | T3 | `01-class-design/QCAP06_26` | | | |
| 41 | T5 | `15-core-apis/QCAP04_18` | | | |
| 42 | T6 | `06-lambdas-functional-interfaces/QCAP08_09` | | | |
| 43 | T3 | `01-building-blocks/QCAP01_23` | | | |
| 44 | T5 | `05-collections-generics/QCAP09_10` | | | |
| 45 | T6 | `07-streams/QCAP10_18` | | | |
| 46 | T2 | `02-making-decisions/QCAP03_16` | | | |
| 47 | T2 | `02-making-decisions/QCAP03_21` | | | |
| 48 | T6 | `07-streams/QCAP10_17` | | | |
| 49 | T7 | `11-modules/QCAP12_22` | | | |
| 50 | T3 | `03-methods/QCAP05_05` | | | |

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
