# Simulado 16 — 1Z0-831 Java SE 25 Developer Professional

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
Which statements about the following code snippet are correct? (Choose all that apply.)

for (var penguin : new int[2])
   System.out.println(penguin);
 
var ostrich = new Character[3];
for (var emu : ostrich)
   System.out.println(emu);
 
List<Integer> parrots = new ArrayList<Integer>();
for (var macaw  : parrots)
   System.out.println(macaw);

A. The data type of penguin is Integer.
B. The data type of penguin is int.
C. The data type of emu is undefined.
D. The data type of emu is Character.
E. The data type of macaw is List.
F. The data type of macaw is Integer.
H. None of the above, as the code does not compile.
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

## Questão 04

```text
What is the result of the following code?

7: var sb = new StringBuilder();
8: sb.append("aaa").insert(1, "bb").insert(4, "ccc");
9: System.out.println(sb);

A. abbaaccc
B. abbaccca
C. bbaaaccc
D. bbaaccca
E. An empty line.
F. The code does not compile.
```

## Questão 05

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

## Questão 06

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

## Questão 07

```text
Which classes will allow the following to compile? (Choose all that apply.)

var is = new BufferedInputStream(new FileInputStream("z.txt"));
InputStream wrapper = new ____________________________________________ (is);
try (wrapper) {}

A. BufferedInputStream
B. BufferedReader
C. BufferedWriter
D. FileInputStream
E. ObjectInputStream
F. ObjectOutputStream
G. None of the above, as the first line does not compile
```

## Questão 08

```text
What is the result of running the following class?

1:  import java.util.function.*;
2:
3:  public class Panda {
4:     int age;
5:     public static void main(String[] args) {
6:        Panda p1 = new Panda();
7:        p1.age = 1;
8:        check(p1, p -> {p.age < 5});
9:     }
10:    private static void check(Panda panda,
11:       Predicate<Panda> pred) {
12:       String result = pred.test(panda)
13:          ? "match" : "not match";
14:       System.out.print(result);
15: } }

A. match
B. not match
C. Compiler error on line 8.
D. Compiler error on line 10.
E. Compiler error on line 12.
F. A runtime exception is thrown.
```

## Questão 09

```text
Which of the following statements are true? (Choose all that apply.)

A. Modules with cyclic dependencies will not compile.
B. Packages with a cyclic dependency will not compile.
C. A cyclic dependency always involves exactly two modules.
D. A cyclic dependency always involves at least two requires statements.
E. An unnamed module can be involved in a cyclic dependency with an automatic module.
```

## Questão 10

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

## Questão 11

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

## Questão 12

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

## Questão 13

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

## Questão 14

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

## Questão 15

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

## Questão 16

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

## Questão 17

```text
The _________ operator increases a value and returns the original value, while the _______ operator decreases a value and returns the new value.

A. post-increment, post-increment
B. pre-decrement, post-decrement
C. post-increment, post-decrement
D. post-increment, pre-decrement
E. pre-increment, pre-decrement
F. pre-increment, post-decrement
```

## Questão 18

```text
Which of the following fills in the blank, allowing the code to compile and run without issue?

11: SequencedCollection<String> animals = new _____________<>();
12: animals.addFirst("lions");
13: animals.addLast("tigers");
14: for(var a : animals)
15:    System.out.println(a);
16: System.out.println(animals.get(0));

A. HashSet
B. LinkedList
C. TreeSetMap
D. HashMap
E. None of the above
```

## Questão 19

```text
Two commands create artifacts that include smaller versions of the JDK. Which are used to create an .exe file and a directory, respectively?

A. jimage and jlink
B. jimage and jpackage
C. jlink and jimage
D. jlink and jpackage
E. jpackage and jimage
F. jpackage and jlink
```

## Questão 20

```text
What does the following program print?

1:  public class Zebra {
2:     private int x = 24;
3:     public int hunt() {
4:        String message = "x is ";
5:        abstract class Stripes {
6:           private int x = 0;
7:           public void print() {
8:              System.out.print(message + Zebra.this.x);
9:           }
10:       }
11:       var s = new Stripes() {};
12:       s.print();
13:       return x;
14:    }
15:    public static void main(String[] args) {
16:       new Zebra().hunt();
17:    } }

A. x is 0
B. x is 24
C. Line 6 generates a compiler error.
D. Line 8 generates a compiler error.
E. Line 11 generates a compiler error.
F. None of the above.
```

## Questão 21

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

## Questão 22

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

## Questão 23

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

## Questão 24

```text
Which of these statements compile? (Choose all that apply.)

A. HashSet<Number> hs = new HashSet<Integer>();
B. HashSet<? super ClassCastException> set = new HashSet<Exception>();
C. List<> list = new ArrayList<String>();
D. List<Object> values = new HashSet<Object>();
E. List<Object> objects = new ArrayList<? extends Object>();
F. Map<String, ? extends Number> hm = new HashMap<String, Integer>();
```

