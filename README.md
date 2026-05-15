# Problema-Produttore-Consumatore

##Argomento scelto
###Simulazione del problema Produttore-Consumatore in Java tramite Thread e Semafori

L’applicazione simula un sistema in cui:

un thread produttore genera dati
un thread consumatore preleva i dati
entrambi condividono una memoria comune (buffer)
l’accesso viene sincronizzato tramite semafori per evitare conflitti
##Analisi breve del progetto
###Obiettivo

Dimostrare l’utilizzo dei thread e dei semafori in Java per risolvere il problema della sincronizzazione tra processi concorrenti.

Componenti principali
###Produttore
crea un valore numerico
inserisce il valore nel buffer condiviso
aspetta se il buffer è pieno
###Consumatore
preleva il valore dal buffer
aspetta se il buffer è vuoto
###Buffer condiviso
contiene un solo elemento
rappresenta la memoria condivisa
###Semafori

Vengono utilizzati due semafori:

empty → indica se il buffer è libero
full → indica se il buffer contiene un elemento
