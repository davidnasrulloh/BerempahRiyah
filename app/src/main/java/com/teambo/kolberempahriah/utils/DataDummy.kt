package com.teambo.kolberempahriah.utils

import com.teambo.kolberempahriah.R
import com.teambo.kolberempahriah.model.DataModel
import com.teambo.kolberempahriah.model.VideoDataModel
import com.teambo.kolberempahriah.model.YoutubeModel

object DataDummy {

    fun generateBAB1(): List<YoutubeModel> {

        val data = ArrayList<YoutubeModel>()

        data.add(
            YoutubeModel(
                "Satuan Panjang dan Cara Mengkonversi Satuan (Cara Merubah Satuan Panjang)",
                "A1-Zmuedby0",
                R.drawable.satuan_panjang
            )
        )

        data.add(
            YoutubeModel(
                "Cara menentukan volume bangun ruang (Lengkap)",
                "NHemfdc1uRw",
                R.drawable.bangun_ruang
            )
        )

        data.add(
            YoutubeModel(
                "Konversi Satuan Berat | Matematika Dasar",
                "oKRvTnbD2p8",
                R.drawable.satuan_berat
            )
        )

        return data
    }

    fun generateBAB2(): List<YoutubeModel> {

        val data = ArrayList<YoutubeModel>()

        data.add(
            YoutubeModel(
                "ERHITUNG CEPAT TANPA SEMPOA!! hanya dengan \"JARI\" !!! PENJUMLAHAN",
                "bdx64w2lG_Y",
                R.drawable.penjumlahan_thumbnail
            )
        )

        data.add(
            YoutubeModel(
                "JARIMATIKA PALING MUDAH!! PENGURANGAN METODE \"JARI\" UNTUK ANAK-ANAK TK DAN SD",
                "IMe0c7Uzwes",
                R.drawable.pengurangan_thumbnail
            )
        )

        data.add(
            YoutubeModel(
                "Cara mudah pembagian bersusun (POROGAPIT)",
                "UbRxLX-0XQU",
                R.drawable.pembagian_thumbnail
            )
        )

        return data
    }

    fun generateYoutubeList(): List<YoutubeModel> {

        val data = ArrayList<YoutubeModel>()

        data.add(
            YoutubeModel(
                "Cara Mengubah Desimal Menjadi Pecahan",
                "_JZbyvoNKag",
                R.drawable.thumbnail01
            )
        )

        data.add(
            YoutubeModel(
                "Menghitung LUAS dan KELILING LINGKARAN Jika Diketahui JARI-JARI LINGKARAN",
                "nGwp7mrvXh4",
                R.drawable.thumbnail02
            )
        )

        data.add(
            YoutubeModel(
                "Menentukan FPB dan KPK Dengan Cara Tabel",
                "yI68r7BwUGE",
                R.drawable.thumbnail03
            )
        )

        data.add(
            YoutubeModel(
                "Cara Menghitung Panjang Rusuk Kubus Jika Diketahui Volume",
                "jh1w4qepP1M",
                R.drawable.thumbnail04
            )
        )

        return data
    }

    fun generateVideoListData(): List<VideoDataModel> {
        val data = ArrayList<VideoDataModel>()

        data.add(
            VideoDataModel(
                "Rekomendasi Video Matematika",
                listOf(
                    R.drawable.thumbnail01,
                    R.drawable.thumbnail02,
                    R.drawable.thumbnail03,
                    R.drawable.thumbnail04
                )
            )
        )

        data.add(
            VideoDataModel(
                "Kelas 6",
                listOf(
                    R.drawable.thumbnail01,
                    R.drawable.thumbnail02,
                    R.drawable.thumbnail03,
                    R.drawable.thumbnail04
                )
            )
        )

        data.add(
            VideoDataModel(
                "Kelas 5",
                listOf(
                    R.drawable.thumbnail01,
                    R.drawable.thumbnail02,
                    R.drawable.thumbnail03,
                    R.drawable.thumbnail04
                )
            )
        )

        data.add(
            VideoDataModel(
                "Kelas 4",
                listOf(
                    R.drawable.thumbnail01,
                    R.drawable.thumbnail02,
                    R.drawable.thumbnail03,
                    R.drawable.thumbnail04
                )
            )
        )

        data.add(
            VideoDataModel(
                "Kelas 3",
                listOf(
                    R.drawable.thumbnail01,
                    R.drawable.thumbnail02,
                    R.drawable.thumbnail03,
                    R.drawable.thumbnail04
                )
            )
        )

        data.add(
            VideoDataModel(
                "Kelas 2",
                listOf(
                    R.drawable.thumbnail01,
                    R.drawable.thumbnail02,
                    R.drawable.thumbnail03,
                    R.drawable.thumbnail04
                )
            )
        )

        data.add(
            VideoDataModel(
                "Kelas 1",
                listOf(
                    R.drawable.thumbnail01,
                    R.drawable.thumbnail02,
                    R.drawable.thumbnail03,
                    R.drawable.thumbnail04
                )
            )
        )

        return data
    }

    fun generateMateriKelas1(): List<DataModel> {

        val data = ArrayList<DataModel>()

        data.add(
            DataModel(
                listOf(
                    "Bilangan cacah",
                    "Satuan Panjang dan Waktu",
                    "Bangun Ruang",
                    "Bangun Datar",
                    "Satuan Berat"
                ),
                "BAB 1"
            )
        )

        data.add(
            DataModel(
                listOf(
                    "Penjumlahan",
                    "Pengurangan",
                    "Pembagian",
                    "Perkalian"
                ),
                "BAB 2"
            )
        )

        data.add(
            DataModel(
                listOf(
                    "Garis Bilangan",
                    "Penjumlahan dan Pengurangan",
                    "Perkalian dan Pembagian",
                    "Bilangan Pecahan",
                    "Bangun Datar",
                ),
                "BAB 3"
            )
        )

        data.add(
            DataModel(
                listOf(
                    "Faktor Bilangan",
                    "Pengukuran",
                    "jajar genjang",
                    "Segitiga",
                    "Bilangan Bulat",
                    "Bilangan Romawi"
                ),
                "BAB 4"
            )
        )

        data.add(
            DataModel(
                listOf(
                    "Bilangan Bulat",
                    "Mengukur Kecepatan",
                    "Mengukur Jarak",
                    "Mengukur Sudut",
                    "Mengukur Waktu",
                ),
                "BAB 5"
            )
        )

        data.add(
            DataModel(
                listOf(
                    "Bilangan Pecahan",
                    "Balok",
                    "Kubus",
                ),
                "BAB 6"
            )
        )

        return data
    }
}