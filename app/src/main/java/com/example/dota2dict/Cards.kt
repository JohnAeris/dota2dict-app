package com.example.dota2dict

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dota2dict.ui.theme.Poppins

//HOME PAGE | GENERAL UPDATE CARD

@Composable
fun UpdatesGeneralCard(generalUpdate: GeneralUpdatesData, modifier: Modifier = Modifier) {
    Card(elevation = 4.dp) {
        Box (modifier = Modifier.background(Color.Black)) {
            Row {
                Image(
                    painter = painterResource(R.drawable.ic_bullet_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 30.dp, top = 5.dp)
                        .size(20.dp)
                        .shadow(16.dp))

                Spacer(modifier = Modifier.width(10.dp))

                Text(
                    text = stringResource(id = generalUpdate.stringResourceID),
                    fontFamily = Poppins,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.White,
                    modifier = Modifier
                        .padding(end = 20.dp, top = 5.dp, bottom = 10.dp))
            }
        }
    }
}

@Preview (showBackground = true)
@Composable
fun GeneralUpdatesCardPreview() {
    UpdatesGeneralCard(GeneralUpdatesData(R.string.text1))
}

//HOME PAGE | ITEMS UPDATE CARD

@Composable
fun UpdatesItemCard(itemUpdate: ItemUpdatesData, modifier: Modifier = Modifier) {
    Card(
        elevation = 4.dp,
        backgroundColor = Color.Black,
        modifier = Modifier
            .padding(bottom = 10.dp)) {

        Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .background(Color.Black)
                    .padding(start = 20.dp, end = 20.dp)
            )

        {
                Image(
                    painter = painterResource(id = itemUpdate.itemImage),
                    contentDescription = stringResource(id = itemUpdate.itemName),
                    modifier = Modifier.size(80.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))

                Column(
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = stringResource(id = itemUpdate.itemName),
                        fontFamily = Poppins,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White
                    )

                    Text(
                        text = stringResource(id = itemUpdate.itemDescription),
                        fontFamily = Poppins,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.White
                    )
                }
        }
    }
}


@Preview (showBackground = true)
@Composable
fun UpdatesItemCardPreview() {
    UpdatesItemCard(ItemUpdatesData(R.string.item1, R.string.item_description1, R.drawable.bracer_icon))
}

//HOME PAGE | NEUTRAL ITEMS UPDATE CARD
@Composable
fun UpdatesNeutralItemCard(neutralItemUpdate: NeutralItemUpdatesData, modifier: Modifier = Modifier) {
    Card(
        elevation = 4.dp,
        backgroundColor = Color.Black,
        modifier = Modifier
            .padding(bottom = 10.dp)) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .background(Color.Black)
                .padding(start = 20.dp, end = 20.dp)
        )

        {
            Image(
                painter = painterResource(id = neutralItemUpdate.neutralItemImage),
                contentDescription = stringResource(id = neutralItemUpdate.neutralItemName),
                modifier = Modifier.size(80.dp)
            )

            Spacer(modifier = Modifier.width(20.dp))

            Column(
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = stringResource(id = neutralItemUpdate.neutralItemName),
                    fontFamily = Poppins,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )

                Text(
                    text = stringResource(id = neutralItemUpdate.neutralItemDescription),
                    fontFamily = Poppins,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.White
                )
            }
        }
    }
}

@Preview (showBackground = true)
@Composable
fun NeutralUpdatesItemCardPreview() {
    UpdatesNeutralItemCard(NeutralItemUpdatesData(R.string.neutral_item1, R.string.neutral_item_description1, R.drawable.occult_bracelet_icon))
}