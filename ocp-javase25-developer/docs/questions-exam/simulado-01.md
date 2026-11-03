# Simulado 01 — 1Z0-831 Java SE 25 Developer Professional

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

## Questão 02

```text
Given the following two class files, what is the maximum number of imports that can be removed and have the code still compile?

// Water.java
package aquarium;
public class Water { }
 
// Tank.java
package aquarium;
import java.lang.*;
import java.lang.System;
import aquarium.Water;
import aquarium.*;
public class Tank {
   public void print(Water water) {
      System.out.println(water); } }

A. 0
B. 1
C. 2
D. 3
E. 4
F. Does not compile
```

## Questão 03

```text
Which class would be best to use to read a binary file into a Java object?

A. BufferedStream
B. FileReader
C. ObjectInputStream
D. ObjectReader
E. ObjectOutputStream
F. ObjectWriter
G. None of the above
```

## Questão 04

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

## Questão 05

```text
Which statements about sealed classes are correct? (Choose all that apply.)

A. A sealed interface restricts which subinterfaces may extend it.
B. A sealed class cannot be indirectly extended by a class that is not listed in its permits clause.
C. A sealed class can be extended by an abstract class.
D. A sealed class can be extended by a subclass that uses the nonsealed modifier.
E. A sealed interface restricts which subclasses may implement it.
F. A sealed class cannot contain any nested subclasses.
G. None of the above.
```

## Questão 06

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
Which change allows the following program to compile?

1: public class AhChoo {
2:    static class SneezeException extends Exception {}
3:    static class SniffleException extends SneezeException {}
4:    public static void main(String[] args) {
5:       try {
6:          throw new SneezeException();
7:       } catch (SneezeException | SniffleException e) {
8:       } finally {}
9:    } }

