USE arpegio_service;

INSERT INTO `subject` (id, subject_name, subject_order, module_name) VALUES
	(1, "Triads", 1, "ARPEGGIO_MODULE"),
	(2, "7th Chords", 2, "ARPEGGIO_MODULE");

INSERT INTO `section` (id, section_name, section_order, subject_id) VALUES
	(1, "Triads in Position", 1, 1),
	(2, "Triads Sweep Picking", 2, 1),  
	(3, "7th Chords in Position", 1, 2),
	(4, "7th Chords Sweep Picking", 2, 2);

INSERT INTO `unit` (id, unit_name, unit_order, section_id) VALUES
	(1, "Static Harmony", 1, 1),
	(2, "Diatonic Progression", 2, 1),
	(3, "Static Harmony", 1, 2),
    (4, "Diatonic Progression", 2, 2),
    (5, "Static Harmony", 1, 3),
    (6, "Diatonic Progression", 2, 3),
	(7, "Static Harmony", 1, 4),
	(8, "Diatonic Progression", 2, 4);

INSERT INTO `post`(id, post_title, post_body, unit_id) VALUES
	(1, "Static Triads in Position", "Let's play some chords...", 1),
	(2, "Diatonic Triads in Position", "Let's play some chords...", 2),
	(3, "Static Triads Sweep", "Let's play some chords...", 3),
	(4, "Diatonic Triads Sweep", "Let's play some chords...", 4),
	(5, "Static 7th Chords in Position", "Let's play some chords...", 5),
	(6, "Diatonic 7th Chords in Position", "Let's play some chords...", 6),
	(7, "Static 7th Chords Sweep Picking", "Let's play some chords...", 7),
	(8, "Diatonic 7th Chords Sweep Picking", "Let's play some chords...", 8);

INSERT INTO `lesson`(lesson_title, text_body, image_url, advice_text, audio_slow_url, audio_fast_url, unit_id) VALUES
	("C Triad in Position", "In this lesson we will work something...", "https://i.imgur.com/lJTLQU4.png", "// Play as smoothly as possible.", "../assets/audios/arpeggios/100bpm/ex1.mp3", "../assets/audios/arpeggios/150bpm/ex1.mp3", 1),
	("Cm Triad in Position", "In this lesson we will work something...", "https://i.imgur.com/5Y2bU4A.png", "// Play as smoothly as possible.", "../assets/audios/arpeggios/100bpm/ex2.mp3", "../assets/audios/arpeggios/150bpm/ex2.mp3", 1),
	("Triads in Position in C Major Key", "In this lesson we will work something...", "https://i.imgur.com/ZJ72YtM.png", "// Play as smoothly as possible.", "../assets/audios/arpeggios/100bpm/ex3.mp3", "../assets/audios/arpeggios/150bpm/ex3.mp3", 2),
	("C Triad Sweep Picking", "In this lesson we will work something...", "https://i.imgur.com/SjyIbdD.png", "// Play as smoothly as possible.", "../assets/audios/arpeggios/100bpm/ex4.mp3", "../assets/audios/arpeggios/150bpm/ex4.mp3", 3),
	("Cm Triad Sweep Picking", "In this lesson we will work something...", "https://i.imgur.com/jgeaqZ6.png", "// Play as smoothly as possible.", "../assets/audios/arpeggios/100bpm/ex5.mp3", "../assets/audios/arpeggios/150bpm/ex5.mp3", 3),
	("Triads Sweep Picking in C Major", "In this lesson we will work something...", "https://i.imgur.com/IV3Zi9C.png", "// Play as smoothly as possible.", "../assets/audios/arpeggios/100bpm/ex6.mp3", "../assets/audios/arpeggios/150bpm/ex6.mp3", 4),
	("CMaj7 in Position", "In this lesson we will work something...", "https://i.imgur.com/WtZePfU.png", "// Play as smoothly as possible.", "../assets/audios/arpeggios/100bpm/ex7.mp3", "../assets/audios/arpeggios/150bpm/ex7.mp3", 5),
	("C7 in Position", "In this lesson we will work something...", "https://i.imgur.com/QcB9fJu.png", "// Play as smoothly as possible.", "../assets/audios/arpeggios/100bpm/ex8.mp3", "../assets/audios/arpeggios/150bpm/ex8.mp3", 5),
	("Cm7 in Position", "In this lesson we will work something...", "https://i.imgur.com/jRQjEfo.png", "// Play as smoothly as possible.", "../assets/audios/arpeggios/100bpm/ex9.mp3", "../assets/audios/arpeggios/150bpm/ex9.mp3", 5),
    ("Cm7b5 in Position", "In this lesson we will work something...", "https://i.imgur.com/l6RjcwH.png", "// Play as smoothly as possible.", "../assets/audios/arpeggios/100bpm/ex10.mp3", "../assets/audios/arpeggios/150bpm/ex10.mp3", 5),
	("7th Chords in Position in C Major Key", "In this lesson we will work something...", "https://i.imgur.com/4wUvPi9.png", "// Play as smoothly as possible.", "../assets/audios/arpeggios/100bpm/ex11.mp3", "../assets/audios/arpeggios/150bpm/ex11.mp3", 6),
	("CMaj7 Sweep Picking", "In this lesson we will work something...", "https://i.imgur.com/ebl6DhO.png", "// Play as smoothly as possible.", "../assets/audios/arpeggios/100bpm/ex12.mp3", "../assets/audios/arpeggios/150bpm/ex12.mp3", 7),
    ("C7 Sweep Picking", "In this lesson we will work something...", "https://i.imgur.com/bu58JLe.png", "// Play as smoothly as possible.", "../assets/audios/arpeggios/100bpm/ex13.mp3", "../assets/audios/arpeggios/150bpm/ex13.mp3", 7),
	("Cm7 Sweep Picking", "In this lesson we will work something...", "https://i.imgur.com/gMPeQFX.png", "// Play as smoothly as possible.", "../assets/audios/arpeggios/100bpm/ex14.mp3", "../assets/audios/arpeggios/150bpm/ex14.mp3", 7),
	("Cm7b5 Sweep Picking", "In this lesson we will work something...", "https://i.imgur.com/dwLty9w.png", "// Play as smoothly as possible.", "../assets/audios/arpeggios/100bpm/ex15.mp3", "../assets/audios/arpeggios/150bpm/ex15.mp3", 7),
	("7th Chords Sweep Picking in C Major Key", "In this lesson we will work something...", "https://i.imgur.com/Q94beBg.png", "// Play as smoothly as possible.", "../assets/audios/arpeggios/100bpm/ex16.mp3", "../assets/audios/arpeggios/150bpm/ex16.mp3", 8)
