use passbook;

create table `merchants` (
     `id` int(10) unsigned not null auto_increment,
     `name` varchar(64) collate utf8_bin not null comment 'merchant name',
     `logo_url` varchar(256) collate utf8_bin not null comment 'merchant logo',
     `business_license_url` varchar(256) collate utf8_bin not null comment 'merchant business license',
     `phone` varchar(64) collate utf8_bin not null comment 'merchant phone',
     `address` varchar(64) collate utf8_bin not null comment 'merchant address',
     `is_audit` boolean not null comment 'audit or not',
     primary key (`id`)
) engine=InnoDB auto_increment=17 default charset=utf8;

show tables;
desc merchants;