% Raúl Gil Fernández
% Alberto Rodríguez - Rabadán Manzanares

dd(juan, maria, rosa, m).
dd(juan, maria, luis, h).
dd(jose, laura, pilar, m). %Para abuelos
dd(luis, pilar, miguel, h).
dd(miguel,isabel,jaime,h).
dd(pedro, rosa, pablo, h).
dd(pedro, rosa, begoña, m).
%Para primos
dd(papapjl, mamapjl, pedro, h).
dd(papapjl, mamapjl, juan, h).
% Sirve para ascendiente y para primos.
dd(papapjl, mamapjl, laura, m).



padre(X, Y):- dd(X, _, Y, _).
madre(X, Y):- dd(_, X, Y, _).
hijo(X, Y):- dd(Y, _, X, h) ; dd( _, Y, x, h).
hija(X, Y):- dd(Y, _, X, m) ; dd( _, Y, x, m).
hermano(X, Y):- dd(P, M, X, h) , dd(P, M, Y, _) , (X\=Y).
hermana(X, Y):- dd(P, M, X, m) , dd(P, M, Y, _) , (X\=Y).

% Los abuelos y los primos pueden ser por parte de padre o de madre.
abuelo(X, Y) :- ( madre(M,Y) , padre(X,M));( padre(P,Y) , padre(X,P)).
abuela(X, Y) :- ( madre(M,Y) , madre(X,M));( padre(P,Y) , madre(X,P)).
primo(X, Y) :- (padre(P,Y),hermano(P,TIOA),hijo(X,TIOA)) ; (madre(M,Y),hermana(M,TIOA),hijo(X,TIOA)).
prima(X, Y) :- (padre(P,Y),hermano(P,TIOA),hija(X,TIOA)) ; (madre(M,Y),hermana(M,TIOA),hija(X,TIOA)).
% Como es recursivo, necesitamos un caso base para que acabe y no sea
% infinito.
ascendiente(X,Y) :- padre(X,Y);madre(X,Y).
ascendiente(X,Y) :- (padre(Z,Y),ascendiente(X,Z));(madre(Z,Y),ascendiente(X,Z)).