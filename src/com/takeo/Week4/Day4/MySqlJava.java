package com.takeo.Week4.Day4;
/*
--Fetch all author details
        SELECT * FROM Authors;
        --Fetch authors whose names start with "A" or "N":
        SELECT * FROM Authors
        WHERE author_name LIKE 'A%' OR author_name LIKE 'N%';
        --Fetch book_name, title, and publication from the Books table:
        SELECT book_name, title, publication_year FROM books;
        --Fetch books with publication years between 1993 and 2023:
        SELECT * FROM Books
        WHERE publication_year BETWEEN 1993 AND 2023;
        --Fetch all books with author_id 1:
        SELECT * FROM Books
        WHERE author_id = 1;
        --Fetch all fields from the BookLoans table:
        SELECT * FROM BookLoans;
        --Fetch all BookLoans that have the same loan date:
        SELECT loan_date, COUNT(*) AS loan_count
        FROM BookLoans
        GROUP BY loan_date
        HAVING COUNT(*) > 1;

 */