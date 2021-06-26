package com.bugunneyesem;

import java.util.ArrayList;

public class YemekYaratici {

    ArrayList<Yemek> yemekListesi;

    public YemekYaratici(){
        yemekListesi = new ArrayList<Yemek>();
        Yemek eklenecekYemek;
        eklenecekYemek = adanaKebap();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = urfaKebap();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = tavukIzgara();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = cigKofte();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = tavukSis();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = iskender();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = pizzaNormal();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = pizzaVegan();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = icliKofte();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = kofte();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = pide();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = lahmacun();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = hamburger();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = doner();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = tantuni();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = balik();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = sosluTavuk();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = alinazik();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = ayvalikTostu();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = sandvic();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = kajun();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = durum();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = tavukluSalata();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = ssk();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = beyti();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = kuzuSis();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = karisikIzgara();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = copSis();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = corba();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = kokorec();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = kumru();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = sushi();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = makarna();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = manti();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = patatesSepet();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = ciger();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = evYemegi();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = sobiyet();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = borek();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = puding();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = sutluNuriye();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = ekler();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = yasPasta();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = kunefe();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = katmer();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = karides();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = yengec();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = ahtapot();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = kalamar();
        yemekListesi.add(eklenecekYemek);

        eklenecekYemek = su();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = madenSuyu();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = elmaSuyu();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = havucSuyu();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = visneSuyu();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = uzumSuyu();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = greyfurtSuyu();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = limonata();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = portakalSuyu();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = ananas();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = karisik();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = bira();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = cin();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = absent();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = viski();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = rom();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = tekila();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = sarap();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = votka();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = sampanya();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = raki();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = kola();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = gazoz();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = meyveliSoda();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = soda();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = sicakCikolata();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = milkshake();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = frappuccino();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = turkKahvesi();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = espresso();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = doubleEspresso();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = ristretto();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = americano();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = flatWhite();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = cappucino();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = latte();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = macchiato();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = mocha();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = whiteMocha();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = affogato();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = caramelMacchiato();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = siyahCay();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = yesilCay();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = bitkiCayi();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = meyveCayi();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = buzluCay();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = ayran();
        yemekListesi.add(eklenecekYemek);
        eklenecekYemek = baklava();
        yemekListesi.add(eklenecekYemek);
    }

    private Yemek adanaKebap(){
        Yemek yemek = new Yemek("Adana kebap");
        yemek.icerikEkle("et");
        return yemek;
    }

    private Yemek urfaKebap(){
        Yemek yemek = new Yemek("Urfa kebap");
        yemek.icerikEkle("et");
        return yemek;
    }

    private Yemek tavukIzgara(){
        Yemek yemek = new Yemek("Tavuk ızgara");
        yemek.icerikEkle("tavuk");
        return yemek;
    }

    private Yemek cigKofte(){
        Yemek yemek = new Yemek("Çiğ köfte");
        yemek.icerikEkle("bulgur");
        return yemek;
    }

    private Yemek tavukSis(){
        Yemek yemek = new Yemek("Tavuk Şiş");
        yemek.icerikEkle("tavuk");
        return yemek;
    }

    private Yemek iskender(){
        Yemek yemek = new Yemek("İskender");
        yemek.icerikEkle("et");
        return yemek;
    }

    private Yemek pizzaNormal(){
        Yemek yemek = new Yemek("Pizza");
        yemek.icerikEkle("et");
        yemek.icerikEkle("sosis");
        yemek.icerikEkle("sucuk");
        yemek.icerikEkle("salam");
        return yemek;
    }

    private Yemek pizzaVegan(){
        Yemek yemek = new Yemek("Pizza (Vegan)");
        yemek.icerikEkle("salata");
        return yemek;
    }

    private Yemek icliKofte(){
        Yemek yemek = new Yemek("İçli Köfte");
        yemek.icerikEkle("kıyma");
        yemek.icerikEkle("bulgur");
        return yemek;
    }

    private Yemek kofte(){
        Yemek yemek = new Yemek("Köfte");
        yemek.icerikEkle("kıyma");
        return yemek;
    }

    private Yemek pide(){
        Yemek yemek = new Yemek("Pide");
        yemek.icerikEkle("et");
        return yemek;
    }

