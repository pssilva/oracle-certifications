# Simulado 15 — 1Z0-831 Java SE 25 Developer Professional

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
Assuming the following class compiles, how many variables defined in the class or method are in scope on the line marked on line 14?

1:    public class Camel {
2:          { int hairs = 3_000_0; }
3:          long water, air=2;
4:          boolean twoHumps = true;
5:          public void spit(float distance) {
6:                var path = "";
7:                { double teeth = 32 + distance++; }
8:                while(water> 0) {
9:                      int age = twoHumps ? 1 : 2;
10:                    short i=-1;
11:                    for(i=0; i<10; i++) {
12:                          var Private = 2;
13:                    }
14:                    // SCOPE
15:              }
16:        }
17: }

A. 2
B. 3
C. 4
D. 5
E. 6
F. 7
G. None of the above
```

## Questão 02

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

## Questão 03

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

## Questão 04

```text
What is the result of the following?

1:    class Arachnid {
2:          static StringBuilder sb = new StringBuilder();
3:          { sb.append("c"); }
4:          static
5:          { sb.append("u"); }
6:          { sb.append("r"); }
7:    }
8:    public class Scorpion extends Arachnid {
9:          static
10:        { sb.append("q"); }
11:        { sb.append("m"); }
12:        public static void main(String[] args) {
13:              System.out.print(Scorpion.sb + " ");
14:              System.out.print(Scorpion.sb + " ");
15:              new Arachnid();
16:              new Scorpion();
17:              System.out.print(Scorpion.sb);
18:        } }

A. qu qu qumrcrc
B. u u ucrcrm
C. uq uq uqmcrcr
D. uq uq uqcrcrm
E. qu qu qumcrcr
F. qu qu qucrcrm
G. The code does not compile.
```

## Questão 05

```text
Which of the following statements are true? (Choose all that apply.)

A. Comparable is in the java.util package.
B. Comparator is in the java.util package.
C. compare() is in the Comparable interface.
D. compare() is in the Comparator interface.
E. compare() takes one method parameter.
F. compare() takes two method parameters.
```

## Questão 06

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

## Questão 07

```text
Which of the following can fill in the blank in this code to make it compile? (Choose all that apply.)

public class Ant {
    _________ void method() {}
}

A. default
B. final
C. private
D. Public
E. String
F. zzz:
```

## Questão 08

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

## Questão 09

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

## Questão 10

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

## Questão 11

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

## Questão 12

```text
Which APIs exist for creating or working with platform threads? (Choose all that apply.)

A. Executors.newCachedThreadPool()
B. Executors.newPlatformThreadPool()
C. Executors.newPlatformThreadPerTaskExecutor()
D. new Thread()
E. Thread.ofPlatform()
F. Thread.ofPlatformThread()
```

## Questão 13

```text
What is the output of the following code? (Choose three.)

22: var p1 = Path.of("/zoo/./bear","../food.txt");
23: p1.normalize().relativize(Path.of("/lion"));
24: System.out.println(p1);
25:
26: var p2 = Path.of("/zoo/animals/bear/koala/food.txt");
27: System.out.println(p2.subpath(1,3).getName(1));
28:
29: var p3 = Path.of("/pets/../cat.txt");
30: var p4 = Path.of("./dog.txt");
31: System.out.println(p4.resolve(p3));

A. ../../lion
B. /zoo/./bear/../food.txt
C. animal
D. bear
E. /pets/../cat.txt
F. /pets/../cat.txt/./dog.txt
```

## Questão 14

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

## Questão 15

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

## Questão 16

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

## Questão 17

```text
Which of the following compiles and prints out the entire set?

Set<?> set = Set.of("lion", "tiger", "bear");
var s = Set.copyOf(set);
Consumer<Object> consumer =    ________________;
s.forEach(consumer);

A. () -> System.out.println(s)
B. s -> System.out.println(s)
C. (s) -> System.out.println(s)
D. System.out.println(s)
E. System::out::println
F. System.out::println
```

## Questão 18

```text
What is the minimum number of lines that would need to be changed or removed for the following code to compile and return a value when called with dance(10)?

