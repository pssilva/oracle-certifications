# Simulado 10 — 1Z0-831 Java SE 25 Developer Professional

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

## Questão 02

```text
We have a method that returns a sorted list without changing the original. We want to rewrite it. Which of the following pairs can fill in the blanks in refactored() to do the same with streams?

private static List<String> sort(List<String> list) {
   var copy = new ArrayList<String>(list);
   Collections.sort(copy, (a, b) -> b.compareTo(a));
   return copy;
}
 
private static List<String> refactored(List<String> list) {
   return list.stream()
      ._______((a, b) -> b.compareTo(a))
      .__________;
}

A. compare and toList()
B. compare and sort()
C. compareTo and toList()
D. compareTo and sort()
E. sorted and collect()
F. sorted and collect(Collectors.toList())
```

## Questão 03

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

## Questão 04

```text
Which is a true statement about the following module?

class dragon {
   exports com.dragon.fire;
   exports com.dragon.scales to castle;
}

A. All modules can reference the com.dragon.fire package.
B. All modules can reference the com.dragon.scales package.
C. Only the castle module can reference the com.dragon.fire package.
D. Only the castle module can reference the com.dragon.scales package.
E. None of the above.
```

## Questão 05

```text
Assume that /monkeys exists as a directory containing multiple files, symbolic links, and subdirectories. Which statement about the following code is correct?

var f = Path.of("/monkeys");
try (var m =
   Files.find(f, 0, (p,a) -> a.isSymbolicLink())) { // y1
      m.map(s -> s.toString())
         .collect(Collectors.toList())
         .stream()
         .filter(s -> s.toString().endsWith(".txt")) // y2
         .forEach(System.out::println);
}

A. It will print all symbolic links in the directory tree ending in .txt.
B. It will print the target of all symbolic links in the directory ending in .txt.
C. It will print nothing.
D. It does not compile because of line y1.
E. It does not compile because of line y2.
F. It compiles but throws an exception at runtime.
```

## Questão 06

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

## Questão 07

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

## Questão 08

```text
Which of the following can be inserted without causing a compilation error?

public void remove(List<Character> chars) {
   char end = 'z';
 
   // INSERT LINE HERE
 
   Predicate<Character> predicate =  c -> {
      char start = 'a'; return start <= c && c <= end; };
}

A. char start = ’a’;
B. char c = ’x’;
C. chars = null;
D. end = ’1’;
E. None of the above
```

## Questão 09

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

## Questão 10

```text
Which are true about this code? (Choose all that apply.)

var blocky = """
   squirrel \s
   pigeon   \
   termite""";
System.out.print(blocky);

A. It outputs two lines.
B. It outputs three lines.
C. It outputs four lines.
D. There is one line with trailing whitespace.
E. There are two lines with trailing whitespace.
F. If we indented each line five characters, it would change the output.
```

## Questão 11

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

## Questão 12

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

## Questão 13

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

## Questão 14

```text
Which modifier pairs can be used together in a method declaration? (Choose all that apply.)

A. static and final
B. private and static
C. static and abstract
D. private and abstract
E. abstract and final
F. private and final
```

## Questão 15

```text
The following code appears in a file named Ostrich.java. What is the result of compiling the source file?

1: public class Ostrich {
2:    private int count;
3:    static class OstrichWrangler {
4:       public int stampede() {
5:          return count;
6:       } } }

A. The code compiles successfully, and one bytecode file is generated: Ostrich.class.
B. The code compiles successfully, and two bytecode files are generated: Ostrich.class and OstrichWrangler.class.
C. The code compiles successfully, and two bytecode files are generated: Ostrich.class and Ostrich$OstrichWrangler.class.
D. A compiler error occurs on line 3.
E. A compiler error occurs on line 5.
```

## Questão 16

```text
Given the following method, how many lines contain compilation errors?

8:  enum DayOfWeek {
9:     SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
10:    private DayOfWeek getWeekDay(int day, final int thursday) {
11:       int otherDay = day;
12:       int Sunday = 0;
13:       switch (otherDay) {
14:          default:
15:          case 1: continue;
16:          case thursday: return DayOfWeek.THURSDAY;
17:          case 2,10: break;
18:          case Sunday: return DayOfWeek.SUNDAY;
19:          case DayOfWeek.MONDAY: return DayOfWeek.MONDAY;
20:       }
21:       return DayOfWeek.FRIDAY;
22:    } }

A. None, the code compiles and runs without issue.
B. 1.
C. 2.
D. 3.
E. 4.
F. 5.
G. 6.
H. The code compiles but may produce an error at runtime.
```

