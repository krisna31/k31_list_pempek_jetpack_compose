package com.krisna31.k31_list_pempek_jetpack_compose.data

data class Pempek(
    val id: Int,
    val nama: String,
    val deskripsi: String,
    val isian: String,
    val jenisPengolahan: String,
    val harga: Int,
    val imgUrl: String = "https://img-global.cpcdn.com/recipes/f88a9cf46496e08d/640x640sq70/photo.webp"
)

val pempekList = listOf(
    Pempek(
        1,
        "Pempek Lenjer",
        "Pempek lenjer adalah jenis pempek yang paling populer di Palembang. Pempek ini berbentuk memanjang seperti silinder dengan diameter sekitar 4 cm dan panjang sekitar 15 cm. Pempek lenjer biasanya dinikmati dengan cuko dan irisan timun.",
        "-",
        "Rebusan",
        2000,
        imgUrl = "https://img-global.cpcdn.com/recipes/f88a9cf46496e08d/640x640sq70/photo.webp"
    ),
    Pempek(
        2,
        "Pempek Kapal Selam",
        "Pempek kapal selam adalah jenis pempek yang berbentuk seperti kapal selam. Pempek ini berisi telur rebus yang dibungkus dengan adonan pempek. Pempek kapal selam biasanya dinikmati dengan cuko dan irisan timun.",
        "Telur rebus",
        "Rebusan",
        3000,
        imgUrl = "https://titipku.com/blog/wp-content/uploads/2021/04/pempek-kapal-selam-1024x680.jpg"
    ),
    Pempek(
        3,
        "Pempek Pistel",
        "Pempek pistel adalah jenis pempek yang berbentuk mirip pastel. Pempek ini berisi tumis daun pepaya muda dan ebi masak santan. Pempek pistel biasanya dinikmati dengan cuko dan irisan timun.",
        "Tumis daun pepaya muda dan ebi masak santan",
        "Goreng",
        2500,
        imgUrl = "https://paxelmarket.co/wp-content/uploads/2022/08/Pistel_isi_6_b.jpeg"
    ),
    Pempek(
        4,
        "Pempek Adaan",
        "Pempek adaan adalah jenis pempek yang berbentuk bulat dan digoreng langsung. Pempek adaan biasanya dinikmati dengan cuko dan irisan timun.",
        "-",
        "Goreng",
        2000,
        imgUrl = "https://cdn0-production-images-kly.akamaized.net/2AjDhX8tD7YMsfRUc9ZzoO-2V58=/0x554:5634x3729/680x383/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/4218540/original/042074800_1667888040-shutterstock_1859475808.jpg"
    ),
    Pempek(
        5,
        "Pempek Keriting",
        "Pempek keriting adalah jenis pempek yang berbentuk keriting. Pempek ini biasanya dinikmati dengan cuko dan irisan timun.",
        "-",
        "Goreng",
        2000,
        imgUrl = "https://img-global.cpcdn.com/recipes/32a5b0a608d6a7dd/640x640sq70/photo.webp"
    ),
    Pempek(
        6,
        "Pempek Kulit",
        "Pempek kulit adalah jenis pempek yang terbuat dari kulit ikan. Pempek ini biasanya dinikmati dengan cuko dan irisan timun.",
        "-",
        "Goreng",
        1500,
        imgUrl = "https://media-cdn.tripadvisor.com/media/photo-s/14/11/b3/f7/pempek-kulit-made-of.jpg"
    ),
    Pempek(
        7,
        "Pempek Lenggang",
        "Pempek lenggang adalah jenis pempek yang dimasak dengan cara digoreng. Pempek ini berbentuk pipih dan memiliki tekstur yang lembut. Pempek lenggang biasanya dinikmati dengan cuko dan irisan timun.",
        "-",
        "Goreng",
        2000,
        imgUrl = "https://img.kurio.network/pskHnL1ud3r8Dt55R4rEG9IDdWY=/440x440/filters:quality(80)/https://kurio-img.kurioapps.com/21/05/05/72e2e9b5-0b60-4164-9c35-1a9936647b6b.jpe"
    ),
    Pempek(
        8,
        "Pempek Kering",
        "Jenis pempek yang dimasak dengan cara digoreng kering. Pempek ini memiliki tekstur yang renyah dan gurih. Pempek kering biasanya dinikmati dengan cuko dan irisan timun.",
        "-",
        "Goreng kering",
        2500,
        imgUrl = "https://img-global.cpcdn.com/recipes/a1699041b0bfc6b1/640x640sq70/photo.webp"
    ),
    Pempek(
        9,
        "Pempek Crispy",
        "Jenis pempek yang dimasak dengan cara digoreng crispy. Pempek ini memiliki tekstur yang renyah dan gurih. Pempek crispy biasanya dinikmati dengan cuko dan irisan timun.",
        "-",
        "Goreng crispy",
        3000,
        imgUrl = "https://nnc-media.netralnews.com/IMG-Netral-News-User-31-HT2G9LM10D.jpg"
    ),
    Pempek(
        10,
        "Pempek Kulit Lenjer",
        "Jenis pempek yang terbuat dari kulit ikan dan dibentuk memanjang seperti silinder. Pempek ini biasanya dinikmati dengan cuko dan irisan timun.",
        "-",
        "Rebus",
        2500,
        imgUrl = "https://img-global.cpcdn.com/recipes/9fbf7f0dffe74567/640x640sq70/photo.webp"
    ),
    Pempek(
        11,
        "Pempek Kulit Pistel",
        "Jenis pempek yang terbuat dari kulit ikan dan dibentuk mirip pastel. Pempek ini berisi tumis daun pepaya muda dan ebi masak santan. Pempek kulit pistel biasanya dinikmati dengan cuko dan irisan timun.",
        "Tumis daun pepaya muda dan ebi masak santan",
        "Goreng",
        3000,
        imgUrl = "https://img-global.cpcdn.com/recipes/f677003bcacb3ca8/640x640sq70/photo.webp"
    ),
    Pempek(
        12,
        "Pempek Kulit Adaan",
        "Jenis pempek yang terbuat dari kulit ikan dan dibentuk bulat. Pempek ini biasanya dinikmati dengan cuko dan irisan timun.",
        "-",
        "Goreng",
        2500,
        imgUrl = "https://img-global.cpcdn.com/recipes/4fc97c2ab1376d17/640x640sq70/photo.webp"
    ),
    Pempek(
        13,
        "Pempek Kulit Keriting",
        "Jenis pempek yang terbuat dari kulit ikan dan dibentuk keriting. Pempek ini biasanya dinikmati dengan cuko dan irisan timun.",
        "-",
        "Goreng",
        2500,
        imgUrl = "https://asset-2.tstatic.net/palembang/foto/bank/images/Resep-pempek-keriting-pakai-piping-bag.jpg"
    ),
    Pempek(
        14,
        "Pempek Kulit Lenggang",
        "Jenis pempek yang terbuat dari kulit ikan dan dimasak dengan cara digoreng. Pempek ini berbentuk pipih dan memiliki tekstur yang lembut. Pempek kulit lenggang biasanya dinikmati dengan cuko dan irisan timun.",
        "-",
        "Goreng",
        2500,
        imgUrl = "https://asset-2.tstatic.net/palembang/foto/bank/images/Resep-pempek-lenggang-dari-3-buah-pempek-lenjer-kecil.jpg"
    ),
    Pempek(
        15,
        "Pempek Mercon",
        "Jenis pempek yang berisi sambal cabai rawit. Pempek ini memiliki rasa yang pedas dan gurih. Pempek mercon biasanya dinikmati dengan cuko dan irisan timun.",
        "Sambal cabai rawit",
        "Goreng",
        3000,
        imgUrl = "https://img-global.cpcdn.com/recipes/a70e1e15d1535e0c/640x640sq70/photo.webp"
    ),
    Pempek(
        16,
        "Pempek Ikan Tenggiri",
        "Jenis pempek yang terbuat dari ikan tenggiri. Pempek ini memiliki rasa yang gurih dan khas. Pempek ikan tenggiri biasanya dinikmati dengan cuko dan irisan timun.",
        "Ikan tenggiri",
        "Rebus/goreng",
        2500,
        imgUrl = "https://img-global.cpcdn.com/recipes/26062aa259a8c9a8/640x640sq70/photo.webp"
    ),
    Pempek(
        17,
        "Pempek Ikan Gabus",
        "Jenis pempek yang terbuat dari ikan gabus. Pempek ini memiliki tekstur yang lembut dan padat. Pempek ikan gabus biasanya dinikmati dengan cuko dan irisan timun.",
        "Ikan gabus",
        "Rebus/goreng",
        3000,
        imgUrl = "https://img-global.cpcdn.com/recipes/2ba80578de876b23/640x640sq70/photo.webp"
    ),
    Pempek(
        18,
        "Pempek Ikan Kakap",
        "Jenis pempek yang terbuat dari ikan kakap. Pempek ini memiliki rasa yang gurih dan manis. Pempek ikan kakap biasanya dinikmati dengan cuko dan irisan timun.",
        "Ikan kakap",
        "Rebus/goreng",
        3500,
        imgUrl = "https://img-global.cpcdn.com/recipes/0962f3b7eabfc8b9/640x640sq70/photo.webp"
    ),
    Pempek(
        19,
        "Pempek Ikan Patin",
        "Jenis pempek yang terbuat dari ikan patin. Pempek ini memiliki rasa yang gurih dan manis. Pempek ikan patin biasanya dinikmati dengan cuko dan irisan timun.",
        "Ikan patin",
        "Rebus/goreng",
        3500,
        imgUrl = "https://img-global.cpcdn.com/recipes/af28c9877959dca4/640x640sq70/photo.webp"
    ),
    Pempek(
        20,
        "Pempek Ikan Lele",
        "Jenis pempek yang terbuat dari ikan lele. Pempek ini memiliki rasa yang gurih dan khas. Pempek ikan lele biasanya dinikmati dengan cuko dan irisan timun.",
        "Ikan lele",
        "Rebus/goreng",
        3000,
        imgUrl = "https://img-global.cpcdn.com/recipes/Recipe_2015_01_22_06_27_10_698_b4d2ab79d96ee95a0694/640x640sq70/photo.webp"
    )
)