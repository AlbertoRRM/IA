(deffacts inicio
    (dd juan maria rosa m)
    (dd juan maria luis h)
    (dd jose laura pilar m)
    (dd luis pilar miguel h)
    (dd miguel isabel jaime h)
    (dd pedro rosa pablo h)
    (dd pedro rosa begoña m)   
    )



(defrule PADRE
    (dd ?p ? ?h ?)
    =>
    (assert (PADRE ?p ?h)))


(defrule MADRE
    (dd ? ?m ?h ?)
    =>
    (assert (MADRE ?m ?h )))


(defrule HijoPadre
	    (dd ?x ? ?z h)
	    =>
	    (assert (HIJO ?z ?x)))

(defrule HijoMadre
	    (dd ? ?y ?z h)
	    =>
	    (assert (HIJO ?z ?y)))

(defrule HijaPadre
    (dd ?x ? ?z m)
    =>
   (assert (HIJA ?z ?x )))
(defrule HijaMadre
    (dd ? ?y ?z m)
    =>
   (assert (HIJA ?z ?y)))


(defrule HERMANO
    (dd ?x ?y ?z h)
    (dd ?x ?y ?w ?)
    (test(neq ?z ?w))    
    =>
   (assert (HERMANO ?w ?z)))

(defrule HERMANA
    (dd ?x ?y ?z m)
    (dd ?x ?y ?w ?)
    (test(neq ?z ?w))    
    =>
   (assert (HERMANA ?w ?z)))


(defrule AbueloPaterno
    (PADRE ?n ?p)
    (PADRE ?p ?a)
    =>
    (assert (ABUELO ?a ?n)))

(defrule AbueloMaterno
    (MADRE ?n ?m)     
    (PADRE ?m ?a)
    =>
    (assert (ABUELO ?a ?n)))
    
    
(defrule AbuelaPaterna 
    (PADRE ?n ?p)
    (MADRE ?p ?a)
    =>
    (assert (ABUELA ?a ?n))) 

(defrule AbuelaMaterna 
    (MADRE ?n ?m)
    (MADRE ?m ?a)
    =>
    (assert (ABUELA ?a ?n))) 


(defrule PrimoPadreHermano
    (PADRE ?p ?b)
    (HERMANO ?q ?p)
    (HIJO ?a ?q)
    =>
    (assert(PRIMO ?a ?b)))

(defrule PrimoPadreHermana
    (PADRE ?p ?b)
    (HERMANA ?q ?p)
    (HIJO ?a ?q)
    =>
    (assert(PRIMO ?a ?b)))

(defrule PrimoMadreHermano
    (MADRE ?p ?b)
    (HERMANO ?q ?p)
    (HIJO ?a ?q)
    =>
    (assert(PRIMO ?a ?b)))

(defrule PrimoMadreHermana
    (MADRE ?p ?b)
    (HERMANA ?q ?p)
    (HIJO ?a ?q)
    =>
    (assert(PRIMO ?a ?b)))

(defrule PrimaPadreHermano
    (PADRE ?p ?b)
    (HERMANO ?q ?p)
    (HIJA ?a ?q)
    =>
    (assert(PRIMA ?a ?b)))

(defrule PrimaPadreHermana
    (PADRE ?p ?b)
    (HERMANA ?q ?p)
    (HIJA ?a ?q)
    =>
    (assert(PRIMA ?a ?b)))

(defrule PrimaMadreHermano
    (MADRE ?p ?b)
    (HERMANO ?q ?p)
    (HIJA ?a ?q)
    =>
    (assert(PRIMA ?a ?b)))

(defrule PrimaMadreHermana
    (MADRE ?p ?b)
    (HERMANA ?q ?p)
    (HIJA ?a ?q)
    =>
    (assert(PRIMA ?a ?b)))

(defrule AscendientesPadre
    (PADRE ?p ?h)
    =>
    (assert(ASCENDIENTE ?p ?h)))
    
(defrule AscendientesMadre
    (MADRE ?m ?h)
    =>
  	(assert(ASCENDIENTE ?m ?h)))

(defrule AscendienteRecursivo
    (ASCENDIENTE ?y ?x)
    (ASCENDIENTE ?z ?y)
    =>
    (assert(ASCENDIENTE ?z ?x)))

(reset)
(set-strategy breadth)
(run)
(facts)