Function A6020B22B%(arg0.items, arg1.items)
    If ((TXB2BFFFFFX() Lor (X4BX024DX0() = $00)) <> 0) Then
        Return $00
    EndIf
    blitz_TXXF80Z0FD00($08)
    blitz_TXXF80Z0FD00(TXXDZB2ZBXX())
    blitz_TXXF80Z0FD00($04)
    blitz_TXBFB002B8X0(arg0\Field27)
    If (arg1 <> Null) Then
        blitz_TXBFB002B8X0(arg1\Field27)
    Else
        blitz_TXBFB002B8X0($00)
    EndIf
    E24848B4X($02, $01, $00)
    Return $00
End Function
