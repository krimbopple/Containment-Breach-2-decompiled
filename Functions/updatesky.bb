Function updatesky%(arg0%, arg1%)
    positionentity(arg0, entityx(camera, $00, 1.0), entityy(camera, $00, 1.0), entityz(camera, $00, 1.0), $01)
    If (arg1 <> 0) Then
        turnentity(arg0, 0.0, (fps\Field3[$00] * 0.04), 0.0, $01)
    EndIf
    Return $00
End Function
