# Uppgift 1 - Hello World with a twist


## Förberedelser

- Se till att du har Git installerat på din dator (https://git-scm.com/book/en/v2/Getting-Started-Installing-Git) 
- Generera ett SSH-nyckelpar om du inte har det från tidigare (https://git-scm.com/book/en/v2/Git-on-the-Server-Generating-Your-SSH-Public-Key)
- Klicka på den gröna Code-knappen ovan, välj SSH och kopiera adressen till din clipboard.
- Öppna Git Bash (Windows) eller ett terminalfönster (Linux/Mac) 
- Skriv följande, men ersätt adressen med den nu just kopierat för att klona denna repo lokalt

    `git clone git@github.com:fw-teaching/hello-java-*****.git`

- Öppna IntelliJ och välj Open, och navigera till den katalog du just skapade med Git. Du kan också använda BlueJ, men då ska du välja Project -> Open Non BlueJ och öppna `src`-katalogen under projektets huvudkatalog. 

## Uppgiften

- Projektet innehåller en Main-fil med lite boilerplate-kod. Bekanta dig med den.
- Skapa en ny klass vid namn Hello.
- Hello-klassen ska ha en variabel som kan lagra ett namn
- Hello-klassen ska ha en s.k. getter-metod vid namn getName() 
- Hello-klassen ska instansieras i main()-metoden och samtidigt få värdet på namnvariabeln i form av en enda konstruktorparameter 
- När man kör programmet ska texten "Hello [namn]" skrivas ut i konsolen.

