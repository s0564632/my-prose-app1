### Exercise 1: Conceptual Questions

## 1. Difference between permissive and copyleft open source licenses
Permissive Lizenzen (z. B. die MIT-Lizenz) erlauben es Nutzern, den Code fast ohne Einschränkungen zu verwenden, zu verändern und sogar in geschlossener Kaufsoftware zu verbreiten. Copyleft-Lizenzen (z. B. die GNU GPL) verlangen dagegen, dass jede modifizierte Version der Software unter denselben freien Bedingungen weitergegeben werden muss. Dieser Mechanismus wird auch als viraler Effekt bezeichnet und sichert die dauerhafte Offenheit des Quellcodes.

## 2. Importance of choosing a license when releasing open source software
Ohne eine explizite Lizenz gilt für veröffentlichten Quellcode rechtlich automatisch der Standardzustand „Alle Rechte vorbehalten“ (*All rights reserved*). Das bedeutet, dass andere Entwickler den Code zwar einsehen, ihn aber weder legal kopieren, verändern noch in eigenen Projekten nutzen dürfen. Erst eine gewählte Lizenz schafft die nötige Rechtssicherheit und wandelt das Repository in echtes Open-Source-Material um.

## 3. Rights grant for the Linux Kernel in Red Hat Enterprise Linux (RHEL)
Die Nutzungsrechte für den Linux-Kernel werden dir direkt von den ursprünglichen Urhebern und Entwicklern des Kernels gewährt, nicht von der Firma Red Hat. Da der Kernel unter der Copyleft-Lizenz GPLv2 steht, agiert Red Hat nur als Distributor, der die Software bündelt und Support verkauft. Das Urheberrecht bleibt bei den einzelnen Autoren, die dir über die GPLv2-Lizenz die direkten, unveräußerlichen Rechte einräumen.

## 4. Importance of including both a LICENSE file and license headers in an open source project
Die zentrale `LICENSE`-Datei im Hauptverzeichnis legt die rechtlichen Spielregeln für das gesamte Projekt verbindlich fest. Zusätzliche Lizenz-Header in jeder einzelnen Quellcodedatei sind wichtig, da Entwickler oft isolierte Dateien in andere Projekte kopieren. Ohne diesen eingebetteten Header würde eine kopierte Datei sofort ihren rechtlichen Kontext und den Nachweis ihrer Erlaubnisse verlieren.

## 5. Role of CONTRIBUTING.md, CODE_OF_CONDUCT.md, and SECURITY.md
Diese drei Dokumente bilden das organisatorische, soziale und sicherheitsrelevante Fundament für eine gesunde Community. Die `CONTRIBUTING.md` erklärt Entwicklern den technischen Ablauf für das Einreichen von Code, während der `CODE_OF_CONDUCT.md` menschliche Verhaltensregeln gegen Diskriminierung festlegt. Die `SECURITY.md` sichert das Projekt ab, indem sie einen diskreten Meldeweg für kritische Sicherheitslücken abseits der Öffentlichkeit definiert.

## 6. When to transfer stewardship of an open source project to a foundation
Die Übergabe an eine neutrale Stiftung ist sinnvoll, wenn ein Projekt so groß wird, dass die Abhängigkeit von einer einzelnen Person oder Firma das Wachstum bremst. Eine Foundation bietet einen wettbewerbsneutralen Raum, der das Misstrauen konkurrierender Unternehmen abbaut und die gemeinsame Entwicklung fördert. Zudem übernimmt die Stiftung die treuhändische Verwaltung von Markenrechten und sorgt für rechtliche sowie finanzielle Absicherung.

## 7. Key contents of a NOTICE file vs. a LICENSE file
Eine `LICENSE`-Datei enthält den reinen, unveränderten Text der gewählten Lizenz und definiert, was Nutzer mit dem Code tun dürfen. Die `NOTICE`-Datei hingegen enthält spezifische Urheberrechtshinweise, Marken-Nennungen und Pflichtangaben zu genutzten Drittanbieter-Komponenten, die zwingend weiterverbreitet werden müssen. Während die Lizenz also Erlaubnisse erteilt, stellt die NOTICE-Datei die Erfüllung der gesetzlichen Namensnennungspflicht (*Attribution*) sicher.

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
