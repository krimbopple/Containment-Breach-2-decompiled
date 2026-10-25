Function GUESSEDsetdd_2%(arg0.doors, arg1.items, arg2%, arg3%)
    If ((GUESSEDupdateanimatenpc() Lor (GUESSEDupdatexdb() = $00)) <> 0) Then
        Return $00
    EndIf
    blitz_TXXF80Z0FD00($07)
    blitz_TXXF80Z0FD00(GUESSEDupdatedropitem())
    blitz_T2DD0DZDD40(arg0\Field36)
    blitz_TXXF80Z0FD00(arg2)
    blitz_TXBFB002B8X0(arg3)
    If (arg1 <> Null) Then
        blitz_TXBFB002B8X0(arg1\Field27)
    Else
        blitz_TXBFB002B8X0($00)
    EndIf
    GUESSEDcallgetsend($02, $01, $00)
    arg0\Field53 = 35.0
    If (arg0\Field26 <> Null) Then
        arg0\Field26\Field53 = 35.0
    EndIf
    Return $00
End Function
