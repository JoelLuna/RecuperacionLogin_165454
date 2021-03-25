package luna.joel.recuperacionlogin_165454

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var etx_nombre: TextView = findViewById(R.id.edtx_nombre)
        var etx_apellido: TextView = findViewById(R.id.edtx_apellido)


        btn_registrar.setOnClickListener(){

            var nombre: String = etx_nombre.text.toString()
            var apellido: String = etx_apellido.text.toString()

            var intent: Intent= Intent(this,Bienvenida::class.java)
            intent.putExtra("nombre",nombre)
            intent.putExtra("apellido", apellido)
            startActivity(intent)
        }
    }
}
