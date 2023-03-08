# Dokumentation

Dette er min egen dokumentation af Java Webstack.
Vi skal lave et intranet og ville bruge denne dokumentation
til at bedre at kunne huske hvad vi har lavet.

## Start af et nyt webprojekt

1. Opret et nyt projekt i IntelliJ
2. Vælg JavaEE projektskabelon
3. Java + Maven
4. Servlet dependencies

![img.png](img/Opret.png)

## Arkitektur

Vi anvender en slags MVC-pattern.
![img.png](img/mvc.png)

- (M)odel - Entiteter og hjælpe- metoder og klasser.
- (V)iew - JSP og frontend (CSS, Bootstrap)
- (C)ontrol - Servlets

Husk! Ingen kommunikation mellem Model og View. Gå altid igennem en kontroller.

Opret GIT repo

```SHELL
git init
git add .
git commit -m "first commit"
git remote add origin git@github.com:artiecodes/intranet.git
```