;	

USE chords_service;

INSERT INTO `subject` (id, subject_name, subject_order, module_name) VALUES
	(1, "Triads", 1, "CHORDS_MODULE"),
	(2, "7th Chords", 2, "CHORDS_MODULE");

INSERT INTO `section` (id, section_name, section_order, subject_id) VALUES
	(1, "Triads Closed", 1, 1),
	(2, "Triads Open", 2, 1),  
	(3, "7th Chords Drop2", 1, 2),
	(4, "7th Chords Drop3", 2, 2)
;

INSERT INTO `unit` (id, unit_name, unit_order, section_id) VALUES
	(1, "Static Harmony", 1, 1),
	(2, "Diatonic Progression", 2, 1),
	(3, "Static Harmony", 1, 2),
    (4, "Diatonic Progression", 2, 2),
    (5, "Static Harmony", 1, 3),
    (6, "Diatonic Progression", 2, 3),
	(7, "Static Harmony", 1, 4),
	(8, "Diatonic Progression", 2, 4)
;

INSERT INTO `post`(id, post_title, post_body, unit_id) VALUES
	(1, "Static Closed Triads", "Let's play some chords...", 1),
	(2, "Diatonic Closed Triads", "Let's play some chords...", 2),
	(3, "Static Open Triads", "Let's play some chords...", 3),
	(4, "Diatonic Open Triads", "Let's play some chords...", 4),
	(5, "Static Drop2 7th Chords", "Let's play some chords...", 5),
	(6, "Diatonic Drop2 7th Chords", "Let's play some chords...", 6),
	(7, "Static Drop3 7th Chords", "Let's play some chords...", 7),
	(8, "Diatonic Drop3 7th Chords", "Let's play some chords...", 8)
;

