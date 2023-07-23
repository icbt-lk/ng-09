SELECT *
FROM students st 
JOIN enrollments e ON st.id = e.st_id
JOIN subjects sb ON e.sub_id = sb.id;


SELECT st.name, count(sb.id) as no_of_subjects
FROM students st 
LEFT JOIN enrollments e ON st.id = e.st_id
LEFT JOIN subjects sb ON e.sub_id = sb.id
GROUP BY st.id;

SELECT sb.name, count(st.id) as no_of_studentds
FROM students st 
JOIN enrollments e ON st.id = e.st_id
RIGHT JOIN subjects sb ON e.sub_id = sb.id
GROUP BY sb.id;