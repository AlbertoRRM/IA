(clear)
(mapclass :THING)
(mapclass App)

(mapclass Age)

(mapclass Children)
(defrule set-Age0
	(object (is-a App) (OBJECT ?app) (hasAge Children))
	(object (is-a :STANDARD-CLASS) (:NAME "Children") (:DIRECT-INSTANCES $?list))
	=>
	(slot-set "Children" :DIRECT-INSTANCES
	(insert$ ?list (+ 1 (length$ ?list)) ?app)))

(mapclass All)
(defrule set-Age1
	(object (is-a App) (OBJECT ?app) (hasAge All))
	(object (is-a :STANDARD-CLASS) (:NAME "All") (:DIRECT-INSTANCES $?list))
	=>
	(slot-set "All" :DIRECT-INSTANCES
	(insert$ ?list (+ 1 (length$ ?list)) ?app)))

(mapclass Adults)
(defrule set-Age2
	(object (is-a App) (OBJECT ?app) (hasAge Adults))
	(object (is-a :STANDARD-CLASS) (:NAME "Adults") (:DIRECT-INSTANCES $?list))
	=>
	(slot-set "Adults" :DIRECT-INSTANCES
	(insert$ ?list (+ 1 (length$ ?list)) ?app)))

	
(mapclass Category)

(mapclass Education)
(defrule set-Category0
	(object (is-a App) (OBJECT ?app) (hasCategory Education))
	(object (is-a :STANDARD-CLASS) (:NAME "Education") (:DIRECT-INSTANCES $?list))
	=>
	(slot-set "Education" :DIRECT-INSTANCES
	(insert$ ?list (+ 1 (length$ ?list)) ?app)))
	
(mapclass Category)

(mapclass Games)
(defrule set-Category1
	(object (is-a App) (OBJECT ?app) (hasCategory Games))
	(object (is-a :STANDARD-CLASS) (:NAME "Games") (:DIRECT-INSTANCES $?list))
	=>
	(slot-set "Games" :DIRECT-INSTANCES
	(insert$ ?list (+ 1 (length$ ?list)) ?app)))
	
(mapclass Gastronomy)
(defrule set-Category2
	(object (is-a App) (OBJECT ?app) (hasCategory Gastronomy))
	(object (is-a :STANDARD-CLASS) (:NAME "Gastronomy") (:DIRECT-INSTANCES $?list))
	=>
	(slot-set "Gastronomy" :DIRECT-INSTANCES
	(insert$ ?list (+ 1 (length$ ?list)) ?app)))

(mapclass Health)
(defrule set-Category3
	(object (is-a App) (OBJECT ?app) (hasCategory Health))
	(object (is-a :STANDARD-CLASS) (:NAME "Health") (:DIRECT-INSTANCES $?list))
	=>
	(slot-set "Health" :DIRECT-INSTANCES
	(insert$ ?list (+ 1 (length$ ?list)) ?app)))
	
(mapclass Music)
(defrule set-Category4
	(object (is-a App) (OBJECT ?app) (hasCategory Music))
	(object (is-a :STANDARD-CLASS) (:NAME "Music") (:DIRECT-INSTANCES $?list))
	=>
	(slot-set "Music" :DIRECT-INSTANCES
	(insert$ ?list (+ 1 (length$ ?list)) ?app)))
	
(mapclass News)
(defrule set-Category5
	(object (is-a App) (OBJECT ?app) (hasCategory News))
	(object (is-a :STANDARD-CLASS) (:NAME "News") (:DIRECT-INSTANCES $?list))
	=>
	(slot-set "News" :DIRECT-INSTANCES
	(insert$ ?list (+ 1 (length$ ?list)) ?app)))

(mapclass Productivity)
(defrule set-Category6
	(object (is-a App) (OBJECT ?app) (hasCategory Productivity))
	(object (is-a :STANDARD-CLASS) (:NAME "Productivity") (:DIRECT-INSTANCES $?list))
	=>
	(slot-set "Productivity" :DIRECT-INSTANCES
	(insert$ ?list (+ 1 (length$ ?list)) ?app)))
	
(mapclass Social_Media)
(defrule set-Category7
	(object (is-a App) (OBJECT ?app) (hasCategory Social_Media))
	(object (is-a :STANDARD-CLASS) (:NAME "Social_Media") (:DIRECT-INSTANCES $?list))
	=>
	(slot-set "Social_Media" :DIRECT-INSTANCES
	(insert$ ?list (+ 1 (length$ ?list)) ?app)))
	
(mapclass Sports)
(defrule set-Category8
	(object (is-a App) (OBJECT ?app) (hasCategory Sports))
	(object (is-a :STANDARD-CLASS) (:NAME "Sports") (:DIRECT-INSTANCES $?list))
	=>
	(slot-set "Sports" :DIRECT-INSTANCES
	(insert$ ?list (+ 1 (length$ ?list)) ?app)))
	