INSERT INTO `lesson` (lesson_title, text_body, image_url, advice_text, audio_slow_url, audio_fast_url, unit_id) VALUES
	("C Closed Triad", "In this lesson we will work something...", "https://i.imgur.com/8YqID9D.png", "// Play as smoothly as possible.", "../assets/audios/chords/70bpm/ex1.mp3", "../assets/audios/chords/110bpm/ex1.mp3", 1),
	("Cm Closed Triad", "In this lesson we will work something...", "https://i.imgur.com/XK40ANm.png", "// Play as smoothly as possible.", "../assets/audios/chords/70bpm/ex2.mp3", "../assets/audios/chords/110bpm/ex2.mp3", 1),
	("Closed Triads in C Major Key", "In this lesson we will work something...", "https://i.imgur.com/CQpdM6Q.png", "// Play as smoothly as possible.", "../assets/audios/chords/70bpm/ex3.mp3", "../assets/audios/chords/110bpm/ex3.mp3", 2),
	("C Open Triad", "In this lesson we will work something...", "https://i.imgur.com/TmHoIay.png", "// Play as smoothly as possible.", "../assets/audios/chords/70bpm/ex4.mp3", "../assets/audios/chords/110bpm/ex4.mp3", 3),
	("Cm Open Triad", "In this lesson we will work something...", "https://i.imgur.com/P38IkWy.png", "// Play as smoothly as possible.", "../assets/audios/chords/70bpm/ex5.mp3", "../assets/audios/chords/110bpm/ex5.mp3", 3),
	("Open Triads in C Major Key", "In this lesson we will work something...", "https://i.imgur.com/Fw2oIou.png", "// Play as smoothly as possible.", "../assets/audios/chords/70bpm/ex6.mp3", "../assets/audios/chords/110bpm/ex6.mp3", 4),
	("CMaj7 Drop2", "In this lesson we will work something...", "https://i.imgur.com/sBxpFIs.png", "// Play as smoothly as possible.", "../assets/audios/chords/70bpm/ex7.mp3", "../assets/audios/chords/110bpm/ex7.mp3", 5),
	("C7 Drop2", "In this lesson we will work something...", "https://i.imgur.com/gYAlg5n.png", "// Play as smoothly as possible.", "../assets/audios/chords/70bpm/ex8.mp3", "../assets/audios/chords/110bpm/ex8.mp3", 5),
	("Cm7 Drop2", "In this lesson we will work something...", "https://i.imgur.com/fh8qjXh.png", "// Play as smoothly as possible.", "../assets/audios/chords/70bpm/ex9.mp3", "../assets/audios/chords/110bpm/ex9.mp3", 5),
    ("Cm7b5 Drop2", "In this lesson we will work something...", "https://i.imgur.com/aRKrnzF.png", "// Play as smoothly as possible.", "../assets/audios/chords/70bpm/ex10.mp3", "../assets/audios/chords/110bpm/ex10.mp3", 5),
	("7th Chords Drop2 in C Major", "In this lesson we will work something...", "https://i.imgur.com/ndQ5lTt.png", "// Play as smoothly as possible.", "../assets/audios/chords/70bpm/ex11.mp3", "../assets/audios/chords/110bpm/ex11.mp3", 6),
	("CMaj7 Drop3", "In this lesson we will work something...", "https://i.imgur.com/Y9LkX5W.png", "// Play as smoothly as possible.", "../assets/audios/chords/70bpm/ex12.mp3", "../assets/audios/chords/110bpm/ex12.mp3", 7),
    ("C7 Drop3", "In this lesson we will work something...", "https://i.imgur.com/AIIq6Xu.png", "// Play as smoothly as possible.", "../assets/audios/chords/70bpm/ex13.mp3", "../assets/audios/chords/110bpm/ex13.mp3", 7),
	("Cm7 Drop3", "In this lesson we will work something...", "https://i.imgur.com/myWiIua.png", "// Play as smoothly as possible.", "../assets/audios/chords/70bpm/ex14.mp3", "../assets/audios/chords/110bpm/ex14.mp3", 7),
	("Cm7b5 Drop3", "In this lesson we will work something...", "https://i.imgur.com/iDjNaIB.png", "// Play as smoothly as possible.", "../assets/audios/chords/70bpm/ex15.mp3", "../assets/audios/chords/110bpm/ex15.mp3", 7),
	("7th Chords Drop3 in C Major", "In this lesson we will work something...", "https://i.imgur.com/02dHnKq.png", "// Play as smoothly as possible.", "../assets/audios/chords/70bpm/ex16.mp3", "../assets/audios/chords/110bpm/ex16.mp3", 8)
;	

USE theory_service;

INSERT INTO `subject` (id, subject_name, subject_order, module_name) VALUES
	(1, "Basic Theory", 1, "THEORY_MODULE");

INSERT INTO `section` (id, section_name, section_order, subject_id) VALUES
	(1, "Musical Notation", 1, 1),
	(2, "Music Concepts", 2, 1);

INSERT INTO `unit` (id, unit_name, unit_order, section_id) VALUES
	(1, "Basic Figures", 1, 1),
	(2, "Guitar Tablature", 2, 1),
	(3, "Rhythm", 1, 2),
    (4, "Tonalities", 2, 2);

INSERT INTO `post` (id, post_title, post_body, unit_id) VALUES
	(1, "Basic Figures", "Let's talk about figures...", 1),
	(2, "Guitar Tablature", "Let's explain guitar tablature...", 2),
	(3, "Rhythm", "Let's talk about rhythm...", 3),
	(4, "Tonalities", "Let's talk about Tonalities...", 4);

