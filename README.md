# starcook

-------------------------------------------------------------------------
Vérifier la disponibilité d'un article par rapport à sa référence
[GET]
[adresse_ip]:1111/articles/disponible?ref=BOX3267FF
[adresse_ip]:1111/articles/disponible/BOX3267FF
-------------------------------------------------------------------------
Commander des articles(créer une commande en payant comptant ou non)
[POST]
[adresse_ip]:1111/commandes
{
    "idClient": "1",
    "articles": [{"reference": "BOX3267FF"} ],
    "isPayed":true
}
---------------------------------------------------------------------------
Récupérer la liste des articles
[GET]
[adresse_ip]:1111/articles
---------------------------------------------------------------------------
Récupérer un article par son id
[GET]
[adresse_ip]:1111/articles/1
---------------------------------------------------------------------------
Créer un nouvel article
[POST]
[adresse_ip]:1111/articles
{
    "reference": "TEST222",
    "label": "test Post",
    "categoryLabel": "testCategory",
    "taxAmount": 132.0,
    "priceHT":200.0,
    "buyingPrice":100.0,
    "promotionAMount":20.0,
    "promotionStartDate":"2020-02-02",
    "promotionEndDate":"2020-02-03"
}
---------------------------------------------------------------------------
Récupérer la liste des catalogues
[GET]
[adresse_ip]:1111/catalogues
---------------------------------------------------------------------------
Récupérer un catalogue par son id
[GET]
[adresse_ip]:1111/catalogues/1
---------------------------------------------------------------------------
Récupérer la liste des commandes
[GET]
[adresse_ip]:1111/commandes
---------------------------------------------------------------------------
Récupérer une commande par son id
[GET]
[adresse_ip]:1111/commandes/1
