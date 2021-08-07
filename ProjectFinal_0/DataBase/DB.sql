-- DROP SCHEMA public;

CREATE SCHEMA public AUTHORIZATION postgres;

-- public.account_table definition

-- Drop table

-- DROP TABLE public.account_table;

CREATE TABLE public.account_table (
	id serial NOT NULL,
	acct_type varchar(30) NOT NULL,
	balance float8 NOT NULL,
	CONSTRAINT account_table_pkey PRIMARY KEY (id)
);

-- public.user_table definition

-- Drop table

-- DROP TABLE public.user_table;

CREATE TABLE public.user_table (
	id serial NOT NULL,
	first_name varchar(30) NOT NULL,
	last_name varchar(30) NOT NULL,
	acct_ids varchar(100) NULL,
	CONSTRAINT user_table_pkey PRIMARY KEY (id)
);

-- public.users_accounts definition

-- Drop table

-- DROP TABLE public.users_accounts;

CREATE TABLE public.users_accounts (
	users_id int4 NOT NULL,
	accounts_id int4 NOT NULL,
	CONSTRAINT users_acct_pk PRIMARY KEY (users_id, accounts_id)
);


-- public.users_accounts foreign keys

ALTER TABLE public.users_accounts ADD CONSTRAINT users_accounts_accounts_id_fkey FOREIGN KEY (accounts_id) REFERENCES public.account_table(id);
ALTER TABLE public.users_accounts ADD CONSTRAINT users_accounts_users_id_fkey FOREIGN KEY (users_id) REFERENCES public.user_table(id);