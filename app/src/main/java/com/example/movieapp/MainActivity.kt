package com.example.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<Model>()

        arrayList.add(Model("The New Mutants\n","Twentieth Century Studios dan Marvel Entertainment mempersembahkan The New Mutants, sebuah film horror thriller yang berlokasi di sebuah rumah sakit terpencil di mana sekelompok mutan remaja ditahan untuk pemantauan psikiatri. Kejadian-kejadian aneh mulai terjadi yang akan menguji baik kemampuan mutan mereka dan juga persahabatan mereka saat mereka berjuang untuk bisa keluar dengan selamat.",R.drawable.themutant))
        arrayList.add(Model("Wonder Woman 1984\n","Berlatar setting tahun 1980-an, petualangan Wonder Woman selanjutnya adalah menghadapi dua musuh baru: Max Lord dan The Cheetah.",R.drawable.wonder))
        arrayList.add(Model("Asih 2\n","Teror ASIH (Syarifa Daanish), hantu perempuan malang yang sempat meneror keluarga ANDI (Darius Sinathrya), rupanya belum selesai. Dia kembali datang untuk mengambil anak semata wayang Andi dan Puspita, Amelia. Malam itu, Asih berhasil mengambil Amelia dengan membunuh Andi dan Puspita. Kejadian mengerikan itu disaksikan oleh NENEK (Marini Soerjosoemarno).",R.drawable.asih2))
        arrayList.add(Model("Mariposa\n","Mariposa (Kupu-kupu) seperti kamu, aku mengejar tapi kamu menghindar. Begitulah gambaran sosok IQBAL GUANNA bagi NATASHA KAY LOOVY atau ACHA. Acha bertekad ingin mendapatkan hati Iqbal, seorang cowok cakep, pintar dan dikenal berhati dingin. Sahabat Acha, AMANDA, berusaha mencegah niat Acha untuk mendekati Iqbal. Amanda takut Acha akan terluka dan sakit hati.",R.drawable.mariposa))
        arrayList.add(Model("Milea: Suara dari Dilan\n","Tidak ada kisah yang lebih Indah dari kisah cinta di SMA.Sama halnya dengan kisah cinta Dilan dan Milea.Dari yang awalnya benci hingga saling mencintai. Dari yang awalnya manis hingga menjadi rumit.Menjelang reuni akbar,Dilan memutuskan untuk menceritakan kembali masa masa itu.",R.drawable.milea))
        arrayList.add(Model("Josée\n","Sebuah cerita yang menggambarkan momen paling indah dari Josee (Han Ji-Min) dan Young-Seok (Nam Joo-Hyuk). Josee memiliki keterbatasan fisik dan hidup di dunianya sendiri.",R.drawable.josee))
        arrayList.add(Model("Train To Busan Presents Peninsula (Peninsula)\n","Ketika wabah zombie melanda, Jung-seok (GANG Dong-won) nyaris tidak lolos dari Korea Selatan hidup-hidup. Ketika hidup dalam keputusasaan di Hong Kong, ia menerima tawaran yang menarik untuk kembali ke semenanjung yang dikarantina. Misinya adalah untuk mengambil truk yang ditinggalkan di tengah Seoul dalam batas waktu dan melarikan diri dari semenanjung dengan diam-diam.",R.drawable.penisula))

        val myAdapter = MyAdapter(arrayList,this)

        rv_row.layoutManager = LinearLayoutManager(this)
        rv_row.adapter = myAdapter
    }

}