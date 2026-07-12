# My-Prose-App1

My-Prose-App1 ist ein Beispiel für die Verwendung des Prose-Builder-Projekts im Modul *Open Source Software Development* an der HTW-Berlin. Es zeigt, wie mit dem ProseBuilder aus der prose_builder Bibliothek einfache Sätze zu Prosatexten zusammengefügt werden können.

Prose-Builder ist ein einfaches Open-Source-Tool zur Erstellung von Prosatexten, basierend auf importierten Sätzen. Es ermöglicht Entwickler:innen, einfach Sätze zu registrieren und daraus fließende Prosa zu generieren.

## Überblick

My-Prose-App1 demonstriert die Funktionalität von Prose-Builder, indem es einfache Sätze registriert und daraus eine komplette Prosa generiert, die dann in der Konsole ausgegeben wird.

## Voraussetzungen

* **Java:** Version 21
* **Build-System:** Maven 3.x

## Features

* **Integration von Prose-Builder:** Nutzung der ProseBuilder-Klasse für einfache Prosa-Erstellung.
* **Beispielimplementierung:** Enthält zwei konkrete Implementierungen des Sentence-Interfaces (`FirstSentence` und `SecondSentence`).
* **Automatisiertes Testen:** Integrierte JUnit 5 Modultests zur Verifizierung von Inhalt und Satzlänge.
* **CI/CD Integration:** GitHub Actions Workflow zur automatisierten Validierung bei Push-Events.

## Installation

Um die Applikation zu installieren und auszuführen, wird Maven benötigt, um die Abhängigkeiten zu verwalten.

1. **Klonen des Repositories:**
   ```bash
   git clone https://github.com
   cd my-prose-app1
   ```

2. **Erstellen des Projekts mit Maven:**
   ```bash
   mvn clean install
   ```

## Verwendung

Um My-Prose-App1 auszuführen, kann der folgende Befehl im Terminal verwendet werden:

```bash
mvn exec:java -Dexec.mainClass="de.htw_berlin.fb4.calculator.unisono.my_prose_app.MainApp"
```

Das Programm wird eine einfache Nachricht und die generierte Prosa basierend auf den implementierten Satz-Klassen in der Konsole ausgeben.

## Abhängigkeit zu Prose-Builder

My-Prose-App1 ist auf Prose-Builder angewiesen, welches als Maven-Abhängigkeit in der `pom.xml` enthalten ist:

URL zum Repository: [https://maven.pkg.github.com/bs-jokri/prose-builder](https://maven.pkg.github.com/bs-jokri/prose-builder)

```xml
<dependency>
    <groupId>de.htw_berlin.fb4.ossd</groupId>
    <artifactId>prose_builder</artifactId>
    <version>1.0-0</version>
</dependency>
```

## Beitrag

Beiträge und Verbesserungen sind gerne gesehen! Um mitzumachen, folge diesen Schritten:

1. Forke das Repository.
2. Erstelle einen neuen Feature-Branch (`git checkout -b feature/neues-feature`).
3. Committe die Änderungen (`git commit -m 'Neues Feature hinzugefügt'`).
4. Push zu deinem Branch (`git push origin feature/neues-feature`).
5. Sende einen Pull Request.

## Lizenz

Dieses Projekt wird unter der MIT-Lizenz lizenziert. Es erlaubt freie Nutzung, Modifikation und Verteilung unter Beibehaltung der Lizenz- und Urheberrechtsbedingungen. Details findest du in der `LICENSE`-Datei.

## Kontakt

Bei Fragen oder Anregungen zu My-Prose-App1 kann direkt über das GitHub Repository ein Issue erstellt werden.
