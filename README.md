# CurrencyConversion

Beschreibe für folgendes Problem eine Lösung in Form von Java- oder Pseudocode.

Es liegt eine Liste mit Umsätzen von Transaktionen vor. Jeder der Umsätze hat eine
Originalwährung, einen Originalbetrag und ein Flag das aussagt, ob es sich um eine
Vorbuchung handelt. Für die Darstellung in der App müssen die Daten angepasst werden.

Vorbuchungen sollen nicht angezeigt werden und müssen daher aus der Liste entfernt
werden. Anschließend muss für jeden Umsatz der Originalbetrag in verschiedene
Fremdwährungen umgerechnet und am Umsatz gespeichert werden.

Die benötigten Währungen und Wechselkurse sind in der unten verlinkten XML definiert. Es darf davon ausgegangen werden, dass diese bereits lokal in beliebiger Form zur Verfügung
stehen.

Bei der Originalwährung kann es sich um Euro, oder um jede in der XML enthaltene
Währung handeln.

Link zu den Wechselkursen (Kurs zu Euro):
https://www.ecb.europa.eu/stats/eurofxref/eurofxref-daily.xml