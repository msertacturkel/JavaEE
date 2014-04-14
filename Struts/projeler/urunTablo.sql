
    create table "CLASSICCARS"."URUN"(
        "URUN_NO" INTEGER not null,
       "AD" VARCHAR(50),
       "KOD" VARCHAR(10),
       "FIYAT" INTEGER,       
        constraint "SQL070512054941981" primary key ("URUN_NO")
    );
    
    insert into urun (URUN_NO,AD,KOD,FIYAT) values(1, 'Elma', 'elm', 3);
    insert into urun (URUN_NO,AD,KOD,FIYAT) values(2, 'Portakal', 'port', 5);
    insert into urun (URUN_NO,AD,KOD,FIYAT) values(3, 'Nar', 'nar', 5);