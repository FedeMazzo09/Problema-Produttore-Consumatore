# Problema Produttore–Consumatore

## Argomento del Progetto

### Simulazione del Problema Produttore–Consumatore in Java con Thread e Semafori

Questa applicazione simula il classico problema del **Produttore–Consumatore** utilizzando il linguaggio Java, i **thread** e i **semafori**.

Il sistema è composto da:

* un thread **Produttore** che genera dati;
* un thread **Consumatore** che preleva i dati;
* un **buffer condiviso** utilizzato come memoria comune;
* un meccanismo di sincronizzazione tramite **semafori** per evitare conflitti tra i thread.

---

# Analisi del Progetto

## Obiettivo

L’obiettivo del progetto è dimostrare come utilizzare i **thread concorrenti** e i **semafori** in Java per risolvere problemi di sincronizzazione tra processi che condividono le stesse risorse.

---

# Componenti Principali

## Produttore

Il thread produttore ha il compito di:

* generare un valore numerico;
* inserire il valore nel buffer condiviso;
* attendere nel caso in cui il buffer sia pieno.

---

## Consumatore

Il thread consumatore si occupa di:

* prelevare il valore presente nel buffer;
* elaborare o visualizzare il dato ricevuto;
* attendere se il buffer è vuoto.

---

## Buffer Condiviso

Il buffer rappresenta la memoria condivisa tra produttore e consumatore.

### Caratteristiche

* contiene un solo elemento alla volta;
* permette la comunicazione tra i thread;
* deve essere protetto tramite sincronizzazione.

---

# Gestione della Sincronizzazione

## Utilizzo dei Semafori

Per gestire correttamente l’accesso al buffer vengono utilizzati due semafori:

### `empty`

Indica che il buffer è libero e pronto per ricevere un nuovo elemento.

### `full`

Indica che il buffer contiene un elemento pronto per essere consumato.

---

# Funzionamento del Sistema

## Sequenza Operativa

1. Il produttore genera un dato.
2. Il produttore verifica che il buffer sia libero.
3. Il dato viene inserito nel buffer.
4. Il consumatore attende la disponibilità del dato.
5. Il consumatore preleva il valore dal buffer.
6. Il buffer torna nuovamente disponibile.

---

# Tecnologie Utilizzate

## Linguaggio

* Java

## Concetti Principali

* Thread
* Concorrenza
* Semafori
* Sincronizzazione dei processi
* Memoria condivisa
