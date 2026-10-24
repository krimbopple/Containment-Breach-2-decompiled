Function XB80D84602%(arg0.items)
    If ((TXB2BFFFFFX() Lor (X4BX024DX0() = $00)) <> 0) Then
        Return $00
    EndIf
    blitz_TXXF80Z0FD00($08)
    blitz_TXXF80Z0FD00(TXXDZB2ZBXX())
    blitz_TXXF80Z0FD00($06)
    blitz_TXBFB002B8X0(arg0\Field27)
    E24848B4X($02, $01, $00)
    Return $00
End Function
