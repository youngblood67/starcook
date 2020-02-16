INSERT INTO promotion(amount,start_date,end_date) VALUES (0.1,null,null);
INSERT INTO promotion(amount,start_date,end_date) VALUES (0.2,null,null);
INSERT INTO promotion(amount,start_date,end_date) VALUES (0.25,null,null);
INSERT INTO promotion(amount,start_date,end_date) VALUES (0.50,null,null);

INSERT INTO tax(amount) VALUES (0.1);
INSERT INTO tax(amount) VALUES (0.05);

INSERT INTO category(label,ID_TAXE) VALUES ('boxe',1);
INSERT INTO category(label,ID_TAXE) VALUES ('football',2);

INSERT INTO article(ref,label,priceHT,buying_price,ID_CATEGORY,ID_PROMO) VALUES ('BOX3267FF', 'Sac de frappe',120,50,1,1);
INSERT INTO article(ref,label,priceHT,buying_price,ID_CATEGORY,ID_PROMO) VALUES ('BOX4557EF', 'Gants de boxe', 40,10,1,1);
INSERT INTO article(ref,label,priceHT,buying_price,ID_CATEGORY,ID_PROMO) VALUES ('SOC1475OP', 'Ballon de football', 19,5,2,2);
INSERT INTO article(ref,label,priceHT,buying_price,ID_CATEGORY,ID_PROMO) VALUES ('SOC98711M', 'Maillot de football',  49,10,2,2);

INSERT INTO `catalog`(label) VALUES('catalogue boxe');
INSERT INTO `catalog`(label) VALUES('catalogue football');

INSERT INTO ART_CATALOG(ID_ART,ID_CATALOG) VALUES(1,1);
INSERT INTO ART_CATALOG(ID_ART,ID_CATALOG) VALUES(2,1);
INSERT INTO ART_CATALOG(ID_ART,ID_CATALOG) VALUES(3,2);
INSERT INTO ART_CATALOG(ID_ART,ID_CATALOG) VALUES(3,2);

