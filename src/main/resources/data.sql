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
 


INSERT INTO orders (book_id, customer_name, created_at) VALUES
    (1,  'Alice Johnson',  '2024-10-01 09:15:00'),
    (3,  'Bob Martinez',   '2024-10-03 11:30:00'),
    (2,  'Alice Smith',    '2024-10-05 14:00:00'),
    (5,  'Carol Thompson', '2024-10-07 08:45:00'),
    (7,  'David Lee',      '2024-10-09 16:20:00'),
    (4,  'Alice Garcia',   '2024-10-11 10:10:00'),
    (9,  'Eve Davis',      '2024-10-13 13:55:00'),
    (6,  'Frank Wilson',   '2024-10-15 07:30:00'),
    (10, 'Bob Williams',   '2024-10-17 09:00:00'),
    (1,  'Carol Thompson', '2024-10-19 15:40:00'),
    (8,  'David Brown',    '2024-10-21 12:25:00'),
    (11, 'Alice Johnson',  '2024-10-23 17:05:00'),
    (2,  'Mia Clark',      '2024-10-25 08:15:00'),
    (5,  'Lucas Lewis',    '2024-10-27 11:00:00'),
    (9,  'Emma Rivera',    '2024-10-29 14:30:00');
 