INSERT INTO `lesson` (lesson_title, text_body, image_url, advice_text, audio_slow_url, audio_fast_url, unit_id) VALUES
	("Musical Figures", "A musical figure is a musical symbol that represents the length of a given note. In Music they are also known as rhythmic figures or positive values. In this sense, the Musical Academy currently recognizes seven musical figures, which are classified according to the time each of them.", "https://i.imgur.com/lJTLQU4.png", "// Play as smoothly as possible.", "", "", 1),
	("More Musical Figures", "Likewise each of these figures have their corresponding musical silence, which has the same time of the musical figure to which it is linked, as well as its own symbol, which placed in a specific position on the staff will indicate where and by how much time to make a silence in the execution of the melody.", "https://i.imgur.com/5Y2bU4A.png", "// Play as smoothly as possible.", "", "", 1),
	("Tablature Definition", "Guitar tablature, usually referred to as “tab”, is a method of notating music that empowers beginner guitarists to learn songs quickly and easily. Guitar tabs share similarities with music staff notation by showing you what notes to play, how long to play them, and what techniques to use.", "https://i.imgur.com/ZJ72YtM.png", "// Play as smoothly as possible.", "", "", 2),
	("Tablature Examples", "In this lesson we will work something...", "https://i.imgur.com/SjyIbdD.png", "// Play as smoothly as possible.", "", "", 2),
	("Rhythm Definition", "Rhythm is music's pattern in time. Whatever other elements a given piece of music may have (e.g., patterns in pitch or timbre), rhythm is the one indispensable element of all music. ... In music that has both harmony and melody, the rhythmic structure cannot be separated from them.", "https://i.imgur.com/jgeaqZ6.png", "// Play as smoothly as possible.", "", "", 3),
	("Time Signatures", "The time signature indicates how many counts are in each measure and which type of note will receive one count. The top number is commonly 2, 3, 4, or 6. The bottom number is either 4 or 8. Simple time signatures divide music into groups of 2 and compound divide music into groups of 3", "https://i.imgur.com/IV3Zi9C.png", "// Play as smoothly as possible.", "", "", 3),
	("Tonality Definition", "Tonality is an organized system of tones (e.g., the tones of a major or minor scale) in which one tone (the tonic) becomes the central point for the remaining tones. The other tones in a tonal piece are all defined in terms of their relationship to the tonic. ", "https://i.imgur.com/WtZePfU.png", "// Play as smoothly as possible.", "", "", 4),
	("Accidentals", "Accidental, in music, sign placed immediately to the left of (or above) a note to show that the note must be changed in pitch. ... Sharps or flats that are placed at the beginning of a musical staff, called a key signature, indicate the tonality, or key, of the music and are not considered accidentals", "https://i.imgur.com/QcB9fJu.png", "// Play as smoothly as possible.", "", "", 4)
;	

USE scales_service;

INSERT INTO `subject` (id, subject_name, subject_order, module_name) VALUES
	(1, "Pentatonic", 1, "SCALES_MODULE"),
	(2, "Major & Modes", 2, "SCALES_MODULE"),
	(3, "Melodic Minor & Modes", 3, "SCALES_MODULE"),
	(4, "Diminished Half Whole", 4, "SCALES_MODULE");

INSERT INTO `section` (id, section_name, section_order, subject_id) VALUES
-- Pentatonic --
	(1, "Pentatonic Minor Basic", 1, 1),
	(2, "Pentatonic Minor Diagonal", 2, 1),
	(3, "Pentatonic Minor Hybrid", 3, 1),
-- Major & Modes --    
	(4, "Berklee Basic Major", 1, 2),
	(5, "3NPS Major", 2, 2),
	(6, "Full Scale Major", 3, 2),
	(7, "MiniPosition Major", 4, 2),
-- Melodic Minor & Modes --    
    (8, "Berklee Basic Melodic Minor", 1, 3),
	(9, "Full Scale Melodic Minor", 2, 3),
-- Diminished Half Whole --
	(10, "Diminished Vertical Positions", 1, 4)
;

INSERT INTO `unit` (id, unit_name, unit_order, section_id) VALUES
-- Pentatonic Minor Basic --
	(1, "Linear Run", 1, 1),
	(2, "Sequence 4 Notes", 2, 1),
    (3, "Melodic Segments", 3, 1),
-- Pentatonic Minor Diagonal --
	(4, "Linear Run", 1, 2),
    (5, "Melodic Segments", 2, 2),
-- Pentatonic Minor Hybrid --
    (6, "Linear Run", 1, 3),
-- Berklee Basic Major --
	(7, "Linear Run", 1, 4),
	(8, "Sequence 4 Notes", 2, 4),
	(9, "Intervals", 3, 4),
    (10, "Melodic Segments", 4, 4),
-- 3NPS Major --
	(11, "Linear Run", 1, 5),
	(12, "Intervals", 2, 5),
    (13, "Melodic Segments", 3, 5),
-- Full Scale Major --
	(14, "Linear Run", 1, 6),
-- MiniPosition Major --
	(15, "Linear Run", 1, 7),
    (16, "Melodic Segments", 2, 7),
-- Berklee Basic Melodic Minor --
	(17, "Linear Run", 1, 8),
	(18, "Sequence 4 Notes", 2, 8),
	(19, "Intervals", 3, 8),
    (20, "Melodic Segments", 4, 8),
-- Full Scale Melodic Minor --
	(21, "Linear Run", 1, 9),
-- Diminished Half Whole --
	(22, "Linear Run", 1, 10),
	(23, "Intervals", 2, 10)
;

