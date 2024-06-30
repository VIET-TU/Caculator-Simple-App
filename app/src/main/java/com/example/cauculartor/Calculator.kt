package com.example.cauculartor

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Calculator(
    state: CaculatorState,
    buttonSpacing: Dp,
    modifier: Modifier = Modifier,
    onAction: (CaculatorActions) -> Unit

) {
    Box(modifier = modifier) {
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Text(
                text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = Color.White,
                maxLines = 2
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement =  Arrangement.spacedBy(buttonSpacing)
            ) {
                CaculatorButton(
                    symbol = "AC",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(2f)
                        .weight(2f),
                   onCLick = {
                       onAction(CaculatorActions.Clear)
                   }
                )
                CaculatorButton(
                    symbol = "Del",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CaculatorActions.Delete)
                    }
                )
                CaculatorButton(
                    symbol = "/",
                    modifier = Modifier
                        .background(Color.Blue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CaculatorActions.Operation(CalculatorOperation.Divide))
                    }
                )

            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement =  Arrangement.spacedBy(buttonSpacing)
            ) {
                CaculatorButton(
                    symbol = "7",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CaculatorActions.Number(7))
                    }
                )
                CaculatorButton(
                    symbol = "8",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CaculatorActions.Number(8))
                    }
                )
                CaculatorButton(
                    symbol = "9",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CaculatorActions.Number(9))
                    }
                )
                CaculatorButton(
                    symbol = "x",
                    modifier = Modifier
                        .background(Color.Blue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CaculatorActions.Operation(CalculatorOperation.Multiply))
                    }
                )


            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement =  Arrangement.spacedBy(buttonSpacing)
            ) {
                CaculatorButton(
                    symbol = "4",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CaculatorActions.Number(4))
                    }
                )
                CaculatorButton(
                    symbol = "5",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CaculatorActions.Number(5))
                    }
                )
                CaculatorButton(
                    symbol = "6",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CaculatorActions.Number(6))
                    }
                )
                CaculatorButton(
                    symbol = "-",
                    modifier = Modifier
                        .background(Color.Blue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CaculatorActions.Operation(CalculatorOperation.Subtract))
                    }
                )

            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement =  Arrangement.spacedBy(buttonSpacing)
            ) {
                CaculatorButton(
                    symbol = "1",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CaculatorActions.Number(1))
                    }
                )
                CaculatorButton(
                    symbol = "2",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CaculatorActions.Number(2))
                    }
                )
                CaculatorButton(
                    symbol = "3",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CaculatorActions.Number(3))
                    }
                )
                CaculatorButton(
                    symbol = "+",
                    modifier = Modifier
                        .background(Color.Blue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CaculatorActions.Operation(CalculatorOperation.Add))
                    }
                )

            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement =  Arrangement.spacedBy(buttonSpacing)
            ) {
                CaculatorButton(
                    symbol = "0",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onCLick = {
                        onAction(CaculatorActions.Number(0))
                    }
                )
                CaculatorButton(
                    symbol = ".",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CaculatorActions.Decimal)
                    }
                )
                CaculatorButton(
                    symbol = "=",
                    modifier = Modifier
                        .background(Color.Blue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CaculatorActions.Calculate)
                    }
                )

            }


        }
    }
}