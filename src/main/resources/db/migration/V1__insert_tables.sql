CREATE TABLE "dramas" (
                          "id" integer PRIMARY KEY NOT NULL GENERATED ALWAYS AS IDENTITY,
                          "title" varchar(50),
                          "genre" varchar(50),
                          "duration" integer,
                          "descritpion" text,
                          "image_path" text,
                          "director_id" integer
);

CREATE TABLE "performances" (
                                "id" integer PRIMARY KEY NOT NULL GENERATED ALWAYS AS IDENTITY,
                                "drama_id" integer,
                                "date" timestamp,
                                "location" text,
                                "price" integer
);

CREATE TABLE "actor" (
                         "id" integer PRIMARY KEY NOT NULL GENERATED ALWAYS AS IDENTITY,
                         "name" varchar(50),
                         "bio" text,
                         "image_path" text
);

CREATE TABLE "role" (
                        "id" integer PRIMARY KEY NOT NULL GENERATED ALWAYS AS IDENTITY,
                        "actor_id" integer,
                        "performance_id" integer,
                        "role_name" text
);

CREATE TABLE "user" (
                        "email" varchar(100) PRIMARY KEY NOT NULL,
                        "name" varchar(50),
                        "password" varchar(50),
                        "permission" varchar(15),
                        CONSTRAINT email_unique UNIQUE (email)
);

CREATE TABLE "ticket" (
                          "id" integer PRIMARY KEY NOT NULL GENERATED ALWAYS AS IDENTITY,
                          "user_id" varchar(100),
                          "performance_id" integer,
                          "seat" varchar(50)
);

ALTER TABLE "performances" ADD FOREIGN KEY ("drama_id") REFERENCES "dramas" ("id");

ALTER TABLE "role" ADD FOREIGN KEY ("actor_id") REFERENCES "actor" ("id");

ALTER TABLE "role" ADD FOREIGN KEY ("performance_id") REFERENCES "performances" ("id");

ALTER TABLE "dramas" ADD FOREIGN KEY ("director_id") REFERENCES "actor" ("id");

ALTER TABLE "ticket" ADD FOREIGN KEY ("user_id") REFERENCES "user" ("email");

ALTER TABLE "ticket" ADD FOREIGN KEY ("performance_id") REFERENCES "performances" ("id");
