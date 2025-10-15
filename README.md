# 🎓 StudentRegistry

**Theme:** Collections & Data Structures  
**Language:** Java 21

StudentRegistry is a simple Java console application that demonstrates the use of Java’s core collection interfaces — `List`, `Set`, and `Map` — by managing students and their enrolled courses.

It’s part of my series of **Mini-Projects** to build a solid foundation in Java and showcase my progress as a software engineer.

---

## 🧩 Features

### 👤 Student Management

- Add new students with a **unique ID** and **name**
- Remove existing students from the registry
- Search for students by name (case-insensitive)
- Update a student’s name by ID _(bonus feature)_

### 📚 Course Tracking

- Maintain a **set of all unique courses** (no duplicates)
- Enroll students in multiple courses
- Add or remove a course for a specific student

### 📋 Display

- Print all students and their details
- Show which courses a specific student is enrolled in

---

## 🧠 Concepts Practised

- `ArrayList` for managing a list of students
- `HashSet` for ensuring unique course names
- `HashMap` for mapping students to their enrolled courses
- Encapsulation, method design, and object relationships in OOP
- Overriding `toString()` for clean console output

---

## 🏗️ Project Structure

```
StudentRegistry/
├── src/main/com/aadil/studentregistry/
│   ├── Student.java
│   ├── StudentRegistry.java
|   └── Main.java
└── README.md
```

- **Student.java** — Represents a single student (ID, name, etc.)
- **StudentRegistry.java** — Manages the list of students, their courses, and registry operations.
- **Main method** demonstrates adding, searching, and displaying data.

---

## 💻 How to Run the Project

### 1. Clone the repository

```
git clone https://github.com/<your-username>/StudentRegistry.git
cd StudentRegistry
```

### 2. Compile the code

```
javac -d out src/main/com/aadil/studentregistry*.java
```

### 3. Run the program

```
java -cp out StudentRegistry
```

---

## 🚀 Example Output

```
✅ Added Student: [001] Alice
✅ Added Student: [002] Bob

📘 Enrolled Alice in: Math
📘 Enrolled Alice in: English
📘 Enrolled Bob in: Science

📋 All Students:
[001] Alice → [Math, English]
[002] Bob → [Science]

🔍 Search result for "alice":
[001] Alice → [Math, English]
```

---

## 🧑‍💻 Author

**Aadil Waghat**  
Learning Java & building projects to become a Software Engineer.

---

## 🏁 Future Improvements

- Persist data to a file (save & load registry)
- Add simple console menu for interactive use
- Implement GUI with JavaFX

---
