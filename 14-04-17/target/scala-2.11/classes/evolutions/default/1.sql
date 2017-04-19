# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table basket (
  id                            bigint not null,
  customer_email                varchar(255),
  constraint uq_basket_customer_email unique (customer_email),
  constraint pk_basket primary key (id)
);
create sequence basket_seq;

create table category (
  id                            bigint not null,
  name                          varchar(255),
  constraint pk_category primary key (id)
);
create sequence category_seq;

create table category_product (
  category_id                   bigint not null,
  product_id                    bigint not null,
  constraint pk_category_product primary key (category_id,product_id)
);

create table comment (
  id                            bigint not null,
  product_id                    bigint,
  customer_email                varchar(255),
  content                       varchar(255),
  constraint pk_comment primary key (id)
);
create sequence comment_seq;

create table order_item (
  id                            bigint not null,
  order_id                      bigint,
  basket_id                     bigint,
  product_id                    bigint,
  quantity                      integer,
  price                         double,
  constraint pk_order_item primary key (id)
);
create sequence order_item_seq;

create table plike (
  like_id                       bigint not null,
  like_count                    integer,
  pl_id                         bigint,
  constraint uq_plike_pl_id unique (pl_id),
  constraint pk_plike primary key (like_id)
);
create sequence plike_seq;

create table product (
  id                            bigint not null,
  name                          varchar(255),
  description                   varchar(255),
  stock                         integer,
  price                         double,
  constraint pk_product primary key (id)
);
create sequence product_seq;

create table shop_order (
  id                            bigint not null,
  order_date                    timestamp,
  deliver_date                  timestamp,
  order_status                  varchar(255),
  customer_email                varchar(255),
  constraint pk_shop_order primary key (id)
);
create sequence shop_order_seq;

create table size (
  id                            bigint not null,
  size_name                     varchar(255),
  size_qty                      varchar(255),
  product_id                    bigint,
  basket_id                     bigint,
  constraint pk_size primary key (id)
);
create sequence size_seq;

create table user (
  role                          varchar(255),
  email                         varchar(255) not null,
  f_name                        varchar(255),
  l_name                        varchar(255),
  password                      varchar(255),
  password2                     varchar(255),
  department                    varchar(255),
  street1                       varchar(255),
  street2                       varchar(255),
  town                          varchar(255),
  post_code                     varchar(255),
  credit_card                   varchar(255),
  constraint pk_user primary key (email)
);

create table plike_user (
  user_email                    varchar(255) not null,
  plike_like_id                 bigint not null,
  constraint pk_plike_user primary key (user_email,plike_like_id)
);

alter table basket add constraint fk_basket_customer_email foreign key (customer_email) references user (email) on delete restrict on update restrict;

alter table category_product add constraint fk_category_product_category foreign key (category_id) references category (id) on delete restrict on update restrict;
create index ix_category_product_category on category_product (category_id);

alter table category_product add constraint fk_category_product_product foreign key (product_id) references product (id) on delete restrict on update restrict;
create index ix_category_product_product on category_product (product_id);

alter table comment add constraint fk_comment_product_id foreign key (product_id) references product (id) on delete restrict on update restrict;
create index ix_comment_product_id on comment (product_id);

alter table comment add constraint fk_comment_customer_email foreign key (customer_email) references user (email) on delete restrict on update restrict;
create index ix_comment_customer_email on comment (customer_email);

alter table order_item add constraint fk_order_item_order_id foreign key (order_id) references shop_order (id) on delete restrict on update restrict;
create index ix_order_item_order_id on order_item (order_id);

alter table order_item add constraint fk_order_item_basket_id foreign key (basket_id) references basket (id) on delete restrict on update restrict;
create index ix_order_item_basket_id on order_item (basket_id);

alter table order_item add constraint fk_order_item_product_id foreign key (product_id) references product (id) on delete restrict on update restrict;
create index ix_order_item_product_id on order_item (product_id);

alter table plike add constraint fk_plike_pl_id foreign key (pl_id) references product (id) on delete restrict on update restrict;

alter table shop_order add constraint fk_shop_order_customer_email foreign key (customer_email) references user (email) on delete restrict on update restrict;
create index ix_shop_order_customer_email on shop_order (customer_email);

alter table size add constraint fk_size_product_id foreign key (product_id) references product (id) on delete restrict on update restrict;
create index ix_size_product_id on size (product_id);

alter table size add constraint fk_size_basket_id foreign key (basket_id) references basket (id) on delete restrict on update restrict;
create index ix_size_basket_id on size (basket_id);

alter table plike_user add constraint fk_plike_user_user foreign key (user_email) references user (email) on delete restrict on update restrict;
create index ix_plike_user_user on plike_user (user_email);

alter table plike_user add constraint fk_plike_user_plike foreign key (plike_like_id) references plike (like_id) on delete restrict on update restrict;
create index ix_plike_user_plike on plike_user (plike_like_id);


# --- !Downs

alter table basket drop constraint if exists fk_basket_customer_email;

alter table category_product drop constraint if exists fk_category_product_category;
drop index if exists ix_category_product_category;

alter table category_product drop constraint if exists fk_category_product_product;
drop index if exists ix_category_product_product;

alter table comment drop constraint if exists fk_comment_product_id;
drop index if exists ix_comment_product_id;

alter table comment drop constraint if exists fk_comment_customer_email;
drop index if exists ix_comment_customer_email;

alter table order_item drop constraint if exists fk_order_item_order_id;
drop index if exists ix_order_item_order_id;

alter table order_item drop constraint if exists fk_order_item_basket_id;
drop index if exists ix_order_item_basket_id;

alter table order_item drop constraint if exists fk_order_item_product_id;
drop index if exists ix_order_item_product_id;

alter table plike drop constraint if exists fk_plike_pl_id;

alter table shop_order drop constraint if exists fk_shop_order_customer_email;
drop index if exists ix_shop_order_customer_email;

alter table size drop constraint if exists fk_size_product_id;
drop index if exists ix_size_product_id;

alter table size drop constraint if exists fk_size_basket_id;
drop index if exists ix_size_basket_id;

alter table plike_user drop constraint if exists fk_plike_user_user;
drop index if exists ix_plike_user_user;

alter table plike_user drop constraint if exists fk_plike_user_plike;
drop index if exists ix_plike_user_plike;

drop table if exists basket;
drop sequence if exists basket_seq;

drop table if exists category;
drop sequence if exists category_seq;

drop table if exists category_product;

drop table if exists comment;
drop sequence if exists comment_seq;

drop table if exists order_item;
drop sequence if exists order_item_seq;

drop table if exists plike;
drop sequence if exists plike_seq;

drop table if exists product;
drop sequence if exists product_seq;

drop table if exists shop_order;
drop sequence if exists shop_order_seq;

drop table if exists size;
drop sequence if exists size_seq;

drop table if exists user;

drop table if exists plike_user;

