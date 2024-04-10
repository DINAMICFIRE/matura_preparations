CREATE DATABASE IF NOT EXISTS booking_system;
USE booking_system;
CREATE TABLE authors(
ID int PRIMARY KEY AUTO_INCREMENT,
`Name` VARCHAR(50) NOT NULL
);

CREATE TABLE books(
ID int PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(100) NOT NULL,
ISBN VARCHAR(50),
Published YEAR NOT NULL
);

CREATE TABLE Library(
AuthorID INT,
BookID INT,
Rented DATE,
FOREIGN KEY(AuthorID)
REFERENCES authors(id),
FOREIGN KEY(BookID)
REFERENCES books(id),
PRIMARY KEY(AuthorID,BookID,Rented)
);
INSERT INTO authors(ID,`Name`)
VALUES
(1,'Bajarne Stroustrup'),
(2,'Stenley'),
(3,'Paul'),
(4,'Harvey'),
(5,'Herb'),
(6,'Mike'),
(7,'Andrew'),
(8,'Barbara');
INSERT INTO books (title, ISBN, Published) VALUES
('The C++ Programming Language, 4th Edition', '9780275967307', 2013),
('Tour of C++, A 3rd Edition', '0136816487', 2022),
('C++ Primer 5th Edition', '9780321714114', 2012),
('Essential C++ 1st Edition', '9780201485189', 1999),
('C++ Gems: Programming Pearls from The C++ Report 320th Edition', '9780135705810', 1997),
('A Tour of C++ (C++ In-Depth Series) 1st Edition', '9780321958310', 2013),
('C++ How to Program 10th Edition', '9780134448237', 2016),
('Exceptional C++: 47 Engineering Puzzles, Programming Problems, and Solutions', '9780201615623', 1999),
('Programming Problems, and Solutions 1st Edition', '9780201704341', 2001),
('Accelerated C++: Practical Programming by Example 1st Edition', '9780201703535', 2000);

INSERT INTO Library (AuthorID, BookID, Rented) VALUES
(1, 1, '2023-01-01'),
(1, 2, '2023-01-01'),
(2, 3, '2023-01-01'),
(2, 4, '2023-01-01'),
(2, 5, '2023-01-01'),
(1, 6, '2023-02-01'),
(3, 7, '2023-02-01'),
(4, 7, '2023-02-01'),
(5, 8, '2023-02-01'),
(5, 9, '2023-02-01'),
(6, 10, '2023-03-01'),
(7, 10, '2023-03-01'),
(8, 10, '2023-03-01');
	
-- 3_11
SELECT `title`
FROM books;

-- 3_12
SELECT `Name`
FROM authors;

-- 3_13
SELECT authors.Name,COUNT(library.BookID) AS 'count' 
FROM authors
JOIN library ON authors.ID = library.AuthorID
GROUP BY authors.ID
HAVING count > 1;

-- 3_14
SELECT books.`title`,COUNT(library.AuthorID)
FROM books
JOIN library On books.ID = library.BookID
GROUP BY library.BookID
HAVING COUNT(library.AuthorID) > 1;

-- 3_15
SELECT books.`title`
FROM books
JOIN library On books.ID = library.BookID
GROUP BY library.BookID
HAVING COUNT(library.AuthorID) = 1;

-- 3_16
DELETE
FROM books 
WHERE title = 'Accelerated C++: Practical Programming by Example 1st Edition';

-- 3_17
UPDATE books
SET title = REPLACE(title, 'C++', 'C#');

-- 3_18
SELECT books.title AS 'First',COUNT(library.BookID) AS 'Authors'
FROM library
LEFT JOIN books ON books.id = library.BookID
GROUP BY library.BookID
HAVING COUNT(library.BookID) > 1;














