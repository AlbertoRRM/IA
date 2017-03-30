(clear)

(deftemplate AppJess
	(slot Developer)
	(slot Downloads)
	(slot hasAge)
	(slot hasCategory)
	(slot hasPrice)
	(slot hasRate)
	(slot hasSO)
	(slot name)
	(slot Phone_Req))

(deffacts ini
 	(AppJess (Developer "Duolingo") (Downloads 4000000.0) (hasAge "All") (hasCategory "Education") (hasPrice 0.0) (hasRate "5_Star") (hasSO "Both") (name "Duolingo") (Phone_Req 1))

	(AppJess (Developer "Photomath, Inc") (Downloads 700000.0) (hasAge "Adults") (hasCategory "Education") (hasPrice 20.0) (hasRate "5_Star") (hasSO "Both") (name "Photomath") (Phone_Req 2))

	(AppJess (Developer "Noctua Software Limited") (Downloads 100000.0) (hasAge "Children") (hasCategory "Education") (hasPrice 2.59) (hasRate "5_Star") (hasSO "Both") (name "Stellarium Mobile Sky Map") (Phone_Req 3))

	(AppJess (Developer "Autoinet") (Downloads 1000000.0) (hasAge "Adults") (hasCategory "Education") (hasPrice 0.0) (hasRate "4_Star") (hasSO "Both") (name "TodoTest") (Phone_Req 1))

	(AppJess (Developer "Udemy") (Downloads 1000000.0) (hasAge "Adults") (hasCategory "Education") (hasPrice 0.0) (hasRate "4_Star") (hasSO "Android") (name "Udemy Online Courses") (Phone_Req 3))

	(AppJess (Developer "Rovio") (Downloads 100000000.0) (hasAge "Children") (hasCategory "Games") (hasPrice 0.0) (hasRate "4_Star") (hasSO "Both") (name "Angry Birds") (Phone_Req 1))

	(AppJess (Developer "RobTop") (Downloads 1000000.0) (hasAge "All") (hasCategory "Games") (hasPrice 1.99) (hasRate "5_Star") (hasSO "Android") (name "Geometry Dash") (Phone_Req 1))

	(AppJess (Developer "RockStar") (Downloads 1000000.0) (hasAge "Adults") (hasCategory "Games") (hasPrice 4.99) (hasRate "4_Star") (hasSO "Both") (name "GTA: Vice City") (Phone_Req 3))

	(AppJess (Developer Mojan) (Downloads 10000000.0) (hasAge "Children") (hasCategory "Games") (hasPrice 6.99) (hasRate "5_Star") (hasSO "Both") (name "Minecraft") (Phone_Req 3))

	(AppJess (Developer "Gameloft") (Downloads 10000000.0) (hasAge "All") (hasCategory "Games") (hasPrice 2.99) (hasRate "3_Star") (hasSO "iOS") (name "Star Batallion") (Phone_Req 3))

	(AppJess (Developer "Lakefront Software") (Downloads 2000000.0) (hasAge "Adults") (hasCategory "Gastronomy") (hasPrice 10.0) (hasRate "4_Star") (hasSO "iOS") (name "BigOven") (Phone_Req 3))

	(AppJess (Developer "Just-Eat Holding Limited") (Downloads 1000000.0) (hasAge "Adults") (hasCategory "Gastronomy") (hasPrice 0.0) (hasRate "3_Star") (hasSO "Both") (name "Just Eat") (Phone_Req 1))

	(AppJess (Developer "Michelin") (Downloads 500.0) (hasAge "Adults") (hasCategory "Gastronomy") (hasPrice 14.99) (hasRate "4_Star") (hasSO "Android") (name "Michelin Guide Europe 2017") (Phone_Req 2))

	(AppJess (Developer "Retails Media SL") (Downloads 10000.0) (hasAge "Adults") (hasCategory "Gastronomy") (hasPrice 0.0) (hasRate "3_Star") (hasSO "Android") (name "Ruttapa") (Phone_Req 1))

	(AppJess (Developer "LaFourchette") (Downloads 1000000.0) (hasAge "Adults") (hasCategory "Gastronomy") (hasPrice 0.0) (hasRate "4_Star") (hasSO "Both") (name "The Fork") (Phone_Req 1))

	(AppJess (Developer "Comunidad de Madrid") (Downloads 200000.0) (hasAge "Adults") (hasCategory "Health") (hasPrice 0.0) (hasRate "2_Star") (hasSO "Android") (name "Cita Sanitaria Madrid") (Phone_Req 1))

	(AppJess (Developer "Apple") (Downloads 2000000.0) (hasAge "Adults") (hasCategory "Health") (hasPrice 4.99) (hasRate "4_Star") (hasSO "iOS") (name "Heath App") (Phone_Req 3))

	(AppJess (Developer "Sanitas") (Downloads 100000.0) (hasAge "Adults") (hasCategory "Health") (hasPrice 0.0) (hasRate "3_Star") (hasSO "Android") (name "Mi Sanitas") (Phone_Req 2))

	(AppJess (Developer "Xiaomi Technology") (Downloads 5000000.0) (hasAge "Adults") (hasCategory "Health") (hasPrice 2.99) (hasRate "3_Star") (hasSO "iOS") (name "MiFit") (Phone_Req 2))

	(AppJess (Developer "GP International") (Downloads 5000000.0) (hasAge "Adults") (hasCategory "Health") (hasPrice 0.0) (hasRate "5_Star") (hasSO "Both") (name "Period Tracker") (Phone_Req 1))

	(AppJess (Developer "Technimo") (Downloads 100000.0) (hasAge "Adults") (hasCategory "Music") (hasPrice 10.99) (hasRate "5_Star") (hasSO "iOS") (name "iReal Pro MusicBook") (Phone_Req 3))

	(AppJess (Developer "Musixmatch") (Downloads 10000000.0) (hasAge "All") (hasCategory "Music") (hasPrice 0.0) (hasRate "4_Star") (hasSO "iOS") (name "Musixmatch Lyrics") (Phone_Req 1))

	(AppJess (Developer "Max MP") (Downloads 1000000.0) (hasAge "All") (hasCategory "Music") (hasPrice 3.5) (hasRate "4_Star") (hasSO "Android") (name "PowerAmp") (Phone_Req 1))

	(AppJess (Developer "SoundCloud") (Downloads 100000000.0) (hasAge "Adults") (hasCategory "Music") (hasPrice 10.99) (hasRate "3_Star") (hasSO "Both") (name "SoundCloud") (Phone_Req 2))

	(AppJess (Developer "Spotify Ltd") (Downloads 100000000.0) (hasAge "All") (hasCategory "Music") (hasPrice 0.0) (hasRate "5_Star") (hasSO "Both") (name "Spotify") (Phone_Req 3))

	(AppJess (Developer "BlaBlaCar") (Downloads 10000000.0) (hasAge "Adults") (hasCategory "Travelling") (hasPrice 0.0) (hasRate "4_Star") (hasSO "Both") (name "BlaBlaCar") (Phone_Req 1))

	(AppJess (Developer "Booking.com") (Downloads 50000000.0) (hasAge "Adults") (hasCategory "Travelling") (hasPrice 0.0) (hasRate "5_Star") (hasSO "Android") (name "Booking") (Phone_Req 2))

	(AppJess (Developer "FlightRadar24 AB") (Downloads 1000000.0) (hasAge "Adults") (hasCategory "Travelling") (hasPrice 2.49) (hasRate "5_Star") (hasSO "Both") (name "FlightRadar24") (Phone_Req 3))

	(AppJess (Developer "Renfe Viajeros") (Downloads 1000000.0) (hasAge "Adults") (hasCategory "Travelling") (hasPrice 1.99) (hasRate "3_Star") (hasSO "Both") (name "Renfe Tickets") (Phone_Req 1))

	(AppJess (Developer "Skyscanner Ltd") (Downloads 10000000.0) (hasAge "Adults") (hasCategory "Travelling") (hasPrice 2.99) (hasRate "5_Star") (hasSO "iOS") (name "Skyscanner") (Phone_Req 2))

	(AppJess (Developer "INTSIG") (Downloads 500000.0) (hasAge "All") (hasCategory "Productivity") (hasPrice 2.29) (hasRate "5_Star") (hasSO "Both") (name "CamScanner") (Phone_Req 2))

	(AppJess (Developer "Evernote Corporation") (Downloads 100000000.0) (hasAge "All") (hasCategory "Productivity") (hasPrice 0.0) (hasRate "5_Star") (hasSO "Both") (name "Evernote") (Phone_Req 1))

	(AppJess (Developer "Autodesc Inc") (Downloads 10000000.0) (hasAge "Adults") (hasCategory "Productivity") (hasPrice 0.0) (hasRate "4_Star") (hasSO "Android") (name "AutoCAD 360") (Phone_Req 3))

	(AppJess (Developer "Wallwisher Inc") (Downloads 100000.0) (hasAge "Adults") (hasCategory "Productivity") (hasPrice 1.99) (hasRate "4_Star") (hasSO "iOS") (name "Padlet") (Phone_Req 2))

	(AppJess (Developer "Fast Access") (Downloads 1000.0) (hasAge "Adults") (hasCategory "Productivity") (hasPrice 0.0) (hasRate "5_Star") (hasSO "Android") (name "FastHub for GitHub") (Phone_Req 2))

	(AppJess (Developer "Instagram") (Downloads 1000000000000.0) (hasAge "All") (hasCategory "Social_Media") (hasPrice 0.0) (hasRate "5_Star") (hasSO "Both") (name "Instagram") (Phone_Req 2))

	(AppJess (Developer "JPPC") (Downloads 1000.0) (hasAge "Adults") (hasCategory "Social_Media") (hasPrice 1.49) (hasRate "2_Star") (hasSO "Android") (name "Omegle") (Phone_Req 2))

	(AppJess (Developer "Tapatalk Inc") (Downloads 100000.0) (hasAge "All") (hasCategory "Social_Media") (hasPrice 3.29) (hasRate "4_Star") (hasSO "Both") (name "Tapatalk Pro") (Phone_Req 1))

	(AppJess (Developer "Snap Inc") (Downloads 500000000.0) (hasAge "All") (hasCategory "Social_Media") (hasPrice 0.0) (hasRate "4_Star") (hasSO "Both") (name "Snapchat") (Phone_Req 2))

	(AppJess (Developer "Alina Lyvette") (Downloads 50000.0) (hasAge "Adults") (hasCategory "Social_Media") (hasPrice 3.19) (hasRate "4_Star") (hasSO "iOS") (name "Lumiya") (Phone_Req 3))

	(AppJess (Developer "Dorna Sports S.L.") (Downloads 100000.0) (hasAge "All") (hasCategory "Sports") (hasPrice 0.0) (hasRate "4_Star") (hasSO "Both") (name "MotoGP") (Phone_Req 2))

	(AppJess (Developer "aortizgasoft") (Downloads 1000.0) (hasAge "Adults") (hasCategory "Sports") (hasPrice 4.69) (hasRate "5_Star") (hasSO "Android") (name "Basketball Statistics") (Phone_Req 1))

	(AppJess (Developer "Formula One Digital Media Limited") (Downloads 1000000.0) (hasAge "All") (hasCategory "Sports") (hasPrice 0.0) (hasRate "4_Star") (hasSO "Both") (name "Official F1 App") (Phone_Req 2))

	(AppJess (Developer "BeSoccer Apps") (Downloads 5000000.0) (hasAge "All") (hasCategory "Sports") (hasPrice 0.0) (hasRate "5_Star") (hasSO "iOS") (name "BeSoccer") (Phone_Req 1))

	(AppJess (Developer "Hillside Technology Limited") (Downloads 500000.0) (hasAge "Adults") (hasCategory "Sports") (hasPrice 2.99) (hasRate "3_Star") (hasSO "Both") (name "bet365 News") (Phone_Req 2))

	(AppJess (Developer "Flipboard") (Downloads 500000000.0) (hasAge "All") (hasCategory "News") (hasPrice 0.0) (hasRate "4_Star") (hasSO "Android") (name "Flipboard: News for any topic") (Phone_Req 2))

	(AppJess (Developer "AppDawn") (Downloads 1000.0) (hasAge "Adults") (hasCategory "News") (hasPrice 0.59) (hasRate "5_Star") (hasSO "Both") (name "News Reader Pro") (Phone_Req 1))

	(AppJess (Developer "Shifty Jelly") (Downloads 500000.0) (hasAge "All") (hasCategory "News") (hasPrice 2.99) (hasRate "5_Star") (hasSO "iOS") (name "Pocket Casts") (Phone_Req 2))

	(AppJess (Developer "El Pa�s") (Downloads 1000000.0) (hasAge "All") (hasCategory "News") (hasPrice 0.0) (hasRate "4_Star") (hasSO "Both") (name "El Pa�s") (Phone_Req 1))

	(AppJess (Developer "Guardian News & Media Ltd") (Downloads 1000000.0) (hasAge "Adults") (hasCategory "News") (hasPrice 0.0) (hasRate "5_Star") (hasSO "Both") (name "The Guardian") (Phone_Req 2))

	)

(mapclass App)
(defrule cargarApps
	(AppJess (Developer ?d) (Downloads ?dw) (hasAge ?a)(hasCategory ?c) (hasPrice ?p) (hasRate ?r)(hasSO ?os) (name ?n) (Phone_Req ?ph))
	=>
	(make-instance of App (Developer ?d) (Downloads ?dw) (hasAge ?a)(hasCategory ?c) (hasPrice ?p) ( hasRate ?r)( OS ?os) (nombre ?n) (Phone_Req ?ph)))

(reset)
(run)
(facts)