## Questão 25

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

## Questão 26

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

## Questão 27

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

## Questão 28

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

## Questão 29

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

## Questão 30

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

## Questão 31

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

## Questão 32

```text
How many variables in the following method are effectively final?

10: public void feed() {
11:    int monkey = 0;
12:    if(monkey> 0) {
13:       var giraffe = monkey++;
14:       String name;
15:       name = "geoffrey";
16:    }
17:    String name = "milly";
18:    var food = 10;
19:    while(monkey <= 10) {
20:       food = 0;
21:    }
22:    name = null;
23: }

A. 1.
B. 2.
C. 3.
D. 4.
E. 5.
F. None of the above. The code does not compile.
```

## Questão 33

```text
What is the result of executing the following application? (Choose all that apply.)

import java.util.concurrent.*;
import java.util.stream.*;
public class PrintConstants {
   public static void main(String[] args) {
      var s = Executors.newVirtualThreadPerTaskExecutor();
      DoubleStream.of(3.14159, 2.71828)   // b1
         .forEach(c -> s.submit(          // b2
            () -> System.out.println(10 * c))); // b3
      s.execute(() -> System.out.println("Printed"));
   } }

A. It compiles and outputs the two numbers followed by Printed.
B. The code will not compile because of line b1.
C. The code will not compile because of line b2.
D. The code will not compile because of line b3.
E. It compiles, but the output cannot be determined ahead of time.
F. It compiles but throws an exception at runtime.
G. It compiles but waits forever at runtime.
```

## Questão 34

```text
Which of the following are true statements about exception handling in Java? (Choose all that apply.)

A. A traditional try statement without a catch block requires a finally block.
B. A traditional try statement without a finally block requires a catch block.
C. A traditional try statement with only one statement can omit the {}.
D. A try-with-resources statement without a catch block requires a finally block.
E. A try-with-resources statement without a finally block requires a catch block.
F. A try-with-resources statement with only one statement can omit the {}.
```

## Questão 35

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

## Questão 36

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

## Questão 37

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

## Questão 38

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

## Questão 39

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

## Questão 40

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

## Questão 41

```text
Which of the following, when inserted independently in the blank, use locale parameters that are properly formatted? (Choose all that apply.)

import java.util.Locale;
public class ReadMap implements AutoCloseable {
   private Locale locale;
   private boolean closed = false;
   @Override public void close() {
      System.out.println("Folding map");
      locale = null;
      closed = true;
   }
   public void open() {
      this.locale = ____________;
   }
   public void use() {
      // Implementation omitted
   }
}

A. Locale.of("xM")
B. Locale.of("MQ", "ks")
C. Locale.of("qw")
D. Locale.of("wp", "VW")
E. Locale.create("zp")
F. new Locale.Builder().setLanguage("yw").setRegion("PM")
G. The code does not compile regardless of what is placed in the blank.
```

## Questão 42

```text
Which statement about the following program is correct?

1:  interface HasExoskeleton {
2:     double size = 2.0f;
3:     abstract int getNumberOfSections();
4:  }
5:  abstract class Insect implements HasExoskeleton {
6:     abstract int getNumberOfLegs();
7:  }
8:  public class Beetle extends Insect {
9:     int getNumberOfLegs() { return 6; }
10:    int getNumberOfSections(int count) { return 1; }
11: }

A. It compiles without issue.
B. The code will produce a ClassCastException if called at runtime.
C. The code will not compile because of line 2.
D. The code will not compile because of line 5.
E. The code will not compile because of line 8.
F. The code will not compile because of line 10.
```

## Questão 43

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

## Questão 44

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

## Questão 45

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

## Questão 46

```text
Assuming this class is accessed by only a single thread at a time, what is the result of calling the countIceCreamFlavors() method?

import java.util.stream.LongStream;
public class Flavors {
   private static int counter;
   public static void countIceCreamFlavors()  {
      counter = 0;
      Runnable task = () -> counter++;
      LongStream.range(0, 500)
         .forEach(m -> Thread.ofPlatform()
           .priority(1)
           .unstarted(task)
           .run());
      System.out.println(counter);
   } }

A. The method consistently prints a number less than 500.
B. The method consistently prints 500.
C. The method compiles and prints a value, but that value cannot be determined ahead of time.
D. The method does not compile.
E. The method compiles but throws an exception at runtime.
F. None of the above.
```

## Questão 47

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

## Questão 48

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

## Questão 49

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

## Questão 50

