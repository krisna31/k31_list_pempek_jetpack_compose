package com.krisna31.k31_list_pempek_jetpack_compose.data

data class Pempek(
    val id: Int,
    val nama: String,
    val deskripsi: String,
    val isian: String,
    val jenisPengolahan: String,
    val harga: Int
)

val pempekList = listOf(
    Pempek(
        1,
        "Pempek Lenjer",
        "Pempek lenjer adalah jenis pempek yang paling populer di Palembang. Pempek ini berbentuk memanjang seperti silinder dengan diameter sekitar 4 cm dan panjang sekitar 15 cm. Pempek lenjer biasanya dinikmati dengan cuko dan irisan timun.",
        "-",
        "Rebusan",
        2000
    ),
    Pempek(
        2,
        "Pempek Kapal Selam",
        "Pempek kapal selam adalah jenis pempek yang berbentuk seperti kapal selam. Pempek ini berisi telur rebus yang dibungkus dengan adonan pempek. Pempek kapal selam biasanya dinikmati dengan cuko dan irisan timun.",
        "Telur rebus",
        "Rebusan",
        3000
    ),
    Pempek(
        3,
        "Pempek Pistel",
        "Pempek pistel adalah jenis pempek yang berbentuk mirip pastel. Pempek ini berisi tumis daun pepaya muda dan ebi masak santan. Pempek pistel biasanya dinikmati dengan cuko dan irisan timun.",
        "Tumis daun pepaya muda dan ebi masak santan",
        "Goreng",
        2500
    ),
    Pempek(
        4,
        "Pempek Adaan",
        "Pempek adaan adalah jenis pempek yang berbentuk bulat dan digoreng langsung. Pempek adaan biasanya dinikmati dengan cuko dan irisan timun.",
        "-",
        "Goreng",
        2000
    ),
    Pempek(
        5,
        "Pempek Keriting",
        "Pempek keriting adalah jenis pempek yang berbentuk keriting. Pempek ini biasanya dinikmati dengan cuko dan irisan timun.",
        "-",
        "Goreng",
        2000
    ),
    Pempek(
        6,
        "Pempek Kulit",
        "Pempek kulit adalah jenis pempek yang terbuat dari kulit ikan. Pempek ini biasanya dinikmati dengan cuko dan irisan timun.",
        "-",
        "Goreng",
        1500
    ),
    Pempek(
        7,
        "Pempek Lenggang",
        "Pempek lenggang adalah jenis pempek yang dimasak dengan cara digoreng. Pempek ini berbentuk pipih dan memiliki tekstur yang lembut. Pempek lenggang biasanya dinikmati dengan cuko dan irisan timun.",
        "-",
        "Goreng",
        2000
    ),
    Pempek(
        8,
        "Pempek Kering",
        "Jenis pempek yang dimasak dengan cara digoreng kering. Pempek ini memiliki tekstur yang renyah dan gurih. Pempek kering biasanya dinikmati dengan cuko dan irisan timun.",
        "-",
        "Goreng kering",
        2500
    ),
    Pempek(
        9,
        "Pempek Crispy",
        "Jenis pempek yang dimasak dengan cara digoreng crispy. Pempek ini memiliki tekstur yang renyah dan gurih. Pempek crispy biasanya dinikmati dengan cuko dan irisan timun.",
        "-",
        "Goreng crispy",
        3000
    ),
    Pempek(
        10,
        "Pempek Kulit Lenjer",
        "Jenis pempek yang terbuat dari kulit ikan dan dibentuk memanjang seperti silinder. Pempek ini biasanya dinikmati dengan cuko dan irisan timun.",
        "-",
        "Rebus",
        2500
    ),
    Pempek(
        11,
        "Pempek Kulit Pistel",
        "Jenis pempek yang terbuat dari kulit ikan dan dibentuk mirip pastel. Pempek ini berisi tumis daun pepaya muda dan ebi masak santan. Pempek kulit pistel biasanya dinikmati dengan cuko dan irisan timun.",
        "Tumis daun pepaya muda dan ebi masak santan",
        "Goreng",
        3000
    ),
    Pempek(
        12,
        "Pempek Kulit Adaan",
        "Jenis pempek yang terbuat dari kulit ikan dan dibentuk bulat. Pempek ini biasanya dinikmati dengan cuko dan irisan timun.",
        "-",
        "Goreng",
        2500
    ),
    Pempek(
        13,
        "Pempek Kulit Keriting",
        "Jenis pempek yang terbuat dari kulit ikan dan dibentuk keriting. Pempek ini biasanya dinikmati dengan cuko dan irisan timun.",
        "-",
        "Goreng",
        2500
    ),
    Pempek(
        14,
        "Pempek Kulit Lenggang",
        "Jenis pempek yang terbuat dari kulit ikan dan dimasak dengan cara digoreng. Pempek ini berbentuk pipih dan memiliki tekstur yang lembut. Pempek kulit lenggang biasanya dinikmati dengan cuko dan irisan timun.",
        "-",
        "Goreng",
        2500
    ),
    Pempek(
        15,
        "Pempek Mercon",
        "Jenis pempek yang berisi sambal cabai rawit. Pempek ini memiliki rasa yang pedas dan gurih. Pempek mercon biasanya dinikmati dengan cuko dan irisan timun.",
        "Sambal cabai rawit",
        "Goreng",
        3000
    ),
    Pempek(
        16,
        "Pempek Ikan Tenggiri",
        "Jenis pempek yang terbuat dari ikan tenggiri. Pempek ini memiliki rasa yang gurih dan khas. Pempek ikan tenggiri biasanya dinikmati dengan cuko dan irisan timun.",
        "Ikan tenggiri",
        "Rebus/goreng",
        2500
    ),
    Pempek(
        17,
        "Pempek Ikan Gabus",
        "Jenis pempek yang terbuat dari ikan gabus. Pempek ini memiliki tekstur yang lembut dan padat. Pempek ikan gabus biasanya dinikmati dengan cuko dan irisan timun.",
        "Ikan gabus",
        "Rebus/goreng",
        3000
    ),
    Pempek(
        18,
        "Pempek Ikan Kakap",
        "Jenis pempek yang terbuat dari ikan kakap. Pempek ini memiliki rasa yang gurih dan manis. Pempek ikan kakap biasanya dinikmati dengan cuko dan irisan timun.",
        "Ikan kakap",
        "Rebus/goreng",
        3500
    ),
    Pempek(
        19,
        "Pempek Ikan Patin",
        "Jenis pempek yang terbuat dari ikan patin. Pempek ini memiliki rasa yang gurih dan manis. Pempek ikan patin biasanya dinikmati dengan cuko dan irisan timun.",
        "Ikan patin",
        "Rebus/goreng",
        3500
    ),
    Pempek(
        20,
        "Pempek Ikan Lele",
        "Jenis pempek yang terbuat dari ikan lele. Pempek ini memiliki rasa yang gurih dan khas. Pempek ikan lele biasanya dinikmati dengan cuko dan irisan timun.",
        "Ikan lele",
        "Rebus/goreng",
        3000
    )
)