41: double dance(Object speed) {
42:        return switch (speed) {
43:              case 5 -> {yield 4};
44:              case 10 -> 8;
45:              case 15,20 -> 12;
46:              default -> 20;
47:              case null -> 16;
48:        }
49: }

A. Zero, the code compiles and runs without issue
B. One
C. Two
D. Three
E. Four
F. Five
G. Six
```

## Questão 19

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

## Questão 20

```text
What is the result of the following code snippet?

3: int sing = 8, squawk = 2, notes = 0;
4: while (sing> squawk) {
5:        sing--;
6:        squawk += 2;
7:        notes += sing + squawk;
8: }
9: System.out.println(notes);

A. 11
B. 13
C. 23
D. 33
E. 50
F. The code will not compile because of line 7.
```

## Questão 21

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

## Questão 22

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

## Questão 23

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

## Questão 24

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

## Questão 25

```text
Which of the following statements about garbage collection are correct? (Choose all that apply.)

A. Calling System.gc() is guaranteed to free up memory by destroying objects eligible for garbage collection.
B. Garbage collection runs on a set schedule.
C. Garbage collection allows the JVM to reclaim memory for other objects.
D. Garbage collection runs when your program has used up half the available memory.
E. An object may be eligible for garbage collection but never removed from the heap.
F. An object is eligible for garbage collection once no references to it are accessible in the program.
G. Marking a variable final means its associated object will never be garbage collected.
```

## Questão 26

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

## Questão 27

```text
What is printed by the following program?

1:    public class DriveBus {
2:          public void go() {
3:                System.out.print("A");
4:                try {
5:                      stop();
6:                } catch (ArithmeticException e) {
7:                      System.out.print("B");
8:                } finally {
9:                      System.out.print("C");
10:              }
11:              System.out.print("D");
12:        }
13:        public void stop() {
14:              System.out.print("E");
15:              Object x = null;
16:              x.toString();
17:              System.out.print("F");
18:        }
19:        public static void main(String n[]) {
20:              new DriveBus().go();
21:        } }

A. AE
B. AEBCD
C. AEC
D. AECD
E. AE followed by a stack trace
F. AEBCD followed by a stack trace
G. AEC followed by a stack trace
H. A stack trace with no other output
```

## Questão 28

```text
Which statements about the following program are correct? (Choose all that apply.)

1: public abstract interface Herbivore {
2:        int amount = 10;
3:        public void eatGrass();
4:        public abstract int chew() { return 13; }
5: }
6:
7: abstract class IsAPlant extends Herbivore {
8:        Object eatGrass(int season) { return null; }
9: }

A. It compiles and runs without issue.
B. The code will not compile because of line 1.
C. The code will not compile because of line 2.
D. The code will not compile because of line 4.
E. The code will not compile because of line 7.
F. The code will not compile because line 8 contains an invalid method override.
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
What is the output of the following code?

11: int sample1 = (2 * 4) % 3;
12: int sample2 = 3 * 2 % -3;
13: int sample3 = 5 * (1 % 2);
14: System.out.println(sample1 + ", " + sample2 + ", " + sample3);

A. 0, 0, 5
B. 1, 2, 10
C. 2, 1, 5
D. 2, 0, 5
E. 3, 1, 10
F. 3, 2, 6
G. The code does not compile.
```

## Questão 31

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

## Questão 32

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

## Questão 33

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

## Questão 34

```text
Which are true statements about terminal operations in a stream that runs successfully? (Choose all that apply.)

A. At most one terminal operation can exist in a stream pipeline.
B. Terminal operations are a required part of the stream pipeline in order to get a result.
C. Terminal operations have Stream as the return type.
D. The peek() method is an example of a terminal operation.
E. The referenced Stream may be used after calling a terminal operation.
```

## Questão 35

```text
What is the result of the following code snippet?

final char a = 'A', e = 'E';
char grade = 'B';
switch (grade) {
      default:
      case a:
      case 'B': 'C': System.out.print("great ");
      case 'D':            System.out.print("good "); break;
      case e:
      case 'F':            System.out.print("not good ");
}

A. great
B. great good
C. good
D. not good
E. The code does not compile because the data type of one or more case clauses does not match the data type of the switch variable.
F. None of the above.
```

## Questão 36

```text
Which of the following can be used to change the order of operation in an expression?

