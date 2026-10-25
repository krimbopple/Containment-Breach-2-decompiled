Function GUESSEDsenditemstate%(arg0.items)
    If ((GUESSEDupdateanimatenpc() Lor (GUESSEDupdatexdb() = $00)) <> 0) Then
        Return $00
    EndIf
    blitz_TXXF80Z0FD00($08)
    blitz_TXXF80Z0FD00(GUESSEDupdatedropitem())
    blitz_TXXF80Z0FD00($02)
    blitz_TXBFB002B8X0(arg0\Field27)
    GUESSEDcallgetsend($02, $01, $00)
    Return $00
End Function
