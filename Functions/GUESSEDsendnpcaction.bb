Function GUESSEDsendnpcaction%(arg0%, arg1%)
    If (((GUESSEDupdatexdb() = $00) Lor GUESSEDupdateanimatenpc()) <> 0) Then
        Return $00
    EndIf
    blitz_TXXF80Z0FD00($12)
    blitz_TXXF80Z0FD00(GUESSEDupdatedropitem())
    blitz_TXXF80Z0FD00(arg1)
    blitz_TXBFB002B8X0(arg0)
    GUESSEDcallgetsend($02, $01, $00)
    Return $00
End Function
