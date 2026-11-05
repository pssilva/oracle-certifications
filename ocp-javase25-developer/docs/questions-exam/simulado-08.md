# Simulado 08 — 1Z0-831 Java SE 25 Developer Professional

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
What changes need to be made together for this code to print the string 12345? (Choose all that apply.)

Stream.iterate(1, x -> x++)
   .limit(5).map(x -> x)
   .collect(Collectors.joining());

A. Changing Collectors.joining() to Collectors.joining(",")
B. Changing map(x -> x) to map(x -> "" + x)
C. Changing x -> x++ to x -> ++x
D. Adding .forEach(System.out::print) after the call to collect()
E. Wrapping the entire line in a System.out.print statement
F. None of the above; the code already prints 12345
```

## Questão 02

```text
What is the output of the following code snippet?

15: int penguin = 50, turtle = 75;
16: boolean older = penguin>= turtle;
17: if (older = true) System.out.println("Success");
18: else System.out.println("Failure");
19: else if (penguin != 50) System.out.println("Other");

A. Success
B. Failure
C. Other
D. The code will not compile because of line 17.
E. The code compiles but throws an exception at runtime.
F. None of the above.
```

## Questão 03

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

## Questão 04

```text
Which variables or members are accessible from within the hiss() method? (Choose all that apply.)

13: public class BoaConstrictor {
14:        private Body body;
15:        BoaConstrictor(Body b) { this.body = b; }
16:        private long tail = 10;
17:        record Body(int stripes) {
18:              private static int counter = 0;
19:              int counter() { return counter; }
20:              Body {
21:                    stripes = stripes + counter++;
22:              }
23:              private void hiss() {} } }


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

## Questão 05

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

## Questão 06

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

## Questão 07

```text
Which is true of the following code?

int length = 3;
  
for (int i = 0; i<3; i++) {
      if (i%2 == 0) {
            Supplier<Integer> supplier = () -> length; // A
            System.out.println(supplier.get());                // B
      } else {
            int j = i;
            Supplier<Integer> supplier = () -> j;            // C
            System.out.println(supplier.get());                // D
      }
}

A. The first compiler error is on line A.
B. The first compiler error is on line B.
C. The first compiler error is on line C.
D. The first compiler error is on line D.
E. The code compiles successfully.
```

## Questão 08

```text
Which statement about methods in ReentrantLock is correct?

A. The lock() method will attempt to acquire a lock without waiting indefinitely for it.
B. The testLock() method will attempt to acquire a lock without waiting indefinitely for it.
C. The attemptLock() method will attempt to acquire a lock without waiting indefinitely for it.
D. By default, a ReentrantLock fairly releases to each thread in the order in which it was requested.
E. Calling the unlock() method once will release a resource so that other threads can obtain the lock.
F. None of the above.
```

## Questão 09

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

## Questão 10

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

## Questão 11

```text
Which statement about the following program is correct?

1:    class Bird {
2:          int feathers = 0;
3:          Bird(int x) { this.feathers = x; }
4:          Bird fly() {
5:                return new Bird(1);
6:          } }
7:    class Parrot extends Bird {
8:          protected Parrot(int y) { super(y); }
9:          protected Parrot fly() {
10:              return new Parrot(2);
11:        } }
12: public class Macaw extends Parrot {
13:        public Macaw(int z) { super(z); }
14:        public Macaw fly() {
15:              return new Macaw(3);
16:        }
17:        public static void main(String… sing) {
18:              Bird p = new Macaw(4);
19:              System.out.print(((Parrot)p.fly()).feathers);
20:        } }

A. One line contains a compiler error.
B. Two lines contain compiler errors.
C. Three lines contain compiler errors.
D. The code compiles but throws a ClassCastException at runtime.
E. The program compiles and prints 3.
F. The program compiles and prints 0.
```

## Questão 12

```text
Which of these array declarations are not legal? (Choose all that apply.)

A. int[][] scores = new int[5][];
B. Object[][][] cubbies = new Object[3][0][5];
C. String beans[] = new beans[6];
D. java.util.Date[] dates[] = new java.util.Date[2][];
E. int[][] types = new int[];
F. int[][] java = new int[][];
```

## Questão 13

```text
Two commands create artifacts that include smaller versions of the JDK. Which are used to create an .exe file and a directory, respectively?

A. jimage and jlink
B. jimage and jpackage
C. jlink and jimage
D. jlink and jpackage
E. jpackage and jimage
F. jpackage and jlink
```

## Questão 14

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

## Questão 15

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

## Questão 16

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

## Questão 17

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

## Questão 18

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

## Questão 19

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

## Questão 20

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

## Questão 21

```text
Which of the following are properties of immutable classes? (Choose all that apply.)

A. The class can contain setter methods, provided they are marked final.
B. The class must not be able to be extended outside the class declaration.
C. The class may not contain any instance variables.
D. The class must be marked static.
E. The class may not contain any static variables.
F. The class may only contain private constructors.
G. The data for mutable instance variables may be read, provided they cannot be modified by the caller.
```

## Questão 22

