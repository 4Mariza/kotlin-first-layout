package br.senai.sp.jandira.layouts

import android.os.Bundle
import android.text.Editable
import android.text.style.AlignmentSpan
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.layouts.ui.theme.LayoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TesteColumn()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun TesteColumn() {
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = Color.Cyan
    ){
        Column(
            modifier = Modifier.background(Color(0x95FF9800)),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "LOGIN",
                modifier = Modifier
                    .padding(top = 48.dp),
                fontSize = 32.sp,
                color = Color.White,
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Bold,
                letterSpacing = 25.sp
            )
            Image(painter = painterResource(id = R.drawable.login_icon) , contentDescription = "Logotipo da Aplicação",
                modifier = Modifier.size(height = 60.dp, width = 60.dp)
            )

            Card(
                modifier = Modifier
                    .size(height = 130.dp, width = 130.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF2A6391)
                ),
                elevation = CardDefaults.cardElevation(5.dp),
                shape = CircleShape,
                border = BorderStroke(width = 5.dp, color = Color.White)
            ) {
                Image(painter = painterResource(id = R.drawable.icon_user), contentDescription ="" )
            }

            Box (
                modifier = Modifier
                    .height(260.dp)
                    .background(Color(0xFF4CAF50), shape = RoundedCornerShape(16.dp)),
                    contentAlignment = Alignment.Center
            ){
                Column (
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxHeight(),
                    verticalArrangement = Arrangement.SpaceEvenly)
                {
                    Text(text = "Email", color = Color.White)
                    TextField(
                        value = "",
                        onValueChange ={})
                    Text(text = "Senha", color = Color.White)
                    TextField(
                        value = "",
                        onValueChange ={})
                }
            }
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .offset(x = 0.dp, y = 0.dp)
                    .fillMaxWidth()
                    .height(56.dp)
                    .padding(horizontal = 36.dp)
            ) {
                Text(
                    text = "ENTRAR",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.SansSerif
                    )
                Image(painter = painterResource(id = R.drawable.enter_login), contentDescription = "Entrar icon",
                    modifier = Modifier.offset(x = 15.dp, y = 0.dp))
            }
            Box(
                modifier = Modifier
                    .background(color = Color.White)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Copyright DS2BIT",
                    color = Color(0xFF3B876F),
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                )
            }
        }
    }
}

@Composable
fun Teste() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
            .padding(16.dp),
        color = Color.White,
        border = BorderStroke(2.dp, color = Color.Gray)
    ) {
        Box (
            modifier = Modifier
                .padding(top = 16.dp, bottom = 16.dp, start = 10.dp, end = 10.dp)
                .background(Color(0x95FF9800), shape = RoundedCornerShape(25.dp))
                .border(width = 3.dp, color = Color.Green, shape = RoundedCornerShape(25.dp))
                //.padding(8.dp)
        ){
            Text(
                text = "Testando o Preview",
                color = Color.White,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier
                    .width(120.dp)
                    //.border(width = 2.dp, color = Color.White,)
                    .align(alignment = Alignment.Center),
                    //.offset(x = 0.dp, y = 0.dp)
                textAlign = TextAlign.Center
            )

        }

    }
}

//@Preview(showSystemUi = true)
@Composable
fun TestePreview() {
    LayoutsTheme {
        Teste()
    }
}

@Preview
@Composable
fun TesteColumnPreview() {
    LayoutsTheme {
        TesteColumn()
    }
}

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    LayoutsTheme {
        Greeting("Android")
    }
}