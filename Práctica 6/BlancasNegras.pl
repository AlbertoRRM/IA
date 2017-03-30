/*
 * Integrantes grupo:
 *
 * Raúl Gil Fernández
 * Alberto Rodriguez
 *
*/

%   "BLANCAS Y NEGRAS"


/* Utilizamos esta funcion para pintar Ops ya que si la pintamos normal
 * saldrían los iteradores de mayor a menor(Ops se va creando a medida
 * que avanza la recursion)
*/
pintarOps([]):- true.
pintarOps([(Op,Iterador)|Resto]):-
	      pintarOps(Resto),
	      write([Op,Iterador]),nl.

/* Utilizada para pintar la lista caminos.
 * que está ordenada ya se crea en la subida de la recursión).
*/
pintarlista([]):-true.
pintarlista([Cabeza,Segundo|Resto]):-
	write(Cabeza),write(" -> "),write(Segundo),write(" -> "),
	nl,
	pintarlista(Resto).

/*
 * Utilizada para pintar Visitados ya que esta lista se crea al
 * bajar en la recursión y por lo tanto la lista dentro de la
 * variable está invertida.
	*/
pintarlistaordeninverso([]):-true.
pintarlistaordeninverso([Cabeza|Resto]):-
	pintarlistaordeninverso(Resto),
	write(Cabeza),nl.


/*
 * FUNCION RESOLVER:
 *
 **** Argumentos:
 * 1.Estado: Entrada. // Indica el estado en ese punto de la ejecución.
 * 2.Visitados:Entrada. //Se crea la lista con los estados por los que
 * el programa pasa a medida que se hacen llamadas recursivas.
 * 3.Operadores:Entrada.  //Igual que visitados.
 * 4.Caminos: Salida. //En consulta se llama a resolver con esta
 * variable sin "atar". Cuando la recursion vuelve hacia atrás se va
 * formando de ahí que en la cabecera de mover se defina caminos como
 * [Estado,Camino]

 ** Caso Base:
 * 1.Comprueba si el estado actual es objetivo.
 * 1.1 Si lo es pinta los estados visitados y los operadores utilizados
 * hasta hallar la solución.
 * 1.2 Si no lo es falla e intentaria aplicarse la parte recursiva.

 ** Caso Recursivo.
 * 1.Incrementa el operador.
 * 2.Llama a la funcion movimiento la cual nos devuelve un operador(OP1)
 * y el estado resultado de aplicar el operador al estado (Estado).
 * 3.Comprueba si el estado devuelto por mover(Sig) está en la lista
 * de visitados.
     3.1 En caso de que si estuviera, la función haria backtracking
     hasta movimiento() para devolver un nuevo OP1 y Sig si es posible
     aplicar otro operador. 3.2 En caso de que no estuviera, llamar de
     nuevo a resolver pero con los parametro de entrada actualizados
     (Visitados y Operadores).
 *
 *
*/
resolver(Estado, Visitados, Ops, [] ):-
	estObjetivo(Estado), nl,
	write('Estados visitados: '),nl,
	pintarlistaordeninverso(Visitados),nl,
	write('Operadores utilizados en el recorrido: '),nl,
	pintarOps(Ops),nl.

resolver(Estado, Visitados,[(Op2,Iterador)|Resto], [Estado|Camino]):-
	J is (Iterador+1),
	movimiento(Estado, Sig, Op1),
	\+ member(Sig, Visitados),
	resolver(Sig, [Sig|Visitados],[(Op1,J),(Op2,Iterador)|Resto], Camino).


/*FUNCION CONSULTA:
 *
 * Se llama a esta función para resolver el puzzle.
 * Fija el estadoInicial en la variable Estado
 * Fija la lista de operadores inicial en Ops
 * Llama a resolver con las variables:
 * Estado: entrada.
 * Visitados como [Estado]:entrada.
 * Ops: entrada.
 * Camino:Salida.
	*/