```text
For a top-down migration, all modules other than named modules are _____________ modules and are on the _____________.

A. automatic, classpath
B. automatic, module path
C. unnamed, classpath
D. unnamed, module path
E. None of the above
```

## Questão 23

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

## Questão 24

```text
Which of the following statements about resource bundles are correct? (Choose all that apply.)

A. All keys must be in the same resource bundle to be used.
B. A resource bundle is loaded by calling the new ResourceBundle() constructor.
C. Resource bundle values are always read using the Properties class.
D. Changing the default locale lasts for only a single run of the program.
E. If a resource bundle for a specific locale is requested, then the resource bundle for the default locale will not be used.
F. It is possible to use a resource bundle for a locale without specifying a default locale.
```

## Questão 25

```text
Suppose that you need to read text data from a file and want the data to be performant on large files. Which two java.io stream classes can be chained together to best achieve this result? (Choose two.)

A. BufferedInputStream
B. BufferedReader
C. FileInputStream
D. FileReader
E. PrintInputStream
F. ObjectInputStream
G. PrintReader
```

## Questão 26

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

## Questão 27

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

## Questão 28

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

## Questão 29

```text
What is the result of the following code?

1: public record Hello<T>(T t) {
2:    public Hello(T t) { this.t = t; }
3:    private <T> void println(T message) {
4:       System.out.print(t + "-" + message);
5:    }
6:    public static void main(String[] args) {
7:       new Hello<String>("hi").println(1);
8:       new Hello("hola").println(true);
9:    } }

A. hi followed by a runtime exception.
B. hi-1hola-true
C. The first compiler error is on line 1.
D. The first compiler error is on line 3.
E. The first compiler error is on line 8.
F. The first compiler error is on another line.
```

## Questão 30

```text
Which of the following statements are true in a module-info.java file? (Choose all that apply.)

A. The opens directive allows the use of reflection.
B. The opens directive declares that an API is called.
C. The use directive allows the use of reflection.
D. The use directive declares that an API is called.
E. The uses directive allows the use of reflection.
F. The uses directive declares that an API is called.
```

## Questão 31

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

## Questão 32

```text
Which statements are true? (Choose all that apply.)

A. The Consumer interface is good for printing out an existing value.
B. The Supplier interface is good for printing out an existing value.
C. The IntegerSupplier interface returns an int.
D. The Predicate interface returns an int.
E. The Function interface has a method named test().
F. The Predicate interface has a method named test().
```

## Questão 33

```text
What is the result of the following?

1:    public class PolarBear {
2:          StringBuilder value = new StringBuilder("t");
3:          { value.append("a"); }
4:          { value.append("c"); }
5:          private PolarBear() {
6:                value.append("b");
7:          }
8:          public PolarBear(String s) {
9:                this();
10:              value.append(s);
11:        }
12:        public PolarBear(CharSequence p) {
13:              value.append(p);
14:        }
15:        public static void main(String[] args) {
16:              Object bear = new PolarBear();
17:              bear = new PolarBear("f");
18:              System.out.println(((PolarBear)bear).value);
19:        } }

A. tacb
B. tacf
C. tacbf
D. tcafb
E. taftacb
F. The code does not compile.
G. An exception is thrown.
```

## Questão 34

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

## Questão 35

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

## Questão 36

```text
Which statements about the following class are true? (Choose all that apply.)

1:    public class River {
2:          int Depth = 1;
3:          float temp = 50.0;
4:          public void flow() {
5:                for (int i = 0; i < 1; i++) {
6:                      int depth = 2;
7:                      depth++;
8:                      temp--;
9:                }
10:              System.out.println(depth);
11:              System.out.println(temp); }
12:        public static void main(String… s) {
13:              new River().flow();
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

## Questão 37

```text
Given the generic type String, the partitioningBy() collector creates a Map<Boolean, List<String>> when passed to collect() by default. When a downstream collector is passed to partitioningBy(), which return types can be created? (Choose all that apply.)

A. Map<boolean, List<String>>
B. Map<Boolean, List<String>>
C. Map<Boolean, Map<String>>
D. Map<Boolean, Set<String>>
E. Map<Long, TreeSet<String>>
F. None of the above
```

## Questão 38

```text
Which APIs exist for creating or working with platform threads? (Choose all that apply.)

A. Executors.newCachedThreadPool()
B. Executors.newPlatformThreadPool()
C. Executors.newPlatformThreadPerTaskExecutor()
D. new Thread()
E. Thread.ofPlatform()
F. Thread.ofPlatformThread()
```

## Questão 39

```text
Which of the following are common types to localize? (Choose all that apply.)

A. Dates
B. Lambda expressions
C. Class names
D. Currency
E. Numbers
F. Variable names
```

## Questão 40

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

## Questão 41

```text
What is printed by the following code snippet?

23: byte amphibian = 2;
24: String name = "Salamander";
25: String color = switch (amphibian) {
26:        case 1 -> { yield "Red"; }
27:        case 2 -> { if (name.equals("Frog")) yield "Green";
28:                                yield "Blue"; }
29:        case 3 -> { yield "Purple"; }
30:        default -> throw new RuntimeException();
31: };
32: System.out.print(color);

