Function GUESSEDsenditemaction%(arg0.items, arg1.items)
    If ((GUESSEDupdateanimatenpc() Lor (GUESSEDupdatexdb() = $00)) <> 0) Then
        Return $00
    EndIf
    blitz_TXXF80Z0FD00($08)
    blitz_TXXF80Z0FD00(GUESSEDupdatedropitem())
    blitz_TXXF80Z0FD00($04)
    blitz_TXBFB002B8X0(arg0\Field27)
    If (arg1 <> Null) Then
        blitz_TXBFB002B8X0(arg1\Field27)
    Else
        blitz_TXBFB002B8X0($00)
    EndIf
    GUESSEDcallgetsend($02, $01, $00)
    Return $00
End Function
