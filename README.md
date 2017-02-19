<div id="table-of-contents">
<h2>Table of Contents</h2>
<div id="text-table-of-contents">
<ul>
<li><a href="#org8fc2fd4">1. Requirements</a></li>
<li><a href="#orgfe4e6a4">2. Scope</a></li>
<li><a href="#org9299f08">3. Interfaces in Java 8</a>
<ul>
<li><a href="#orgc5cf2dd">3.1. What was before Java 8</a></li>
<li><a href="#orge99d858">3.2. Default methods</a></li>
<li><a href="#org7c46c35">3.3. Static methods</a></li>
<li><a href="#org3438602">3.4. Example interface in Java 8</a></li>
<li><a href="#org4ab7aaa">3.5. Functional interfaces</a></li>
<li><a href="#orgb16e138">3.6. java.util.function - reusable interfaces to work in functional style</a>
<ul>
<li><a href="#org1314faf">3.6.1. Predicate&lt;T&gt; - function to test a collection</a></li>
<li><a href="#orgacaee94">3.6.2. Function&lt;T,R&gt; - takes T and transforms it into R</a></li>
<li><a href="#org4418156">3.6.3. Supplier&lt;R&gt; - takes nothing and returns R</a></li>
<li><a href="#orge328070">3.6.4. Consumer&lt;T&gt; - takes T and returns nothing (for side effects)</a></li>
<li><a href="#org28325b1">3.6.5. Operators</a></li>
</ul>
</li>
<li><a href="#orgef23c95">3.7. New methods in old collections</a>
<ul>
<li><a href="#org5b20e55">3.7.1. Set, List (Collection)</a></li>
<li><a href="#orgb840c20">3.7.2. Map</a></li>
</ul>
</li>
<li><a href="#orgea5bf08">3.8. Exercises</a>
<ul>
<li><a href="#org1480193">3.8.1. Remove all players with less than 20 points and print names and points of those who left</a></li>
</ul>
</li>
</ul>
</li>
<li><a href="#orge10b635">4. Optional</a>
<ul>
<li><a href="#orgfdd7920">4.1. Examples of how not to use</a></li>
</ul>
</li>
<li><a href="#org3f944c8">5. Lambda expressions</a>
<ul>
<li><a href="#orgdb1cff3">5.1. What's their purpose?</a></li>
<li><a href="#org4e8af27">5.2. Syntax</a>
<ul>
<li><a href="#org8b48a45">5.2.1. Single Abstract Method</a></li>
<li><a href="#org9f91a01">5.2.2. Example interface, class and method</a></li>
<li><a href="#org9b23d74">5.2.3. Tester as an anonymous object</a></li>
<li><a href="#org7fb1074">5.2.4. Tester implementation as Lambda Expression</a></li>
<li><a href="#org5ea150e">5.2.5. Return is implicit in one liners</a></li>
<li><a href="#org955137c">5.2.6. Types of arguments are inferred</a></li>
<li><a href="#orgc383df9">5.2.7. Common functional interfaces</a></li>
</ul>
</li>
<li><a href="#org5f4d6e1">5.3. Scope</a></li>
<li><a href="#org4f5b716">5.4. Effective final</a></li>
<li><a href="#org1ff8b7a">5.5. Method references</a>
<ul>
<li><a href="#org56f3ab6">5.5.1. var::instanceMethod vs AClass::instanceMethod</a></li>
<li><a href="#org2bfd307">5.5.2. Constructor references</a></li>
<li><a href="#org7dbd6a7">5.5.3. Type of method reference</a></li>
</ul>
</li>
<li><a href="#org838323a">5.6. Higher Order Functions (Functions that return functions)</a>
<ul>
<li><a href="#org8c2aeb2">5.6.1. Closures</a></li>
</ul>
</li>
<li><a href="#orgee3ed0d">5.7. Exercises</a>
<ul>
<li><a href="#org5a54863">5.7.1. Count frequencies of chars using Java 8 functions</a></li>
<li><a href="#org984a031">5.7.2. Refactor repeating code from before Java 8 to use Lambda Expressions</a></li>
<li><a href="#org9a64406">5.7.3. Implement composeAll(Function&lt;T,T&gt;&#x2026; functions)</a></li>
</ul>
</li>
<li><a href="#org648013f">5.8. Examples of how not to use</a>
<ul>
<li><a href="#org4b56ccb">5.8.1. Show long lambdas</a></li>
</ul>
</li>
</ul>
</li>
<li><a href="#org341aba2">6. Stream API</a>
<ul>
<li><a href="#orgc39be1f">6.1. What they are</a></li>
<li><a href="#org42ee91f">6.2. How to build a Stream</a>
<ul>
<li><a href="#orgfa6d343">6.2.1. Gotchas</a></li>
</ul>
</li>
<li><a href="#org2f0cd07">6.3. How to turn streams into arrays and collections</a></li>
<li><a href="#orgaa0659a">6.4. Example - forEach</a></li>
<li><a href="#orgd24842a">6.5. Common operations on streams</a>
<ul>
<li><a href="#org92e1c12">6.5.1. Stream filter(Predicate) - element selection</a></li>
<li><a href="#org89df8bf">6.5.2. Stream map(Function&lt;T,R&gt;) - transformation T-&gt;R</a></li>
<li><a href="#orgb8f5e1d">6.5.3. Stream reduce - collection into single value</a></li>
<li><a href="#org613e2d4">6.5.4. allMatch(Predicate), anyMatch(Predicate), noneMatch(Predicate)</a></li>
<li><a href="#org1e35a0a">6.5.5. count()</a></li>
<li><a href="#orgc8e7b14">6.5.6. flatMap - join streams</a></li>
<li><a href="#org3bcb2f8">6.5.7. Exercises</a></li>
</ul>
</li>
<li><a href="#orgd365f4e">6.6. Collectors - create different outputs</a>
<ul>
<li><a href="#org4381472">6.6.1. List - toList</a></li>
<li><a href="#org1d695eb">6.6.2. Set - toSet</a></li>
<li><a href="#org30a3d01">6.6.3. Any collection - toCollection(Supplier&lt;Collection&gt;)</a></li>
<li><a href="#org063946d">6.6.4. Map</a></li>
<li><a href="#orgdd9ca45">6.6.5. String - toStringJoiner("delimiter")</a></li>
<li><a href="#org2693bb9">6.6.6. Exercises</a></li>
</ul>
</li>
<li><a href="#org0939bdf">6.7. Lazy evaluation</a></li>
<li><a href="#orgd687fa9">6.8. Specialized streams</a></li>
<li><a href="#org6144cec">6.9. Types of operations on Stream</a>
<ul>
<li><a href="#org7a284ba">6.9.1. Intermediate operations</a></li>
<li><a href="#orgb742111">6.9.2. Terminal operations</a></li>
<li><a href="#org2f98fd8">6.9.3. Short-circuit operations</a></li>
</ul>
</li>
<li><a href="#orgcf563d1">6.10. Parallel streams</a></li>
<li><a href="#org3e31f90">6.11. Infinite Streams (unbounded)</a>
<ul>
<li><a href="#org75d34d1">6.11.1. Stream.generate(Supplier&lt;T&gt;)</a></li>
<li><a href="#orgaace92d">6.11.2. Stream.iterate(T seed, UnaryOperator&lt;T&gt;)</a></li>
<li><a href="#orgf8de600">6.11.3. Exercise</a></li>
</ul>
</li>
</ul>
</li>
<li><a href="#org19d0466">7. Date and Time API (java.time)</a>
<ul>
<li><a href="#org4bd53f0">7.1. Intro</a></li>
<li><a href="#orga1bccc1">7.2. Date and Time representations</a>
<ul>
<li><a href="#org18f2372">7.2.1. Instant - a point in time</a></li>
<li><a href="#orgaf9e558">7.2.2. LocalDate - day precision</a></li>
<li><a href="#org1614a08">7.2.3. LocalTime</a></li>
<li><a href="#org00660c5">7.2.4. LocalDateTime - both in one object</a></li>
<li><a href="#orge025213">7.2.5. ZonedTime, ZonedDateTime</a></li>
</ul>
</li>
<li><a href="#orgefb3559">7.3. Length of time</a>
<ul>
<li><a href="#org434dac4">7.3.1. Duration</a></li>
<li><a href="#orga4d6481">7.3.2. Period</a></li>
</ul>
</li>
<li><a href="#org2682675">7.4. TemporalAdjusters</a></li>
<li><a href="#org86706ab">7.5. Date formatters</a>
<ul>
<li><a href="#orge217374">7.5.1. Exercise</a></li>
</ul>
</li>
<li><a href="#org619a00e">7.6. Conversion between new and old APIs</a></li>
<li><a href="#org28d2bad">7.7. Clock</a></li>
<li><a href="#org71e56c6">7.8. Exercises</a>
<ul>
<li><a href="#org97ba58e">7.8.1. How many days have past since given day</a></li>
<li><a href="#org5d94221">7.8.2. Find previous year day closest to the given date that has the same day of week</a></li>
</ul>
</li>
</ul>
</li>
<li><a href="#orge4463cd">8. Other things</a>
<ul>
<li><a href="#orgce8e119">8.1. Concurrency</a>
<ul>
<li><a href="#orge38caef">8.1.1. Atomic values</a></li>
<li><a href="#org0c69d75">8.1.2. Parallel array operations</a></li>
<li><a href="#orge2b6f80">8.1.3. Completable futures</a></li>
</ul>
</li>
<li><a href="#orgc71e09c">8.2. JavaScript engine - Nashorn</a></li>
<li><a href="#orgf69c1fe">8.3. Base64</a></li>
<li><a href="#org3a772fb">8.4. Methods in Strings, Numbers, etc.</a></li>
<li><a href="#orgde1b97a">8.5. G1</a></li>
<li><a href="#org0477260">8.6. String deduplication</a></li>
<li><a href="#org14c43f7">8.7. JavaFX</a></li>
<li><a href="#orgcf11e91">8.8. Annotations</a>
<ul>
<li><a href="#orge62018b">8.8.1. Repeatable annotations</a></li>
<li><a href="#org89e414e">8.8.2. Annotations on types</a></li>
</ul>
</li>
</ul>
</li>
<li><a href="#orge2f137f">9. Other resources</a>
<ul>
<li><a href="#org1488f32">9.1. Functional thinking</a></li>
</ul>
</li>
</ul>
</div>
</div>

<a id="org8fc2fd4"></a>

# Requirements

Wymagania: IDE (Intellij Idea, Eclipse, etc.) z JDK 8 i git, żeby można było
komitowac (opcjonalnie). Jeśli Intellij to wystarczy Community Edition.


<a id="orgfe4e6a4"></a>

# Scope

-   Changes in interfaces (default and static methods)
-   Optional
-   Lambda Expressions
-   Streams
-   Date Time API
-   Other things (Map, Base64, JavaFx, G1, etc.)

Java 8 heads towards functional programming, where things are immutable, and
therefore new classes are mostly immutable. You write code with similar
mindset.


<a id="org9299f08"></a>

# Interfaces in Java 8


<a id="orgc5cf2dd"></a>

## What was before Java 8

-   single inheritance of implementations
-   multiple inheritance of types (interfaces)
-   interfaces cannot provide implementations


<a id="orge99d858"></a>

## Default methods

Provide real implementations and can be overridden.
So interfaces became more like abstract classes.

If a class implements two interfaces with the same name of default method,
then it must be overridden or it won't compile.


<a id="org7c46c35"></a>

## Static methods

Cannot be overridden.


<a id="org3438602"></a>

## Example interface in Java 8

It has: abstract methods, default methods, and static methods.

    @FunctionalInterface
    public interface Function<T, R> {
    
        R apply(T t); // abstract method
    
        default <V> Function<V, R> compose(Function<V, T> before) {
            Objects.requireNonNull(before);
            return (V v) -> apply(before.apply(v));
        }
    
        default <V> Function<T, V> andThen(Function<R, V> after) {
            Objects.requireNonNull(after);
            return (T t) -> after.apply(apply(t));
        }
    
        static <T> Function<T, T> identity() {
            return t -> t;
        }
    }


<a id="org4ab7aaa"></a>

## Functional interfaces

**@FunctionalInterface** tells the compiler to check if the interface has only
single abstract method. If not then it won't compile it.

Interfaces with SAM, but without the annotation are also functional merely
won't have compile type check - when you add another abstract method to such
interface it will compile, but classes that implement them won't.

Functional interface, like any other interface, can have default and static
methods. Also, when two interfaces provide the same default method, then
implementing class must override the method or it won't compile.


<a id="orgb16e138"></a>

## java.util.function - reusable interfaces to work in functional style


<a id="org1314faf"></a>

### Predicate<T> - function to test a collection

    @FunctionalInterface
    public interface Predicate<T> {
    
        boolean test(T t); //SAM
    
        default Predicate<T> and(Predicate<? super T> other) {
            //...
        }
    
        default Predicate<T> negate() {
            //...
        }
    
        default Predicate<T> or(Predicate<? super T> other) {
            //...
        }
    
        static <T> Predicate<T> isEqual(Object targetRef) {
            //...
        }
    }

1.  Example

        Predicate<Player> isGoodPlayer = p -> p.getPoints() >= 20;
        if (isGoodPlayer.test(player)) {
            // ...
        }
        
        // for (Player p : players) { if (isGoodPlayer.test(p)) return player; }
        players.stream().filter(isGoodPlayer).map(Player::getName).collect(toList());


<a id="orgacaee94"></a>

### Function<T,R> - takes T and transforms it into R

    @FunctionalInterface
    public interface Function<T, R> {
    
        R apply(T t);
    
        default <V> Function<V, R> compose(Function<V, T> before) {
            //...
        }
    
        default <V> Function<T, V> andThen(Function<R, V> after) {
            //...
        }
    
        static <T> Function<T, T> identity() {
            return t -> t;
        }
    }

BiFunction<T,T,R> takes two T and returns R

    Function<Player,Stat> takeStats = p -> new Stat(p);


<a id="org4418156"></a>

### Supplier<R> - takes nothing and returns R

    @FunctionalInterface
    public interface Supplier<T> {
    
        T get();
    }

    Supplier<Player> recruiter = Player::new;
    Supplier<Player> recruiter = () -> Player("Michael Jordan", 23);
    
    team.add(recruiter.get());


<a id="orge328070"></a>

### Consumer<T> - takes T and returns nothing (for side effects)

    @FunctionalInterface
    public interface Consumer<T> {
    
        void accept(T t);
    
        default Consumer<T> andThen(Consumer<? super T> after) {
            //...
        }
    }

    Consumer<Player> incScore = p -> p.setScore(p.getScore()+2);
    
    for (Player player : player) {
        incScore.accept(player);
    }


<a id="org28325b1"></a>

### Operators

1.  XUnaryOperator (X: double/int/long): same type out

2.  XBinaryOperator (X: double/int/long): two X in, same type out

3.  XPredicate: double/long/int in, boolean out

4.  XConsumer: double/long/int in, nothing out


<a id="orgef23c95"></a>

## New methods in old collections


<a id="org5b20e55"></a>

### Set, List (Collection)

-   [set/list.forEach(Consumer)](http://farenda.com/java/java-8-foreach-examples)
-   [set/list.removeIf(Predicate)](http://farenda.com/java/java-8-remove-selected-item-from-collection)
-   replaceAll(Function)


<a id="orgb840c20"></a>

### Map

-   [compute(Key, BiFunction)](http://farenda.com/java/java-util-map-compute-key-bifunction)
-   [computeIfAbsent(key,Function)](http://farenda.com/java/java-util-map-computeifabsent-key-function)
-   [computeIfPresent(Key,BiFunction)](http://farenda.com/java/java-util-map-computeifpresent-key-bifunction)
-   [forEach(BiConsumer)](http://farenda.com/java/java-util-map-foreach-biconsumer)
-   [getOrDefault](http://farenda.com/java/java-util-map-getordefault)
-   [merge(key, value, BiFunction)](http://farenda.com/java/java-util-map-merge-key-value-bifunction)
-   [putIfAbsent(key, value)](http://farenda.com/java/java-util-map-putifabsent)
-   [remove(key, value)](http://farenda.com/java/java-util-map-remove-key-value)
-   [replace(key, value)](http://farenda.com/java/java-util-map-replace-key-value)
-   [replace(key, oldValue, newValue)](http://farenda.com/java/java-util-map-replace-key-oldvalue-newvalue)
-   [replaceAll(BiFunction)](http://farenda.com/java/java-util-map-replaceall-bifunction)


<a id="orgea5bf08"></a>

## Exercises


<a id="org1480193"></a>

### Remove all players with less than 20 points and print names and points of those who left


<a id="orge10b635"></a>

# Optional

Result of computation that may not exists and what to do about it. For
example finding max/min element in empty collection. Or sum of empty
array/list/set of numbers.

-   [Optional.ofNullable(T)](http://farenda.com/java/java-util-optional-ofnullable)
    How to use **Optional** to handle potentially nullable values.
-   [Optional.map(Function)](http://farenda.com/java/java-util-optional-map-function)
    How to convert value conditionally using **Optional**.


<a id="orgfdd7920"></a>

## Examples of how not to use

    // long and less readable
    if (Optional.ofNullable(x).isPresent()) {...}
    
    // old school, but short and clear:
    if (x != null) {
     ...
    }


<a id="org3f944c8"></a>

# Lambda expressions


<a id="orgdb1cff3"></a>

## What's their purpose?

They have benefits of Inner/Anonymous Classes, namely:

-   they have access to members of class instantiating them
-   don't require create a new class (can be defined inline)
-   can be assigned to fields
-   can be passed as parameters.

To provide concise and expressive syntax.

    button.addActionListener(
        new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButton(e);
            }
        }
    );

    button.addActionListener(e -> handleButton(e));


<a id="org4e8af27"></a>

## Syntax


<a id="org8b48a45"></a>

### Single Abstract Method

They require an interface with Single Abstract Method (SAM).

A functional interface is an interface that contains exactly one abstract
method. Additionally it *may* contain **default methods** and/or **static methods**.
Because a functional interface contains exactly one abstract method, you
can omit the name of that method when you implement it using a **Lambda
Expression**.


<a id="org9f91a01"></a>

### Example interface, class and method

Consider the following interface:

    interface Tester<T> {
        boolean test(T t);
    }

Sample class for processing:

    public class Player {
        public int points;
    }

Both can be used like this:

    public void printPlayer(List<Player> players, Tester<Data> tester) {
        for (Player p: players) {
            if (tester.test(p)) {
                System.out.println(p);
            }
        }
    }


<a id="org9b23d74"></a>

### Tester as an anonymous object

In **Java 7** the *Tester* could be implemented like this:

    printPlayer(al, new Tester<Player>() {
        public boolean test(Player player) {
            return player.points > 20;
        }
    });


<a id="org7fb1074"></a>

### Tester implementation as Lambda Expression

In **Java 8** the call to above method can be simplified as follows:

    printPlayer(al, (Player p) -> { return p.points > 20; } );

Notice that method name can be omitted here, because the interface has only
one abstract method, therefore the compiler can figure out the name.


<a id="org5ea150e"></a>

### Return is implicit in one liners

It's the same as above:

    printPlayer(players, (Player player) -> player.points > 20);

**Curly brackets** and the **return** keyword also are not needed, because both the
method and the expression *player.points > 1* also return a *boolean*. So, the
compiler is able to figure out that the value of this expression should be
returned from the method.


<a id="org955137c"></a>

### Types of arguments are inferred

This can be shortened even more to:

    printPlayer(players, p -> p.points > 20);

The declaration of *p* is gone! The compiler can figure out all this, because
the interface has only one abstract method and that method also has only
one parameter. So you don't have to write all those things in your code.


<a id="orgc383df9"></a>

### Common functional interfaces

JDK 8 ships with a bunch of general interfaces that can be used in many
situations. The interfaces are defined in **java.util.function** package.


<a id="org5f4d6e1"></a>

## Scope

**Lambda Expressions** don't introduce a new scope. Variables in LE have the
same scope as their outside object. So, "this" refers to the outside object.


<a id="org4f5b716"></a>

## Effective final

Anonymous Java classes can access **variables from method parameters** or **method
local** only if they are **declared final**. In **Lambda Expressions** it is the same
case, but they also can access variables that are **"effectively"
final**. Variables that never change once assigned.


<a id="org1ff8b7a"></a>

## Method references

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<thead>
<tr>
<th scope="col" class="org-left">Method Reference</th>
<th scope="col" class="org-left">Example</th>
<th scope="col" class="org-left">Equivalent lambda</th>
</tr>
</thead>

<tbody>
<tr>
<td class="org-left">AClass::staticMethod</td>
<td class="org-left">Math::min</td>
<td class="org-left">(a,b) -> Math.min(a,b)</td>
</tr>


<tr>
<td class="org-left">var::instanceMethod</td>
<td class="org-left">list::add</td>
<td class="org-left">(t) -> list.add(t)</td>
</tr>


<tr>
<td class="org-left">AClass::instanceMethod</td>
<td class="org-left">List::add</td>
<td class="org-left">(l,e) -> l.add(e)</td>
</tr>


<tr>
<td class="org-left">AClass::new</td>
<td class="org-left">ArrayList::new</td>
<td class="org-left">() -> new ArrayList()</td>
</tr>
</tbody>
</table>


<a id="org56f3ab6"></a>

### var::instanceMethod vs AClass::instanceMethod

    List<Integer> result = new ArrayList<>();
    source.forEach(by2::add);
    // -> on each source integer: by2.add(s)

AClass::instancMethod version produces lambda that takes *one* more argument
that the method expects. The first argument is the object on which the
method is called; the rest are the parameters to the method:

    List<String> result = process(names, String::toUpperCase);
    // -> on each string: s.toUpperCase()

This way or another must match SAM.


<a id="org2bfd307"></a>

### Constructor references

AClass::new


<a id="org7dbd6a7"></a>

### Type of method reference

It is inferred from the context and depends on to what it is assigned
to. When not assigned it has no type and won't compile!

    Function<Double, Double> round = Math::rint;
    Fun<D,D> a = new Function<D,D> { D apply(D x) { return Math::rint;}}
    round.compose(Math::sqrt).apply(64d, 2d); // ok
    
    // Math::rint is not assigned, so has no type:
    Math::rint.compose(Math::sqrt); // compile error!


<a id="org838323a"></a>

## Higher Order Functions (Functions that return functions)

    Predicate<Player> isStrong = p -> p.getStrength() >= 100;
    Predicate<Player> hasStamina = p -> p.getStamina() > 0;
    allMatches(players, isStrong.and(hasStamina));


<a id="org8c2aeb2"></a>

### Closures

    public static Predicate<Player> buildIsSP(int minStrength) {
        return p -> p.getStrength() >= minStrength; // returns Lambda
    }
    
    public static Function<Integer, Predicate<Player>> createIsStrongPredicate
        // returns Function that will produce the Predicate:
        = minStrength -> (p -> p.getStrength() >= minStrength);


<a id="orgee3ed0d"></a>

## Exercises


<a id="org5a54863"></a>

### Count frequencies of chars using Java 8 functions

Map.merge


<a id="org984a031"></a>

### Refactor repeating code from before Java 8 to use Lambda Expressions

-   loop that finds matching element
-   implement map (transformation of elements)
-   implement reduce (using BinaryOperator)


<a id="org9a64406"></a>

### Implement composeAll(Function<T,T>&#x2026; functions)


<a id="org648013f"></a>

## Examples of how not to use


<a id="org4b56ccb"></a>

### Show long lambdas


<a id="org341aba2"></a>

# Stream API


<a id="orgc39be1f"></a>

## What they are

Wrappers around data sources (arrays, lists, etc.) that use lambda
expressions.

They are **pipelines of operations** on data sources (collections). They don't
have own data (don't copy it from source collection).

Streams are pipelines of operations that consume the data so they cannot be
reused!


<a id="org42ee91f"></a>

## How to build a Stream

You can build a Stream from:

-   individual elements: Stream.of(x, y, &#x2026;);
-   array: Stream.of(numsArray);
-   a collection: list.stream()
-   a function: Stream.generate(Supplier), Stream.iterate(val, F)
-   a StreamBuilder: someBuilder.builder()
-   a String: "aoeu".chars(), Stream.of(String.split(&#x2026;))
-   other Streams: distinct, filter, limit, map, sorted, substream


<a id="orgfa6d343"></a>

### Gotchas

-   see specialized streams
-   1-item stream instead of an array
    
        int[] nums = {1, 2, 3};
        Stream.of(nums); // Stream with 1 element, which is an array
        
        Integer[] numbers = {1, 2, 3};
        Stream.of(numbers); // 3-element stream of Integers


<a id="org2f0cd07"></a>

## How to turn streams into arrays and collections

Back into array:

    Player[] array = players.stream().toArray(Player[]::new);

Back into a collection:

    // import java.util.stream.collectors.Collectors;
    List<Player> processed = players.stream().collect(Collectors.toList());


<a id="orgaa0659a"></a>

## Example - forEach

Traditional for loop process sequentially:

    for (Flight flight : flights) {
        flight.setCarrier("XX");
    }

Java 8 forEach can be made concurrent automatically by using parallelStream:

    flights.parallelStream().forEach(f -> f.setCarrier("XX"));

With forEach you cannot:

-   break out of loop using "break" nor "return"
-   modify local variables outside loop (remember Effective Final?)


<a id="orgd24842a"></a>

## Common operations on streams


<a id="org92e1c12"></a>

### Stream filter(Predicate) - element selection


<a id="org89df8bf"></a>

### Stream map(Function<T,R>) - transformation T->R


<a id="orgb8f5e1d"></a>

### Stream reduce - collection into single value

reduce(BiF, 0, [1, 2, 3]) -> BiF(0, 1) = 1 -> BiF(1, 2) = 3 -> BiF(3, 3) = 6


<a id="org613e2d4"></a>

### allMatch(Predicate), anyMatch(Predicate), noneMatch(Predicate)

    int[] nums = {1, 2, 3};
    boolean allEven = Arrays.stream(nums).allMatch(isEven);


<a id="org1e35a0a"></a>

### count()

    int[] nums = {1, 2, 3};
    int size = Arrays.stream(nums).count();


<a id="orgc8e7b14"></a>

### flatMap - join streams

    static <T,R> Stream<R> flatMap(Function<T,Stream<R>> streaming);


<a id="org3bcb2f8"></a>

### Exercises

1.  Find even and odd numbers in an array (use Predicates)

        Integer[] numbers = {1, 2, 3, 4, 5};
        
        // Predicate isEven = n -> n % 2 == 0;
        // Predicate isOdd = Predicate.negate(isEven);
        // Stream.of(numbers).filter(isEven).collect(toList());
        List<Integer> even = ...;
        List<Integer> odd = ...;

2.  Count distinct chars in names of players using flatMap


<a id="orgd365f4e"></a>

## Collectors - create different outputs


<a id="org4381472"></a>

### List - toList


<a id="org1d695eb"></a>

### Set - toSet


<a id="org30a3d01"></a>

### Any collection - toCollection(Supplier<Collection>)

toCollection(TreeSet::new) -> new Supplier<Collection> { Collection get() { new TreeSet(); }}


<a id="org063946d"></a>

### Map

1.  partitioningBy(Predicate) -> Map<Boolean,T>

2.  groupingBy(Function<T,R> keyFunction) -> Map<Pos,List<Play>>

        // group students by name:
        Map<String, List<Student>> roster = students.stream()
            .collect(groupingBy(Student::getName));

3.  Composing collectors

    Grouping collector can use another (downstream) collector that will have
    possibility to post-process values. The result will the same keys, but
    values from the "post-processor".
    
        Map<String, Integer> roster = students.stream()
            .collect(
                // group by name:
                groupingBy(Student::getName,
                    // count occurrences
                    Collectors.counting()));


<a id="orgdd9ca45"></a>

### String - toStringJoiner("delimiter")


<a id="org2693bb9"></a>

### Exercises

1.  Rewrite finding even/odd numbers, but with help of Collectors

2.  Find best scorers on each position


<a id="org0939bdf"></a>

## Lazy evaluation

It means that operations on a stream are deferred (postponed) until the
system notices that they are really needed. Only then they are evaluated.

    List<Integer> numbers = asList(null, 2, 3, 4, 5);
    Integer result = numbers.stream()
        .filter(Objects::nonNull)
        .map(n -> n + 1)
        .filter(n -> n > 2)
        .filter(4 -> n % 2 == 0)
        .anyMatch()
        .orElse(null);


<a id="orgd687fa9"></a>

## Specialized streams

IntStream, LongStream, DoubleStream - specialized streams with restrictions
on operations (e.g. map must produce int/long/double), but with some common
methods for those types - sum, avg, min, max, etc.

    int[] nums = { 1, 2, 3 };
    IntStream intStream = Arrays.stream(nums);
    
    Integer[] numbers = { 1, 2, 3 };
    Stream<Integer> stream = Arrays.stream(numbers); // or Stream.of(numbers)


<a id="org6144cec"></a>

## Types of operations on Stream


<a id="org7a284ba"></a>

### Intermediate operations

Intermediate (non-terminal) operations produce Streams, are added to
processing pipeline, but are not executed immediately - only after
Short-Circuit operation is found.

When executed, they operate on one element at a time. So pipeline of
intermediate operations is executed on the first element of the stream,
then on the second, and so on.


<a id="orgb742111"></a>

### Terminal operations

Terminal operations consume the Stream and no more operations can executed
on it. Examples: forEach(Consumer), findFirst(), allMatch(Predicate).


<a id="org2f98fd8"></a>

### Short-circuit operations

They cause evaluation of intermediate operations that appear earlier in the
pipeline. Both intermediate and terminal operations can be short-circuit:

-   Intermediate: limit, substream
-   Terminal: forEach, findFirst


<a id="orgcf563d1"></a>

## Parallel streams

Marking a stream as parallel automatically allows it to be processed
concurrently, without implementing Runnables nor using ExecutorService. It
doesn't mean that the operations will be run parallel, but may be.

By default it uses the common **ForkJoinPool**.

Use for slow operations.

    Consumer<Player> slowConsumer = p -> {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
        } finally {
            System.out.println(p);
        }
    };
    List<Players> players;
    players.stream().forEach(slowConsumer);
    players.stream().parallel().forEach(slowConsumer);


<a id="org3e31f90"></a>

## Infinite Streams (unbounded)

They are not really infinite streams, but streams that don't have fixed
size, where values are calculated when are needed.


<a id="org75d34d1"></a>

### Stream.generate(Supplier<T>)

Good with stateful suppliers.


<a id="orgaace92d"></a>

### Stream.iterate(T seed, UnaryOperator<T>)

"seed" - the first value of the stream
The operator takes the first element and returns second. Repeatedly.


<a id="orgf8de600"></a>

### Exercise

1.  Write a stream that will produce Fibonacci numbers

    Return nth Fibonacci number.


<a id="org19d0466"></a>

# Date and Time API (java.time)

They are immutable, thread-safe and cacheable.


<a id="org4bd53f0"></a>

## Intro

Before Java 8 there was java.util.Date and java.util.Calendar.

    Date now = new Date();
    
    Calendar cal = Calendar.getInstance(); // now
    cal.set(2017, 1, 18); // 18th of February
    Date date = cal.getTime();


<a id="orga1bccc1"></a>

## Date and Time representations


<a id="org18f2372"></a>

### Instant - a point in time

It is a point on a time line with nanosecond precision.

Instant is immutable as many other classes in java.time.

    Instant.MIN;    // bilion years ago
    Instant 0       // beginning of the Epoch
    Instant.now();  // it's now!
    Instant.MAX;    // in bilion years


<a id="orgaf9e558"></a>

### LocalDate - day precision

Represents objects without time - e.g. event from the past.

    LocalDate today = LocalDate.now();
    LocalDate battle = LocalDate.of(1410, Month.July, 15);


<a id="org1614a08"></a>

### LocalTime

Represents a time of day and comes with a bunch of methods to manipulate
time.

    LocalTime now = LocalTime.now();
    LocalTime workshopStarts = LocalTime.of(9, 30); // 9:30 AM
    
    LocalTime night = LocalTime.of(23, 30).plusHours(2); // 1:30 AM


<a id="org00660c5"></a>

### LocalDateTime - both in one object


<a id="orge025213"></a>

### ZonedTime, ZonedDateTime

DateTime with zone information - date and time expressed for selected time
zone.

    ZoneDateTime.of(y, m, d, h, m, s, ZoneId);


<a id="orgefb3559"></a>

## Length of time


<a id="org434dac4"></a>

### Duration

It's the duration between two Instant objects.

    Instant beginning = Instant.EPOCH;
    Instant end = Instant.now();
    Duration length = Duration.between(beginning, end);
    length.toMillis();


<a id="orga4d6481"></a>

### Period

Amount of time between two LocalDates.
Similar to Duration, but with date granularity whereas Duration has
nanosecond.

    public static int daysAgo(LocalDate pastDate) {
        return Period.between(LocalDate.now(), pastDate).getDays();
    }

Gotcha: period.get(ChronoUnit) returns parts of period split according to
used ChonoUnit.


<a id="org2682675"></a>

## TemporalAdjusters

They allow to add/substract an amount of time to Instant/LocalDate.

It has a bunch of static methods that create immutable instances of
TemporalAdjuster:

-   finding the first or last day of the month
-   finding the first day of next month
-   finding the first or last day of the year
-   finding the first day of next year
-   finding the first or last day-of-week within a month, such as "first
    Wednesday in June"
-   finding the next or previous day-of-week, such as "next Thursday"

Usage:

    Temporal t = adjuster.adjustInto(t);
    Temporal t = t.with(adjuster);


<a id="org86706ab"></a>

## Date formatters

java.time.format.DateTimeFormatter is for formatting java.time dates.
It ships a bunch of predefined formatters.


<a id="orge217374"></a>

### Exercise

1.  Format date using new DateFormatter and given locale

        package java8.time;
        
        import java.time.Instant;
        import java.time.ZoneId;
        import java.time.format.DateTimeFormatter;
        import java.util.Locale;
        
        import static java.time.format.FormatStyle.LONG;
        
        public class DateUtil {
        
            public static String reformatDate(Instant time, Locale locale) {
                DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(LONG, LONG)
                        .withLocale(locale)
                        .withZone(ZoneId.systemDefault());
        
                return formatter.format(time);
            }
        }


<a id="org619a00e"></a>

## Conversion between new and old APIs

    Date date = new Date();
    Instant instant = date.toInstant();
    LocalDate localDate = date.toLacalDate();
    
    date = Date.from(instant);
    date = Date.from(localDate);

    Time time = Time.from(localTime);
    LocalTime localTime = time.toLocalTime();


<a id="org28d2bad"></a>

## Clock

For testing - SystemClock and FixedClock.


<a id="org71e56c6"></a>

## Exercises


<a id="org97ba58e"></a>

### How many days have past since given day


<a id="org5d94221"></a>

### Find previous year day closest to the given date that has the same day of week

For example for date: 2017-03-31 (Friday)
Last year date: 2016-04-01 (Friday)

     public static LocalDate lastYearSameDay(LocalDate currentDate) {
         return currentDate
                 .minusYears(1)
                 .with(TemporalAdjusters.nextOrSame(currentDate.getDayOfWeek()));
     }
    
    @Test
    public void lastYearLogicalDate() {
        //Current date: 2017-03-31 (Friday)
        //Last year date: 2016-04-01 (Friday)
    
        LocalDate date = LocalDate.of(2017, Month.MARCH, 31);
        LocalDate expected = LocalDate.of(2016, Month.APRIL, 1);
    
        assertEquals(expected, DateUtil.lastYearSameDay(date));
    }


<a id="orge4463cd"></a>

# Other things


<a id="orgce8e119"></a>

## Concurrency


<a id="orge38caef"></a>

### Atomic values


<a id="org0c69d75"></a>

### Parallel array operations


<a id="orge2b6f80"></a>

### Completable futures


<a id="orgc71e09c"></a>

## JavaScript engine - Nashorn


<a id="orgf69c1fe"></a>

## Base64


<a id="org3a772fb"></a>

## Methods in Strings, Numbers, etc.


<a id="orgde1b97a"></a>

## G1


<a id="org0477260"></a>

## String deduplication


<a id="org14c43f7"></a>

## JavaFX


<a id="orgcf11e91"></a>

## Annotations


<a id="orge62018b"></a>

### Repeatable annotations

    @Repeatable(Filterables.class)
    @interface Filterable {
        int value();
    }
    
    // wrapping annotation
    @interface Filterables {
        Filterable[] value();
    }


<a id="org89e414e"></a>

### Annotations on types

-   declarations
-   with parameters
-   with return values
-   with generic parameters


<a id="orge2f137f"></a>

# Other resources


<a id="org1488f32"></a>

## Functional thinking

-   [4clojure](http://4clojure.com): a lot of functional exercises taking you from zero to hero