## Questão 17

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

## Questão 18

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

## Questão 19

```text
What is the result of executing the following code snippet?

SequencedCollection<Integer> lions = new ArrayList<>(List.of(1, 2, 3));
SequencedCollection<Integer> tigers = new CopyOnWriteArrayList<>(lions);
Set<Integer> bears = new ConcurrentSkipListSet<>();
bears.addAll(lions);
for (Integer item: tigers) tigers.add(4); // x1
for (Integer item: bears) bears.add(5);   // x2
System.out.println(lions.size() + " " + tigers.size()
   + " " + bears.size());

A. It outputs 3 6 4.
B. It outputs 6 6 6.
C. It outputs 6 3 4.
D. The code does not compile.
E. It compiles but throws an exception at runtime on line x1.
F. It compiles but throws an exception at runtime on line x2.
G. It compiles but enters an infinite loop at runtime.
```

## Questão 20

```text
Which of the following code snippets about var compile without issue when used in a method? (Choose all that apply.)

A. var spring = null;
B. var fall = "leaves";
C. var evening = 2; evening = null;
D. var night = Integer.valueOf(3);
E. var day = 1/0;
F. var winter = 12, cold;
G. var fall = 2, autumn = 2;
H. var morning = ""; morning = null;
```

## Questão 21

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

## Questão 22

```text
Which of the following correctly create Path instances? (Choose all that apply.)

A. new Path("jaguar.txt")
B. Path.get("cats","lynx.txt")
C. new java.io.File("tiger.txt").toPath()
D. Paths.get("ocelot.txt")
E. Path.of(".")
```

## Questão 23

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

## Questão 24

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

## Questão 25

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

## Questão 26

```text
Which lambda expression, when entered into the blank line in the following code, causes the program to print hahaha? (Choose all that apply.)

import java.util.function.Predicate;
public class Hyena {
   private int age = 1;
   public static void main(String[] args) {
      var p = new Hyena();
      double height = 10;
      int age = 1;
      testLaugh(p,  ________________);
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

## Questão 27

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
20:      } }

A. One line contains a compiler error.
B. Two lines contain compiler errors.
C. Three lines contain compiler errors.
D. The code compiles but throws a ClassCastException at runtime.
E. The program compiles and prints 3.
F. The program compiles and prints 0.
```

## Questão 28

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

## Questão 29

```text
What is the output of the following code snippet?

21: SequencedMap<Integer, String> cats = new TreeMap<>();
22: cats.put(3, "Snowball");
23: cats.put(2, "Sugar");
24: cats.put(1, "Minnie Mouse");
25: cats.pollFirstEntry();
26: var id = cats.lastEntry().getKey();
27: cats.pollFirstEntry();
28: System.out.print(cats.firstEntry().getValue());

A. Minnie Mouse
B. Snowball
C. Sugar
D. The code does not compile.
E. The code compiles, but an exception is thrown at runtime.
```

## Questão 30

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

## Questão 31

```text
The _________ operator increases a value and returns the original value, while the _______ operator decreases a value and returns the new value.

A. post-increment, post-increment
B. pre-decrement, post-decrement
C. post-increment, post-decrement
D. post-increment, pre-decrement
E. pre-increment, pre-decrement
F. pre-increment, post-decrement
```

## Questão 32

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

## Questão 33

```text
Which of the following modules are provided by the JDK? (Choose all that apply.)

A. java.base
B. java.desktop
C. java.logging
D. java.util
E. jdk.base
F. jdk.compiler
G. jdk.xerces
```

## Questão 34

```text
What is the output of the following program?

public sealed class ArmoredAnimal permits Armadillo {
   public ArmoredAnimal(int size) {}
   @Override public String toString() { return "Strong"; }
   public static void main(String[] a) {
      var c = new Armadillo(10, null);
      System.out.println(c);
   }
}
class Armadillo extends ArmoredAnimal {
   @Override public String toString() { return "Cute"; }
   public Armadillo(int size, String name) {
      super(size);
   }   
}

A. Strong
B. Cute
C. The program does not compile.
D. The code compiles but produces an exception at runtime.
E. None of the above.
```

## Questão 35

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

