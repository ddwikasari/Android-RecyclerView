package com.example.recycleview;

import java.util.ArrayList;

public class FoodData {

    private static String[] foodName={
            "Nasi Goreng",
            "Nasi Kuning",
            "Betutu",
            "Rendang",
            "Gado-Gado",
            "Sate",
            "Rawon",
            "Gudeg",
            "Pempek"
    };

    private static String[] foodOrigin={
            "Indonesia",
            "Indonesia",
            "Bali",
            "Sumatera",
            "Jakarta",
            "Indonesia",
            "Jawa",
            "Yogyakarta",
            "Sumatera"
    };

    private static String[] foodDesc={
            "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng, biasanya ditambah kecap manis, dan bumbu-bumbu lainnya.",
            "Nasi kuning adalah makanan khas Indonesia. Makanan ini terbuat dari beras yang dimasak bersama dengan kunyit serta santan dan rempah-rempah.Nasi kuning adalah salah satu variasi dari nasi yang sering digunakan sebagai tumpeng.",
            "Betutu merupakan jenis makanan tradisional daerah Bali yang terbuat dari ayam atau bebek yang utuh yang berisi bumbu, kemudian dipanggang dalam api sekam.  Menurut tradisi Bali, ayam betutu biasanya disajikan pada saat upacara adat seperti odalan, otonan, maupun perkawinan.",
            "Rendang atau randang adalah masakan daging asli Indonesia yang berasal dari Minangkabau. Masakan ini dihasilkan dari proses memasak suhu rendah dalam waktu lama menggunakan aneka rempah-rempah dan santan.",
            "Gado-gado adalah makanan khas Jakarta berisi sayur-sayuran yang direbus, irisan telur dan tahu, serta ditaburi bawang goreng dan kerupuk. Sayur-sayuran ditambahkan dengan bumbu kacang atau saus dari kacang tanah yang telah dihaluskan yang kemudian diaduk merata.",
            "Sate atau satai adalah makanan yang terbuat dari daging yang dipotong kecil-kecil dan ditusuk sedemikian rupa dengan tusukan lidi tulang daun kelapa atau bambu, kemudian dipanggang menggunakan bara arang kayu. Sate diketahui berasal dari Jawa, Indonesia, dan dapat ditemukan di mana saja di Indonesia.",
            "Rawon adalah masakan Indonesia berupa sup daging berkuah hitam dengan campuran bumbu khas yang menggunakan kluwek. Rawon disajikan bersama nasi, dilengkapi dengan tauge berekor pendek, telur asin, daun bawang, kerupuk udang, daging sapi goreng (empal), dan sambal.",
            "Gudeg adalah hidangan khas Provinsi Yogyakarta dan Jawa Tengah yang terbuat dari nangka muda yang dimasak dengan santan. Perlu waktu berjam-jam untuk membuat hidangan ini. Warna coklat biasanya dihasilkan oleh daun jati yang dimasak bersamaan. Gudeg biasanya dimakan dengan nasi dan disajikan dengan kuah santan kental (areh), ayam kampung, telur, tempe, tahu dan sambal goreng krecek.",
            "Pempek atau empek-empek adalah makanan yang terbuat dari daging ikan yang digiling lembut yang dicampur tepung kanji atau tepung sagu, serta komposisi beberapa bahan lain seperti telur, bawang putih yang dihaluskan, penyedap rasa, dan garam. Pempek biasanya disajikan dengan kuah cuka yang memiliki rasa asam, manis, dan pedas. Pempek sering disebut sebagai makanan khas Palembang, meskipun hampir semua daerah di Sumatera Selatan, Jambi dan Bengkulu juga memproduksinya."
    };

    private static int[] foodPhoto={
            R.drawable.nasi_goreng,
            R.drawable.nasi_kuning,
            R.drawable.betutu,
            R.drawable.rendang,
            R.drawable.gadogado,
            R.drawable.sate,
            R.drawable.rawon,
            R.drawable.gudeg,
            R.drawable.pempek
    };

    static ArrayList<Food> getListData(){
        ArrayList<Food> list = new ArrayList<>();
        for (int position = 0; position < foodName.length; position++){
            Food food = new Food();
            food.setName(foodName[position]);
            food.setOrigin(foodOrigin[position]);
            food.setDesc(foodDesc[position]);
            food.setPhoto(foodPhoto[position]);
            list.add(food);
         }

        return list;
    }
}
