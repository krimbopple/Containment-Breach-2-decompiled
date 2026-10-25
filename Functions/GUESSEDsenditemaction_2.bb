Function GUESSEDsenditemaction_2%(arg0.items)
    If ((((GUESSEDupdatexdb() = $00) Lor GUESSEDupdateanimatenpc()) Lor (arg0 = Null)) <> 0) Then
        Return $00
    EndIf
    blitz_TXXF80Z0FD00($16)
    blitz_TXXF80Z0FD00(GUESSEDupdatedropitem())
    blitz_TXXF80Z0FD00($01)
    blitz_TXBFB002B8X0(arg0\Field27)
    GUESSEDcallgetsend($02, $01, $00)
    Return $00
End Function
