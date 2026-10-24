Function XZ2Z4XZ82Z%(arg0%, arg1%)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4#
    Local local5#
    Local local6#
    Local local7#
    Local local8%
    Local local9%
    Local local10.T20BFZFZ62X
    Local local11%
    local0 = blitz_TX28D20DD080()
    local1 = blitz_TX28D20DD080()
    local2 = blitz_TX28D20DD080()
    local3 = blitz_TX28D20DD080()
    local4 = blitz_TX488420F440()
    local5 = blitz_TX488420F440()
    local6 = blitz_TX488420F440()
    local7 = Y060F46X6D(blitz_XXXBBZ4F2Z0(), 10.0)
    local8 = blitz_T20024FDF4X0()
    local9 = blitz_XXXBBZ4F2Z0()
    TX064ZDF0XD($03, arg0)
    local10 = eax_0010
    If ((((local10 = Null) Lor (local10\Field15 <> local2)) Lor (local10\Field16 <> local3)) <> 0) Then
        If (local10 <> Null) Then
            T2264ZDD6F(local10)
        EndIf
        local10 = TF4F86X6ZZ(local4, local5, local6, local7, local2, local3, Null, ((local8 - TX4F8ZZ4X8D()) < ((local9 * $3E8) - $BB8)), local1, arg0)
    EndIf
    If (local10 <> Null) Then
        local10\Field0 = local8
        local10\Field5 = local9
        local10\Field7 = T20FFXB28X8(local0, $01)
        local10\Field17 = arg1
        local10\Field9 = $01
        positionentity(local10\Field19, local4, local5, local6, $00)
        rotateentity(local10\Field19, 0.0, local7, 0.0, $00)
    EndIf
    If (T20FFXB28X8(local0, $00) <> 0) Then
        For local11 = $00 To $09 Step $01
            Y04D8ZZXXF(local10, local11, XDDF2F228D(blitz_TX28D20DD080()))
        Next
    ElseIf (((local10 <> Null) And (local10\Field18 > $00)) <> 0) Then
        For local11 = $00 To $09 Step $01
            Y04D8ZZXXF(local10, local11, Null)
        Next
    EndIf
    Return $00
End Function
