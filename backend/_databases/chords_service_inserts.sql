USE chords_service;

INSERT INTO `subject` 
	(id, subject_name, subject_order, module_name) 
VALUES
	(1, "Triads", 1, "CHORDS_MODULE"),
	(2, "7th Chords", 2, "CHORDS_MODULE");

INSERT INTO `section` 
	(id, section_name, section_order, subject_id) 
VALUES
	(1, "Triads Closed", 1, 1),
	(2, "Triads Open", 2, 1),  
	(3, "7th Chords Drop2", 1, 2),
	(4, "7th Chords Drop3", 2, 2)
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
	(1, "Static Closed Triads", "Let's play some chords...", 1),
	(2, "Diatonic Closed Triads", "Let's play some chords...", 2),
	(3, "Static Open Triads", "Let's play some chords...", 3),
	(4, "Diatonic Open Triads", "Let's play some chords...", 4),
	(5, "Static Drop2 7th Chords", "Let's play some chords...", 5),
	(6, "Diatonic Drop2 7th Chords", "Let's play some chords...", 6),
	(7, "Static Drop3 7th Chords", "Let's play some chords...", 7),
	(8, "Diatonic Drop3 7th Chords", "Let's play some chords...", 8)
;

INSERT INTO `lesson`
	(lesson_title, text_body, image_url, advice_text, audio_slow_url, audio_fast_url, unit_id)
VALUES
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
