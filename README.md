
# 🤖 CodeQuest AI — Coding Quiz & Daily Challenge App

CodeQuest AI is a Java-based web application that generates AI-powered coding quizzes and daily programming challenges. It combines the power of OpenAI's GPT model with a simple front-end built using HTML, CSS, and JavaScript.

---

## 🚀 Features

- 🎯 **AI Quiz Generator**  
  Enter any programming topic and get 3 multiple-choice questions (MCQs) with options and correct answers — all generated using OpenAI's GPT model.

- 💡 **Daily Coding Challenge**  
  Get a new programming problem every day to keep your skills sharp.

- 🧠 **Simple UI, Powerful Backend**  
  Built with Java Servlets and deployed on Apache Tomcat with a clean front-end experience.

---

## 📁 Project Structure

```
AI-Coding-Quiz-App/
├── pom.xml
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/codequest/
│       │       ├── AIQuizServlet.java
│       │       └── DailyChallengeServlet.java
│       ├── webapp/
│       │   ├── index.html
│       │   ├── quiz.html
│       │   ├── challenge.html
│       │   ├── css/
│       │   │   └── styles.css
│       │   └── js/
│       │       ├── quiz.js
│       │       └── challenge.js
│       └── WEB-INF/
│           └── web.xml (optional)
```

---

## 🔧 Technologies Used

- **Backend**: Java (Servlets), Maven, Apache Tomcat
- **Frontend**: HTML, CSS, JavaScript
- **API**: [OpenAI GPT-3.5](https://platform.openai.com/docs)

---

## 🛠️ How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/AI-Coding-Quiz-App.git
   ```

2. **Configure your OpenAI API key**:
   Replace `YOUR_API_KEY` in `AIQuizServlet.java` with your actual OpenAI key.

3. **Build with Maven**:
   ```bash
   mvn clean install
   ```

4. **Deploy the WAR file**:
   - Locate `target/AI-Coding-Quiz-App.war`
   - Deploy to Apache Tomcat's `webapps/` folder
   - Start Tomcat and open `http://localhost:8080/AI-Coding-Quiz-App`

---

## ⚠️ Notes

- Do **not** expose your OpenAI API key in public repositories.
- The quiz parser (`parseQuiz()`) is simplified — you may enhance it with regex or JSON parsing.

---

## 📸 Preview

https://github.com/user-attachments/assets/f9ef5c79-931f-4323-a46a-a3181867f97e

---

## 📜 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## 🙌 Made with ❤️ by Abhishek Sharma, Nikhil Kumar Jha, Poushali Mitra, Sumit Kumar
