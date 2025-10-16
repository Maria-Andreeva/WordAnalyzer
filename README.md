# 📝 WordAnalyzer

**🇬🇧 Description:**  
`WordAnalyzer` is a simple Java program that reads a text file, analyzes its content, and provides useful information about the words. It calculates the **total number of words**, identifies the **longest word**, and counts the **frequency of each word**.  

---

## ⚡ Features
- Reads a text file line by line
- Splits text into words
- Counts the total number of words
- Finds the longest word
- Counts the frequency of each word
- Sorts words alphabetically for better readability

---

## 🛠 Technologies
- Java 8+
- File I/O (`BufferedReader`, `FileReader`)
- Collections (`HashMap`)
- Streams API

---

## 💻 Example Usage

Suppose `input.txt` contains:  
```hello world
java java programming world
```

Running the program:

```bash
javac WordAnalyzer.java
java WordAnalyzer
```

Output:

```Total number of words: 6
Longest word: programming
Word frequencies:
hello: 1
java: 2
programming: 1
world: 2
```

## 📂 File Structure
```WordAnalyzer/
├── src/
│   └── WordAnalyzer.java    # Main Java program
├── input.txt                # Sample input file
└── README.md                # Project documentation
```

## 🚀 How to Run

1. Clone the repository:

```git clone https://github.com/yourusername/WordAnalyzer.git
```

2. Navigate to the project folder:
```
cd WordAnalyzer/src
```

3. Compile and run the program:
```
javac WordAnalyzer.java
java WordAnalyzer
```

✨ “Analyze text, understand patterns, and make words work for you!”
