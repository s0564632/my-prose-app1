# My-Prose-App1

Dieses Softwareprojekt demonstriert die praktische Anwendung der externen Programmbibliothek `prose_builder` im Rahmen des Moduls *Open Source Software Development* an der HTW-Berlin. Die Anwendung visualisiert, wie isolierte Satz-Objekte über den zentralen `ProseBuilder` dynamisch zu zusammenhängenden Prosatexten aggregiert werden.

Der zugrundeliegende *Prose-Builder* fungiert als modulares Open-Source-Werkzeug, das importierte Textbausteine registriert und in fließende Textstrukturen übersetzt.

## Systemüberblick

Die Applikation bindet das vorgegebene `Sentence`-Interface ein, registriert zwei eigenständige Satz-Klassen auf der Konsole und gibt das generierte Gesamtergebnis direkt im Terminal aus.

## Systemvoraussetzungen

* **Laufzeitumgebung:** Java JDK 21
* **Build-Management:** Maven 3.x
* **Plattform-Validierung:** GitHub Actions (Node.js 24 kompatibel)

## Leistungsumfang (Features)

* **Modulare Integration:** Nahtlose Anbindung der `ProseBuilder`-API.
* **Mehrteilige Implementierung:** Getrennte Datenhaltung über `FirstSentence` und `SecondSentence`.
* **Qualitätssicherung:** Unabhängige Testsuite via JUnit 5 zur Längen- und Inhaltsprüfung.
* **Continuous Integration:** Automatisierte Workflow-Prüfung bei jedem Code-Push.

## Installation und Setup

Für die lokale Replikation und Bereitstellung wird eine aktive Maven-Infrastruktur benötigt.

1. **Repository lokal spiegeln:**
   ```bash
   git clone https://github.com
   cd my-prose-app1
   ```

2. **Projektreferenz kompilieren:**
   ```bash
   mvn clean install
   ```

## Programmausführung

Der Start der Anwendung erfolgt direkt über das Maven-Execution-Plugin im Systemterminal:

```bash
mvn exec:java -Dexec.mainClass="de.htw_berlin.fb4.calculator.unisono.my_prose_app.MainApp"
```

Nach dem Aufruf initialisiert die JVM die Hauptklasse, verarbeitet die Textbausteine und gibt die formatierte Prosa in der Konsolenausgabe aus.

## Externe Abhängigkeiten

Die Kernkomponenten basieren auf der Kopplung des folgenden Artefakts in der `pom.xml`:

