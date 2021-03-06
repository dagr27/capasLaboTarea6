PGDMP     ;                    x            contribuyentes    11.8    11.8     	           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            
           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false                       1262    16407    contribuyentes    DATABASE     �   CREATE DATABASE contribuyentes WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_United States.1252' LC_CTYPE = 'English_United States.1252';
    DROP DATABASE contribuyentes;
             postgres    false            �            1259    16410    contribuyente    TABLE     �   CREATE TABLE public.contribuyente (
    c_contribuyente integer NOT NULL,
    c_importancia integer,
    s_nombre character varying(30),
    s_apellido character varying(30),
    s_nit character varying(14),
    f_fecha_ingreso date
);
 !   DROP TABLE public.contribuyente;
       public         postgres    false            �            1259    16408 !   contribuyente_c_contribuyente_seq    SEQUENCE     �   CREATE SEQUENCE public.contribuyente_c_contribuyente_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 8   DROP SEQUENCE public.contribuyente_c_contribuyente_seq;
       public       postgres    false    197                       0    0 !   contribuyente_c_contribuyente_seq    SEQUENCE OWNED BY     g   ALTER SEQUENCE public.contribuyente_c_contribuyente_seq OWNED BY public.contribuyente.c_contribuyente;
            public       postgres    false    196            �            1259    16418    importancia    TABLE     q   CREATE TABLE public.importancia (
    c_importancia integer NOT NULL,
    s_importancia character varying(30)
);
    DROP TABLE public.importancia;
       public         postgres    false            �            1259    16416    importancia_c_importancia_seq    SEQUENCE     �   CREATE SEQUENCE public.importancia_c_importancia_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 4   DROP SEQUENCE public.importancia_c_importancia_seq;
       public       postgres    false    199                       0    0    importancia_c_importancia_seq    SEQUENCE OWNED BY     _   ALTER SEQUENCE public.importancia_c_importancia_seq OWNED BY public.importancia.c_importancia;
            public       postgres    false    198            �
           2604    16413    contribuyente c_contribuyente    DEFAULT     �   ALTER TABLE ONLY public.contribuyente ALTER COLUMN c_contribuyente SET DEFAULT nextval('public.contribuyente_c_contribuyente_seq'::regclass);
 L   ALTER TABLE public.contribuyente ALTER COLUMN c_contribuyente DROP DEFAULT;
       public       postgres    false    197    196    197            �
           2604    16421    importancia c_importancia    DEFAULT     �   ALTER TABLE ONLY public.importancia ALTER COLUMN c_importancia SET DEFAULT nextval('public.importancia_c_importancia_seq'::regclass);
 H   ALTER TABLE public.importancia ALTER COLUMN c_importancia DROP DEFAULT;
       public       postgres    false    198    199    199                      0    16410    contribuyente 
   TABLE DATA               u   COPY public.contribuyente (c_contribuyente, c_importancia, s_nombre, s_apellido, s_nit, f_fecha_ingreso) FROM stdin;
    public       postgres    false    197   �                 0    16418    importancia 
   TABLE DATA               C   COPY public.importancia (c_importancia, s_importancia) FROM stdin;
    public       postgres    false    199   �                  0    0 !   contribuyente_c_contribuyente_seq    SEQUENCE SET     O   SELECT pg_catalog.setval('public.contribuyente_c_contribuyente_seq', 2, true);
            public       postgres    false    196                       0    0    importancia_c_importancia_seq    SEQUENCE SET     K   SELECT pg_catalog.setval('public.importancia_c_importancia_seq', 3, true);
            public       postgres    false    198            �
           2606    16415     contribuyente contribuyente_pkey 
   CONSTRAINT     k   ALTER TABLE ONLY public.contribuyente
    ADD CONSTRAINT contribuyente_pkey PRIMARY KEY (c_contribuyente);
 J   ALTER TABLE ONLY public.contribuyente DROP CONSTRAINT contribuyente_pkey;
       public         postgres    false    197            �
           2606    16423    importancia importancia_pkey 
   CONSTRAINT     e   ALTER TABLE ONLY public.importancia
    ADD CONSTRAINT importancia_pkey PRIMARY KEY (c_importancia);
 F   ALTER TABLE ONLY public.importancia DROP CONSTRAINT importancia_pkey;
       public         postgres    false    199            �
           2606    16424    contribuyente c_importancia    FK CONSTRAINT     �   ALTER TABLE ONLY public.contribuyente
    ADD CONSTRAINT c_importancia FOREIGN KEY (c_importancia) REFERENCES public.importancia(c_importancia);
 E   ALTER TABLE ONLY public.contribuyente DROP CONSTRAINT c_importancia;
       public       postgres    false    197    2696    199               M   x�3�4�LJJ�,I���WHIU��/�/)�/VH-V(�S(NM.J-��4426153�4202�50�52�2"E+��=... y�!�         (   x�3�t/J�KI-�2��MM�L��/�2��/)�1z\\\ �s	�     