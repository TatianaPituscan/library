CREATE TABLE "book_author" (
  "author_id" int,
  "book_isbn" varchar
);

CREATE TABLE "author" (
  "id" int UNIQUE PRIMARY KEY NOT NULL,
  "first_name" varchar,
  "last_name" varchar
);

CREATE TABLE "book" (
  "isbn" varchar UNIQUE PRIMARY KEY NOT NULL,
  "name" varchar,
  "publisher_id" int,
  "publisher_year" varchar,
  "copies" int,
  "picture" varchar
);

CREATE TABLE "borrowed_book" (
  "id" int,
  "book_isbn" varchar,
  "client_id" int,
  "borrow_date" date
);

CREATE TABLE "client" (
  "id" int UNIQUE PRIMARY KEY NOT NULL,
  "first_name" varchar,
  "last_name" varchar,
  "address" varchar,
  "phone" varchar
);

CREATE TABLE "publisher" (
  "id" int UNIQUE PRIMARY KEY NOT NULL,
  "name" varchar
);

CREATE TABLE "user" (
  "id" int UNIQUE PRIMARY KEY NOT NULL,
  "usename" varchar,
  "password" varchar
);

CREATE TABLE "user_authority" (
  "user_id" int,
  "authority_name" varchar
);

CREATE TABLE "authority" (
  "name" varchar UNIQUE PRIMARY KEY NOT NULL
);

ALTER TABLE "book_author" ADD FOREIGN KEY ("book_isbn") REFERENCES "book" ("isbn");

ALTER TABLE "book_author" ADD FOREIGN KEY ("author_id") REFERENCES "author" ("id");

ALTER TABLE "borrowed_book" ADD FOREIGN KEY ("book_isbn") REFERENCES "book" ("isbn");

ALTER TABLE "borrowed_book" ADD FOREIGN KEY ("client_id") REFERENCES "client" ("id");

ALTER TABLE "book" ADD FOREIGN KEY ("publisher_id") REFERENCES "publisher" ("id");

ALTER TABLE "user_authority" ADD FOREIGN KEY ("user_id") REFERENCES "user" ("id");

ALTER TABLE "user_authority" ADD FOREIGN KEY ("authority_name") REFERENCES "authority" ("name");
