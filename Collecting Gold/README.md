**Collecting Gold**


Time limit: 2480 ms

Memory limit: 264 MB

Ariadne is the queen of Knossos in Crete and she is the ruler of all the cities and villages in the Mediterranean basin. Ariadne is in great need of gold. Her geographers put a unique id on every city/village that represents the kilos of gold that can be extracted from that city/village. The id is an integer kkk (1≤k≤10181 \leq k \leq 10^{18}1≤k≤10​18​​ ). The kilos of gold for every city/village can be calculated from the id as follows:

    Kilos = the number of unique consecutive prime numbers, starting from number 222, such that their product is less or equal than the id of the city/village 

For example if the city id is 404040 the kilos of gold that can be extracted is 333 (2∗3∗5=30≤40)(2 * 3 * 5 = 30 \leq 40)(2∗3∗5=30≤40).

Ariadne is sending a mission to collect the gold. The mission will start from the city/village with the smallest id and will finish at the city/village with the biggest id, following one of the shortest routes between the two cities. The distance between two cities is given as it is described below in input.

There is always a route that connects the starting and finishing cities.
Standard input

The first line contains two integers nnn and mmm, where nnn represents the number of cities/villages and mmm the number of the connections between them.

Each of the next nnn lines contains the id of a city/village.

Each of the next mmm lines contains three integers xxx, yyy, ddd and represents the connection from xxx to yyy with distance ddd . The connections are not directed.
Standard output

One integer, the maximum kilos of gold that the mission can collect.
Constraints

    1≤n≤2∗1041 \leq n \leq 2 * 10^41≤n≤2∗10​4​​
    0≤m≤2∗1040 \leq m \leq 2 * 10^40≤m≤2∗10​4​​
    1≤k≤10181 \leq k \leq 10^{18}1≤k≤10​18​​, all kkk are unique
    1≤x,y≤10181 \leq x, y \leq 10^{18}1≤x,y≤10​18​​
    0<d≤1050 \lt d \leq 10^{5}0<d≤10​5​​ 
