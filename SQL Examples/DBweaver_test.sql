SELECT * FROM player;
SELECT * FROM team;

select p.id, p.name, t.team_id, t.team_name 
from player p 
join team t 
on p.team_id = t.team_id;

select p.id, p.name, t.team_id, t.team_name 
from player p 
left join team t 
on p.team_id = t.team_id;

select p.id, p.name, t.team_id, t.team_name 
from player p 
right join team t 
on p.team_id = t.team_id;

select p.id, p.name, t.team_id, t.team_name 
from player p 
full outer join team t 
on p.team_id = t.team_id;

-- '' is not the same as "" in SQL
select *
from player  
where "name" = 'Chuck Norris';

-- Order by Team Name
select p.id, p.name, t.team_name
from player p
left join team t
on p.team_id = t.team_id 
order by t.team_name;

-- Group by team name and get the count of players
select count(p.id), t.team_name 
from player p
join team t
on p.team_id = t.team_id 
group by t.team_name; 

-- Return all teams with number of players greater than 1
select count(p.id), t.team_name 
from player p
join team t
on p.team_id = t.team_id 
group by t.team_name
having count(p.id) > 1;

-- Cross Join
select *
from player
cross join team;

-- Inserting data
insert into team (team_id, team_name)
values (103, 'Raiders'),
		(104, 'Seahawks'),
		(105, 'Falcons');
		
-- View the team data
select * from team;

insert into player (id, name, team_id)
values (6, 'Michael Jordan', 105),
		(7, 'Kevin Beckem', 104),
		(8, 'Austin Durant', 104),
		(9, 'Tim Mathews', 103),
		(10, 'Craig Peterson', 103),
		(11, 'Jackie Chan', 101);
		
select * from player;

-- Get highest player id
select max(id) 
from player;

-- Get the smallest team id
select min(team_id)
from team;

-- Count the number of players in the Seahawks
select count(name)
from player 
where team_id in (

	select team_id
	from team 
	where team_id = 104);

-- Get the sum of player id's who are on the chargers
select sum(id)
from player
where team_id = 100;

-- Get the character length of Chuck Norris
select character_length(name)
from player 
where name = 'Chuck Norris';

-- Get the average team id
select avg(team_id)
from team;

-- Update Michael Vick to be on the Raiders
update player 
set team_id = 103
where id = 4;

-- View the table
select * from player;

select name from player
union
select team_name from team;