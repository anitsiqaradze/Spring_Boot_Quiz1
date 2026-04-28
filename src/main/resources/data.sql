INSERT INTO authors (name) VALUES
    ('George Orwell'),
    ('J.K. Rowling'),
    ('Martin Fowler'),
    ('Robert C. Martin');
 

 INSERT INTO books (title, author_id) VALUES
    -- George Orwell (id=1)
    ('1984',1),
    ('Animal Farm',1),
    ('Homage to Catalonia',1),
    -- J.K. Rowling (id=2)
    ('Harry Potter and the Philosopher''s Stone', 2),
    ('Harry Potter and the Chamber of Secrets', 2),
    ('Harry Potter and the Prisoner of Azkaban', 2),
    -- Martin Fowler (id=3)
    ('Refactoring', 3),
    ('Patterns of Enterprise Application Architecture', 3),
    -- Robert C. Martin (id=4)
    ('Clean Code',4),
    ('The Clean Coder', 4),
    ('Clean Architecture',4);
 

    INSERT INTO products (name, price, category, created_at) VALUES
('Wireless Mouse',      29.99,  'Electronics', NOW()),
('Mechanical Keyboard', 89.99,  'Electronics', NOW()),
('USB-C Hub',           49.99,  'Electronics', NOW()),
('Standing Desk',       349.99, 'Furniture',   NOW()),
('Ergonomic Chair',     499.99, 'Furniture',   NOW()),
('Monitor Stand',       39.99,  'Furniture',   NOW()),
('Notebook A5',         4.99,   'Stationery',  NOW()),
('Ballpoint Pen Pack',  6.99,   'Stationery',  NOW()),
('Sticky Notes',        3.49,   'Stationery',  NOW()),
('Webcam 1080p',        79.99,  'Electronics', NOW());
INSERT INTO orders (product_id, customer_name, created_at, order_status) VALUES
    (1,  'Alice Johnson',  '2024-10-01 09:15:00', 'PENDING'),
    (3,  'Bob Martinez',   '2024-10-03 11:30:00', 'DONE'),
    (2,  'Alice Smith',    '2024-10-05 14:00:00', 'CANCELED'),
    (5,  'Carol Thompson', '2024-10-07 08:45:00', 'PENDING'),
    (7,  'David Lee',      '2024-10-09 16:20:00', 'DONE'),
    (4,  'Alice Garcia',   '2024-10-11 10:10:00', 'CANCELED'),
    (9,  'Eve Davis',      '2024-10-13 13:55:00', 'PENDING'),
    (6,  'Frank Wilson',   '2024-10-15 07:30:00', 'DONE'),
    (1,  'Carol Thompson', '2024-10-19 15:40:00', 'DONE'),
    (8,  'David Brown',    '2024-10-21 12:25:00', 'PENDING'),
    (2,  'Mia Clark',      '2024-10-25 08:15:00', 'CANCELED'),
    (5,  'Lucas Lewis',    '2024-10-27 11:00:00', 'DONE'),
    (9,  'Emma Rivera',    '2024-10-29 14:30:00', 'PENDING');

INSERT INTO departments (department_name) VALUES
    ('Engineering'),
    ('Product'),
    ('Design'),
    ('Marketing'),
    ('Finance');
 
 
INSERT INTO employees (first_name, last_name, email, phone_number, salary, hire_date, department_id) VALUES
    -- Engineering (id=1)
    ('James',     'Carter',   'james.carter@example.com',    '555-0101', 95000.00, '2021-03-15', 1),
    ('Sofia',     'Nguyen',   'sofia.nguyen@example.com',    '555-0102', 98000.00, '2020-07-01', 1),
    ('Liam',      'Patel',    'liam.patel@example.com',      '555-0103', 87000.00, '2022-01-20', 1),
    ('Olivia',    'Kim',      'olivia.kim@example.com',      '555-0104', 91000.00, '2021-11-10', 1),
    -- Product (id=2)
    ('Noah',      'Chen',     'noah.chen@example.com',       '555-0201', 85000.00, '2020-05-18', 2),
    ('Emma',      'Rivera',   'emma.rivera@example.com',     '555-0202', 83000.00, '2021-08-25', 2),
    ('Ava',       'Scott',    'ava.scott@example.com',       '555-0203', 80000.00, '2022-03-07', 2),
    -- Design (id=3)
    ('William',   'Torres',   'william.torres@example.com',  '555-0301', 78000.00, '2021-06-14', 3),
    ('Isabella',  'White',    'isabella.white@example.com',  '555-0302', 76000.00, '2022-09-01', 3),
    -- Marketing (id=4)
    ('Mason',     'Harris',   'mason.harris@example.com',    '555-0401', 72000.00, '2020-11-30', 4),
    ('Mia',       'Clark',    'mia.clark@example.com',       '555-0402', 71000.00, '2021-04-19', 4),
    ('Lucas',     'Lewis',    'lucas.lewis@example.com',     '555-0403', 69000.00, '2023-01-09', 4),
    -- Finance (id=5)
    ('Ethan',     'Walker',   'ethan.walker@example.com',    '555-0501', 88000.00, '2020-02-28', 5),
    ('Charlotte', 'Hall',     'charlotte.hall@example.com',  '555-0502', 86000.00, '2021-09-15', 5); 



