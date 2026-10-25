Function GUESSEDinitinitnewgame_7%(arg0%, arg1$, arg2%)
    GUESSEDcheckvalue_27(arg0, arg1)
    T8X2046020\Field14 = $01
    If ((arg2 And (arg0 > $00)) <> 0) Then
        MP_ConnectMenu(arg0)
    EndIf
    Return $00
End Function
