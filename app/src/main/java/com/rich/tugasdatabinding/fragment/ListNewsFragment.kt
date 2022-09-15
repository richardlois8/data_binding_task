package com.rich.tugasdatabinding.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.rich.tugasdatabinding.NewsAdapter
import com.rich.tugasdatabinding.R
import com.rich.tugasdatabinding.databinding.FragmentListNewsBinding
import com.rich.tugasdatabinding.model.News

class ListNewsFragment : Fragment() {
    private lateinit var newsAdapter: NewsAdapter
    private lateinit var binding : FragmentListNewsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListNewsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recViewConfig()
        binding.toolbarHome.btnHome.setOnClickListener {
            binding.toolbarHome.btnHome.setImageResource(R.drawable.ic_filled_home)
            findNavController().navigate(R.id.action_listNewsFragment_self)
        }
    }

    fun recViewConfig(){
        var newsData = arrayListOf(
            News("13 September 2022","Jokowi Terima Surat Kepercayaan Dubes Kanada hingga Dubes Thailand",R.drawable.news3,"Kanavino Ahmad","Jakarta - Presiden Joko Widodo (Jokowi) menerima surat kepercayaan dari delapan duta besar luar biasa dan berkuasa penuh (LBBP) negara-negara sahabat. Ada Duta Besar Kanada hingga Duta Besar Thailand.\n" +
                    "Berdasarkan keterangan tertulis dari Biro Pers, Media, dan Informasi Sekretariat Presiden, Selasa (13/9/2022), surat kepercayaan tersebut diserahkan ke Jokowi di di Ruang Kredensial, Istana Merdeka, Jakarta Pusat. Prosesi acara penyerahan surat kepercayaan dimulai dengan diperdengarkannya lagu kebangsaan dari masing-masing negara sahabat.\n" + "Penyerahan surat kepercayaan tersebut menandai dimulainya penugasan resmi para duta besar tersebut di Indonesia. Seluruh duta besar tersebut untuk selanjutnya akan berkedudukan di Indonesia (Jakarta).\n" +
                    "\n" +
                    "Setelah selesai menyerahkan surat kepercayaan kepada Presiden Joko Widodo, para duta besar beserta pendamping masing-masing berpamitan. Lagu Kebangsaan Indonesia Raya turut diperdengarkan pada kesempatan tersebut.\n" +
                    "\n" +
                    "Turut hadir dalam kesempatan tersebut Menteri Luar Negeri Retno Marsudi, Sekretaris Kabinet Pramono Anung, Kepala Sekretariat Presiden Heru Budi Hartono, Sekretaris Militer Presiden Laksma TNI Hersan, serta Direktur Jenderal Protokol dan Konsuler Kementerian Luar Negeri/Kepala Protokol Negara Andy Rachmianto."),
            News("12 September 2022","Bjorka Sebar Data Mendagri Tito Karnavian", R.drawable.news1,"Tim Detik Net","Jakarta - Hacker Bjorka masih terus beraksi menyebarkan data-data pribadi pejabat tinggi di Indonesia. Kali ini korbannya adalah Menteri Dalam Negeri (Mendagri) Tito Karnavian.\n" +
                    "Tampaknya penyebaran data Tito ini terkait dengan cuitan Bjorka sebelumnya, yang membantah kalau aksinya ini adalah pengalihan isu kasus Ferdy Sambo.\n" +
                    "\n" +
                    "\"Jika ada yang berpikir saya di sini untuk mengalihkan kasus Sambo, saya bahkan tidak tahu dia siapa. Tapi saya akan bantu supaya @ListyoSigitP mendengar desakan kalian,\" kata Bjorka dalam cuitannya di Twitter.\n" +
                    "\n" +
                    "Data pribadi Tito ini disebarkan lewat grup Telegramnya, dan Bjorka menulis Sambo adalah 'orangnya' Tito. Tito sendiri seperti diketahui adalah mantan Kapolri yang menjabat dari tahun 2016 sampai 2019. Setelah itu barulah ia dilantik menjadi Mendagri pada Oktober 2019.\n"
            ),
            News("12 September 2022","Ukraina Klaim Berhasil Rebut Lagi 500 Km Wilayah Kherson dari Rusia",R.drawable.news2,"Lisye Sri Rahayu","Jakarta - Otoritas Ukraina mengklaim telah berhasil merebut kembali sekitar 500 km persegi wilayah Kherson dalam waktu 2 minggu terakhir. Wilayah Kherson sebelumnya sempat diduduki tentara Rusia.\n" +
                    "Dilansir CNN, Senin (12/9/2022), juru bicara militer Ukraina di bagian selatan, Natalia Humeniuk, mengatakan perkampungan Vysokopillia, Novovoznesenske, Bilohirka, Myroliubivka dan Sukhyi Stavok telah dibebaskan dari Rusia. Dia mengatakan daerah itu ada di bawah kendali Ukraina.\n" +
                    "\n" +
                    "\"Benar-benar dibebaskan dari penjajah dan berada di bawah bendera Ukraina,\" tutur Humeniuk.\n" +
                    "\n" + "Dalam briefing pada hari Senin waktu setempat, Humeniuk mengatakan 'daerah tersebut telah dibersihkan' dari ranjau Rusia. Dia menambahkan 'langkah-langkah tambahan masih diambil di sana'.\n" +
                    "\n" +
                    "\"Penembakan wilayah ini terus berlanjut, tetapi populasinya berada di bawah yurisdiksi Ukraina,\" ujarnya.\n" ),
            News("11 September 2022","Polisi Kerahkan 6.142 Personel Amankan Aksi PA 212-Demo Kenaikan BBM Besok\n" ,R.drawable.news4,"Karin Nur Secha","Jakarta - Polisi bakal mengerahkan total 6.142 personel kepolisian untuk pengawalan dan penjagaan aksi demonstrasi kenaikan harga BBM besok. Salah satu yang akan dikawal yakni aksi Presidium Alumni (PA) 212 bersama ormas lainnya di Istana Negara.\n" +
                    "\"Kemudian untuk perkuatan pasukan yang diturunkan 6.142 personel,\" ujar Kabid Humas Polda Metro Jaya Kombes E Zulpan kepada detikcom, Minggu (11/9/2022).\n" + "Zulpan mengatakan, personel tersebut disebar di tiga titik, yaitu Patung Kuda, Gedung DPR-MPR dan Balaikota DKI Jakarta. Sejumlah aliansi akan menggelar demo di lokasi tersebut pada Senin (12/9) besok.\n" +
                    "\n" +
                    "\"Jadi untuk besok kegiatan unjuk rasa, demo itu ada di tiga titik. Iya di tiga titik jadi dibagi, konsentrasi utamanya itu di patung kuda dan di MPR-DPR,\" kata Zulpan.\n" +
                    "\n" +
                    "\"Kemudian gini dalam demo kali ini saya imbau kepada masyarakat dimungkinkan adanya pengalihan arus lalin imbas demo ini. Pengalihan arus lalin itu di tiga titik itu,sambungnya.\n"),
            News("11 September 2022","Tangsel Marathon 2022 Sukses Digelar, 2.500 Peserta Ambil Bagian",R.drawable.news5,"Attah Kharisma","Jakarta - Wali Kota Tangerang Selatan Benyamin Davnie resmi membuka Tangsel Marathon di Teras Kota, BSD, Minggu (11/9). Dalam perhelatan ini, sebanyak 2.500 orang peserta memperebutkan hadiah sebesar Rp 350 juta.\n" +
                    "Benyamin mengungkapkan kesuksesan gelaran ini merupakan hasil kolaborasi semua pihak serta dukungan dari masyarakat. Karena itu, ia menyampaikan apresiasi dan ucapan terima kasih kepada seluruh pihak yang telah terlibat menyukseskan Tangsel Marathon.\n" +
                    "\n" +
                    "\"Tangsel marathon ini kegiatan yang bersifat kolaboratif bersama para sponsor. Tidak menggunakan APBD sama sekali. Dan yang paling penting kebahagiaan masyarakat dapat terasa dengan adanya Tangsel Marathon ini, serta perekonomian juga tumbuh,\" ujarnya dalam keterangan tertulis, Minggu (11/9/2022).\n" +
                    "\n" +
                    "Benyamin mengisyaratkan gelaran Tangsel Marathon akan menjadi agenda tahunan di Tangerang Selatan. Terlebih, kesuksesan Tangsel Marathon kali ini yang mendapatkan apresiasi dari berbagai pihak, baik dari masyarakat dari maupun luar daerah Tangerang Selatan.\n" +
                    "\n" +
                    "\"Alhamdulillah, Tangsel Marathon ini sukses dan berjalan lancar. Banyak sekali yang datang dari luar daerah, bahkan dari luar negeri juga ada. Ini memacu semangat kami untuk kembali laksanakan Tangsel Marathon di tahun selanjutnya,\" imbuhnya.\n" +
                    "\n" +
                    "Event ini turut Wakil Wali Kota Pilar Saga Ichsan yang turut berpartisipasi dan berhasil menyelesaikan lari jarak 10K, serta Wali Kota Bogor Bima Arya yang berhasil finish di jarak tempuh yang sama.\n" +
                    "\n" +
                    "Sementara itu, Kepala Dispora Kota Tangsel Mursinah mengatakan ajang ini menjadi event besar yang dapat membangkitkan perekonomian di Kota Tangsel. Menurutnya, Tangsel Marathon ini menjadi langkah awal Tangsel untuk mengembalikan seluruh aktivitas kembali seperti semula serta menarik wisatawan untuk berkunjung ke Tangsel.\n" +
                    "\n" +
                    "\"Bayangkan saja, 2.500 pelari kumpul semua di Tangsel dan mengikuti Tangsel Marathon ini, luar biasa, ungkapnya."),
            News("11 September 2022","KPK Minta Rektor Unila Ungkap Pihak terlibat Bangun LNC Pakai Uang Korupsi",R.drawable.news6,"Muhammad Hanafi","Jakarta - KPK meminta Rektor Universitas Lampung (Unila) Prof Dr Karomani (KRM) untuk memberikan keterangan yang terbuka dan jujur kepada penyidik. Hal ini menyusul kabar pengakuan Karomani yang membangun Lampung Nahdliyyin Center (LNC) menggunakan uang korupsi.\n" +
                    "\"KPK berharap pihak-pihak terkait kooperatif dalam proses penyidikan tersebut. Bila tersangka KRM akan terbuka dan berterus terang serta mengetahui ada dugaan keterlibatan pihak-pihak lain, silakan sampaikan langsung di hadapan tim penyidik,\" kata Kabag Pemberitaan KPK Ali Fikri saat dikonfirmasi.\n" +
                    "\n" +
                    "\"Keterangan yang jujur akan dapat menjadi bahan penilaian Majelis Hakim nanti pada proses di persidangan,\" imbuhnya.\n"+"Selain itu, Ali menyebut pihaknya bakal terus mengusut keterlibatan pihak-pihak yang terlibat dalam perkara yang menjerat Karomani. Dia memastikan juga akan mendalami soal tindak pidana korupsi (TPK) penerimaan mahasiswa baru di Unila.\n" +
                    "\n" +
                    "\"KPK tentu masih terus mendalami dan menelusuri keterlibatan pihak-pihak lainnya dalam dugaan TPK penerimaan mahasiswa baru di UNILA tersebut,\" sebutnya.\n" +
                    "\n" +
                    "Ali menuturkan, keterangan dari Karomani itu dapat memberikan efektivitas dalam penanganan perkara yang tengah diusut KPK. Sehingga, hal itu dipastikan bakal memberi kepastian hukum kepada pihak-pihak yang diduga terlibat.\n" +
                    "\n" +
                    "\"Hal tersebut juga agar penanganan perkaranya bisa berjalan efektif dan segera lengkap berkas perkaranya, sehingga bisa segera memberikan kepastian hukum bagi para pihak dimaksud,\" tutur Ali.\n" +
                    "\n" +
                    "Dia memastikan bakal menyampaikan segala perkembangan menyangkut perkara Karomani. Menurut Ali hal itu merupakan bentuk transparansi dan pertanggungjawaban KPK kepada publik.\n" +
                    "\n" +
                    "\"KPK pasti akan menyampaikan kepada masyarakat progresnya nanti sebagai bentuk transparansi dan pertanggungjawaban kerja-kerja KPK kepada publik,jelasnya.\n"),
            News("9 September 2022","Menteri ESDM Buka-bukaan Soal Nasib Harga Pertalite ke Depan",R.drawable.news7,"Cantika Adinda","Jakarta, CNBC Indonesia - Pemerintah baru saja menaikkan harga bahan bakar minyak (BBM), baik jenis Pertalite, Solar maupun Pertalite. Dengan kebijakan tersebut, ternyata anggaran belanja subsidi BBM masih akan bengkak hingga Rp 650 triliun.\n" +
                    "Dengan asumsi itu bagaimana harga Pertalite Cs ke depan?\n" +
                    "\"BBM kalau sampai akhir tahun itu, sekarang saja dengan asumsi yang 23 juta KL dan 15 KL itu hampir Rp 339 triliun, bisa nembus ke angka itu,\" kata Menteri Energi dan Sumber Daya Mineral (ESDM) Arifin Tasrif di Hotel Ayana MidPlaza, Jakarta, Jumat (9/9/2022)"+"Sementara itu diketahui konsumsi Pertalite akan menjadi 29 juta KL atau naik 6 juta KL seiring dengan masih tingginya konsumsi masyarakat. Solar juga naik sebesar 2 juta KL menjadi 17 juta KL.\n" +
                    "\n" +
                    "\"Konsumsinya naik terus, sampai 29 juta KL dan sampai 17 juta KL untuk solar. Ini jadi berat,\" jelasnya.\n" +
                    "\n" +
                    "Harga minyak dunia kini memang dalam tren menurun, hingga menyentuh level di bawah US\$ 90 per barel. Akan tetapi bila dilihat rata-rata setahun, harga minyak dunia masih di atas US\$ 100 per barel.\n" +
                    "\n" +
                    "Kemudian kurs juga lebih lemah dari yang diperkirakan pemerintah. Kini dolar AS sudah berada di sekitar level Rp 14.800."),
            News("9 September 2022","Awas Ditembak Kim Jong Un, Korut Sahkan UU Serangan Nuklir",R.drawable.news8,"Thea Fathanah","Jakarta, CNBC Indonesia - Korea Utara (Korut) telah mengeluarkan undang-undang (UU) yang mengatur penggunaan senjata nuklir. Di mana ini akan memungkinkan negara tersebut untuk melakukan serangan.\n" +
                    "Menurut media pemerintah Korean Central News Agency (KCNA), dengan adanya UU ini, Korut telah menyatakan statusnya sebagai negara bersenjata nuklir. Ini tidak dapat diubah.\n" +
                    "\n" +
                    "\"Dengan undang-undang tersebut, status negara kita sebagai negara senjata nuklir menjadi tidak dapat diubah lagi,\" kata pemimpin Kim Jong Un, mengutip Al Jazeera.\n"+"Undang-undang baru ini disahkan Majelis Rakyat Tertinggi pada Kamis lalu. Itu akan memungkinkan Korut untuk melakukan serangan nuklir preventif secara otomatis dan segera untuk menghancurkan kekuatan musuh.\n" +
                    "\n" +
                    "\"Terutama ketika negara lain menimbulkan ancaman yang akan segera terjadi pada Pyongyang,\" tulis Reuters Jumat (9/9/2022) mengutip seorang pejabat resmi.\n" +
                    "\n" +
                    "Undang-undang itu juga melarang berbagi senjata atau teknologi nuklir dengan negara lain. \"Tidak ada tawar-menawar atas senjata nuklir kami,\" kata Kim Jong Un dalam pidato di majelis."),
            News("8 September 2022","Saham COAL 2x ARA, Kekayaan Sujaka Lays Naik Rp 215 Miliar!",R.drawable.news9,"Putra","Jakarta, CNBC Indonesia - Setelah debutnya di bursa, saham PT Black Diamond Resources Tbk (COAL) tembus Auto Reject Ara (ARA). Bukan hanya sekali, tapi ARA terjadi selama dua hari beruntun.\n" +
                    "Saat hari pertama listing, saham COAL melesat 35% ditutup di Rp 135/unit. Harga saham COAL kembali terbang 34,81% hari ini dan ditutup di Rp 182/unit.\n" +
                    "\n" +
                    "Artinya, investor yang memegang saham COAL sejak IPO sudah mengantongi unrealized profit (apabila belum dijual dan masih hold) sebesar 82% dalam dua hari saja. Saham COAL ditawarkan di harga Rp 100/unit saat IPO dengan menggandeng penjamin emisi PT Surya Fajar Sekuritas.\n" +
                    "\n"+"Asal tahu saja, COAL merupakan perusahaan batu bara yang mayoritas sahamnya dimiliki oleh seorang bernama Sujaka Lays. Sujaka Lays tercatat mengempit 2,625 miliar saham COAL atau setara dengan 42% kepemilikan. Apabila saat IPO valuasi COAL sebesar Rp 625 miliar, setelah ARA dua hari beruntun nilai kapitalisasi pasarnya tembus Rp 1,1 triliun.\n" +
                    "\n" +
                    "Secara sederhana, maka kekayaan Sujaka Lays telah meningkat Rp 215 miliar hanya dalam kurun waktu dua hari saja.\n" +
                    "\n" +
                    "Sujaka bukan merupakan nama asing di pasar modal. Saat ini dia tercatat sebagai direktur utama dan pengendali tidak langsung dari Indo Komoditi Korpora (INCF), emiten yang bergerak di bidang usaha industri karet dan perdagangan dan sebelumnya bernama PT Amstelco Indonesia.\n" +
                    "\n" +
                    "Sujaka merupakan warga negara Indonesia yang lahir di Jakarta pada 30 Juni 1981. Dia memperoleh gelar Diploma di Perth Western Australia, pada tahun 1999. Pasca kelulusan Sujaka mengawali karier sampai sekarang sebagai Direktur Utama di PT Sampit International.\n" +
                    "\n" +
                    "Pada tahun 2017 dirinya menjabat sebagai Direktur Utama PT Alam Tulus Abadi, pemegang saham mayoritas (40%) dan pengendali INCF yang sahamnya 99% dikuasai oleh Sujaka berdasarkan prospektus IPO Black Diamond.\n" +
                    "\n" +
                    "Sujaka bergabung dengan INCF sejak 11 November 2015 dan bertugas untuk mengendalikan kegiatan di bidang marketing, mencapai target marketing dan menjaga komunikasi yang baik dengan pihak customer maupun supplier, menurut Laporan Tahunan INCF."),
            News("8 September 2022","Mantap! IHSG Berakhir di Zona Hijau, Tembus Level 7.200 Lagi",R.drawable.news10,"Putra","Jakarta, CNBC Indonesia - Indeks Harga Saham Gabungan (IHSG) sukses kembali menembus level psikologis 7.200 pada perdagangan Kamis (8/9/2022). Meskipun penguatan IHSG terpangkas dibandingkan di sesi I yang melesat 1,04% tetapi IHSG bergerak konsisten di zona hijau sejak perdagangan dibuka. IHSG ditutup menguat 0.63% di 7.232 pada sesi II. \n" +
                    "Penguatan IHSG mendapatkan tenaga dari Wall Street. Semalam Wall Street juga ditutup melesat signifikan. Indeks Dow Jones dan S&P 500 naik lebih dari 1% sedangkan Nasdaq Composite melesat 2% lebih.\n" +
                    "\n" +
                    "Penguatan indeks saham Wall Street menyusul pelemahan imbal hasil (yield) obligasi pemerintah AS tenor 10 tahun setelah akhir-akhir ini terus menguat. Kenaikan risk free rate dipicu oleh arah kebijakan moneter bank sentral AS yang masih bernada hawkish. Pelaku pasar mengantisipasi Fed akan menaikkan suku bunga acuan sebesar 75 bps pada pertemuan September ini."+"Asal tahu saja, Fed sudah mengerek naik suku bunga acuannya sebanyak 4x menjadi 2,25% sepanjang tahun ini. Di bulan Juni dan Juli, Fed menaikkan Federal Funds Rate (FFR) masing-masing sebesar 75 bps dan menjadi pengetatan moneter sejak tahun 1990-an.\n" +
                    "\n" +
                    "Pelaku pasar mulai mengantisipasi ECB akan mengerek suku bunga acuan naik dengan besaran sampai 75 basis poin (bps). Besaran tersebut sama dengan yang dilakukan oleh Fed di bulan Juni dan Juli. Faktor yang melatarbelakangi ECB untuk mengikuti langkah Fed yang agresif mengerek suku bunga acuan adalah inflasi.\n" +
                    "\n" +
                    "Di bulan Agustus lalu, laju inflasi di kawasan Benua Biru tembus 9,7% year on year (yoy). Ke depan, pengamat dan pengambil kebijakan memprediksi bahwa laju inflasi masih bisa naik ke level dobel digit.\n" +
                    "\n" +
                    "Kini sudah ada 3 bank sentral Negara Barat yang menempuh kebijakan moneter ketat secara agresif. Ada Fed, ECB dan BoE (bank sentral Inggris).\n" +
                    "\n" +
                    "Di sisi lain keyakinan konsumen Indonesia yang tetap terjaga juga memberikan dorongan untuk IHSG menguat hari ini.\n" +
                    "\n" +
                    "Bank Indonesia (BI) mencatat Indeks Keyakinan Konsumen (IKK) di bulan Agustus 2022 mengalami kenaikan 1,5 poin di banding bulan Juli menjadi 124,7."),
        )
        newsAdapter = NewsAdapter(newsData)
        binding.recView.adapter = newsAdapter
        binding.recView.layoutManager = LinearLayoutManager(context)
//        newsAdapter.onClick = {
//            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToNewsDetailFragment(it))
//        }
    }
}