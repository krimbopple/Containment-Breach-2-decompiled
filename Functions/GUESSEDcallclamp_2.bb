Function GUESSEDcallclamp_2%(arg0%)
    TXBB68DB206 = (Int clamp((Float (TXBB68DB206 + arg0)), 0.0, 2.0))
    If (TXBB68DB206 <= $00) Then
        TXDBD82D24F = $00
    EndIf
    Return $00
End Function
