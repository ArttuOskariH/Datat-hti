# Datatahti
Kilpailu koodit

T.1
Pakkaus

Uolevi on kehittänyt uuden pakkausmenetelmän, jonka avulla voi tallentaa monen merkkijonon pienempään tilaan.
Menetelmä jakaa merkkijonon osiin ja tallentaa jokaisen osan muodossa ks, jossa k on kokonaisluku ja s on merkkijono. Tämä tarkoittaa, että merkkijono s esiintyy k kertaa peräkkäin. Kaikki osat ovat peräkkäin pakatussa merkkijonossa.
Esimerkiksi merkkijonon ABCABCXXXXXXX voi pakata jakamalla sen osiin ABCABC ja XXXXXXX. Osa ABCABC on pakattuna 2ABC ja osa XXXXXXX on pakattuna 7X, joten koko merkkijono on pakattuna 2ABC7X.
Merkkijonon pakkaamiseen on yleensä monia tapoja. Esimerkiksi merkkijonon ABABAB voi esittää pakattuna 3AB, 1AB2AB, 1A1B1A1B1A1B ja monilla muilla tavoilla. Pakattu merkkijono voi siis olla myös pidempi kuin alkuperäinen merkkijono.
Sinulle annetaan pakattu merkkijono ja tehtäväsi on palauttaa siitä alkuperäinen merkkijono.

Syöte

Syötteen ainoalla rivillä on pakattu merkkijono. Sitä vastaa alkuperäinen merkkijono, jonka pituus on n ja joka muodostuu merkeistä A–Z.

Tuloste

Tulosta alkuperäinen merkkijono.

T.2
Bittijono

Ääretön bittijono on muodostettu aloittamalla jonosta 0 ja lisäämällä joka vaiheessa jonon perään senhetkinen jono niin, että jokainen bitti on käänteinen.
Bittijono alkaa siis muodostua seuraavasti:

    0
    01
    0110
    01101001
    0110100110010110
    01101001100101101001011001101001
    ...

Tehtäväsi on vastata n kyselyyn koskien bittijonon sisältöä. Jokaisessa kyselyssä sinulle annetaan kokonaisluku k ja sinun tulee ilmoittaa jonon kohdassa k oleva bitti. Bitit on numeroitu alkaen luvusta 1.

Syöte

Syötteen ensimmäisellä rivillä on kokonaisluku n: kyselyiden määrä.
Sitten syötteessä on n riviä, joista jokaisella on yksi kokonaisluku k: kohta bittijonossa.

Tuloste

Tulosta jokaiseen kyselyyn bittijonon kohdassa k oleva bitti.

T.3
Kolikot

Sinulla on n kolikkoa, joilla on tietyt arvot. Tehtäväsi on selvittää, mikä on pienin rahamäärä, jota ei voi muodostaa kolikoista.
Esimerkiksi jos kolikot ovat {2,1,2,7}, niistä voi muodostaa rahamäärät 1…5 seuraavasti:

1=1

2=2

3=2+1

4=2+2

5=2+2+1

Kuitenkaan kolikoista ei voi muodostaa rahamäärää 6.

Syöte

Syötteen ensimmäisellä rivillä on kokonaisluku n: kolikoiden määrä.
Seuraavalla rivillä on n kokonaislukua x1,x2,…,xn: kolikoiden arvot. Usealla kolikolla voi olla sama arvo.

Tuloste

Tulosta pienin rahamäärä, jota ei voi muodostaa kolikoista.

T.4
Järjestys

Annettuna on taulukko, jossa on n kokonaislukua. Jokainen luku väliltä 1…n esiintyy taulukossa tasan kerran.
Tehtäväsi on järjestää taulukon luvut pienimmästä suurimpaan kääntöjen avulla. Jokainen kääntö muuttaa taulukon k ensimmäisen luvun järjestyksen käänteiseksi, missä k on valitsemasi luku (1≤k≤n).
Sinun tulee etsiä jokin sarja kääntöjä, jotka järjestävät taulukon. Vastaus hyväksytään, jos kääntöjen määrä on enintään 5n.

Syöte

Syötteen ensimmäisellä rivillä on kokonaisluku n: taulukon koko.
Seuraavalla rivillä on n lukua, jotka kuvaavat taulukon sisällön.

Tuloste

Tulosta ensin kokonaisluku m: kääntöjen määrä (0≤m≤5n).
Tulosta sitten m lukua, joista jokainen kuvaa käännön k.

