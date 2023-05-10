Menu-Driven Program to Manage Names
This is a Java program that allows the user to enter, search for, remove, and display names using a menu-driven interface. The program uses a do-while loop and switch-case statements to display the menu options and perform the corresponding actions.

Menu Options
The program offers the following menu options:

Enter a name: Allows the user to enter a new name into the array, as long as the name is not already present in the array and it is a valid name.
Search for a name: Allows the user to search for a name in the array.
Remove a name: Allows the user to remove a name from the array, without creating empty spaces.
Show all names: Displays all the names present in the array.
Constraints
The program has the following constraints:

The array has a maximum length of 1024.
The names in the array must be unique.
Validations are provided to ensure that the user enters only valid names that are not going to be repeated.
Removing a name does not create empty spaces inside the array.
Functionality
The program has three functions apart from the main function:

addName: This function takes a name as input and adds it to the array if it is a valid name and is not already present in the array.
searchName: This function takes a name as input and searches for it in the array. It returns the index of the name if found, or -1 otherwise.
removeName: This function takes a name as input and removes it from the array without creating empty spaces.
Usage
To use the program, run the Main class. The program will display a menu with the available options. Select the option you want to perform by entering the corresponding number.

If you choose to add a name, you will be prompted to enter the name. If the name is valid and not already present in the array, it will be added.

If you choose to search for a name, you will be prompted to enter the name. The program will display the index of the name if found, or a message indicating that the name was not found.

If you choose to remove a name, you will be prompted to enter the name. The program will remove the name if present, without creating empty spaces.

If you choose to show all names, the program will display all the names present in the array.

Format
The program outputs are properly formatted to ensure that the information is displayed in an easy-to-read manner. This includes spacing and alignment to ensure that information is clearly presented.
