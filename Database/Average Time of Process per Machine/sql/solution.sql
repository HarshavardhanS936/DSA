select a.machine_id,round(avg(s.timestamp-a.timestamp),3) as processing_time from 
Activity a
join Activity s on a.machine_id=s.machine_id and a.process_id=s.process_id and 
a.activity_type='start' and s.activity_type='end'
group by a.machine_id;
