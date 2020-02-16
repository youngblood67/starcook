select * from article a
inner join art_catalog ac on a.id=ac.id_art
inner join catalog c on ac.id_catalog=c.id
where c.label = 'catalogue boxe' ;