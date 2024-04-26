# Enunciat
[1 punts - MAP] Volem tenir registrats els diferents cartells que té una carretera. La carretera fa més del 1000km, i volem registrar el metre al que hi ha al cartell. Posteriorment volem poder obtenir el cartell que hi ha a un metre determinat. L'usuari primer introduirà el número de cartells, i per cada cartell el metre i el text. Després introduirà un metre i s'ha d'imprimir el cartell o no hi ha cartell. S'acaba quan l'usuari introdueix -1.
[1 punts] Una empresa vol tenir enregistrada la informació els seus empleats. De cada empleat en vol tenir el seu dni, nom, cognoms i adreça. Vol poder accedir ràpidament a les dades dels empleats segons el seu DNI. Fes un programa que llegeixi un conjunt d'empleats per pantalla (primer introduirà la quantitat d'empleats). Després imprimeix les dades del empleats pel DNI entrat. Acaba el programa quan introdueixi END
[1 punts] S'ha de votar el delegat de la classe, i per fer-ho has decidit fer un petit programa que conti els vots i imprimeixi el resultat. Cada usuari introduirà el nom de l'estudiant al que vota. Quan ja no hi hagi més vots escriurà END Imprimeix els total de vots.
[1 punts] Un concessionari de cotxes de segona mà vol tenir la informació dels cotxes que té en estoc. De cada cotxe se'n guarda la matricula, el model i el color. Vol poder accedir rapidament a la informació del cotxe usant la matricula.
[1 punts - SET] Volem fer un petit joc on els diferents jugadors han de dir respostes a una pregunta, però no es poden fer repeticions. Fes un programa que llegeixi la resposta per l'input i mostri "MEEEC!" quan hi hagi una
repetició. El programa s'acaba quan l'usuari escriu END
[1 punts] Després de molts diumenges acompanyant a la teva avia al bingo de la residència decideixes fer un petit programa que t'ajudi. El Bingo de la residència no es canta línia, només Bingo. L'usuari primer introdueix 10 números, que són els de la targeta. Després introdueix els números que es van cantant. Després que cada número cantat indica quants en queden. Quan s'han cantat tots els números imprimeix BINGO i finalitza el programa
[1 punts - Queue] Un hospital ens ha demanat que els hi fem un programa per a gestionar la
cua d'accés a urgències. Cada pacient tindrà un nom i una prioritat de tipus enter (valor més alt
indica més prioritat). 
Si la línia comença amb un 1 és que ha entrat un pacient al hospital.
Si la línia comença amb un 0 és que s’està atenent a un pacient.
Si la línia comença amb un -1 és que s'acaba el programa
Imprimeix per pantalla les crides dels diferents pacients
[1 punts] Degut a un problema en l'assignació de prioritats l'hospital ens demana que modifiquem el programa per a que l'ordre sigui estricte per arribada, sense a tenir en compte la prioritat.
[1 Punts - Iterator]
    ● Llegeix una llista d'enters per consola (usa IntegerLists.readIntegerList).
    ● Elimina els enters que són parells
    ● Imprimeix la llista per pantalla
[1 Punts - General] Conta quantes paraules diferents hi ha en un text. Quan s'introdueix la línia END és que s'ha acabat l'input.
# DEMO
EX1 : 
    Input:            Output:
    3                   no hi ha cartell
    103 Lorem           Ipsum
    164829 Ipsum        Lorem
    36837 Dolor
    97362
    164829
    103
    -1
EX2 :
    Input:            Output:
    2                 Mar Puig - 12345678Z, Av. Pi 42
    12345678Z         Ot Pi - 87654321T, C. Mar 33
    Mar               Ot Pi - 87654321T, C. Mar 33
    Puig
    Av. Pi 42 /
    87654321T
    Ot
    Pi
    C. Mar 33 /
    END
EX 3:
    Input:            Output:
    Mar               Mar: 4
    Mar               Ot: 1
    Ot                Iu: 2
    Iu                Ona: 1
    Ona
    Iu
    Mar
    Mar
EX 4:
    Input:             Output:
    3                  4738URP Seat Groc
    2322UUY Opel Blanc 3798YHT Opel Verd
    4738URP Seat Groc
    3798YHT Opel Verd
    4738URP
    3798YHT
    END
EX 5:
    Input:             Output:
    poma               MEEEEEEC!
    pera               MEEEEEEC!
    cirera
    pera
    cindria
    melo
    cirera
    END
EX 6:
    Input:               Output:
    1 2 3 4 5 6 7 8 9 10 BINGO
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
EX 7:
    Input:             Output:
    1 25 Mar           Ot passi a la consulta
    1 60 Ot            Mar passi a la consulta
    0
    1 10 Ona
    0
    -1
EX 8:
    Input:             Output:
    1 25 Mar           Mar passi a la consulta
    1 60 Ot            Ot passi a la consulta
    0
    1 10 Ona
    0
    -1
EX 9:
    Input:             Output:
    1 2 3 4 5 6 7 8    [1, 3, 5, 7]
EX 10:
    Input:             Output:
    Hola que tal em    8 Paraules
    Hola bona tarda
    que tal as
    Adeu
    END