package com.example.e_lkpd;

public class kumpulanSoal {
    private String pertanyaan[] = {
            "Dari gambar tersebut, bagaimana perbedaan sifat buaya dan kancil dalam cerita fiksi tersebut …",
            "Jika kancil hanya diam diri terhadap keadaan, kira-kira apa yang terjadi pada kancil?",
            "Dari cerita yang telah kamu lihat, apa pesan moral yang dapat kamu ambil dari video tersebut?",
            "Berdasarkan video 'Pohon Mangga dan Pohon Ara', coba kamu cocokan watak dari masing-masing tokoh dalam cerita tersebut",
            "Apa pesan moral yang dapat kamu ambil dari cerita yang telah kamu simak …",
            "Dari gambar tersebut, apa tugas yang diemban olehnya …",
            "Jika nelayan tidak ada, kira-kira dampak buruk apa yang akan terjadi …",
            "Peryataan Kegiatan Ekonomi Penghasil Barang atau Jasa",
            "Dari data diatas, apa yang dapat kamu simpulkan dari keduanya….",
            "Berdasarkan video yang telah kamu lihat, isi tabel yang rumpang di bawah ini!",
            "Jika Adi tidak menganut Agama, kira-kira apa yang akan terjadi…",
            "Dari veido yang telah kamu lihat tadi, bagaimana pendapatmu terkiat keberagaman agama di Indonesia saat ini?",
            "Dari video tersebut, kesimpulan yang cocok berdasarkan cerita tersebut adalah …."
    };

    private String pilihanGanda[][] = {
            {"Kancil mempunyai sikap yang somboong dan buaya murah hati",
                    "Buaya mempunyai sikap serakah dan kancil penurut ",
                    "Kancil memunyai sikap yang cerdik dan buaya bodoh",
                    "Buaya mempunayi sikap yang bijak dan kancil baik hati."},
            {"Dibiarkan saja oleh buaya",
                    "Akan di makan buaya",
                    "Akan disuruh memberi hadiah kepada buaya",
                    "Kancil akan mati kelaparan"},
            {"Berbanggalah terhadap keindahan dirimu ",
                    "Persiapkn dirimu untuk menhadapi masa  yang akan datang ",
                    "Jangan biarkan seseoarang merusak gaya mu",
                    "Jangan biarkan seseorang mengotori dirimu yang rupawan"},
            {"", "", "", ""},
            {"Bagaimanapun keadaanmu bersikap baiklah terhadap seseoarang",
                    "Tamak akan membawa kebahagiaan",
                    "Selalu rendah diri dan patuhi orang tua kalian",
                    "Jika gagal berhentilah sampai disitu"},
            {"Melayani utang piutang",
                    "Melayani pembeli",
                    "Menagih hutang ",
                    "Memberi asuransi "},
            {"Nelayan akan pergi",
                    "Pedagang akan semakin banyak",
                    "Pembeli semakin sedikit",
                    "Ikan akan semakin langka dan mahal"},
            {"", "", "", ""},
            {"Kegiatan ekonomi penghasil barang di desa lebih banyak dari pada di kota",
                    "Kegiatan ekonomi penghasil barang di desa sama dengan di kota",
                    "Kegiatan ekonomi penghasil barang di desa lebih sedikit dari pada di kota",
                    "Kegiatan ekonomi penghasil barang di desa memiliki perbedaan yang signifikan dari pada di kota"},
            {"", "", "", ""},
            {"Akan merasa damai",
                    "Akan berkecukupan ",
                    "Merasa percaya diri terhadap hidupnya",
                    "Hidupya gelisah dan merasa kurang dalam segala hal."},
            {"", "", "", ""},
            {"Toleransi terhadap sesama akan membawa kedaiamain dan kerukukanan antar sesama manusia",
                    "Toleransi membuat Negara terpecah belah",
                    "Tetaplah berjuang walau tidak dihargai",
                    "Jangan pedulikan apapun yang terjadi"}
    };

    public String tokoh [] = {
            "Pohon Mangga", "Pohon Ara"
    };

    private String Table8 [] = {
            "Seoarang guru mengajar di sekolah",
            "Nelayan mencari ikan di laut",
            "Pabrik memproduksi makanan ringan",
            "Penjahit bekerja menjahit baju",
            "Pak budi ternak ayam petelur"
    };