A. Add throws SneezeException to the declaration on line 4.
B. Add throws Throwable to the declaration on line 4.
C. Change line 7 to } catch (SneezeException e) {.
D. Change line 7 to } catch (SniffleException e) {.
E. Remove line 7.
F. The code compiles correctly as is.
G. None of the above.
```

## Questão 09

```text
What is the output of the following code snippet?

4: int pig = (short)4;
5: pig = pig++;
6: long goat = (int)2;
7: goat -= 1.0;
8: System.out.print(pig + " - " + goat);

A. 4 - 1
B. 4 - 2
C. 5 - 1
D. 5 - 2
E. The code does not compile due to line 7.
F. None of the above.
```

## Questão 10

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

## Questão 11

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

## Questão 12

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

## Questão 13

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

## Questão 14

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

## Questão 15

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

## Questão 16

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

## Questão 17

```text
What is the output of the following code snippet?

3: boolean canine = true, wolf = true;
4: int teeth = 20;
5: canine = (teeth != 10) ^ (wolf=false);
6: System.out.println(canine+", "+teeth+", "+wolf);

A. true, 20, true
B. true, 20, false
C. false, 10, true
D. false, 20, false
E. The code will not compile because of line 5.
F. None of the above.
```

## Questão 18

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

## Questão 19

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

## Questão 20

```text
Which statements about the final modifier are correct? (Choose all that apply.)

A. Instance and static variables can be marked final.
B. A variable is effectively final only if it is marked final.
C. An object that is marked final cannot be modified.
D. Local variables cannot be declared with type var and the final modifier.
E. A primitive that is marked final cannot be modified.
```

## Questão 21

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

## Questão 22

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

## Questão 23

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

## Questão 26

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

## Questão 27

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

## Questão 28

```text
Which of the following lambda expressions can be passed to a function of Predicate<String> type? (Choose all that apply.)

A. s -> s.isEmpty()
B. s --> s.isEmpty()
C. (String s) -> s.isEmpty()
D. (String s) --> s.isEmpty()
E. (StringBuilder s) -> s.isEmpty()
F. (StringBuilder s) --> s.isEmpty()
```

## Questão 29

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

## Questão 30

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

## Questão 31

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

## Questão 32

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

## Questão 33

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

## Questão 34

```text
Which code can be inserted to have the code print 2?

public class BirdSeed {
      private int numberBags;
      boolean call;
  
      public BirdSeed() {
            // LINE 1
            call = false;
            // LINE 2
      }
  
      public BirdSeed(int numberBags) {
            this.numberBags = numberBags;
      }
  
      public static void main(String[] args) {
            var seed = new BirdSeed();
            System.out.print(seed.numberBags);
      } }

A. Replace line 1 with BirdSeed(2);
B. Replace line 2 with BirdSeed(2);
C. Replace line 1 with new BirdSeed(2);
D. Replace line 2 with new BirdSeed(2);
E. Replace line 1 with this(2);
F. Replace line 2 with this(2);
G. The code prints 2 without any changes.
```

## Questão 35

```text
Which of the following sets result to 8.0? (Choose all that apply.)

A. double result = LongStream.of(6L, 8L, 10L)
   .mapToInt(x -> (int) x)
   .collect(Collectors.groupingBy(x -> x))
   .keySet()
   .stream()
   .collect(Collectors.averagingInt(x -> x));

B. double result = LongStream.of(6L, 8L, 10L)
   .mapToInt(x -> x)
   .boxed()
   .collect(Collectors.groupingBy(x -> x))
   .keySet()
   .stream()
   .collect(Collectors.averagingInt(x -> x));

C. double result = LongStream.of(6L, 8L, 10L)
   .mapToInt(x -> (int) x)
   .boxed()
   .collect(Collectors.groupingBy(x -> x))
   .keySet()
    .stream()
   .collect(Collectors.averagingInt(x -> x));

D. double result = LongStream.of(6L, 8L, 10L)
   .mapToInt(x -> (int) x)
   .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
   .keySet()
   .stream()
   .collect(Collectors.averagingInt(x -> x));

E. double result = LongStream.of(6L, 8L, 10L)
   .mapToInt(x -> x)
   .boxed()
   .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
   .keySet()
   .stream()
   .collect(Collectors.averagingInt(x -> x));

F. double result = LongStream.of(6L, 8L, 10L)
   .mapToInt(x -> (int) x)
   .boxed()
   .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
   .keySet()
   .stream()
   .collect(Collectors.averagingInt(x -> x));
```

## Questão 36

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

## Questão 37

```text
Which of these array declarations are not legal? (Choose all that apply.)

A. int[][] scores = new int[5][];
B. Object[][][] cubbies = new Object[3][0][5];
C. String beans[] = new beans[6];
D. java.util.Date[] dates[] = new java.util.Date[2][];
E. int[][] types = new int[];
F. int[][] java = new int[][];
```

## Questão 38

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

## Questão 39

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

## Questão 40

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

## Questão 41

```text
What is the result of the following code?

1: public class PrintIntegers {
2:    public static void main(String[] args) {
3:       int y = -2;
4:       do System.out.print(++y + " ");
5:       while (y <= 5);
6: } }

A. -2 -1 0 1 2 3 4 5
B. -2 -1 0 1 2 3 4
C. -1 0 1 2 3 4 5 6
D. -1 0 1 2 3 4 5
E. The code will not compile because of line 5.
F. The code contains an infinite loop and does not terminate.
```

## Questão 42

```text
Assuming zoo-data.txt exists and is not empty, what statements about the following method are correct? (Choose all that apply.)

private void echo() throws IOException {
   var o = new FileWriter("new-zoo.txt");
   try (var f = new FileReader("zoo-data.txt");
      var b = new BufferedReader(f); o) {
   
      o.write(b.readLine());
   }
   o.write("");
}

A. When run, the method creates a new file with one line of text in it.
B. When run, the method creates a new file with two lines of text in it.
C. When run, the method creates a new file with the same number of lines as the original file.
D. The method compiles but will produce an exception at runtime.
E. The method does not compile.
F. The method uses byte stream classes.
```

## Questão 43

```text
What is output by the following code?

1: public class Fish {
2:    public static void main(String[] args) {
3:       int numFish = 4;
4:       String fishType = "tuna";
5:       String anotherFish = numFish + 1;
6:       System.out.println(anotherFish + " " + fishType);
7:       System.out.println(numFish + " " + 1);
8: } }

A. 4 1
B. 5
C. 5 tuna
D. 5tuna
E. 51tuna
F. The code does not compile.
```

## Questão 44

```text
Which of the following data types can be used in a switch expression? (Choose all that apply.)

A. enum
B. int
C. Byte
D. long
E. boolean
F. double
```

## Questão 45

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

## Questão 46

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

## Questão 47

```text
Which of the following statements about the Callable call() and Runnable run() methods are correct? (Choose all that apply.)

A. Both methods return void.
B. Both can throw unchecked exceptions.
C. Both can be implemented with lambda expressions.
D. Runnable returns a generic type.
E. Both can throw checked exceptions.
F. Callable returns a generic type.
```

## Questão 48

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

## Questão 49

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

## Questão 50

```text
What is printed by the following program?

public class Deer {
   enum Food {APPLES, BERRIES, GRASS}
   protected class Diet {
      private Food getFavorite() {
         return Food.BERRIES;
      }
   }
   public static void main(String[] seasons) {
      System.out.print(switch(new Diet().getFavorite()) {
         case APPLES -> "a";
         case BERRIES -> "b";
         default -> "c";
      });
   } }

A. a
B. b
C. c
D. The code declaration of the Diet class does not compile.
E. The main() method does not compile.
F. The code compiles but produces an exception at runtime.
G. None of the above.
```

---

## Folha de respostas

Preencha **Resposta**; depois confira no livro (Apêndice *Answers to Review Questions*) e registre os erros em `docs/ocp-study/error-log.md`.

| # | Tópico | Fonte | Resposta      | Gabarito    | ✔/✘ |
|--:|---|---|---------------|-------------|:---:|
| 01 | T10 | `04-exceptions-localization/QCAP11_19` | `D`           | `D`         |  ✔  |
| 02 | T7 | `01-building-blocks/QCAP01_11` | `E`           | `E`         |  ✔  |
| 03 | T9 | `09-io-api/QCAP14_01` | `E`           | `C`         |  ✘  |
| 04 | T3 | `03-methods/QCAP05_07` | `D`, `E`      | `D`, `F`    |  ✘  |
| 05 | T3 | `01-beyond-classes/QCAP07_14` | `A, B, C,D,E` | `A, C, E`   |  ✘  |
| 06 | T3 | `01-beyond-classes/QCAP07_19` | `F`           | `F`         |  ✔  |
| 07 | T6 | `07-streams/QCAP10_20` | `C,D,E`       | `C, E, F`   |  ✘  |
| 08 | T4 | `04-exceptions-localization/QCAP11_21` | `C`           | `C`         |  ✔  |
| 09 | T1 | `14-operators/QCAP02_08` | `E`           | `A`         |  ✘  |
| 10 | T2 | `02-making-decisions/QCAP03_08` | `C`           | `G`         |  ✘  |
| 11 | T7 | `11-modules/QCAP12_23` | `A`           | `E`         |  ✘  |
| 12 | T8 | `13-concurrency/QCAP13_23` | `F`           | `F`         |  ✔  |
| 13 | T7 | `11-modules/QCAP12_07` | `A, B, E`     | `A, B, E`   |  ✔  |
| 14 | T6 | `07-streams/QCAP10_01` | `E`           | `D`         |  ✘  |
| 15 | T3 | `01-building-blocks/QCAP01_08` | `A, B, D, H`  | `B, D, E, H` |  ✘  |
| 16 | T5 | `05-collections-generics/QCAP09_14` | `E`           | `A`         |  ✘  |
| 17 | T1 | `14-operators/QCAP02_04` | `E`           | `B`         |  ✘  |
| 18 | T7 | `11-modules/QCAP12_10` | `A, C, E`     | `C, D`¹     |  ✘  |
| 19 | T6 | `06-lambdas-functional-interfaces/QCAP08_20` | `E`           | `E`         |  ✔  |
| 20 | T3 | `03-methods/QCAP05_01` | `A, B`        | `A, E`      |  ✘  |
| 21 | T5 | `05-collections-generics/QCAP09_10` | `A, B, D`     | `A, B, D`   |  ✔  |
| 22 | T4 | `04-exceptions-localization/QCAP11_14` | `C`           | `C`         |  ✔  |
| 23 | T1 | `01-building-blocks/QCAP01_19` | `D, F`        | `A, D`      |  ✘  |
| 24 | T5 | `05-collections-generics/QCAP09_09` | `A`           | `A`         |  ✔  |
| 25 | T3 | `01-building-blocks/QCAP01_05` | `A, C, F.`    | `A, D, F`   |  ✘  |
| 26 | T2 | `02-making-decisions/QCAP03_13` | `F`           | `F`         |  ✔  |
| 27 | T10 | `04-exceptions-localization/QCAP11_22` | `F`           | `B`         |  ✘  |
| 28 | T6 | `06-lambdas-functional-interfaces/QCAP08_06` | `A, C, E`     | `A, C`      |  ✘  |
| 29 | T8 | `13-concurrency/QCAP13_11` | `F`           | `F`         |  ✔  |
| 30 | T6 | `07-streams/QCAP10_14` | `C, E`        | `B, D`      |  ✘  |
| 31 | T6 | `07-streams/QCAP10_16` | `B, C`        | `B, C`      |  ✔  |
| 32 | T4 | `04-exceptions-localization/QCAP11_18` | `B`           | `C`         |  ✘  |
| 33 | T8 | `13-concurrency/QCAP13_18` | `A, C, D`     | `C, E, G`   |  ✘  |
| 34 | T3 | `01-class-design/QCAP06_01` | `E`           | `E`         |  ✔  |
| 35 | T6 | `07-streams/QCAP10_05` | `D`           | `C, F`      |  ✘  |
| 36 | T3 | `01-building-blocks/QCAP01_21` | `F`           | `D`         |  ✘  |
| 37 | T5 | `15-core-apis/QCAP04_02` | `C, D, E`     | `C, E, F`   |  ✘  |
| 38 | T9 | `09-io-api/QCAP14_06` | `F`           | `C`         |  ✘  |
| 39 | T5 | `05-collections-generics/QCAP09_11` | `A, B, C, F`  | `A, B, E, F` |  ✘  |
| 40 | T3 | `01-beyond-classes/QCAP07_29` | `C`           | `F`         |  ✘  |
| 41 | T2 | `02-making-decisions/QCAP03_29` | `E`           | `C`         |  ✘  |
| 42 | T9 | `09-io-api/QCAP14_16` | `A, F`        | `A, D`      |  ✘  |
| 43 | T1 | `15-core-apis/QCAP04_01` | `C`           | `F`         |  ✘  |
| 44 | T2 | `02-making-decisions/QCAP03_02` | `C`           | `A, B, C`       |  ✘  |
| 45 | T3 | `01-building-blocks/QCAP01_18` | `C, F, G`     | `B, C, F`       |  ✘  |
| 46 | T4 | `04-exceptions-localization/QCAP11_23` | `A, E`        | `A, E`       |  ✔  |
| 47 | T8 | `13-concurrency/QCAP13_03` | `B, C, F`     | `B, C, F`       |  ✔  |
| 48 | T1 | `15-core-apis/QCAP04_16` | `B, D`        | `A, G`       |  ✘  |
| 49 | T1 | `01-building-blocks/QCAP01_07` | `A, B`        | `C, E`       |  ✘  |
| 50 | T3 | `01-beyond-classes/QCAP07_18` | `G`           | `E`          |  ✘  |

¹ Gabarito corrigido: o enunciado deslocou as letras (o conteúdo do `module-info.java` virou a alternativa A); o original `B, C` era contraditório.

**Resultado:** 16 / 50 (32%) · Tempo: 116 min · Data: 02/11/2026

> Erros analisados por tópico em [`docs/ocp-study/error-log.md`](../ocp-study/error-log.md).

| Tópico | Acertos |
|---|--------:|
| T1 Data, hora, texto, números e booleanos |   0 / 6 |
| T2 Controle de fluxo |   1 / 4 |
| T3 Princípios de orientação a objetos |  2 / 11 |
| T4 Tratamento de exceções |   3 / 4 |
| T5 Arrays e coleções |   2 / 5 |
| T6 Streams e expressões lambda |   2 / 7 |
| T7 Empacotamento e implantação |   2 / 4 |
| T8 Concorrência (multithreading) |   3 / 4 |
| T9 E/S (java.io e java.nio.file) |   0 / 3 |
| T10 Localização |   1 / 2 |