* **Repository-Endpunkt:** [https://github.com](https://github.com)

```xml
<dependency>
   <groupId>de.htw_berlin.fb4.ossd</groupId>
   <artifactId>prose_builder</artifactId>
   <version>1.0-0</version>
</dependency>
```

## Community-Richtlinien (Contributions)

Fehlerkorrekturen und funktionale Erweiterungen können über den standardisierten GitHub-Flow eingereicht werden:

1. Projekt-Fork auf dem eigenen Profil erstellen.
2. Lokalen Arbeitszweig anlegen (`git checkout -b feature/optimierung`).
3. Änderungen versionieren (`git commit -m 'Fix: Beschreibung'`).
4. Zweig hochladen (`git push origin feature/optimierung`).
5. Pull Request (PR) zur Überprüfung einreichen.

## Lizenzierung

Die Distribution dieses Projekts erfolgt unter den rechtlichen Bedingungen der **MIT-Lizenz**. Modifikationen, gewerbliche Nutzungen und Weiterverbreitungen sind unter Erhalt des originalen Urheberrechtshinweises uneingeschränkt zulässig. Details entnehmen Sie der lokalen `LICENSE`-Datei.

## Support und Fehlermeldungen

Für technische Rückfragen, Code-Reviews oder das Melden von Inkompatibilitäten nutzen Sie bitte die offizielle **Issues-Sektion** dieses GitHub-Repositories.

---

## Exercise 1: Conceptual Questions (Strikte Folien-Fakten kurz gefasst)

| Nr. | Konzeptfrage (Exercise 1) | Kernunterschied / Rechtliche Begründung (UrhG & Folien-Fakten) |
| :---: | :--- | :--- |
| **1** | Permissive vs. Copyleft Lizenzen | Permissive Lizenzen (z. B. Apache 2.0) erlauben die Schließung und Integration in proprietäre Software. Copyleft Lizenzen (z. B. GPLv2) erzwingen durch den viralen Effekt die Offenlegung jeglicher Modifikationen unter derselben Lizenz. |
| **2** | Relevanz der Lizenzauswahl | Nach §69c UrhG liegen alle Verwertungsrechte exklusiv beim Schöpfer. Ohne Lizenz gilt „Alle Rechte vorbehalten“, was jede Vervielfältigung, Bearbeitung oder Nutzung durch Dritte gesetzlich illegal macht. |
| **3** | Rechteinhaber des Linux-Kernels in RHEL | Die Nutzungsrechte gewährt der ursprüngliche Autor (Programmierer) über die GPLv2. Da Urheberrechte laut §29 UrhG unübertragbar sind, hält Red Hat als Vendor keine Rechte am Kerncode, sondern bündelt nur die Distribution. |
| **4** | Zusammenspiel LICENSE und Headers | Die LICENSE-Datei regelt den Rahmen des Gesamtrepositories. License Headers sichern den Schutz auf Modulebene, da isoliert kopierte Quellcodedateien im Open-Source-Netzwerk ansonsten ihren Haftungsausschluss verlieren. |
| **5** | Funktion der Community-Dateien (.md) | CONTRIBUTING.md sichert den technischen Einreichungsprozess und Code-Qualität. CODE_OF_CONDUCT.md garantiert ein diskriminierungsfreies Miteinander, und SECURITY.md etabliert geschçtzte Kanäle für sensible Fehlermeldungen. |
| **6** | Transfer an eine Stiftung (Foundation) | Sinnvoll bei starkem Wachstum zur Erreichung von Hersteller-Neutralität (Vendor-Neutrality). Stiftungen verwalten Markenrechte neutral, sichern die IP-Compliance und schützen das Ökosystem durch kollektive Patent-Pools. |
| **7** | Inhaltliche Abgrenzung NOTICE vs. LICENSE | Die LICENSE enthält den reinen, unveränderten Lizenztext. Die NOTICE beinhaltet dynamische Projekt-Metadaten (Copyright-Inhaber, Markenrechte, Drittkomponenten), die bei jeder Weiterverbreitung zwingend erhalten bleiben müssen. |

---

## Exercise 2: License Selection Matrix ("Prose-Builder" Analyse)

Das Team fordert: Freies Teilen, Modifikationen erlaubt unter Namensnennung (Credit), keinerlei kommerzielle Barrieren.

| Lizenz-Kandidat | Berechtigungen (Features) | Verpflichtungen (Obligations) | Restriktionen (Einschränkungen) | Passfähigkeit zum Szenario |
| :--- | :--- | :--- | :--- | :--- |
| **MIT License** | Freie Nutzung, Bearbeitung, kommerzieller Vertrieb. | Erhalt des originalen Copyright-Hinweises in allen Kopien. | Keine integrierte Patentklausel oder Haftungsansprüche. | **Möglich, aber suboptimal:** Erfüllt die Grundkriterien, bietet dem Team aber keinen Schutz vor späteren Patentklagen. |
| **GNU GPL v2** | Kopieren, Ändern und Verbreiten des Codes. | Abgeleitete Werke (Derivative Works) müssen zwingend quelloffen unter GPLv2 stehen. | Verhindert die Integration in geschlossene, kommerzielle Softwareprodukte. | **Ausgeschlossen:** Widerspricht direkt der Teamanforderung „Keine kommerziellen Einschränkungen“. |
| **Apache License 2.0** | Freies Nutzen, Ändern, Verbreiten und kommerzielles Verwerten. | Erhalt aller Copyright-, Marken- und Patentzeichen sowie Mitauslieferung der NOTICE-Datei. | Gewährt explizite Patentrechte; automatischer Lizenzentzug bei Patentklagen gegen das Projekt. | **Perfekter Fit (Gewählte Lizenz):** Garantiert den geforderten Credit (Zuschreibung) rechtssicher und sichert das Tool durch moderne Patent-Klauseln ab. |
