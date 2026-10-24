Function TX24F2F08DF$(arg0%)
    If (TXFD22D0402\Field4[arg0] = $00) Then
        Return ""
    EndIf
    Return (" " + chr((((TXFD22D0402\Field4[arg0] - $01) Shl $01) + $3C)))
    Return ""
End Function