(mapclass Travelling)
(defrule set-Category9
	(object (is-a App) (OBJECT ?app) (hasCategory Travelling))
	(object (is-a :STANDARD-CLASS) (:NAME "Travelling") (:DIRECT-INSTANCES $?list))
	=>
	(slot-set "Travelling" :DIRECT-INSTANCES
	(insert$ ?list (+ 1 (length$ ?list)) ?app)))
	
(mapclass Price)

(mapclass Free)
(defrule set-Price0
	(object (is-a App) (OBJECT ?app) (hasPrice 0.0))
	(object (is-a :STANDARD-CLASS) (:NAME "Free") (:DIRECT-INSTANCES $?list))
	=>
	(slot-set "Free" :DIRECT-INSTANCES
	(insert$ ?list (+ 1 (length$ ?list)) ?app)))
	
(mapclass Paid)
(defrule set-Price1
	(object (is-a App) (OBJECT ?app) (hasPrice ?price))
	(test(> ?price 0))
	(object (is-a :STANDARD-CLASS) (:NAME "Paid") (:DIRECT-INSTANCES $?list))
	=>
	(slot-set "Paid" :DIRECT-INSTANCES
	(insert$ ?list (+ 1 (length$ ?list)) ?app)))
	
(mapclass Rate)

(mapclass 1_Star)
(defrule set-Rate0
	(object (is-a App) (OBJECT ?app) (hasRate 1_Star))
	(object (is-a :STANDARD-CLASS) (:NAME "1_Star") (:DIRECT-INSTANCES $?list))
	=>
	(slot-set "1_Star" :DIRECT-INSTANCES
	(insert$ ?list (+ 1 (length$ ?list)) ?app)))
	
(mapclass 2_Star)
(defrule set-Rate1
	(object (is-a App) (OBJECT ?app) (hasRate 2_Star))
	(object (is-a :STANDARD-CLASS) (:NAME "2_Star") (:DIRECT-INSTANCES $?list))
	=>
	(slot-set "2_Star" :DIRECT-INSTANCES
	(insert$ ?list (+ 1 (length$ ?list)) ?app)))
	
(mapclass 3_Star)
(defrule set-Rate2
	(object (is-a App) (OBJECT ?app) (hasRate 3_Star))
	(object (is-a :STANDARD-CLASS) (:NAME "3_Star") (:DIRECT-INSTANCES $?list))
	=>
	(slot-set "3_Star" :DIRECT-INSTANCES
	(insert$ ?list (+ 1 (length$ ?list)) ?app)))
	
(mapclass 4_Star)
(defrule set-Rate3
	(object (is-a App) (OBJECT ?app) (hasRate 4_Star))
	(object (is-a :STANDARD-CLASS) (:NAME "4_Star") (:DIRECT-INSTANCES $?list))
	=>
	(slot-set "4_Star" :DIRECT-INSTANCES
	(insert$ ?list (+ 1 (length$ ?list)) ?app)))
	
(mapclass 5_Star)
(defrule set-Rate4
	(object (is-a App) (OBJECT ?app) (hasRate 5_Star))
	(object (is-a :STANDARD-CLASS) (:NAME "5_Star") (:DIRECT-INSTANCES $?list))
	=>
	(slot-set "5_Star" :DIRECT-INSTANCES
	(insert$ ?list (+ 1 (length$ ?list)) ?app)))

(mapclass SO)

(mapclass Android)
(defrule set-OS0
	(object (is-a App) (OBJECT ?app) (OS Android))
	(object (is-a :STANDARD-CLASS) (:NAME "Android") (:DIRECT-INSTANCES $?list))
	=>
	(slot-set "Android" :DIRECT-INSTANCES
	(insert$ ?list (+ 1 (length$ ?list)) ?app)))
	
(mapclass Both)
(defrule set-OS1
	(object (is-a App) (OBJECT ?app) (OS Both))
	(object (is-a :STANDARD-CLASS) (:NAME "Both") (:DIRECT-INSTANCES $?list))
	=>
	(slot-set "Both" :DIRECT-INSTANCES
	(insert$ ?list (+ 1 (length$ ?list)) ?app)))
	
(mapclass iOS)
(defrule set-OS2
	(object (is-a App) (OBJECT ?app) (OS iOS))
	(object (is-a :STANDARD-CLASS) (:NAME "iOS") (:DIRECT-INSTANCES $?list))
	=>
	(slot-set "iOS" :DIRECT-INSTANCES
	(insert$ ?list (+ 1 (length$ ?list)) ?app)))
	
(reset)
(run)
(facts)
