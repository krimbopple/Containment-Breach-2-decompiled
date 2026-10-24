Function XDXX02F840%(arg0%, arg1%)
    If (((X4BX024DX0() = $00) Lor TXB2BFFFFFX()) <> 0) Then
        Return $00
    EndIf
    blitz_TXXF80Z0FD00($18)
    blitz_TXXF80Z0FD00(TXXDZB2ZBXX())
    blitz_T2DD0DZDD40(TX84DF6X6B6\Field16)
    blitz_TXXF80Z0FD00(arg0)
    Select TX84DF6X6B6\Field11
        Case $02
            blitz_ZXBBD60DX0(TX84DF6X6B6\Field7)
        Case $01
            blitz_TXXF80Z0FD00(arg1)
    End Select
    E24848B4X($02, $01, $00)
    Return $00
End Function