    private Yemek lahmacun(){
        Yemek yemek = new Yemek("Lahmacun");
        yemek.icerikEkle("et");
        return yemek;
    }

    private Yemek hamburger(){
        Yemek yemek = new Yemek("Hamburger");
        yemek.icerikEkle("et");
        return yemek;
    }


    private Yemek doner(){
        Yemek yemek = new Yemek("Döner");
        yemek.icerikEkle("et");
        return yemek;
    }

    private Yemek balik(){
        Yemek yemek = new Yemek("Balık");
        yemek.icerikEkle("balık");
        return yemek;
    }

    private Yemek tantuni(){
        Yemek yemek = new Yemek("Tantuni");
        yemek.icerikEkle("et");
        return yemek;
    }

    private Yemek sosluTavuk(){
        Yemek yemek = new Yemek("Soslu Tavuk");
        yemek.icerikEkle("tavuk");
        return yemek;
    }

    private Yemek ayvalikTostu(){
        Yemek yemek = new Yemek("Ayvalık Tostu");
        yemek.icerikEkle("et");
        return yemek;
    }

    private Yemek sandvic(){
        Yemek yemek = new Yemek("Sandviç");
        return yemek;
    }

    private Yemek kajun(){
        Yemek yemek = new Yemek("Kajun");
        yemek.icerikEkle("tavuk");
        return yemek;
    }

    private Yemek durum(){
        Yemek yemek = new Yemek("Dürüm");
        yemek.icerikEkle("et");
        return yemek;
    }

    private Yemek tavukluSalata(){
        Yemek yemek = new Yemek("Tavuklu Salata");
        yemek.icerikEkle("tavuk");
        return yemek;
    }

    private Yemek ssk(){
        Yemek yemek = new Yemek("Soslu Soğanlı Kaşarlı");
        yemek.icerikEkle("et");
        return yemek;
    }

    private Yemek beyti(){
        Yemek yemek = new Yemek("Beyti");
        yemek.icerikEkle("et");
        return yemek;
    }

    private Yemek alinazik(){
        Yemek yemek = new Yemek("Alinazik Kebabı");
        yemek.icerikEkle("et");
        return yemek;
    }

    private Yemek kuzuSis(){
        Yemek yemek = new Yemek("Kuzu Şiş");
        yemek.icerikEkle("et");
        return yemek;
    }

    private Yemek karisikIzgara(){
        Yemek yemek = new Yemek("Karışık Izgara");
        yemek.icerikEkle("et");
        yemek.icerikEkle("tavuk");
        return yemek;
    }

    private Yemek copSis(){
        Yemek yemek = new Yemek("Çöp Şiş");
        yemek.icerikEkle("et");
        return yemek;
    }

    private Yemek corba(){
        Yemek yemek = new Yemek("Çorba");
        return yemek;
    }

    private Yemek kokorec(){
        Yemek yemek = new Yemek("Kokoreç");
        yemek.icerikEkle("et");
        return yemek;
    }

    private Yemek kumru(){
        Yemek yemek = new Yemek("Kumru");
        yemek.icerikEkle("et");
        yemek.icerikEkle("sosis");
        return yemek;
    }

    private Yemek sushi(){
        Yemek yemek = new Yemek("Sushi");
        yemek.icerikEkle("balık");
        return yemek;
    }

    private Yemek makarna(){
        Yemek yemek = new Yemek("Makarna - Noodle");
        return yemek;
    }

    private Yemek manti(){
        Yemek yemek = new Yemek("Mantı");
        return yemek;
    }

    private Yemek patatesSepet(){
        Yemek yemek = new Yemek("Patates Sepeti");
        return yemek;
    }

    private Yemek ciger(){
        Yemek yemek = new Yemek("Ciğer");
        yemek.icerikEkle("et");
        return yemek;
    }

    private Yemek evYemegi(){
        Yemek yemek = new Yemek("Ev Yemeği");
        return yemek;
    }

    private Yemek borek(){
        Yemek yemek = new Yemek("Börek");
        return yemek;
    }

