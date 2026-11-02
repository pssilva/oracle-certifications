# Simulado 18 — 1Z0-831 Java SE 25 Developer Professional

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
What does the following code output?

Function<Integer, Integer> s = a -> a + 4;
Function<Integer, Integer> t = a -> a * 3;
Function<Integer, Integer> c = s.compose(t);
System.out.print(c.apply(1));

A. 7
B. 15
C. The code does not compile because of the data types in the lambda expressions.
D. The code does not compile because of the compose() call.
E. The code does not compile for another reason.
```

## Questão 02

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

## Questão 03

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

## Questão 04

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

## Questão 05

```text
What is the output of this code?

13: record Gorilla(int x, Double y) {
14:    Gorilla {}
15:    Gorilla() { this(1,2.0); }
16: }
17: record Family(Gorilla parent1, Gorilla parent2) {}
18:
19: var family = new Family(
20:    new Gorilla(1, null), new Gorilla(0, 1.2));
21: System.out.print(switch (family) {
22:    case Family(var a, var b) -> "1";
23:    case Family(Gorilla c, Gorilla (int d, double e)) -> "2";
24:    case Family(Gorilla (int f, Double g), var h) -> "3";
25:    case Family(Gorilla i, Gorilla (int j, Double k)) -> "4";
26:    case Family(Object m, Object n) -> "5";
27:    case null -> "6";
28:    default -> "7";
29: });

A. 1
B. 2
C. 3
D. 4
E. 5
F. 6
G. 7
H. None of the above
```

## Questão 06

```text
Which statements about the following program are correct? (Choose all that apply.)

1: public abstract interface Herbivore {
2:    int amount = 10;
3:    public void eatGrass();
4:    public abstract int chew() { return 13; }
5: }
6:
7: abstract class IsAPlant extends Herbivore {
8:    Object eatGrass(int season) { return null; }
9: }

A. It compiles and runs without issue.
B. The code will not compile because of line 1.
C. The code will not compile because of line 2.
D. The code will not compile because of line 4.
E. The code will not compile because of line 7.
F. The code will not compile because line 8 contains an invalid method override.
```

## Questão 07

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

## Questão 10

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

## Questão 11

```text
Which of these statements compile? (Choose all that apply.)

A. HashSet<Number> hs = new HashSet<Integer>();
B. HashSet<? super ClassCastException> set = new HashSet<Exception>();
C. List<> list = new ArrayList<String>();
D. List<Object> values = new HashSet<Object>();
E. List<Object> objects = new ArrayList<? extends Object>();
F. Map<String, ? extends Number> hm = new HashMap<String, Integer>();
```

## Questão 12

```text
Assuming the following class compiles, how many variables defined in the class or method are in scope on the line marked on line 14?

1:  public class Camel {
2:     { int hairs = 3_000_0; }
3:     long water, air=2;
4:     boolean twoHumps = true;
5:     public void spit(float distance) {
6:        var path = "";
7:        { double teeth = 32 + distance++; }
8:        while(water> 0) {
9:           int age = twoHumps ? 1 : 2;
10:          short i=-1;
11:          for(i=0; i<10; i++) {
12:             var Private = 2;
13:          }
14:          // SCOPE
15:       }
16:    }
17: }

A. 2
B. 3
C. 4
D. 5
E. 6
F. 7
G. None of the above
```

## Questão 13

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

## Questão 14

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

## Questão 15

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

## Questão 16

```text
Which of the following can we add after line 6 for the code to run without error and not produce any output? (Choose all that apply.)

4: var stream = LongStream.of(1, 2, 3);
5: var opt = stream.map(n -> n * 10)
6:    .filter(n -> n < 5).findFirst();

A. if (opt.isPresent())
   System.out.println(opt.get());

B. if (opt.isPresent())
   System.out.println(opt.getAsLong());

C. opt.ifPresent(System.out.println);
D. opt.ifPresent(System.out::println);
E. None of these; the code does not compile.
F. None of these; line 6 throws an exception at runtime.
```

## Questão 17

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

## Questão 18

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

## Questão 19

```text
What is the result of the following code?

1:  interface Climb {
2:     boolean isTooHigh(int height, int limit);
3:  }
4:
5:  public class Climber {
6:     public static void main(String[] args) {
7:        check((h, m) -> h.append(m).isEmpty(), 5);
8:     }
9:     private static void check(Climb climb, int height) {
10:       if (climb.isTooHigh(height, 10))
11:          System.out.println("too high");
12:       else
13:          System.out.println("ok");
14:    }
15: }

