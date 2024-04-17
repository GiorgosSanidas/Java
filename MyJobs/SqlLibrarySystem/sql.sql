CREATE DATABASE library;

USE library;

CREATE TABLE books (
  isbn VARCHAR(20) PRIMARY KEY,
  title VARCHAR(100) NOT NULL,
  publication_year INT,
  summary TEXT
);

CREATE TABLE users (
  user_id INT PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(50) NOT NULL,
  password VARCHAR(50) NOT NULL
);

CREATE TABLE loans (
  loan_id INT PRIMARY KEY AUTO_INCREMENT,
  loan_date DATE NOT NULL,
  book_isbn VARCHAR(20) NOT NULL,
  user_id INT NOT NULL,
  FOREIGN KEY (book_isbn) REFERENCES books(isbn),
  FOREIGN KEY (user_id) REFERENCES users(user_id)
);