    private String answers10 [] = {
            "islam",
            "al-qur’an",
            "gereja",
            "natal",
            "katholik",
            "alkitab",
            "pura",
            "nyepi",
            "budha",
            "tripitaka",
            "klenteng",
            "imlek"
    };

    private String kodeLink[] = {
            "37HA82NMLj8",
            "8_p3ZbaxrPs",
            "WTsbz2xTbP0",
            "8fy88k17QEY",
            "DCpzDB6OQwI",
            "cBGqGgyfHfw"
    };

    private String jawabanPilGanda[] ={
            "Kancil memunyai sikap yang cerdik dan buaya bodoh",
            "Akan di makan buaya",
            "Persiapkn dirimu untuk menhadapi masa  yang akan datang ",
            "empty",
            "Selalu rendah diri dan patuhi orang tua kalian",
            "Melayani pembeli",
            "Ikan akan semakin langka dan mahal",
            "empty",
            "Kegiatan ekonomi penghasil barang di desa lebih sedikit dari pada di kota",
            "empty",
            "Hidupya gelisah dan merasa kurang dalam segala hal.",
            "empty",
            "Toleransi terhadap sesama akan membawa kedaiamain dan kerukukanan antar sesama manusia"
    };

    private String kdki[][]= {
            {"3.9","Mencermati tokoh-tokoh yang terdapat dalam teks fiksi.","3.9.1  Menganalisis tokoh dalam cerita fiksi "},
            {"","","3.9.2  Menafsirkan peristiwa yang akan terjadi pada cerita fiksi."},
            {"","","3.9.3  Menyimpulkan pesan moral yang terkandung dalam cerita fiksi."},
            {"3.10","Membandingkan watak tokoh pada teks fiksi.","3.10.1 Menganalisis perbedaan watak tokoh dalam cerita fiksi"},
            {"","","3.10.2 Menyimpulkan pesan moral dari perbedaan watak tokoh dalam cerita fiksi."},
            {"3.3","Mengidentifikasi kegiatan ekonomi dan hubungannya dengan berbagai bidang pekerjaan serta kehidupan sosial dan budaya d lingkungan sekitar sampai provinsi ","3.3.1 Menganalisis tugas yang dilakukan dalam kegiatan ekonomi "},
            {"","","3.3.2 Menafsirkan dampak buruk kegiatan ekonomi dalam kehidupan terhadap lingkungan sekitar."},
            {"","","3.3.3 Mengecek barang atau jasa yang dihasilkan dari kegiatan ekonomi yang dilakukan dalam kehidupan seahri-hari  "},
            {"","","3.3.4  Menyimpulkan kegiatan ekonomi yang menjadi mayoritas pekerjaan di suatu daerah."},
            {"3.3","Menjelaskan manfaat keberagaman karakteristik individu dalam kehidupan sehari-hari.","3.3.1  Menganalisis keberagaman agama di Indonesia ."},
            {"","","3.3.2  Menafsirkan manfaat agama bagi individu dalam kehidupan sehari-hari."},
            {"","","3.3.3  Memberikan argumen terhadap perbedaan agama di Indonesia "},
            {"","","3.3.4. Menyimpulkan sikap untuk menghadapi perbedaan agama dalam kehidupan sehari-hari."},
    };

    public String getSoal(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil pilihan jawaban 1
    public String getPilihanGanda1(int x){
        String jawaban1 = pilihanGanda[x][0];
        return jawaban1;
    }

    //membuat getter untuk mengambil pilihan jawaban 2
    public String getPilihanGanda2(int x){
        String jawaban2 = pilihanGanda[x][1];
        return jawaban2;
    }

    //membuat getter untuk mengambil pilihan jawaban 3
    public String getPilihanGanda3(int x){
        String jawaban3 = pilihanGanda[x][2];
        return jawaban3;
    }

    public String getPilihanGanda4(int x){
        String jawaban4 = pilihanGanda[x][3];
        return jawaban4;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jaw = jawabanPilGanda[x];
        return jaw;
    }

    public String getTokoh(int x){
        String tokohSoal = tokoh[x];
        return tokohSoal;
    }

    public String getSoal8 (int x){
        String isiTable8 = Table8[x];
        return isiTable8;
    }

    public String getAnswers10(int x){
        String jawaban = answers10[x];
        return jawaban;
    }

    public  String getLink(int x){
        String kodeYoutube = kodeLink[x];
        return kodeYoutube;
    }

    public String getkdki(int x, int y){
        String ambilkikd = kdki[x][y];
        return  ambilkikd;
    }
}
