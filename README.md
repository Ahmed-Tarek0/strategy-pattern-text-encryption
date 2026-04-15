# 🔐 Strategy Pattern Text Encryption

## 📌 Overview
This project demonstrates the use of the **Strategy Design Pattern** in Java to perform text encryption and decryption.

The system allows switching between different algorithms (strategies) at runtime without modifying the core logic.

---

## ⚙️ How It Works
A simple Caesar Cipher approach is used:
- Encryption ➝ shift each character by +3
- Decryption ➝ shift each character by -3

---

## 🧠 Design Pattern Used
### Strategy Pattern

The Strategy Pattern allows:
- Changing behavior at runtime
- Encapsulating algorithms in separate classes
- Making the system extensible and maintainable

---

## 📂 Project Structure

- `Strategy` → Interface defining the operation  
- `EncryptStrategy` → Handles encryption  
- `DecryptStrategy` → Handles decryption  
- `Context` → Uses the selected strategy  
- `Main` → Entry point of the program  

---

## 🚀 How to Run

1. Open the project in any Java IDE (IntelliJ, Eclipse, VS Code)
2. Run:
