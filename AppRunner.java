public class AppRunner { public static void main(String[] args) { System.out.println("Java active"); } }
// update 1.1’>> AppRunner.java
git add AppRunner.java
git commit -m " Java updated"
git checkout JavaScript
echo // update 1.1 >> script.js
git add script.js
git commit -m " JS updated "
git checkout main
git merge Java
git merge JavaScript
git remote add origin https://github.com/Sakshi86560/Web-Dev.git
git push -u origin main
echo // update 1.1’
