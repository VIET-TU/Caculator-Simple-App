package com.example.cauculartor



sealed class CaculatorActions {
    data class Number(val number: Int) : CaculatorActions()
    object Clear: CaculatorActions()
    object Delete: CaculatorActions()
    object  Decimal: CaculatorActions()
    object Calculate: CaculatorActions()
    data class Operation(val operation: CalculatorOperation): CaculatorActions()
}