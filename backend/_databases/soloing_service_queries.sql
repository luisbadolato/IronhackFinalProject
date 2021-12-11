USE scales_service;

SELECT * FROM `unit` u JOIN section s ON u.section_id = s.id;

SELECT j.subject_order AS JO, s.section_order AS SO, u.unit_order AS UO,
		j.subject_name AS "Subject", s.section_name AS "Section", u.unit_name AS "Unit", u.id
	FROM `unit` u 
	JOIN section s ON u.section_id = s.id
	JOIN `subject` j ON s.subject_id = j.id;

SELECT j.subject_order AS JO, s.section_order AS SO, u.unit_order AS UO, ui.unit_item_order AS "IO",
		j.subject_name AS "Subject", s.section_name AS "Section", u.unit_name AS "Unit", u.id AS "Unit ID", ui.id
	FROM unit_item AS ui
    JOIN `unit` u ON ui.unit_id = u.id
	JOIN section s ON u.section_id = s.id
	JOIN `subject` j ON s.subject_id = j.id;
    

SELECT * FROM `unit` u JOIN section s ON u.section_id = s.id WHERE s.section_name LIKE '%penta%';


SELECT * FROM `unit_item` ui
	JOIN `lesson` l ON l.unit_item_id = ui.id 
	JOIN post p ON p.unit_item_id = ui.id ORDER BY ui.unit_id;


SELECT * FROM `unit_item` ui
	LEFT JOIN `lesson` l ON l.unit_item_id = ui.id 
	LEFT JOIN post p ON p.unit_item_id = ui.id ORDER BY ui.unit_id;
    
SELECT * FROM `lesson`;