INSERT INTO `post` (id, post_title, post_body, unit_id) VALUES
	(1, "Intro to Linear Runs", "Linear Runs are a great exercise to warm up and to learn the basic positions of a scale...", 1),
	(2, "Intro to Linear Runs", "Linear Runs are a great exercise to warm up and to learn the basic positions of a scale...", 4),
	(3, "Intro to Linear Runs", "Linear Runs are a great exercise to warm up and to learn the basic positions of a scale...", 6),
	(4, "Intro to Linear Runs", "Linear Runs are a great exercise to warm up and to learn the basic positions of a scale...", 7),
	(5, "Intro to Linear Runs", "Linear Runs are a great exercise to warm up and to learn the basic positions of a scale...", 11),
	(6, "Intro to Linear Runs", "Linear Runs are a great exercise to warm up and to learn the basic positions of a scale...", 14),
	(7, "Intro to Linear Runs", "Linear Runs are a great exercise to warm up and to learn the basic positions of a scale...", 15),
	(8, "Intro to Linear Runs", "Linear Runs are a great exercise to warm up and to learn the basic positions of a scale...", 17),
	(9, "Intro to Linear Runs", "Linear Runs are a great exercise to warm up and to learn the basic positions of a scale...", 21),
	(10, "Intro to Linear Runs", "Linear Runs are a great exercise to warm up and to learn the basic positions of a scale...", 22),
	(11, "Intro to Sequences", "Sequences are a great exercise to improve your fretboard knowledge...", 2),
	(12, "Intro to Sequences", "Sequences are a great exercise to improve your fretboard knowledge...", 8),
	(13, "Intro to Sequences", "Sequences are a great exercise to improve your fretboard knowledge...", 18),
	(14, "Intro to Melodic Segments", "Melodic Segments are the best way to expand your melodic vocabulary within the scale shapes...", 3),
	(15, "Intro to Melodic Segments", "Melodic Segments are the best way to expand your melodic vocabulary within the scale shapes...", 5),
	(16, "Intro to Melodic Segments", "Melodic Segments are the best way to expand your melodic vocabulary within the scale shapes...", 10),
	(17, "Intro to Melodic Segments", "Melodic Segments are the best way to expand your melodic vocabulary within the scale shapes...", 13),
	(18, "Intro to Melodic Segments", "Melodic Segments are the best way to expand your melodic vocabulary within the scale shapes...", 16),
	(19, "Intro to Melodic Segments", "Melodic Segments are the best way to expand your melodic vocabulary within the scale shapes...", 20),
	(20, "Intro to Intervals", "Intervals are quite useful to develop exceptional technique skills...", 9),
	(21, "Intro to Intervals", "Intervals are quite useful to develop exceptional technique skills...", 12),
	(22, "Intro to Intervals", "Intervals are quite useful to develop exceptional technique skills...", 19),
	(23, "Intro to Intervals", "Intervals are quite useful to develop exceptional technique skills...", 23)
;

INSERT INTO `lesson`
	(lesson_title, text_body, image_url, advice_text, audio_slow_url, audio_fast_url, unit_id)
