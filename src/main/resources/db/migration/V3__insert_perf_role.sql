INSERT INTO "actor" ("name", "bio", "image_path")
VALUES ('Reviczky Gábor', 'Tatabányán született. 1973-ban végzett a Színház- és Filmművészeti Egyetemen. 1973-tól a kaposvári Csiky Gergely Színház, 1975-től a debreceni Csokonai Színház, 1977-től a Miskolci Nemzeti Színház, 1978-től a kecskeméti Katona József Színház, 1979-től a Vígszínház, 1989-től a Nemzeti Színház tagja volt. 1991-től 2013-ig a Vígszínház társulatához tartozott. Az egyik legsikeresebb film- és szinkronszínész; mintegy 70 nagyjáték- és tévéfilmszerep köthető a nevéhez. 1986-ban Jászai Mari-díjjal tüntették ki. 1984-ben és 2010-ben Hegedűs Gyula-emlékgyűrűt kapott, és az Ajtay Andor-emlékdíjat is kétszer nyerte el (1997, 2010). 2009-ben Ruttkai Éva-emlékgyűrűt kapott. 2007-ben Alternatív Kossuth-díjjal ismerték el művészi munkáját.', 'https://www.vigszinhaz.hu/res/imgcache/reviczkygabor_2010_vig_portre_almasi_j_csaba_001_1_rb_610x610.jpg');
--17

INSERT INTO "performances" ("drama_id", "date", "location", "price") VALUES
       (2, TO_TIMESTAMP('2024-12-30 17:30:00', 'YYYY-MM-DD HH24:MI:SS'), 'Erkel terem', 10500),
       (2, TO_TIMESTAMP('2025-01-03 18:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'Erkel terem', 10000),
       (4, TO_TIMESTAMP('2025-01-03 18:45:00', 'YYYY-MM-DD HH24:MI:SS'), 'Madách terem', 9000),
       (3, TO_TIMESTAMP('2025-01-04 15:45:00', 'YYYY-MM-DD HH24:MI:SS'), 'Erkel terem', 6500),
       (1, TO_TIMESTAMP('2025-01-05 20:45:00', 'YYYY-MM-DD HH24:MI:SS'), 'Madách terem', 5500),
       (3, TO_TIMESTAMP('2025-01-09 16:15:00', 'YYYY-MM-DD HH24:MI:SS'), 'Madách terem', 6000),
       (4, TO_TIMESTAMP('2025-01-11 17:45:00', 'YYYY-MM-DD HH24:MI:SS'), 'Madách terem', 9000),
       (1, TO_TIMESTAMP('2025-01-13 21:30:00', 'YYYY-MM-DD HH24:MI:SS'), 'Erkel terem', 6000),
       (3, TO_TIMESTAMP('2025-01-17 17:30:00', 'YYYY-MM-DD HH24:MI:SS'), 'Erkel terem', 6500),
       (4, TO_TIMESTAMP('2025-01-19 19:15:00', 'YYYY-MM-DD HH24:MI:SS'), 'Madách terem', 9000),
       (1, TO_TIMESTAMP('2025-01-29 19:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'Madách terem', 5500),
       (2, TO_TIMESTAMP('2025-01-30 20:15:00', 'YYYY-MM-DD HH24:MI:SS'), 'Madách terem', 9500),
       (4, TO_TIMESTAMP('2025-02-02 18:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'Erkel terem', 9500);

INSERT INTO "role" ("actor_id", "performance_id", "role_name") VALUES
       (8, 5, 'Dr. Lorna James'),
       (8, 8, 'Dr. Lorna James'),
       (8, 11, 'Dr. Lorna James'),
       (10, 5, 'Connie'),
       (10, 8, 'Connie'),
       (10, 11, 'Connie'),
       (4, 1, 'Rácz Tanár Úr'),
       (4, 2, 'Rácz Tanár Úr'),
       (4, 12, 'Rácz Tanár Úr'),
       (1, 1, 'Boka'),
       (1, 2, 'Boka'),
       (1, 12, 'Boka'),
       (2, 1, 'Nemecsek'),
       (2, 2, 'Nemecsek'),
       (2, 12, 'Nemecsek'),
       (6, 4, 'Mary Poppins'),
       (6, 6, 'Mary Poppins'),
       (6, 9, 'Mary Poppins'),
       (7, 4, 'Berti'),
       (7, 6, 'Berti'),
       (7, 9, 'Berti'),
       (12, 3, 'Maugli'),
       (12, 7, 'Maugli'),
       (12, 10, 'Maugli'),
       (12, 13, 'Maugli'),
       (13, 3, 'Akela'),
       (13, 7, 'Akela'),
       (13, 10, 'Akela'),
       (13, 13, 'Akela'),
       (14, 3, 'Bagira'),
       (14, 7, 'Bagira'),
       (14, 10, 'Bagira'),
       (14, 13, 'Bagira'),
       (15, 3, 'Balu'),
       (15, 10, 'Balu'),
       (17, 7, 'Balu'),
       (17, 13, 'Balu');