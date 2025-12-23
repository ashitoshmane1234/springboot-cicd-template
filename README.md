# 🚀 Spring Boot CI/CD Template with GitHub Actions & SonarCloud

A **production-ready CI/CD pipeline template** for Spring Boot applications, demonstrating best practices in **build automation, code quality analysis, security, and containerization** using **GitHub Actions, SonarCloud, and Docker**.

This repository is designed as a **reusable reference project** for teams and individuals building modern Java backend systems.

---

## ✨ Features

- ✅ Spring Boot application with Maven Wrapper  
- ✅ Automated CI pipeline using GitHub Actions  
- ✅ **SonarCloud integration** for:
  - Code Quality  
  - Security Vulnerabilities  
  - Code Smells & Maintainability  
- ✅ Secure handling of secrets (no secrets exposed in workflow)  
- ✅ Docker image build for containerized deployment  
- ✅ Multi-branch CI support (`main`, `development`, `feature/*`)  
- ✅ Ready-to-showcase project for interviews & LinkedIn  

---

## 🛠 Tech Stack

- **Backend**: Java 17, Spring Boot  
- **Build Tool**: Maven (Wrapper)  
- **CI/CD**: GitHub Actions  
- **Code Quality**: SonarCloud  
- **Containerization**: Docker  
- **Version Control**: Git & GitHub  

---

## 🔄 CI/CD Workflow Overview

On every **push or pull request**, the pipeline automatically:

1. Checks out the source code  
2. Sets up Java 17  
3. Caches Maven dependencies  
4. Builds the application & runs tests  
5. Runs **SonarCloud analysis (Quality Gate)**  
6. Builds a Docker image  

📄 **Workflow file**
```
.github/workflows/ci.yml
```

---

## 🌿 Branching Strategy

```
main          → production-ready code
development   → integration & testing
feature/*     → new features / experiments
```

### CI Triggers

- `main`
- `development`
- `feature/**`

This setup demonstrates **real-world team workflows**.

---

## 🔐 SonarCloud Setup

### Required GitHub Secrets

Add the following secrets under:

**Repository → Settings → Secrets and variables → Actions → Repository secrets**

| Secret Name | Description |
|------------|------------|
| `SONAR_TOKEN` | SonarCloud authentication token |
| `SONAR_PROJECT_KEY` | SonarCloud project key |
| `SONAR_ORG` | SonarCloud organization key |

🔒 Secrets are injected securely using environment variables (**security-gate compliant**).

---

## 🧪 SonarCloud Demo (Quality Gate)

This project demonstrates:

- Introducing a **deliberate code issue** in a feature branch  
- SonarCloud detecting the issue during CI  
- Fixing the issue and observing **Quality Gate recovery**  
- Real-time feedback in Pull Requests  

A perfect example of **shift-left quality & security**.

---

## 🐳 Docker

Build the Docker image locally:

```bash
docker build -t springboot-cicd-template .
```

The Docker image is built **only after CI & SonarCloud checks pass**, ensuring **high-quality artifacts**.

---

## 📌 Why This Project?

- Shows **end-to-end CI/CD ownership**  
- Demonstrates **secure DevOps practices**  
- Highlights a strong **code quality mindset**  
- Ready-to-reuse template for real projects  
- Strong portfolio project for **backend / platform engineers**  

---

## 👨‍💻 Author

**Ashitosh Mane**  
Software Engineer | Java | Spring Boot | GenAI | React.js | AWS Services | Next.js  

📍 Pune, India  
🔗 LinkedIn: https://www.linkedin.com/in/ashitosh-mane-7a2b121b9/

---

⭐ If you like this project, consider starring the repository!