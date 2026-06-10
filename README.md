# Banking System in Java

A console-based Banking System built in Java to demonstrate Object-Oriented Programming (OOP) concepts and Exception Handling. The application allows users to create an account, perform banking transactions, and handle invalid operations using custom exceptions.

## Features

* Create a bank account
* Deposit money
* Withdraw money
* View account details
* Validate transaction amounts
* Handle insufficient balance scenarios
* Menu-driven user interface

## OOP Concepts Used

* Classes and Objects
* Constructors
* Encapsulation
* Access Modifiers
* Method Design
* Immutable Fields (`final`)
* Object Interaction

## Exception Handling Concepts Used

* `try`
* `catch`
* `finally`
* `throw`
* `throws`
* Custom Exceptions

## Project Structure

```text
BankingSystem/
│
├── src/
│   ├── Main.java
│   ├── Account.java
│   ├── InvalidAmountException.java
│   └── InsufficientBalanceException.java
│
├── README.md
└── .gitignore
```

## Custom Exceptions

### InvalidAmountException

Thrown when:

* Deposit amount is less than or equal to zero
* Withdrawal amount is less than or equal to zero
* Initial account balance is negative

### InsufficientBalanceException

Thrown when:

* Withdrawal amount exceeds the available account balance

## Sample Menu

```text
=== BANK MENU ===

1. Deposit
2. Withdraw
3. Show Details
4. Exit
```

## Technologies Used

* Java
* IntelliJ IDEA
* Git
* GitHub

## Learning Outcomes

This project was built to strengthen understanding of:

* Object-Oriented Programming
* Exception Handling
* Custom Exceptions
* Input Validation
* Menu-Driven Applications
* Clean Code Practices

## Author

Lakshman Karthik
