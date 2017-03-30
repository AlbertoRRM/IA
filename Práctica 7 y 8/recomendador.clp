(clear)
(mapclass User)
(mapclass App)


(deftemplate Categoria
	(slot nombre)
	(slot categoria))

(defrule Juegos 
    
	(object (is-a User) (OBJECT ?user) (nombre ?name)(Aficiones /Ocio/) (Phone_Req ?) (hasPrice ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Juegos") )))
	
(defrule Deportes
    
	(object (is-a User) (OBJECT ?user) (nombre ?name)(Aficiones /Aire Libre/) (Phone_Req ?) (hasPrice ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Deportes") )))

(defrule Deportes1
    
	(object (is-a User) (OBJECT ?user) (nombre ?name)(Aficiones /Ocio/) (Phone_Req ?) (hasPrice ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Deportes") )))

(defrule Deportes2   

	(object (is-a User) (OBJECT ?user) (nombre ?name)(Aficiones /Coches/) (Phone_Req ?) (hasPrice ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Deportes") )))

(defrule Viajes
    
	(object (is-a User) (OBJECT ?user) (nombre ?name)(Aficiones /Aire Libre/) (Phone_Req ?) (hasPrice ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Viajes") )))
(defrule Viajes1
    
    (object (is-a User) (OBJECT ?user) (nombre ?name)(Aficiones /Fiesta/) (Phone_Req ?) (hasPrice ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Viajes") )))
(defrule Viajes2
    
    (object (is-a User) (OBJECT ?user) (nombre ?name)(Aficiones /Trabajo/) (Phone_Req ?) (hasPrice ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Viajes") )))
(defrule Viajes3
    
    (object (is-a User) (OBJECT ?user) (nombre ?name)(Aficiones /Coches/) (Phone_Req ?) (hasPrice ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Viajes") )))
(defrule Noticias
    
    (object (is-a User) (OBJECT ?user) (nombre ?name)(Aficiones /Actualidad/) (Phone_Req ?) (hasPrice ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Noticias") )))
(defrule Noticias1
    
    (object (is-a User) (OBJECT ?user) (nombre ?name)(Aficiones /Lectura/) (Phone_Req ?) (hasPrice ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Noticias") )))
(defrule RedesSociales
    
    (object (is-a User) (OBJECT ?user) (nombre ?name)(Aficiones /Actualidad/) (Phone_Req ?) (hasPrice ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Redes sociales") )))
(defrule RedesSociales1
    
    (object (is-a User) (OBJECT ?user) (nombre ?name)(Aficiones /Fiesta/) (Phone_Req ?) (hasPrice ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Redes sociales") )))
(defrule RedesSociales2
    
    (object (is-a User) (OBJECT ?user) (nombre ?name)(Aficiones /Ocio/) (Phone_Req ?) (hasPrice ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Redes sociales") )))
(defrule Gastronomia
    
    (object (is-a User) (OBJECT ?user) (nombre ?name)(Aficiones /Cocinar/) (Phone_Req ?) (hasPrice ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Gastronomia") )))
(defrule Gastronomia1
    
    (object (is-a User) (OBJECT ?user) (nombre ?name)(Aficiones /Fiesta/) (Phone_Req ?) (hasPrice ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Gastronomia") )))
(defrule Gastronomia2
    
    (object (is-a User) (OBJECT ?user) (nombre ?name)(Aficiones /Cultura/) (Phone_Req ?) (hasPrice ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Gastronomia") )))
(defrule Musica
    
    (object (is-a User) (OBJECT ?user) (nombre ?name)(Aficiones /Fiesta/) (Phone_Req ?) (hasPrice ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Música") )))
(defrule Musica1
    
    (object (is-a User) (OBJECT ?user) (nombre ?name)(Aficiones /Cultura/) (Phone_Req ?) (hasPrice ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Música") )))
(defrule Educacion
    
    (object (is-a User) (OBJECT ?user) (nombre ?name)(Aficiones /Cultura/) (Phone_Req ?) (hasPrice ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Educación") )))
(defrule Educacion1
    
    (object (is-a User) (OBJECT ?user) (nombre ?name)(Aficiones /Lectura/) (Phone_Req ?) (hasPrice ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Educación") )))
(defrule Salud
    
    (object (is-a User) (OBJECT ?user) (nombre ?name)(Aficiones /Bienestar/) (Phone_Req ?) (hasPrice ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Salud") )))
(defrule Productividad
    
    (object (is-a User) (OBJECT ?user) (nombre ?name)(Aficiones /Trabajo/) (Phone_Req ?) (hasPrice ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Productividad") )))


(defrule Recomendaciones
    (Categoria (nombre ?nameu) (categoria ?categoria))
	(object (is-a User) (OBJECT ?user) (nombre ?nameu)(Phone_Req ?mu) (hasPrice ?pu) (hasAge ?eu) (Recommended $?recom))	
	(object (is-a App) (OBJECT ?app) (hasAge ?eu) (hasCategory ?category) (hasPrice ?pa) (Phone_Req ?ph))	
	(test (>= ?mu ?ph))
    (test (>= ?pu ?pa))
	(test(not(member$ ?app $?recom)))
    =>	
	(slot-insert$ ?user Recommended 1 ?app))   

   
(reset)
(run)
(facts)


















































































































(reset)
(set-strategy breadth)
(run)
(facts)