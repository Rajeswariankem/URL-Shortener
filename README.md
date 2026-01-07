# URL Shortener – Java Console Application

## 📌 Project Description
A Java-based URL Shortener application that converts long URLs into short URLs
and retrieves the original URLs efficiently. The project uses HashMap for
constant-time lookups and includes input validation, duplicate handling, and
a menu-driven console interface.

This project demonstrates strong fundamentals in Data Structures, Java, and
problem-solving, making it suitable for SDE internship roles.

---

## ✨ Features
- Shortens long URLs into compact short URLs
- Retrieves original URLs from short URLs
- Handles duplicate URLs by returning the same short URL
- Validates input URLs using Java’s built-in URL class
- Menu-driven console interface
- Handles empty, invalid, and incorrect inputs gracefully

---

## 🛠 Technologies Used
- Java
- HashMap
- Java Collections Framework
- Object-Oriented Programming (OOP)
- java.net.URL

---

## ⚙️ How It Works
1. User selects an option from the menu.
2. For URL shortening:
   - The input URL is validated.
   - A unique 6-character alphanumeric code is generated.
   - The short URL is stored using HashMap.
3. For retrieving original URL:
   - The short URL is validated.
   - The original URL is fetched using the short code.
4. All operations run in constant time on average.

---

## 📦 Data Structures Used
- **HashMap**
  - `shortCode → original URL`
  - `original URL → shortCode`

---

## ⏱ Time & Space Complexity
- **Shorten URL:** O(1) average time
- **Retrieve Original URL:** O(1) average time
- **Space Complexity:** O(n), where n is the number of stored URLs

---

## 🧪 Sample Output

```
***** MENU *****
1. Shorten URL
2. Get Original URL
3. Exit
Enter your choice :
1
Enter the URL to shorten :
https://www.google.com
Short URL : http://short.ly/DMni3a

***** MENU *****
1. Shorten URL
2. Get Original URL
3. Exit
Enter your choice :
2
Enter short URL :
http://short.ly/DMni3a
Original URL : https://www.google.com

***** MENU *****
1. Shorten URL
2. Get Original URL
3. Exit
Enter your choice :
3
Thank you for using URL Shortener!

```

---

## ▶️ How to Run
1. Clone the repository:git clone <repository-url>
2. Compile the Java files:javac Main.java
3. Run the application:java Main
4.  Use the menu to shorten and retrieve URLs.

---

## 📘 Key Learnings
- Understood how HashMap enables O(1) average-time lookups for fast data retrieval
- Learned the importance of bidirectional mapping for efficient reverse lookups
- Gained hands-on experience in handling duplicate data without redundancy
- Implemented input validation to handle invalid, empty, and incorrect user inputs
- Used Java’s built-in URL class to validate real-world URL formats
- Improved understanding of clean code practices and meaningful code documentation
- Built a menu-driven console application using Java control flow constructs

---

## 🌍 Real-World Use Cases
- URL shortening services (e.g., link sharing platforms)
- Tracking and managing shortened links in marketing campaigns
- Reducing long URLs for social media and messaging platforms
- Backend services requiring fast lookup and redirection mechanisms
- Learning foundation for designing scalable web services


