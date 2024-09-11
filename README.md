# Array Statistic Calculator
![Github license](https://img.shields.io/badge/mit-blue.svg)
 
 Licensing: [mit](https://choosealicense.com/licenses/mit/)

## Table of Contents
- [Description](#description)
- [Installation Requirements](#installation-requirements)
- [Application Usage](#application-usage)
- [License](#licensing-information)
- [Contributions](#contributions)
- [Tests Commands](#tests-commands)
- [Questions](#questions)

## Description
The Array Statistics Calculator program processes 20 numbers provided via standard input, calculates key statistics including minimum, maximum, mean, median, and mode, and displays them. The input should be redirected from a file (e.g., input.txt). The program also prints the numbers in ascending order and identifies the mode(s) of the dataset.

## Installation Requirements
Ensure you have Java Development Kit (JDK) installed on your system. You can download it from [Oracle](https://www.oracle.com/java/technologies/downloads/) or use a package manager like Homebrew for macOS or apt-get for Linux. 

- Clone or download the repository: 
```Java 
- git clone https://github.com/EMK2473/ArrayStatisticCalculator.git 
```

- Navigate to the project directory: 
```Java
- cd ArrayStatisticCalculator 
```
- Compile the ArrayStatisticCalculator.java file: 
```Java
- javac ArrayStatisticCalculator.java 
```
- Run the program: 
```Java
- java ArrayStatisticCalculator
```


## Application Usage

- Prepare an input file: 

Create a file named input.txt with exactly 20 numbers, each separated by a newline or space. 

- Run the program: 

Execute the program using input redirection from the command line. 

- View the results: 

The program will display the numbers in ascending order, followed by the minimum, maximum, mean, median, and mode of the numbers. 

Example input.txt:
```Java
4.3
4.5
9.3
10.1
17.2
4.9
9.0
9.0
10.0
11.0
3.0
4.0
93.0
4.0
0.0
12.0
13.0
14.0
15.0
16.0
```

Example output:

```Java
Ascending Order:
0.0
3.0
4.0
4.0
4.3
4.5
4.9
9.0
9.0
9.3
10.0
10.1
11.0
12.0
13.0
14.0
15.0
16.0
17.2
93.0

Minimum: 0.00
Maximum: 93.00
Mean: 13.17
Median: 9.65
Mode: 4.0 9.0 
```

## Contributions
Eric Keeton

## Test Commands
Test the program with various sets of 20 numbers in the input.txt file to ensure correct calculation of statistics.

## Questions
For Questions, contact me at emk2473@gmail.com or visit My Github: [EMK2473](https://github.com/EMK2473)