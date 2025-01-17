import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun ScreenB(
    modifier: Modifier = Modifier.fillMaxSize(),
    navController: NavController
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Screen B",
            fontSize = 20.sp,
        )
        Button(
            onClick = {
                navController.popBackStack()
            }
        ) {
            Text(
                text = "To A"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ScreenAPrev() {
    ScreenB(navController = rememberNavController())
}