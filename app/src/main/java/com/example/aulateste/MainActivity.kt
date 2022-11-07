package com.example.aulateste

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import com.example.aulateste.ui.theme.AulaTesteTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Android", "Jetpack Compose"))
            //Text("Hello World!") //função de composição text exibindo uma mensagem
        }
    }
}

data class Message(val author: String, val body: String) //declarando as variáveis author e body como string

@Composable
fun MessageCard(msg: Message) {
    Row (modifier = Modifier.padding(all = 8.dp)){
        Image(
            painter = painterResource(R.drawable.profile_picture),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                .size(40.dp) //setando um tamanho para a imagem
                .clip(CircleShape) //deixando a imagem em forma de círculo
        )

        Spacer(modifier = Modifier.width(8.dp)) //adicionando um espaço horizontal entre a coluna e a imagem


        Column { //A função column permite organizar elementos verticalmente
            Text(text = msg.author)
            Spacer(modifier = Modifier.height(4.dp)) //adicionando um espaço vertical entre o author e a mensagem de texto
            Text(text = msg.body)
        }
    }
}

@Preview //permite visualizar as funções de composição sem precisar criar e instalar o app em um emulador ou dispositivo Android
@Composable //função composta
fun PreviewMessageCard(){
    MessageCard(
        msg =  Message("Lexi","take a look at Jetpack Compose, It's great!") //dois elementos de texto dentro da criação de conteúdo
    )
}