## Questão 36

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

## Questão 37

```text
Which of the following are true statements about exception handling in Java? (Choose all that apply.)

A. A traditional try statement without a catch block requires a finally block.
B. A traditional try statement without a finally block requires a catch block.
C. A traditional try statement with only one statement can omit the {}.
D. A try-with-resources statement without a catch block requires a finally block.
E. A try-with-resources statement without a finally block requires a catch block.
F. A try-with-resources statement with only one statement can omit the {}.
```

## Questão 38

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

## Questão 39

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

## Questão 40

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

## Questão 41

```text
What is the output of the following code snippet?

boolean sunny = true, raining = false, sunday = true;
boolean goingToTheStore = sunny & raining ^ sunday;
boolean goingToTheZoo = sunday && !raining;
boolean stayingHome = !(goingToTheStore && goingToTheZoo);
System.out.println(goingToTheStore + "-" + goingToTheZoo
   + "-" +stayingHome);

A.true-false-false
B.false-true-false
C.true-true-true
D.false-true-true
E.false-false-false
F.true-true-false
G. None of the above
```

## Questão 42

```text
What is the output of calling printLocation(Animal.MAMMAL)?

10: class Zoo {
11:    enum Animal {BIRD, FISH, MAMMAL}
12:    void printLocation(Animal a) {
13:       long type = switch (a) {
14:          case BIRD -> 1;
15:          case FISH -> 2;
16:          case MAMMAL -> 3;
17:          default -> 4;
18:       };
19:       System.out.print(type);
20:    } }

A. 3
B. 4
C. 34
D. The code does not compile because of line 13.
E. The code does not compile because of line 17.
F. None of the above.
```

## Questão 43

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

## Questão 44

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

## Questão 45

```text
Which lambda can replace the new Sloth() call in the main() method and produce the same output at runtime?

import java.util.List;
interface Yawn {
   String yawn(double d, List<Integer> time);
}
class Sloth implements Yawn {
   public String yawn(double zzz, List<Integer> time) {
      return "Sleep: " + zzz;
   } }
public class Vet {
   public static String takeNap(Yawn y) {
      return y.yawn(10, null);
   }
   public static void main(String… unused) {
      System.out.print(takeNap(new Sloth()));
   } }

A. (z,f) -> { String x = ""; return "Sleep: " + x }
B. (t,s) -> { String t = ""; return "Sleep: " + t; }
C. (w,q) -> {"Sleep: " + w}
D. (e,u) -> { String g = ""; "Sleep: " + e }
E. (a,b) -> "Sleep: " + (double)(b==null ? a : a)
F. (r,k) -> { String g = ""; return "Sleep:"; }
G. None of the above, as the program does not compile
```

## Questão 46

```text
Suppose you are creating a service provider that contains the following class. Which line of code needs to be in your module-info.java?

package dragon;
import magic.*;
public class Dragon implements Magic {
   public String getPower() {
     return "breathe fire";
   }
}

A. provides dragon.Dragon by magic.Magic;
B. provides dragon.Dragon using magic.Magic;
C. provides dragon.Dragon with magic.Magic;
D. provides magic.Magic by dragon.Dragon;
E. provides magic.Magic using dragon.Dragon;
F. provides magic.Magic with dragon.Dragon;
```

## Questão 47

```text
What is printed by the following program?

1:  public class DriveBus {
2:     public void go() {
3:        System.out.print("A");
4:        try {
5:           stop();
6:        } catch (ArithmeticException e) {
7:           System.out.print("B");
8:        } finally {
9:           System.out.print("C");
10:       }
11:       System.out.print("D");
12:    }
13:    public void stop() {
14:       System.out.print("E");
15:       Object x = null;
16:       x.toString();
17:       System.out.print("F");
18:    }
19:    public static void main(String n[]) {
20:       new DriveBus().go();
21:    } }

A. AE
B. AEBCD
C. AEC
D. AECD
E. AE followed by a stack trace
F. AEBCD followed by a stack trace
G. AEC followed by a stack trace
H. A stack trace with no other output
```

## Questão 48

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

## Questão 49

```text
Which of these statements compile? (Choose all that apply.)

A. HashSet<Number> hs = new HashSet<Integer>();
B. HashSet<? super ClassCastException> set = new HashSet<Exception>();
C. List<> list = new ArrayList<String>();
D. List<Object> values = new HashSet<Object>();
E. List<Object> objects = new ArrayList<? extends Object>();
F. Map<String, ? extends Number> hm = new HashMap<String, Integer>();
```

