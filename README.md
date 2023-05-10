File Details Analyser
This is a Java program that reads a text file and analyzes the contents to find various details such as vowel count, digit count, top and least repeated words and characters.

Usage
Compile the program using the command javac FileDetailsAnalyser.java
Run the program using the command java FileDetailsAnalyser <filename>
(Replace <filename> with the name of the file you want to analyze)
The program will display the results on the console.
Functions
The program has six functions that implement the required functionality.

countVowels(String fileContent) - This function takes in the contents of the file as a String and returns a Map containing the vowel count.

countDigits(String fileContent) - This function takes in the contents of the file as a String and returns a Map containing the digit count.

topWords(String fileContent, int count) - This function takes in the contents of the file as a String and the number of top words to be returned and returns a Map containing the top words and their count.

leastWords(String fileContent, int count) - This function takes in the contents of the file as a String and the number of least words to be returned and returns a Map containing the least words and their count.

topChars(String fileContent, int count) - This function takes in the contents of the file as a String and the number of top characters to be returned and returns a Map containing the top characters and their count.

leastChars(String fileContent, int count) - This function takes in the contents of the file as a String and the number of least characters to be returned and returns a Map containing the least characters and their count.

Limitations
The program only works with text files.
The program assumes that each word is separated by a space character.
The program does not handle punctuation marks or special characters in words.
 
