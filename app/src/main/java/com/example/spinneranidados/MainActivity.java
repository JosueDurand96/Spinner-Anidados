package com.example.spinneranidados;


import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  {
   // PROVINCIA
    String[] ItemsProvincia = {"Padre Abad", "Puerto Inca", "Coronel Portillo"};

    // DISTRITO
    String[] ItemsDistritoPadreAbad = {"Padre Abad", "Irázola", "Curimaná", "Alexander von Humboldt", "Neshuya"};
    // CENTRO POBLADO / LOCALIDAD = PADRE ABAD
    String[] ItemsLocalidadesPadreAbad ={"1 Guayabal", "2 Puerto Azul", "3 Carachupa", "5 Nueva Unión", "6 Minas de Sal", "7 Divisoria", "8 Pacay", "9 Paraya Nuevo Porvenir", "10 Nueva Singa", "11 Vista Alegre", "12 Santa Rosa", "13 Chonta / Nuevo Chonta", "14 Campo de Aterrizaje", "15 Union", "17 Margarita","18 Tangarana / Tahagarana","19 Primavera",
            "20 3 de Octubre", "21 Pampa Hermosa","22 Previsto", "23 Nuevo Mundo", "24 Chancadora", "25 Idayacu", "26 Yuracyacu","27 Miguel Grau Seminario", "28 Cedruyo / Cedroyo",
            "29 Erika", "30 Libertad", "32 Yacumama / Miraflores", "33 Pampas Yurac", "34 Margarita", "35 Yurac","36 Mariela", "37 Boqueron", "38 Aguaytia", "40 Inca Garcilaso de La Vega",
            "42 La Punta", "43 Nueva Palestina", "44 Shambillo Mestizo", "45 El Porvenir", "47 Shanantia", "48 Buenos Aires", "49 Llanta Blanca", "50 Diana", "51 Huipaca", "52 Bajo Shambillo",
            "53 Huacamayo", "54 Aguaytia Rural / Barrio Unido", "58 Alto Previsto", "59 Reifsnyder", "60 Huipoca", "61 Huacamaillo", "62 Las Delicias", "75 Micaela Bastidas", "92 Mebanañu",
            "98 Progreso", "100 Nueva Esperanza", "103 Mariscal Cáceres", "104 Bellavista", "107 Nuevo San Martín", "110 Nueva Esperanza", "111 Santa Rosa / Santa Rosa de Aguaytia","114 Valle de Sion",
            "120 Los Olivos", "124 Mebanañu", "130 Santa Ana / Boca Santa Ana", "132 Aguas Verdes", "141 Boca Apua"
    };
    // CENTRO POBLADO / LOCALIDAD = Irázola
    String[] ItemsLocalidadesIrázola={"4 Puerto Azul", "16 Puerto Nuevo", "31 Sinchi Roca", "39 Puerto Nuevo", "41 Sinchi Roca 2","46 Río Chio", "55 Chanantia", "56 Buenos Aires", "57 Shanantia",
    "63 San Pedro de Chio","64 Pueblo Nuevo", "65 Nuevo Huanuco", "66 Santo Domingo", "68 San Juan", "69 Miraflores", "70 Manco Capac", "72 Pijuayo", "73 Ascencion del Ahuaypo",
    "74 Leche Vinagre", "77 Nuevo Oriente", "78 Nuevo Horizonte", "79 Alto Chiringal", "82 Shiringal Bajo", "83 San Chiringal", "85 Valle Sagrado", "86 San Alejandro","87 Santa Cruz",
    "95 Nuevo Tahuantinsuyo", "101 Marco Ramirez","105 Vista Alegre", "106 Caserio Chia","113 Nueva Unión / Palometa", "122 Nueva Florada","135 Nueva Frazola"};

    String[] ItemsLocalidadesCurimaná={"136 Tarahuaca Anexo de Bello Horizonte","137 Valle de Sion","139 Bello Horizonte","140 Campo de Aterrizaje","142 Pueblo Libre","143 Nueva Meriba","144 Maronal",
    "145 Monte Sinai","146 Curimana","147 2 de Mayo","148 10 de Marzo", "149 Las Mercedes", "150 Boca San Alejandro","151 Zorrillos", "152 Campo de Aterrizaje", "153 Puerto Bolivar",
            "154 Nueva Libertad","155 Nueva San José","156 2 de Mayo / Nueva Alianza","157 Las Malvinas","158 16 de Noviembre","159 Cambio 90","160 Vista Alegre","161 Andrés Avelino Cáceres",
   "162 Roca Fuerte", "163 Nuevo Porvenir","164 San José de Hapua", "165 San Juan de Tahuapoa","166 Tahuapoa 90"
    };
    String[] ItemsLocalidadesAlexandervonHumboldt={"67 Nuevo Bellavista","71 Corazónn de Jesús","76 Nuevo Ucayali","80 Alto Yanayacu","81 Asuncion de La Huaytilla","84 Nueva Esperanza","88 Alexander Von Humboldt","89 El Milagro","90 Los Angeles","91 La Unión", "94 Miguel Grau", "96 Mar del Plata"};
    String[] ItemsLocalidadesNeshuya={"93 Nuevo Tiwinza", "97 San Juan 71","99 San Juan 69", "102 El Triunfo", "108 Neshuya", "109 La Frontera", "112 Monte Alegre de Neshuya","115 Nuevo San Martín", "116 San Martín", "117 Nuevo Santa Rosa","118 Nuevo San Alejandro","119 Monte Olivo","121 Villa Mercedes","123 Villa del Campo","125 Pueblo Libre","126 Santa Rosa de Guinea","127 Nuevo San Pedro","128 Víctor Raúl Haya de La Torre","129 Virgen de Fátima","131 10 de Marzo","133 Palma de Agua Blanca","134 16 de Noviembre","138 Villa El Tiempo"};
    String[] ItemsDistritoPuertoInca = {"Puerto Inca", "Codo del Pozuzo", "Honoria", "Tournavista", "Yuyapichis"};
    // CENTRO POBLADO / LOCALIDAD = Puerto Inca
    String[] ItemsLocalidadPuertoInca={"120 Los Olivos","122 Santa Martha","126 Nueva Libertad","127 Chavin de Coto","129 Tres de Mayo","130 Trece Tiros","131 Nuevo Monterrico","132 San Juan","133 Maquisapayoc","134 Fundo Santos","135 Nuevo Miraflores","138 Nueva Victoria","139 Villa Fuerte","140 Quimpichari","141 Navidad","142 Campo de Aterrizaje","143 3 de Octubre","144 Uni Pacayacu","145 Puerto Inca","147 Puerto Súngaro","48 San Juan","149 Nuevo Fronton" ,"150 Puerto Vitarte","151 Churayacu","152 Zirat Zire","153 28 de Julio","156 Pintayacu","157 San Pablo de Sinai","158 San Alejandro","159 Buena Vista","160 Vitarte","161 Tsirotzire","162 Campo de Aterrizaje","163 Sungarillo",
    "165 San Antonio","166 Galicia","167 Unión Libertad","168 Paraiso","169 Puerto Sira","170 San José de Limón","171 Pueblo Libre","172 Pumayacu","173 Flores Alto","174 Tambo Largo / Pueblo Libre","175 Fundo Esperanza","176 Flores Bajo","177 Santa Teresa","178 Cleyton","179 Río Seco","180 Cerro Cira","181 Nuevo Porvenir","182 Piedra Pintada","183 Las Palmas",
    "184 Shebonya","185 Selva Unida","186 Nueva Jerusalen","187 Alianza Baños","189 Pueblo Nuevo","190 Unión Santa Rosa","191 San Pedro de Baños"};
    String[] ItemsLocalidadcododelpozuzo={"1 San Pedro","2 Río Tigre","3 Alto Paujil","4 Osomayo","5 La Libertad","6 San José","7 Consuelo","8 San Antonio","9 Playa Grande","10 Rinconada","11 Agua Blanca","12 Rumitambo","13 Asuncion / Ascencion","14 Tintora / Quintore","15 Shanshuy","16 Huampumayo","17 Santa Rosa","18 Bajo Quintora","19 Concepcion","22 Pergaray","23 Alto Quintora","25 Santa Isabel","26 Río Pozuzo","28 Zabalo","30 Soraya","32 Los Angeles","33 Tigrepampa","34 Nueva Esperanza","35 San Pedro","38 Pucacunga","41 Osomayo","46 Aguanegra","48 La Huanca","50 Andahuaylas","51 Nueva Esmeralda","52 Nuevo Belén","53 Delicias","54 Río Blanco","55 Nuevo Eden","56 Buenos Aires",
    "60 Isleria Pozuzo","62 Palma Pampa","63 Osomayo","64 Yanayacu","66 Sinai","69 Pueblo Libre","70 Río Codo","72 La Unión","73 San Juan","74 Codo del Pozuzo","80 Pueblo Nuevo","82 Los Angeles","83 San Juan del Codo","84 Huitoyacu","85 Alto Moshoca","88 Independencia","89 Miraflores","97 Moshoca","99 Tato","103 Los Angeles","105 Nuevo Horizonte","106 Tununga","110 Santa Marta","112 Santa Teresa de Huito","114 Divisoria de Zungaro","117 Boncuya","125 Pampa Hermosa","128 San Alejandro Alto","136 Alto San Alejandro","137 Pacuyacu","146 San Alejandro","154 Rancho Alegre","155 Puerto Nuevo","164 Alto Paro"};
    String[] ItemsLocalidadHonoria={"216 Unión Carbajal","220 San Antonio","221 Los Conquistadores","222 El Triunfo","223 Porvenir","224 Nueva Independencia","225 Bellavista","226 Monte Sinai","227 Boca de Pachitea","228 Honoria / Nuevo Honoria","229 Dos Unidos","230 José Olaya","231 Cedro Pampa","232 San Miguel de Semuya","233 Nueva Jordania","234 Sargento Lores","235 Nazaret","236 Honoria Viejo","237 Mondorillo","238 Pueblo Libre","239 Andrés Avelino Cáceres","240 Antigua Honoria","241 Indoamerica","242 Nueva Alianza","243 Villa Mercedes","244 Nueva Unión","245 Unión Porvenir","246 San Antonio de Honoria","247 Jerico","248 Nuevo Eden","249 Ecologico Pumayacu","250 Nuevo Jerusalen","251 Señor de los Milagros"};
    String[] ItemsLocalidadTournavista={"188 Nueva Alianza de Baños","192 Tahuayo","193 Santa Rosa de Pata","194 Pacache","195 San Juan de Macuya","196 Naranjal","197 Bello Horizonte","198 Progreso","199 San Juan de Macuya Alto","200 Pueblo Nuevo","201 Independiente","202 Principe de Paz","203 Bajo Macuya","204 Reliquias","205 La Paz","206 La Unión","207 Iparia","208 Macuya","209 Tournavista","210 Leoncio Prado","211 27 de Julio","212 Los Angeles","213 San Juan de Pachitea","214 May Pablo","215 Primavera","217 Chonta Isla","218 Ganso Azul","219 Aguas Calientes Anclaje de Hidroavion"};
    String[] ItemsLocalidadYuyapichis={"20 Cinai","21 Monte Armeña","24 Puerto Flores","27 Nazaret","29 Agro Unión","31 El Dorado","36 Huacamayo","37 Santa Isabel","39 Santa Isabel","40 Las Palmas","42 Camantarma","43 Agrounion","44 Chivitari","45 San Juan de Pachitea","47 Santa Isabel Alta","49 Pompeo","57 Río Negro","58 Colmena","59 Monterrico","61 Pampa Hermosa de Pompeyo","65 La Libertad","67 Flor","68 Unión Santa Rosa","71 Pueblo Libre","75 Vista Alegre","76 Nuevo Dantas","77 John Peter","78 Nueva Galilea","79 Dantas","81 Huembo","86 Yuyapichis","87 Bello Horizonte","90 Pampas Verdes","91 Nuevo Nazaret","92 Nuevo Palestina","93 Nuevo Unidos Tahuantinsuyo","94 Pampa Hermosa","95 Yanayaquillo","96 Pueblo Libre",
    "98 Nuevo Tahuantinsuyo","100 Cuto","101 San Marquez","102 Benancio","104 Alto Yanayacu","107 Santa Rosa de Yanayacu","108 Modena","109 Micaela Bastidas","111 Boca de Yanayacu","113 Nuevo Pozuzo","115 Los Angeles","116 Alto Río Negro","118 Puerto Sol","119 Plátano Isla","121 Nuevo Trujillo","123 Nueva Austria del Sira","124 Playa Alta"};





    String[] ItemsDistritoCoronelPortillo = {"Nueva Requena"};
    String[] ItemsLocalidadesNuevaRequena = {"1 Las Palmeras","2 Sarita Colonia", "3 Nuevo Paraiso", "4 Vista Alegre","5 Naranjillo","6 La Perla de Sanja Seca",
            "7 Chelita","8 Andrés Avelino Cáceres","9 Nuevo Zegor","10 Sanja Seca", "11 La Libertad", "12 Juventud", "13 Tres Islas","14 Bajo Rayal","15 Nueva Requena","16 9 de Febrero","17 San Juan de Shesheta","18 Palmeras de Zapotillo","19 Cedro Isla","20 Barranco"
            ,"21 Nueva Unión de Juantia", "22 Barranca","23 Nuevo Israel", "24 Nuevo Eden", "25 San Pablo", "26 Tipishca de Juantia", "27 Unión de Juantia Tipishca", "28 Santa Clara de Uchunya","29 Boca Juanito","30 Naranjo","31 Esperanza", "32 Nueva Unión de Progreso","33 El Caribe","34 Miraflores","35 Naranjal","36 San José / Trapiche","37 Santa Clara de Uchunya","38 Unión Progreso",
            "39 Santa Rosa de Ubuya","40 Palestina","41 Esperanza","42 Panaillo", "Otro"
    };


    Spinner spDepartamento,spProvincia,spDistrito;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spDepartamento=(Spinner)findViewById(R.id.spDepartamento);
        spProvincia=(Spinner)findViewById(R.id.spProvincia);
        spDistrito=(Spinner)findViewById(R.id.spDistrito);

   ArrayAdapter<String> ada = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ItemsProvincia);
        spDepartamento.setAdapter(ada);
        spDepartamento.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String  name = (String)spDepartamento.getSelectedItem();

                if(name == "Padre Abad") {
                    ArrayAdapter<String> ada = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item, ItemsDistritoPadreAbad);
                    spProvincia.setAdapter(ada);
                    spProvincia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String  provinciaString = (String)spProvincia.getSelectedItem();
                            if (provinciaString=="Padre Abad"){
                               ArrayAdapter<String> ada1 = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item, ItemsLocalidadesPadreAbad);
                                spDistrito.setAdapter(ada1);
                            }else if (provinciaString=="Irázola"){
                                ArrayAdapter<String> ada1 = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item, ItemsLocalidadesIrázola);
                                spDistrito.setAdapter(ada1);
                            }else if (provinciaString =="Curimaná"){
                                ArrayAdapter<String> ada1 = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item, ItemsLocalidadesCurimaná);
                                spDistrito.setAdapter(ada1);

                            }else if (provinciaString =="Alexander von Humboldt"){
                                ArrayAdapter<String> ada1 = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item, ItemsLocalidadesAlexandervonHumboldt);
                                spDistrito.setAdapter(ada1);
                            }else if (provinciaString=="Neshuya"){
                                ArrayAdapter<String> ada1 = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item, ItemsLocalidadesNeshuya);
                                spDistrito.setAdapter(ada1);
                            }
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });
                } else if (name== "Puerto Inca"){
                    ArrayAdapter<String> ada1 = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item, ItemsDistritoPuertoInca);
                    spProvincia.setAdapter(ada1);
                    spProvincia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String  provinciapg = (String)spProvincia.getSelectedItem();
                            if (provinciapg=="Puerto Inca"){
                                Toast.makeText(MainActivity.this, "OK"+provinciapg, Toast.LENGTH_SHORT).show();
                                ArrayAdapter<String> ada1 = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item, ItemsLocalidadPuertoInca);
                                spDistrito.setAdapter(ada1);
                            }else if (provinciapg=="Codo del Pozuzo"){
                                Toast.makeText(MainActivity.this, "OK"+provinciapg, Toast.LENGTH_SHORT).show();
                                ArrayAdapter<String> ada1 = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item, ItemsLocalidadcododelpozuzo);
                                spDistrito.setAdapter(ada1);
                            }else if (provinciapg =="Honoria"){
                                Toast.makeText(MainActivity.this, "OK"+provinciapg, Toast.LENGTH_SHORT).show();
                                ArrayAdapter<String> ada1 = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item, ItemsLocalidadHonoria);
                                spDistrito.setAdapter(ada1);

                            }else if (provinciapg =="Tournavista"){
                                Toast.makeText(MainActivity.this, "OK"+provinciapg, Toast.LENGTH_SHORT).show();
                                ArrayAdapter<String> ada1 = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item, ItemsLocalidadTournavista);
                                spDistrito.setAdapter(ada1);
                            }else if (provinciapg=="Yuyapichis"){
                                ArrayAdapter<String> ada1 = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item, ItemsLocalidadYuyapichis);
                                spDistrito.setAdapter(ada1);
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }else  {
                    ArrayAdapter<String> ada = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item, ItemsDistritoCoronelPortillo);
                    spProvincia.setAdapter(ada);
                    spProvincia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            ArrayAdapter<String> ada = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item, ItemsLocalidadesNuevaRequena);
                            spDistrito.setAdapter(ada);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }



}
