# Uppgift 1 - Hello World with a twist

## TL;DR
- Klona denna repo lokalt, gör uppgiften nedan, committa och pusha.

## Förberedelser

- Se till att du har Git installerat på din dator (https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
- Generera ett SSH-nyckelpar om du inte har det från tidigare, och lägg till i dina inställningar på GitHub (https://git-scm.com/book/en/v2/Git-on-the-Server-Generating-Your-SSH-Public-Key)
- Klicka på den gröna Code-knappen ovan, välj SSH och kopiera adressen till din clipboard.
- Öppna Git Bash (Windows) eller ett terminalfönster (Linux/Mac)
- Skriv följande, men ersätt adressen med den nu just kopierat för att klona denna repo lokalt

  `git clone git@github.com:fw-teaching/hello-java-*****.git`

- Öppna IntelliJ och välj Open, och navigera till den katalog du just skapade med Git. Du kan också använda BlueJ, men då ska du välja Project -> Open Non BlueJ och öppna `src`-katalogen under projektets huvudkatalog.
- Om Run-knappen uppe till höger inte är aktiverad, klicka på Edit configurations, _Add configuration (+)_ och välj _Application_ och _Java 11_. Du måste antagligen också söka upp Main-klassen. Spara konfigurationen, och nu borde programmet gå att köra.

## Uppgiften

- Allt relevant för uppgiften finns i katalogen `/src/main/java/com/assignment/`. Gör inga ändringar i någon annan katalog än denna.
- Projektet innehåller en Main-fil med lite boilerplate-kod. Börja med att få main()-metoden att skriva ut någonting när du kör programmet så att du vet att allt funkar som det ska. Sedan til själva uppgiften:
  
1. Skapa en ny klass vid namn Hello.
2. Hello-klassen ska ha en variabel som kan lagra ett namn
3. Hello-klassen ska ha en s.k. getter-metod vid namn getName()
4. Hello-klassen ska instansieras i main()-metoden och samtidigt få värdet på namnvariabeln i form av en enda konstruktorparameter. 

- När du kör programmet ska texten "Hello [värdet från namnvariabeln]" skrivas ut i konsolen.
- Observera att klass- och metodnamn måste vara skrivna exakt som ovan, annars kommer det automatiska testet inte att gå igenom.

## Inlämning

- Uppgiften inlämnas genom att helt enkelt öppna terminalen i IntelliJ göra:  
  `git add . ` (Lägg till alla ändringar och nya filer)  
  `git commit -m "Härmed lämnar jag in uppgiften"` (Eller liknande beskrivande meddelande)
  `git push` (Skicka upp koden till GitHub)
  
- Du kan också använda IntelliJ:s Git-integration om du vill och vet vad du gör.
- Om pushen misslyckas pga rättighetsproblem måste du kolla att du har din publika SSH-nyckel sparad på GitHub.
- Om testet inte går igenom, kolla om du har något fel i din kod eller om du möjligen inte gjort uppgiften exakt enligt beskrivningen. Korrigera i så fall din kod. Om du inte har skapat några nya filer räcker det med att köra en `git commit -a -m "Beskrivande meddelande"` och sedan `git push` till sist.
