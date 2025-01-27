Rail Fence Encryption App

Description

The Rail Fence Encryption App is a simple Android application that implements the Rail Fence cipher for encrypting text. Users can input plain text, select a key depth (from 1 to 12) using a dropdown, and view the encrypted text instantly. This app serves as a practical demonstration of classical cryptography and can be useful for educational purposes.

Features

User Input: Allows users to input the text to be encrypted.

Key Depth Selection: Enables users to select a key depth (1-12) via a dropdown menu.

Encryption: Applies the Rail Fence cipher algorithm based on the selected key depth.

Result Display: Displays the encrypted output directly on the screen.

How It Works

The Rail Fence cipher is a classical encryption technique where characters are written in a zigzag pattern across multiple rows, based on the key depth, and then concatenated row by row to form the ciphertext.

Algorithm Steps:

Create a grid with key_depth rows and text_length columns.

Write the text in a zigzag pattern (downward and upward motion).

Concatenate the characters row by row to produce the encrypted text.

Example:

For input text HELLOWORLD and key depth 3:

H   O   L
E L W R D
L   O

Encrypted text: HOL ELWRD LO

Tools and Technologies

Programming Language: Java

Android Framework: Android SDK

UI Components:

TextInputEditText for user input.

Spinner for key depth selection.

MaterialButton for triggering encryption.

TextView for displaying results.

Build Tool: Gradle

File Structure

Java File

MainActivity.java

Contains the logic for handling user input, performing encryption, and updating the UI.

Includes the Rail Fence cipher implementation in the encryptRailFence method.

XML Layout

activity_main.xml

Defines the app's UI, including the input field, dropdown menu, button, and result display.

How to Run

Clone the repository to your local machine.

Open the project in Android Studio.

Sync the Gradle files.

Build and run the app on an emulator or physical device.

Future Enhancements

Add decryption functionality to reverse the cipher.

Include additional classical encryption algorithms.

Improve UI/UX with animations and error handling.

License

This project is licensed under the MIT License.
