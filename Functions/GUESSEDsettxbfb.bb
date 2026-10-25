Function GUESSEDsettxbfb%(arg0.items)
    If ((GUESSEDupdateanimatenpc() Lor (GUESSEDupdatexdb() = $00)) <> 0) Then
        Return $00
    EndIf
    blitz_TXXF80Z0FD00($08)
    blitz_TXXF80Z0FD00(GUESSEDupdatedropitem())
    blitz_TXXF80Z0FD00($05)
    blitz_TXBFB002B8X0(arg0\Field27)
    blitz_XB2Z2BB0460(arg0\Field15)
    blitz_XB2Z2BB0460(arg0\Field3)
    GUESSEDcallgetsend($00, $01, $00)
    arg0\Field26 = 35.0
    Return $00
End Function
