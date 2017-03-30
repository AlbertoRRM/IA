(deffacts inicio
    (dd juan maria rosa m)
    (dd juan maria luis h)
    (dd jose laura pilar m)
    (dd luis pilar miguel h)
    (dd miguel isabel jaime h)
    (dd pedro rosa pablo h)
    (dd pedro rosa begoña m)
    )


(defrule padre
    (dd ?p ? ?h ?)
    =>
    (assert (PADRE ?h ?p)))

(defrule madre
    (dd ? ?m ?h ?)
    =>
    (assert (MADRE ?h ?m )))

(defrule hijo
    (dd ?x ?y ?z h)
    =>
    (assert (HIJO ?z ?x ?y)))

(defrule hija
    (dd ?x ?y ?z m)
    =>
   (assert (HIJA ?z ?x ?y)))


(defrule hermano
    (dd ?x ?y ?z h)
    (dd ?x ?y ?w ?)
    (test(neq ?z ?w))    
    =>
   (assert (HERMANO ?w ?z)))

(defrule abuelo 
    (PADRE ?n ?p)
    (MADRE ?n ?m)
    (PADRE ?p ?a1)
    (PADRE ?m ?a2)
    =>
    (assert (ABUELO ?n ?a1))
    (assert (ABUELO ?n ?a2)))
    
    
    



(reset)
(run)
(facts)