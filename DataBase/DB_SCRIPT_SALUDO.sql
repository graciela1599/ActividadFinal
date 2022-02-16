--
-- PostgreSQL database dump
--

-- Dumped from database version 14.2
-- Dumped by pg_dump version 14.2

-- Started on 2022-02-16 16:09:43

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 210 (class 1259 OID 16396)
-- Name: saludo; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.saludo (
    id integer NOT NULL,
    tipo character varying(10),
    saludo character varying(50),
    CONSTRAINT only_three_values CHECK ((((tipo)::text = 'dia'::text) OR ((tipo)::text = 'noche'::text) OR ((tipo)::text = 'tarde'::text)))
);


ALTER TABLE public.saludo OWNER TO postgres;

--
-- TOC entry 209 (class 1259 OID 16395)
-- Name: Saludos_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public."Saludos_id_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public."Saludos_id_seq" OWNER TO postgres;

--
-- TOC entry 3314 (class 0 OID 0)
-- Dependencies: 209
-- Name: Saludos_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public."Saludos_id_seq" OWNED BY public.saludo.id;


--
-- TOC entry 3164 (class 2604 OID 16399)
-- Name: saludo id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.saludo ALTER COLUMN id SET DEFAULT nextval('public."Saludos_id_seq"'::regclass);


--
-- TOC entry 3167 (class 2606 OID 16401)
-- Name: saludo Saludos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.saludo
    ADD CONSTRAINT "Saludos_pkey" PRIMARY KEY (id);


--
-- TOC entry 3169 (class 2606 OID 16407)
-- Name: saludo tipo_unique; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.saludo
    ADD CONSTRAINT tipo_unique UNIQUE (tipo);


-- Completed on 2022-02-16 16:09:44

--
-- PostgreSQL database dump complete
--

