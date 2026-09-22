-- マラソン日記: 走行記録テーブル
create table diary (
  diary_id bigserial primary key,
  run_date date not null,
  distance_km numeric(5, 2) not null,
  memo varchar(200),
  created_at timestamp not null default current_timestamp
);
