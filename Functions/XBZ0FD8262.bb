Function XBZ0FD8262%(arg0.items, arg1.items)
    Local local0%
    Local local1%
    Local local2.items
    If (((X4BX024DX0() = $00) Lor (arg0 = Null)) <> 0) Then
        Return $00
    EndIf
    If (arg1 = Null) Then
        local1 = $00
        TX064ZDF0XD($00, arg0\Field18)
        local2 = eax_0012
        If (local2 <> Null) Then
            X28B24BBZB(arg0, local2)
            FB0BDFX4B(local2, (Y0X8XD66D6(local2) = $00))
        EndIf
        arg0\Field18 = $00
    Else
        arg0\Field18 = arg1\Field27
        arg0\Field26 = 70.0
        arg0\Field17 = $01
        FB0BDFX4B(arg1, $01)
    EndIf
    If (((TXB2BFFFFFX() = $00) And (arg0\Field29 = TXXDZB2ZBXX())) <> 0) Then
        A6020B22B(arg0, arg1)
    EndIf
    Return $00
End Function
