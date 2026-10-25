Function GUESSEDsenditemfloat%(arg0.items, arg1#)
    If ((GUESSEDupdateanimatenpc() Lor (GUESSEDupdatexdb() = $00)) <> 0) Then
        Return $00
    EndIf
    blitz_TXXF80Z0FD00($08)
    blitz_TXXF80Z0FD00(GUESSEDupdatedropitem())
    blitz_TXXF80Z0FD00($03)
    blitz_TXBFB002B8X0(arg0\Field27)
    blitz_XB2Z2BB0460(arg1)
    GUESSEDcallgetsend($02, $01, $00)
    Return $00
End Function