A. ok
B. too high
C. Compiler error on line 7.
D. Compiler error on line 10.
E. Compiler error on a different line.
F. A runtime exception is thrown.
```

## Questão 20

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

## Questão 21

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

## Questão 22

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

## Questão 23

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

## Questão 24

```text
Which scenario is the best use of an exception?

A. An element is not found when searching a list.
B. An unexpected parameter is passed into a method.
C. The computer caught fire.
D. You want to loop through a list.
E. You don’t know how to code a method.
```

## Questão 25

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

## Questão 26

```text
Which statements about functional interfaces are true? (Choose all that apply.)

A. A functional interface can contain default and private methods.
B. A functional interface can be defined as a class or an interface.
C. Abstract methods with signatures that are contained in public methods of java.lang.Object do not count toward the abstract method count for a functional interface.
D. A functional interface cannot contain static or private static methods.
E. A functional interface must be marked with the @FunctionalInterface annotation.
```

## Questão 27

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

## Questão 28

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

## Questão 29

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

## Questão 30

```text
Which of the following can be used to change the order of operation in an expression?

A. [ ]
B. < >
C. ( )
D. \ /
E. { }
F. " "
```

## Questão 31

```text
Which of the following statements about the Callable call() and Runnable run() methods are correct? (Choose all that apply.)

A. Both methods return void.
B. Both can throw unchecked exceptions.
C. Both can be implemented with lambda expressions.
D. Runnable returns a generic type.
E. Both can throw checked exceptions.
F. Callable returns a generic type.
```

## Questão 32

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

## Questão 33

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

## Questão 34

```text
What is the result of the following code? (Choose all that apply.)

48: var map = Map.of(1,2, 3, 6);
49: var list = List.copyOf(map.entrySet());
50:
51: List<Integer> one = List.of(8, 16, 2);
52: var copy = List.copyOf(one);
53: var copyOfCopy = List.copyOf(copy);
54: var thirdCopy = new ArrayList<>(copyOfCopy);
55:
56: list.replaceAll(x -> x * 2);
57: one.replaceAll(x -> x * 2);
58: thirdCopy.replaceAll(x -> x * 2);
59:
60: System.out.println(thirdCopy);

A. One line fails to compile.
B. Two lines fail to compile.
C. Three lines fail to compile.
D. The code compiles but throws an exception at runtime.
E. If any lines with compiler errors are removed, the code throws an exception at runtime.
F. If any lines with compiler errors are removed, the code prints [16, 32, 4].
G. The code compiles and prints [16, 32, 4] without any changes.
```

## Questão 35

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

## Questão 36

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

## Questão 37

```text
Which of the following are true? (Choose all that apply.)

A. this() can be called from anywhere in a constructor.
B. this() can be called from anywhere in an instance method.
C. this.variableName can be called from any instance method in the class.
D. this.variableName can be called from any static method in the class.
E. You can call the default constructor written by the compiler using this().
F. You can access a private constructor with the main() method in the same class.
```

## Questão 38

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

## Questão 39

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

## Questão 40

```text
Fill in the blanks: __________ occur(s) when two or more threads are blocked forever but both appear active. _______ occur(s) when two or more threads try to complete a related task at the same time, resulting in invalid or unexpected data.

A. Livelock, Deadlock
B. Deadlock, Starvation
C. Race conditions, Deadlock
D. Livelock, Race conditions
E. Starvation, Race conditions
F. Deadlock, Livelock
```

## Questão 41

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

## Questão 42

```text
Which statements, when inserted independently into the following blank, will cause the code to print 2 at runtime? (Choose all that apply.)

int count = 0;
BUNNY: for (int row = 1; row <=3; row++)
   RABBIT: for (int col = 0; col <3 ; col++) {
      if ((col + row) % 2 == 0)
         ;
      count++;
   }
System.out.println(count);
 
A. break BUNNY
B. break RABBIT
C. continue BUNNY
D. continue RABBIT
E. break
F. continue
G. None of the above, as the code contains a compiler error
```

## Questão 43

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

## Questão 44

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
Which of the following are true given this declaration? (Choose all that apply.)

var is = IntStream.empty();

A. is.average() returns the type int.
B. is.average() returns the type OptionalInt.
C. is.findAny() returns the type int.
D. is.findAny() returns the type OptionalInt.
E. is.sum() returns the type int.
F. is.sum() returns the type OptionalInt.
```

## Questão 47

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

## Questão 48

