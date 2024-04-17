CREATE TABLE company (
companyNumber integer NOT NULL PRIMARY KEY,
companyName varchar(50) NOT NULL);

CREATE TABLE flight (
flightNumber integer NOT NULL PRIMARY KEY,
companyNumber integer NOT NULL,
destinationAirport varchar(100) NOT NULL,
departureAirport varchar(100) NOT NULL,
FOREIGN KEY (companyNumber) REFERENCES company (companyNumber));


CREATE TABLE passenger (
passengerNumber integer NOT NULL PRIMARY KEY ,
passengerName varchar(100) NOT NULL,
flightNumber integer NOT NULL ,
FOREIGN KEY (flightNumber) REFERENCES flight (flightNumber));

CREATE TABLE seat (
seatNumber integer NOT NULL PRIMARY KEY,
flightNumber integer NOT NULL,
passengerNumber integer NOT NULL,
FOREIGN KEY (passengerNumber) REFERENCES passenger (passengerNumber),
FOREIGN KEY (flightNumber) REFERENCES flight (flightNumber)
);

CREATE TABLE reservation (
reservationNumber integer NOT NULL PRIMARY KEY ,
passengerNumber integer NOT NULL,
seatNumber integer NOT NULL,
FOREIGN KEY (passengerNumber) REFERENCES passenger (passengerNumber),
FOREIGN KEY (seatNumber) REFERENCES seat (seatNumber));