A. [ ]
B. < >
C. ( )
D. \ /
E. { }
F. " "
```

## Questão 37

```text
Which of the following statements are true in a module-info.java file? (Choose all that apply.)

A. The opens directive allows the use of reflection.
B. The opens directive declares that an API is called.
C. The use directive allows the use of reflection.
D. The use directive declares that an API is called.
E. The uses directive allows the use of reflection.
F. The uses directive declares that an API is called.
```

## Questão 38

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

## Questão 39

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

## Questão 40

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

## Questão 41

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

## Questão 42

```text
Which of the following lambda expressions can be passed to a function of Predicate<String> type? (Choose all that apply.)

A. s -> s.isEmpty()
B. s --> s.isEmpty()
C. (String s) -> s.isEmpty()
D. (String s) --> s.isEmpty()
E. (StringBuilder s) -> s.isEmpty()
F. (StringBuilder s) --> s.isEmpty()
```

## Questão 43

```text
Which of the following are true about the following code? (Choose all that apply.)

public class Run {
   static void execute() {
      System.out.print("1-");
   }
   static void execute(int num) {
      System.out.print("2-");
   }
   static void execute(Integer num) {
      System.out.print("3-");
   }
   static void execute(Object num) {
      System.out.print("4-");
   }
   static void execute(int… nums) {
      System.out.print("5-");
   }
   public static void main(String[] args) {
      Run.execute(100);
      Run.execute(100L);
   }
}

A. The code prints out 2-4-.
B. The code prints out 3-4-.
C. The code prints out 4-2-.
D. The code prints out 4-4-.
E. The code prints 3-4- if you remove the method static void execute(int num).
F. The code prints 4-4- if you remove the method static void execute(int num).
```

## Questão 44

```text
Which of the following are common types to localize? (Choose all that apply.)

A. Dates
B. Lambda expressions
C. Class names
D. Currency
E. Numbers
F. Variable names
```

## Questão 45

```text
Fill in the blanks so this command to run the program is correct:

java
_________ modules
_________ zoo.animal.talks/zoo/animal/talks/Peacocks

A. -d and -m
B. -d and –p
C. -m and -d
D. -m and -p
E. -p and -d
F. -p and -m
G. None of the above
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
Which is a true statement about a package in a JAR on the classpath containing a module-info.java file?

A. It is possible to make the package available to all other modules on the classpath.
B. It is possible to make the package available to all other modules on the module path.
C. It is possible to make the package available to exactly one other specific module on the classpath.
D. It is possible to make the package available to exactly one other specific module on the module path.
E. It is possible to make sure the package is not available to any other modules on the classpath.
```

## Questão 48

```text
Which statement about the following class is correct?

