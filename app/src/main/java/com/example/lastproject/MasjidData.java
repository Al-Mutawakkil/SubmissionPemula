package com.example.lastproject;

import java.util.ArrayList;
import java.util.Collection;

public class MasjidData {
    private static String[] masjidNames = {
            "Masjidil Haram",
            "Masjid Nabawi",
            "Masjid Sultan Ahmet",
            "Masjid Istiqlal",
            "Masjid Badshahi",
            "Masjid Faisal",
            "Masjid Hassanal Bolkiah",
            "Masjid Imam",
            "Masjid Sheikh Zayed",
            "Masjid Hassan II"

    };

    private static String[] masjidDetails = {
            "Berlokasi di Mekkah, Masjidil Haram adalah masjid terbesar dan tersuci di dunia. Karena masjid ini dibangun mengelilingi Ka'bah, kiblat umat Muslim sedunia. Masjid besar ini memiliki 9 menara. Kini masjidil Haram memiliki luas 356.800 meter persegi. Pada 2007, pemerintah Arab Saudi berencana meningkatkan kapasitas masjid sampai 2 juta jamaah setidaknya sampai 2020. Arsitekturnya yang elegan membuat Masjidil Haram begitu indah dan takjub.",
            "Masjid Nabawi adalah salah satu masjid terpenting bagi umat Islam karena dibangun oleh Nabi Muhammad SAW dan menjadi makam beliau serta para sahabatnya. Dengan pembangunan awalnya yang sangat sederhana dengan tiang batang kurma dan tanpa atap, kini Kerajaan Arab Saudi membuatnya menjadi modern dengan luas mencapai 100.000 meter persegi dan lantai atas mencapai 67.000 meter persegi. Masjid Nabawi kini bisa menampung hampir setengah juta jamaah.",
            "Masjid Sultan Ahmet di Istanbul, Turki ini dibangun oleh sang Sultan di atas situs lampau Hippodrome yang pernah menjadi pusat sosial Konstantinopel saat menjadi ibukota Kekaisaran Bizantium. Masjid ini bernama masjid Biru lantaran di malam hari puncak-puncak menara yang berjumlah 6 buah memiliki rona kebiruan. Masjid ini juga memiliki serangkaian kubah yang berjajar mulai dari puncak sampai menurun dengan halaman besar.",
            "Istiqlal dibangun pada 1978. Dalam bahasa Arab, Istiqlal berarti kemerdekaan. Dengan tema tradisional Jawa, Istiqlal memiliki ruang sholat utama berbentuk persegi panjang dengan 12 tiang penopang besar yang menyangga kubah dengan diameter 45 meter. Istimewanya, arsitek Istiqlal adalah Frederick Silaban, seorang penganut Kristen sehingga Istiqlal dianggap sebagai simbol kebebasan dan toleransi beragama di Indonesia.",
            "Masjid Badshahi atau Masjid Kaisar dibangun oleh raja ke-6 Kesultanan Mughal yakni Raja Aurangzeb pada 1671 di Kota Lahore, Pakistan. Masjid ini memiliki empat menara di empat penjuru luar masjid dengan tinggi 53,75 meter. Fondasi dan struktur bangunannya dibangun memakai batu bata dan tanah lempung yang dipadatkan sampai akhirnya dibalur dengan lampengan batu pasir merah dengan bagian kubah berlapis pualam putih.",
            "Masjid ini diberi nama masjid Faisal untuk menghormati Raja Faisal bin Abdul Aziz yang mendanai proyek pembangunannya. Masjid ini tak seperti kebanyakan masjid di Asia yakni tak memiliki kubah atau lengkungan. Inspirasi bentuknya yang tidak biasa berasal dari tenda suku Arab Badui. Ruang doa utama berbentuk segitiga besar dan menaranya berbentuk struktur tinggi seperti pensil. Masjid Faisal adalah salah satu contoh terbaik arsitektur Islam kontemporer.",
            "Masjid Jami Hassanal Bolkiah dibangun saat Sultan Hassanal Bolkiah memerintah dan dibuka untuk umum pada 1994. Masjid ini memiliki lingkungan sangat subur dengan banyak taman indah dan air mancur yang membuatnya semakin cantik. Yang mencolok adalah adanya kubah emas berlapis emas 24 karat. Tak hanya itu, interior menara juga sangat tebal dan berhiaskan ornamen mewah.",
            "Masjid Imam dianggap sebagai salah satu bangunan paling megah di kota Isfahan, Iran. Masjid ini memiliki empat menara menjulang setinggi 160 kaki dan sebagian besar dibangun dari bahan keramik serta batu piruz. Keindahan dan kemegahannya semakin sempurna dengan sebuah kolam besar di tengah pelataran masjid. Hampir seluruh dinding ditutupi oleh keramik mozaik dengan perpaduan 7 warna serta kaligrafi prasasti. Masjid ini dianggap sebagai salah satu arsitektur Persia terbaik",
            "Masjid Agung Sheikh Zayed memiliki 82 kubah bergaya Maroko yang semuanya dihiasi dengan batu pualam putih. Kubah utama masjid ini berdiameter 32,8 meter dengan tinggi 55 meter. Ukuran masjid ini setara dengan 5 lapangan sepak bola. Tak hanya itu, masjid ini memiliki lebih dari 1.000 pilar di area luar dilapisi lebih dari 20.000 lembar pualam. Di sekeliling masjid ada rangkaian kolam berbahan keramik lantai berwana gelap yang memantulkan keindahannya saat malam hari.",
            "Masjid Hassan II yang terletak di Casablanca, Maroko ini memiliki menara paling tinggi di dunia mencapai 210 meter. Dibangun menjorok ke Samudera Atlantik membuatnya terlihat seakan berada di tengah laut layaknya masjid terapung. Masjid ini memakai teknologi cahaya laser untuk pencahayaan di malam hari dan pemanas lantai. Atap masjid bisa dibuka tutup dan beberapa lantai memakai kaca super tebal yang bisa membuat jamaah melihat Samudera Atlantik di bawah masjid."


    };

    private static int[] masjidImages = {
            R.drawable.masjidilharam,
            R.drawable.masjidnabawi,
            R.drawable.masjidsultanahmet,
            R.drawable.masjidistiqlal,
            R.drawable.masjidbadshahi,
            R.drawable.masjidfaisal,
            R.drawable.masjidhassanalbolkiah,
            R.drawable.masjidimam,
            R.drawable.masjidsheikhzayed,
            R.drawable.masjidhassanii
    };

    static ArrayList<Masjid> getListData() {
        ArrayList<Masjid> list = new ArrayList<>();
        for (int position = 0; position < masjidNames.length; position++) {
            Masjid masjid = new Masjid();
            masjid.setName(masjidNames[position]);
            masjid.setDetail(masjidDetails[position]);
            masjid.setPhoto(masjidImages[position]);
            list.add(masjid);

        }
        return list;
    }
}