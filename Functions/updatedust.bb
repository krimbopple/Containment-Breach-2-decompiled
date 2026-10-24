Function updatedust%()
    Local local0%
    dustparticlechance = (Int max((Float ((((opt\Field69 = $01) * $19) + $23) - ((0.0 < XZ0260X8X2\Field14) * $23))), 1.0))
    If (rand(dustparticlechance, $01) = $01) Then
        setemitter(Null, entityx(camera, $01, 1.0), entityy(camera, $01, 1.0), entityz(camera, $01, 1.0), $0C)
    EndIf
    Return $00
End Function
