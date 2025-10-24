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
    )
    }