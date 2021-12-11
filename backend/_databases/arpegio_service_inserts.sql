USE arpegio_service;

INSERT INTO `subject` 
	(id, subject_name, subject_order, module_name) 
VALUES
	(1, "Triads", 1, "ARPEGGIO_MODULE"),
	(2, "7th Chords", 2, "ARPEGGIO_MODULE");

INSERT INTO `section` 
	(id, section_name, section_order, subject_id) 
VALUES
	(1, "Triads in Position", 1, 1),
	(2, "Triads Sweep Picking", 2, 1),  
	(3, "7th Chords in Position", 1, 2),
	(4, "7th Chords Sweep Picking", 2, 2)
;

INSERT INTO `unit` 
	(id, unit_name, unit_order, section_id) 
VALUES
	(1, "Static Harmony", 1, 1),
	(2, "Diatonic Progression", 2, 1),
	(3, "Static Harmony", 1, 2),
    (4, "Diatonic Progression", 2, 2),
    (5, "Static Harmony", 1, 3),
    (6, "Diatonic Progression", 2, 3),
	(7, "Static Harmony", 1, 4),
	(8, "Diatonic Progression", 2, 4)
;

INSERT INTO `post`
	(id, post_title, post_body, unit_id)
VALUES
	(1, "Static Triads in Position", "Let's play some chords...", 1),
	(2, "Diatonic Triads in Position", "Let's play some chords...", 2),
	(3, "Static Triads Sweep", "Let's play some chords...", 3),
	(4, "Diatonic Triads Sweep", "Let's play some chords...", 4),
	(5, "Static 7th Chords in Position", "Let's play some chords...", 5),
	(6, "Diatonic 7th Chords in Position", "Let's play some chords...", 6),
	(7, "Static 7th Chords Sweep Picking", "Let's play some chords...", 7),
	(8, "Diatonic 7th Chords Sweep Picking", "Let's play some chords...", 8)
;

INSERT INTO `lesson`
	(lesson_title, text_body, image_url, advice_text, audio_slow_url, audio_fast_url, unit_id)
VALUES
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
