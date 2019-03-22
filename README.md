# CSCI-202, Introduction to Programming

## Overview

This repository contains all examples and assignments for [CSCI 202, Introduction to Computer Science II](http://www.citadel.edu/root/ccs-courses/372-academics/schools/ssm/cyber-and-computer-sciences/21149-csi-202-introduction-to-computer-science-ii) offered at The Citadel. 
The course was taught MWF 8-8:50 AM in Fall of 2019.

This code is a compilation of the [Introduction to Java Programming, Comprehensive Version (10th Edition), Y. Daniel Liang, Pearson, 2013](https://www.amazon.com/Introduction-Java-Programming-Comprehensive-Version-ebook/dp/B00HNZ4K1U/ref=sr_1_fkmr0_2?keywords=Introduction+to+Java+Programming%2C+Comprehensive+Version+%2810th+Edition%29%2C+Y.+Daniel+Liang%2C+Pearson%2C+2013&qid=1553277439&s=gateway&sr=8-2-fkmr0) and 
some of my own code to help with illustrations and coding examples. Any questions can be directed to me directly at [ravanj1@citadel.edu](mailto:ravanj1@citadel.edu)

Cloning this repository will give you a clean slate of all the examples from the `master` branch.

This repository is used in conjunction with [Github Classrooms](https://classroom.github.com/) so that students have their own private cloned repository and can work their own solutions. They will work their own solutions,
push their responses to their repositories, and then the instructor can then grade the solution within GitHub.

## Usage

This repository has all coding examples and base classes for CSCI 202. Use this repository as a base for creating Github Classrooms ([classroom.github.com](https://classroom.github.com/)).

## Environment Setup

1.) Install maven 3.6.0 and Java JDK 11. JDK located [here](https://openjdk.java.net/install/).

```bash
brew install maven
```

2.) Clone down the repository from GitLab

```bash
git clone git@git.github.com:CitadelCS/csci-202.git
```

3.) Build the project

```bash
mvn clean install
```

You should see a success if everything is set up correctly.

5.) Run the sample you wish by running each file with a main method

## Assignments

Within the folder `assignments` there is a subfolder for each assignment with a `README.md` with the assignment instructions. Students are to read the document and complete the assignment by
submitting their code within their private repository for the submitter and the instructor to see.

Happy coding!
