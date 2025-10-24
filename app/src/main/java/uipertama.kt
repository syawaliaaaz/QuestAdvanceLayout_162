import java.lang.reflect.Modifier

@Composable
fun ActivitasPertama(modifier: Modifier){
    Column(
        modifier = Modifier
            .padding(top = 100.dp)
            .fillMaxSize()
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResources( id = R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
    )
        Text(
            text = stringResource( id = R.string.univ),
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height( height = 25.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth(fraction = 1f)
                .padding( all = 12.dp)
                    colors = CardDefaults.cardColors(
                    containerColor = Color .DarkGrey
                    )
        ) {
                Row() {
                    val gambar = painterResource( id = R.drawable.logo_umy)
                    Image(
                        painter = gambar,
                        contentDescription = null,
                        modifier = Modifier.size( size = 100.dp)
                    )
                    }
                Row() {
                    modifier = Modifier
                        .size( size = 100.dp)
                        .padding( all = 5.dp)
                    )
                    Spacer(modifier = Modifier .width( width = 30.dp))
                    Column() {
                        Text(
                            text = stringResources( id = R.string.nama),
                            fontSize = 30.sp,
                            fontFamily = FontFamily.Cusive,
                            color = Color.White,
                            modifier = Modifier.padding(top = 15.dp)
                        )
                        Text(
                            text = stringResource( id = R.string.alamat)
                            fontSize = 20.sp,
                            color = Color.Yellow,
                            modifier = Modifier.padding(top = 10.dp
                            )
                        )

                    }
                }

            }
    }