CREATE TABLE public."comn_cd"
(
    div_cd character varying(3) NOT NULL,
    cd character varying(3) NOT NULL,
    ko_nm character varying(50),
    usg_yn character varying(1),
    comments character varying(100),
    reg_dt timestamp without time zone,
    reg_usr_id character varying(10),
    reg_ip character varying(16),
    PRIMARY KEY (div_cd, cd)
)
    WITH (
        OIDS = FALSE
        );

ALTER TABLE IF EXISTS public."comn_cd"
    OWNER to postgres;


CREATE TABLE public.employee
(
    emp_no character varying(10) NOT NULL,
    emp_nm character varying(10),
    comn_dep character varying(3),
    comn_hrm character varying(3),
    reg_dt timestamp without time zone,
    reg_usr_id character varying(10),
    reg_ip character varying(16),
    PRIMARY KEY (emp_no)
)
    WITH (
        OIDS = FALSE
        );

ALTER TABLE IF EXISTS public.employee
    OWNER to postgres;


CREATE TABLE public.mng_pgm_auth
(
    comn_rol character varying(3) NOT NULL,
    pgm_id character varying(10) NOT NULL,
    reg_dt timestamp without time zone,
    reg_usr_id character varying(10),
    reg_ip character varying(16),
    PRIMARY KEY (pgm_id, comn_rol)
)
    WITH (
        OIDS = FALSE
        );

ALTER TABLE IF EXISTS public.mng_pgm_auth
    OWNER to postgres;


CREATE TABLE public.usr_mng_auth
(
    usr_id character varying(10) NOT NULL,
    comn_rol character varying(3) NOT NULL,
    reg_dt timestamp without time zone,
    reg_usr_id character varying(10),
    reg_ip character varying(16),
    PRIMARY KEY (usr_id, comn_rol)
)
    WITH (
        OIDS = FALSE
        );

ALTER TABLE IF EXISTS public.usr_mng_auth
    OWNER to postgres;


CREATE TABLE public.pgm_info
(
    pgm_id character varying(10) NOT NULL,
    pgm_nm character varying(20),
    usg_yn character varying(1),
    pgm_path character varying(40),
    pgm_ord int4range,
    reg_dt timestamp without time zone,
    reg_usr_id character varying(10),
    reg_ip character varying(16),
    PRIMARY KEY (pgm_id)
)
    WITH (
        OIDS = FALSE
        );

ALTER TABLE IF EXISTS public.pgm_info
    OWNER to postgres;


CREATE TABLE public.resources
(
    res_cd character varying(13) NOT NULL,
    res_nm character varying(40),
    res_detail character varying(200),
    usg_yn character varying(1),
    comments character varying(100),
    comn_ofb character varying(3),
    comn_loc character varying(3),
    comn_rst character varying(3),
    res_opt1 character varying(100)[],
    res_opt2 character varying(100)[],
    res_opt3 character varying(100),
    res_opt4 character varying(100),
    res_opt5 character varying(100),
    reg_dt timestamp without time zone,
    reg_usr_id character varying(10),
    reg_ip character varying(16),
    PRIMARY KEY (res_cd)
)
    WITH (
        OIDS = FALSE
        );

ALTER TABLE IF EXISTS public.resources
    OWNER to postgres;


CREATE TABLE public.reservations
(
    rev_no character varying(5) NOT NULL,
    rev_sdt timestamp without time zone,
    rev_edt timestamp without time zone,
    rev_pp character varying(200),
    usr_id character varying(10),
    usr_dep character varying(3),
    usr_hrm character varying(3),
    res_cd character varying(13),
    comn_aps character varying(3),
    comn_rts character varying(3),
    reg_dt timestamp without time zone,
    reg_usr_id character varying(10),
    reg_ip character varying(16),
    PRIMARY KEY (rev_no)
)
    WITH (
        OIDS = FALSE
        );

ALTER TABLE IF EXISTS public.reservations
    OWNER to postgres;


CREATE TABLE public.members
(
    usr_id character varying(10) NOT NULL,
    usr_pw character varying(20),
    usr_nm character varying(10),
    usg_yn character varying(1),
    reg_dt timestamp without time zone,
    reg_usr_id character varying(10),
    reg_ip character varying(16),
    PRIMARY KEY (usr_id)
)
    WITH (
        OIDS = FALSE
        );

ALTER TABLE IF EXISTS public.members
    OWNER to postgres;
