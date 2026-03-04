# tea-algorithm
-a program implementing TEA Encryption and Decryption 

🍵 Tiny Encryption Algorithm (TEA) in Java ✨

This project demonstrates how symmetric key encryption works using bitwise operations and 32 rounds of secure mixing.
🌿 What’s Inside?
This repository contains:
🔐 TEA Encryption
🔓 TEA Decryption
🧠 Bitwise operations (<<, >>, ^, +, -)
🔁 32 Feistel rounds for secure data transformation
🧪 A simple main method to test everything

🫖 How It Works: 
TEA is a block cipher that:
Encrypts data in 64-bit blocks (split into two 32-bit halves)
Uses a 128-bit key (4 integers)
Runs through 32 rounds of mixing using:
XOR operations
Bit shifting
A special constant called delta (0x9e3779b9)
Each round:
Mixes the left and right halves
Updates a running sum
Combines shifts and XORs for diffusion

🔐 Encryption Method
public static void teaencryption(int [] plaintext,int [] key)
✨ Steps:
Split plaintext into two halves
Loop 32 times
Apply bit shifts + XOR + addition
Store encrypted values back into the array

🔓 Decryption Method
public static void teadecryption(int [] ciphertext,int [] key)
✨ Steps:
Start with encrypted halves
Initialize sum to delta << 5
Reverse the encryption process
Subtract instead of add
Recover the original plaintext

🌸 Example Output
Before encryption:
01ca45670c4bcdef
After encryption:
3c265fc3f6cf4846
After decryption:
01ca45670c4bcdef

💡 Key Features
-Clean structure
-Simple array-based block handling
-Symmetric encryption/decryption
- Great for learning how block ciphers work internally
  
🌼 Future Improvements
- implementing CBC mode
- Accept dynamic user input
- Convert strings to hex automatically
- Improve input validation

  
📚 About TEA
The Tiny Encryption Algorithm was designed to be:
Small 
Fast 
Easy to implement 
It’s perfect for learning how Feistel-based encryption works!

💛 Why This Project?
Practice cryptography fundamentals
Understand bitwise operations deeply
Explore how symmetric encryption functions internally
✨ Simple. Tiny. Powerful.
Happy encrypting! 🍵🔐
