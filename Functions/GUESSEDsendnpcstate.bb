Function GUESSEDsendnpcstate%(arg0.T20BFZFZ62X)
    If ((GUESSEDupdateanimatenpc() Lor (GUESSEDupdatexdb() = $00)) <> 0) Then
        Return $00
    EndIf
    blitz_TXXF80Z0FD00($0E)
    blitz_TXXF80Z0FD00(GUESSEDupdatedropitem())
    blitz_TXBFB002B8X0(arg0\Field2)
    GUESSEDcallgetsend($02, $01, $00)
    Return $00
End Function