    private Yemek baklava(){
        Yemek yemek = new Yemek("Baklava");
        yemek.icerikEkle("tatlı");
        yemek.icerikEkle("şerbet");
        return yemek;
    }

    private Yemek sobiyet(){
        Yemek yemek = new Yemek("Şöbiyet");
        yemek.icerikEkle("tatlı");
        yemek.icerikEkle("şerbet");
        return yemek;
    }

    private Yemek puding(){
        Yemek yemek = new Yemek("Puding");
        yemek.icerikEkle("tatlı");
        yemek.icerikEkle("çikolata");
        return yemek;
    }

    private Yemek sutluNuriye(){
        Yemek yemek = new Yemek("Sütlü Nuriye");
        yemek.icerikEkle("tatlı");
        yemek.icerikEkle("süt");
        return yemek;
    }

    private Yemek ekler(){
        Yemek yemek = new Yemek("Ekler");
        yemek.icerikEkle("tatlı");
        yemek.icerikEkle("çikolata");
        return yemek;
    }

    private Yemek yasPasta(){
        Yemek yemek = new Yemek("Yaş Pasta");
        yemek.icerikEkle("tatlı");
        yemek.icerikEkle("çikolata");
        yemek.icerikEkle("süt");
        return yemek;
    }

    private Yemek katmer(){
        Yemek yemek = new Yemek("Katmer");
        return yemek;
    }

    private Yemek kunefe(){
        Yemek yemek = new Yemek("Künefe");
        yemek.icerikEkle("tatlı");
        yemek.icerikEkle("şerbet");
        return yemek;
    }

    private Yemek kalamar(){
        Yemek yemek = new Yemek("Kalamar");
        yemek.icerikEkle("balık");
        return yemek;
    }

    private Yemek yengec(){
        Yemek yemek = new Yemek("Yengeç");
        yemek.icerikEkle("balık");
        return yemek;
    }

    private Yemek ahtapot(){
        Yemek yemek = new Yemek("Ahtapot");
        yemek.icerikEkle("balık");
        return yemek;
    }

    private Yemek karides(){
        Yemek yemek = new Yemek("Karides");
        yemek.icerikEkle("balık");
        return yemek;
    }

    private Yemek su(){
        Yemek yemek = new Yemek("Su");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("temel");
        return yemek;
    }

    private Yemek ayran(){
        Yemek yemek = new Yemek("Ayran");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("temel");
        return yemek;
    }

    private Yemek madenSuyu(){
        Yemek yemek = new Yemek("Maden suyu");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("temel");
        return yemek;
    }

    private Yemek elmaSuyu(){
        Yemek yemek = new Yemek("Elma Suyu");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("meyve");
        return yemek;
    }

    private Yemek havucSuyu(){
        Yemek yemek = new Yemek("Havuç Suyu");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("meyve");
        return yemek;
    }

    private Yemek visneSuyu(){
        Yemek yemek = new Yemek("Vişne Suyu");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("meyve");
        return yemek;
    }

    private Yemek uzumSuyu(){
        Yemek yemek = new Yemek("Üzüm Suyu");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("meyve");
        return yemek;
    }

    private Yemek greyfurtSuyu(){
        Yemek yemek = new Yemek("Greyfurt Suyu");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("meyve");
        return yemek;
    }

    private Yemek limonata(){
        Yemek yemek = new Yemek("Limonata");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("meyve");
        return yemek;
    }

    private Yemek portakalSuyu(){
        Yemek yemek = new Yemek("Portakal Suyu");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("meyve");
        return yemek;
    }

    private Yemek ananas(){
        Yemek yemek = new Yemek("Ananas Suyu");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("meyve");
        return yemek;
    }

    private Yemek karisik(){
        Yemek yemek = new Yemek("Karışık Meyve Suyu");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("meyve");
        return yemek;
    }

    private Yemek bira(){
        Yemek yemek = new Yemek("Bira");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("alkol");
        return yemek;
    }

    private Yemek cin(){
        Yemek yemek = new Yemek("Cin");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("alkol");
        return yemek;
    }

    private Yemek absent(){
        Yemek yemek = new Yemek("Absent");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("alkol");
        return yemek;
    }

    private Yemek viski(){
        Yemek yemek = new Yemek("Viski");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("alkol");
        return yemek;
    }

