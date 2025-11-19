# Data-Structures-Project-Task-Management-System-and-Algorithm-Implementation
# Overview

This project is a comprehensive implementation of various fundamental Data Structures and Algorithms using Java. It is divided into three main components: a Task Management System that utilizes Linked Lists, Stacks, and Queues; an implementation of Shortest Path Algorithms (Dijkstra's and Bellman-Ford); and a Sorting Algorithm Comparison (Merge Sort and Enhanced Selection Sort).

The project serves as a practical demonstration of Abstract Data Types (ADTs), encapsulation, and the performance analysis of different algorithms.

Project Components

The project is structured into three distinct packages, each focusing on a different aspect of data structures and algorithms.

1. Task Management System (app/)

This is a console-based application for managing tasks, categories, and priorities.

| Data Structure | Purpose | Implementation Details |
| :--- | :--- | :--- |
| **Linked List (`TaskList`)** | Stores all tasks, ordered by due date. | Implemented using `Node` objects. |
| **Stack (`TaskStack`)** | Manages **urgent tasks** (LIFO - Last In, First Out). | Implemented using a linked list of `StackNode` objects. |
| **Queue (`TaskQueue`)** | Stores **completed tasks** (FIFO - First In, First Out). | Implemented using a linked list of `QueueNode` objects. |
| **Linked List (`CategoryList`)** | Manages different task categories. | Implemented using a linked list of `CategoryNode` objects, where each category holds its own `TaskList`. |
