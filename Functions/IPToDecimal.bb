Function IPToDecimal%(arg0$)
    Return (((((Int _SplitString(arg0, ".", $00)) Shl $18) + ((Int _SplitString(arg0, ".", $01)) Shl $10)) + ((Int _SplitString(arg0, ".", $02)) Shl $08)) + (Int _SplitString(arg0, ".", $03)))
    Return $00
End Function
