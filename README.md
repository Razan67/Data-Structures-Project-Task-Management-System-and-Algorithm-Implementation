# Data-Structures-Project-Task-Management-System-and-Algorithm-Implementation
# Overview

This project is a comprehensive implementation of various fundamental Data Structures and Algorithms using Java. It is divided into three main components: a Task Management System that utilizes Linked Lists, Stacks, and Queues; an implementation of Shortest Path Algorithms (Dijkstra's and Bellman-Ford); and a Sorting Algorithm Comparison (Merge Sort and Enhanced Selection Sort).

The project serves as a practical demonstration of Abstract Data Types (ADTs), encapsulation, and the performance analysis of different algorithms.

Project Components

The project is structured into three distinct packages, each focusing on a different aspect of data structures and algorithms.

# 1. Task Management System (`app/`)

This is a console-based application for managing tasks, categories, and priorities.

| Data Structure | Purpose | Implementation Details |
| :--- | :--- | :--- |
| **Linked List (`TaskList`)** | Stores all tasks, ordered by due date. | Implemented using `Node` objects. |
| **Stack (`TaskStack`)** | Manages **urgent tasks** (LIFO - Last In, First Out). | Implemented using a linked list of `StackNode` objects. |
| **Queue (`TaskQueue`)** | Stores **completed tasks** (FIFO - First In, First Out). | Implemented using a linked list of `QueueNode` objects. |
| **Linked List (`CategoryList`)** | Manages different task categories. | Implemented using a linked list of `CategoryNode` objects, where each category holds its own `TaskList`. |

Key Classes: `Main.java`, `TaskManager.java`, `Task.java`, `Category.java`, and the respective data structure classes.

# 2. Shortest Path Algorithms (`shortestPath/`)

This component demonstrates graph theory algorithms for finding the shortest path between nodes.
| Algorithm | Purpose | Implementation Details |
| :--- | :--- | :--- |
| **Dijkstra's Algorithm** | Finds the shortest paths from a single source node to all other nodes in a graph with non-negative edge weights. | Implemented in `DijkstraAlgorithm.java`. |
| **Bellman-Ford Algorithm** | Finds the shortest paths from a single source node to all other nodes, capable of handling graphs with negative edge weights. | Implemented in `Graph.java`. |

Key Classes: `Main.java`, `Graph.java`, `DijkstraAlgorithm.java`.

# 3. Sorting Algorithm Comparison (`sorting/`)

This component compares the performance of two sorting algorithms on arrays of different sizes and initial states (sorted, random, reversed).

| Algorithm | Purpose | Implementation Details |
| :--- | :--- | :--- |
| **Merge Sort** | A stable, efficient, comparison-based, divide-and-conquer sorting algorithm. | Implemented in `Merge.java` and timed in `SortComparison.java`. |
| **Enhanced Selection Sort** | A variation of the standard Selection Sort. | Implemented and timed in `SortComparison.java`. |

Key Classes: `SortComparison.java`, `Merge.java`

Technology Stack

•
Language: Java

•
Environment: Standard Java Development Kit (JDK)

Setup and Execution

Prerequisites

•
Java Development Kit (JDK) 8 or higher installed on your system.

Compilation and Running

The project is organized into packages (`app`, `shortestPath`, `sorting`). You will need to compile and run the main classes from the root directory of the project (`Final application`).

```
Final application/
├── app/
│   ├── Main.java           # Main entry point for the Task Management System
│   ├── TaskManager.java    # Manages the overall system logic
│   ├── Task.java           # Task object definition
│   ├── TaskList.java       # Linked List implementation for tasks
│   ├── TaskStack.java      # Stack implementation for urgent tasks
│   ├── TaskQueue.java      # Queue implementation for completed tasks
│   └── ... (other support classes: Node, Category, etc.)
├── shortestPath/
│   ├── Main.java           # Main entry point for the Shortest Path demo
│   ├── Graph.java          # Bellman-Ford implementation and graph structure
│   └── DijkstraAlgorithm.java # Dijkstra's Algorithm implementation
└── sorting/
    ├── SortComparison.java # Main class for comparing sorting algorithms
    └── Merge.java          # Implementation of Merge Sort
