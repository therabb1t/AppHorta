package com.example.apphorta;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class Mapa extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng horta1 = new LatLng(-30.10934500, -51.13678900);
        mMap.addMarker(new MarkerOptions().position(horta1).title("1: Horta Lomba do Pinheiro"));

        LatLng horta2 = new LatLng(-30.11567800, -51.12789000);
        mMap.addMarker(new MarkerOptions().position(horta2).title("2: Pracinha da Cultura"));

        LatLng horta3 = new LatLng(-30.09876500, -51.14567800);
        mMap.addMarker(new MarkerOptions().position(horta3).title("3: Emef Gabriel Obino"));

        LatLng horta4 = new LatLng(-30.10234500, -51.15432100);
        mMap.addMarker(new MarkerOptions().position(horta4).title("4: Centro Vida"));

        LatLng horta5 = new LatLng(-30.10456700, -51.15234500);
        mMap.addMarker(new MarkerOptions().position(horta5).title("5: EEEF David Canabarro"));

        LatLng horta6 = new LatLng(-30.10789000, -51.14987600);
        mMap.addMarker(new MarkerOptions().position(horta6).title("6: Lar do Cego Idoso"));

        LatLng horta7 = new LatLng(-30.11234500, -51.13234500);
        mMap.addMarker(new MarkerOptions().position(horta7).title("7: Amovas"));

        LatLng horta8 = new LatLng(-30.09567800, -51.16789000);
        mMap.addMarker(new MarkerOptions().position(horta8).title("8: EEEF Ana Neri"));

        LatLng horta9 = new LatLng(-30.08901200, -51.17890100);
        mMap.addMarker(new MarkerOptions().position(horta9).title("9: Sport Vida"));

        LatLng horta10 = new LatLng(-30.08654300, -51.16543200);
        mMap.addMarker(new MarkerOptions().position(horta10).title("10: Instituição Prisma"));

        LatLng horta11 = new LatLng(-30.08654300, -51.16543200);
        mMap.addMarker(new MarkerOptions().position(horta11).title("11: US Cruzeiro do Sul"));

        LatLng horta12 = new LatLng(-30.10234500, -51.15432100);
        mMap.addMarker(new MarkerOptions().position(horta12).title("12: Emef Grande Oriente"));

        LatLng horta13 = new LatLng(-30.08901200, -51.17890100);
        mMap.addMarker(new MarkerOptions().position(horta13).title("13: Grupo Escoteiros"));

        LatLng horta14 = new LatLng(-30.08901200, -51.17890100);
        mMap.addMarker(new MarkerOptions().position(horta14).title("14: Centro de Eventos"));

        LatLng horta15 = new LatLng(-30.09567800, -51.16789000);
        mMap.addMarker(new MarkerOptions().position(horta15).title("15: Largo da Bandeira IAPI"));

        LatLng horta16 = new LatLng(-30.08543200, -51.14321000);
        mMap.addMarker(new MarkerOptions().position(horta16).title("16: Jardim Continental"));

        LatLng horta17 = new LatLng(-30.07890100, -51.18901200);
        mMap.addMarker(new MarkerOptions().position(horta17).title("17: Instituto Anjos do Cristal"));

        LatLng horta18 = new LatLng(-30.09876500, -51.14567800);
        mMap.addMarker(new MarkerOptions().position(horta18).title("18: Recanto dos Gaudérios"));

        LatLng horta19 = new LatLng(-30.08543200, -51.14321000);
        mMap.addMarker(new MarkerOptions().position(horta19).title("19: Ass. Moradores/Coinma"));

        LatLng horta20 = new LatLng(-30.07345600, -51.15678900);
        mMap.addMarker(new MarkerOptions().position(horta20).title("20: Chácara do Primeiro (SMS)"));

        LatLng horta21 = new LatLng(-30.12098700, -51.19876500);
        mMap.addMarker(new MarkerOptions().position(horta21).title("21: Ester Mulher"));

        LatLng horta22 = new LatLng(-30.07890100, -51.18901200);
        mMap.addMarker(new MarkerOptions().position(horta22).title("22: Instituto Social do Cristal"));

        LatLng horta23 = new LatLng(-30.12098700, -51.19876500);
        mMap.addMarker(new MarkerOptions().position(horta23).title("23: Madre Tierra"));

        LatLng horta24 = new LatLng(-30.09876500, -51.14567800);
        mMap.addMarker(new MarkerOptions().position(horta24).title("24: EMEF Rincão"));

        LatLng horta25 = new LatLng(-30.09234500, -51.16789000);
        mMap.addMarker(new MarkerOptions().position(horta25).title("25: Escola Tecnobaby/CRAS"));

        LatLng horta26 = new LatLng(-30.06543200, -51.23456700);
        mMap.addMarker(new MarkerOptions().position(horta26).title("26: Creche Ilha das Flores"));

        LatLng horta27 = new LatLng(-30.03210900, -51.22890100);
        mMap.addMarker(new MarkerOptions().position(horta27).title("27: Horta do Centro Histórico"));

        LatLng horta28 = new LatLng(-30.04567800, -51.18765400);
        mMap.addMarker(new MarkerOptions().position(horta28).title("28: UBS Jenor Jarros"));

        LatLng horta29 = new LatLng(-30.07345600, -51.15678900);
        mMap.addMarker(new MarkerOptions().position(horta29).title("29: Horta Comunitária Morro da Cruz"));

        LatLng horta30 = new LatLng(-30.08543200, -51.19876500);
        mMap.addMarker(new MarkerOptions().position(horta30).title("30: Ass. Faça o Bem/US"));

        LatLng horta31 = new LatLng(-30.08654300, -51.16543200);
        mMap.addMarker(new MarkerOptions().position(horta31).title("31: Horta Amor em Movimento"));

        LatLng horta32 = new LatLng(-30.12098700, -51.19876500);
        mMap.addMarker(new MarkerOptions().position(horta32).title("32: Projeto Pitu Canoa"));

        LatLng horta33 = new LatLng(-30.09234500, -51.16789000);
        mMap.addMarker(new MarkerOptions().position(horta33).title("33: Ass. Moradores Vila Teodora"));

        LatLng horta34 = new LatLng(-30.08543200, -51.14321000);
        mMap.addMarker(new MarkerOptions().position(horta34).title("34: Beco da Pedreira"));

        LatLng horta35 = new LatLng(-30.08543200, -51.19876500);
        mMap.addMarker(new MarkerOptions().position(horta35).title("35: CRAS Hípica/Fundação Solidariedade"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(horta1, 12));
    }


}
