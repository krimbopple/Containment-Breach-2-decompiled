Function YX20ZDFZX2%(arg0.doors)
    If (((TXB2BFFFFFX() Lor (X4BX024DX0() = $00)) Lor arg0\Field30) <> 0) Then
        Return $00
    EndIf
    arg0\Field53 = max((arg0\Field53 - fps\Field3[$00]), 0.0)
    arg0\Field50 = max((arg0\Field50 - fps\Field3[$00]), 0.0)
    If (((0.0 < arg0\Field53) Lor (0.0 < arg0\Field50)) <> 0) Then
        Return $00
    EndIf
    arg0\Field21 = (T20FFXB28X8(arg0\Field48, $01) + (T20FFXB28X8(arg0\Field48, $07) Shl $01))
    If (((arg0\Field12 = $00) And (((arg0\Field35 <> Null) And arg0\Field35\Field12) = $00)) <> 0) Then
        arg0\Field12 = T20FFXB28X8(arg0\Field29, $01)
        arg0\Field39 = T20FFXB28X8(arg0\Field48, $00)
    EndIf
    arg0\Field27 = T20FFXB28X8(arg0\Field29, $02)
    arg0\Field43 = T20FFXB28X8(arg0\Field48, $05)
    If ((T20FFXB28X8(arg0\Field29, $04) And (arg0\Field38 = $00)) <> 0) Then
        blitz_X480XDB4860(arg0, T20FFXB28X8(arg0\Field29, $05), $01)
    EndIf
    If ((T20FFXB28X8(arg0\Field48, $06) And (arg0\Field5 = $00)) <> 0) Then
        affectdecaydoor(arg0)
    EndIf
    If (T20FFXB28X8(arg0\Field29, $03) <> 0) Then
        arg0\Field44 = arg0\Field15
    EndIf
    If (((arg0\Field46 = $01) And (arg0\Field4 <> T20FFXB28X8(arg0\Field29, $00))) <> 0) Then
        If (arg0\Field4 <> 0) Then
            clearelevatorpaneltexture(arg0)
        Else
            updateelevatorpanel(arg0)
        EndIf
    EndIf
    If ((T20FFXB28X8(arg0\Field48, $02) And (arg0\Field20 = $00)) <> 0) Then
        If (0.0 < (Float animlength(arg0\Field0))) Then
            setanimtime(arg0\Field0, 1.0, $00)
            arg0\Field20 = $01
        EndIf
    ElseIf ((T20FFXB28X8(arg0\Field48, $03) And (arg0\Field49 = $00)) <> 0) Then
        arg0\Field49 = (T20FFXB28X8(arg0\Field48, $04) + $01)
        If (arg0\Field40[(arg0\Field49 - $01)] <> $00) Then
            setanimtime(arg0\Field40[(arg0\Field49 - $01)], ((((Float ((arg0\Field46 = $01) Lor (arg0\Field21 = $00))) * 20.0) * (Float (arg0\Field43 = $00))) + 1.0), $00)
        EndIf
    EndIf
    arg0\Field50 = 20.0
    Return $00
End Function
