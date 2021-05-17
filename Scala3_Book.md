# SCALA 3 — BOOK

https://docs.scala-lang.org/scala3/book/scala-features.html


## Scala 3 Features

### High-level features

high-level programming language

concise, readable syntax

statically-typed (but feels dynamic)

an expressive type system

pure functional programming (FP) language

pure object-oriented programming (OOP) language

supports the fusion of FP and OOP

Contextual abstractions provide a clear way to implement term inference

runs on the JVM (and in the browser)

interacts seamlessly with Java code

used for server-side applications (including microservices), big data applications, and can also be used in the browser with Scala.js

#### A high-level language


#### A dynamic feel

#### Concise syntax


#### Expressive type system

Type inference

Generic classes

Variance annotations

Upper and lower type bounds

Polymorphic methods

Intersection types

Union types

Type lambdas

given instances and using clauses

Extension methods

Type classes

Multiversal equality

Opaque type aliases

Open classes

Match types

Dependent function types

Polymorphic function types

Context bounds

Context functions

Inner classes and abstract type members as object members


#### A pure FP language

Functions are variables

Higher-order functions

Lambdas are built in

Everything in Scala is an expression that returns a value

easy to use immutable variables, and their use is encouraged

immutable collection classes in the standard library

collection classes come with dozens of functional methods: they don’t mutate the collection, but instead return an updated copy of the data

#### A pure OOP language

all types inherit from a top-level class Any, whose immediate children are AnyVal (value types, such as Int and Boolean) and AnyRef (reference types, as in Java)

#### Supports FP/OOP fusion

    Functions for the logic

    Objects for the modularity


### Lower-level language features

create algebraic data types (ADTs) more concisely with enums

more concise and readable syntax

    The “quiet” control structure syntax

    Optional braces

    The new keyword is generally no longer needed when creating class instances

    The formality of package objects have been dropped in favor of simpler “top level” definitions

A grammar that’s more clear

    Multiple different uses of the implicit keyword have been removed

    those uses are replaced by more obvious keywords like given, using, and extension

    Extension methods replace implicit classes

    The addition of the open modifier for classes makes the developer intentionally declare that a class is open for modification,

    Multiversal equality rules out nonsensical comparisons with == and !=

    Macros are implemented much more easily

    Union and intersection offer a flexible way to model types

    Trait parameters replace and simplify early initializers

    Opaque type aliases replace most uses of value classes

    Export clauses provide a simple and general way to express aggregation

    The procedure syntax has been dropped

    The @infix annotation makes it obvious how you want a method to be applied

    The @targetName method annotation defines an alternate name for the method


### Scala ecosystem

#### Web development

    The Play Framework followed the Ruby on Rails model

    Scalatra is a tiny, high-performance, async web framework, inspired by Sinatra

    Finatra is Scala services built on TwitterServer and Finagle

    Scala.js is a strongly-typed replacement for JavaScript

    ScalaJs-React lifts Facebook’s React library into Scala.js

    Lagom is a microservices framework

HTTP(S) libraries:

Akka-http

Finch

Http4s

Sttp

JSON libraries:

Argonaut

Circe

Json4s

Play-JSON

#### Big data

Apache Spark

Apache Flink

#### AI, machine learning

#### FP & FRP

#### Build tools

## A Taste of Scala

Hello, World!

The REPL

### Variables and Data Types

### Two types of variables

### Control Structures

### Domain Modeling

### Methods

### First-Class Functions

### Objects

### Collections

### Contextual Abstractions

### Toplevel Definitions



## Control Structures

Scala has the control structures you expect to find in a programming language, including:

if/then/else

for loops

while loops

try/catch/finally

## Domain Modeling

Scala 3 provides many different constructs so we can model the world around us:

Classes

Objects

Companion objects

Traits

Abstract classes

Enums

Case classes

Case objects

### Tools

#### Classes

Fields and methods

Default parameter values

Auxiliary constructors

#### Objects

#### Companion objects


#### Traits

#### Abstract classes

#### Enums

#### Case classes

#### Case objects

### OOP Modeling

Scala provides all the necessary tools for object-oriented design:

Traits let you specify (abstract) interfaces, as well as concrete implementations.

Mixin Composition gives you the tools to compose components from smaller parts.

Classes can implement the interfaces specified by traits.

Instances of classes can have their own private state.

Subtyping lets you use an instance of one class where an instance of a superclass is expected.

Access modifiers lets you control which members of a class can be accessed by which part of the code.


#### Traits

#### Mixin Composition

#### Classes

#### Instances and Private Mutable State

#### Advanced Example: Service Oriented Design

### FP Modeling

#### Modeling the Data

#### Modeling the Operations

#### How to Organize Functionality

#### Modules

Functional Objects

Extension Methods

## Methods

### Method Features

### main Methods


## Functions

### ANONYMOUS FUNCTIONS

```scala
val ints = List(1, 2, 3)
val doubledInts = ints.map(_ * 2)   // List(2, 4, 6)
```

```_ * 2 ``` is a short form

#### Longer forms

```scala
val doubledInts = ints.map((i: Int) => i * 2)
val doubledInts = ints.map((i) => i * 2)
val doubledInts = ints.map(i => i * 2)
val doubledInts = ints.map(_ * 2)
```

#### Shortening anonymous functions
```scala
ints.foreach((i:Int) => println(i))
ints.foreach(i => println(i))
ints.foreach(println(_))
ints.foreach(println)
```

### Function Variables

```scala
val double = (i: Int) => i * 2
```

Invoking the function


### ETA EXPANSION

#### The differences between methods and functions

Historically, methods have been a part of the definition of a class, although in Scala 3 you can now have methods outside of classes.

Unlike methods, functions are complete objects themselves, making them first-class entities.

```scala
def isEvenMethod(i: Int) = i % 2 == 0         // a method
val isEvenFunction = (i: Int) => i % 2 == 0   // a function
```
> Eta Expansion
> 
> https://dotty.epfl.ch/docs/reference/changed-features/eta-expansion.html


### HIGHER-ORDER FUNCTIONS

From consumer to creator

Understanding filter’s Scaladoc

Writing methods that take function parameters

The general syntax for defining function input parameters

Taking a function parameter along with other parameters


### Write Your Own map Method

### Creating a Method That Returns a Function


## Packaging and Imports

### Creating a package

Curly brace packaging style

### Import statements, Part 1

### Importing given instances

## Scala Collections

## Functional Programming

### What is Functional Programming?

### Immutable Values

### Pure Functions

### Functions Are Values

### Functional Error Handling

in Predef

```scala
def ??? : Nothing = throw new NotImplementedError
```

## Types and the Type System

### Inferred Types

### Generics

### Intersection Types

### Union Types

### Algebraic Data Types

### Variance

### Opaque Types

### Structural Types

### Dependent Function Types

### Other Types


## Contextual Abstractions

### Given Instances and Using Clauses

### Type Classes

### Context Bounds

### Given Imports

### Extension Methods

### Implementing Type Classes

### Multiversal Equality

### Implicit Conversions

## Concurrency