VALUES
	("A Position 1", "In this lesson we will work something...", "https://i.imgur.com/in1nC7b.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex1.mp3", "../assets/audios/scales/150bpm/ex1.mp3", 1),
	("A Position 2", "In this lesson we will work something...", "https://i.imgur.com/eTkLyxR.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex2.mp3", "../assets/audios/scales/150bpm/ex2.mp3", 1),
	("A Position 3", "In this lesson we will work something...", "https://i.imgur.com/sa5qsdO.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex3.mp3", "../assets/audios/scales/150bpm/ex3.mp3", 1),
	("A Position 4", "In this lesson we will work something...", "https://i.imgur.com/wIHbuNR.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex4.mp3", "../assets/audios/scales/150bpm/ex4.mp3", 1),
	("A Position 5", "In this lesson we will work something...", "https://i.imgur.com/sZ85TaZ.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex5.mp3", "../assets/audios/scales/150bpm/ex5.mp3", 1),
	("E Position 1", "In this lesson we will work something...", "https://i.imgur.com/ahINcf4.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex6.mp3", "../assets/audios/scales/150bpm/ex6.mp3", 1),
	("E Position 4", "In this lesson we will work something...", "https://i.imgur.com/hGuiR2T.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex7.mp3", "../assets/audios/scales/150bpm/ex7.mp3", 1),
	("E Position 5", "In this lesson we will work something...", "https://i.imgur.com/JBIFyU9.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex8.mp3", "../assets/audios/scales/150bpm/ex8.mp3", 1),
	("D Position 1", "In this lesson we will work something...", "https://i.imgur.com/NAQkF8h.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex9.mp3", "../assets/audios/scales/150bpm/ex9.mp3", 1),
	-- Pentatonic Minor Basic 	Sequence 4 Notes -- 10
    ("A Position 1", "In this lesson we will work something...", "https://i.imgur.com/ftxZbDV.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex10.mp3", "../assets/audios/scales/150bpm/ex10.mp3", 2),
	("E Position 4", "In this lesson we will work something...", "https://i.imgur.com/8vBjN2Z.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex11.mp3", "../assets/audios/scales/150bpm/ex11.mp3", 2),
	("D Position 4", "In this lesson we will work something...", "https://i.imgur.com/rC9bQs1.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex12.mp3", "../assets/audios/scales/150bpm/ex12.mp3", 2),
    -- Pentatonic Minor Basic 	Melodic Segments -- 13
    ("A Position 5 / 1", "In this lesson we will work something...", "https://i.imgur.com/a9Ai0pZ.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex13.mp3", "../assets/audios/scales/150bpm/ex13.mp3", 3),
	("E Position 3 / 4", "In this lesson we will work something...", "https://i.imgur.com/kFdmxX6.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex14.mp3", "../assets/audios/scales/150bpm/ex14.mp3", 3),
	("D Position 4 / 5", "In this lesson we will work something...", "https://i.imgur.com/xyN7V3D.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex15.mp3", "../assets/audios/scales/150bpm/ex15.mp3", 3),
    -- Pentatonic Minor Diagonal 	Linear Run -- 16
    ("A Position 1", "In this lesson we will work something...", "https://i.imgur.com/NUSmMrm.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex16.mp3", "../assets/audios/scales/150bpm/ex16.mp3", 4),
	("A Position 2", "In this lesson we will work something...", "https://i.imgur.com/gq5Pdj8.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex17.mp3", "../assets/audios/scales/150bpm/ex17.mp3", 4),
    -- Pentatonic Minor Diagonal	Melodic Segments -- 18
    ("E Position 1", "In this lesson we will work something...", "https://i.imgur.com/Ko1w5wu.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex18.mp3", "../assets/audios/scales/150bpm/ex18.mp3", 5),
	("E Position 2", "In this lesson we will work something...", "https://i.imgur.com/pJfvbvy.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex19.mp3", "../assets/audios/scales/150bpm/ex19.mp3", 5),
    -- Pentatonic Minor Hybrid Linear Run -- 20
	("A Position 1/2", "In this lesson we will work something...", "https://i.imgur.com/C4n2YLK.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex20.mp3", "../assets/audios/scales/150bpm/ex20.mp3", 6),
	("E Position 4/5", "In this lesson we will work something...", "https://i.imgur.com/jMvNnPS.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex21.mp3", "../assets/audios/scales/150bpm/ex21.mp3", 6),
	("E Position 5/1", "In this lesson we will work something...", "https://i.imgur.com/PpxgPlc.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex22.mp3", "../assets/audios/scales/150bpm/ex22.mp3", 6),
    
    -- Berklee Basic Major Linear Run -- 23
	("C Position 1", "In this lesson we will work something...", "https://i.imgur.com/oAlzhbB.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex23.mp3", "../assets/audios/scales/150bpm/ex23.mp3", 7),
	("C Position 2", "In this lesson we will work something...", "https://i.imgur.com/uCyHsRb.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex24.mp3", "../assets/audios/scales/150bpm/ex24.mp3", 7),
	("C Position 3", "In this lesson we will work something...", "https://i.imgur.com/OBcjp9V.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex25.mp3", "../assets/audios/scales/150bpm/ex25.mp3", 7),
	("C Position 4", "In this lesson we will work something...", "https://i.imgur.com/Je6TdBp.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex26.mp3", "../assets/audios/scales/150bpm/ex26.mp3", 7),
	("C Position 5", "In this lesson we will work something...", "https://i.imgur.com/KRwLHNp.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex27.mp3", "../assets/audios/scales/150bpm/ex27.mp3", 7),
    ("E Position 1", "In this lesson we will work something...", "https://i.imgur.com/siR2aNf.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex28.mp3", "../assets/audios/scales/150bpm/ex28.mp3", 7),
	("E Position 3", "In this lesson we will work something...", "https://i.imgur.com/tZJSDy8.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex29.mp3", "../assets/audios/scales/150bpm/ex29.mp3", 7),
	("E Position 4", "In this lesson we will work something...", "https://i.imgur.com/Q4ffBAt.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex30.mp3", "../assets/audios/scales/150bpm/ex30.mp3", 7),
	("G Position 5", "In this lesson we will work something...", "https://i.imgur.com/pGuPXEm.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex31.mp3", "../assets/audios/scales/150bpm/ex31.mp3", 7),
    -- Berklee Basic Major  Sequence 4 Notes -- 32
    ("C Position 1", "In this lesson we will work something...", "https://i.imgur.com/9vsI1xI.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex32.mp3", "../assets/audios/scales/150bpm/ex32.mp3", 8),
	("G Position 2", "In this lesson we will work something...", "https://i.imgur.com/30kMpYC.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex33.mp3", "../assets/audios/scales/150bpm/ex33.mp3", 8),
	("D Position 3", "In this lesson we will work something...", "https://i.imgur.com/OENHbDJ.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex34.mp3", "../assets/audios/scales/150bpm/ex34.mp3", 8),
	("A Position 4", "In this lesson we will work something...", "https://i.imgur.com/MKg7jKN.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex35.mp3", "../assets/audios/scales/150bpm/ex35.mp3", 8),
	("F Position 5", "In this lesson we will work something...", "https://i.imgur.com/WO11csH.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex36.mp3", "../assets/audios/scales/150bpm/ex36.mp3", 8),   
    -- Berklee Basic Major  Intervals -- 37
    ("C Position 1 3as", "In this lesson we will work something...", "https://i.imgur.com/CD8Ixb9.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex37.mp3", "../assets/audios/scales/150bpm/ex37.mp3", 9),
	("G Position 2 4as", "In this lesson we will work something...", "https://i.imgur.com/dCP1gxq.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex38.mp3", "../assets/audios/scales/150bpm/ex38.mp3", 9),
	("D Position 3 5as", "In this lesson we will work something...", "https://i.imgur.com/1Y9DFpc.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex39.mp3", "../assets/audios/scales/150bpm/ex39.mp3", 9),
	("A Position 4 6as", "In this lesson we will work something...", "https://i.imgur.com/PuAi7U4.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex40.mp3", "../assets/audios/scales/150bpm/ex40.mp3", 9),
	("F Position 5 3as", "In this lesson we will work something...", "https://i.imgur.com/9vUvc8A.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex41.mp3", "../assets/audios/scales/150bpm/ex41.mp3", 9),
	-- Berklee Basic Major  Melodic Segments -- 42
    ("C Position 1", "In this lesson we will work something...", "https://i.imgur.com/WekojAM.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex42.mp3", "../assets/audios/scales/150bpm/ex42.mp3", 10),
	("G Position 2", "In this lesson we will work something...", "https://i.imgur.com/AwwMrhj.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex43.mp3", "../assets/audios/scales/150bpm/ex43.mp3", 10),
    
    -- 3NPS Major Linear Run -- 44
	("F Position 1", "In this lesson we will work something...", "https://i.imgur.com/Etltju4.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex44.mp3", "../assets/audios/scales/150bpm/ex44.mp3", 11),
	("F Position 2", "In this lesson we will work something...", "https://i.imgur.com/AgtJoqc.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex45.mp3", "../assets/audios/scales/150bpm/ex45.mp3", 11),
	("F Position 3", "In this lesson we will work something...", "https://i.imgur.com/soCHLVN.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex46.mp3", "../assets/audios/scales/150bpm/ex46.mp3", 11),
	("F Position 4", "In this lesson we will work something...", "https://i.imgur.com/S6J96qb.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex47.mp3", "../assets/audios/scales/150bpm/ex47.mp3", 11),
	("F Position 5", "In this lesson we will work something...", "https://i.imgur.com/HApd0Op.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex48.mp3", "../assets/audios/scales/150bpm/ex48.mp3", 11),
    ("F Position 6", "In this lesson we will work something...", "https://i.imgur.com/Fx7mb5z.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex49.mp3", "../assets/audios/scales/150bpm/ex49.mp3", 11),
	("F Position 7", "In this lesson we will work something...", "https://i.imgur.com/kEHlDbg.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex50.mp3", "../assets/audios/scales/150bpm/ex50.mp3", 11),
    -- 3NPS Major  Intervals -- 51
	("G Position 1 3as", "In this lesson we will work something...", "https://i.imgur.com/lNhgozN.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex51.mp3", "../assets/audios/scales/150bpm/ex51.mp3", 12),
	("D Position 6 6as", "In this lesson we will work something...", "https://i.imgur.com/q8qok72.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex52.mp3", "../assets/audios/scales/150bpm/ex52.mp3", 12),
	-- 3NPS Major  Melodic Segments -- 53
    ("C Position 4", "In this lesson we will work something...", "https://i.imgur.com/WKzJnSL.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex53.mp3", "../assets/audios/scales/150bpm/ex53.mp3", 13),
	("A Position 1", "In this lesson we will work something...", "https://i.imgur.com/6fB0NUV.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex54.mp3", "../assets/audios/scales/150bpm/ex54.mp3", 13),
    -- Full Scale Major Linear Run -- 55
	("C Position 1", "In this lesson we will work something...", "https://i.imgur.com/9Gw8Qd0.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex55.mp3", "../assets/audios/scales/150bpm/ex55.mp3", 14),
	("E Position 2", "In this lesson we will work something...", "https://i.imgur.com/exYrhtm.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex56.mp3", "../assets/audios/scales/150bpm/ex56.mp3", 14),
	("G Position 3", "In this lesson we will work something...", "https://i.imgur.com/LcIQSfR.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex57.mp3", "../assets/audios/scales/150bpm/ex57.mp3", 14),
    -- MiniPosition Major Linear Run -- 58
	("C Position 12", "In this lesson we will work something...", "https://i.imgur.com/Sj1fnrm.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex58.mp3", "../assets/audios/scales/150bpm/ex58.mp3", 15),
	("C Position 34", "In this lesson we will work something...", "https://i.imgur.com/OpK0dCZ.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex59.mp3", "../assets/audios/scales/150bpm/ex59.mp3", 15),
	("C Position 56", "In this lesson we will work something...", "https://i.imgur.com/osplpLa.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex60.mp3", "../assets/audios/scales/150bpm/ex60.mp3", 15),
    -- MiniPosition Major Melodic Segments -- 61
	("G Position 12", "In this lesson we will work something...", "https://i.imgur.com/hVgxLBg.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex61.mp3", "../assets/audios/scales/150bpm/ex61.mp3", 16),
	("G Position 34", "In this lesson we will work something...", "https://i.imgur.com/EAWKStD.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex62.mp3", "../assets/audios/scales/150bpm/ex62.mp3", 16),
	("G Position 56", "In this lesson we will work something...", "https://i.imgur.com/PlRYEwR.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex63.mp3", "../assets/audios/scales/150bpm/ex63.mp3", 16),
    -- Berklee Basic Melodic Minor Linear Run -- 64
	("C Position 1", "In this lesson we will work something...", "https://i.imgur.com/A5SuWE2.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex64.mp3", "../assets/audios/scales/150bpm/ex64.mp3", 17),
	("C Position 2", "In this lesson we will work something...", "https://i.imgur.com/hMr7hLY.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex65.mp3", "../assets/audios/scales/150bpm/ex65.mp3", 17),
	("C Position 3", "In this lesson we will work something...", "https://i.imgur.com/pTCAdP4.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex66.mp3", "../assets/audios/scales/150bpm/ex66.mp3", 17),
	("C Position 4", "In this lesson we will work something...", "https://i.imgur.com/sYiTsfz.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex67.mp3", "../assets/audios/scales/150bpm/ex67.mp3", 17),
	("C Position 5", "In this lesson we will work something...", "https://i.imgur.com/7OrevgT.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex68.mp3", "../assets/audios/scales/150bpm/ex68.mp3", 17),
    ("A Position 1", "In this lesson we will work something...", "https://i.imgur.com/D1nTxut.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex69.mp3", "../assets/audios/scales/150bpm/ex69.mp3", 17),
    -- Berklee Basic Melodic Minor  Sequence 4 Notes -- 70
    ("C Position 1", "In this lesson we will work something...", "https://i.imgur.com/ne0wSTf.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex70.mp3", "../assets/audios/scales/150bpm/ex70.mp3", 18),
	("G Position 2", "In this lesson we will work something...", "https://i.imgur.com/tKM1sEE.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex71.mp3", "../assets/audios/scales/150bpm/ex71.mp3", 18),
    -- Berklee Basic Melodic Minor  Intervals -- 72
    ("C Position 1 3as", "In this lesson we will work something...", "https://i.imgur.com/hp48tEq.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex72.mp3", "../assets/audios/scales/150bpm/ex72.mp3", 19),
	("G Position 2 4as", "In this lesson we will work something...", "https://i.imgur.com/lSEEhzy.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex73.mp3", "../assets/audios/scales/150bpm/ex73.mp3", 19),
	("D Position 3 5as", "In this lesson we will work something...", "https://i.imgur.com/b3r34p3.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex74.mp3", "../assets/audios/scales/150bpm/ex74.mp3", 19),
	("A Position 4 6as", "In this lesson we will work something...", "https://i.imgur.com/0PUQ8iT.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex75.mp3", "../assets/audios/scales/150bpm/ex75.mp3", 19),
	("F Position 5 3as", "In this lesson we will work something...", "https://i.imgur.com/YkFIn1y.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex76.mp3", "../assets/audios/scales/150bpm/ex76.mp3", 19),
	-- Berklee Basic Melodic Minor  Melodic Segments -- 77
    ("C Position 1", "In this lesson we will work something...", "https://i.imgur.com/auKMC65.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex77.mp3", "../assets/audios/scales/150bpm/ex77.mp3", 20),
	("G Position 2", "In this lesson we will work something...", "https://i.imgur.com/ku0ALSL.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex78.mp3", "../assets/audios/scales/150bpm/ex78.mp3", 20),
    -- Full Scale Melodic Minor Linear Run --
	("C Position 1", "In this lesson we will work something...", "https://i.imgur.com/Hehtvw4.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex79.mp3", "../assets/audios/scales/150bpm/ex79.mp3", 21),
	("G Position 2", "In this lesson we will work something...", "https://i.imgur.com/P9DVuXe.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex80.mp3", "../assets/audios/scales/150bpm/ex80.mp3", 21),
    -- Diminished Vertical Positions Linear Run --
	("C Position 1", "In this lesson we will work something...", "https://i.imgur.com/8WfEfxj.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex81.mp3", "../assets/audios/scales/150bpm/ex81.mp3", 22),
	("G Position 2", "In this lesson we will work something...", "https://i.imgur.com/a57ovM3.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex82.mp3", "../assets/audios/scales/150bpm/ex82.mp3", 22),
    -- Diminished Vertical Positions Intervals --
	("C Position 1 3as", "In this lesson we will work something...", "https://i.imgur.com/0tcZihs.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex83.mp3", "../assets/audios/scales/150bpm/ex83.mp3", 23),
	("G Position 2 6as", "In this lesson we will work something...", "https://i.imgur.com/PAPjTvs.png", "// Play as smoothly as possible.", "../assets/audios/scales/100bpm/ex84.mp3", "../assets/audios/scales/150bpm/ex84.mp3", 23)
;	