1:    public class PoliceBox {
2:          String color;
3:          long age;
4:          public void PoliceBox() {
5:                color = "blue";
6:                age = 1200;
7:          }
8:          public static void main(String []time) {
9:                var p = new PoliceBox();
10:              var q = new PoliceBox();
11:              p.color = "green";
12:              p.age = 1400;
13:              p = q;
14:              System.out.println("Q1="+q.color);
15:              System.out.println("Q2="+q.age);
16:              System.out.println("P1="+p.color);
17:              System.out.println("P2="+p.age);
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

## Questão 49

```text
Assuming that / is the root directory within the file system, which of the following are true statements? (Choose all that apply.)

A. /home/parrot is an absolute path.
B. /home/parrot is a directory.
C. /home/parrot is a relative path.
D. new File("/home") will throw an exception if /home does not exist.
E. new File("/home").delete() will throw an exception if /home does not exist.
F. A Reader offers character encoding, making it more useful when working with String data than an InputStream.
G. A Reader offers multithreading support, making it more useful than an InputStream.
```

## Questão 50

```text
Which of the following are true? (Choose all that apply.)

A. this() can be called from anywhere in a constructor.
B. this() can be called from anywhere in an instance method.
C. this.variableName can be called from any instance method in the class.
D. this.variableName can be called from any static method in the class.
E. You can call the default constructor written by the compiler using this().
F. You can access a private constructor with the main() method in the same class.
```

---

## Folha de respostas

Preencha **Resposta**; depois confira no livro (Apêndice *Answers to Review Questions*) e registre os erros em `docs/ocp-study/error-log.md`.

| # | Tópico | Fonte | Resposta | Gabarito | ✔/✘ |
|--:|---|---|---|---|:-:|
| 01 | T3 | `01-building-blocks/QCAP01_06` | | | |
| 02 | T6 | `07-streams/QCAP10_05` | | | |
| 03 | T4 | `04-exceptions-localization/QCAP11_11` | | | |
| 04 | T3 | `01-class-design/QCAP06_16` | | | |
| 05 | T5 | `05-collections-generics/QCAP09_21` | | | |
| 06 | T7 | `11-modules/QCAP12_21` | | | |
| 07 | T3 | `03-methods/QCAP05_02` | | | |
| 08 | T5 | `05-collections-generics/QCAP09_05` | | | |
| 09 | T3 | `01-beyond-classes/QCAP07_30` | | | |
| 10 | T8 | `13-concurrency/QCAP13_10` | | | |
| 11 | T10 | `04-exceptions-localization/QCAP11_25` | | | |
| 12 | T8 | `13-concurrency/QCAP13_16` | | | |
| 13 | T9 | `09-io-api/QCAP14_14` | | | |
| 14 | T6 | `07-streams/QCAP10_10` | | | |
| 15 | T5 | `15-core-apis/QCAP04_15` | | | |
| 16 | T6 | `06-lambdas-functional-interfaces/QCAP08_20` | | | |
| 17 | T6 | `06-lambdas-functional-interfaces/QCAP08_19` | | | |
| 18 | T2 | `02-making-decisions/QCAP03_30` | | | |
| 19 | T6 | `07-streams/QCAP10_12` | | | |
| 20 | T2 | `02-making-decisions/QCAP03_12` | | | |
| 21 | T1 | `15-core-apis/QCAP04_14` | | | |
| 22 | T4 | `04-exceptions-localization/QCAP11_02` | | | |
| 23 | T1 | `15-core-apis/QCAP04_07` | | | |
| 24 | T8 | `13-concurrency/QCAP13_13` | | | |
| 25 | T3 | `01-building-blocks/QCAP01_15` | | | |
| 26 | T2 | `02-making-decisions/QCAP03_15` | | | |
| 27 | T4 | `04-exceptions-localization/QCAP11_20` | | | |
| 28 | T3 | `01-beyond-classes/QCAP07_06` | | | |
| 29 | T3 | `01-building-blocks/QCAP01_04` | | | |
| 30 | T1 | `14-operators/QCAP02_11` | | | |
| 31 | T4 | `04-exceptions-localization/QCAP11_26` | | | |
| 32 | T5 | `05-collections-generics/QCAP09_13` | | | |
| 33 | T1 | `14-operators/QCAP02_04` | | | |
| 34 | T6 | `07-streams/QCAP10_04` | | | |
| 35 | T2 | `02-making-decisions/QCAP03_16` | | | |
| 36 | T1 | `14-operators/QCAP02_18` | | | |
| 37 | T7 | `11-modules/QCAP12_06` | | | |
| 38 | T9 | `09-io-api/QCAP14_16` | | | |
| 39 | T1 | `15-core-apis/QCAP04_22` | | | |
| 40 | T8 | `13-concurrency/QCAP13_15` | | | |
| 41 | T5 | `05-collections-generics/QCAP09_06` | | | |
| 42 | T6 | `06-lambdas-functional-interfaces/QCAP08_06` | | | |
| 43 | T3 | `03-methods/QCAP05_20` | | | |
| 44 | T10 | `04-exceptions-localization/QCAP11_03` | | | |
| 45 | T7 | `11-modules/QCAP12_03` | | | |
| 46 | T3 | `01-class-design/QCAP06_09` | | | |
| 47 | T7 | `11-modules/QCAP12_24` | | | |
| 48 | T3 | `01-building-blocks/QCAP01_20` | | | |
| 49 | T9 | `09-io-api/QCAP14_02` | | | |
| 50 | T3 | `01-class-design/QCAP06_17` | | | |

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
