# Simulado 02 — 1Z0-831 Java SE 25 Developer Professional

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

## Questão 02

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

## Questão 03

```text
Which APIs exist for creating or working with platform threads? (Choose all that apply.)

A. Executors.newCachedThreadPool()
B. Executors.newPlatformThreadPool()
C. Executors.newPlatformThreadPerTaskExecutor()
D. new Thread()
E. Thread.ofPlatform()
F. Thread.ofPlatformThread()
```

## Questão 04

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

## Questão 05

```text
Given the following method and file1 data, which statements are correct? (Choose all that apply.)

// file1 data
ABCDEF
 
public void copyFile(File file1, File file2) throws Exception {
   var reader = new InputStreamReader(new FileInputStream(file1));
   try (var writer = new FileWriter(file2)) {
      char[] buffer = new char[5];
      while(reader.read(buffer) != -1) {
          writer.write(buffer);
          // n1
      }
   }
}

A. The code does not compile because reader is not a buffered stream.
B. The code does not compile because writer is not a buffered stream.
C. The contents of the copied file are: ABCDEF
D. The contents of the copied file are: ABCDEFBCDE
E. The contents of the copied file cannot be determined.
F. If we check file2 on line n1 within the file system after five iterations of the while loop, it may be empty.
G. If we check file2 on line n1 within the file system after five iterations, it will contain exactly 50 characters.
H. This method contains a resource leak.
```

## Questão 06

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

## Questão 07

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

## Questão 08

```text
Assume that all of the files mentioned in the answer choices exist and define the same keys. Which one will be used to find the key in line 8?

6: Locale.setDefault(Locale.of("en", "US"));
7: var b = ResourceBundle.getBundle("Dolphins");
8: System.out.println(b.getString("name"));

A. Dolphins.properties
B. Dolphins_US.properties
C. Dolphins_en.properties
D. Whales.properties
E. Whales_en_US.properties
F. The code does not compile.
```

## Questão 09

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

## Questão 10

```text
Which of the following methods compile? (Choose all that apply.)

A. final static void rain() {}
B. public final int void snow() {}
C. private void int hail() {}
D. static final void sleet() {}
E. void final ice() {}
F. void public slush() {}
```

## Questão 11

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

## Questão 12

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

## Questão 13

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

## Questão 14

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

## Questão 15

```text
Which of the following compiles and prints out the entire set?

Set<?> set = Set.of("lion", "tiger", "bear");
var s = Set.copyOf(set);
Consumer<Object> consumer =  ________________;
s.forEach(consumer);

A. () -> System.out.println(s)
B. s -> System.out.println(s)
C. (s) -> System.out.println(s)
D. System.out.println(s)
E. System::out::println
F. System.out::println
```

## Questão 16

```text
What does the following method print?

11: public void tryAgain(String s) {
12:    try (FileReader r = null, p = new FileReader("")) {
13:       System.out.print("X");
14:       throw new IllegalArgumentException();
15:    } catch (Exception s) {
16:       System.out.print("A");
17:       throw new FileNotFoundException();
18:    } finally {
19:       System.out.print("O");
20:    }
21: }

A. XAO
B. XOA
C. One line of this method contains a compiler error.
D. Two lines of this method contain compiler errors.
E. Three or more lines of this method contain compiler errors.
F. The code compiles, but a NullPointerException is thrown at runtime.
G. None of the above.
```

## Questão 17

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

## Questão 18

```text
What is the output of the following code snippet?

32: Object skips = 10;
33: switch (skips) {
34:     case a when a < 10  -> System.out.print(2);
35:    case b when b>= 10 -> System.out.print(4);
36:    case null -> System.out.print(6);
37:    default   -> System.out.print(8);
38: }

A. 2
B. 4
C. 6
D. 8
E. Exactly one line does not compile.
F. Exactly two lines do not compile.
G. None of the above.
```

## Questão 19

```text
Which are true statements? (Choose all that apply.)

A. NIO.2 includes a method to delete an entire directory tree.
B. NIO.2 includes a method to traverse a directory tree.
C. NIO.2 includes methods that are aware of symbolic links.
D. Files.readAttributes() cannot access file system dependent attributes.
E. Files.readAttributes() is often more performant since it reads multiple attributes rather than accessing individual attributes.
F. Files.readAttributes() works with the File object.
```

## Questão 20

```text
What is the output of the following program?

1: interface Aquatic {
2:    int getNumOfGills(int p);
3: }
4: public class ClownFish implements Aquatic {
5:    String getNumOfGills() { return "14"; }
6:    int getNumOfGills(int input) { return 15; }
7:    public static void main(String[] args) {
8:       System.out.println(new ClownFish().getNumOfGills(-1));
9: } }

A. 14
B. 15
C. The code will not compile because of line 4.
D. The code will not compile because of line 5.
E. The code will not compile because of line 6.
F. None of the above.
```

