; Raúl Gil Fernández y Alberto Rodríguez - Rabadán Manzanares
; Grupo 22
(import Model.Aplicaciones)
(import Model.Usuario)
(import Model.Categoria)
(import Model.Recomendado)
(deftemplate Aplicaciones	(declare (from-class Aplicaciones)))
(deftemplate Usuario		(declare (from-class Usuario)))
(deftemplate Recomendado	(declare (from-class Recomendado)))
(deftemplate Categoria		(declare (from-class Categoria)))


; USUARIO-CATEGORIA BASANDONOS EN LAS AFICIONES
(defrule Juegos 
    
    (Usuario (nombre ?name) (edad ?) (aficion /Ocio/) (movil ?) (precio ?) (duracion ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Juegos") )))

(defrule Deportes
    
    (Usuario (nombre ?name) (edad ?) (aficion /Aire Libre/) (movil ?) (precio ?) (duracion ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Deportes") )))

(defrule Deportes1
    
    (Usuario (nombre ?name) (edad ?) (aficion /Ocio/) (movil ?) (precio ?) (duracion ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Deportes") )))

(defrule Deportes2   
    (Usuario (nombre ?name) (edad ?) (aficion /Coches/) (movil ?) (precio ?) (duracion ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Deportes") )))

(defrule Viajes
    
    (Usuario (nombre ?name) (edad ?) (aficion /Aire Libre/) (movil ?) (precio ?) (duracion ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Viajes") )))
(defrule Viajes1
    
    (Usuario (nombre ?name) (edad ?) (aficion /Fiesta/) (movil ?) (precio ?) (duracion ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Viajes") )))
(defrule Viajes2
    
    (Usuario (nombre ?name) (edad ?) (aficion /Trabajo/) (movil ?) (precio ?) (duracion ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Viajes") )))
(defrule Viajes3
    
    (Usuario (nombre ?name) (edad ?) (aficion /Coches/) (movil ?) (precio ?) (duracion ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Viajes") )))
(defrule Noticias
    
    (Usuario (nombre ?name) (edad ?) (aficion /Actualidad/) (movil ?) (precio ?) (duracion ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Noticias") )))
(defrule Noticias1
    
    (Usuario (nombre ?name) (edad ?) (aficion /Lectura/) (movil ?) (precio ?) (duracion ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Noticias") )))
(defrule RedesSociales
    
    (Usuario (nombre ?name) (edad ?) (aficion /Actualidad/) (movil ?) (precio ?) (duracion ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Redes sociales") )))
(defrule RedesSociales1
    
    (Usuario (nombre ?name) (edad ?) (aficion /Fiesta/) (movil ?) (precio ?) (duracion ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Redes sociales") )))
(defrule RedesSociales2
    
    (Usuario (nombre ?name) (edad ?) (aficion /Ocio/) (movil ?) (precio ?) (duracion ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Redes sociales") )))
(defrule Gastronomia
    
    (Usuario (nombre ?name) (edad ?) (aficion /Cocinar/) (movil ?) (precio ?) (duracion ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Gastronomia") )))
(defrule Gastronomia1
    
    (Usuario (nombre ?name) (edad ?) (aficion /Fiesta/) (movil ?) (precio ?) (duracion ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Gastronomia") )))
(defrule Gastronomia2
    
    (Usuario (nombre ?name) (edad ?) (aficion /Cultura/) (movil ?) (precio ?) (duracion ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Gastronomia") )))
(defrule Musica
    
    (Usuario (nombre ?name) (edad ?) (aficion /Fiesta/) (movil ?) (precio ?) (duracion ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Música") )))
(defrule Musica1
    
    (Usuario (nombre ?name) (edad ?) (aficion /Cultura/) (movil ?) (precio ?) (duracion ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Música") )))
(defrule Educacion
    
    (Usuario (nombre ?name) (edad ?) (aficion /Cultura/) (movil ?) (precio ?) (duracion ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Educación") )))
(defrule Educacion1
    
    (Usuario (nombre ?name) (edad ?) (aficion /Lectura/) (movil ?) (precio ?) (duracion ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Educación") )))
(defrule Salud
    
    (Usuario (nombre ?name) (edad ?) (aficion /Bienestar/) (movil ?) (precio ?) (duracion ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Salud") )))
(defrule Productividad
    
    (Usuario (nombre ?name) (edad ?) (aficion /Trabajo/) (movil ?) (precio ?) (duracion ?))
    =>
    (assert(Categoria (nombre ?name) (categoria "Productividad") )))


;APLICACIONES
(defrule Recomendaciones
    (Categoria (nombre ?nameu) (categoria ?categoria))
    (Usuario (nombre ?nameu) (edad ?eu) (aficion ?) (movil ?mu) (precio ?pu) (duracion ?du))
    (Aplicaciones (nombre ?nombreaplicacion) (duracion ?da) (valoracion ?valoracion) (nDescargas ?ndescarg) (categoria ?categoria) (movil ?ma) (precio ?pa) (edadMinima ?edadminima))
    (test (>= ?mu ?ma))
    (test (>= ?pu ?pa))
    (test (>= ?du ?da))
    (test (>= ?eu  ?edadminima))
    =>	
    (assert(Recomendado(usuario ?nameu) (app ?nombreaplicacion) (categorias ?categoria ) (valoracion ?valoracion)(nDescargas ?ndescarg))))



















































































































(reset)
(set-strategy breadth)
(run)
(facts)