    private Yemek rom(){
        Yemek yemek = new Yemek("Rom");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("alkol");
        return yemek;
    }

    private Yemek tekila(){
        Yemek yemek = new Yemek("Tekila");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("alkol");
        return yemek;
    }

    private Yemek sarap(){
        Yemek yemek = new Yemek("Şarap");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("alkol");
        return yemek;
    }

    private Yemek votka(){
        Yemek yemek = new Yemek("Votka");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("alkol");
        return yemek;
    }

    private Yemek sampanya(){
        Yemek yemek = new Yemek("Şampanya");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("alkol");
        return yemek;
    }

    private Yemek raki(){
        Yemek yemek = new Yemek("Rakı");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("alkol");
        return yemek;
    }

    private Yemek kola(){
        Yemek yemek = new Yemek("Kola");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("gazlı");
        return yemek;
    }

    private Yemek gazoz(){
        Yemek yemek = new Yemek("Gazoz");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("gazlı");
        return yemek;
    }

    private Yemek meyveliSoda(){
        Yemek yemek = new Yemek("Meyveli Gazoz");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("gazlı");
        return yemek;
    }

    private Yemek soda(){
        Yemek yemek = new Yemek("Soda");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("gazlı");
        return yemek;
    }

    private Yemek sicakCikolata(){
        Yemek yemek = new Yemek("Sıcak Çikolata");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("tatlıiçecek");
        return yemek;
    }

    private Yemek milkshake(){
        Yemek yemek = new Yemek("Milkshake");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("tatlıiçecek");
        return yemek;
    }

    private Yemek frappuccino(){
        Yemek yemek = new Yemek("Frappuccino");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("tatlıiçecek");
        return yemek;
    }

    private Yemek turkKahvesi(){
        Yemek yemek = new Yemek("Türk Kahvesi");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("kahve");
        return yemek;
    }

    private Yemek espresso(){
        Yemek yemek = new Yemek("Espresso");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("kahve");
        return yemek;
    }

    private Yemek doubleEspresso(){
        Yemek yemek = new Yemek("Double Espresso");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("kahve");
        return yemek;
    }

    private Yemek ristretto(){
        Yemek yemek = new Yemek("Ristretto");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("kahve");
        return yemek;
    }

    private Yemek americano(){
        Yemek yemek = new Yemek("Americano");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("kahve");
        return yemek;
    }

    private Yemek flatWhite(){
        Yemek yemek = new Yemek("Flat White");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("kahve");
        return yemek;
    }

    private Yemek cappucino(){
        Yemek yemek = new Yemek("Cappucino");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("kahve");
        return yemek;
    }

    private Yemek latte(){
        Yemek yemek = new Yemek("Latte");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("kahve");
        return yemek;
    }

    private Yemek macchiato(){
        Yemek yemek = new Yemek("Macchiato");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("kahve");
        return yemek;
    }

    private Yemek mocha(){
        Yemek yemek = new Yemek("Mocha");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("kahve");
        return yemek;
    }

    private Yemek whiteMocha(){
        Yemek yemek = new Yemek("White Mocha");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("kahve");
        return yemek;
    }

    private Yemek affogato(){
        Yemek yemek = new Yemek("Affogato");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("kahve");
        return yemek;
    }

    private Yemek caramelMacchiato(){
        Yemek yemek = new Yemek("Caramel Macchiato");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("kahve");
        return yemek;
    }

    private Yemek siyahCay(){
        Yemek yemek = new Yemek("Siyah Çay");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("çay");
        return yemek;
    }

    private Yemek yesilCay(){
        Yemek yemek = new Yemek("Yeşil Çay");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("çay");
        return yemek;
    }

    private Yemek bitkiCayi(){
        Yemek yemek = new Yemek("Bitki Çayı");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("çay");
        return yemek;
    }

    private Yemek meyveCayi(){
        Yemek yemek = new Yemek("Meyve Çayı");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("çay");
        return yemek;
    }

    private Yemek buzluCay(){
        Yemek yemek = new Yemek("Buzlu Çay");
        yemek.icerikEkle("içecek");
        yemek.icerikEkle("çay");
        return yemek;
    }

}