```text
Suppose module puppy depends on module dog and module dog depends on module animal. Fill in the blank so that code in module dog can access the animal.behavior package in module animal.

module animal {
    _________ animal.behavior;
}

A. export
B. exports
C. require
D. requires
E. require transitive
F. requires transitive
G. None of the above
```

## Questão 49

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

## Questão 50

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

---

## Folha de respostas

Preencha **Resposta**; depois confira no livro (Apêndice *Answers to Review Questions*) e registre os erros em `docs/ocp-study/error-log.md`.

| # | Tópico | Fonte | Resposta | Gabarito | ✔/✘ |
|--:|---|---|---|---|:-:|
| 01 | T6 | `06-lambdas-functional-interfaces/QCAP08_12` | | | |
| 02 | T8 | `13-concurrency/QCAP13_06` | | | |
| 03 | T5 | `05-collections-generics/QCAP09_22` | | | |
| 04 | T1 | `01-building-blocks/QCAP01_19` | | | |
| 05 | T3 | `01-beyond-classes/QCAP07_20` | | | |
| 06 | T3 | `01-beyond-classes/QCAP07_06` | | | |
| 07 | T2 | `02-making-decisions/QCAP03_24` | | | |
| 08 | T4 | `04-exceptions-localization/QCAP11_21` | | | |
| 09 | T3 | `01-class-design/QCAP06_15` | | | |
| 10 | T1 | `14-operators/QCAP02_13` | | | |
| 11 | T5 | `05-collections-generics/QCAP09_04` | | | |
| 12 | T3 | `01-building-blocks/QCAP01_06` | | | |
| 13 | T9 | `09-io-api/QCAP14_04` | | | |
| 14 | T1 | `01-building-blocks/QCAP01_16` | | | |
| 15 | T5 | `05-collections-generics/QCAP09_09` | | | |
| 16 | T6 | `07-streams/QCAP10_09` | | | |
| 17 | T6 | `06-lambdas-functional-interfaces/QCAP08_04` | | | |
| 18 | T3 | `01-beyond-classes/QCAP07_13` | | | |
| 19 | T6 | `06-lambdas-functional-interfaces/QCAP08_02` | | | |
| 20 | T3 | `01-beyond-classes/QCAP07_14` | | | |
| 21 | T7 | `11-modules/QCAP12_20` | | | |
| 22 | T8 | `13-concurrency/QCAP13_12` | | | |
| 23 | T2 | `02-making-decisions/QCAP03_27` | | | |
| 24 | T4 | `04-exceptions-localization/QCAP11_10` | | | |
| 25 | T9 | `09-io-api/QCAP14_14` | | | |
| 26 | T6 | `06-lambdas-functional-interfaces/QCAP08_03` | | | |
| 27 | T10 | `04-exceptions-localization/QCAP11_16` | | | |
| 28 | T3 | `01-class-design/QCAP06_20` | | | |
| 29 | T7 | `11-modules/QCAP12_12` | | | |
| 30 | T1 | `14-operators/QCAP02_18` | | | |
| 31 | T8 | `13-concurrency/QCAP13_03` | | | |
| 32 | T9 | `09-io-api/QCAP14_25` | | | |
| 33 | T3 | `01-beyond-classes/QCAP07_04` | | | |
| 34 | T5 | `05-collections-generics/QCAP09_18` | | | |
| 35 | T2 | `02-making-decisions/QCAP03_10` | | | |
| 36 | T4 | `04-exceptions-localization/QCAP11_26` | | | |
| 37 | T3 | `01-class-design/QCAP06_17` | | | |
| 38 | T1 | `01-building-blocks/QCAP01_07` | | | |
| 39 | T1 | `14-operators/QCAP02_19` | | | |
| 40 | T8 | `13-concurrency/QCAP13_07` | | | |
| 41 | T10 | `04-exceptions-localization/QCAP11_25` | | | |
| 42 | T2 | `02-making-decisions/QCAP03_09` | | | |
| 43 | T4 | `04-exceptions-localization/QCAP11_20` | | | |
| 44 | T5 | `15-core-apis/QCAP04_15` | | | |
| 45 | T6 | `07-streams/QCAP10_19` | | | |
| 46 | T6 | `07-streams/QCAP10_08` | | | |
| 47 | T7 | `11-modules/QCAP12_09` | | | |
| 48 | T7 | `11-modules/QCAP12_02` | | | |
| 49 | T3 | `01-building-blocks/QCAP01_15` | | | |
| 50 | T3 | `03-methods/QCAP05_20` | | | |

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