## Questão 21

```text
Which of the following statements about unary operators are true? (Choose all that apply.)

A. Unary operators are always executed before any surrounding numeric binary or ternary operators.
B. The - operator can be used to flip a boolean value.
C. The pre-increment operator (++) returns the value of the variable before the increment is applied.
D. The post-decrement operator (--) returns the value of the variable before the decrement is applied.
E. The ! operator cannot be used on numeric values.
F. None of the above.
```

## Questão 22

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

## Questão 23

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

## Questão 24

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

## Questão 25

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

## Questão 26

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

## Questão 27

```text
Assuming that the /fox/food-schedule.csv file exists with the specified contents, what is the expected output of calling printData() on it?

/fox/food-schedule.csv
6am,Breakfast
9am,SecondBreakfast
12pm,Lunch
6pm,Dinner
 
void printData(Path path) throws IOException {
   Files.readAllLines(path) // r1
      .flatMap(p -> Stream.of(p.split(","))) // r2
       .map(q -> q.toUpperCase())  // r3
       .forEach(System.out::println);
}

A. The code will not compile because of line r1.
B. The code will not compile because of line r2.
C. The code will not compile because of line r3.
D. It throws an exception at runtime.
E. It does not print anything at runtime.
F. None of the above.
```

## Questão 28

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

## Questão 29

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

## Questão 30

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

## Questão 31

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

## Questão 32

```text
Which of the following statements about methods are true? (Choose all that apply.)

A. Overloaded methods must have the same signature.
B. Overridden methods must have the same signature.
C. Hidden methods must have the same signature.
D. Overloaded methods must have the same return type.
E. Overridden methods must have the same return type.
F. Hidden methods must have the same return type.
```

## Questão 33

```text
Which of the following are true statements about exception handling in Java? (Choose all that apply.)

A. A traditional try statement without a catch block requires a finally block.
B. A traditional try statement without a finally block requires a catch block.
C. A traditional try statement with only one statement can omit the {}.
D. A try-with-resources statement without a catch block requires a finally block.
E. A try-with-resources statement without a finally block requires a catch block.
F. A try-with-resources statement with only one statement can omit the {}.
```

## Questão 34

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

## Questão 35

```text
What is the output of the following code?

1:    class Reptile {
2:          {System.out.print("A");}
3:          public Reptile(int hatch) {}
4:          void layEggs() {
5:                System.out.print("Reptile");
6:          } }
7:    public class Lizard extends Reptile {
8:          static {System.out.print("B");}
9:          public Lizard(int hatch) {}
10:        public final void layEggs() {
11:              System.out.print("Lizard");
12:        }
13:        public static void main(String[] args) {
14:              var reptile = new Lizard(1);
15:              reptile.layEggs();
16:        } }

A. AALizard
B. BALizard
C. BLizardA
D. ALizard
E. The code will not compile because of line 3.
F. None of the above.
```

## Questão 36

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

## Questão 37

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

## Questão 38

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

## Questão 39

```text
Which statement about methods in ReentrantLock is correct?

A. The lock() method will attempt to acquire a lock without waiting indefinitely for it.
B. The testLock() method will attempt to acquire a lock without waiting indefinitely for it.
C. The attemptLock() method will attempt to acquire a lock without waiting indefinitely for it.
D. By default, a ReentrantLock fairly releases to each thread in the order in which it was requested.
E. Calling the unlock() method once will release a resource so that other threads can obtain the lock.
F. None of the above.
```

## Questão 40

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
What is the output of the following program?

1: public class CandyCounter {
2:    static long addCandy(double fruit, float vegetables) {
3:       return (int)fruit+vegetables;
4:    }
5:    
6:    public static void main(String[] args) {
7:       System.out.print(addCandy(1.4, 2.4f) + ", ");
8:       System.out.print(addCandy(1.9, (float)4) + ", ");
9:       System.out.print(addCandy((long)(int)(short)2, (float)4)); } }

A. 4, 6, 6.0
B. 3, 5, 6
C. 3, 6, 6
D. 4, 5, 6
E. The code does not compile because of line 9.
F. None of the above.
```

## Questão 43

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

## Questão 44

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

## Questão 45

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

## Questão 46

```text
Which of the following statements are true? (Choose all that apply.)

