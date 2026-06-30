select user_id,count(follower_id) as Followers_count from Followers
group by user_id
order by user_id asc;