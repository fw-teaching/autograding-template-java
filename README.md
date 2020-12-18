# Uppgift 1 - Hello World with a twist

## TL;DR
- Klona denna repo lokalt, gör uppgiften nedan, committa och pusha.

## Förberedelser

- Se till att du har Git installerat på din dator (https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
- Generera ett SSH-nyckelpar om du inte har det från tidigare, och lägg till i dina inställningar på GitHub (https://git-scm.com/book/en/v2/Git-on-the-Server-Generating-Your-SSH-Public-Key)
- Klicka på den gröna Code-knappen ovan, välj SSH och kopiera adressen till din clipboard.
- Öppna Git Bash (Windows) eller ett terminalfönster (Linux/Mac)
- Skriv följande, men ersätt adressen med den nu just kopierat för att klona denna repo lokalt

  `git clone git@github.com:fw-teaching/hello-java-*****.git` (svara "yes" om det kommer en varning första gången)

- Öppna IntelliJ och välj Open, och navigera till den katalog du just skapade med Git (du får använda någon annan editor också om du vet hur du ska göra). 
- Om Run-knappen uppe till höger i IntelliJ inte är aktiverad, klicka på Edit configurations, _Add configuration (+)_ och välj _Application_ från listan. 
  Du måste antagligen också söka upp Main-klassen (com.assignment.main), välja _Java 11_ som JRE samt välja _Classpath of module_ (ta den med _.main_ på slutet). 
  Spara konfigurationen, nu borde programmet gå att köra.

## Uppgiften

- Allt relevant för uppgiften finns i katalogen `/src/main/java/com/assignment/`. Gör inga ändringar i någon annan katalog än denna.
- Projektet innehåller en Main-fil med lite boilerplate-kod.

###a) 1/5 poäng
1. Få programmet att skriva ut "Hello World!" i konsolen när du kör programmet. 

###b) 4/5 poäng
1. Skapa en ny klass vid namn `Hello`.
2. Hello-klassen ska ha en variabel som kan lagra ett namn
3. Hello-klassen ska ha en s.k. getter-metod vid namn `getName()`
4. Hello-klassen ska instansieras som ett objekt i `main()`-metoden och samtidigt få värdet på namnvariabeln i form av en enda konstruktorparameter.
5. Ändra programmets konsolutskrift till "Hello [värdet från namnvariabeln]"

- Observera att klass- och metodnamn måste vara skrivna exakt som ovan, annars kommer det automatiska testet inte att gå igenom.

## Inlämning

- Uppgiften inlämnas genom att helt enkelt öppna terminalen i IntelliJ och köra:  
  `git add . ` (lägg till alla ändringar och nya filer)  
  `git commit -m "Allt klart för inlämning"` (eller liknande beskrivande meddelande)  
  `git push` (Skicka upp koden till GitHub)  
  
- Om du vill kan du lämna in a) så fort den är klar och sedan lämna in b) skilt.
- Du kan också använda IntelliJ:s Git-integration om du vill och vet vad du gör.
- Om pushen misslyckas pga rättighetsproblem måste du kolla att du har din publika SSH-nyckel sparad på GitHub.

## Automatisk testning

- När pushen är gjord, kolla din repo på GitHub. Ovanför listan på filer syns din senaste commit med en orange boll om testet ännu inte körts, en grön checkmark om testet gått igenom, och ett rött kryss om testet underkänts. Klicka på symbolen och sedan _Details_ för mera info.   
- Om testet inte går igenom kolla om du har något fel i din kod eller om du möjligen inte gjort uppgiften exakt enligt beskrivningen. Korrigera i så fall din kod, och om du inte har skapat några nya filer räcker det med att köra en `git commit -a -m "Alla buggar fixade"` och sedan `git push` till sist. Du får göra detta hur många gånger som helst.
- Det finns skilda tester för uppgift a) och uppgift b), och båda måste gå igenom för fulla poäng.


