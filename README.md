### tvScientific Demo

**Project Requirements**
Define a function that returns the frequencies of the last digits of a sequence of nonnegative integers. Use only immutable data structures and immutable values.

Given the sequence Seq(49, 10, 20, 5, 30, 185):  
9 is the last digit one time (in 49)  
0 is the last digit three times (in 10, 20 and 30)  
5 is the last digit two times (in 5 and 185)  
lastDigitCounts(Seq(49, 10, 20, 5, 30, 185)) = Map[Int, Int](9 -> 1, 0 -> 3, 5 -> 2) or something equivalent

**Prerequisites**

1. Download Brew (on macOS)
2. Download JDK from Oracle
3. Download Scala
4. Download sbt

```bash
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
brew install openjdk@11
brew install scala
brew install sbt
```

5. Verify installations

```bash
java -version
scala -version
sbt sbtVersion
```

**Usage**

```bash
sbt compile
sbt run
```

### tvScientific Screening Questions

**What tools do you use to help you code productively?**

My main productivity tools are as follows:

- ChatGPT for boiler plate code and ideation
- Stackoverflow for specific error resolution
- YouTube for tech tutorials when learning a new language or framework
- Regex101 for building and testing regular expressions (helpful for data manipulation)
- Diffchecker for file comparison
- Postman for API development and testing
- Excel for quick & dirty data manipulation
- Lucidchart for architecture diagrams
- Content creators like DataExpert, Tech Lead, and Joma Tech for new trends in tech

**What editor/IDE do you prefer?**

I really like VSCode for anything code-related and Sublime Text for JSON files and notes. Both tools are lightweight and beautifully designed.

**Testing framework?**

I've used Pytest for Python, NUnit for .NET, and JUnit for Java. I've also used Ninject as dependency injection which is a must-have when unit testing large enterprise projects.

**Linter?**

Pylint for Python. Prettier is a nice package to have on top of a linter for consistent spacing/formatting.

**Command line utilities?**

I often use the AWS CLI when I need to do something in the cloud that's otherwise too time-consuming or impossible in the GUI. I also use Docker, Kubernetes, and Git almost exclusively through the command line. Lastly, whenever I need a new tool or framework I default to downloading it in the Mac package manager called "brew".

**Other tools you like or recommend to friends?**

I've played around with OWASP for web app penetration testing and proxies. It's a great resource if you're in the application security space. And I think Jenkins is a great open source tool for CI/CD.

**Is there something you've discovered recently but haven’t had time to learn yet?**

Basically anything AI/ML related. I've gone through the AWS Machine Learning course but haven't truly learned the material yet. I also recently built an API in Go for another job interview and heard about Go Routines and Channels which are built-in constructs for parallel processing but I haven't had a chance to play with or understand them yet.
