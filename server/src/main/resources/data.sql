DROP TABLE IF EXISTS FACTIONS;
 
CREATE TABLE FACTIONS (
	FACTION_ID serial PRIMARY KEY,
	NAME VARCHAR(250)  UNIQUE NOT NULL,
	COLOR VARCHAR(7),
	RULER VARCHAR(250),
	CLAIMANT VARCHAR(250),
	CAPITAL VARCHAR(250)
);

INSERT INTO FACTIONS (NAME, COLOR, RULER, CLAIMANT, CAPITAL) 
	VALUES ('Khergit Khanate', '#cc99ff', 'Sanjar Khan', 'Dustum Khan','Tulga');

INSERT INTO FACTIONS (NAME, COLOR, RULER, CLAIMANT, CAPITAL) 
	VALUES 
('Kingdom of Nords','#33dddd','King Ragnar','Lethwin Far-Seeker','Sargoth');

INSERT INTO FACTIONS (NAME, COLOR, RULER, CLAIMANT, CAPITAL) 
	VALUES 
('Kingdom of Rhodoks','#33dd33','King Graveth','Lord Kastor of Veluca','Jelkala');

INSERT INTO FACTIONS (NAME, COLOR, RULER, CLAIMANT, CAPITAL) 
	VALUES 
('Kingdom of Swadia','#ee7744','King Harlaus','Lady Isolla of Suno','Praven');


INSERT INTO FACTIONS (NAME, COLOR, RULER, CLAIMANT, CAPITAL) 
	VALUES 
('Kingdom of Vaegirs','#ccbb99','King Yaroglek','Prince Valdym the Bastard','Reyvadin');

INSERT INTO FACTIONS (NAME, COLOR, RULER, CLAIMANT, CAPITAL) 
	VALUES 
('Sarranid Sultanate','#dddd33','Sultan Hakim','Arwa the Pearled One','Shariz');

COMMIT;