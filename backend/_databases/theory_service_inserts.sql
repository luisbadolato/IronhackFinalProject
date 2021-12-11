USE theory_service;

INSERT INTO `subject`
	(id, subject_name, subject_order, module_name) 
VALUES
	(1, "Basic Theory", 1, "THEORY_MODULE")
;

INSERT INTO `section` 
	(id, section_name, section_order, subject_id) 
VALUES
	(1, "Musical Notation", 1, 1),
	(2, "Music Concepts", 2, 1)
;

INSERT INTO `unit` 
	(id, unit_name, unit_order, section_id) 
VALUES
	(1, "Basic Figures", 1, 1),
	(2, "Guitar Tablature", 2, 1),
	(3, "Rhythm", 1, 2),
    (4, "Tonalities", 2, 2)
;

INSERT INTO `post`
	(id, post_title, post_body, unit_id)
VALUES
	(1, "Basic Figures", "Let's talk about figures...", 1),
	(2, "Guitar Tablature", "Let's explain guitar tablature...", 2),
	(3, "Rhythm", "Let's talk about rhythm...", 3),
	(4, "Tonalities", "Let's talk about Tonalities...", 4)
;

INSERT INTO `lesson`
	(lesson_title, text_body, image_url, advice_text, audio_slow_url, audio_fast_url, unit_id)
VALUES
	("Musical Figures", "A musical figure is a musical symbol that represents the length of a given note. In Music they are also known as rhythmic figures or positive values. In this sense, the Musical Academy currently recognizes seven musical figures, which are classified according to the time each of them.", "https://i.imgur.com/lJTLQU4.png", "// Play as smoothly as possible.", "", "", 1),
	("More Musical Figures", "Likewise each of these figures have their corresponding musical silence, which has the same time of the musical figure to which it is linked, as well as its own symbol, which placed in a specific position on the staff will indicate where and by how much time to make a silence in the execution of the melody.", "https://i.imgur.com/5Y2bU4A.png", "// Play as smoothly as possible.", "", "", 1),
	("Tablature Definition", "Guitar tablature, usually referred to as “tab”, is a method of notating music that empowers beginner guitarists to learn songs quickly and easily. Guitar tabs share similarities with music staff notation by showing you what notes to play, how long to play them, and what techniques to use.", "https://i.imgur.com/ZJ72YtM.png", "// Play as smoothly as possible.", "", "", 2),
	("Tablature Examples", "In this lesson we will work something...", "https://i.imgur.com/SjyIbdD.png", "// Play as smoothly as possible.", "", "", 2),
	("Rhythm Definition", "Rhythm is music's pattern in time. Whatever other elements a given piece of music may have (e.g., patterns in pitch or timbre), rhythm is the one indispensable element of all music. ... In music that has both harmony and melody, the rhythmic structure cannot be separated from them.", "https://i.imgur.com/jgeaqZ6.png", "// Play as smoothly as possible.", "", "", 3),
	("Time Signatures", "The time signature indicates how many counts are in each measure and which type of note will receive one count. The top number is commonly 2, 3, 4, or 6. The bottom number is either 4 or 8. Simple time signatures divide music into groups of 2 and compound divide music into groups of 3", "https://i.imgur.com/IV3Zi9C.png", "// Play as smoothly as possible.", "", "", 3),
	("Tonality Definition", "Tonality is an organized system of tones (e.g., the tones of a major or minor scale) in which one tone (the tonic) becomes the central point for the remaining tones. The other tones in a tonal piece are all defined in terms of their relationship to the tonic. ", "https://i.imgur.com/WtZePfU.png", "// Play as smoothly as possible.", "", "", 4),
	("Accidentals", "Accidental, in music, sign placed immediately to the left of (or above) a note to show that the note must be changed in pitch. ... Sharps or flats that are placed at the beginning of a musical staff, called a key signature, indicate the tonality, or key, of the music and are not considered accidentals", "https://i.imgur.com/QcB9fJu.png", "// Play as smoothly as possible.", "", "", 4)
;	