A. Red
B. Green
C. Purple
D. Blue
E. The code does not compile.
F. An exception is thrown at runtime.
```

## Questão 42

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

## Questão 43

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

## Questão 44

```text
Which of the following correctly create Path instances? (Choose all that apply.)

A. new Path("jaguar.txt")
B. Path.get("cats","lynx.txt")
C. new java.io.File("tiger.txt").toPath()
D. Paths.get("ocelot.txt")
E. Path.of(".")
```

## Questão 45

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

## Questão 46

```text
Which of the following statements about overridden methods are true? (Choose all that apply.)

A. An overridden method must contain method parameters that are the same or covariant with the method parameters in the inherited method.
B. An overridden method may declare a new exception, provided it is not checked.
C. An overridden method must be more accessible than the method in the parent class.
D. An overridden method may declare a broader checked exception than the method in the parent class.
E. If an inherited method returns void, then the overridden version of the method must return void.
F. None of the above.
```

## Questão 47

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

## Questão 48

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

## Questão 49

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

## Questão 50

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

---

## Folha de respostas

Preencha **Resposta**; depois confira no livro (Apêndice *Answers to Review Questions*) e registre os erros em `docs/ocp-study/error-log.md`.

| # | Tópico | Fonte | Resposta | Gabarito | ✔/✘ |
|--:|---|---|---|---|:-:|
| 01 | T6 | `07-streams/QCAP10_11` | | | |
| 02 | T2 | `02-making-decisions/QCAP03_23` | | | |
| 03 | T5 | `05-collections-generics/QCAP09_23` | | | |
| 04 | T3 | `01-beyond-classes/QCAP07_12` | | | |
| 05 | T9 | `09-io-api/QCAP14_13` | | | |
| 06 | T1 | `15-core-apis/QCAP04_12` | | | |
| 07 | T6 | `06-lambdas-functional-interfaces/QCAP08_13` | | | |
| 08 | T8 | `13-concurrency/QCAP13_17` | | | |
| 09 | T3 | `01-class-design/QCAP06_08` | | | |
| 10 | T3 | `03-methods/QCAP05_09` | | | |
| 11 | T3 | `01-class-design/QCAP06_20` | | | |
| 12 | T5 | `15-core-apis/QCAP04_02` | | | |
| 13 | T7 | `11-modules/QCAP12_18` | | | |
| 14 | T1 | `14-operators/QCAP02_09` | | | |
| 15 | T2 | `02-making-decisions/QCAP03_19` | | | |
| 16 | T5 | `05-collections-generics/QCAP09_10` | | | |
| 17 | T1 | `14-operators/QCAP02_17` | | | |
| 18 | T4 | `04-exceptions-localization/QCAP11_24` | | | |
| 19 | T4 | `04-exceptions-localization/QCAP11_18` | | | |
| 20 | T1 | `15-core-apis/QCAP04_14` | | | |
| 21 | T3 | `01-class-design/QCAP06_21` | | | |
| 22 | T7 | `11-modules/QCAP12_15` | | | |
| 23 | T8 | `13-concurrency/QCAP13_24` | | | |
| 24 | T10 | `04-exceptions-localization/QCAP11_17` | | | |
| 25 | T9 | `09-io-api/QCAP14_25` | | | |
| 26 | T7 | `01-building-blocks/QCAP01_13` | | | |
| 27 | T3 | `01-class-design/QCAP06_06` | | | |
| 28 | T8 | `13-concurrency/QCAP13_13` | | | |
| 29 | T5 | `05-collections-generics/QCAP09_05` | | | |
| 30 | T7 | `11-modules/QCAP12_06` | | | |
| 31 | T2 | `02-making-decisions/QCAP03_06` | | | |
| 32 | T6 | `06-lambdas-functional-interfaces/QCAP08_09` | | | |
| 33 | T3 | `01-class-design/QCAP06_11` | | | |
| 34 | T6 | `06-lambdas-functional-interfaces/QCAP08_04` | | | |
| 35 | T1 | `15-core-apis/QCAP04_10` | | | |
| 36 | T3 | `01-building-blocks/QCAP01_23` | | | |
| 37 | T6 | `07-streams/QCAP10_15` | | | |
| 38 | T8 | `13-concurrency/QCAP13_16` | | | |
| 39 | T10 | `04-exceptions-localization/QCAP11_03` | | | |
| 40 | T1 | `15-core-apis/QCAP04_04` | | | |
| 41 | T2 | `02-making-decisions/QCAP03_27` | | | |
| 42 | T6 | `07-streams/QCAP10_17` | | | |
| 43 | T3 | `01-beyond-classes/QCAP07_01` | | | |
| 44 | T9 | `09-io-api/QCAP14_10` | | | |
| 45 | T4 | `04-exceptions-localization/QCAP11_12` | | | |
| 46 | T3 | `01-class-design/QCAP06_09` | | | |
| 47 | T3 | `01-beyond-classes/QCAP07_28` | | | |
| 48 | T5 | `05-collections-generics/QCAP09_16` | | | |
| 49 | T6 | `07-streams/QCAP10_16` | | | |
| 50 | T4 | `04-exceptions-localization/QCAP11_02` | | | |

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
