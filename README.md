# RPSGame

The solution of the task was done in Spring Boot, Grade and Java.

Players are modeled with 3 files:
Player.java - which is an abstract class and the superclass of all players and the concrete classes:
PaperPlayer.java - a player that always plays a Paper move and 
RandomPlayer.java - a player that always returns a random move.

Moves that can be played as well as possible outcomes they are done in a special Enum file - Enum.java.
On that way, the logic of the game which move beats is kept in one place (the definition of Move), making it easy to replace the rules with the next one.

Result.java is an Enum encapsulating the results of one move which also holds the strings needed for generating the output

RSPGame.java is the start file of the entire program.

The number of games is separated into a special static variable NUMBER_OF_GAMES so it can be easily changed.

At the beginning of the game, both players and results are initialized.

Then comes the game itself. 
The game consists of playing one round of the game with a pre-defined number of rounds.
At the end of the game, the results will be printed.

Test
There are test cases in the RSPGAmeTest.java file.  Each expected outcome is defined by one test case and two test cases for unexpected outcomes.