consulta :- estadoInicial(Estado),operadoresIni(Ops),resolver(Estado, [Estado], Ops, Camino), nl,
		write('Estados del camino: '), nl, write(Camino).

/*
 * ESTADO:
 *
 * Predicado base del programa.
 * Tiene la forma:
 *   estado(Lista).
 *
 *   Lista es una lista que tiene las 7 fichas.
 *   Ej. Lista=[n,n,n,gap,b,b,b]
 *
		*/


/* Definimos el estado inicial y la lista de operadores inicial.*/

estadoInicial(estado([n,n,n,gap,b,b,b])).
operadoresIni([(inicio,0)]).


/* Definimos los estados objetivo. */

estObjetivo(estado([b,b,b,gap,n,n,n])).
estObjetivo(estado([b,b,gap,b,n,n,n])).
estObjetivo(estado([b,gap,b,b,n,n,n])).
estObjetivo(estado([gap,b,b,b,n,n,n])).
estObjetivo(estado([b,b,b,n,gap,n,n])).
estObjetivo(estado([b,b,b,n,n,gap,n])).
estObjetivo(estado([b,b,b,n,n,n,gap])).


/* OPERACIONES.
 * Definidas las distintas operaciones que pueden darse.
 *
 * Argumentos:
 *       movimiento(Estado, Sig , Op) :-operador(Estado,Sig).
 * Estado: entrada.
 * Sig y Op: salida.
*/

movimiento(estado(L1), estado(L2), 'IZQUIERDA') :- izquierda(L1, L2).

movimiento(estado(L1), estado(L2), 'DERECHA') :- derecha(L1, L2).

movimiento(estado(L1), estado(L2), 'SALTO IZQUIERDA') :- saltoizquierda(L1, L2).

movimiento(estado(L1), estado(L2), 'SALTO DERECHA') :- saltoderecha(L1, L2).

movimiento(estado(L1), estado(L2), 'DOBLE SALTO IZQUIERDA') :- dobleizquierda(L1, L2).

movimiento(estado(L1), estado(L2), 'DOBLE SALTO DERECHA') :- doblederecha(L1, L2).


/*
 * OPERADORES.
 *
 * Uno para cada uno de los movimientos disponibles.
 * Definición de caso base y de caso recursivo.
 * Caso Base:
 *    Ejecuta el movimiento.
 * Caso Recursivo:
 *    Avanza en la lista y hacer la llamada recursiva.
 *
*/

% Movimientos. Casos base y casos recursivos

izquierda([gap,X|R], [X,gap|R]).
izquierda([X|R],[X|R2]) :- izquierda(R,R2).

derecha([X,gap|R], [gap,X|R]).
derecha([X|R],[X|R2]) :- derecha(R,R2).

saltoizquierda([gap,X,Y|R], [Y,X,gap|R]).
saltoizquierda([X|R],[X|R2]) :- saltoizquierda(R,R2).

saltoderecha([Y,X,gap|R], [gap,X,Y|R]).
saltoderecha([X|R],[X|R2]) :- saltoderecha(R,R2).

dobleizquierda([gap,X,Z,Y|R], [Y,X,Z,gap|R]).
dobleizquierda([X|R],[X|R2]) :- dobleizquierda(R,R2).

doblederecha([Y,X,Z,gap|R], [gap,X,Z,Y|R]).
doblederecha([X|R],[X|R2]) :- doblederecha(R,R2).


/* OBSERVACIONES:

  Si utilizamos pintarOps y pintarlistaordeninverso a la vez en este
  programa, hay información que no se muestra en la terminal.
  Dejamos por defecto que se pinten los operadores( pintarOps) y que la
  lista de caminos que utilizaria pintarlistaordeninverso, se pinte
  normal con write(caminos).
  Si se quiere ver en orden cambier write por pintarlistaordeninverso al
  final de la funcion consulta ( El inicio de los estados visitados no
  entrará dentro de la terminal de prolog ).
*/
