# Simulado 05 — 1Z0-831 Java SE 25 Developer Professional

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
Which change allows the following program to compile?

1: public class AhChoo {
2:        static class SneezeException extends Exception {}
3:        static class SniffleException extends SneezeException {}
4:        public static void main(String[] args) {
5:              try {
6:                    throw new SneezeException();
7:              } catch (SneezeException | SniffleException e) {
8:              } finally {}
9:        } }

A. Add throws SneezeException to the declaration on line 4.
B. Add throws Throwable to the declaration on line 4.
C. Change line 7 to } catch (SneezeException e) {.
D. Change line 7 to } catch (SniffleException e) {.
E. Remove line 7.
F. The code compiles correctly as is.
G. None of the above.
```

## Questão 02

```text
Suppose you have separate modules for a service provider interface, service provider, service locator, and consumer. Which module(s) need to specify a requires directive on the service provider?

A. Service locator
B. Service provider interface
C. Consumer
D. Consumer and service locator
E. Consumer and service provider
F. Service locator and service provider interface
G. Consumer, service locator, and service provider interface
H. None of the above
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
Which of the following methods compile? (Choose all that apply.)

A. public void violin(int… nums) {}
B. public void viola(String values, int… nums) {}
C. public void cello(int… nums, String values) {}
D. public void bass(String… values, int… nums) {}
E. public void flute(String[] values, …int nums) {}
F. public void oboe(String[] values, int[] nums) {}
```

## Questão 05

```text
Which of the following statements about inheritance are correct? (Choose all that apply.)

A. A class can directly extend any number of classes.
B. A class can implement any number of interfaces.
C. All variables inherit java.lang.Object.
D. If class A is extended by B, then B is a superclass of A.
E. If class C implements interface D, then C is a subtype of D.
F. Multiple inheritance is the property of a class to have multiple direct superclasses.
```

## Questão 06

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

## Questão 07

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

## Questão 08

```text
Which of the following Java operators can be used with boolean variables? (Choose all that apply.)

A. ==
B. +
C. --
D. !
E. %
F. -
G. Cast with (boolean)
```

## Questão 09

```text
Suppose we have a JAR file named cat-1.2.3-RC1.jar, and Automatic-Module-Name in the MANIFEST.MF is set to dog. What should an unnamed module referencing this automatic module include in module-info.java?

A. requires cat;
B. requires cat.RC;
C. requires cat-RC;
D. requires dog;
E. None of the above
```

## Questão 10

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

## Questão 11

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

## Questão 12

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

## Questão 13

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

## Questão 14

```text
Suppose you need to display a collection of products for sale, which may contain duplicates. Additionally, you have a collection of sales that you need to track, sorted by the natural order of the sale ID, and you need to retrieve the text of each. Which two of the following classes best suit your needs for each of these scenarios? (Choose two.)

A. ArrayList
B. HashMap
C. HashSet
D. LinkedList
E. SequencedTreeSet
F. TreeMap
```

## Questão 15

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

## Questão 16

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

## Questão 17

```text
Which of the following statements can be inserted in the blank so that the code will compile successfully? (Choose all that apply.)

abstract class Snake {}
class Cobra extends Snake {}
class GardenSnake extends Cobra {}
public class SnakeHandler {
      private Snake snakey;
      public void setSnake(Snake mySnake) { this.snakey = mySnake; }
      public static void main(String[] args) {
            new SnakeHandler().setSnake(_____________);
      } }

A. new Cobra()
B. new Snake()
C. new Object()
D. new String("Snake")
E. new GardenSnake()
F. null
G. None of the above. The class does not compile, regardless of the value inserted in the blank.
```

## Questão 18

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

## Questão 19

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

## Questão 20

```text
Assume that the source instance passed to the following method represents a file that exists. Also assume that /flip/sounds.txt exists as a file prior to executing this method. When this method is executed, which statement correctly copies the file to the path specified by /flip/sounds.txt?

void copyIntoFlipDirectory(Path source) throws IOException {
   var dolphinDir = Path.of("/flip");
   dolphinDir = Files.createDirectories(dolphinDir);
   var n = Path.of("sounds.txt");
   Files.copy(source,____________________________________________);
}

A. dolphinDir
B. dolphinDir.resolve(n), StandardCopyOption.REPLACE_EXISTING
C. dolphinDir, StandardCopyOption.REPLACE_EXISTING
D. dolphinDir.resolve(n)
E. The method does not compile, regardless of what is placed in the blank.
F. The method compiles but throws an exception at runtime, regardless of what is placed in the blank.
```

## Questão 21

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

## Questão 22

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

## Questão 23

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

## Questão 24

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

## Questão 25

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

## Questão 26

```text
Which of the following are common types to localize? (Choose all that apply.)

A. Dates
B. Lambda expressions
C. Class names
D. Currency
E. Numbers
F. Variable names
```

## Questão 27

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

## Questão 28

```text
Which of the following statements are true? (Choose all that apply.)

A. Modules with cyclic dependencies will not compile.
B. Packages with a cyclic dependency will not compile.
C. A cyclic dependency always involves exactly two modules.
D. A cyclic dependency always involves at least two requires statements.
E. An unnamed module can be involved in a cyclic dependency with an automatic module.
```

## Questão 29

```text
Which of the following can be inserted without causing a compilation error?

public void remove(List<Character> chars) {
      char end = 'z';
  
      // INSERT LINE HERE
  
      Predicate<Character> predicate =    c -> {
            char start = 'a'; return start <= c && c <= end; };
}

A. char start = ’a’;
B. char c = ’x’;
C. chars = null;
D. end = ’1’;
E. None of the above
```

## Questão 30

```text
Which statements about the following code snippet are correct? (Choose all that apply.)

for (var penguin : new int[2])
      System.out.println(penguin);
  
var ostrich = new Character[3];
for (var emu : ostrich)
      System.out.println(emu);
  
List<Integer> parrots = new ArrayList<Integer>();
for (var macaw    : parrots)
      System.out.println(macaw);

A. The data type of penguin is Integer.
B. The data type of penguin is int.
C. The data type of emu is undefined.
D. The data type of emu is Character.
E. The data type of macaw is List.
F. The data type of macaw is Integer.
H. None of the above, as the code does not compile.
```

## Questão 31

```text
Which of the following are true? (Choose all that apply.)

A. this() can be called from anywhere in a constructor.
B. this() can be called from anywhere in an instance method.
C. this.variableName can be called from any instance method in the class.
D. this.variableName can be called from any static method in the class.
E. You can call the default constructor written by the compiler using this().
F. You can access a private constructor with the main() method in the same class.
```

## Questão 32

```text
Assuming each call to takeNap() takes five seconds to execute without throwing an exception, what is the expected result of executing the following code snippet? (Choose all that apply.)

public void shutdown() throws InterruptedException {
   var service = Executors.newFixedThreadPool(4);
   try {
      service.execute(() -> takeNap());
      service.execute(() -> takeNap());
      service.execute(() -> takeNap());
   } finally {
      service.shutdown();
   }
   service.awaitTermination(2, TimeUnit.SECONDS);
   System.out.println("DONE!");
}
public void refactored() {
   try (var service = Executors.newFixedThreadPool(4)) {
      service.execute(() -> takeNap());
      service.execute(() -> takeNap());
      service.execute(() -> takeNap());
   }
   System.out.println("DONE!");
}

A. shutdown() will pause for approximately 2 seconds and then print DONE!.
B. shutdown() will pause for approximately 5 seconds and then print DONE!.
C. shutdown() will pause for approximately 15 seconds and then print DONE!.
D. refactored() will pause for approximately 2 seconds and then print DONE!.
E. refactored() will pause for approximately 5 seconds and then print DONE!.
F. refactored() will pause for approximately 15 seconds and then print DONE!.
G. One of the methods returns the result immediately.
H. One of the methods throws an exception.
```

## Questão 33

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

## Questão 34

```text
Fill in the blanks: __________ occur(s) when two or more threads are blocked forever but both appear active. _______ occur(s) when two or more threads try to complete a related task at the same time, resulting in invalid or unexpected data.

A. Livelock, Deadlock
B. Deadlock, Starvation
C. Race conditions, Deadlock
D. Livelock, Race conditions
E. Starvation, Race conditions
F. Deadlock, Livelock
```

## Questão 35

```text
Given the four statements (L, M, N, O), select the order that would cause the code to output 10 lines.

Stream.generate(() -> "1")
   L: .filter(x -> x.length()> 1)
   M: .forEach(System.out::println)
   N: .limit(10)
   O: .peek(System.out::println)
;

A. L, N
B. L, N, O
C. L, N, M
D. L, N, M, O
E. L, O, M
F. N, M
G. N, O
```

## Questão 36

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

## Questão 37

```text
Which of the following statements is correct?

A. Package access is more lenient than protected access.
B. A public class that has private fields and package methods is not visible to classes outside the package.
C. You can use access modifiers so only some of the classes in a package see a particular package class.
D. You can use access modifiers to allow access to all methods and not any instance variables.
E. You can use access modifiers to restrict access to all classes that begin with the word Test.
```

## Questão 38

```text
Given the following method, how many lines contain compilation errors?

8:    enum DayOfWeek {
9:          SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
10:        private DayOfWeek getWeekDay(int day, final int thursday) {
11:              int otherDay = day;
12:              int Sunday = 0;
13:              switch (otherDay) {
14:                    default:
15:                    case 1: continue;
16:                    case thursday: return DayOfWeek.THURSDAY;
17:                    case 2,10: break;
18:                    case Sunday: return DayOfWeek.SUNDAY;
19:                    case DayOfWeek.MONDAY: return DayOfWeek.MONDAY;
20:              }
21:              return DayOfWeek.FRIDAY;
22:        } }

A. None, the code compiles and runs without issue.
B. 1.
C. 2.
D. 3.
E. 4.
F. 5.
G. 6.
H. The code compiles but may produce an error at runtime.
```

## Questão 39

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

## Questão 40

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

## Questão 41

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

## Questão 42

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

## Questão 43

```text
Given the generic type String, the partitioningBy() collector creates a Map<Boolean, List<String>> when passed to collect() by default. When a downstream collector is passed to partitioningBy(), which return types can be created? (Choose all that apply.)

A. Map<boolean, List<String>>
B. Map<Boolean, List<String>>
C. Map<Boolean, Map<String>>
D. Map<Boolean, Set<String>>
E. Map<Long, TreeSet<String>>
F. None of the above
```

## Questão 44

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

## Questão 45

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

## Questão 46

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

## Questão 47

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

## Questão 48

```text
Which statements about functional interfaces are true? (Choose all that apply.)

A. A functional interface can contain default and private methods.
B. A functional interface can be defined as a class or an interface.
C. Abstract methods with signatures that are contained in public methods of java.lang.Object do not count toward the abstract method count for a functional interface.
D. A functional interface cannot contain static or private static methods.
E. A functional interface must be marked with the @FunctionalInterface annotation.
```

## Questão 49

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

## Questão 50

```text
What is the result of executing the following code snippet? (Choose all that apply.)

3: int start = 7;
4: int end = 4;
5: end += ++start;
6: start = (byte)(Byte.MAX_VALUE + 1);

A. start is 0.
B. start is -128.
C. start is 127.
D. end is 8.
E. end is 11.
F. end is 12.
G. The code does not compile.
H. The code compiles but throws an exception at runtime.
```

---

## Folha de respostas

Preencha **Resposta**; depois confira no livro (Apêndice *Answers to Review Questions*) e registre os erros em `docs/ocp-study/error-log.md`.

| # | Tópico | Fonte | Resposta | Gabarito | ✔/✘ |
|--:|---|---|---|---|:-:|
| 01 | T4 | `04-exceptions-localization/QCAP11_21` | | | |
| 02 | T7 | `11-modules/QCAP12_21` | | | |
| 03 | T8 | `13-concurrency/QCAP13_02` | | | |
| 04 | T3 | `03-methods/QCAP05_06` | | | |
| 05 | T3 | `01-class-design/QCAP06_14` | | | |
| 06 | T4 | `04-exceptions-localization/QCAP11_14` | | | |
| 07 | T2 | `02-making-decisions/QCAP03_17` | | | |
| 08 | T1 | `14-operators/QCAP02_01` | | | |
| 09 | T7 | `11-modules/QCAP12_17` | | | |
| 10 | T3 | `03-methods/QCAP05_12` | | | |
| 11 | T3 | `01-beyond-classes/QCAP07_30` | | | |
| 12 | T5 | `05-collections-generics/QCAP09_13` | | | |
| 13 | T6 | `06-lambdas-functional-interfaces/QCAP08_14` | | | |
| 14 | T5 | `05-collections-generics/QCAP09_01` | | | |
| 15 | T9 | `09-io-api/QCAP14_21` | | | |
| 16 | T2 | `02-making-decisions/QCAP03_23` | | | |
| 17 | T3 | `01-beyond-classes/QCAP07_09` | | | |
| 18 | T1 | `14-operators/QCAP02_10` | | | |
| 19 | T1 | `15-core-apis/QCAP04_13` | | | |
| 20 | T9 | `09-io-api/QCAP14_24` | | | |
| 21 | T4 | `04-exceptions-localization/QCAP11_11` | | | |
| 22 | T3 | `03-methods/QCAP05_14` | | | |
| 23 | T6 | `06-lambdas-functional-interfaces/QCAP08_17` | | | |
| 24 | T3 | `03-methods/QCAP05_21` | | | |
| 25 | T5 | `15-core-apis/QCAP04_15` | | | |
| 26 | T10 | `04-exceptions-localization/QCAP11_03` | | | |
| 27 | T8 | `13-concurrency/QCAP13_15` | | | |
| 28 | T7 | `11-modules/QCAP12_08` | | | |
| 29 | T6 | `06-lambdas-functional-interfaces/QCAP08_16` | | | |
| 30 | T2 | `02-making-decisions/QCAP03_15` | | | |
| 31 | T3 | `01-class-design/QCAP06_17` | | | |
| 32 | T8 | `13-concurrency/QCAP13_12` | | | |
| 33 | T5 | `05-collections-generics/QCAP09_22` | | | |
| 34 | T8 | `13-concurrency/QCAP13_07` | | | |
| 35 | T6 | `07-streams/QCAP10_10` | | | |
| 36 | T1 | `15-core-apis/QCAP04_05` | | | |
| 37 | T3 | `03-methods/QCAP05_08` | | | |
| 38 | T2 | `02-making-decisions/QCAP03_10` | | | |
| 39 | T4 | `04-exceptions-localization/QCAP11_01` | | | |
| 40 | T3 | `01-beyond-classes/QCAP07_10` | | | |
| 41 | T3 | `01-beyond-classes/QCAP07_13` | | | |
| 42 | T10 | `04-exceptions-localization/QCAP11_05` | | | |
| 43 | T6 | `07-streams/QCAP10_15` | | | |
| 44 | T7 | `11-modules/QCAP12_14` | | | |
| 45 | T1 | `14-operators/QCAP02_13` | | | |
| 46 | T6 | `07-streams/QCAP10_19` | | | |
| 47 | T5 | `05-collections-generics/QCAP09_05` | | | |
| 48 | T6 | `06-lambdas-functional-interfaces/QCAP08_03` | | | |
| 49 | T9 | `09-io-api/QCAP14_04` | | | |
| 50 | T1 | `14-operators/QCAP02_19` | | | |

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
