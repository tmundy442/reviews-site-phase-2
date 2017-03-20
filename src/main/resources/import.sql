// initialize Category Table


INSERT INTO category(id, category_name) VALUES(1, 'Action')
INSERT INTO category(id, category_name) VALUES(2, 'Drama')
INSERT INTO category(id, category_name) VALUES(3, 'Horror')



// initialize Review Table


INSERT INTO review(title, date, author, content, category_id) VALUES('Logan', '2017-03-03', 'James Mangold', 'Review content.', 1)
INSERT INTO review(title, date, author, content, category_id) VALUES('The Lego Batman Movie', '2017-02-10', 'Chris McKay', 'Review content.',1)
INSERT INTO review(title, date, author, content, category_id) VALUES('Hidden Figures', '2016-12-25', 'Theodore Melfi', 'Review content.',2)
INSERT INTO review(title, date, author, content, category_id) VALUES('Split', '2017-01-20', 'M. Night Shyalaman', 'Review content.',3)

