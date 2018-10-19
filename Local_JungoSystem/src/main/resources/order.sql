create table order_tb (
id int auto_increment primary key,
order_num varchar(20),
image varchar(20),
pro_name varchar(20),
pro_content varchar(512),
price int,
checkYN varchar(5),
status varchar(20),
memo varchar(512),
order_name varchar(10),
order_phone varchar(20),
order_address varchar(100),
order_date varchar(40)
);

alter table order_tb convert to charset utf8;

alter table order_tb modify column checkYN varchar(5) default 'N';
alter table order_tb modify column image varchar(40);

insert into order_tb (order_num, image, pro_name, pro_content, price, status, memo, order_name, order_phone, order_address)
values ('20181019_123123', '20181019_123123_9738',
			'아이폰', '아이폰팝니다팝니다팝니다', 80000, 
			'검토중', '', '김승준', '010-1111-1111', '경남 진주시 칠암동');