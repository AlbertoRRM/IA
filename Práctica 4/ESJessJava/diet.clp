; programa en Jess con ejemplos de entrada/salida desde Java
(deftemplate usuario "Datos sobre el usuario. Serán rellenados desde Java"
	(slot edad)
    (slot sexo)
    (slot altura)
    (slot peso)
    (slot actividadFisica)
    (slot calMax (default 0)))

(deftemplate menu "menú elegido para la comida"
	(slot primero (default vacio))
    (slot segundo (default vacio))
    (slot postre (default vacio))
    (slot calorias (default 0))
    )

(deffunction calculaCalorias (?peso ?altura ?edad ?sexo ?actividadFisica)
	(if (= ?sexo h) then (bind ?resultado (* (- (+ 66 (* 13.7 ?peso) (* 5 ?altura)) (* 6.8 ?edad)) ?actividadFisica))
	else (bind ?resultado (* (- (+ 665 (* 9.6 ?peso) (* 1.8 ?altura)) (* 4.7 ?edad)) ?actividadFisica)))
	(return ?resultado)        
)

(defrule genera "genera menú fijo y almacena primer plato en la tabla hash que podrá ser leída desde Java"
 ?h1 <- (usuario (edad ?edad) (sexo ?sexo) (altura ?altura) (peso ?peso) (actividadFisica ?actividadFisica)) 
    => 
 (modify ?h1 (calMax (round (calculaCalorias ?peso ?altura ?edad ?sexo ?actividadFisica))))
 (assert (menu (primero sopa) (segundo pollo) (postre flan) 
            (calorias 600))) 
     )