## Questão 50

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

---

## Folha de respostas

Preencha **Resposta**; depois confira no livro (Apêndice *Answers to Review Questions*) e registre os erros em `docs/ocp-study/error-log.md`.

| # | Tópico | Fonte | Resposta | Gabarito | ✔/✘ |
|--:|---|---|---|---|:-:|
| 01 | T1 | `15-core-apis/QCAP04_13` | | | |
| 02 | T6 | `07-streams/QCAP10_07` | | | |
| 03 | T7 | `11-modules/QCAP12_05` | | | |
| 04 | T7 | `11-modules/QCAP12_19` | | | |
| 05 | T9 | `09-io-api/QCAP14_21` | | | |
| 06 | T1 | `15-core-apis/QCAP04_22` | | | |
| 07 | T10 | `04-exceptions-localization/QCAP11_16` | | | |
| 08 | T6 | `06-lambdas-functional-interfaces/QCAP08_16` | | | |
| 09 | T3 | `01-class-design/QCAP06_21` | | | |
| 10 | T1 | `01-building-blocks/QCAP01_16` | | | |
| 11 | T5 | `05-collections-generics/QCAP09_19` | | | |
| 12 | T3 | `03-methods/QCAP05_17` | | | |
| 13 | T6 | `06-lambdas-functional-interfaces/QCAP08_10` | | | |
| 14 | T3 | `01-class-design/QCAP06_02` | | | |
| 15 | T3 | `01-beyond-classes/QCAP07_16` | | | |
| 16 | T2 | `02-making-decisions/QCAP03_10` | | | |
| 17 | T5 | `05-collections-generics/QCAP09_17` | | | |
| 18 | T3 | `03-methods/QCAP05_21` | | | |
| 19 | T8 | `13-concurrency/QCAP13_10` | | | |
| 20 | T3 | `01-building-blocks/QCAP01_08` | | | |
| 21 | T3 | `01-class-design/QCAP06_12` | | | |
| 22 | T9 | `09-io-api/QCAP14_10` | | | |
| 23 | T6 | `07-streams/QCAP10_21` | | | |
| 24 | T9 | `09-io-api/QCAP14_25` | | | |
| 25 | T8 | `13-concurrency/QCAP13_14` | | | |
| 26 | T6 | `06-lambdas-functional-interfaces/QCAP08_15` | | | |
| 27 | T3 | `01-class-design/QCAP06_20` | | | |
| 28 | T2 | `02-making-decisions/QCAP03_25` | | | |
| 29 | T5 | `05-collections-generics/QCAP09_22` | | | |
| 30 | T2 | `02-making-decisions/QCAP03_24` | | | |
| 31 | T1 | `14-operators/QCAP02_12` | | | |
| 32 | T3 | `03-methods/QCAP05_14` | | | |
| 33 | T7 | `11-modules/QCAP12_12` | | | |
| 34 | T3 | `01-beyond-classes/QCAP07_04` | | | |
| 35 | T1 | `14-operators/QCAP02_03` | | | |
| 36 | T5 | `05-collections-generics/QCAP09_11` | | | |
| 37 | T4 | `04-exceptions-localization/QCAP11_13` | | | |
| 38 | T4 | `04-exceptions-localization/QCAP11_26` | | | |
| 39 | T8 | `13-concurrency/QCAP13_18` | | | |
| 40 | T3 | `03-methods/QCAP05_16` | | | |
| 41 | T1 | `14-operators/QCAP02_13` | | | |
| 42 | T2 | `02-making-decisions/QCAP03_11` | | | |
| 43 | T6 | `06-lambdas-functional-interfaces/QCAP08_14` | | | |
| 44 | T4 | `04-exceptions-localization/QCAP11_11` | | | |
| 45 | T6 | `06-lambdas-functional-interfaces/QCAP08_20` | | | |
| 46 | T7 | `11-modules/QCAP12_09` | | | |
| 47 | T4 | `04-exceptions-localization/QCAP11_20` | | | |
| 48 | T8 | `13-concurrency/QCAP13_04` | | | |
| 49 | T5 | `05-collections-generics/QCAP09_04` | | | |
| 50 | T10 | `04-exceptions-localization/QCAP11_19` | | | |

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
