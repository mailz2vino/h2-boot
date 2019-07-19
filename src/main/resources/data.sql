DROP TABLE IF EXISTS student;

CREATE TABLE student (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  department VARCHAR(250) DEFAULT NULL
);

INSERT INTO student (first_name, last_name, department) VALUES
('Sabarinathan', 'Natarajan', 'Computer Science'),
('Preethi', 'Santhanam', 'Computer Science'),
('Sarah', 'Sabari', 'Pre-School');
