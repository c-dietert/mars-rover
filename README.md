# The Mars Rover

## The situation
A squad of robotic rovers are to be landed by NASA on a plateau on Mars.

This plateau, which is curiously rectangular, must be navigated by the rovers so that their onboard cameras can get a complete view of the surrounding terrain to send back to Earth.

## Your Task
Your task is to develop an API that moves the rovers around on the plateau.

In this API a rover has state consisting of two parts:
* its position on a grid (represented by an **X,Y** coordinate pair)
* the compass direction it's facing (represented by a letter, one of **N, S, E, W**)

### Input
The input to the program is a string of one-character move commands:

* L and R rotate the direction the rover is facing
* M moves the rover one grid square forward in the direction it is currently facing

### Output
The program's output is the final position of the rover after all the move commands have been executed. The position is represented as a coordinate pair and a direction, joined by colons to form a string. For example: a rover whose position is 2:3:W is at square (2,3), facing west.

### Examples
* input "" gives output 0:0:N
* input MMRMMLM gives output 2:3:N
