package com.example.recyclerviewlanjutan;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class Presenter {
    Context context;
    List<Model> models = new ArrayList<>();
    MainView view;
    public Presenter(MainView view, Context context){
        this.view = view;
        this.context = context;
    }

    public void setData(){
        Model bola;

        bola= new Model("Arsenal", R.drawable.arsenal,"Arsenal Football Club (dikenal pula sebagai Arsenal atau The Gunners) adalah klub sepak bola profesional Inggris yang berbasis di daerah Holloway, London. didirikan pada 1886 dengan nama Dial Square. Klub ini bermain di Liga Utama Inggris yang termasuk salah satu klub tersukses di sepak bola Inggris, yang telah memenangkan 13 gelar kasta utama Liga Inggris (10 pada era Divisi Pertama dan 3 pada era Premier League) dan 13 gelar di Piala FA (Gelar paling banyak). Arsenal memegang rekor untuk periode terpanjang berada di kasta puncak Liga Inggris tanpa pernah terdegradasi sejak musim 1919 dan menjadi tim pada peringkat pertama dalam klasemen Liga Inggris sepanjang abad ke-20.[3] Arsenal menjadi tim kedua di Inggris yang menyelesaikan semusim liga tanpa kalah (musim 2003–04) dan tim pertama yang melakukannya pada era di mana satu musim berlangsung 38 pertandingan.");
        models.add(bola);
        bola = new Model("AC Milan", R.drawable.acmilan,"Associazione Calcio Milan (pengucapan bahasa Italia: [assotʃatˈtsjoːne ˈkaltʃo ˈmiːlan]), sering disebut sebagai A.C. Milan atau hanya Milan, adalah sebuah klub sepak bola Italia yang berbasis di Milan, Lombardia, yang bermain di Serie A. Mereka bermain dengan seragam bergaris merah-hitam dan celana putih (kadang-kadang hitam), sehingga dijuluki rossoneri (\"merah-hitam\"). Milan adalah tim tersukses kedua dalam sejarah persepak bolaan Italia, menjuarai Serie A 18 kali dan Piala Italia 5 kali.");
        models.add(bola);
        bola = new Model("Barcelona", R.drawable.barcelona,"Fútbol Club Barcelona, juga dikenal sebagai Barcelona atau Barça, adalah klub sepak bola profesional yang berbasis di Barcelona, Catalunya, Spanyol. Didirikan pada tahun 1899 oleh sekelompok pemain Swiss, Inggris dan Catalan yang dipimpin oleh Joan Gamper, klub telah menjadi simbol budaya Catalan dan Catalanisme, yang mempunyai motto 'Més que un club'' (Lebih dari sebuah klub). Tidak seperti banyak klub sepak bola lainnya, para pendukung memiliki dan mengoperasikan Barcelona. Ia adalah klub sepak bola kedua terkaya di dunia dalam hal pendapatan, dengan omset tahunan sebesar €560,8 juta dan kedua yang paling berharga, senilai $3,56 miliar.[2][3] Lagu kebangsaan resmi Barcelona adalah 'Cant del Barça', yang ditulis oleh Jaume Picas dan Josep Maria Espinas.[4]");
        models.add(bola);
        bola = new Model("Chelsea", R.drawable.chelsea,"Chelsea Football Club /ˈtʃɛlsiː/ adalah sebuah klub sepak bola Inggris yang bermarkas di Fulham, London. Chelsea didirikan pada tahun 1905 dan kini berkompetisi di Liga Utama Inggris.\n" +
                "\n" +
                "Kesuksesan pertama Chelsea diraih saat meraih gelar juara liga pada tahun 1955. Beberapa gelar dari berbagai kompetisi juga berhasil diraih pada dekade 1960an, 1970an, 1990an, dan 2000an. Sepanjang sejarah penampilan dalam dunia sepak bola di Inggris dan Eropa, Chelsea telah meraih enam gelar juara Liga Utama Inggris, tujuh Piala FA, lima Piala Liga, satu trofi Liga Champions UEFA, dua Piala Winners UEFA, satu Liga Eropa UEFA dan satu Piala Super UEFA.[3] Dalam dua dekade terakhir merupakan periode terbaik kesuksesan Chelsea dengan meraih 22 gelar sejak tahun 1997, termasuk untuk pertama kali meraih gelar juara Double winner, Liga Utama Inggris dan Piala FA pada tahun 2010 serta gelar juara Liga Champions UEFA pada tahun 2012 dan Liga Eropa UEFA pada 2013.[4][5].");
        models.add(bola);
        bola = new Model("Inter Milan", R.drawable.intermilan,"Football Club Internazionale Milano,[2] atau yang dikenal dengan nama Internazionale (/ˌinternattsjoˈnaːle/) ataupun juga Inter, dan bahasa sehari-hari dikenal sebagai Inter Milan di luar Italia,[3] adalah sebuah klub sepak bola profesional asal Italia yang saat ini bermain di Serie A Liga Italia. Inter Milan mempunyai julukan sebagai il Nerazzurri (si biru hitam), il Biscone (si ular besar), dan juga La Beneamata (yang tersayang). Klub bermain di Serie A (divisi pertama) sejak tahun 1908, dan pendukung Internazionale disebut Interisti.\n" +
                "\n" +
                "Dari tahun 2006 hingga tahun 2010 adalah tahun pencapaian terbaik kedua bagi Inter sepanjang sejarah sejak berdiri. Dalam kurun waktu tersebut mereka sukses memperoleh lima gelar yaitu Serie A, Coppa Italia, Liga Champions UEFA, Piala Super Italia, dan Piala Dunia Antarklub FIFA.[4].");
        models.add(bola);
        bola = new Model("Manchester United(2015)", R.drawable.mu,"Manchester United Football Club adalah sebuah klub sepak bola profesional Inggris yang berbasis di Old Trafford, Manchester Raya, yang bermain di Liga Inggris. Didirikan sebagai Newton Heath LYR Football Club pada tahun 1878, klub ini berganti nama menjadi Manchester United pada 1902 dan pindah ke Old Trafford pada tahun 1910.\n" +
                "\n" +
                "Manchester United telah memenangkan banyak trofi di sepak bola Inggris, termasuk rekor 20 gelar Liga, 12 Piala FA,[5] empat Piala Liga dan rekor 21 FA Community Shield. Klub ini juga telah memenangkan tiga Piala Eropa, Piala UEFA satu Piala Winners UEFA, satu Piala Super UEFA, satu Piala Interkontinental dan satu Piala Dunia Antarklub FIFA. Pada 1998-1999, klub memenangkan treble dari Liga Premier, Piala FA dan Liga Champions, prestasi belum pernah terjadi sebelumnya untuk klub Inggris..");
        models.add(bola);

        view.onSucsess(models);
    }
}