A. Comparable is in the java.util package.
B. Comparator is in the java.util package.
C. compare() is in the Comparable interface.
D. compare() is in the Comparator interface.
E. compare() takes one method parameter.
F. compare() takes two method parameters.
```

## Questão 47

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

## Questão 48

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

## Questão 49

```text
Which of the following methods compile? (Choose all that apply.)

A. public void january() { return; }
B. public int february() { return null;}
C. public void march() {}
D. public int april() { return 9;}
E. public int may() { return 9.0;}
F. public int june() { return;}
```

## Questão 50

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

---

## Folha de respostas

Preencha **Resposta**; depois confira no livro (Apêndice *Answers to Review Questions*) e registre os erros em `docs/ocp-study/error-log.md`.

| # | Tópico | Fonte | Resposta | Gabarito | ✔/✘ |
|--:|---|---|---|---|:-:|
| 01 | T2 | `02-making-decisions/QCAP03_07` | | | |
| 02 | T4 | `04-exceptions-localization/QCAP11_26` | | | |
| 03 | T8 | `13-concurrency/QCAP13_16` | | | |
| 04 | T1 | `14-operators/QCAP02_11` | | | |
| 05 | T9 | `09-io-api/QCAP14_09` | | | |
| 06 | T8 | `13-concurrency/QCAP13_20` | | | |
| 07 | T6 | `07-streams/QCAP10_11` | | | |
| 08 | T10 | `04-exceptions-localization/QCAP11_08` | | | |
| 09 | T5 | `05-collections-generics/QCAP09_03` | | | |
| 10 | T3 | `03-methods/QCAP05_03` | | | |
| 11 | T6 | `06-lambdas-functional-interfaces/QCAP08_13` | | | |
| 12 | T4 | `04-exceptions-localization/QCAP11_20` | | | |
| 13 | T2 | `02-making-decisions/QCAP03_04` | | | |
| 14 | T6 | `06-lambdas-functional-interfaces/QCAP08_12` | | | |
| 15 | T6 | `06-lambdas-functional-interfaces/QCAP08_19` | | | |
| 16 | T4 | `04-exceptions-localization/QCAP11_07` | | | |
| 17 | T6 | `06-lambdas-functional-interfaces/QCAP08_10` | | | |
| 18 | T2 | `02-making-decisions/QCAP03_01` | | | |
| 19 | T9 | `09-io-api/QCAP14_17` | | | |
| 20 | T3 | `01-beyond-classes/QCAP07_07` | | | |
| 21 | T1 | `14-operators/QCAP02_20` | | | |
| 22 | T6 | `06-lambdas-functional-interfaces/QCAP08_04` | | | |
| 23 | T1 | `14-operators/QCAP02_14` | | | |
| 24 | T1 | `01-building-blocks/QCAP01_14` | | | |
| 25 | T7 | `11-modules/QCAP12_19` | | | |
| 26 | T5 | `05-collections-generics/QCAP09_20` | | | |
| 27 | T9 | `09-io-api/QCAP14_08` | | | |
| 28 | T7 | `11-modules/QCAP12_12` | | | |
| 29 | T3 | `01-class-design/QCAP06_16` | | | |
| 30 | T1 | `14-operators/QCAP02_02` | | | |
| 31 | T5 | `05-collections-generics/QCAP09_07` | | | |
| 32 | T3 | `01-class-design/QCAP06_03` | | | |
| 33 | T4 | `04-exceptions-localization/QCAP11_13` | | | |
| 34 | T3 | `01-beyond-classes/QCAP07_06` | | | |
| 35 | T3 | `01-class-design/QCAP06_19` | | | |
| 36 | T3 | `01-beyond-classes/QCAP07_24` | | | |
| 37 | T3 | `01-beyond-classes/QCAP07_05` | | | |
| 38 | T5 | `05-collections-generics/QCAP09_08` | | | |
| 39 | T8 | `13-concurrency/QCAP13_17` | | | |
| 40 | T6 | `07-streams/QCAP10_09` | | | |
| 41 | T10 | `04-exceptions-localization/QCAP11_15` | | | |
| 42 | T1 | `14-operators/QCAP02_06` | | | |
| 43 | T7 | `11-modules/QCAP12_13` | | | |
| 44 | T8 | `13-concurrency/QCAP13_19` | | | |
| 45 | T2 | `02-making-decisions/QCAP03_16` | | | |
| 46 | T5 | `05-collections-generics/QCAP09_21` | | | |
| 47 | T7 | `11-modules/QCAP12_20` | | | |
| 48 | T3 | `03-methods/QCAP05_04` | | | |
| 49 | T3 | `03-methods/QCAP05_05` | | | |
| 50 | T3 | `01-beyond-classes/QCAP07_25` | | | |

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
