# tea-algorithm
-a program implementing TEA Encryption and Decryption 

🍵 Tiny Encryption Algorithm (TEA) in Java ✨<br>

This project demonstrates how symmetric key encryption works using bitwise operations and 32 rounds of secure mixing.<br>
🌿 What’s Inside?<br>
This repository contains:<br>
🔐 TEA Encryption<br>
🔓 TEA Decryption<br>
🧠 Bitwise operations (<<, >>, ^, +, -)<br>
🔁 32 Feistel rounds for secure data transformation<br>
🧪 A simple main method to test everything<br>

🫖 How It Works: <br>
TEA is a block cipher that:<br>
Encrypts data in 64-bit blocks (split into two 32-bit halves)<br>
Uses a 128-bit key (4 integers)<br>
Runs through 32 rounds of mixing using:<br>
XOR operations<br>
Bit shifting<br>
A special constant called delta (0x9e3779b9)<br>
Each round:<br>
Mixes the left and right halves<br>
Updates a running sum<br>
Combines shifts and XORs for diffusion<br>

🔐 Encryption Method<br>
public static void teaencryption(int [] plaintext,int [] key)<br>
✨ Steps:<br>
Split plaintext into two halves<br>
Loop 32 times<br>
Apply bit shifts + XOR + addition<br>
Store encrypted values back into the array<br>

🔓 Decryption Method<br>
public static void teadecryption(int [] ciphertext,int [] key)<br>
✨ Steps:<br>
Start with encrypted halves<br>
Initialize sum to delta << 5<br>
Reverse the encryption process<br>
Subtract instead of add<br>
Recover the original plaintext<br>

🌸 Example Output<br>

Before encryption:<br>
01ca45670c4bcdef<br>
After encryption:<br>
3c265fc3f6cf4846<br>
After decryption:<br>
01ca45670c4bcdef<br>

💡 Key Features<br>
-Clean structure<br>
-Simple array-based block handling<br>
-Symmetric encryption/decryption<br>
- Great for learning how block ciphers work internally<br>
  
🌼 Future Improvements<br>
- implementing CBC mode<br>
- Accept dynamic user input<br>
- Convert strings to hex automatically<br>
- Improve input validation<br>

  
📚 About TEA<br>
The Tiny Encryption Algorithm was designed to be:<br>
Small <br>
Fast <br>
Easy to implement <br>
It’s perfect for learning how Feistel-based encryption works!<br>

💛 Why This Project?<br>
Practice cryptography fundamentals<br>
Understand bitwise operations deeply<br>
Explore how symmetric encryption functions internally<br>
✨ Simple. Tiny. Powerful.<br>
Happy encrypting! 🍵🔐