```text
What is the output of executing the Chimp program?

// Rope.java
1: package rope;
2: public class Rope {
3:    public static int LENGTH = 5;
4:    static {
5:       LENGTH = 10;
6:    }
7:    public static void swing() {
8:       System.out.print("swing ");
9:    } }
 
// Chimp.java
1: import rope.*;
2: import static rope.Rope.*;
3: public class Chimp {
4:    public static void main(String[] args) {
5:       Rope.swing();
6:       new Rope().swing();
7:       System.out.println(LENGTH);
8:    } }

A. swing swing 5
B. swing swing 10
C. Compiler error on line 2 of Chimp
D. Compiler error on line 5 of Chimp
E. Compiler error on line 6 of Chimp
F. Compiler error on line 7 of Chimp
```

---

## Folha de respostas

Preencha **Resposta**; depois confira no livro (Apêndice *Answers to Review Questions*) e registre os erros em `docs/ocp-study/error-log.md`.

| # | Tópico | Fonte | Resposta | Gabarito | ✔/✘ |
|--:|---|---|---|---|:-:|
| 01 | T2 | `02-making-decisions/QCAP03_15` | | | |
| 02 | T6 | `07-streams/QCAP10_07` | | | |
| 03 | T6 | `06-lambdas-functional-interfaces/QCAP08_07` | | | |
| 04 | T1 | `15-core-apis/QCAP04_05` | | | |
| 05 | T9 | `09-io-api/QCAP14_01` | | | |
| 06 | T3 | `01-building-blocks/QCAP01_23` | | | |
| 07 | T9 | `09-io-api/QCAP14_11` | | | |
| 08 | T6 | `06-lambdas-functional-interfaces/QCAP08_17` | | | |
| 09 | T7 | `11-modules/QCAP12_08` | | | |
| 10 | T4 | `04-exceptions-localization/QCAP11_14` | | | |
| 11 | T10 | `04-exceptions-localization/QCAP11_19` | | | |
| 12 | T5 | `05-collections-generics/QCAP09_07` | | | |
| 13 | T7 | `01-building-blocks/QCAP01_13` | | | |
| 14 | T6 | `06-lambdas-functional-interfaces/QCAP08_16` | | | |
| 15 | T3 | `01-beyond-classes/QCAP07_18` | | | |
| 16 | T3 | `01-beyond-classes/QCAP07_23` | | | |
| 17 | T1 | `14-operators/QCAP02_12` | | | |
| 18 | T5 | `05-collections-generics/QCAP09_08` | | | |
| 19 | T7 | `11-modules/QCAP12_18` | | | |
| 20 | T3 | `01-beyond-classes/QCAP07_25` | | | |
| 21 | T2 | `02-making-decisions/QCAP03_20` | | | |
| 22 | T7 | `11-modules/QCAP12_19` | | | |
| 23 | T8 | `13-concurrency/QCAP13_02` | | | |
| 24 | T5 | `05-collections-generics/QCAP09_04` | | | |
| 25 | T1 | `15-core-apis/QCAP04_01` | | | |
| 26 | T3 | `01-beyond-classes/QCAP07_02` | | | |
| 27 | T3 | `01-beyond-classes/QCAP07_15` | | | |
| 28 | T6 | `06-lambdas-functional-interfaces/QCAP08_14` | | | |
| 29 | T6 | `07-streams/QCAP10_11` | | | |
| 30 | T3 | `01-beyond-classes/QCAP07_12` | | | |
| 31 | T2 | `02-making-decisions/QCAP03_25` | | | |
| 32 | T3 | `03-methods/QCAP05_12` | | | |
| 33 | T8 | `13-concurrency/QCAP13_19` | | | |
| 34 | T4 | `04-exceptions-localization/QCAP11_13` | | | |
| 35 | T5 | `05-collections-generics/QCAP09_22` | | | |
| 36 | T1 | `15-core-apis/QCAP04_03` | | | |
| 37 | T1 | `14-operators/QCAP02_04` | | | |
| 38 | T8 | `13-concurrency/QCAP13_24` | | | |
| 39 | T4 | `04-exceptions-localization/QCAP11_02` | | | |
| 40 | T4 | `04-exceptions-localization/QCAP11_11` | | | |
| 41 | T10 | `04-exceptions-localization/QCAP11_15` | | | |
| 42 | T3 | `01-beyond-classes/QCAP07_05` | | | |
| 43 | T3 | `01-class-design/QCAP06_06` | | | |
| 44 | T6 | `06-lambdas-functional-interfaces/QCAP08_11` | | | |
| 45 | T5 | `05-collections-generics/QCAP09_17` | | | |
| 46 | T8 | `13-concurrency/QCAP13_08` | | | |
| 47 | T1 | `15-core-apis/QCAP04_21` | | | |
| 48 | T9 | `09-io-api/QCAP14_05` | | | |
| 49 | T2 | `02-making-decisions/QCAP03_07` | | | |
| 50 | T3 | `03-methods/QCAP05_10` | | | |

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
