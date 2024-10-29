# Coffee Shop Decorator Pattern

This project demonstrates the **Decorator Design Pattern** through a coffee shop ordering system. In this system, a base coffee order can be enhanced dynamically with additional ingredients like milk, sugar, and whipped cream, each affecting the coffee's description and total cost.

## Table of Contents
- [Overview](#overview)
- [Design Pattern](#design-pattern)
- [Project Structure](#project-structure)
- [Classes](#classes)
- [Getting Started](#getting-started)
- [Usage Example](#usage-example)
- [Dependencies](#dependencies)
- [License](#license)

## Overview

The **Decorator Pattern** is a structural design pattern that allows behavior to be added to individual objects dynamically. This example uses a base coffee class with concrete decorators to add various ingredients. The pattern enables flexibility and modularity by allowing dynamic extension of functionality without modifying the base class.

## Design Pattern

The **Decorator Pattern** is used here to create additional features on top of a base coffee class without subclassing. This pattern is ideal when you want to enhance objects at runtime in various combinations.

## Project Structure

- `Coffee` Interface: Defines the methods for getting a description and cost of a coffee.
- `SimpleCoffee` Class: The concrete component representing a basic coffee.
- `CoffeeDecorator` Abstract Class: Wraps a `Coffee` object, allowing subclasses to add extra features.
- Concrete Decorators (e.g., `MilkDecorator`, `SugarDecorator`, `WhippedCreamDecorator`): Each decorator class adds an ingredient and cost to the base coffee.

## Classes

1. **Coffee Interface**: Declares `getDescription()` and `getCost()` methods that each coffee type must implement.
2. **SimpleCoffee (Concrete Component)**: Represents a plain coffee with a base description and cost.
3. **CoffeeDecorator (Abstract Decorator)**: Holds a reference to a `Coffee` object and implements `Coffee`, allowing for additional behavior.
4. **Concrete Decorators (e.g., MilkDecorator, SugarDecorator, WhippedCreamDecorator)**: Each decorator adds specific functionality, such as adding milk, sugar, or whipped cream to the coffee.

## Getting Started

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/UmangSonthaliya/CoffeShop_DecoratorPattern-
    cd CoffeShop_DecoratorPattern-
    ```

2. **Compile and Run**:
   - Compile the Java files:
     ```bash
     javac *.java
     ```
   - Run the main program:
     ```bash
     java CoffeeShop
     ```

## Usage Example

Here's how the Decorator Pattern works in the Coffee Shop example:

1. A `SimpleCoffee` object is created as a base coffee.
2. Additional decorators like `MilkDecorator`, `SugarDecorator`, and `WhippedCreamDecorator` are added in sequence, wrapping the base coffee.
3. Each decorator modifies the description and cost dynamically, allowing flexible combinations.

Example output:
Simple Coffee - $5.0 Simple Coffee, Milk - $6.5 Simple Coffee, Milk, Sugar - $7.0 Simple Coffee, Milk, Sugar, Whipped Cream - $8.0

