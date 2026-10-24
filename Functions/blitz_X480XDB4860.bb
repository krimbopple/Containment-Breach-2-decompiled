Function blitz_X480XDB4860%(arg0.doors, arg1%, arg2%)
    Local local0#
    Local local1.emitter
    Local local2%
    If (((arg0\Field38 Lor (arg0\Field46 = $01)) Lor ((arg2 = $00) And ((X4BX024DX0() <> $00) And (TXB2BFFFFFX() = $00)))) <> 0) Then
        Return $00
    EndIf
    local0 = entitydistance(arg0\Field51, camera)
    If (8.0 > local0) Then
        XZ0260X8X2\Field14 = max(XZ0260X8X2\Field14, (8.0 - local0))
    EndIf
    arg0\Field13 = 180.0
    arg0\Field39 = $01
    arg0\Field54 = (Float arg1)
    arg0\Field38 = $01
    entityfx(arg0\Field0, $10)
    If (arg0\Field7 <> $00) Then
        entityfx(arg0\Field7, $10)
    EndIf
    playsoundex(snd_i\Field42, camera, arg0\Field0, 10.0, 1.0, $00, $00)
    If (arg0\Field28 = $00) Then
        local1 = setemitter(Null, entityx(arg0\Field0, $01, 1.0), entityy(arg0\Field0, $01, 1.0), entityz(arg0\Field0, $01, 1.0), $10)
        entityparent(local1\Field2, arg0\Field0, $01)
        playsoundex(snd_i\Field53, camera, arg0\Field51, 10.0, 1.0, $00, $00)
        For local2 = $00 To $01 Step $01
            If (arg0\Field40[local2] <> $00) Then
                playsoundex(snd_i\Field10, camera, arg0\Field40[local2], 10.0, 1.0, $00, $00)
                Exit
            EndIf
        Next
    EndIf
    Return $00
End Function
